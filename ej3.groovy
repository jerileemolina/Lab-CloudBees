pipeline {
  agent any
  stages { 
    stage('Buzz Build') {
      steps {
		sh './jenkins/build.sh'
        archiveArtifacts(artifacts: 'target/*.jar', fingerprint: true) 
        }
    }

    stage('Buzz Test') {
      steps {
        sh './jenkins/test-all.sh'
        junit '**/surefire-reports/**/*.xml' //Escriba la ruta de acceso de los archivos XML que contienen los informes de prueba en el cuadro "Resultados de la prueba". Para Apache Maven, la ruta es **/surefire-reports/**/*.xml.
       }
    }
  }
}
