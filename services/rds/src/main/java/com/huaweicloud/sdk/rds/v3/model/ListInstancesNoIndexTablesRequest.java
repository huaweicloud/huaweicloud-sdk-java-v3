package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesNoIndexTablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newest")

    private Boolean newest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private String tableType;

    public ListInstancesNoIndexTablesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstancesNoIndexTablesRequest withNewest(Boolean newest) {
        this.newest = newest;
        return this;
    }

    /**
     * 指定查询是否应侧重于检索最新或最新的特殊表。
     * @return newest
     */
    public Boolean getNewest() {
        return newest;
    }

    public void setNewest(Boolean newest) {
        this.newest = newest;
    }

    public ListInstancesNoIndexTablesRequest withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表格类型。
     * @return tableType
     */
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesNoIndexTablesRequest that = (ListInstancesNoIndexTablesRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.newest, that.newest)
            && Objects.equals(this.tableType, that.tableType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, newest, tableType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesNoIndexTablesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    newest: ").append(toIndentedString(newest)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
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
