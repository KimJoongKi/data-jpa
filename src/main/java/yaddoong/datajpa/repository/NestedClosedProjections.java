package yaddoong.datajpa.repository;

import yaddoong.datajpa.entity.Team;

public interface NestedClosedProjections {

    String getUsername();

    TeamInfo getTeam();

    interface TeamInfo
    {
        String getName();
    }

}
