import org.apache.airavata.sga.commons.model.TaskContext;
import org.apache.airavata.sga.messaging.service.core.Publisher;
import org.apache.airavata.sga.messaging.service.util.MessageContext;
import util.TestUtils;

/**
 * Created by Ajinkya on 2/24/17.
 */
public class SchedulerTest {

    public void testScheduler() {
        try {
            TaskContext taskContext = TestUtils.getTaskContext();
            Publisher publisher = TestUtils.getSchedulerMessagePublisher();

            // publish message
            MessageContext messageContext = new MessageContext(taskContext,
                    taskContext.getExperiment().getExperimentId());
            publisher.publish(messageContext);

            TestUtils.getOrchestratorResponseSubscriber();
            //System.exit(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SchedulerTest test = new SchedulerTest();
        test.testScheduler();
    }
}
