package gdien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class thptqgModify {
	public static List<thptqg> findAll() {
		List<thptqg> thptqgList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thptqg","root","123456");
			String sql = "select * from dsthisinh";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                thptqg thpt = new thptqg(resultSet.getInt("STT"), 
                        resultSet.getString("Ho_ten"), resultSet.getString("Gioi_tinh"), 
                        resultSet.getString("CCCD"), resultSet.getString("Dien_thoai"), 
                        resultSet.getFloat("Diem_toan"),resultSet.getFloat("Diem_van"),
                        resultSet.getFloat("Ngoai_ngu"),resultSet.getFloat("To_hop"));
                thptqgList.add(thpt);
            }
		} catch (SQLException ex) {
			Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return thptqgList;
    }
    
    public static void insert(thptqg thpt) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thptqg", "root", "123456");
            
            String sql = "insert into dsthisinh(Ho_ten,Gioi_tinh,CCCD,Dien_thoai,Diem_toan,Diem_van,Ngoai_ngu,To_hop) values(?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, thpt.getHoten());
            statement.setString(2, thpt.getGioitinh());
            statement.setString(3, thpt.getCccd());
            statement.setString(4, thpt.getDienthoai());
            statement.setFloat(5, thpt.getToan());
            statement.setFloat(6, thpt.getVan());
            statement.setFloat(7, thpt.getNgoaingu());
            statement.setFloat(8, thpt.getTohop());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       
    }
    
    public static void update(thptqg thpt) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thptqg", "root", "123456");
            
            String sql = "update dsthisinh set Ho_ten=?,Gioi_tinh=?,CCCD=?,Dien_thoai=?,Diem_toan=?,Diem_van=?,Ngoai_ngu=?,To_hop=? where STT = ?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, thpt.getHoten());
            statement.setString(2, thpt.getGioitinh());
            statement.setString(3, thpt.getCccd());
            statement.setString(4, thpt.getDienthoai());
            statement.setFloat(5, thpt.getToan());
            statement.setFloat(6, thpt.getVan());
            statement.setFloat(7, thpt.getNgoaingu());
            statement.setFloat(8, thpt.getTohop());
            statement.setInt(9, thpt.getStt());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void delete(int Stt) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
         
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thptqg", "root", "123456");
            
            String sql = "delete from dsthisinh where STT = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, Stt);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    }
    
    public static List<thptqg> findByHoten(String Hoten) {
        List<thptqg> thptqgList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thptqg", "root", "123456");
            
            String sql = "select * from dsthisinh where Ho_ten like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+Hoten+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                thptqg thpt = new thptqg(resultSet.getInt("STT"), 
                		 resultSet.getString("Ho_ten"), resultSet.getString("Gioi_tinh"), 
                         resultSet.getString("CCCD"), resultSet.getString("Dien_thoai"), 
                         resultSet.getFloat("Diem_toan"),resultSet.getFloat("Diem_van"),
                         resultSet.getFloat("Ngoai_ngu"),resultSet.getFloat("To_hop"));
                thptqgList.add(thpt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(thptqgModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return thptqgList;
    }
		
	}
