def call(){
  sh "docker compose down"
  
  sh "docker compose up -d"

  echo "Docker Compose Start Sucessfull"
}
