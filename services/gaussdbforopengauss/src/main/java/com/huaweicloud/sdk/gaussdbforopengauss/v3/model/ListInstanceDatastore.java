package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库信息。
 */
public class ListInstanceDatastore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_version")

    private String completeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_kernel_version")

    private String completeKernelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_version_infos")

    private List<HotfixVersionInfo> hotfixVersionInfos = null;

    public ListInstanceDatastore withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库引擎。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListInstanceDatastore withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库大版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListInstanceDatastore withCompleteVersion(String completeVersion) {
        this.completeVersion = completeVersion;
        return this;
    }

    /**
     * 数据库小版本。
     * @return completeVersion
     */
    public String getCompleteVersion() {
        return completeVersion;
    }

    public void setCompleteVersion(String completeVersion) {
        this.completeVersion = completeVersion;
    }

    public ListInstanceDatastore withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 数据库正在升级的目标版本。
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public ListInstanceDatastore withCompleteKernelVersion(String completeKernelVersion) {
        this.completeKernelVersion = completeKernelVersion;
        return this;
    }

    /**
     * 数据库内核版本
     * @return completeKernelVersion
     */
    public String getCompleteKernelVersion() {
        return completeKernelVersion;
    }

    public void setCompleteKernelVersion(String completeKernelVersion) {
        this.completeKernelVersion = completeKernelVersion;
    }

    public ListInstanceDatastore withHotfixVersionInfos(List<HotfixVersionInfo> hotfixVersionInfos) {
        this.hotfixVersionInfos = hotfixVersionInfos;
        return this;
    }

    public ListInstanceDatastore addHotfixVersionInfosItem(HotfixVersionInfo hotfixVersionInfosItem) {
        if (this.hotfixVersionInfos == null) {
            this.hotfixVersionInfos = new ArrayList<>();
        }
        this.hotfixVersionInfos.add(hotfixVersionInfosItem);
        return this;
    }

    public ListInstanceDatastore withHotfixVersionInfos(Consumer<List<HotfixVersionInfo>> hotfixVersionInfosSetter) {
        if (this.hotfixVersionInfos == null) {
            this.hotfixVersionInfos = new ArrayList<>();
        }
        hotfixVersionInfosSetter.accept(this.hotfixVersionInfos);
        return this;
    }

    /**
     * 热补丁信息列表
     * @return hotfixVersionInfos
     */
    public List<HotfixVersionInfo> getHotfixVersionInfos() {
        return hotfixVersionInfos;
    }

    public void setHotfixVersionInfos(List<HotfixVersionInfo> hotfixVersionInfos) {
        this.hotfixVersionInfos = hotfixVersionInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceDatastore that = (ListInstanceDatastore) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.completeVersion, that.completeVersion)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.completeKernelVersion, that.completeKernelVersion)
            && Objects.equals(this.hotfixVersionInfos, that.hotfixVersionInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, completeVersion, targetVersion, completeKernelVersion, hotfixVersionInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceDatastore {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    completeVersion: ").append(toIndentedString(completeVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    completeKernelVersion: ").append(toIndentedString(completeKernelVersion)).append("\n");
        sb.append("    hotfixVersionInfos: ").append(toIndentedString(hotfixVersionInfos)).append("\n");
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
