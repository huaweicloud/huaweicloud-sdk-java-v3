package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库版本信息。
 */
public class InstanceDatabaseVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_kernel_version")

    private String currentKernelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_kernel_version")

    private String latestKernelVersion;

    public InstanceDatabaseVersionInfo withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 当前数据库版本。
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public InstanceDatabaseVersionInfo withCurrentKernelVersion(String currentKernelVersion) {
        this.currentKernelVersion = currentKernelVersion;
        return this;
    }

    /**
     * 当前数据库内核版本。
     * @return currentKernelVersion
     */
    public String getCurrentKernelVersion() {
        return currentKernelVersion;
    }

    public void setCurrentKernelVersion(String currentKernelVersion) {
        this.currentKernelVersion = currentKernelVersion;
    }

    public InstanceDatabaseVersionInfo withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 最新数据库版本。
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public InstanceDatabaseVersionInfo withLatestKernelVersion(String latestKernelVersion) {
        this.latestKernelVersion = latestKernelVersion;
        return this;
    }

    /**
     * 最新数据库内核版本。
     * @return latestKernelVersion
     */
    public String getLatestKernelVersion() {
        return latestKernelVersion;
    }

    public void setLatestKernelVersion(String latestKernelVersion) {
        this.latestKernelVersion = latestKernelVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDatabaseVersionInfo that = (InstanceDatabaseVersionInfo) obj;
        return Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.currentKernelVersion, that.currentKernelVersion)
            && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.latestKernelVersion, that.latestKernelVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentVersion, currentKernelVersion, latestVersion, latestKernelVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDatabaseVersionInfo {\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    currentKernelVersion: ").append(toIndentedString(currentKernelVersion)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    latestKernelVersion: ").append(toIndentedString(latestKernelVersion)).append("\n");
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
