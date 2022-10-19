pipeline {
    agent any
    stages {
        stage('Test email notifications') {
            steps {
                echo 'Hola'
            }
        }
    }
    post {
        always {
            echo 'Esto funciona'
        }
        failure {
            mail to: 'jerilee.molina.velasco@gmail.com', subject: 'El pipeline ha fallado'
        }
    }
}