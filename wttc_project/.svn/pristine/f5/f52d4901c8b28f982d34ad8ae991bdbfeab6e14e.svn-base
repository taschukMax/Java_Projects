package com.westchestertabletennis.paymentgenerator.dao;

import com.westchestertabletennis.paymentgenerator.dto.DTO;
import com.westchestertabletennis.paymentgenerator.dto.PreparedStatementSetter;
import com.westchestertabletennis.paymentgenerator.dto.RowMapper;
import com.westchestertabletennis.paymentgenerator.dto.TournamentDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Generic methods to read/update db.
 */
public class ConnectionUtil {
    public static List readDTOs(String sql, PreparedStatementSetter setter, RowMapper rowMapper) {
        return (List) doStuff(false, true, sql, setter, rowMapper);
    }

    public static TournamentDTO readDTOsWithCreteria(String sql, PreparedStatementSetter setter, RowMapper rowMapper) {
        return (TournamentDTO) doStuff(false, false, sql, setter, rowMapper);
    }

    public static Integer update(String sql, PreparedStatementSetter setter) {
        return (Integer) doStuff(true, false, sql, setter, null);
    }

    private static Object doStuff(boolean isUpdate, boolean returnList, String sql, PreparedStatementSetter setter, RowMapper rowMapper) {
        PreparedStatement pstmt = null;
        Connection conn = null;

        List list = null;
        if (returnList) {
            list = new ArrayList();
        }
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/wttc";
            Properties properties = new Properties();
            properties.setProperty("user", "postgres");
            properties.setProperty("password", "zxcasd");
            conn = DriverManager.getConnection(url, properties);
            pstmt = conn.prepareStatement(sql);
            if (setter != null) {
                setter.doAllStuffNeededToPrepareStatement(pstmt);
            }
            if (isUpdate) {
                return (Integer) pstmt.executeUpdate();
            } else {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    DTO dto = rowMapper.createDTOFromResultSet(rs);
                    if (returnList) {
                        list.add(dto);
                    } else {
                        return dto;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (returnList) {
            return list;
        } else {
            return null;
        }
    }
}
