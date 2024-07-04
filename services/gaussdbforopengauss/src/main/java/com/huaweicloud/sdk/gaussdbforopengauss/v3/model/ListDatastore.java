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
public class ListDatastore {

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
    @JsonProperty(value = "hotfix_versions")

    private String hotfixVersions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_finished_times")

    private List<String> hotfixFinishedTimes = null;

    public ListDatastore withType(String type) {
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

    public ListDatastore withVersion(String version) {
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

    public ListDatastore withCompleteVersion(String completeVersion) {
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

    public ListDatastore withHotfixVersions(String hotfixVersions) {
        this.hotfixVersions = hotfixVersions;
        return this;
    }

    /**
     * 数据库已升级的热补丁版本，当数据库热补丁升级成功后，该值不为空。
     * @return hotfixVersions
     */
    public String getHotfixVersions() {
        return hotfixVersions;
    }

    public void setHotfixVersions(String hotfixVersions) {
        this.hotfixVersions = hotfixVersions;
    }

    public ListDatastore withTargetVersion(String targetVersion) {
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

    public ListDatastore withHotfixFinishedTimes(List<String> hotfixFinishedTimes) {
        this.hotfixFinishedTimes = hotfixFinishedTimes;
        return this;
    }

    public ListDatastore addHotfixFinishedTimesItem(String hotfixFinishedTimesItem) {
        if (this.hotfixFinishedTimes == null) {
            this.hotfixFinishedTimes = new ArrayList<>();
        }
        this.hotfixFinishedTimes.add(hotfixFinishedTimesItem);
        return this;
    }

    public ListDatastore withHotfixFinishedTimes(Consumer<List<String>> hotfixFinishedTimesSetter) {
        if (this.hotfixFinishedTimes == null) {
            this.hotfixFinishedTimes = new ArrayList<>();
        }
        hotfixFinishedTimesSetter.accept(this.hotfixFinishedTimes);
        return this;
    }

    /**
     * 热补丁升级完成时间列表。  热补丁升级完成时间，格式为“yyyy-mm-dd hh:mm:ss timezone”。  其中timezone是指时区。 
     * @return hotfixFinishedTimes
     */
    public List<String> getHotfixFinishedTimes() {
        return hotfixFinishedTimes;
    }

    public void setHotfixFinishedTimes(List<String> hotfixFinishedTimes) {
        this.hotfixFinishedTimes = hotfixFinishedTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatastore that = (ListDatastore) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.completeVersion, that.completeVersion)
            && Objects.equals(this.hotfixVersions, that.hotfixVersions)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.hotfixFinishedTimes, that.hotfixFinishedTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, completeVersion, hotfixVersions, targetVersion, hotfixFinishedTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatastore {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    completeVersion: ").append(toIndentedString(completeVersion)).append("\n");
        sb.append("    hotfixVersions: ").append(toIndentedString(hotfixVersions)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    hotfixFinishedTimes: ").append(toIndentedString(hotfixFinishedTimes)).append("\n");
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
