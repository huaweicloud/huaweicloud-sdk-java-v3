package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportTableSpaceNewStat
 */
public class HealthReportTableSpaceNewStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_top_resp")

    private List<HealthReportTableSpaceQuerySpaceTopResp> databaseTopResp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_top_resp")

    private List<HealthReportTableSpaceQuerySpaceTopResp> tableTopResp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rapid_growth_tables_resp")

    private List<HealthReportTableSpaceQueryRapidGrowthTablesResp> rapidGrowthTablesResp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_primary_tables_resp")

    private List<HealthReportTableSpaceQuerySpecialTablesResp> noPrimaryTablesResp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_index_tables_resp")

    private List<HealthReportTableSpaceQuerySpecialTablesResp> noIndexTablesResp = null;

    public HealthReportTableSpaceNewStat withDatabaseTopResp(
        List<HealthReportTableSpaceQuerySpaceTopResp> databaseTopResp) {
        this.databaseTopResp = databaseTopResp;
        return this;
    }

    public HealthReportTableSpaceNewStat addDatabaseTopRespItem(
        HealthReportTableSpaceQuerySpaceTopResp databaseTopRespItem) {
        if (this.databaseTopResp == null) {
            this.databaseTopResp = new ArrayList<>();
        }
        this.databaseTopResp.add(databaseTopRespItem);
        return this;
    }

    public HealthReportTableSpaceNewStat withDatabaseTopResp(
        Consumer<List<HealthReportTableSpaceQuerySpaceTopResp>> databaseTopRespSetter) {
        if (this.databaseTopResp == null) {
            this.databaseTopResp = new ArrayList<>();
        }
        databaseTopRespSetter.accept(this.databaseTopResp);
        return this;
    }

    /**
     * top库列表。
     * @return databaseTopResp
     */
    public List<HealthReportTableSpaceQuerySpaceTopResp> getDatabaseTopResp() {
        return databaseTopResp;
    }

    public void setDatabaseTopResp(List<HealthReportTableSpaceQuerySpaceTopResp> databaseTopResp) {
        this.databaseTopResp = databaseTopResp;
    }

    public HealthReportTableSpaceNewStat withTableTopResp(List<HealthReportTableSpaceQuerySpaceTopResp> tableTopResp) {
        this.tableTopResp = tableTopResp;
        return this;
    }

    public HealthReportTableSpaceNewStat addTableTopRespItem(HealthReportTableSpaceQuerySpaceTopResp tableTopRespItem) {
        if (this.tableTopResp == null) {
            this.tableTopResp = new ArrayList<>();
        }
        this.tableTopResp.add(tableTopRespItem);
        return this;
    }

    public HealthReportTableSpaceNewStat withTableTopResp(
        Consumer<List<HealthReportTableSpaceQuerySpaceTopResp>> tableTopRespSetter) {
        if (this.tableTopResp == null) {
            this.tableTopResp = new ArrayList<>();
        }
        tableTopRespSetter.accept(this.tableTopResp);
        return this;
    }

    /**
     * top表列表。
     * @return tableTopResp
     */
    public List<HealthReportTableSpaceQuerySpaceTopResp> getTableTopResp() {
        return tableTopResp;
    }

    public void setTableTopResp(List<HealthReportTableSpaceQuerySpaceTopResp> tableTopResp) {
        this.tableTopResp = tableTopResp;
    }

    public HealthReportTableSpaceNewStat withRapidGrowthTablesResp(
        List<HealthReportTableSpaceQueryRapidGrowthTablesResp> rapidGrowthTablesResp) {
        this.rapidGrowthTablesResp = rapidGrowthTablesResp;
        return this;
    }

    public HealthReportTableSpaceNewStat addRapidGrowthTablesRespItem(
        HealthReportTableSpaceQueryRapidGrowthTablesResp rapidGrowthTablesRespItem) {
        if (this.rapidGrowthTablesResp == null) {
            this.rapidGrowthTablesResp = new ArrayList<>();
        }
        this.rapidGrowthTablesResp.add(rapidGrowthTablesRespItem);
        return this;
    }

    public HealthReportTableSpaceNewStat withRapidGrowthTablesResp(
        Consumer<List<HealthReportTableSpaceQueryRapidGrowthTablesResp>> rapidGrowthTablesRespSetter) {
        if (this.rapidGrowthTablesResp == null) {
            this.rapidGrowthTablesResp = new ArrayList<>();
        }
        rapidGrowthTablesRespSetter.accept(this.rapidGrowthTablesResp);
        return this;
    }

    /**
     * 异常增长表列表。
     * @return rapidGrowthTablesResp
     */
    public List<HealthReportTableSpaceQueryRapidGrowthTablesResp> getRapidGrowthTablesResp() {
        return rapidGrowthTablesResp;
    }

    public void setRapidGrowthTablesResp(List<HealthReportTableSpaceQueryRapidGrowthTablesResp> rapidGrowthTablesResp) {
        this.rapidGrowthTablesResp = rapidGrowthTablesResp;
    }

    public HealthReportTableSpaceNewStat withNoPrimaryTablesResp(
        List<HealthReportTableSpaceQuerySpecialTablesResp> noPrimaryTablesResp) {
        this.noPrimaryTablesResp = noPrimaryTablesResp;
        return this;
    }

    public HealthReportTableSpaceNewStat addNoPrimaryTablesRespItem(
        HealthReportTableSpaceQuerySpecialTablesResp noPrimaryTablesRespItem) {
        if (this.noPrimaryTablesResp == null) {
            this.noPrimaryTablesResp = new ArrayList<>();
        }
        this.noPrimaryTablesResp.add(noPrimaryTablesRespItem);
        return this;
    }

    public HealthReportTableSpaceNewStat withNoPrimaryTablesResp(
        Consumer<List<HealthReportTableSpaceQuerySpecialTablesResp>> noPrimaryTablesRespSetter) {
        if (this.noPrimaryTablesResp == null) {
            this.noPrimaryTablesResp = new ArrayList<>();
        }
        noPrimaryTablesRespSetter.accept(this.noPrimaryTablesResp);
        return this;
    }

    /**
     * 无主键表列表。
     * @return noPrimaryTablesResp
     */
    public List<HealthReportTableSpaceQuerySpecialTablesResp> getNoPrimaryTablesResp() {
        return noPrimaryTablesResp;
    }

    public void setNoPrimaryTablesResp(List<HealthReportTableSpaceQuerySpecialTablesResp> noPrimaryTablesResp) {
        this.noPrimaryTablesResp = noPrimaryTablesResp;
    }

    public HealthReportTableSpaceNewStat withNoIndexTablesResp(
        List<HealthReportTableSpaceQuerySpecialTablesResp> noIndexTablesResp) {
        this.noIndexTablesResp = noIndexTablesResp;
        return this;
    }

    public HealthReportTableSpaceNewStat addNoIndexTablesRespItem(
        HealthReportTableSpaceQuerySpecialTablesResp noIndexTablesRespItem) {
        if (this.noIndexTablesResp == null) {
            this.noIndexTablesResp = new ArrayList<>();
        }
        this.noIndexTablesResp.add(noIndexTablesRespItem);
        return this;
    }

    public HealthReportTableSpaceNewStat withNoIndexTablesResp(
        Consumer<List<HealthReportTableSpaceQuerySpecialTablesResp>> noIndexTablesRespSetter) {
        if (this.noIndexTablesResp == null) {
            this.noIndexTablesResp = new ArrayList<>();
        }
        noIndexTablesRespSetter.accept(this.noIndexTablesResp);
        return this;
    }

    /**
     * 无索引表列表。
     * @return noIndexTablesResp
     */
    public List<HealthReportTableSpaceQuerySpecialTablesResp> getNoIndexTablesResp() {
        return noIndexTablesResp;
    }

    public void setNoIndexTablesResp(List<HealthReportTableSpaceQuerySpecialTablesResp> noIndexTablesResp) {
        this.noIndexTablesResp = noIndexTablesResp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportTableSpaceNewStat that = (HealthReportTableSpaceNewStat) obj;
        return Objects.equals(this.databaseTopResp, that.databaseTopResp)
            && Objects.equals(this.tableTopResp, that.tableTopResp)
            && Objects.equals(this.rapidGrowthTablesResp, that.rapidGrowthTablesResp)
            && Objects.equals(this.noPrimaryTablesResp, that.noPrimaryTablesResp)
            && Objects.equals(this.noIndexTablesResp, that.noIndexTablesResp);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(databaseTopResp, tableTopResp, rapidGrowthTablesResp, noPrimaryTablesResp, noIndexTablesResp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportTableSpaceNewStat {\n");
        sb.append("    databaseTopResp: ").append(toIndentedString(databaseTopResp)).append("\n");
        sb.append("    tableTopResp: ").append(toIndentedString(tableTopResp)).append("\n");
        sb.append("    rapidGrowthTablesResp: ").append(toIndentedString(rapidGrowthTablesResp)).append("\n");
        sb.append("    noPrimaryTablesResp: ").append(toIndentedString(noPrimaryTablesResp)).append("\n");
        sb.append("    noIndexTablesResp: ").append(toIndentedString(noIndexTablesResp)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
