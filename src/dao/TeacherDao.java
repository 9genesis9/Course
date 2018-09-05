/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.ConnectionDatabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teachers;

/**
 *
 * @author revanthane
 */
public class TeacherDao implements ImplementTeacher{

    @Override
    public void insert(Teachers teacher) {
        try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement("INSERT INTO Teachers (teacherId, teacherName) VALUES (NULL, ?)");
            
//            statement.setInt(1, teacher.getTeacherId());
            statement.setString(1, teacher.getTeacherName());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Teachers> getAllData() {
        ArrayList<Teachers> listteacher = new ArrayList<Teachers>();
         
         try {
            
             Statement statement = ConnectionDatabase.getConnection().createStatement();
             ResultSet result = statement.executeQuery("SELECT * FROM Teachers");
             
            while (result.next()) {
                Teachers teacher = new Teachers();
                teacher.setTeacherId(result.getInt("teacherId"));
                teacher.setTeacherName(result.getString("teacherName"));              
                listteacher.add(teacher);
            }
            
            statement.close();
            result.close();
            return listteacher;
        } catch (SQLException ex) {
             Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    }

    @Override
    public void update(Teachers teacher) {
        try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement("UPDATE Teachers set  teacherName=? WHERE teacherId=?");
            
//            statement.setInt(1, teacher.getTeacherId());
            statement.setString(1, teacher.getTeacherName());
            statement.setInt(2, teacher.getTeacherId());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Teachers teacher) {
        try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement("DELETE from Teachers WHERE teacherid =?");
            

            statement.setInt(1, teacher.getTeacherId());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public Teachers getData(Teachers teacher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Teachers> getSearch(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
