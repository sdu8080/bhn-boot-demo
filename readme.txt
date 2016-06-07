1. Custom banner file is located under src/main/resources

2. enabled the ssh to the remote commandline service, to connect 
	ssh -p 2000 user@localhost
	password is displayed in the start up console
	custom command example is under commands/*.groovy

3. to test restful service, create transaction record, use script/populate.sh

4. use http://localhost:8080/txn to display records

5. property encryption, 
	to generate the encrypted password, use command
	java -cp ~/.m2/repository/org/jasypt/jasypt/1.9.2/jasypt-1.9.2.jar 
	org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="password" 
	password=supersecretz algorithm=PBEWithMD5AndDES
 
 	add following line during the start up of jvm, to allow Jasypt to know which master password to use.
 	-Djasypt.encryptor.password=supersecretz
 	
 http://localhost:8080/bhn-boot-demo/health
7. http://localhost:8080/console to open h2 DB, url= jdbc:h2:mem:AZ;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
	sa/password to login
	
8. use external Tomcat for deployment

9. test