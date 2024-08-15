package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PatchDetail
 */
public class PatchDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_time")

    private Long installedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_baseline_id")

    private String patchBaselineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_baseline_name")

    private String patchBaselineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_status")

    private String patchStatus;

    public PatchDetail withInstalledTime(Long installedTime) {
        this.installedTime = installedTime;
        return this;
    }

    /**
     * 安装时间
     * @return installedTime
     */
    public Long getInstalledTime() {
        return installedTime;
    }

    public void setInstalledTime(Long installedTime) {
        this.installedTime = installedTime;
    }

    public PatchDetail withPatchBaselineId(String patchBaselineId) {
        this.patchBaselineId = patchBaselineId;
        return this;
    }

    /**
     * 补丁基线id
     * @return patchBaselineId
     */
    public String getPatchBaselineId() {
        return patchBaselineId;
    }

    public void setPatchBaselineId(String patchBaselineId) {
        this.patchBaselineId = patchBaselineId;
    }

    public PatchDetail withPatchBaselineName(String patchBaselineName) {
        this.patchBaselineName = patchBaselineName;
        return this;
    }

    /**
     * 补丁基线名称
     * @return patchBaselineName
     */
    public String getPatchBaselineName() {
        return patchBaselineName;
    }

    public void setPatchBaselineName(String patchBaselineName) {
        this.patchBaselineName = patchBaselineName;
    }

    public PatchDetail withPatchStatus(String patchStatus) {
        this.patchStatus = patchStatus;
        return this;
    }

    /**
     * 补丁状态
     * @return patchStatus
     */
    public String getPatchStatus() {
        return patchStatus;
    }

    public void setPatchStatus(String patchStatus) {
        this.patchStatus = patchStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PatchDetail that = (PatchDetail) obj;
        return Objects.equals(this.installedTime, that.installedTime)
            && Objects.equals(this.patchBaselineId, that.patchBaselineId)
            && Objects.equals(this.patchBaselineName, that.patchBaselineName)
            && Objects.equals(this.patchStatus, that.patchStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(installedTime, patchBaselineId, patchBaselineName, patchStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchDetail {\n");
        sb.append("    installedTime: ").append(toIndentedString(installedTime)).append("\n");
        sb.append("    patchBaselineId: ").append(toIndentedString(patchBaselineId)).append("\n");
        sb.append("    patchBaselineName: ").append(toIndentedString(patchBaselineName)).append("\n");
        sb.append("    patchStatus: ").append(toIndentedString(patchStatus)).append("\n");
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
