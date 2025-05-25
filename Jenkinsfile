pipeline {
    agent any

    environment {
        DATABASE_URL = credentials('DATABASE_URL')     // Use Jenkins Credentials
        PGUSER = credentials('PGUSER')
        PGPASSWORD = credentials('PGPASSWORD')
        FRONTEND_ORIGIN = credentials('FRONTEND_ORIGIN')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/aura-dev-business/AuraDev-BackEnd.git'
            }
        }

        stage('Build') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Kill Previous') {
            steps {
                sh 'fuser -k 8080/tcp || true'
            }
        }

        stage('Deploy') {
            steps {
                sh 'nohup java -jar target/*.jar > app.log 2>&1 &'
            }
        }
    }
}
