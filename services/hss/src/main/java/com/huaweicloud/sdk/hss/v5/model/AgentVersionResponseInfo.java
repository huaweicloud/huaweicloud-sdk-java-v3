package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * agent版本信息详情列表
 */
public class AgentVersionResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_list")

    private List<VersionList> versionList = null;

    public AgentVersionResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。   - Linux ：Linux。   - Windows ：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public AgentVersionResponseInfo withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 最新版本的版本号
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public AgentVersionResponseInfo withVersionList(List<VersionList> versionList) {
        this.versionList = versionList;
        return this;
    }

    public AgentVersionResponseInfo addVersionListItem(VersionList versionListItem) {
        if (this.versionList == null) {
            this.versionList = new ArrayList<>();
        }
        this.versionList.add(versionListItem);
        return this;
    }

    public AgentVersionResponseInfo withVersionList(Consumer<List<VersionList>> versionListSetter) {
        if (this.versionList == null) {
            this.versionList = new ArrayList<>();
        }
        versionListSetter.accept(this.versionList);
        return this;
    }

    /**
     * 最新若干版本的版本号和版本说明
     * @return versionList
     */
    public List<VersionList> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<VersionList> versionList) {
        this.versionList = versionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentVersionResponseInfo that = (AgentVersionResponseInfo) obj;
        return Objects.equals(this.osType, that.osType) && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.versionList, that.versionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osType, latestVersion, versionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentVersionResponseInfo {\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    versionList: ").append(toIndentedString(versionList)).append("\n");
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
