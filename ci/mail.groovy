def send(String to, String status) {
    emailext body: 'Test Message',
        subject: "$PROJECT_NAME - Build #$BUILD_NUMBER - $status!",
        to: to;
}

return this