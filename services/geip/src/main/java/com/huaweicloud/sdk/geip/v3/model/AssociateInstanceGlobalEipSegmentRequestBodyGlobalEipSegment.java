package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 请求对象
 */
public class AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    public AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 支持绑定的实例类型
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment that =
            (AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.serviceType, that.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, instanceType, instanceId, projectId, serviceId, serviceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateInstanceGlobalEipSegmentRequestBodyGlobalEipSegment {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
