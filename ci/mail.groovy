def send(String to, String buildStatus) {
    def colorCode

     if (buildStatus == "Started") {
        colorCode = "#FFFF00"
    } else if (buildStatus == "Success") {
        colorCode = "#00FF00"
    } else if(buildStatus == "Aborted" || buildStatus == "Stopped" || buildStatus == "Unstable") {
        colorCode = "#949393"
    } else {
        colorCode = "#FF0000"
    }

    def rawBody = sh(script: "cat ci/build.html", returnStdout: true).trim()
    def htmlBody = rawBody
        .replace("{{JobName}}", JOB_NAME)
        .replace("{{BuildNumber}}", BUILD_NUMBER)
        .replace("{{BuildUrl}}", BUILD_URL)
        .replace("{{BuildStatus}}", status)
        .replace("{{BuildStatusColor}}", colorCode)
        .replace("{{GitCommit}}", GIT_COMMIT)
        .replace("{{GitBranch}}", GIT_BRANCH)
        .replace("{{GitUrl}}", GIT_URL)

    emailext body: htmlBody,
        subject: "$PROJECT_NAME - Build #$BUILD_NUMBER - $status!",
        to: to;
}

return this