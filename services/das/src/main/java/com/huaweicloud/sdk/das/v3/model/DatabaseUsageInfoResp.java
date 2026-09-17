package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatabaseUsageInfoResp
 */
public class DatabaseUsageInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu")

    private Float totalCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_memory")

    private Float totalMemory;

    public DatabaseUsageInfoResp withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DatabaseUsageInfoResp withTotalCpu(Float totalCpu) {
        this.totalCpu = totalCpu;
        return this;
    }

    /**
     * 该数据库的cpu占比
     * @return totalCpu
     */
    public Float getTotalCpu() {
        return totalCpu;
    }

    public void setTotalCpu(Float totalCpu) {
        this.totalCpu = totalCpu;
    }

    public DatabaseUsageInfoResp withTotalMemory(Float totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }

    /**
     * 该数据库的内存占比
     * @return totalMemory
     */
    public Float getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(Float totalMemory) {
        this.totalMemory = totalMemory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseUsageInfoResp that = (DatabaseUsageInfoResp) obj;
        return Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.totalCpu, that.totalCpu)
            && Objects.equals(this.totalMemory, that.totalMemory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, totalCpu, totalMemory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseUsageInfoResp {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    totalCpu: ").append(toIndentedString(totalCpu)).append("\n");
        sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
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
