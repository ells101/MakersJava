package todo;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class TodoTest {
    @Test 
    public void todoStartsEmpty() {
        Todo todo = new Todo();
        assertTrue("todo should initialise with an empty list of tasks", todo.tasks.isEmpty());
    }

    @Test
    public void todoAddTask() {
        Todo todo = new Todo();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("exercise");

        assertEquals("todo shows a new entry is added", expectedList, todo.addTask("exercise"));

    }
    @Test
    public void todoGetTask(){
        Todo todo = new Todo();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("exercise");
        expectedList.add("dry laundry");

        todo.addTask("exercise");
        todo.addTask("dry laundry");

        assertEquals("Should return the todo list", expectedList, todo.getTasks());
    }
}

// I just want to preface the blog with the admittance that I've found advice for mental health can be overly prescriptive and I will inevtiably
// do just that in my blog. Having said this though: if something resonates with you, you'll probably take it on board. 
// Don't take anything I say as hard and fast notions
// but if anything I say does seem to stick and you connect with it then perhaps I've done my job! I can say for certain that the biggest
// improvement to my mental health has been seeing a therapist. In particular, I went to see a counsellor, who specilaises in talking therapy.
// I chose to eschew CBT, as in my depressed and unmotivated state I simply couldn't do any of the homework anchored with CBT.
// For me the decision to go to therapy started with unscrupulous honesty towards how I was feeling and reaching out for help from friends
// and - eventually - my mum and dad. Even then, it took me 3 or 4 months to pick up the phone to a clinic. It's a long journey and 
// I still have dips where I will play video games all day and shut myself in my room.
// It's very hard - at least for me - to achieve consistency but practicing self-love so that you can form and maintain good habits seems to 
// be the key in myself. Find those little personal things that work for you. e.g. I need to go to sleep without distractions, I 
// try to keep my laptop away from the bed and no screens an hour before bed time. If I sleep well, I'm in a state to be motivated
// (90% of the time). If I had it my way, I would only have a desktop and do away with blasted laptops.