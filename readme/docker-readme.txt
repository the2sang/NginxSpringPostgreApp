

Docker SpringBootJar build

프로젝트 소스 수정 후
maven install

./mvnw.cmd install -DskipTests  (Test 코드 제외하고 빌드)

docker build -t blog-api.docker.jar .

docker-compose up -d
