package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WebTamperProtectionConfigResponseInfo
 */
public class WebTamperProtectionConfigResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_mode")

    private String protectMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_process")

    private Boolean monitorProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_process_list")

    private List<String> privilegedProcessList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_child")

    private Boolean privilegedChild;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_directory_info_list")

    private List<ProtectDirectoryResponseInfo> protectDirectoryInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_file_types")

    private List<String> excludeFileTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_container_nums")

    private Integer protectedContainerNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_event_nums")

    private Integer protectedEventNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_wtp_info")

    private WebTamperProtectionConfigResponseInfoContainerWtpInfo containerWtpInfo;

    public WebTamperProtectionConfigResponseInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 网页防篡改配置id **取值范围**: 字符长度1-64位 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WebTamperProtectionConfigResponseInfo withProtectMode(String protectMode) {
        this.protectMode = protectMode;
        return this;
    }

    /**
     * **参数解释**: 防护模式 **取值范围**: - alarm：告警模式 - block：拦截模式 
     * @return protectMode
     */
    public String getProtectMode() {
        return protectMode;
    }

    public void setProtectMode(String protectMode) {
        this.protectMode = protectMode;
    }

    public WebTamperProtectionConfigResponseInfo withMonitorProcess(Boolean monitorProcess) {
        this.monitorProcess = monitorProcess;
        return this;
    }

    /**
     * **参数解释**: 是否对篡改行为进行进程监控 **取值范围**: - true：监控篡改进程 - false：不监控篡改进程 
     * @return monitorProcess
     */
    public Boolean getMonitorProcess() {
        return monitorProcess;
    }

    public void setMonitorProcess(Boolean monitorProcess) {
        this.monitorProcess = monitorProcess;
    }

    public WebTamperProtectionConfigResponseInfo withPrivilegedProcessList(List<String> privilegedProcessList) {
        this.privilegedProcessList = privilegedProcessList;
        return this;
    }

    public WebTamperProtectionConfigResponseInfo addPrivilegedProcessListItem(String privilegedProcessListItem) {
        if (this.privilegedProcessList == null) {
            this.privilegedProcessList = new ArrayList<>();
        }
        this.privilegedProcessList.add(privilegedProcessListItem);
        return this;
    }

    public WebTamperProtectionConfigResponseInfo withPrivilegedProcessList(
        Consumer<List<String>> privilegedProcessListSetter) {
        if (this.privilegedProcessList == null) {
            this.privilegedProcessList = new ArrayList<>();
        }
        privilegedProcessListSetter.accept(this.privilegedProcessList);
        return this;
    }

    /**
     * **参数解释**: 特权进程路径列表 **取值范围**: 最少0条，最多10条 
     * @return privilegedProcessList
     */
    public List<String> getPrivilegedProcessList() {
        return privilegedProcessList;
    }

    public void setPrivilegedProcessList(List<String> privilegedProcessList) {
        this.privilegedProcessList = privilegedProcessList;
    }

    public WebTamperProtectionConfigResponseInfo withPrivilegedChild(Boolean privilegedChild) {
        this.privilegedChild = privilegedChild;
        return this;
    }

    /**
     * **参数解释**: 特权进程的子进程是否仍享有特权 **取值范围**: - true：特权进程的子进程依然是特权进程 - false：特权进程的子进程不再是特权进程 
     * @return privilegedChild
     */
    public Boolean getPrivilegedChild() {
        return privilegedChild;
    }

    public void setPrivilegedChild(Boolean privilegedChild) {
        this.privilegedChild = privilegedChild;
    }

    public WebTamperProtectionConfigResponseInfo withProtectDirectoryInfoList(
        List<ProtectDirectoryResponseInfo> protectDirectoryInfoList) {
        this.protectDirectoryInfoList = protectDirectoryInfoList;
        return this;
    }

    public WebTamperProtectionConfigResponseInfo addProtectDirectoryInfoListItem(
        ProtectDirectoryResponseInfo protectDirectoryInfoListItem) {
        if (this.protectDirectoryInfoList == null) {
            this.protectDirectoryInfoList = new ArrayList<>();
        }
        this.protectDirectoryInfoList.add(protectDirectoryInfoListItem);
        return this;
    }

    public WebTamperProtectionConfigResponseInfo withProtectDirectoryInfoList(
        Consumer<List<ProtectDirectoryResponseInfo>> protectDirectoryInfoListSetter) {
        if (this.protectDirectoryInfoList == null) {
            this.protectDirectoryInfoList = new ArrayList<>();
        }
        protectDirectoryInfoListSetter.accept(this.protectDirectoryInfoList);
        return this;
    }

    /**
     * **参数解释**： 防护目录信息 **取值范围**： 最少1条，最多50条 
     * @return protectDirectoryInfoList
     */
    public List<ProtectDirectoryResponseInfo> getProtectDirectoryInfoList() {
        return protectDirectoryInfoList;
    }

    public void setProtectDirectoryInfoList(List<ProtectDirectoryResponseInfo> protectDirectoryInfoList) {
        this.protectDirectoryInfoList = protectDirectoryInfoList;
    }

    public WebTamperProtectionConfigResponseInfo withExcludeFileTypes(List<String> excludeFileTypes) {
        this.excludeFileTypes = excludeFileTypes;
        return this;
    }

    public WebTamperProtectionConfigResponseInfo addExcludeFileTypesItem(String excludeFileTypesItem) {
        if (this.excludeFileTypes == null) {
            this.excludeFileTypes = new ArrayList<>();
        }
        this.excludeFileTypes.add(excludeFileTypesItem);
        return this;
    }

    public WebTamperProtectionConfigResponseInfo withExcludeFileTypes(Consumer<List<String>> excludeFileTypesSetter) {
        if (this.excludeFileTypes == null) {
            this.excludeFileTypes = new ArrayList<>();
        }
        excludeFileTypesSetter.accept(this.excludeFileTypes);
        return this;
    }

    /**
     * **参数解释**： 防护排除的文件类型列表 **取值范围**： 最少0条，最多10条 
     * @return excludeFileTypes
     */
    public List<String> getExcludeFileTypes() {
        return excludeFileTypes;
    }

    public void setExcludeFileTypes(List<String> excludeFileTypes) {
        this.excludeFileTypes = excludeFileTypes;
    }

    public WebTamperProtectionConfigResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 防护状态 **取值范围**: - not_protect：未防护 - protected：防护中 - partial_protected：部分防护 - protect_failed：防护失败 - redundant：防护冗余 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WebTamperProtectionConfigResponseInfo withProtectedContainerNums(Integer protectedContainerNums) {
        this.protectedContainerNums = protectedContainerNums;
        return this;
    }

    /**
     * **参数解释**: 防护中的容器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483547
     * @return protectedContainerNums
     */
    public Integer getProtectedContainerNums() {
        return protectedContainerNums;
    }

    public void setProtectedContainerNums(Integer protectedContainerNums) {
        this.protectedContainerNums = protectedContainerNums;
    }

    public WebTamperProtectionConfigResponseInfo withProtectedEventNums(Integer protectedEventNums) {
        this.protectedEventNums = protectedEventNums;
        return this;
    }

    /**
     * **参数解释**: 当前防护配置产生的防护事件数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483547
     * @return protectedEventNums
     */
    public Integer getProtectedEventNums() {
        return protectedEventNums;
    }

    public void setProtectedEventNums(Integer protectedEventNums) {
        this.protectedEventNums = protectedEventNums;
    }

    public WebTamperProtectionConfigResponseInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**: 防护配置绑定的配额id **取值范围**: 字符长度1-64位 
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public WebTamperProtectionConfigResponseInfo withContainerWtpInfo(
        WebTamperProtectionConfigResponseInfoContainerWtpInfo containerWtpInfo) {
        this.containerWtpInfo = containerWtpInfo;
        return this;
    }

    public WebTamperProtectionConfigResponseInfo withContainerWtpInfo(
        Consumer<WebTamperProtectionConfigResponseInfoContainerWtpInfo> containerWtpInfoSetter) {
        if (this.containerWtpInfo == null) {
            this.containerWtpInfo = new WebTamperProtectionConfigResponseInfoContainerWtpInfo();
            containerWtpInfoSetter.accept(this.containerWtpInfo);
        }

        return this;
    }

    /**
     * Get containerWtpInfo
     * @return containerWtpInfo
     */
    public WebTamperProtectionConfigResponseInfoContainerWtpInfo getContainerWtpInfo() {
        return containerWtpInfo;
    }

    public void setContainerWtpInfo(WebTamperProtectionConfigResponseInfoContainerWtpInfo containerWtpInfo) {
        this.containerWtpInfo = containerWtpInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperProtectionConfigResponseInfo that = (WebTamperProtectionConfigResponseInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.protectMode, that.protectMode)
            && Objects.equals(this.monitorProcess, that.monitorProcess)
            && Objects.equals(this.privilegedProcessList, that.privilegedProcessList)
            && Objects.equals(this.privilegedChild, that.privilegedChild)
            && Objects.equals(this.protectDirectoryInfoList, that.protectDirectoryInfoList)
            && Objects.equals(this.excludeFileTypes, that.excludeFileTypes) && Objects.equals(this.status, that.status)
            && Objects.equals(this.protectedContainerNums, that.protectedContainerNums)
            && Objects.equals(this.protectedEventNums, that.protectedEventNums)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.containerWtpInfo, that.containerWtpInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            protectMode,
            monitorProcess,
            privilegedProcessList,
            privilegedChild,
            protectDirectoryInfoList,
            excludeFileTypes,
            status,
            protectedContainerNums,
            protectedEventNums,
            resourceId,
            containerWtpInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperProtectionConfigResponseInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    protectMode: ").append(toIndentedString(protectMode)).append("\n");
        sb.append("    monitorProcess: ").append(toIndentedString(monitorProcess)).append("\n");
        sb.append("    privilegedProcessList: ").append(toIndentedString(privilegedProcessList)).append("\n");
        sb.append("    privilegedChild: ").append(toIndentedString(privilegedChild)).append("\n");
        sb.append("    protectDirectoryInfoList: ").append(toIndentedString(protectDirectoryInfoList)).append("\n");
        sb.append("    excludeFileTypes: ").append(toIndentedString(excludeFileTypes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    protectedContainerNums: ").append(toIndentedString(protectedContainerNums)).append("\n");
        sb.append("    protectedEventNums: ").append(toIndentedString(protectedEventNums)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    containerWtpInfo: ").append(toIndentedString(containerWtpInfo)).append("\n");
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
