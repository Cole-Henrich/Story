import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class story {
    public static void main (String[]args) throws InterruptedException {
        ArrayList<String>fable = new ArrayList<>(Arrays.asList(
                "Waltzing among the shimmering aspens, savoring the last warm kiss of summer,", "You come upon a dinosaur.", "The dinosaur is grazing on crabgrass.",
                "Little does he know that crabgrass is actually the hair of hibernating crabs.",
                "As he nibbles, he becomes aware of a numb feeling on his tongue.",
                "Oh no! The crabs have begun to inject toxins from their spiny hairs!",
                "He realizes this terrible truth.", "He yelps, and jumps so high that when he comes back down",
                "He passes out on his back,", "allowing the spines to sink further into his hide.",
                "Zoologists come upon him in the depths of his sleep.",
                "He feels the ground shake, and little nubs poke into his side incessantly.",
                "Then he hears some squawking.",
"The darkness seems to be spinning, and a roar...",
                "Almost like his father's roar...",
                "Big, strong, and grumbly...",
                "And very, very, enduring!",
                "But after it goes on for a few hours, he gets shocked!",
                "\"Even Dad could not roar for this long!\", he thinks.",
"At that thought, the light suddenly gets brighter.",
                "Two big rocks fall away, and he tumbles into a cave walled by fractal-ferns.",
                "The ferns are uncanny. They weave in diamonds, and... they are black!?",
                "\"It must be the lack of light in this cave\", he thinks.",
            "Then, \"No. That's absurd! Whoever heard of BLACK FERNS!!???!!?? \"",
                "\"Ah, dreams, you know!\"",
                "He suddenly remembered his talent for lucid dreaming.",
                "So he relaxed, expecting the wacky ferns to melt away with the last vestiges of sleep.",
                "But they did not flee.",
                "So he tried to banish them.",
                "His favorite method for banishing stubborn dreams was to conjure a great fear.",
                "Specifically, he feared porcupines.",
"He reflected on his porcupinophobia for a moment, in a twist of Freudian Psychoanalysis.",
"\"Maybe that dream I had earlier about the crabgrass was really a disguised version of my fear of porcupines.\"",
  "\"Yes, it must be so.\"",
                "Now, it takes great courage to summon one's worst fear.",
                "So he scrunched his belly muscles",
                "and braced for the horrifying appearance of the dreaded specter.",
                "It did not come.",
                "He flexed his tail and pushed with all his might.",
                "Still no luck!",
"\"Hmm...\" he thought. ",
                "Then he blinked his eyes as a zookeeper entered the cave.",
                "\"HOW DO I KNOW THAT IS A ZOOKEEPER?!!?\" He asked himself.",
                "and then, \"what IS a zookeeper?\"",
                "He decided it was another manifestation of porcupinophobia.",
                "The thing had many thin spikes tumbling from its head.",
                "\"Yes, most definitely a porcupine,\" he thought.",
                "Then, the jolt of realization came.",
                "\"Why am I still dreaming??????\"",
                "\"This porcupine should have dispelled the slumber!\"",
                "But he already knew why: THIS WAS NO DREAM.",
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
                "The porcupine jumped clear out of its pale skin and fled through the mouth of the cave.",
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
"Soon he passed out again from exhaustion.",
                "Waking up a few minutes later, he found his nose snorkeling in a pool of water.",
                "He gulped and gulped, until he noticed the porcupine quills floating in the water.",
                "He tried to back away but found he could not.",
                "Near hyperventilation and in clinical shock,",
                "some small corner of his mind fumbled with the ability to reason.",
                "\"Look,\" it said. \"This water was not here when you came. How do you think it got here?\"",
                "\"Uhhhhh........\"",
                "\"THE GOSH DARN ZOOKEEPER BROUGHT IT FOR YOU!!!\"",
                "\"But...but...but porkies... (that was what he called his dread nemeses)...\"",
                "\"...but porkies do not act nice like that!\"",
                "\"DID I SAY....IT WAS A PORCUPINE....\"the voice bellowed.",
                "\"Uh, uh, no!\" came the stammered response.",
                "\"GOOD CHILD! YOU DO GOT HALF A BRAIN!\"",
                "Our dino beamed at the praise.",
                "\"DON'T BE SMILIN' LIKE THAT! YOU STILL A FOOL!\" the voice boomed",
                "dino grinned even wider.",
                "\"OK FOOL, GUESS WHAT?\"screamed the voice.",
                "\"you. are. a. PPPPOOOORRRRCCCCUUUUPPPPIIIINNNNEEEE!!!!\"",
                "Time seemed as molasses and the word oozed out of the voice's mouth. Now the molasses tide of time caught up with him and sent him reeling.",
                "\"NNNNNNNNNNNNNNNNNNNNOOOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!!!!!!!\"",
                "\"yes, it's true. take a look at yourself in the water dish!\"",
                "He could hardly breathe. Some miracle granted him one breath to haul his flesh to the edge of the glinting pool.",
                "He furrowed his brow. \"Hmmm, can't see myself yet! Got to get a little closer!\" he surmised.",
                "Then he moved, and...THE THING MOVED!!!!!!!!!!!!!!!!!!!!!!!!",
                "\"NNNNNNNNNNNOOOOOOOOOOOOOOOO!!!!!!!!!!!!!! IT'S ME!!!!! I'm....a........PORKIEEEEEEEE!\"",
                "He howled and howled, his breath magically having returned for these wails.",
                "The cruel cackling voice echoed off the cave walls. \"Poor dino has a lot to learn...he does not know a butterfly from a butter dish!\""
                ));
        for (int i = 0; i < fable.size(); i++) {
            int random = (int) (Math.random() * fable.size());
            String snippet = fable.get(random);
            int sleepTime = snippet.length() * 50;
             p(snippet);
             Thread.sleep(sleepTime);
        }
    }
    public static void p(Object object_to_print) {
        System.out.println(object_to_print);
    }
}