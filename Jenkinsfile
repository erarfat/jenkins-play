pipeline{
    tools {
        maven "Maveen 3.9.2"
    }
    stages{
        stage("Build-jar"){
            echo "Building Jar"
            sh 'mvn package'
        }
    }
}