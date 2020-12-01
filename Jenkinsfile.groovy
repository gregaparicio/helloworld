properties([pipelineTriggers([githubPush()])])

node{
  try{
    stage('first step'){
	sh "echo 'First step HelloWorld'"
    }
    stage('Second step'){
        sh "echo 'Second step HelloWorld'"
    }
    stage('Third step1'){
        sh "echo 'Third step HelloWorld'"
    }
  }
  finally{
    cleanWs()
  }
}
