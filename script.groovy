def BuildJar(){

    echo "Building Jar"
    sh 'mvn package'
}
def Test(){
    sh 'mvn test'
}
return this 