# spring-samples


## 
mvn dependency:tree
mvn spring-boot:run

$ cf service config-server
...
dashboard:        https://config-server-<UUID>.<DOMAIN>/dashboard
...

# create secrect with curl or `cf config-server-add-credhub-secret` command
$ curl -i -H "Content-Type: application/json" -H "Authorization: $(cf oauth-token)" https://config-server-<UUID>.<DOMAIN>/secrets/springboot-demo/development/master/mysecret -X PUT --data '{"mysecret": "xxxxxx"}'

$ mvn package -Dmaven.test.skip && cf push 

$ curl http://springboot-demo.<DOMAIN>/secret
mysecret from config server is: xxxxxx