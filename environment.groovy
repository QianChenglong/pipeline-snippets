pipeline {
    agent any

    environment {
        NAME = 'wallace'
    }

    stages {
        stage('Build') {
            environment {
                AGE = 30
            }
            steps {
                echo "${NAME} ${AGE}"
            }
        }
    }
}