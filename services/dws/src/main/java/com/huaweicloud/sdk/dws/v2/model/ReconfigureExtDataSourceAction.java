package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新数据源配置
 */
public class ReconfigureExtDataSourceAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private Boolean database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    public ReconfigureExtDataSourceAction withDatabase(Boolean database) {
        this.database = database;
        return this;
    }

    /**
     * 重启。
     * @return database
     */
    public Boolean getDatabase() {
        return database;
    }

    public void setDatabase(Boolean database) {
        this.database = database;
    }

    public ReconfigureExtDataSourceAction withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReconfigureExtDataSourceAction reconfigureExtDataSourceAction = (ReconfigureExtDataSourceAction) o;
        return Objects.equals(this.database, reconfigureExtDataSourceAction.database)
            && Objects.equals(this.agency, reconfigureExtDataSourceAction.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, agency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReconfigureExtDataSourceAction {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
