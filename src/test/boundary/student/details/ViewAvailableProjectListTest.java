package test.boundary.student.details;

import main.boundary.project.ViewAvailableProjectList;
import main.controller.project.ProjectManager;
import main.repository.project.ProjectRepository;
import main.utils.exception.repository.ModelAlreadyExistsException;

public class ViewAvailableProjectListTest {
    public static void main(String[] args) throws ModelAlreadyExistsException {
        ProjectRepository.getInstance().clear();
        ProjectManager.createProject("1", "Haha", "Haha");
        ViewAvailableProjectList.viewAvailableProjectList();
    }
}