package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListDeviceTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ListDeviceTemplatesRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /** 铂金版实例ID，专业版实例为空值
     * 
     * @return iefInstanceId */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public ListDeviceTemplatesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 终端设备名称，模糊匹配
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDeviceTemplatesRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /** 查询的起始位置，取值范围为非负整数，默认为0
     * 
     * @return offset */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListDeviceTemplatesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量，取值范围1~1000，默认为1000
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeviceTemplatesRequest listDeviceTemplatesRequest = (ListDeviceTemplatesRequest) o;
        return Objects.equals(this.iefInstanceId, listDeviceTemplatesRequest.iefInstanceId)
            && Objects.equals(this.name, listDeviceTemplatesRequest.name)
            && Objects.equals(this.offset, listDeviceTemplatesRequest.offset)
            && Objects.equals(this.limit, listDeviceTemplatesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, name, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceTemplatesRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
