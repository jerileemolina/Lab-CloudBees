pipeline {
    agent any
    stages {
        stage('Test email notifications') {
            steps {
                sh 'make check'
            }
        }
    }
    post {
        always {
            echo 'Esto funciona'
        }
        failure {
            mail to: j.molina.velasco@accenture.com, subject: 'El pipeline ha fallado'
        }
    }
}