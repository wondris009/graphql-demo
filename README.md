# Example project for trying graphQL with mongoDB

### Requirements

* Install mongoDB and run it

### Notes

* [Original here](https://auth0.com/blog/building-graphql-apis-with-kotlin-spring-boot-and-mongodb/)
* No spring security implemented
* Run on default port 8080
* Using [http://localhost:8080/graphiql](http://localhost:8080/graphiql) you can send example queries to your app

### Examples 
#### Get me all snacks
<pre>
query {
  snacks {
    id
    name
    amount
    reviews {
      text
      rating
    }
  }
}
</pre>

#### Create new snack
<pre>
mutation {
  newSnack(name: "Test snack", amount: 300) {
    id
    name
    amount
  }
}
</pre>

