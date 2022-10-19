pipeline {  
 agent any
   stages {
     stage ('Primera etapa sin paralelo') {
       steps {
         echo 'Soy la primera etapa sin paralelo'
       }
     }

    stage ('Segunda etapa con paralelos dentro') {
      parallel {
        stage ('Primer paso con paralelo') {
          steps {
          echo 'Soy la primera etapa con paralelo'
            }
        }
         stage ('Segundo paso con paralelo') {
           steps {
           echo 'Soy la segunda etapa con paralelo'
           }
        }

         stage ('Tercer paso con paralelo') {
            steps {
            echo 'Soy la tercera etapa con paralelo'
            }
         }

        stage ('Tercera etapa sin paralelos') {
          steps {
          echo 'Soy la ultima etapa sin paralelos'
          }
        }

        }
    }
}

            }