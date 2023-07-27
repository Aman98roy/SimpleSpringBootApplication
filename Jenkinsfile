pipeline {
    agent {
        node {
            label 'maven'
        }
    }

environment {
    PATH = "/opt/apache-maven-3.9.3/bin:$PATH"
    
}
    stages {
        stage("build"){
            steps {
                 echo "----------- build started ----------"
                sh 'mvn clean package -Dmaven.test.skip=true'
                 echo "----------- build complted ----------"
            }
        }
}
}
