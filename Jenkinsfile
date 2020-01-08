pipeline {
    agent any

    stages {
        stage('Init') {
            steps {
                echo 'Initializing..'
                withMaven() {
					sh 'mvn install'
				}
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                withMaven() {
//                 	sh 'mvn build'
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