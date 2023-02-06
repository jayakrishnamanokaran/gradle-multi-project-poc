import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class PluginBTaskA extends DefaultTask {

    @TaskAction
    public void task() {
        System.out.println("Hello from Plugin B Task A");
    }
}
