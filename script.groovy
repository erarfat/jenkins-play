def build() {
    echo "This Build Taken From Groovy Script"
}

def test() {
    if (params.Check){
        echo "Groovy Script load all parameters which is there in pipeline "
    }
    echo "Groovy Script load all parameters which is there in pipeline "
    echo "Test version --- ${params.Version}"
}

return this 