package Utils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DbReader {

    public static List<Map<String,String>> fetch(String query) throws IOException {
        String dbURL = ConfigReader.read("dbURL");
        String userName = ConfigReader.read("dbUserName");
        String password = ConfigReader.read("dbPassword");

        List<Map<String, String>> TblData = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(dbURL, userName, password);
             Statement statement = connection.createStatement();) {

            ResultSet rows = statement.executeQuery(query);

            ResultSetMetaData headerInfo = rows.getMetaData();

            while (rows.next()) {
                Map<String, String> rowMap = new LinkedHashMap<>();
                for (int i = 1; i <= headerInfo.getColumnCount(); i++) {
                    String key = headerInfo.getColumnName(i);
                    String value = rows.getString(i);
                    rowMap.put(key, value);
                }
                TblData.add(rowMap);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return TblData;
    }

    }
