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

          success{
            echo "Exitoso"
                }

        failure {
            emailext body: 'Notificacion Jenkins',
            subject: 'Notificacion Jenkins,
            to: 'jerilee.molina.velasco@gmail.com'

            //echo "Argo ha fallao"
        }
    }
}