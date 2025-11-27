package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FederationVersionInfo
 */
public class FederationVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentVersion")

    private FederationVersionSpec currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersions")

    private List<FederationVersionSpec> targetVersions = null;

    public FederationVersionInfo withCurrentVersion(FederationVersionSpec currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public FederationVersionInfo withCurrentVersion(Consumer<FederationVersionSpec> currentVersionSetter) {
        if (this.currentVersion == null) {
            this.currentVersion = new FederationVersionSpec();
            currentVersionSetter.accept(this.currentVersion);
        }

        return this;
    }

    /**
     * Get currentVersion
     * @return currentVersion
     */
    public FederationVersionSpec getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(FederationVersionSpec currentVersion) {
        this.currentVersion = currentVersion;
    }

    public FederationVersionInfo withTargetVersions(List<FederationVersionSpec> targetVersions) {
        this.targetVersions = targetVersions;
        return this;
    }

    public FederationVersionInfo addTargetVersionsItem(FederationVersionSpec targetVersionsItem) {
        if (this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        this.targetVersions.add(targetVersionsItem);
        return this;
    }

    public FederationVersionInfo withTargetVersions(Consumer<List<FederationVersionSpec>> targetVersionsSetter) {
        if (this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        targetVersionsSetter.accept(this.targetVersions);
        return this;
    }

    /**
     * 目标联邦版本列表
     * @return targetVersions
     */
    public List<FederationVersionSpec> getTargetVersions() {
        return targetVersions;
    }

    public void setTargetVersions(List<FederationVersionSpec> targetVersions) {
        this.targetVersions = targetVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FederationVersionInfo that = (FederationVersionInfo) obj;
        return Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.targetVersions, that.targetVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentVersion, targetVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FederationVersionInfo {\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    targetVersions: ").append(toIndentedString(targetVersions)).append("\n");
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
