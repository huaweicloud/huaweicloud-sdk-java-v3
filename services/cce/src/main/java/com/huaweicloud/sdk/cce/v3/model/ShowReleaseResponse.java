package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowReleaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_name")

    private String chartName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_public")

    private Boolean chartPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_version")

    private String chartVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private String parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private String resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_description")

    private String statusDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private String values;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    public ShowReleaseResponse withChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }

    /**
     * 模板名称
     * @return chartName
     */
    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public ShowReleaseResponse withChartPublic(Boolean chartPublic) {
        this.chartPublic = chartPublic;
        return this;
    }

    /**
     * 是否公开模板
     * @return chartPublic
     */
    public Boolean getChartPublic() {
        return chartPublic;
    }

    public void setChartPublic(Boolean chartPublic) {
        this.chartPublic = chartPublic;
    }

    public ShowReleaseResponse withChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }

    /**
     * 模板版本
     * @return chartVersion
     */
    public String getChartVersion() {
        return chartVersion;
    }

    public void setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
    }

    public ShowReleaseResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowReleaseResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ShowReleaseResponse withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ShowReleaseResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板实例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowReleaseResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowReleaseResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 模板实例所在的命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowReleaseResponse withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 模板实例参数
     * @return parameters
     */
    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public ShowReleaseResponse withResources(String resources) {
        this.resources = resources;
        return this;
    }

    /**
     * 模板实例需要的资源
     * @return resources
     */
    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public ShowReleaseResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 模板实例状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowReleaseResponse withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    /**
     * 模板实例状态描述
     * @return statusDescription
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public ShowReleaseResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public ShowReleaseResponse withValues(String values) {
        this.values = values;
        return this;
    }

    /**
     * 模板实例的值
     * @return values
     */
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public ShowReleaseResponse withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 模板实例版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReleaseResponse that = (ShowReleaseResponse) obj;
        return Objects.equals(this.chartName, that.chartName) && Objects.equals(this.chartPublic, that.chartPublic)
            && Objects.equals(this.chartVersion, that.chartVersion) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusDescription, that.statusDescription)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.values, that.values)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chartName,
            chartPublic,
            chartVersion,
            clusterId,
            clusterName,
            createAt,
            description,
            name,
            namespace,
            parameters,
            resources,
            status,
            statusDescription,
            updateAt,
            values,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReleaseResponse {\n");
        sb.append("    chartName: ").append(toIndentedString(chartName)).append("\n");
        sb.append("    chartPublic: ").append(toIndentedString(chartPublic)).append("\n");
        sb.append("    chartVersion: ").append(toIndentedString(chartVersion)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
