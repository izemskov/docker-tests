--- Run docker image with mount java project

docker build . -t automaven

docker run --rm -v c:/build/docker-tests/java-test-project:/java automaven
