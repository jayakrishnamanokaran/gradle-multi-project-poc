import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class PluginB implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().register("pluginB-taskA", PluginBTaskA.class);
    }
}
