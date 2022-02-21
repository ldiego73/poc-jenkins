def send(String to, String status) {
    def body = sh(script: "cat ci/build.html", returnStdout: true).trim()
    
    echo "${body}"

    emailext body: "BUILD_NUMBER: $BUILD_NUMBER - BUILD_URL: $BUILD_URL - JOB_NAME: $JOB_NAME - GIT_COMMIT: $GIT_COMMIT - GIT_URL: $GIT_URL - GIT_BRANCH: $GIT_BRANCH",
        subject: "$PROJECT_NAME - Build #$BUILD_NUMBER - $status!",
        to: to;
}

return this