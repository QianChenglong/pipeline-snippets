// https://stackoverflow.com/questions/40224272/using-a-jenkins-pipeline-to-checkout-multiple-git-repos-into-same-job
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                dir ('toolbox') {
                    git url: 'https://github.com/QianChenglong/toolbox.git'
                }
                sh 'ls -al'
            }
        }
    }
}