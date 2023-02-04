import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class Practice05Test {

    Practice04 mockRepo= mock(Practice04.class);
    Practice05 service =new Practice05(mockRepo);

    @Test
    public void testAddDeveloper(){
        service.addDeveloper("Donatello");
        verify(mockRepo).add("Donatello");
        //verify(mockRepo,times(1)).add("Donatello");

    }
    @Test
    public void testRemoveDeveloper(){
        when(mockRepo.findByName("Raphael")).thenReturn("Raphael");
        service.addDeveloper("Raphael");
        service.removeDeveloper("Raphael");
        verify(mockRepo).findByName("Raphael");
        verify(mockRepo).remove("Raphael");
        //InOrder:ödev
    }

    @Test
    public void testRemoveAllDeveloper(){
        service.addDeveloper("Raphael");
        service.removeAllDeveloper();
        verify(mockRepo).removeAll();
    }
}
