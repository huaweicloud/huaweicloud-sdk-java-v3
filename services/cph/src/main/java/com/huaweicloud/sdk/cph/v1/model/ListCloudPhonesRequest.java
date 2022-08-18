package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCloudPhonesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_name")

    private String phoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    public ListCloudPhonesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量为一个大于0小于资源总个数的整数，表示查询该偏移量后面的所有的资源数，默认值为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCloudPhonesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的资源个数。取值范围：1~100（默认值为100），一般设置为10、20、50。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCloudPhonesRequest withPhoneName(String phoneName) {
        this.phoneName = phoneName;
        return this;
    }

    /**
     * 云手机名称，支持模糊查询
     * @return phoneName
     */
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public ListCloudPhonesRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器id。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ListCloudPhonesRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 云手机状态 - 0：创建中 - 1：创建中 - 2：运行中 - 3：重置中 - 4：重启中 - 6：冻结 - 7：正在关机 - 8：已关机 - -5：重置失败 - -6：重启失败 - -7：手机异常 - -8：创建失败 - -9：关机失败
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListCloudPhonesRequest withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 云手机类型 - 0：普通云手机 - 1：试玩云手机
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCloudPhonesRequest listCloudPhonesRequest = (ListCloudPhonesRequest) o;
        return Objects.equals(this.offset, listCloudPhonesRequest.offset)
            && Objects.equals(this.limit, listCloudPhonesRequest.limit)
            && Objects.equals(this.phoneName, listCloudPhonesRequest.phoneName)
            && Objects.equals(this.serverId, listCloudPhonesRequest.serverId)
            && Objects.equals(this.status, listCloudPhonesRequest.status)
            && Objects.equals(this.type, listCloudPhonesRequest.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, phoneName, serverId, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhonesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    phoneName: ").append(toIndentedString(phoneName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
