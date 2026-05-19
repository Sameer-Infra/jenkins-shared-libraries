def call(String url, String branch){
  echo "Cloning repo"
  git branch: "${branch}", url: "${url}"
  echo "Code Cloning SuccessFully"
}
