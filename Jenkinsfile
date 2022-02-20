def mail

pipeline {
    agent any

    stages {
        stage('Install Dependencies') {
            steps {
                sh 'echo "Installing dependencies"'
            }
        }

        stage('Download Config Files') {
            steps {
                sh 'echo "Downloading config files"'
            }
        }

        stage('Unit Test') {
            steps {
                sh 'echo "Running unit tests"'
            }
        }

        stage('Static Analysis Code') {
            steps {
                sh 'echo "Running static analysis"'
            }
        }

        stage('Quality Gates') {
            steps {
                sh 'echo "Running quality gates"'
            }
        }

        stage('Build') {
            steps {
                sh 'echo "Building"'
            }
        }

        stage('Functional Test') {
            steps {
                sh 'echo "Running functional tests"'
            }
        }

        stage('Security Test') {
            steps {
                sh 'echo "Running security tests"'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo "Deploying"'
            }
        }

        stage('Post Deploy Test') {
            steps {
                sh 'echo "Post Deploy Test"'
            }
        }

        stage('Post-deploy Security Test') {
            steps {
                sh 'echo "Post-deploy Security Test"'
            }
        }

        stage('Post-deploy No-Functional Test') {
            steps {
                sh 'echo "Post-deploy No-Functional Test"'
            }
        }
    }
}
