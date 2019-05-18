# Si-Stebbins-Stack-Kotlin
A command line driven example of the Si Stebbins Stack in Kotlin.

# What is this?
This is a Kotlin implementation of the Si Stebbins Stack, written to follow the exact same procedure that Michael Stevens (AKA VSauce) demonstrated. Michael Stevens' demonstration can be seen on the [D!ng](https://www.youtube.com/channel/UClq42foiSgl7sSpLupnugGA) Youtube channel: [Video](https://youtu.be/aqKkwTKWWUQ). I highly recommend watching this video first. This Kotlin implementation will make a lot more sense.

For more information on the Si Stebbins Stack see: https://en.wikipedia.org/wiki/Si_Stebbins_stack

# How to Run
After cloning this project, drop into a terminal/command line window. You can run this program with the following command:

```
java -jar sistebbins-1.0-SNAPSHOT-all.jar --draw-count=5
```

The number you supply for `--draw-count` must be between 0 and 52. You can omit this parameter, which will simply cause a random draw count to be selected.

# How to Build

To build the jar, simply run:

```
./gradlew shadowJar
```

The jar will be placed in `build/libs`.

# How to Run the Tests

To execute the unit tests, simply run:

```
./gradlew clean test
```

# Example Output

```
==== Si Stebbins Stack ====

=================================
-> 10 is the draw count.
================================

=================================
-> Shuffling the deck...
Deck of Cards: [10H↓, 10S↓, 2D↓, KS↓, 8S↓, 5H↓, 4D↓, QC↓, 3S↓, 2S↓, JD↓, 7D↓, QS↓, 3C↓, 9H↓, QH↓, 7H↓, AS↓, 4C↓, 3H↓, 8H↓, 10C↓, KC↓, 6C↓, 6H↓, 9C↓, JS↓, 5D↓, 7S↓, 8C↓, KH↓, 4H↓, JH↓, 7C↓, 5S↓, 10D↓, 5C↓, 6S↓, 9D↓, 3D↓, AC↓, AD↓, 8D↓, 2C↓, KD↓, AH↓, 9S↓, 2H↓, QD↓, 4S↓, JC↓, 6D↓]
================================

=================================
-> Drawing 10 card(s)...
Drawn Cards: [10H↓, 10S↓, 2D↓, KS↓, 8S↓, 5H↓, 4D↓, QC↓, 3S↓, 2S↓]

Deck of Cards: [JD↓, 7D↓, QS↓, 3C↓, 9H↓, QH↓, 7H↓, AS↓, 4C↓, 3H↓, 8H↓, 10C↓, KC↓, 6C↓, 6H↓, 9C↓, JS↓, 5D↓, 7S↓, 8C↓, KH↓, 4H↓, JH↓, 7C↓, 5S↓, 10D↓, 5C↓, 6S↓, 9D↓, 3D↓, AC↓, AD↓, 8D↓, 2C↓, KD↓, AH↓, 9S↓, 2H↓, QD↓, 4S↓, JC↓, 6D↓]
================================

=================================
-> Flipping the 10 card(s) drawn...
Drawn Cards Flipped: [10H↑, 10S↑, 2D↑, KS↑, 8S↑, 5H↑, 4D↑, QC↑, 3S↑, 2S↑]

Deck of Cards: [JD↓, 7D↓, QS↓, 3C↓, 9H↓, QH↓, 7H↓, AS↓, 4C↓, 3H↓, 8H↓, 10C↓, KC↓, 6C↓, 6H↓, 9C↓, JS↓, 5D↓, 7S↓, 8C↓, KH↓, 4H↓, JH↓, 7C↓, 5S↓, 10D↓, 5C↓, 6S↓, 9D↓, 3D↓, AC↓, AD↓, 8D↓, 2C↓, KD↓, AH↓, 9S↓, 2H↓, QD↓, 4S↓, JC↓, 6D↓]
================================

=================================
-> Recombining drawn cards with the deck...
Deck of Cards: [JD↓, 7D↓, QS↓, 3C↓, 9H↓, QH↓, 7H↓, AS↓, 4C↓, 3H↓, 8H↓, 10C↓, KC↓, 6C↓, 6H↓, 9C↓, JS↓, 5D↓, 7S↓, 8C↓, KH↓, 4H↓, JH↓, 7C↓, 5S↓, 10D↓, 5C↓, 6S↓, 9D↓, 3D↓, AC↓, AD↓, 8D↓, 2C↓, KD↓, AH↓, 9S↓, 2H↓, QD↓, 4S↓, JC↓, 6D↓, 10H↑, 10S↑, 2D↑, KS↑, 8S↑, 5H↑, 4D↑, QC↑, 3S↑, 2S↑]
================================

=================================
-> Shuffling the deck again...
Deck of Cards: [5C↓, 2S↑, 8C↓, AC↓, 6S↓, 8D↓, 7S↓, 7D↓, 5S↓, 3S↑, 10S↑, 8H↓, 5D↓, 8S↑, JS↓, 3D↓, QC↑, 3C↓, AS↓, 10D↓, AD↓, 7C↓, AH↓, 4C↓, 4S↓, 10H↑, 2H↓, QD↓, 4H↓, QH↓, 3H↓, 6D↓, KH↓, 9C↓, KS↑, 2D↑, 5H↑, JH↓, 6H↓, JD↓, 9D↓, 7H↓, JC↓, QS↓, KC↓, 10C↓, 9S↓, 9H↓, 4D↑, 2C↓, KD↓, 6C↓]
================================

=================================
-> Drawing 10 card(s) again...
Drawn Cards: [5C↓, 2S↑, 8C↓, AC↓, 6S↓, 8D↓, 7S↓, 7D↓, 5S↓, 3S↑]

Deck of Cards: [10S↑, 8H↓, 5D↓, 8S↑, JS↓, 3D↓, QC↑, 3C↓, AS↓, 10D↓, AD↓, 7C↓, AH↓, 4C↓, 4S↓, 10H↑, 2H↓, QD↓, 4H↓, QH↓, 3H↓, 6D↓, KH↓, 9C↓, KS↑, 2D↑, 5H↑, JH↓, 6H↓, JD↓, 9D↓, 7H↓, JC↓, QS↓, KC↓, 10C↓, 9S↓, 9H↓, 4D↑, 2C↓, KD↓, 6C↓]
================================

=================================
-> Flipping each drawn card...
Drawn Cards Flipped: [5C↑, 2S↓, 8C↑, AC↑, 6S↑, 8D↑, 7S↑, 7D↑, 5S↑, 3S↓]

Deck of Cards: [10S↑, 8H↓, 5D↓, 8S↑, JS↓, 3D↓, QC↑, 3C↓, AS↓, 10D↓, AD↓, 7C↓, AH↓, 4C↓, 4S↓, 10H↑, 2H↓, QD↓, 4H↓, QH↓, 3H↓, 6D↓, KH↓, 9C↓, KS↑, 2D↑, 5H↑, JH↓, 6H↓, JD↓, 9D↓, 7H↓, JC↓, QS↓, KC↓, 10C↓, 9S↓, 9H↓, 4D↑, 2C↓, KD↓, 6C↓]
================================

*********************************
*********************************
Summary:

We drew 10 card(s) from a shuffled deck. We flipped each of the drawn cards over, and then returned
them to the deck. We then shuffled the deck again. We then drew 10 card(s) again, and flipped each
of those over.

This left us with two piles of cards. And no matter what, because of the Si Stebbins effect, both piles
will always have the same number of cards facing up!

== Pile A ==
    Up Card Count: 8
    Up Cards: [5C↑, 8C↑, AC↑, 6S↑, 8D↑, 7S↑, 7D↑, 5S↑]
    All Cards: [5C↑, 2S↓, 8C↑, AC↑, 6S↑, 8D↑, 7S↑, 7D↑, 5S↑, 3S↓]

== Pile B ==
    Up Card Count: 8
    Up Cards: [10S↑, 8S↑, QC↑, 10H↑, KS↑, 2D↑, 5H↑, 4D↑]
    All Cards: [10S↑, 8H↓, 5D↓, 8S↑, JS↓, 3D↓, QC↑, 3C↓, AS↓, 10D↓, AD↓, 7C↓, AH↓, 4C↓, 4S↓, 10H↑, 2H↓, QD↓, 4H↓, QH↓, 3H↓, 6D↓, KH↓, 9C↓, KS↑, 2D↑, 5H↑, JH↓, 6H↓, JD↓, 9D↓, 7H↓, JC↓, QS↓, KC↓, 10C↓, 9S↓, 9H↓, 4D↑, 2C↓, KD↓, 6C↓]

*********************************
*********************************

```
