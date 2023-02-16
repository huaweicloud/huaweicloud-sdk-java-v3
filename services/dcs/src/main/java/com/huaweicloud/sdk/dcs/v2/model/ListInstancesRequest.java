package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_failure")

    private String includeFailure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_delete")

    private String includeDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_equal")

    private String nameEqual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    public ListInstancesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstancesRequest withIncludeFailure(String includeFailure) {
        this.includeFailure = includeFailure;
        return this;
    }

    /**
     * 是否返回创建失败的实例数。 当参数值为“true”时，返回创建失败的实例数。参数值为“false”或者其他值，不返回创建失败的实例数。
     * @return includeFailure
     */
    public String getIncludeFailure() {
        return includeFailure;
    }

    public void setIncludeFailure(String includeFailure) {
        this.includeFailure = includeFailure;
    }

    public ListInstancesRequest withIncludeDelete(String includeDelete) {
        this.includeDelete = includeDelete;
        return this;
    }

    /**
     * 是否返回已删除的实例数。 当参数值为“true”时，返回已删除的实例数。参数值为“false”或者其他值，不返回已删除的实例数。
     * @return includeDelete
     */
    public String getIncludeDelete() {
        return includeDelete;
    }

    public void setIncludeDelete(String includeDelete) {
        this.includeDelete = includeDelete;
    }

    public ListInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询， offset大于等于0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示条数，最小值为1，最大值为1000，若不设置该参数，则为10。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInstancesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。详细状态说明见[缓存实例状态说明](https://support.huaweicloud.com/api-dcs/dcs-api-0312047.html)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListInstancesRequest withNameEqual(String nameEqual) {
        this.nameEqual = nameEqual;
        return this;
    }

    /**
     * 是否按照实例名称进行精确匹配查询。  和name字段对应，name字段为模糊匹配的用例名，name_equal是精确匹配的用例名。
     * @return nameEqual
     */
    public String getNameEqual() {
        return nameEqual;
    }

    public void setNameEqual(String nameEqual) {
        this.nameEqual = nameEqual;
    }

    public ListInstancesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 根据实例标签键值对进行查询。{key}表示标签键，{value}表示标签值。  如果同时使用多个标签键值对进行查询，中间使用逗号分隔开，表示查询同时包含指定标签键值对的实例。 
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListInstancesRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 连接缓存实例的IP地址。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesRequest listInstancesRequest = (ListInstancesRequest) o;
        return Objects.equals(this.instanceId, listInstancesRequest.instanceId)
            && Objects.equals(this.includeFailure, listInstancesRequest.includeFailure)
            && Objects.equals(this.includeDelete, listInstancesRequest.includeDelete)
            && Objects.equals(this.name, listInstancesRequest.name)
            && Objects.equals(this.offset, listInstancesRequest.offset)
            && Objects.equals(this.limit, listInstancesRequest.limit)
            && Objects.equals(this.status, listInstancesRequest.status)
            && Objects.equals(this.nameEqual, listInstancesRequest.nameEqual)
            && Objects.equals(this.tags, listInstancesRequest.tags) && Objects.equals(this.ip, listInstancesRequest.ip);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(instanceId, includeFailure, includeDelete, name, offset, limit, status, nameEqual, tags, ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    includeFailure: ").append(toIndentedString(includeFailure)).append("\n");
        sb.append("    includeDelete: ").append(toIndentedString(includeDelete)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    nameEqual: ").append(toIndentedString(nameEqual)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
