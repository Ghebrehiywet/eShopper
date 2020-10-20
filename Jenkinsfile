pipeline {
  agent any
  tools{
    mvn "Maven_3_6_3"
  }
  stages {
    stage('CLEAN') {
      steps {
        //build(job: 'Build', propagate: true, wait: true, quietPeriod: 10)
        echo "--------------  CLEAN ------------------------"
        sh "mvn clean"
      }
    }
    
    stage('BUILD') {
      steps {
        //build(job: 'Build', propagate: true, wait: true, quietPeriod: 10)
        echo "--------------  BUILD ------------------------"
        sh "mvn build"
      }
    }
    
    stage('DEPLOY') {
      steps {
        //build(job: 'Build', propagate: true, wait: true, quietPeriod: 10)
        echo "--------------  DEPLOY ------------------------"
        sh "mvn deploy"
      }
    }

  }
}
