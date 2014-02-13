package com.westchestertabletennis.paymentgenerator.dto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetter {
    public void doAllStuffNeededToPrepareStatement(PreparedStatement pstmt) throws SQLException ;
}
