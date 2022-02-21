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

    def today = new Date()
    def rawBody = sh(script: "cat ci/build.html", returnStdout: true).trim()
    def htmlBody = rawBody
        .replace("{{ProjectName}}", PROJECT_NAME)
        .replace("{{JobName}}", JOB_NAME)
        .replace("{{BuildNumber}}", BUILD_NUMBER)
        .replace("{{BuildUrl}}", BUILD_URL)
        .replace("{{BuildStatus}}", buildStatus)
        .replace("{{BuildStatusColor}}", colorCode)
        .replace("{{GitCommit}}", GIT_COMMIT)
        .replace("{{GitBranch}}", GIT_BRANCH)
        .replace("{{GitUrl}}", GIT_URL)
        .replace("{{Year}}", (today.getYear() + 1900).toString())

    emailext body: htmlBody,
        from: '1correo.envio@gmail.com',
        subject: "$PROJECT_NAME - Build #$BUILD_NUMBER - $buildStatus!",
        to: to,
        attachLog: true,
        compressLog: true;
}

def approve(String to) {
    def today = new Date()
    def rawBody = sh(script: "cat ci/approve.html", returnStdout: true).trim()
    def htmlBody = rawBody
        .replace("{{ProjectName}}", PROJECT_NAME)
        .replace("{{JobName}}", JOB_NAME)
        .replace("{{BuildNumber}}", BUILD_NUMBER)
        .replace("{{BuildUrl}}", BUILD_URL)
        .replace("{{Year}}", (today.getYear() + 1900).toString())
    
    emailext body: htmlBody,
        subject: "$PROJECT_NAME - Build #$BUILD_NUMBER - Approve!",
        to: to;
}

return this