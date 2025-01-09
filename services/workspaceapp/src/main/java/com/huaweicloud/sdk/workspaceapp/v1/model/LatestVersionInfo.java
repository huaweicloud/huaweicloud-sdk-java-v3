package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HDP最新版本信息。
 */
public class LatestVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hda_type")

    private String hdaType;

    public LatestVersionInfo withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 租户的HDP最新版本。
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public LatestVersionInfo withHdaType(String hdaType) {
        this.hdaType = hdaType;
        return this;
    }

    /**
     * HDA类型： * `SBC` - 非VDI下SBC类型 * `OA_APP` - VDI下非GPU类型 * `PT_APP` - VDI下GPU类型
     * @return hdaType
     */
    public String getHdaType() {
        return hdaType;
    }

    public void setHdaType(String hdaType) {
        this.hdaType = hdaType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatestVersionInfo that = (LatestVersionInfo) obj;
        return Objects.equals(this.latestVersion, that.latestVersion) && Objects.equals(this.hdaType, that.hdaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latestVersion, hdaType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LatestVersionInfo {\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    hdaType: ").append(toIndentedString(hdaType)).append("\n");
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
