curl -v -H "Content-Type: application/json" -X POST -d \
'{"accountNumber":"1234567890", "merchant":"foo","product":"upc1", "amount":"110.00", "type":"ACTIVATION" , "attributes": {"productCategory": "Game", "promotionCode": "6789"}}' \
http://localhost:8080/txn


curl -v -H "Content-Type: application/json" -X POST -d \
'{"accountNumber":"987654321", "merchant":"bar","product":"upc2", "amount":"100.00", "type":"ACTIVATION",  "attributes": {"productCategory": "Food", "promotionCode": "1000"}}' \
http://localhost:8080/txn


curl -v -H "Content-Type: application/json" -X POST -d \
'{"accountNumber":"657654321", "merchant":"LocalStore","product":"upc3", "amount":"500.00", "type":"ACTIVATION",  "attributes": {"productCategory": "Food", "promotionCode": "1230"}}' \
http://localhost:8080/txn

