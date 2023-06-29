package com.huaweicloud.sdk.mas.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatasourceStatistics
 */
public class DatasourceStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_count")

    private Integer mysqlCount;

    public DatasourceStatistics withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public DatasourceStatistics withMysqlCount(Integer mysqlCount) {
        this.mysqlCount = mysqlCount;
        return this;
    }

    /**
     * Get mysqlCount
     * @return mysqlCount
     */
    public Integer getMysqlCount() {
        return mysqlCount;
    }

    public void setMysqlCount(Integer mysqlCount) {
        this.mysqlCount = mysqlCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatasourceStatistics that = (DatasourceStatistics) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.mysqlCount, that.mysqlCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, mysqlCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasourceStatistics {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    mysqlCount: ").append(toIndentedString(mysqlCount)).append("\n");
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
