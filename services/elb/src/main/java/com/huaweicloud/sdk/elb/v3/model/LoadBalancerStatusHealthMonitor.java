package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LB状态树的后端服务器组健康检查器状态信息。
 */
public class LoadBalancerStatusHealthMonitor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    public LoadBalancerStatusHealthMonitor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 协议类型。取值：TCP、UDP_CONNECT或HTTP。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LoadBalancerStatusHealthMonitor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 健康检查器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancerStatusHealthMonitor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 健康检查器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancerStatusHealthMonitor withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 健康检查器的配置状态。取值：ACTIVE表示使用中。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadBalancerStatusHealthMonitor loadBalancerStatusHealthMonitor = (LoadBalancerStatusHealthMonitor) o;
        return Objects.equals(this.type, loadBalancerStatusHealthMonitor.type)
            && Objects.equals(this.id, loadBalancerStatusHealthMonitor.id)
            && Objects.equals(this.name, loadBalancerStatusHealthMonitor.name)
            && Objects.equals(this.provisioningStatus, loadBalancerStatusHealthMonitor.provisioningStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, name, provisioningStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerStatusHealthMonitor {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
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
