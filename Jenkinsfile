pipeline {
    agent {
        node {
            label 'maven'
        }
    }

    stages {
        stage('Clone Code') {
            steps {
                git 'https://github.com/Aman98roy/SimpleSpringBootApplication.git'
            }
        }
    }
}
