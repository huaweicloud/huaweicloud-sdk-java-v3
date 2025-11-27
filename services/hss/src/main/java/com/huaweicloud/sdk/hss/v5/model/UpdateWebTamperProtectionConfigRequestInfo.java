package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateWebTamperProtectionConfigRequestInfo
 */
public class UpdateWebTamperProtectionConfigRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_config_id")

    private String protectionConfigId;

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
    @JsonProperty(value = "container_wtp_info")

    private UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo containerWtpInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_directory_info_list")

    private List<ProtectDirectoryInfo> protectDirectoryInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_file_types")

    private List<String> excludeFileTypes = null;

    public UpdateWebTamperProtectionConfigRequestInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 网页防篡改的类型 **约束限制**: 不涉及 **取值范围**: - container_wtp：容器网页防篡改  **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withProtectionConfigId(String protectionConfigId) {
        this.protectionConfigId = protectionConfigId;
        return this;
    }

    /**
     * **参数解释**: 防护配置id **约束限制**: 不涉及。 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return protectionConfigId
     */
    public String getProtectionConfigId() {
        return protectionConfigId;
    }

    public void setProtectionConfigId(String protectionConfigId) {
        this.protectionConfigId = protectionConfigId;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withProtectMode(String protectMode) {
        this.protectMode = protectMode;
        return this;
    }

    /**
     * **参数解释**: 防护模式 **约束限制**: 不涉及 **取值范围**: - alarm：告警模式 - block：拦截模式  **默认取值**: alarm 
     * @return protectMode
     */
    public String getProtectMode() {
        return protectMode;
    }

    public void setProtectMode(String protectMode) {
        this.protectMode = protectMode;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withMonitorProcess(Boolean monitorProcess) {
        this.monitorProcess = monitorProcess;
        return this;
    }

    /**
     * **参数解释**: 是否对篡改行为进行进程监控 **约束限制**: 不涉及 **取值范围**: - true：监控篡改进程 - false：不监控篡改进程 **默认取值**: true 
     * @return monitorProcess
     */
    public Boolean getMonitorProcess() {
        return monitorProcess;
    }

    public void setMonitorProcess(Boolean monitorProcess) {
        this.monitorProcess = monitorProcess;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withPrivilegedProcessList(List<String> privilegedProcessList) {
        this.privilegedProcessList = privilegedProcessList;
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfo addPrivilegedProcessListItem(String privilegedProcessListItem) {
        if (this.privilegedProcessList == null) {
            this.privilegedProcessList = new ArrayList<>();
        }
        this.privilegedProcessList.add(privilegedProcessListItem);
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withPrivilegedProcessList(
        Consumer<List<String>> privilegedProcessListSetter) {
        if (this.privilegedProcessList == null) {
            this.privilegedProcessList = new ArrayList<>();
        }
        privilegedProcessListSetter.accept(this.privilegedProcessList);
        return this;
    }

    /**
     * **参数解释**: 特权进程路径列表 **约束限制**: monitor_process值为true时生效（不进行进程监控无法判断特权进程） **取值范围**: 最少0条，最多10条 **默认取值**: 不涉及 
     * @return privilegedProcessList
     */
    public List<String> getPrivilegedProcessList() {
        return privilegedProcessList;
    }

    public void setPrivilegedProcessList(List<String> privilegedProcessList) {
        this.privilegedProcessList = privilegedProcessList;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withPrivilegedChild(Boolean privilegedChild) {
        this.privilegedChild = privilegedChild;
        return this;
    }

    /**
     * **参数解释**: 特权进程的子进程是否仍享有特权 **约束限制**: monitor_process值为true时生效（不进行进程监控无法判断特权进程） **取值范围**: - true：特权进程的子进程依然是特权进程 - false：特权进程的子进程不再是特权进程 **默认取值**: false 
     * @return privilegedChild
     */
    public Boolean getPrivilegedChild() {
        return privilegedChild;
    }

    public void setPrivilegedChild(Boolean privilegedChild) {
        this.privilegedChild = privilegedChild;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withContainerWtpInfo(
        UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo containerWtpInfo) {
        this.containerWtpInfo = containerWtpInfo;
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withContainerWtpInfo(
        Consumer<UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo> containerWtpInfoSetter) {
        if (this.containerWtpInfo == null) {
            this.containerWtpInfo = new UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo();
            containerWtpInfoSetter.accept(this.containerWtpInfo);
        }

        return this;
    }

    /**
     * Get containerWtpInfo
     * @return containerWtpInfo
     */
    public UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo getContainerWtpInfo() {
        return containerWtpInfo;
    }

    public void setContainerWtpInfo(UpdateWebTamperProtectionConfigRequestInfoContainerWtpInfo containerWtpInfo) {
        this.containerWtpInfo = containerWtpInfo;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withProtectDirectoryInfoList(
        List<ProtectDirectoryInfo> protectDirectoryInfoList) {
        this.protectDirectoryInfoList = protectDirectoryInfoList;
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfo addProtectDirectoryInfoListItem(
        ProtectDirectoryInfo protectDirectoryInfoListItem) {
        if (this.protectDirectoryInfoList == null) {
            this.protectDirectoryInfoList = new ArrayList<>();
        }
        this.protectDirectoryInfoList.add(protectDirectoryInfoListItem);
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withProtectDirectoryInfoList(
        Consumer<List<ProtectDirectoryInfo>> protectDirectoryInfoListSetter) {
        if (this.protectDirectoryInfoList == null) {
            this.protectDirectoryInfoList = new ArrayList<>();
        }
        protectDirectoryInfoListSetter.accept(this.protectDirectoryInfoList);
        return this;
    }

    /**
     * **参数解释**： 防护目录信息 **约束限制**: 不涉及 **取值范围**： 最少1条，最多50条 **默认取值**: 不涉及 
     * @return protectDirectoryInfoList
     */
    public List<ProtectDirectoryInfo> getProtectDirectoryInfoList() {
        return protectDirectoryInfoList;
    }

    public void setProtectDirectoryInfoList(List<ProtectDirectoryInfo> protectDirectoryInfoList) {
        this.protectDirectoryInfoList = protectDirectoryInfoList;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withExcludeFileTypes(List<String> excludeFileTypes) {
        this.excludeFileTypes = excludeFileTypes;
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfo addExcludeFileTypesItem(String excludeFileTypesItem) {
        if (this.excludeFileTypes == null) {
            this.excludeFileTypes = new ArrayList<>();
        }
        this.excludeFileTypes.add(excludeFileTypesItem);
        return this;
    }

    public UpdateWebTamperProtectionConfigRequestInfo withExcludeFileTypes(
        Consumer<List<String>> excludeFileTypesSetter) {
        if (this.excludeFileTypes == null) {
            this.excludeFileTypes = new ArrayList<>();
        }
        excludeFileTypesSetter.accept(this.excludeFileTypes);
        return this;
    }

    /**
     * **参数解释**： 防护排除的文件类型列表 **约束限制**: 不涉及 **取值范围**： 最少0条，最多10条 **默认取值**: 不涉及 
     * @return excludeFileTypes
     */
    public List<String> getExcludeFileTypes() {
        return excludeFileTypes;
    }

    public void setExcludeFileTypes(List<String> excludeFileTypes) {
        this.excludeFileTypes = excludeFileTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWebTamperProtectionConfigRequestInfo that = (UpdateWebTamperProtectionConfigRequestInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.protectionConfigId, that.protectionConfigId)
            && Objects.equals(this.protectMode, that.protectMode)
            && Objects.equals(this.monitorProcess, that.monitorProcess)
            && Objects.equals(this.privilegedProcessList, that.privilegedProcessList)
            && Objects.equals(this.privilegedChild, that.privilegedChild)
            && Objects.equals(this.containerWtpInfo, that.containerWtpInfo)
            && Objects.equals(this.protectDirectoryInfoList, that.protectDirectoryInfoList)
            && Objects.equals(this.excludeFileTypes, that.excludeFileTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            protectionConfigId,
            protectMode,
            monitorProcess,
            privilegedProcessList,
            privilegedChild,
            containerWtpInfo,
            protectDirectoryInfoList,
            excludeFileTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWebTamperProtectionConfigRequestInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protectionConfigId: ").append(toIndentedString(protectionConfigId)).append("\n");
        sb.append("    protectMode: ").append(toIndentedString(protectMode)).append("\n");
        sb.append("    monitorProcess: ").append(toIndentedString(monitorProcess)).append("\n");
        sb.append("    privilegedProcessList: ").append(toIndentedString(privilegedProcessList)).append("\n");
        sb.append("    privilegedChild: ").append(toIndentedString(privilegedChild)).append("\n");
        sb.append("    containerWtpInfo: ").append(toIndentedString(containerWtpInfo)).append("\n");
        sb.append("    protectDirectoryInfoList: ").append(toIndentedString(protectDirectoryInfoList)).append("\n");
        sb.append("    excludeFileTypes: ").append(toIndentedString(excludeFileTypes)).append("\n");
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
