import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class PluginATaskB extends DefaultTask {

    @TaskAction
    public void taskB() {
        System.out.println("Hello from Plugin A Task B");
    }
}
