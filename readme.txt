1. ssh to the instance, password is generated during the start up time
ssh -p 2000 user@localhost
2. scripts/populate.sh to populate some records using http post
3. http://localhost:8080/txn to display records
4. property encryption
	java -cp ~/.m2/repository/org/jasypt/jasypt/1.9.2/jasypt-1.9.2.jar 
	org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="password" 
	password=supersecretz algorithm=PBEWithMD5AndDES
 
 add this during the start up of jvm
 -Djasypt.encryptor.password=supersecretz