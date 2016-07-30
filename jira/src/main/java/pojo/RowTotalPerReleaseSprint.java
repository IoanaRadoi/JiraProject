/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;


/**
 *
 * @author Administrator
 */
public class RowTotalPerReleaseSprint {
    
     private Long idProjectReleaseSprint;
    
    private String releaseYear;
    private String releaseName;
    private String projectName;
    
    private String totalPerReleaseSprint;
    
    private String idSprint;
    private String idSprintReleaseProject;
    
    private String sprintCapacity;
    public RowTotalPerReleaseSprint() {
    }

    public RowTotalPerReleaseSprint(Long idProjectReleaseSprint, String releaseYear, String releaseName, String projectName, String totalPerReleaseSprint, String idSprint, String idSprintReleaseProject, String sprintCapacity) {
        this.idProjectReleaseSprint = idProjectReleaseSprint;
        this.releaseYear = releaseYear;
        this.releaseName = releaseName;
        this.projectName = projectName;
        this.totalPerReleaseSprint = totalPerReleaseSprint;
        this.idSprint = idSprint;
        this.idSprintReleaseProject = idSprintReleaseProject;
        this.sprintCapacity = sprintCapacity;
    }

    

   

   

    public Long getIdProjectRelease() {
        return idProjectReleaseSprint;
    }

    public void setIdProjectRelease(Long idProjectReleaseSprint) {
        this.idProjectReleaseSprint = idProjectReleaseSprint;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTotalPerReleaseSprint() {
        return totalPerReleaseSprint;
    }

    public void setTotalPerReleaseSprint(String totalPerReleaseSprint) {
        this.totalPerReleaseSprint = totalPerReleaseSprint;
    }

    public String getIdSprint() {
        return idSprint;
    }

    public void setIdSprint(String idSprint) {
        this.idSprint = idSprint;
    }

    public String getIdSprintReleaseProject() {
        return idSprintReleaseProject;
    }

    public void setIdSprintReleaseProject(String idSprintReleaseProject) {
        this.idSprintReleaseProject = idSprintReleaseProject;
    }

    public String getSprintCapacity() {
        return sprintCapacity;
    }

    public void setSprintCapacity(String sprintCapacity) {
        this.sprintCapacity = sprintCapacity;
    }

    

    
    
    
    
    
}
