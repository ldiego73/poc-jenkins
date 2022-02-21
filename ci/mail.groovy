def send(String to) {
    emailext body: 'Test Message',
        subject: "$PROJECT_NAME - Build #$BUILD_NUMBER - $BUILD_STATUS!",
        to: to;
}

return this