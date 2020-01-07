pipeline {
    agent any

    stages {
        stage('Init') {
            steps {
                echo 'Initializing..'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                withMaven() {
                    sh 'mvn compile'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                withMaven() {
                    sh 'mvn test'
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}