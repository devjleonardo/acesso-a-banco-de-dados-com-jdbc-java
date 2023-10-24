package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DBIntegrityException;

public class Program {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DB.getConnection();
			
			preparedStatement = connection.prepareStatement(
					"DELETE FROM department "
					+ "WHERE Id = ?");
			
			preparedStatement.setInt(1, 2);
			
			int rowsAffected = preparedStatement.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			throw new DBIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
	}

}
