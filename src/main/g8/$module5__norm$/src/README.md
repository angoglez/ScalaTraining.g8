#[Milestone 5] GymBot

## Consulting Gym classes over a Telegram Bot

The goal of this milestone is to create a tagless-final app that serves as a backend for a [Telegram Bot](https://core.telegram.org/bots).

We are provided with a Gym API that serves the list of classes available in the different gyms of the same company.
 
### How to launch/use the mock API

<details><summary>Show</summary>
<p>

#### How to launch the API

```bash
# Install json-server
npm install -g json-server

# Launch mock server
json-server db.json --routes routes.json
```

#### How to use the API

The API provides the following endpoints:

- **/gyms**
  - This enpdoint returns a JSON array containing the available gyms with their ids (used in the following endpoint).
- **/{gym_id}/classes**
  - Optional query param:
    - `date`: The date from which to obtain the classes. In format: "YYYY-MM-DD".
  - This endpoint returns a JSON array containing the different classes in the provided date. Each class is a JSON object with the following format:

    ```json
    {
      "gym_id": "8459",
      "start_date": "2019-04-22T06:00:00",
      "end_date": "2019-04-22T06:24:48",
      "duration": "00:24:48",
      "category": "Body Toning",
      "title": "David Kirsch's Body Blast",
      "liveclass": "No",
      "instructor": "David Kirsch",
      "duration_seconds": "1488",
      "description": "Train like Hollywood stars and tonify your whole body in the idyllic Vista Hermosa Park. With the explosive Plyometric Push Ups you will improve your coordination and power and with the Shadow Boxing with weight you will strengthen the musculature of your arms. With ambition and discipline, David's training will discover a new star: you."
    }
    ```

</p>
</details>

## Exercises

### Exercise 1

#### Command-line App

Create a tagless-final command-line App that allows the user to consult the available classes on a certain date in a specific gym.

The following libraries should be used:

- [`http4s (client)`](https://http4s.org/v0.20/client/)
- [`circe`](https://circe.github.io/circe/)
- [`cats-effect`](https://typelevel.org/cats-effect/)
- [`log4cats`](https://christopherdavenport.github.io/log4cats/)

> You can learn how to use `Circe` in the [scala-exercises](https://www.scala-exercises.org/circe) web page.

Bonus:

- Learn how to use and include into a project [`scalafmt`](https://scalameta.org/scalafmt/) and [`wartremover`](https://www.wartremover.org/).
- Provide configurations (such as the API uri) using [`pureconfig`](https://pureconfig.github.io)

### Exercise 2

#### Long-polling Telegram Bot

Serve the same logic as the previous exercise, this time over a [Telegram Bot](https://core.telegram.org/bots) implementing a [long-polling](https://www.wikiwand.com/en/Push_technology#/Long_polling) technique.

> To know more about Telegram Bots you can read the [official guide](https://core.telegram.org/bots).

The following libraries should be used:

- [`htt4s (client)`](https://http4s.org/v0.20/client/)
- [`f2s`](https://fs2.io/index.html)

### Exercise 3

#### Doobie & PostgreSQL

Make our bot more intelligent by storing/retrieving user choices (e.g., gym location, preferred classes...) in a PostgreSQL database using [Doobie](https://tpolecat.github.io/doobie/).

> You can learn how to use `Doobie` in the [scala-exercises](https://www.scala-exercises.org/doobie) web page.

### Exercise 4

#### Telegram Webhook & http4s server

Convert your bot from a _long-polling_ one into a _reactive_ one by creating a web server with `http4s` that will listen to the requests from your users in Telegram.

> To learn more about Telegram Bot's webhooks, you can read the [official documentation](https://core.telegram.org/bots/webhooks)

> To expose your developer server to the outside (making it available from Telegram) you can use [serveo](https://serveo.net/)
> ![](https://uploads-ssl.webflow.com/570ee6bc69f0b4976a747d2d/5aab65dbcb0fa219b47b29e7_Illustration%20(4).png)

### Exercise 5 ![](http://higherkindness.io/mu/img/sidebar_brand.png)

#### RPC Server with [Mu](http://higherkindness.io/mu)

Convert the mock api (`json-server`) to a microservice serving from a PostgreSQL db using [Mu](http://higherkindness.io/mu)

> It is also recommended to convert the project to a multi-module one 
