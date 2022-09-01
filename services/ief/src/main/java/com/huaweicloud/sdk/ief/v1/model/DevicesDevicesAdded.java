package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 要加入的终端设备详情
 */
public class DevicesDevicesAdded {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    @JacksonXmlProperty(localName = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    @JacksonXmlProperty(localName = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_ids")

    @JacksonXmlProperty(localName = "device_ids")

    private List<String> deviceIds = null;

    public DevicesDevicesAdded withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * 终端设备和节点关系的名称，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public DevicesDevicesAdded withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 终端设备和节点关系的描述，最大长度64，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DevicesDevicesAdded withDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }

    public DevicesDevicesAdded addDeviceIdsItem(String deviceIdsItem) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        this.deviceIds.add(deviceIdsItem);
        return this;
    }

    public DevicesDevicesAdded withDeviceIds(Consumer<List<String>> deviceIdsSetter) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        deviceIdsSetter.accept(this.deviceIds);
        return this;
    }

    /**
     * 终端设备ID列表
     * @return deviceIds
     */
    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DevicesDevicesAdded devicesDevicesAdded = (DevicesDevicesAdded) o;
        return Objects.equals(this.relation, devicesDevicesAdded.relation)
            && Objects.equals(this.comment, devicesDevicesAdded.comment)
            && Objects.equals(this.deviceIds, devicesDevicesAdded.deviceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relation, comment, deviceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevicesDevicesAdded {\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
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
