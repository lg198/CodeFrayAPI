# CodeFrayAPI
The API for the CodeFray game.

## How to Implement
Create a class extending the `GolemController` class. Every round for every robot, the `onRound` method is called. The `Golem` instance passed to that method can detect cheating, so assigning it to a variable in hopes of calling its methods outside of the current round will result in your automatic loss.

Annotate that class with the `ControllerDef` annotation. It contains the following attributes:

  - **id**: A unique identifier for your controller.
  - **name**: The name of your controller.
  - **version**: The version of your controller.
  - **devId**: Your CodeFray developer key.

You can test your code by compiling it and packaging it into a jarfile. Starting the CodeFray game will allow you to select your controller jar. You can run it against another controller jarfile you have, or one of the several included controllers.

## Rules
The official CodeFray implementation rules can be found [here](https://github.com/lg198/CodeFray/wiki/Rules).
