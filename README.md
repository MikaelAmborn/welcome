#Welcome App
This repository contains the Welcome App coding challenge.

## Design choices
I created a base class Shape that defines the `area` and `circumference` functions that all shapes we want to work with
will have to implement. This means that we we easily can add more shapes without changing the `ShapeCalculator.areaOf`
function.
###Triangles
* I decided to only support right angled triangles since the documentation on area calculation only 
mentions right angled triangles. This also simplifies the solution quite a bit.
* I choose to represent the side lengths as Doubles since it's simple, note though that this might lead to rounding 
errors. If exact results are important the implementation could switch to use BigDecimal instead.
###Rectangles
* The side length is represented as a Double so the same concerns as for Triangles apply. 

