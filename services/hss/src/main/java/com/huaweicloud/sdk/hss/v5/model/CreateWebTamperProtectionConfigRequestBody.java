package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateWebTamperProtectionConfigRequestBody
 */
public class CreateWebTamperProtectionConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

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

    private CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo containerWtpInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_protection_immediately")

    private Boolean openProtectionImmediately;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_info")

    private CreateWebTamperProtectionConfigRequestBodyQuotaInfo quotaInfo;

    public CreateWebTamperProtectionConfigRequestBody withType(String type) {
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

    public CreateWebTamperProtectionConfigRequestBody withProtectMode(String protectMode) {
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

    public CreateWebTamperProtectionConfigRequestBody withMonitorProcess(Boolean monitorProcess) {
        this.monitorProcess = monitorProcess;
        return this;
    }

    /**
     * **参数解释**: 是否对篡改行为进行进程监控 **约束限制**: 不涉及 **取值范围**: - true：监控篡改进程 - false：不监控篡改进程  **默认取值**: true 
     * @return monitorProcess
     */
    public Boolean getMonitorProcess() {
        return monitorProcess;
    }

    public void setMonitorProcess(Boolean monitorProcess) {
        this.monitorProcess = monitorProcess;
    }

    public CreateWebTamperProtectionConfigRequestBody withPrivilegedProcessList(List<String> privilegedProcessList) {
        this.privilegedProcessList = privilegedProcessList;
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBody addPrivilegedProcessListItem(String privilegedProcessListItem) {
        if (this.privilegedProcessList == null) {
            this.privilegedProcessList = new ArrayList<>();
        }
        this.privilegedProcessList.add(privilegedProcessListItem);
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBody withPrivilegedProcessList(
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

    public CreateWebTamperProtectionConfigRequestBody withPrivilegedChild(Boolean privilegedChild) {
        this.privilegedChild = privilegedChild;
        return this;
    }

    /**
     * **参数解释**: 特权进程的子进程是否仍享有特权 **约束限制**: monitor_process值为true时生效（不进行进程监控无法判断特权进程） **取值范围**: - true：特权进程的子进程依然是特权进程 - false：特权进程的子进程不再是特权进程  **默认取值**: false 
     * @return privilegedChild
     */
    public Boolean getPrivilegedChild() {
        return privilegedChild;
    }

    public void setPrivilegedChild(Boolean privilegedChild) {
        this.privilegedChild = privilegedChild;
    }

    public CreateWebTamperProtectionConfigRequestBody withContainerWtpInfo(
        CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo containerWtpInfo) {
        this.containerWtpInfo = containerWtpInfo;
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBody withContainerWtpInfo(
        Consumer<CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo> containerWtpInfoSetter) {
        if (this.containerWtpInfo == null) {
            this.containerWtpInfo = new CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo();
            containerWtpInfoSetter.accept(this.containerWtpInfo);
        }

        return this;
    }

    /**
     * Get containerWtpInfo
     * @return containerWtpInfo
     */
    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo getContainerWtpInfo() {
        return containerWtpInfo;
    }

    public void setContainerWtpInfo(CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo containerWtpInfo) {
        this.containerWtpInfo = containerWtpInfo;
    }

    public CreateWebTamperProtectionConfigRequestBody withOpenProtectionImmediately(Boolean openProtectionImmediately) {
        this.openProtectionImmediately = openProtectionImmediately;
        return this;
    }

    /**
     * **参数解释**: 是否立即开启防护 **约束限制**: 不涉及 **取值范围**: - true：立即开启防护 - false：只保存配置内容，暂不开启防护  **默认取值**: false 
     * @return openProtectionImmediately
     */
    public Boolean getOpenProtectionImmediately() {
        return openProtectionImmediately;
    }

    public void setOpenProtectionImmediately(Boolean openProtectionImmediately) {
        this.openProtectionImmediately = openProtectionImmediately;
    }

    public CreateWebTamperProtectionConfigRequestBody withQuotaInfo(
        CreateWebTamperProtectionConfigRequestBodyQuotaInfo quotaInfo) {
        this.quotaInfo = quotaInfo;
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBody withQuotaInfo(
        Consumer<CreateWebTamperProtectionConfigRequestBodyQuotaInfo> quotaInfoSetter) {
        if (this.quotaInfo == null) {
            this.quotaInfo = new CreateWebTamperProtectionConfigRequestBodyQuotaInfo();
            quotaInfoSetter.accept(this.quotaInfo);
        }

        return this;
    }

    /**
     * Get quotaInfo
     * @return quotaInfo
     */
    public CreateWebTamperProtectionConfigRequestBodyQuotaInfo getQuotaInfo() {
        return quotaInfo;
    }

    public void setQuotaInfo(CreateWebTamperProtectionConfigRequestBodyQuotaInfo quotaInfo) {
        this.quotaInfo = quotaInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWebTamperProtectionConfigRequestBody that = (CreateWebTamperProtectionConfigRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.protectMode, that.protectMode)
            && Objects.equals(this.monitorProcess, that.monitorProcess)
            && Objects.equals(this.privilegedProcessList, that.privilegedProcessList)
            && Objects.equals(this.privilegedChild, that.privilegedChild)
            && Objects.equals(this.containerWtpInfo, that.containerWtpInfo)
            && Objects.equals(this.openProtectionImmediately, that.openProtectionImmediately)
            && Objects.equals(this.quotaInfo, that.quotaInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            protectMode,
            monitorProcess,
            privilegedProcessList,
            privilegedChild,
            containerWtpInfo,
            openProtectionImmediately,
            quotaInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWebTamperProtectionConfigRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protectMode: ").append(toIndentedString(protectMode)).append("\n");
        sb.append("    monitorProcess: ").append(toIndentedString(monitorProcess)).append("\n");
        sb.append("    privilegedProcessList: ").append(toIndentedString(privilegedProcessList)).append("\n");
        sb.append("    privilegedChild: ").append(toIndentedString(privilegedChild)).append("\n");
        sb.append("    containerWtpInfo: ").append(toIndentedString(containerWtpInfo)).append("\n");
        sb.append("    openProtectionImmediately: ").append(toIndentedString(openProtectionImmediately)).append("\n");
        sb.append("    quotaInfo: ").append(toIndentedString(quotaInfo)).append("\n");
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
