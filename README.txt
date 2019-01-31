Owen Collins
CS441 programming assignment 1 README.txt

Application uses random number generation and animation libraries to move a textbox around the screen while the action button "chases" it. This chasing is accomplished by offsetting the locations of the button and the text, such that the button always travels to the previous location of the textbox.

This idea originally came from the introductory discussion of Android studio that was held in class. The original idea was to have the button slowly walk towards the textbox on repeated button pushes, only for the textbox to move away when the button approached it. This was abandoned because it was difficult to maintain persistant information across multiple button pushes that would be required to slowly walk the button around. The previous position would have to be stored each cycle and reliably modified.
