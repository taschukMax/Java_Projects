package com.westchestertabletennis.paymentgenerator.dao;

import com.westchestertabletennis.paymentgenerator.dto.DTO;
import com.westchestertabletennis.paymentgenerator.dto.EventDTO;
import com.westchestertabletennis.paymentgenerator.dto.PreparedStatementSetter;
import com.westchestertabletennis.paymentgenerator.dto.RowMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EventDAO {
    public List readAllEvents(final String tournament) {
        return ConnectionUtil.readDTOs(
                "SELECT  * from event where tournamentid=? order by eventorder",
                new PreparedStatementSetter() {
                    @Override
                    public void doAllStuffNeededToPrepareStatement(PreparedStatement pstmt) throws SQLException {
                        pstmt.setInt(1, Integer.valueOf(tournament));
                    }
                },
                new RowMapper() {
                    @Override
                    public DTO createDTOFromResultSet(ResultSet result) throws Exception {
                        return new EventDTO().fromResultSet(result);
                    }
                }
        );
    }

    public void saveEventToDB(final EventDTO dto) {
        String query = "INSERT INTO event(\n" +
                "            tournamentid, eventname, eventdate, maxparticipants, usatt, \n" +
                "            firstpl, secondpl, thirdpl, fourthpl, fifthpl, sixthpl, seventhpl, \n" +
                "            eighth, fee, \"fineText\", eventorder, eventtime)\n" +
                "    VALUES (?, ?, ?, ?, ?, \n" +
                "            ?, ?, ?, ?, ?, ?, ?, \n" +
                "            ?, ?, ?, ?,?)";
        ConnectionUtil.update(query, new PreparedStatementSetter() {
            @Override
            public void doAllStuffNeededToPrepareStatement(PreparedStatement pstmt) throws SQLException {
                pstmt.setInt(1, dto.getTournamentid());
                pstmt.setString(2, dto.getEventName());
                pstmt.setString(3, dto.getEventDate());
                pstmt.setInt(4, dto.getMaxParticipants());
                pstmt.setBoolean(5, dto.isUsatt());
                pstmt.setString(6, dto.getFirstPl());
                pstmt.setString(7, dto.getSecondPl());
                pstmt.setString(8, dto.getThirdPl());
                pstmt.setString(9, dto.getFourthPl());
                pstmt.setString(10, dto.getFifthPl());
                pstmt.setString(11, dto.getSixthPl());
                pstmt.setString(12, dto.getSeventhPl());
                pstmt.setString(13, dto.getEighthPl());
                pstmt.setString(14, dto.getFee());
                pstmt.setString(15, dto.getText());
                pstmt.setInt(16, dto.getEventOrder());
                pstmt.setString(17, dto.getEventTime());
            }
        });
    }

    public void updateEventInDB(final EventDTO eventDTO) {
        ConnectionUtil.update("UPDATE event\n" +
                "   SET tournamentid=?, eventname=?, eventdate=?, maxparticipants=?, \n" +
                "       usatt=?, firstpl=?, secondpl=?, thirdpl=?, fourthpl=?, fifthpl=?, \n" +
                "       sixthpl=?, seventhpl=?, eighth=?, fee=?, \"fineText\"=?, eventorder=?, eventtime=?" +
                " WHERE tournamentid=? and id=?", new PreparedStatementSetter() {
            @Override
            public void doAllStuffNeededToPrepareStatement(PreparedStatement pstmt) throws SQLException {
                pstmt.setInt(1, eventDTO.getTournamentid());
                pstmt.setString(2, eventDTO.getEventName());
                pstmt.setString(3, eventDTO.getEventDate());
                pstmt.setInt(4, eventDTO.getMaxParticipants());
                pstmt.setBoolean(5, eventDTO.isUsatt());
                pstmt.setString(6, eventDTO.getFirstPl());
                pstmt.setString(7, eventDTO.getSecondPl());
                pstmt.setString(8, eventDTO.getThirdPl());
                pstmt.setString(9, eventDTO.getFourthPl());
                pstmt.setString(10, eventDTO.getFifthPl());
                pstmt.setString(11, eventDTO.getSixthPl());
                pstmt.setString(12, eventDTO.getSeventhPl());
                pstmt.setString(13, eventDTO.getEighthPl());
                pstmt.setString(14, eventDTO.getFee());
                pstmt.setString(15, eventDTO.getText());
                pstmt.setInt(16, eventDTO.getEventOrder());
                pstmt.setString(17, eventDTO.getEventTime());
                pstmt.setInt(18, eventDTO.getTournamentid());
                pstmt.setInt(19, eventDTO.getId());
            }
        });
    }

    public void deleteEmptyEventFromDB(final EventDTO eventDTO) {
        ConnectionUtil.update(
                "DELETE FROM event WHERE id=?",
                new PreparedStatementSetter() {
                    public void doAllStuffNeededToPrepareStatement(PreparedStatement pstmt) throws SQLException {
                        pstmt.setInt(1, eventDTO.getId());
                    }
                }
        );
    }
}
