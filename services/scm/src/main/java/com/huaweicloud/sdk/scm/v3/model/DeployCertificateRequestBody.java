package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeployCertificateRequestBody
 */
public class DeployCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<DeployedResource> resources = null;

    public DeployCertificateRequestBody withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 部署的资源所在的项目名称，若在主项目下，则该值为region id，CDN支持区域固定为：Global。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public DeployCertificateRequestBody withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 证书部署到资源的目标服务，当前仅支持：CDN、WAF、ELB。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public DeployCertificateRequestBody withResources(List<DeployedResource> resources) {
        this.resources = resources;
        return this;
    }

    public DeployCertificateRequestBody addResourcesItem(DeployedResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public DeployCertificateRequestBody withResources(Consumer<List<DeployedResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 所要部署的资源列表。
     * @return resources
     */
    public List<DeployedResource> getResources() {
        return resources;
    }

    public void setResources(List<DeployedResource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployCertificateRequestBody that = (DeployCertificateRequestBody) obj;
        return Objects.equals(this.projectName, that.projectName) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName, serviceName, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployCertificateRequestBody {\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
