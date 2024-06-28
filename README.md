# Magical-Arena
A game of Magical Arena is a two player game with Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0.

## How to Run in Eclipse

### Prerequisites
- Eclipse IDE installed
- JUnit 5 library (if running tests)

### Steps to Compile and Run the Game

1. **Create a New Java Project**:
    - `File > New > Java Project`
    - Name your project (e.g., `MagicalArena`)
    - Click `Finish`

2. **Create a New Package**:
    - Right-click on `src` folder > `New > Package`
    - Name the package (e.g., `arena`)
    - Click `Finish`

3. **Create Java Classes**:
    - Right-click on the package (`arena`) > `New > Class`
    - Name the class `Player` and click `Finish`
    - Repeat the process to create the `Game` class

4. **Add Code to the Classes**:
    - Copy and paste the code for `Player` and `Game` classes into their respective files

5. **Run the Game**:
    - Right-click on `Game.java` > `Run As > Java Application`

### Steps to Add and Run Tests

1. **Create a New Package**:
    - Right-click on the package (`arena`) > `New > Package`
    - Name the package `tests` and click `Finish`

2. **Create Test Classes**:
    - Right-click on the `tests` package > `New > Class`
    - Name the class `PlayerTest` and click `Finish`
    - Repeat the process to create the `GameTest` class

3. **Add JUnit Library to the Project**:
    - Right-click on your project > `Build Path > Add Libraries`
    - Select `JUnit` and click `Next`
    - Choose `JUnit 5` and click `Finish`

4. **Add Test Code**:
    - Copy and paste the test code for `PlayerTest` and `GameTest` classes into their respective files

5. **Run the Tests**:
    - Right-click on `PlayerTest.java` or `GameTest.java` > `Run As > JUnit Test`

## Game Rules
- Players take turns attacking and defending.
- Attacking damage is calculated as `attack * attack dice roll`.
- Defending damage is calculated as `strength * defend dice roll`.
- Damage dealt reduces the defender's health.
- The game ends when a player's health reaches zero.
- The player with lower health attacks first at the start of a match.

## Example Gameplay

- **Player A**: 50 health, 5 strength, 10 attack
- **Player B**: 100 health, 10 strength, 5 attack

1. Player A attacks and rolls a die. Die roll: 5
2. Player B defends and rolls a die. Die roll: 2
    - Attack damage: `5 * 10 = 50`
