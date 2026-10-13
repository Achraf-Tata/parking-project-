# parking-project

Starting point of a SOLID refactoring project: a parking garage that computes
fees, takes payments, prints a daily report and logs every receipt.
The code compiles and runs, but its design violates several SOLID principles.

    javac -d out src/parking/*.java
    java -cp out parking.Main

`docs/parking-uml.png` shows the class diagram of the current design.
Keep this version untouched in package `parking` and write your refactored
version in a new package `parking.refactored`.
