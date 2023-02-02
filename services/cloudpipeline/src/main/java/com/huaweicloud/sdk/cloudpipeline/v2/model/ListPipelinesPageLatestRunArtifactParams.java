package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 制品源参数
 */
public class ListPipelinesPageLatestRunArtifactParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_filter")

    private String branchFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    public ListPipelinesPageLatestRunArtifactParams withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 包版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListPipelinesPageLatestRunArtifactParams withBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
        return this;
    }

    /**
     * 过滤分支
     * @return branchFilter
     */
    public String getBranchFilter() {
        return branchFilter;
    }

    public void setBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
    }

    public ListPipelinesPageLatestRunArtifactParams withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 包名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ListPipelinesPageLatestRunArtifactParams withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * docker组织
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPipelinesPageLatestRunArtifactParams listPipelinesPageLatestRunArtifactParams =
            (ListPipelinesPageLatestRunArtifactParams) o;
        return Objects.equals(this.version, listPipelinesPageLatestRunArtifactParams.version)
            && Objects.equals(this.branchFilter, listPipelinesPageLatestRunArtifactParams.branchFilter)
            && Objects.equals(this.packageName, listPipelinesPageLatestRunArtifactParams.packageName)
            && Objects.equals(this.organization, listPipelinesPageLatestRunArtifactParams.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, branchFilter, packageName, organization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelinesPageLatestRunArtifactParams {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    branchFilter: ").append(toIndentedString(branchFilter)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
