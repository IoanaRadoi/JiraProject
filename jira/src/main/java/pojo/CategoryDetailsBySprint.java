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
public class CategoryDetailsBySprint {
    
    private String idCategory;
    private String totalStoryPoints;

    public CategoryDetailsBySprint() {
    }

    public CategoryDetailsBySprint(String idCategory, String totalStoryPoints) {
        this.idCategory = idCategory;
        this.totalStoryPoints = totalStoryPoints;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

  

    public String getTotalStoryPoints() {
        return totalStoryPoints;
    }

    public void setTotalStoryPoints(String totalStoryPoints) {
        this.totalStoryPoints = totalStoryPoints;
    }
    
    
    
    
    
}
