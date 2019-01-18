# spring-boot-rest-api
Example of a REST API powered by Spring Boot and deployed at Heroku.

# Playing at Heroku
After idle for a while, Heroku falls asleep and id counter goes back to 1.
- https://infinite-waters-58424.herokuapp.com/greeting
  > {"id":n,"content":"Hello, World!"}

- https://infinite-waters-58424.herokuapp.com/greeting?name=value
  > {"id":n,"content":"Hello, value!"}

# Heroku tips
heroku create

heroku git:remote -a your_app_name_just_created

heroku buildpacks:set heroku/java

git push heroku master

heroku open

heroku logs
