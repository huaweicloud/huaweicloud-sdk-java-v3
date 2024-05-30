package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCloudPhoneServersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_version")

    private String networkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_name")

    private String phoneModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_since")

    private Long createSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_until")

    private Long createUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ListCloudPhoneServersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量为一个大于等于0整数，表示查询该偏移量后面的所有的资源数，默认值为0。
     * minimum: 0
     * maximum: 8096
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCloudPhoneServersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的资源个数。取值范围：1~100（默认值为100），一般设置为10、20、50。
     * minimum: 0
     * maximum: 8096
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCloudPhoneServersRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 云手机服务器名称，支持模糊查询。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ListCloudPhoneServersRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器的唯一标识。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ListCloudPhoneServersRequest withNetworkVersion(String networkVersion) {
        this.networkVersion = networkVersion;
        return this;
    }

    /**
     * 云手机服务器是否为自定义网络标识。 - v1：系统定义网络的云手机服务器 - v2：自定义网络的云手机服务器
     * @return networkVersion
     */
    public String getNetworkVersion() {
        return networkVersion;
    }

    public void setNetworkVersion(String networkVersion) {
        this.networkVersion = networkVersion;
    }

    public ListCloudPhoneServersRequest withPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
        return this;
    }

    /**
     * 手机规格名称。
     * @return phoneModelName
     */
    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }

    public ListCloudPhoneServersRequest withCreateSince(Long createSince) {
        this.createSince = createSince;
        return this;
    }

    /**
     * 查询的起始时间戳。
     * minimum: 0
     * maximum: 20000000000000
     * @return createSince
     */
    public Long getCreateSince() {
        return createSince;
    }

    public void setCreateSince(Long createSince) {
        this.createSince = createSince;
    }

    public ListCloudPhoneServersRequest withCreateUntil(Long createUntil) {
        this.createUntil = createUntil;
        return this;
    }

    /**
     * 查询的结束时间戳。
     * minimum: 0
     * maximum: 20000000000000
     * @return createUntil
     */
    public Long getCreateUntil() {
        return createUntil;
    }

    public void setCreateUntil(Long createUntil) {
        this.createUntil = createUntil;
    }

    public ListCloudPhoneServersRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 服务器状态。 - 0、1、3、4：创建中 - 2：异常 - 5：正常 - 8：冻结 - 10：关机 - 11：关机中 - 12：关机失败 - 13：开机中
     * minimum: 0
     * maximum: 128
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudPhoneServersRequest that = (ListCloudPhoneServersRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.serverName, that.serverName) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.networkVersion, that.networkVersion)
            && Objects.equals(this.phoneModelName, that.phoneModelName)
            && Objects.equals(this.createSince, that.createSince) && Objects.equals(this.createUntil, that.createUntil)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            serverName,
            serverId,
            networkVersion,
            phoneModelName,
            createSince,
            createUntil,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhoneServersRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    networkVersion: ").append(toIndentedString(networkVersion)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    createSince: ").append(toIndentedString(createSince)).append("\n");
        sb.append("    createUntil: ").append(toIndentedString(createUntil)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
