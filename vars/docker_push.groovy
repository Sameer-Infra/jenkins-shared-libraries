def call(String Project, String ImageTag, String DockerHubUser){
  withcredentials([usernamePassword(credentialsId: 'DockerHubCred', passwordVariables: 'DockerHubPass', usernameVariables: 'DockerHubUser')]) {
    sh "docker login -u ${DockerHubUser} -p ${DockerHubPass}"
  }
  sh "docker push ${DockerHubUser}/${Project}:${ImageTag}"
}
