package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 制品源参数。 **取值范围**： 不涉及。 
 */
public class PipelineLatestRunArtifactParams {

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

    public PipelineLatestRunArtifactParams withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 包版本。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PipelineLatestRunArtifactParams withBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
        return this;
    }

    /**
     * **参数解释**： 过滤分支。 **取值范围**： 不涉及。 
     * @return branchFilter
     */
    public String getBranchFilter() {
        return branchFilter;
    }

    public void setBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
    }

    public PipelineLatestRunArtifactParams withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * **参数解释**： 包名称。 **取值范围**： 不涉及。 
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public PipelineLatestRunArtifactParams withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * **参数解释**： docker组织。 **取值范围**： 不涉及。 
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineLatestRunArtifactParams that = (PipelineLatestRunArtifactParams) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.branchFilter, that.branchFilter)
            && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.organization, that.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, branchFilter, packageName, organization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineLatestRunArtifactParams {\n");
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
