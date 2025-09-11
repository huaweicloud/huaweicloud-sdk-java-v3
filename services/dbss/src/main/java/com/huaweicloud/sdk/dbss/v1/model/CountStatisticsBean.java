package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CountStatisticsBean
 */
public class CountStatisticsBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_num")

    private Long sqlNum;

    public CountStatisticsBean withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 周期
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public CountStatisticsBean withSqlNum(Long sqlNum) {
        this.sqlNum = sqlNum;
        return this;
    }

    /**
     * SQL数量
     * @return sqlNum
     */
    public Long getSqlNum() {
        return sqlNum;
    }

    public void setSqlNum(Long sqlNum) {
        this.sqlNum = sqlNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountStatisticsBean that = (CountStatisticsBean) obj;
        return Objects.equals(this.period, that.period) && Objects.equals(this.sqlNum, that.sqlNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, sqlNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountStatisticsBean {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    sqlNum: ").append(toIndentedString(sqlNum)).append("\n");
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
