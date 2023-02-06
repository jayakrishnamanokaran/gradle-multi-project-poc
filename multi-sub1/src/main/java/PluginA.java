import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class PluginA implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().register("pluginA-taskA", PluginATaskA.class);
        project.getTasks().register("pluginA-taskB", PluginATaskB.class);
    }
}
