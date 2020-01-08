pipeline {
    agent any

    stages {
        stage('Init') {
            steps {
                echo 'Initializing..'
                withMaven() {
					sh 'cd Dolphin'
					sh 'mvn install'
				}
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                withMaven() {
                	sh 'cd Dolphin'
                	sh 'mvn build'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                withMaven() {
                	sh 'cd Dolphin'
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