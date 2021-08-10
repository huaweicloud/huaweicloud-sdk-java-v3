package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListTopicsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Integer deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_permission")

    private Integer topicPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_type")

    private Integer topicType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_private")

    private Integer isPrivate;

    public ListTopicsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListTopicsRequest withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** 设备ID minimum: 0 maximum: 200376420520689663
     * 
     * @return deviceId */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public ListTopicsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示条目数量，最大数量999，超过999后只返回999 minimum: 0 maximum: 999
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTopicsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，表示从此偏移量开始查询， offset大于等于0 minimum: 0 maximum: 999999
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTopicsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** topic名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTopicsRequest withTopicPermission(Integer topicPermission) {
        this.topicPermission = topicPermission;
        return this;
    }

    /** topic权限，0为发布，1为订阅 minimum: 0 maximum: 1
     * 
     * @return topicPermission */
    public Integer getTopicPermission() {
        return topicPermission;
    }

    public void setTopicPermission(Integer topicPermission) {
        this.topicPermission = topicPermission;
    }

    public ListTopicsRequest withTopicType(Integer topicType) {
        this.topicType = topicType;
        return this;
    }

    /** topic类型，0为设备类topic，1为产品类topic minimum: 0 maximum: 1
     * 
     * @return topicType */
    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    public ListTopicsRequest withIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /** topic是否为自定义，0为基础topic，1为自定义topic minimum: 0 maximum: 1
     * 
     * @return isPrivate */
    public Integer getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTopicsRequest listTopicsRequest = (ListTopicsRequest) o;
        return Objects.equals(this.instanceId, listTopicsRequest.instanceId)
            && Objects.equals(this.deviceId, listTopicsRequest.deviceId)
            && Objects.equals(this.limit, listTopicsRequest.limit)
            && Objects.equals(this.offset, listTopicsRequest.offset)
            && Objects.equals(this.name, listTopicsRequest.name)
            && Objects.equals(this.topicPermission, listTopicsRequest.topicPermission)
            && Objects.equals(this.topicType, listTopicsRequest.topicType)
            && Objects.equals(this.isPrivate, listTopicsRequest.isPrivate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, deviceId, limit, offset, name, topicPermission, topicType, isPrivate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    topicPermission: ").append(toIndentedString(topicPermission)).append("\n");
        sb.append("    topicType: ").append(toIndentedString(topicType)).append("\n");
        sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
