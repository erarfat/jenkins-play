def BuildJar(){

    echo "Building Jar"
    sh 'mvn package'
}
def Test(){
    echo "Test Started"
    sh 'mvn test'
}
def Push(String user, String pass){
    echo "Pushing To Repo"
    sh 'docker build -t 43.205.240.167:8083/java-app-v5 .'
    sh 'docker login 43.205.240.167:8083 -u $user -p $pass'
    sh 'docker push 43.205.240.167:8083/java-app-v5'
}
return this 