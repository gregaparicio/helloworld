node{
  try{
    stage('first step'){
	sh "echo 'First step HelloWorld'"
    }
  }
  finally{
    cleanWs()
  }
}
