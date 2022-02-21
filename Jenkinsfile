def mail

pipeline {
    agent any
    
    environment {
        MAIL_TO = 'lfdiego7@gmail.com'
    }

    stages {
        stage('Install Dependencies') {
            steps {
                script {
                    sh 'ls'
                    mail = load 'ci/mail.groovy'
                    mail.send(MAIL_TO)

                    sh 'echo "Installing dependencies"'
                }
                
            }
        }

        stage('Download Config Files') {
            steps {
                script {
                    sh 'echo "Downloading config files"'
                }
            }
        }

        stage('Unit Test') {
            steps {
                script {
                    sh 'echo "Running unit tests"'
                }
            }
        }

        stage('Static Analysis Code') {
            steps {
                script {
                    sh 'echo "Running static analysis"'
                }
            }
        }

        stage('Quality Gates') {
            steps {
                script {
                    sh 'echo "Running quality gates"'
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'echo "Building"'
                }
            }
        }

        stage('Functional Test') {
            steps {
                script {
                    sh 'echo "Running functional tests"'
                }
            }
        }

        stage('Security Test') {
            steps {
                script {
                    sh 'echo "Running security tests"'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    mail = load 'ci/mail.groovy'
                    mail.send(MAIL_TO)

                    sh 'echo "Deploying"'
                }
            }
        }

        stage('Post Deploy Test') {
            steps {
                script {
                    sh 'echo "Post Deploy Test"'
                }
            }
        }

        stage('Post-deploy Security Test') {
            steps {
                script {
                    sh 'echo "Post-deploy Security Test"'
                }
            }
        }

        stage('Post-deploy No-Functional Test') {
            steps {
                script {
                    sh 'echo "Post-deploy No-Functional Test"'
                }
            }
        }
    }
}
