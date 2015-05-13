# CodeFrayAPI
The API for the CodeFray game.

## How to Implement
Create a class extending the `GolemController` class. Every round for every robot, the `onRound` method is called. The `Golem` instance passed to that method is regenerated every round, so there is no point in attempting to cheat by storing the object elsewhere.

## Rules
The official CodeFray implementation rules can be found [here](https://docs.google.com/document/d/1cg_IbfFtdI7_wAm_Ttkqc7ghfSiD8rrgepqDVgo0Mmk).
