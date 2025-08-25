package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudServiceInfo
 */
public class CloudServiceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_num")

    private Integer serviceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_num")

    private Integer resourceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_distribution")

    private ResourceDistribution resourceDistribution;

    public CloudServiceInfo withServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
        return this;
    }

    /**
     * 当前租户开通的云原生密码服务数量（只统计白名单服务情况）
     * @return serviceNum
     */
    public Integer getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
    }

    public CloudServiceInfo withResourceNum(Integer resourceNum) {
        this.resourceNum = resourceNum;
        return this;
    }

    /**
     * 当前租户云原生密码服务的资源实例总和
     * @return resourceNum
     */
    public Integer getResourceNum() {
        return resourceNum;
    }

    public void setResourceNum(Integer resourceNum) {
        this.resourceNum = resourceNum;
    }

    public CloudServiceInfo withResourceDistribution(ResourceDistribution resourceDistribution) {
        this.resourceDistribution = resourceDistribution;
        return this;
    }

    public CloudServiceInfo withResourceDistribution(Consumer<ResourceDistribution> resourceDistributionSetter) {
        if (this.resourceDistribution == null) {
            this.resourceDistribution = new ResourceDistribution();
            resourceDistributionSetter.accept(this.resourceDistribution);
        }

        return this;
    }

    /**
     * Get resourceDistribution
     * @return resourceDistribution
     */
    public ResourceDistribution getResourceDistribution() {
        return resourceDistribution;
    }

    public void setResourceDistribution(ResourceDistribution resourceDistribution) {
        this.resourceDistribution = resourceDistribution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudServiceInfo that = (CloudServiceInfo) obj;
        return Objects.equals(this.serviceNum, that.serviceNum) && Objects.equals(this.resourceNum, that.resourceNum)
            && Objects.equals(this.resourceDistribution, that.resourceDistribution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceNum, resourceNum, resourceDistribution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudServiceInfo {\n");
        sb.append("    serviceNum: ").append(toIndentedString(serviceNum)).append("\n");
        sb.append("    resourceNum: ").append(toIndentedString(resourceNum)).append("\n");
        sb.append("    resourceDistribution: ").append(toIndentedString(resourceDistribution)).append("\n");
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
