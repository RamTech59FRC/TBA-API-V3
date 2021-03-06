package com.cpjd.models.other.teams.status;

import lombok.Data;
import com.cpjd.models.other.Ranking;
import com.cpjd.models.other.SortInfo;

/**
 * Created by Will Davies on 7/7/2017.
 */
@Data
public class TeamEventStatusRank {
    /**
     * Number of teams ranked.
     */
    private int numTeams;
    private Ranking[] ranking;
    /**
     * Ordered list of names corresponding to the elements of the `sort_orders` array.
     */
    private SortInfo[] sortOrderInfo;
    private String status;

}
