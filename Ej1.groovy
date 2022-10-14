pipeline {
    agent any
    stages { 
        stage('Buzz Buzz') {
            steps {
		echo 'Bees Buzz!'
        }
    }
        stage ('Bees bees') {
            steps {
        echo 'Buzz,Bees,Buzz!'
        echo 'Bees Buzzing'
        echo 'Probando cambios'
       }
     }
   }
}
