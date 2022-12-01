package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新应用部署部分参数
 */
public class DeploymentPatchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch")

    private Patch patch;

    public DeploymentPatchRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 技能版本，可选，当下发的技能版本和当前部署的版本不一致的时候，根据技能模板参数更新部署
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DeploymentPatchRequest withPatch(Patch patch) {
        this.patch = patch;
        return this;
    }

    public DeploymentPatchRequest withPatch(Consumer<Patch> patchSetter) {
        if (this.patch == null) {
            this.patch = new Patch();
            patchSetter.accept(this.patch);
        }

        return this;
    }

    /**
     * Get patch
     * @return patch
     */
    public Patch getPatch() {
        return patch;
    }

    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentPatchRequest deploymentPatchRequest = (DeploymentPatchRequest) o;
        return Objects.equals(this.version, deploymentPatchRequest.version)
            && Objects.equals(this.patch, deploymentPatchRequest.patch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, patch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentPatchRequest {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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
