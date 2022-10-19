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
            mail to: jerilee.molina.velasco@gmail.com, subject: 'El pipeline ha fallado'
        }
    }
}