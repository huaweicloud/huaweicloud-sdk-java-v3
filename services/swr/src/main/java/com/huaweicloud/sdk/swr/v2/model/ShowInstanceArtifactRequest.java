package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowInstanceArtifactRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private String reference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_scan_overview")

    private Boolean withScanOverview;

    public ShowInstanceArtifactRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowInstanceArtifactRequest withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名称
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public ShowInstanceArtifactRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * 制品名称
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public ShowInstanceArtifactRequest withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 制品摘要
     * @return reference
     */
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public ShowInstanceArtifactRequest withWithScanOverview(Boolean withScanOverview) {
        this.withScanOverview = withScanOverview;
        return this;
    }

    /**
     * 是否返回制品扫描摘要
     * @return withScanOverview
     */
    public Boolean getWithScanOverview() {
        return withScanOverview;
    }

    public void setWithScanOverview(Boolean withScanOverview) {
        this.withScanOverview = withScanOverview;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceArtifactRequest that = (ShowInstanceArtifactRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.repositoryName, that.repositoryName)
            && Objects.equals(this.reference, that.reference)
            && Objects.equals(this.withScanOverview, that.withScanOverview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, namespaceName, repositoryName, reference, withScanOverview);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceArtifactRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    withScanOverview: ").append(toIndentedString(withScanOverview)).append("\n");
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
