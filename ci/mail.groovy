def send(String to) {
    emailext body: 'Test Message',
        subject: "$PROJECT_NAME - Build #$env.BUILD_NUMBER - $env.BUILD_STATUS!",
        to: to;
}

return this