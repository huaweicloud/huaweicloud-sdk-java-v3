package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * lb状态树的主机组的主机状态信息
 */
public class LoadBalancerStatusMember  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_port")
    
    private Integer protocolPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;

    public LoadBalancerStatusMember withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * provisioning的状态。 可以为：ACTIVE、PENDING_CREATE 或者ERROR。 说明：该字段为预留字段，暂未启用，默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    

    public LoadBalancerStatusMember withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 后端服务器ip。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public LoadBalancerStatusMember withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    


    /**
     * 后端协议号。 取值范围[1, 65535]。
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    

    public LoadBalancerStatusMember withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 后端服务器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public LoadBalancerStatusMember withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 操作状态。 可以为：ONLINE、OFFLINE、DEGRADED、DISABLED或NO_MONITOR。默认为ONLINE。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadBalancerStatusMember loadBalancerStatusMember = (LoadBalancerStatusMember) o;
        return Objects.equals(this.provisioningStatus, loadBalancerStatusMember.provisioningStatus) &&
            Objects.equals(this.address, loadBalancerStatusMember.address) &&
            Objects.equals(this.protocolPort, loadBalancerStatusMember.protocolPort) &&
            Objects.equals(this.id, loadBalancerStatusMember.id) &&
            Objects.equals(this.operatingStatus, loadBalancerStatusMember.operatingStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(provisioningStatus, address, protocolPort, id, operatingStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerStatusMember {\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
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

