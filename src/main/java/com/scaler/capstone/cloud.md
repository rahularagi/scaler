# IP Address 
# DNS
* when you by an internet connection or you can configure this in our OS, we specify DNS IP address
* DNS --> Domain Name server (DNS is map from domain name to ip address)
# ICANN -> org that manages internet
* auction a range of I/P address
# SUB NET 
* internet within an internet
# NAT
* Network address translator
* it allows to create subnet
* private addresses within the subnet
# ISP (Internet service provider)

https://flask.palletsprojects.com/en/3.0.x/installation/#install-flask
https://flask.palletsprojects.com/en/3.0.x/quickstart/
# operating system
* https://os-book.com/


# EBS(Elastic bean stock)
* manager of your application deployment
* controls load balancing


to run jar file
java -jar name-of-jar.ja

# Database in aws
* amazon's managed infrastructure database(RDS)
* AWS RDS --> managed database system
* need to database url in application.properties
* Ideally only server should be able to connect to database
# virtual private cloud
* security group
* - Inbound rules : where can i receive traffic from at what port
* - Outbound rules : where can i send traffic to
# Health status
* Rolling deploy
* - brings one server down (remove from load balancer)
* - deploy new version on that server
* - wait for server to work fine
* - bring the server up(connect it to load balancer)
* - repeat for other server
* How will you know server is working fine : -> Health status check
* - you have to tell EBS what URL of your application it can send request to. if that URL gives 200 consider application is success.
* - by default, it sends request to /