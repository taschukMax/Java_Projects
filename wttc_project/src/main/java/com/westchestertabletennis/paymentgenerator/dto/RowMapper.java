package com.westchestertabletennis.paymentgenerator.dto;

import java.sql.ResultSet;

public interface RowMapper {
    public DTO createDTOFromResultSet(ResultSet result) throws Exception;
}
