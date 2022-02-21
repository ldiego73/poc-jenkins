def send(String to) {
    emailext body: 'Test Message',
        subject: "Build #$BUILD_NUMBER - $BUILD_STATUS!",
        to: to;
}

return this