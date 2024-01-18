package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListServersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_status")

    private String maintainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_auto_create")

    private String scalingAutoCreate;

    public ListServersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListServersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询的数量，值区间[1-100]。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListServersRequest withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 服务器组唯一标识。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ListServersRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 服务器名称，支持部分匹配。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ListServersRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器唯一标识。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ListServersRequest withMaintainStatus(String maintainStatus) {
        this.maintainStatus = maintainStatus;
        return this;
    }

    /**
     * 服务器维护状态： - true : 维护态的实例。 - false: 非维护态的实例。
     * @return maintainStatus
     */
    public String getMaintainStatus() {
        return maintainStatus;
    }

    public void setMaintainStatus(String maintainStatus) {
        this.maintainStatus = maintainStatus;
    }

    public ListServersRequest withScalingAutoCreate(String scalingAutoCreate) {
        this.scalingAutoCreate = scalingAutoCreate;
        return this;
    }

    /**
     * 是否是弹性创建： true : 通过弹性伸缩创建。 false: 不是通过弹性伸缩创建。
     * @return scalingAutoCreate
     */
    public String getScalingAutoCreate() {
        return scalingAutoCreate;
    }

    public void setScalingAutoCreate(String scalingAutoCreate) {
        this.scalingAutoCreate = scalingAutoCreate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServersRequest that = (ListServersRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.serverGroupId, that.serverGroupId)
            && Objects.equals(this.serverName, that.serverName) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.maintainStatus, that.maintainStatus)
            && Objects.equals(this.scalingAutoCreate, that.scalingAutoCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, serverGroupId, serverName, serverId, maintainStatus, scalingAutoCreate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    maintainStatus: ").append(toIndentedString(maintainStatus)).append("\n");
        sb.append("    scalingAutoCreate: ").append(toIndentedString(scalingAutoCreate)).append("\n");
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
