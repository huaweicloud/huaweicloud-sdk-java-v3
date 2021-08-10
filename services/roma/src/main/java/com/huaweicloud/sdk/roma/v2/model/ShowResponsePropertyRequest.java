package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowResponsePropertyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_id")

    private Integer commandId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_id")

    private Integer propertyId;

    public ShowResponsePropertyRequest withInstanceId(String instanceId) {
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

    public ShowResponsePropertyRequest withServiceId(String serviceId) {
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

    public ShowResponsePropertyRequest withCommandId(Integer commandId) {
        this.commandId = commandId;
        return this;
    }

    /** 命令ID minimum: 0 maximum: 200376420520689663
     * 
     * @return commandId */
    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }

    public ShowResponsePropertyRequest withPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /** 属性/请求属性/响应属性ID minimum: 0 maximum: 200376420520689663
     * 
     * @return propertyId */
    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResponsePropertyRequest showResponsePropertyRequest = (ShowResponsePropertyRequest) o;
        return Objects.equals(this.instanceId, showResponsePropertyRequest.instanceId)
            && Objects.equals(this.serviceId, showResponsePropertyRequest.serviceId)
            && Objects.equals(this.commandId, showResponsePropertyRequest.commandId)
            && Objects.equals(this.propertyId, showResponsePropertyRequest.propertyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, serviceId, commandId, propertyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResponsePropertyRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
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
