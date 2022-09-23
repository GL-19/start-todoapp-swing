package TodoApp;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;

public class Main {

    public static void main(String[] args) {
        Connection conn = ConnectionFactory.getConnection();
        System.out.println(conn);

        ProjectController projectController = new ProjectController();

        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("description");
        project.setUpdatedAt(new Date());
        projectController.save(project);

        Project project2 = new Project();
        project2.setName("Projeto teste 2");
        project2.setDescription("description 2");
        project2.setUpdatedAt(new Date());
        projectController.save(project2);

        Project project3 = new Project();
        project3.setName("Projeto teste 3");
        project3.setDescription("description 3");
        project3.setUpdatedAt(new Date());
        projectController.save(project3);

        project.setId(13);
        project.setName("Projeto teste atualizado");
        projectController.update(project);

        projectController.removeById(14);

        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());

        for (Project currentProject : projects) {
            System.out.println(currentProject);
        }
        
        TaskController taskController = new TaskController();

        Task task = new Task();
        task.setIdProject(13);
        task.setName("Task teste");
        task.setDescription("description");
        task.setNotes("notes");
        task.setDeadline(new Date());
        taskController.save(task);
        
        Task task2 = new Task();
        task2.setIdProject(13);
        task2.setName("Task teste 2");
        task2.setDescription("description 2");
        task2.setNotes("notes 2");
        task2.setDeadline(new Date());
        taskController.save(task2);
        
        Task task3 = new Task();
        task3.setIdProject(15);
        task3.setName("Task teste 3");
        task3.setDescription("description 3");
        task3.setNotes("notes 3");
        task3.setDeadline(new Date());
        taskController.save(task3);

        task.setName("Task teste atualizado");
        task.setId(1);
        taskController.update(task);

        List<Task> tasks = taskController.getAll(13);
        System.out.println("Total de tasks do projeto 13 = " + tasks.size());

        for (Task currentTask : tasks) {
            System.out.println(currentTask);
        }
        
        taskController.removeById(4);
    }
}
