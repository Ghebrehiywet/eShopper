pipeline {
  agent any
  tools{
    mvn "Maven_3_6_3"
  }
  stages {
    stage('clean') {
      steps {
        //build(job: 'Build', propagate: true, wait: true, quietPeriod: 10)
        sh "mvn clean"
      }
    }
    
    stage('Build') {
      steps {
        //build(job: 'Build', propagate: true, wait: true, quietPeriod: 10)
        sh "mvn build"
      }
    }
    
    stage('clean') {
      steps {
        //build(job: 'Build', propagate: true, wait: true, quietPeriod: 10)
        sh "mvn deploy"
      }
    }

  }
}
