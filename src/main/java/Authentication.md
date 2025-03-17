# Authentication 
 Authentication is concept using which a website will identify a user
* email and password
* mobile no and otp
 
# Authorization 
 Authentication + checking of roles. do you have necessary permission to visit particular page.
 * authentication + role/permission

# RBAC
* Role Based Access Control(Role Based authorization)

Users
id | email | password
1  | qcb   | ****

Roles
id | name
1  | Admin
2  | Mentee
3  | Mentor
4  | TA

cardinality between user and role is Many to Many

user-roles-mapping
user_id | role_id

# How authentication flow works
## Sign UP
* Name, email, password --> website will send verification email
## login
*  email, password --> validate in database email_id and password
* User
* id | email | password | isVerify(is_valid)|


Hashing + salting --> Bcrypt password encoder
.encode()
.verify()
bcrypt will always encode a value to a diff value.  bcrypt.encode() --> will very big string

Because HTTP is stateless, we need to send all details needed to fulfil a request along with request.
# Tokens
# JWT
* self validating token 
* via the information present in the within JWT, you can tell if token is valid or not
# auth 2
difference between encoding and hashing
base 64 algorithm for encoding
https://jwt.io/introduction

# O Auth
* User
* Resource server
* Application
* Authorization server


# oauth2 references
* https://docs.spring.io/spring-authorization-server/reference/getting-started.html
* https://docs.spring.io/spring-authorization-server/reference/guides/how-to-jpa.html
* https://docs.spring.io/spring-authorization-server/reference/guides/how-to-custom-claims-authorities.html
* https://bcrypt-generator.com/
* https://jwt.io/