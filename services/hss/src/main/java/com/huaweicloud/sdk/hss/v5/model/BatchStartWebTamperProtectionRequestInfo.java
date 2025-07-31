package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 开启网页防篡改防护信息
 */
public class BatchStartWebTamperProtectionRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagInfo> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_dir_info")

    private WebTamperProtectDirRequestInfo protectDirInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_timing_off")

    private Boolean enableTimingOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timing_off_config_info")

    private WebTamperTimingOffConfigInfoRequestInfo timingOffConfigInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_rasp_protect")

    private Boolean enableRaspProtect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_path")

    private String raspPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_privileged_process")

    private Boolean enablePrivilegedProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_process_info")

    private WebTamperPrivilegedProcessRequestInfo privilegedProcessInfo;

    public BatchStartWebTamperProtectionRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public BatchStartWebTamperProtectionRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public BatchStartWebTamperProtectionRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 主机ID数组，不能为空
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public BatchStartWebTamperProtectionRequestInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchStartWebTamperProtectionRequestInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式   - packet_cycle: 包周期
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public BatchStartWebTamperProtectionRequestInfo withTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public BatchStartWebTamperProtectionRequestInfo addTagsItem(TagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchStartWebTamperProtectionRequestInfo withTags(Consumer<List<TagInfo>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表
     * @return tags
     */
    public List<TagInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    public BatchStartWebTamperProtectionRequestInfo withProtectDirInfo(WebTamperProtectDirRequestInfo protectDirInfo) {
        this.protectDirInfo = protectDirInfo;
        return this;
    }

    public BatchStartWebTamperProtectionRequestInfo withProtectDirInfo(
        Consumer<WebTamperProtectDirRequestInfo> protectDirInfoSetter) {
        if (this.protectDirInfo == null) {
            this.protectDirInfo = new WebTamperProtectDirRequestInfo();
            protectDirInfoSetter.accept(this.protectDirInfo);
        }

        return this;
    }

    /**
     * Get protectDirInfo
     * @return protectDirInfo
     */
    public WebTamperProtectDirRequestInfo getProtectDirInfo() {
        return protectDirInfo;
    }

    public void setProtectDirInfo(WebTamperProtectDirRequestInfo protectDirInfo) {
        this.protectDirInfo = protectDirInfo;
    }

    public BatchStartWebTamperProtectionRequestInfo withEnableTimingOff(Boolean enableTimingOff) {
        this.enableTimingOff = enableTimingOff;
        return this;
    }

    /**
     * 定时开关状态
     * @return enableTimingOff
     */
    public Boolean getEnableTimingOff() {
        return enableTimingOff;
    }

    public void setEnableTimingOff(Boolean enableTimingOff) {
        this.enableTimingOff = enableTimingOff;
    }

    public BatchStartWebTamperProtectionRequestInfo withTimingOffConfigInfo(
        WebTamperTimingOffConfigInfoRequestInfo timingOffConfigInfo) {
        this.timingOffConfigInfo = timingOffConfigInfo;
        return this;
    }

    public BatchStartWebTamperProtectionRequestInfo withTimingOffConfigInfo(
        Consumer<WebTamperTimingOffConfigInfoRequestInfo> timingOffConfigInfoSetter) {
        if (this.timingOffConfigInfo == null) {
            this.timingOffConfigInfo = new WebTamperTimingOffConfigInfoRequestInfo();
            timingOffConfigInfoSetter.accept(this.timingOffConfigInfo);
        }

        return this;
    }

    /**
     * Get timingOffConfigInfo
     * @return timingOffConfigInfo
     */
    public WebTamperTimingOffConfigInfoRequestInfo getTimingOffConfigInfo() {
        return timingOffConfigInfo;
    }

    public void setTimingOffConfigInfo(WebTamperTimingOffConfigInfoRequestInfo timingOffConfigInfo) {
        this.timingOffConfigInfo = timingOffConfigInfo;
    }

    public BatchStartWebTamperProtectionRequestInfo withEnableRaspProtect(Boolean enableRaspProtect) {
        this.enableRaspProtect = enableRaspProtect;
        return this;
    }

    /**
     * 动态网页防篡改开启状态
     * @return enableRaspProtect
     */
    public Boolean getEnableRaspProtect() {
        return enableRaspProtect;
    }

    public void setEnableRaspProtect(Boolean enableRaspProtect) {
        this.enableRaspProtect = enableRaspProtect;
    }

    public BatchStartWebTamperProtectionRequestInfo withRaspPath(String raspPath) {
        this.raspPath = raspPath;
        return this;
    }

    /**
     * rasp path
     * @return raspPath
     */
    public String getRaspPath() {
        return raspPath;
    }

    public void setRaspPath(String raspPath) {
        this.raspPath = raspPath;
    }

    public BatchStartWebTamperProtectionRequestInfo withEnablePrivilegedProcess(Boolean enablePrivilegedProcess) {
        this.enablePrivilegedProcess = enablePrivilegedProcess;
        return this;
    }

    /**
     * 特权进程状态
     * @return enablePrivilegedProcess
     */
    public Boolean getEnablePrivilegedProcess() {
        return enablePrivilegedProcess;
    }

    public void setEnablePrivilegedProcess(Boolean enablePrivilegedProcess) {
        this.enablePrivilegedProcess = enablePrivilegedProcess;
    }

    public BatchStartWebTamperProtectionRequestInfo withPrivilegedProcessInfo(
        WebTamperPrivilegedProcessRequestInfo privilegedProcessInfo) {
        this.privilegedProcessInfo = privilegedProcessInfo;
        return this;
    }

    public BatchStartWebTamperProtectionRequestInfo withPrivilegedProcessInfo(
        Consumer<WebTamperPrivilegedProcessRequestInfo> privilegedProcessInfoSetter) {
        if (this.privilegedProcessInfo == null) {
            this.privilegedProcessInfo = new WebTamperPrivilegedProcessRequestInfo();
            privilegedProcessInfoSetter.accept(this.privilegedProcessInfo);
        }

        return this;
    }

    /**
     * Get privilegedProcessInfo
     * @return privilegedProcessInfo
     */
    public WebTamperPrivilegedProcessRequestInfo getPrivilegedProcessInfo() {
        return privilegedProcessInfo;
    }

    public void setPrivilegedProcessInfo(WebTamperPrivilegedProcessRequestInfo privilegedProcessInfo) {
        this.privilegedProcessInfo = privilegedProcessInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchStartWebTamperProtectionRequestInfo that = (BatchStartWebTamperProtectionRequestInfo) obj;
        return Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.protectDirInfo, that.protectDirInfo)
            && Objects.equals(this.enableTimingOff, that.enableTimingOff)
            && Objects.equals(this.timingOffConfigInfo, that.timingOffConfigInfo)
            && Objects.equals(this.enableRaspProtect, that.enableRaspProtect)
            && Objects.equals(this.raspPath, that.raspPath)
            && Objects.equals(this.enablePrivilegedProcess, that.enablePrivilegedProcess)
            && Objects.equals(this.privilegedProcessInfo, that.privilegedProcessInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIdList,
            resourceId,
            chargingMode,
            tags,
            protectDirInfo,
            enableTimingOff,
            timingOffConfigInfo,
            enableRaspProtect,
            raspPath,
            enablePrivilegedProcess,
            privilegedProcessInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartWebTamperProtectionRequestInfo {\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    protectDirInfo: ").append(toIndentedString(protectDirInfo)).append("\n");
        sb.append("    enableTimingOff: ").append(toIndentedString(enableTimingOff)).append("\n");
        sb.append("    timingOffConfigInfo: ").append(toIndentedString(timingOffConfigInfo)).append("\n");
        sb.append("    enableRaspProtect: ").append(toIndentedString(enableRaspProtect)).append("\n");
        sb.append("    raspPath: ").append(toIndentedString(raspPath)).append("\n");
        sb.append("    enablePrivilegedProcess: ").append(toIndentedString(enablePrivilegedProcess)).append("\n");
        sb.append("    privilegedProcessInfo: ").append(toIndentedString(privilegedProcessInfo)).append("\n");
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
