def send(String to) {
    emailext body: 'Test Message',
        subject: 'Test Subject',
        to: to;
}

return this