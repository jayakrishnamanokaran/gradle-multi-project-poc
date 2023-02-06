import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class PluginATaskA extends DefaultTask {

    @TaskAction
    public void taskA() {
        System.out.println("Hello from Plugin A Task A");
    }

}
