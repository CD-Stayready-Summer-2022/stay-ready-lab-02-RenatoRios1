# Stay Ready Lab 2 Interfaces

* Part 1: Coding Challenge
* Part 2: In class
  * [A.P.I.E](./docs/APIE.md)
* Part 3: Homework

## Part 1 Coding Challenge

You have 30 mins to get as far in this challenge as possible. This is not about finishing, its about taking the correct steps to get to the end.

### Steps:

1. Comments, make sure you comment out every step you want to take, make a plan.
2. Start coding

### Problem
If you think of the basic numbers 0-20, you will notice that 13-19 contain the word "teen" in them.
The math instructor provides you with 3 numbers, you need to decided if 1 or more of them contain teen.

Return true if 1 or more of them contain teen.

Example:

containTeen(13, 20, 10) --> true

containTeen(20, 19, 10) --> true

containTeen(20, 10, 13) --> true

### Submission

Commit and push your solution to GitHub

## Part 2 - In Class

### Step 01 - It's Cookie Time

* In the package `partb.bakery.items` take a look at the `Item` interface, and the `Cookie` class. Make sure you understand what the code is doing.

* Complete the `CookieTest` class and test all of the public methods in the `Cookie` class.
* In the `Cookie` class add a method `getType()`, then create the unit test for it.
* In the class `Shop` in the `main` method write some code that creats multiple `Cookie` objects and display the objects as strings in console.

### Step 02 - Lets add more snacks

* Complete the following classes by extending the `Item` interface, and create tests:\
	* CupCake
	* Muffin
	* Cake
	* Pretzel
	* Bagel
	* Danish 

* In the class `Shop` in the `main` method write some code that creats multiple snacks and store them all in a `ArrayList<Item> items`  and display all the items in the array in console.

## Part 3 - Homework

### Coding Challenge
For this special case, were going to say that during a game of basketball a "triple" is when someone scores the same
point value 3 times in a row. Such as, scoring 2 points three times in a row.
We are keeping track of players point values in an array, but we don't want you to accept any player who has "triples".

Evaluate the given array and return true if the array does not contain any triples.

Example:
```
dontAcceptTriples([1, 1, 2, 2, 1]) --> true
dontAcceptTriples([1, 1, 2, 2, 2, 1]) --> false
dontAcceptTriples([1, 1, 1, 2, 2, 2, 1]) --> false
```

### Bike Shop

#### Step 01

Create an interface named MountainParts that has a constant named TERRAIN that will store the String value “off_road”. 

The interface will define two methods that accept a String argument name newValue and two that will return the current value of an instance field. 

The methods are to be named: 

* getSuspension
* setSuspension
* getType 
* setType

#### Step 02

Create a `RoadParts` interface that has a constant named terrain that will store the String value “track_racing”. 

The interface will define two methods that accept a String argument name newValue and two that will return the current value of an instance field. 

The methods are to be named: 

* getTireWidth
* setTireWidth
* getPostHeight
* setPostHeight

#### Step 03

Use the `BikeParts` interface with the `Bike` class adding any unimplemented methods required. Add the required internal code for each of the added method. 

In `BikeTest` unit test all public methods in `Bike`.

#### Step 04

Create the `MountainParts` interface and a `MountainBike` class adding any unimplemented methods required. Add the required internal code for each of the added methods.

Create `MountainBikeTest` class and unit test all public methods in `MountainBike`.

#### Step 05

Use the `RoadParts` interface with a `RoadBike` class you create adding any unimplemented methods required. Add the required internal code for each of the added methods.

Create `RoadBikeTest` class and unit test all public methods in `RoadBike `.






