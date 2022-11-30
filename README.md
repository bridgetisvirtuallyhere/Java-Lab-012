# Java-Lab-012 - Planets in Space

## Part 1 - English to Science

* In this part, we are going to learn to translate written English into the classes and objects that we'll need to build. 
* Read the Paragraph below, and write down all the **NOUNS**, then re-read the paragraph and select all the **VERBS**. 
* When done, move on to Part 2.

I want you to create a solar-system simulation where you can add planets and, of course, a sun. 
The simulation should be able to move the planets with respect to the sun's mass and size and, of course, gravity. 
The simulation should also be able to show where each planet is located at any given period. 
The Sun should be the center of the solar-system, so coordinate (0.0, 0.0). 
Each Planet should also have a coordinate position (hopefully not at 0.0, 0.0), a mass and size, and at any point 
I want to know its distance from its sun. Lastly, because this is a simulation, 
we should be able to move the planet and get and set its position and velocity.

**NOUNS**
solar-system 
Main Program: simulation
planets
sun
double-mass
double-size-radius
double-velocity
double-gravity
double-distance
location
position

**VERBS**
>create solar-system
>add planets
add sun
>move planets according to sun's mass, size and gravity
show location of planets at any time
center sun (0.0, 0.0)
coordinate position for planets
mass for planets
size for planets
>show distance from sun for planets
move planets
>get planet positions
>set planet velocity
>show position


planet p = new Planet()
sout (p);
p.toString()



**CLASS**
sun: constructor: radius(size), mass, x=double(position), y=double(position), name

planet: constructor: radius(size), mass, x=double(position),y=double(position), velocity x=double, velocity y=double, 
name, 
>toString(x,y,name), get x, set y, get velocity x, set velocity y, move(x,y), show

solar-system: array.list<planet>
sun theSun;
>public movePlanets()
>public addPlanets(planet)
>public addSun(sun)



## Part 2 - Class/Object Discussion

* From your extraction of **NOUNS** and **VERBS** from the paragraph in Part 1, let's have a class discussion to decide what classes, objects, and actions are necessary for our simulation.

## Part 3 - Implementation

* From the plan we created in Part 2, implement the classes and methods necessary for our simulation.

## Part 4 - Turn In

* Do the same thing you do every week!
