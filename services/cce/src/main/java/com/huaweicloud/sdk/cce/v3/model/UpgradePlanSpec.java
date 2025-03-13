package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradePlanSpec
 */
public class UpgradePlanSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterVersion")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersion")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notBefore")

    private String notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notAfter")

    private String notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notBeforeDeadline")

    private String notBeforeDeadline;

    public UpgradePlanSpec withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * 集群ID
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public UpgradePlanSpec withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * 当前集群版本
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public UpgradePlanSpec withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 本次集群升级的目标版本
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public UpgradePlanSpec withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 自动升级计划的最早时间（UTC时间），需要早于notBeforeDeadline
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public UpgradePlanSpec withNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * 自动升级计划的最晚时间（UTC时间）
     * @return notAfter
     */
    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    public UpgradePlanSpec withNotBeforeDeadline(String notBeforeDeadline) {
        this.notBeforeDeadline = notBeforeDeadline;
        return this;
    }

    /**
     * 自动升级计划开始的截止时间（UTC时间）
     * @return notBeforeDeadline
     */
    public String getNotBeforeDeadline() {
        return notBeforeDeadline;
    }

    public void setNotBeforeDeadline(String notBeforeDeadline) {
        this.notBeforeDeadline = notBeforeDeadline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradePlanSpec that = (UpgradePlanSpec) obj;
        return Objects.equals(this.clusterID, that.clusterID)
            && Objects.equals(this.clusterVersion, that.clusterVersion)
            && Objects.equals(this.targetVersion, that.targetVersion) && Objects.equals(this.notBefore, that.notBefore)
            && Objects.equals(this.notAfter, that.notAfter)
            && Objects.equals(this.notBeforeDeadline, that.notBeforeDeadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID, clusterVersion, targetVersion, notBefore, notAfter, notBeforeDeadline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradePlanSpec {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    notBeforeDeadline: ").append(toIndentedString(notBeforeDeadline)).append("\n");
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
