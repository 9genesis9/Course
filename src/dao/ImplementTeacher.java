/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Teachers;

/**
 *
 * @author revanthane
 */
public interface ImplementTeacher {
    public void insert (Teachers teacher);
    public List<Teachers> getAllData();
    public void update (Teachers teacher);
    public void delete (Teachers teacher);
    public Teachers getData(Teachers teacher);
    public List<Teachers> getSearch(String search);
    
    
}
