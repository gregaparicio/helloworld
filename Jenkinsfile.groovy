properties([pipelineTriggers([githubPush()])])

node{
  try{
    branch=env.BRANCH_NAME
    build=env.BUILD_NAME

    print branch
    print build

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
