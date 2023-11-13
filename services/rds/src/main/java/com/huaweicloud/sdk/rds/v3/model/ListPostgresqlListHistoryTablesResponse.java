package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPostgresqlListHistoryTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_limit")

    private Integer tableLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<PostgreSQLHistoryTableInstance> instances = null;

    public ListPostgresqlListHistoryTablesResponse withTableLimit(Integer tableLimit) {
        this.tableLimit = tableLimit;
        return this;
    }

    /**
     * 恢复表数量限制个数
     * @return tableLimit
     */
    public Integer getTableLimit() {
        return tableLimit;
    }

    public void setTableLimit(Integer tableLimit) {
        this.tableLimit = tableLimit;
    }

    public ListPostgresqlListHistoryTablesResponse withInstances(List<PostgreSQLHistoryTableInstance> instances) {
        this.instances = instances;
        return this;
    }

    public ListPostgresqlListHistoryTablesResponse addInstancesItem(PostgreSQLHistoryTableInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListPostgresqlListHistoryTablesResponse withInstances(
        Consumer<List<PostgreSQLHistoryTableInstance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例信息
     * @return instances
     */
    public List<PostgreSQLHistoryTableInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<PostgreSQLHistoryTableInstance> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPostgresqlListHistoryTablesResponse that = (ListPostgresqlListHistoryTablesResponse) obj;
        return Objects.equals(this.tableLimit, that.tableLimit) && Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableLimit, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPostgresqlListHistoryTablesResponse {\n");
        sb.append("    tableLimit: ").append(toIndentedString(tableLimit)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
