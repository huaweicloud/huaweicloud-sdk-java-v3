package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListPropertiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_id")

    private Integer propertyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_name")

    private String propertyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListPropertiesRequest withInstanceId(String instanceId) {
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

    public ListPropertiesRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /** 服务ID
     * 
     * @return serviceId */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ListPropertiesRequest withLimit(Integer limit) {
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

    public ListPropertiesRequest withPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /** 属性ID minimum: 1 maximum: 999999999999999999
     * 
     * @return propertyId */
    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public ListPropertiesRequest withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /** 属性名称
     * 
     * @return propertyName */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public ListPropertiesRequest withOffset(Integer offset) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPropertiesRequest listPropertiesRequest = (ListPropertiesRequest) o;
        return Objects.equals(this.instanceId, listPropertiesRequest.instanceId)
            && Objects.equals(this.serviceId, listPropertiesRequest.serviceId)
            && Objects.equals(this.limit, listPropertiesRequest.limit)
            && Objects.equals(this.propertyId, listPropertiesRequest.propertyId)
            && Objects.equals(this.propertyName, listPropertiesRequest.propertyName)
            && Objects.equals(this.offset, listPropertiesRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, serviceId, limit, propertyId, propertyName, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPropertiesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
