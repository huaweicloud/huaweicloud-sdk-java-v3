package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网页防篡改策略信息
 */
public class UpdateWebTamperHostPolicyRequestInfo {

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

    public UpdateWebTamperHostPolicyRequestInfo withProtectDirInfo(WebTamperProtectDirRequestInfo protectDirInfo) {
        this.protectDirInfo = protectDirInfo;
        return this;
    }

    public UpdateWebTamperHostPolicyRequestInfo withProtectDirInfo(
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

    public UpdateWebTamperHostPolicyRequestInfo withEnableTimingOff(Boolean enableTimingOff) {
        this.enableTimingOff = enableTimingOff;
        return this;
    }

    /**
     * **参数解释**: 定时开关设置状态 **约束限制**: 不涉及 **取值范围**: - True ：开启定时关闭防护功能，必须填写timing_off_config_info。 - False ：关闭定时关闭防护功能，无需填写timing_off_config_info。  **默认取值**: False 
     * @return enableTimingOff
     */
    public Boolean getEnableTimingOff() {
        return enableTimingOff;
    }

    public void setEnableTimingOff(Boolean enableTimingOff) {
        this.enableTimingOff = enableTimingOff;
    }

    public UpdateWebTamperHostPolicyRequestInfo withTimingOffConfigInfo(
        WebTamperTimingOffConfigInfoRequestInfo timingOffConfigInfo) {
        this.timingOffConfigInfo = timingOffConfigInfo;
        return this;
    }

    public UpdateWebTamperHostPolicyRequestInfo withTimingOffConfigInfo(
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

    public UpdateWebTamperHostPolicyRequestInfo withEnableRaspProtect(Boolean enableRaspProtect) {
        this.enableRaspProtect = enableRaspProtect;
        return this;
    }

    /**
     * **参数解释**: 动态网页防篡改开启状态，仅Linux服务器支持。 **约束限制**: 仅Linux服务器支持开启动态网页防篡改，Windows服务器不可填写该字段。 **取值范围**: - True ：开启动态网页防篡改，必须填写rasp_path。 - False ：关闭动态网页防篡改，无需填写rasp_path。  **默认取值**: False 
     * @return enableRaspProtect
     */
    public Boolean getEnableRaspProtect() {
        return enableRaspProtect;
    }

    public void setEnableRaspProtect(Boolean enableRaspProtect) {
        this.enableRaspProtect = enableRaspProtect;
    }

    public UpdateWebTamperHostPolicyRequestInfo withRaspPath(String raspPath) {
        this.raspPath = raspPath;
        return this;
    }

    /**
     * **参数解释**: 动态网页防篡改的Tomcat bin目录，仅Linux服务器支持。 **约束限制**: 仅Linux服务器支持配置动态网页防篡改的Tomcat bin目录，Windows服务器不可填写该字段。 **取值范围**: 字符长度1-256位，必须以/开头，不能以/结尾，只能包含英文大小写字母，数字，下划线，中划线和点。 **默认取值**: 不涉及 
     * @return raspPath
     */
    public String getRaspPath() {
        return raspPath;
    }

    public void setRaspPath(String raspPath) {
        this.raspPath = raspPath;
    }

    public UpdateWebTamperHostPolicyRequestInfo withEnablePrivilegedProcess(Boolean enablePrivilegedProcess) {
        this.enablePrivilegedProcess = enablePrivilegedProcess;
        return this;
    }

    /**
     * **参数解释**: 特权进程开启状态 **约束限制**: 不涉及 **取值范围**: - True ：开启特权进程，必须填写privileged_process_info。 - False ：关闭特权进程，无需填写privileged_process_info。  **默认取值**: False 
     * @return enablePrivilegedProcess
     */
    public Boolean getEnablePrivilegedProcess() {
        return enablePrivilegedProcess;
    }

    public void setEnablePrivilegedProcess(Boolean enablePrivilegedProcess) {
        this.enablePrivilegedProcess = enablePrivilegedProcess;
    }

    public UpdateWebTamperHostPolicyRequestInfo withPrivilegedProcessInfo(
        WebTamperPrivilegedProcessRequestInfo privilegedProcessInfo) {
        this.privilegedProcessInfo = privilegedProcessInfo;
        return this;
    }

    public UpdateWebTamperHostPolicyRequestInfo withPrivilegedProcessInfo(
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
        UpdateWebTamperHostPolicyRequestInfo that = (UpdateWebTamperHostPolicyRequestInfo) obj;
        return Objects.equals(this.protectDirInfo, that.protectDirInfo)
            && Objects.equals(this.enableTimingOff, that.enableTimingOff)
            && Objects.equals(this.timingOffConfigInfo, that.timingOffConfigInfo)
            && Objects.equals(this.enableRaspProtect, that.enableRaspProtect)
            && Objects.equals(this.raspPath, that.raspPath)
            && Objects.equals(this.enablePrivilegedProcess, that.enablePrivilegedProcess)
            && Objects.equals(this.privilegedProcessInfo, that.privilegedProcessInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectDirInfo,
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
        sb.append("class UpdateWebTamperHostPolicyRequestInfo {\n");
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
