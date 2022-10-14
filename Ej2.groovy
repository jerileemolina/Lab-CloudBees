pipeline {
    agent any
    stages { 
        stage('Buzz Buzz') {
            steps {
		echo 'Bees Buzz!'
        echo 'Prueba mergeateee'
        }
    }
        stage('Bees bees') {
            steps {
        echo 'Buzz,Bees,Buzz!'
        echo 'Bees Buzzing'
       }
        stage('Fluffy Build') {
            steps {
		echo 'Placeholder'
        sh 'echo Edited Placeholder'
        }
         stage('Fluffy Test') {
            steps {
		sh 'sleep 5'
        echo 'Success'
        }
         stage('Fluffy Deploy Stage') {
            steps {
		echo 'Placeholder'
        echo 'Etapa final'
        }
     }
   }
}