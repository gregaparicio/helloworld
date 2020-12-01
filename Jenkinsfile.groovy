properties([pipelineTriggers([githubPush()])])

node{
  try{
    branchName=env.BRANCH_NAME
    buildNum=env.BUILD_NUMBER

    print "branchName : " + branchName
    print "buildNum : " + buildNum

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
