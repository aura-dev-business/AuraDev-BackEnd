pipeline {
  agent any

  tools {
    jdk 'JDK17'
    maven 'Maven3'
  }

  stages {
    stage('Clone') {
      steps {
        git branch: 'latest/deploy', url: 'https://github.com/aura-dev-business/AuraDev-BackEnd.git'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean package -DskipTests'
      }
    }

    stage('Run') {
      steps {
        sh 'nohup java -jar target/*.jar > log.txt 2>&1 &'
      }
    }
  }
}
