def BuildJar(){

    echo "Building Jar"
    sh 'mvn package'
}
def Test(){
    echo "Test Started"
    sh 'mvn test'
}
return this 