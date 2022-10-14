pipeline {
    agent {
        any {
            podTemplate(containers: [
                containerTemplate(name: 'maven', image: 'maven:3.8.1-jdk-8', command: 'cat', args: '--network ci --mount type=volume,source=ci-maven-home,target=/root/.m2'),
                containerTemplate(name: 'Eclipse', image: 'eclipse-temurin:17.0.3_7-jdk')
])           
        }

    } 
    stages {
        stage('Run maven') {
            steps {
                container('maven') {
                    //sh 'mvn --version'
                    echo 'hola mortadelo'
                    echo 'adios filemon'

                }
            }
        }
    }
}
