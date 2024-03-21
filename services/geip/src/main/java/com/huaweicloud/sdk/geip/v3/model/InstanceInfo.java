package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceInfo
 */
public class InstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quarkVpcEndpoint")

    private String quarkVpcEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_site")

    private String instanceSite;

    public InstanceInfo withRegion(String region) {
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

    public InstanceInfo withQuarkVpcEndpoint(String quarkVpcEndpoint) {
        this.quarkVpcEndpoint = quarkVpcEndpoint;
        return this;
    }

    /**
     * quark后端地址
     * @return quarkVpcEndpoint
     */
    public String getQuarkVpcEndpoint() {
        return quarkVpcEndpoint;
    }

    public void setQuarkVpcEndpoint(String quarkVpcEndpoint) {
        this.quarkVpcEndpoint = quarkVpcEndpoint;
    }

    public InstanceInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，获取项目ID请参见[获取项目ID](https://support.huaweicloud.com/api-vpc/vpc_api_0011.html)
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public InstanceInfo withInstanceType(String instanceType) {
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

    public InstanceInfo withInstanceId(String instanceId) {
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

    public InstanceInfo withServiceType(String serviceType) {
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

    public InstanceInfo withServiceId(String serviceId) {
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

    public InstanceInfo withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * - 功能说明：表示中心站点资源或者边缘站点资源 - 取值范围：center、边缘站点名称
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public InstanceInfo withInstanceSite(String instanceSite) {
        this.instanceSite = instanceSite;
        return this;
    }

    /**
     * 绑定实例所在的站点
     * @return instanceSite
     */
    public String getInstanceSite() {
        return instanceSite;
    }

    public void setInstanceSite(String instanceSite) {
        this.instanceSite = instanceSite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceInfo that = (InstanceInfo) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.quarkVpcEndpoint, that.quarkVpcEndpoint)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.instanceSite, that.instanceSite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            quarkVpcEndpoint,
            projectId,
            instanceType,
            instanceId,
            serviceType,
            serviceId,
            publicBorderGroup,
            instanceSite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceInfo {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    quarkVpcEndpoint: ").append(toIndentedString(quarkVpcEndpoint)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    instanceSite: ").append(toIndentedString(instanceSite)).append("\n");
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
