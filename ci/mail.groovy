def send(String to, String status) {
    emailext body: "BUILD_ID: $BUILD_ID - BUILD_NUMBER: $BUILD_NUMBER - BUILD_TAG: $BUILD_TAG - BUILD_URL: $BUILD_URL - JENKINS_URL: $JENKINS_URL - JOB_NAME: $JOB_NAME - GIT_COMMIT: $GIT_COMMIT - GIT_URL: $GIT_URL - GIT_BRANCH: $GIT_BRANCH",
        subject: "$PROJECT_NAME - Build #$BUILD_NUMBER - $status!",
        to: to;
}

return this