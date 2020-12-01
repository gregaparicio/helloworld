properties([pipelineTriggers([githubPush()])])

node{
  try{
    stage('first step'){
	sh "echo 'First step HelloWorld'"
    }
    stage('Second step'){
        sh "echo 'Second step HelloWorld'"
    }
  }
  finally{
    cleanWs()
  }
}
