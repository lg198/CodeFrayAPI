# CodeFrayAPI
The API for the CodeFray game.

## How to Implement
Create a class extending the `GolemController` class. Every round for every robot, the `onRound` method is called. The `Golem` instance passed to that method can detect cheating, so assigning it to a variable in hopes of calling its methods outside of the `onRound` method will result in your loss.

## Rules
The official CodeFray implementation rules can be found [here](https://docs.google.com/document/d/1cg_IbfFtdI7_wAm_Ttkqc7ghfSiD8rrgepqDVgo0Mmk).
