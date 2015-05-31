# CodeFrayAPI
The API for the CodeFray game.

## How to Implement
Create a class extending the `GolemController` class. Every round for every robot, the `onRound` method is called. The `Golem` instance passed to that method can detect cheating, so assigning it to a variable in hopes of calling its methods outside of the current round will result in your automatic loss.

When you override the `getIdString` method, return a unique string that describes your controller. It should contain:
  - Your name or any string that identifies you or your team
  - A way of distinguishing between controllers you create... I suggest naming them
  - A way of distinguishing between versions of the controller

You can test your code by compiling it and packaging it into a jarfile. Starting the CodeFray game will allow you to select your controller jar. You can run it against another controller jarfile you have, or one of the several included controllers.

## Rules
The official CodeFray implementation rules can be found [here](https://docs.google.com/document/d/1cg_IbfFtdI7_wAm_Ttkqc7ghfSiD8rrgepqDVgo0Mmk).
