pipeline {
    agent any

    tools {
        // Define the Gradle version
        gradle 'Gradle5'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/HarshaCommits/api-automation-kotlin.git'
            }
        }
        stage('Build') {
            steps {
                // Runs the gradle build
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                // Runs the gradle test
                sh './gradlew test'
            }
        }
        stage('Allure Report') {
            steps {
                // Generates the Allure report
                sh './gradlew allureReport'
            }
        }
    }

    post {
        always {
            // Archives the Allure report in Jenkins after every build
            allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'build/allure-results']]
            ])
            // Send email after every build
            emailext (
                subject: "Jenkins build ${currentBuild.currentResult}: ${currentBuild.fullDisplayName}",
                body: "Check the report at ${env.BUILD_URL}",
                recipientProviders: [[$class: 'DevelopersRecipientProvider']],
                attachBuildLog: true
            )
        }
    }
}
