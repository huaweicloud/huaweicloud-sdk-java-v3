package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 版本信息
 */
public class UpgradeVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release")

    private String release;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch")

    private String patch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestPatch")

    private String suggestPatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersions")

    private List<String> targetVersions = null;

    public UpgradeVersionInfo withRelease(String release) {
        this.release = release;
        return this;
    }

    /**
     * 正式版本号，如：v1.19.10
     * @return release
     */
    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public UpgradeVersionInfo withPatch(String patch) {
        this.patch = patch;
        return this;
    }

    /**
     * 补丁版本号，如r0
     * @return patch
     */
    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public UpgradeVersionInfo withSuggestPatch(String suggestPatch) {
        this.suggestPatch = suggestPatch;
        return this;
    }

    /**
     * 推荐升级的目标补丁版本号，如r0
     * @return suggestPatch
     */
    public String getSuggestPatch() {
        return suggestPatch;
    }

    public void setSuggestPatch(String suggestPatch) {
        this.suggestPatch = suggestPatch;
    }

    public UpgradeVersionInfo withTargetVersions(List<String> targetVersions) {
        this.targetVersions = targetVersions;
        return this;
    }

    public UpgradeVersionInfo addTargetVersionsItem(String targetVersionsItem) {
        if (this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        this.targetVersions.add(targetVersionsItem);
        return this;
    }

    public UpgradeVersionInfo withTargetVersions(Consumer<List<String>> targetVersionsSetter) {
        if (this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        targetVersionsSetter.accept(this.targetVersions);
        return this;
    }

    /**
     * 升级目标版本集合
     * @return targetVersions
     */
    public List<String> getTargetVersions() {
        return targetVersions;
    }

    public void setTargetVersions(List<String> targetVersions) {
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
        UpgradeVersionInfo that = (UpgradeVersionInfo) obj;
        return Objects.equals(this.release, that.release) && Objects.equals(this.patch, that.patch)
            && Objects.equals(this.suggestPatch, that.suggestPatch)
            && Objects.equals(this.targetVersions, that.targetVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(release, patch, suggestPatch, targetVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeVersionInfo {\n");
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
        sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
        sb.append("    suggestPatch: ").append(toIndentedString(suggestPatch)).append("\n");
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
