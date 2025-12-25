package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateVpcepServiceInfo
 */
public class UpdateVpcepServiceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private VpcServiceType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_address")

    private String vpcEndpointAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_id")

    private String vpcEndpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_service_id")

    private String vpcEndpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public UpdateVpcepServiceInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public UpdateVpcepServiceInfo withType(VpcServiceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public VpcServiceType getType() {
        return type;
    }

    public void setType(VpcServiceType type) {
        this.type = type;
    }

    public UpdateVpcepServiceInfo withVpcEndpointAddress(String vpcEndpointAddress) {
        this.vpcEndpointAddress = vpcEndpointAddress;
        return this;
    }

    /**
     * Vpc 端点地址
     * @return vpcEndpointAddress
     */
    public String getVpcEndpointAddress() {
        return vpcEndpointAddress;
    }

    public void setVpcEndpointAddress(String vpcEndpointAddress) {
        this.vpcEndpointAddress = vpcEndpointAddress;
    }

    public UpdateVpcepServiceInfo withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * Vpc 端点ID
     * @return vpcEndpointId
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    public UpdateVpcepServiceInfo withVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
        return this;
    }

    /**
     * Vpc端点服务ID
     * @return vpcEndpointServiceId
     */
    public String getVpcEndpointServiceId() {
        return vpcEndpointServiceId;
    }

    public void setVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
    }

    public UpdateVpcepServiceInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * UUID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVpcepServiceInfo that = (UpdateVpcepServiceInfo) obj;
        return Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.vpcEndpointAddress, that.vpcEndpointAddress)
            && Objects.equals(this.vpcEndpointId, that.vpcEndpointId)
            && Objects.equals(this.vpcEndpointServiceId, that.vpcEndpointServiceId)
            && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, type, vpcEndpointAddress, vpcEndpointId, vpcEndpointServiceId, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcepServiceInfo {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcEndpointAddress: ").append(toIndentedString(vpcEndpointAddress)).append("\n");
        sb.append("    vpcEndpointId: ").append(toIndentedString(vpcEndpointId)).append("\n");
        sb.append("    vpcEndpointServiceId: ").append(toIndentedString(vpcEndpointServiceId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
