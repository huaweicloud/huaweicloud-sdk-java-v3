package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perpage")

    private String perpage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curpage")

    private String curpage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private String connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public ListConnectionRequest withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 数据库实例地址/实例名称/备注等关键字
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ListConnectionRequest withPerpage(String perpage) {
        this.perpage = perpage;
        return this;
    }

    /**
     * 每页记录数
     * @return perpage
     */
    public String getPerpage() {
        return perpage;
    }

    public void setPerpage(String perpage) {
        this.perpage = perpage;
    }

    public ListConnectionRequest withCurpage(String curpage) {
        this.curpage = curpage;
        return this;
    }

    /**
     * 页码
     * @return curpage
     */
    public String getCurpage() {
        return curpage;
    }

    public void setCurpage(String curpage) {
        this.curpage = curpage;
    }

    public ListConnectionRequest withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 数据库来源类型
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public ListConnectionRequest withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ListConnectionRequest withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * 连接类型
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public ListConnectionRequest withInstanceId(String instanceId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionRequest that = (ListConnectionRequest) obj;
        return Objects.equals(this.condition, that.condition) && Objects.equals(this.perpage, that.perpage)
            && Objects.equals(this.curpage, that.curpage) && Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.connectionType, that.connectionType)
            && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, perpage, curpage, networkType, datastoreType, connectionType, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionRequest {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
        sb.append("    curpage: ").append(toIndentedString(curpage)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
