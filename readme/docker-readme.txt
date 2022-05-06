

github에서 가져온 후 pgadmin 밑에 파일이 있다면 삭제..

Docker SpringBootJar build

프로젝트 소스 수정 후
maven install

./mvnw.cmd install -DskipTests  (Test 코드 제외하고 빌드)

docker build -t shopping-mall-webapp.jar .

docker-compose up -d
