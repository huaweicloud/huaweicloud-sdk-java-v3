package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWebTamperHostPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_dir_num")

    private Integer protectDirNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_dir_info")

    private WtpProtectDirResponseInfo protectDirInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_timing_off")

    private Boolean enableTimingOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timing_off_config_info")

    private ListTimingOffConfigInfoResponseInfo timingOffConfigInfo;

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
    @JsonProperty(value = "privileged_child_status")

    private Boolean privilegedChildStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_process_path_list")

    private List<String> privilegedProcessPathList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_process_info")

    private ListPrivilegedProcessResponseInfo privilegedProcessInfo;

    public ShowWebTamperHostPolicyResponse withProtectDirNum(Integer protectDirNum) {
        this.protectDirNum = protectDirNum;
        return this;
    }

    /**
     * 防护目录数
     * minimum: 0
     * maximum: 50
     * @return protectDirNum
     */
    public Integer getProtectDirNum() {
        return protectDirNum;
    }

    public void setProtectDirNum(Integer protectDirNum) {
        this.protectDirNum = protectDirNum;
    }

    public ShowWebTamperHostPolicyResponse withProtectDirInfo(WtpProtectDirResponseInfo protectDirInfo) {
        this.protectDirInfo = protectDirInfo;
        return this;
    }

    public ShowWebTamperHostPolicyResponse withProtectDirInfo(
        Consumer<WtpProtectDirResponseInfo> protectDirInfoSetter) {
        if (this.protectDirInfo == null) {
            this.protectDirInfo = new WtpProtectDirResponseInfo();
            protectDirInfoSetter.accept(this.protectDirInfo);
        }

        return this;
    }

    /**
     * Get protectDirInfo
     * @return protectDirInfo
     */
    public WtpProtectDirResponseInfo getProtectDirInfo() {
        return protectDirInfo;
    }

    public void setProtectDirInfo(WtpProtectDirResponseInfo protectDirInfo) {
        this.protectDirInfo = protectDirInfo;
    }

    public ShowWebTamperHostPolicyResponse withEnableTimingOff(Boolean enableTimingOff) {
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

    public ShowWebTamperHostPolicyResponse withTimingOffConfigInfo(
        ListTimingOffConfigInfoResponseInfo timingOffConfigInfo) {
        this.timingOffConfigInfo = timingOffConfigInfo;
        return this;
    }

    public ShowWebTamperHostPolicyResponse withTimingOffConfigInfo(
        Consumer<ListTimingOffConfigInfoResponseInfo> timingOffConfigInfoSetter) {
        if (this.timingOffConfigInfo == null) {
            this.timingOffConfigInfo = new ListTimingOffConfigInfoResponseInfo();
            timingOffConfigInfoSetter.accept(this.timingOffConfigInfo);
        }

        return this;
    }

    /**
     * Get timingOffConfigInfo
     * @return timingOffConfigInfo
     */
    public ListTimingOffConfigInfoResponseInfo getTimingOffConfigInfo() {
        return timingOffConfigInfo;
    }

    public void setTimingOffConfigInfo(ListTimingOffConfigInfoResponseInfo timingOffConfigInfo) {
        this.timingOffConfigInfo = timingOffConfigInfo;
    }

    public ShowWebTamperHostPolicyResponse withEnableRaspProtect(Boolean enableRaspProtect) {
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

    public ShowWebTamperHostPolicyResponse withRaspPath(String raspPath) {
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

    public ShowWebTamperHostPolicyResponse withEnablePrivilegedProcess(Boolean enablePrivilegedProcess) {
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

    public ShowWebTamperHostPolicyResponse withPrivilegedChildStatus(Boolean privilegedChildStatus) {
        this.privilegedChildStatus = privilegedChildStatus;
        return this;
    }

    /**
     * 特权进程子进程可信状态
     * @return privilegedChildStatus
     */
    public Boolean getPrivilegedChildStatus() {
        return privilegedChildStatus;
    }

    public void setPrivilegedChildStatus(Boolean privilegedChildStatus) {
        this.privilegedChildStatus = privilegedChildStatus;
    }

    public ShowWebTamperHostPolicyResponse withPrivilegedProcessPathList(List<String> privilegedProcessPathList) {
        this.privilegedProcessPathList = privilegedProcessPathList;
        return this;
    }

    public ShowWebTamperHostPolicyResponse addPrivilegedProcessPathListItem(String privilegedProcessPathListItem) {
        if (this.privilegedProcessPathList == null) {
            this.privilegedProcessPathList = new ArrayList<>();
        }
        this.privilegedProcessPathList.add(privilegedProcessPathListItem);
        return this;
    }

    public ShowWebTamperHostPolicyResponse withPrivilegedProcessPathList(
        Consumer<List<String>> privilegedProcessPathListSetter) {
        if (this.privilegedProcessPathList == null) {
            this.privilegedProcessPathList = new ArrayList<>();
        }
        privilegedProcessPathListSetter.accept(this.privilegedProcessPathList);
        return this;
    }

    /**
     * 特权进程路径集合
     * @return privilegedProcessPathList
     */
    public List<String> getPrivilegedProcessPathList() {
        return privilegedProcessPathList;
    }

    public void setPrivilegedProcessPathList(List<String> privilegedProcessPathList) {
        this.privilegedProcessPathList = privilegedProcessPathList;
    }

    public ShowWebTamperHostPolicyResponse withPrivilegedProcessInfo(
        ListPrivilegedProcessResponseInfo privilegedProcessInfo) {
        this.privilegedProcessInfo = privilegedProcessInfo;
        return this;
    }

    public ShowWebTamperHostPolicyResponse withPrivilegedProcessInfo(
        Consumer<ListPrivilegedProcessResponseInfo> privilegedProcessInfoSetter) {
        if (this.privilegedProcessInfo == null) {
            this.privilegedProcessInfo = new ListPrivilegedProcessResponseInfo();
            privilegedProcessInfoSetter.accept(this.privilegedProcessInfo);
        }

        return this;
    }

    /**
     * Get privilegedProcessInfo
     * @return privilegedProcessInfo
     */
    public ListPrivilegedProcessResponseInfo getPrivilegedProcessInfo() {
        return privilegedProcessInfo;
    }

    public void setPrivilegedProcessInfo(ListPrivilegedProcessResponseInfo privilegedProcessInfo) {
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
        ShowWebTamperHostPolicyResponse that = (ShowWebTamperHostPolicyResponse) obj;
        return Objects.equals(this.protectDirNum, that.protectDirNum)
            && Objects.equals(this.protectDirInfo, that.protectDirInfo)
            && Objects.equals(this.enableTimingOff, that.enableTimingOff)
            && Objects.equals(this.timingOffConfigInfo, that.timingOffConfigInfo)
            && Objects.equals(this.enableRaspProtect, that.enableRaspProtect)
            && Objects.equals(this.raspPath, that.raspPath)
            && Objects.equals(this.enablePrivilegedProcess, that.enablePrivilegedProcess)
            && Objects.equals(this.privilegedChildStatus, that.privilegedChildStatus)
            && Objects.equals(this.privilegedProcessPathList, that.privilegedProcessPathList)
            && Objects.equals(this.privilegedProcessInfo, that.privilegedProcessInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectDirNum,
            protectDirInfo,
            enableTimingOff,
            timingOffConfigInfo,
            enableRaspProtect,
            raspPath,
            enablePrivilegedProcess,
            privilegedChildStatus,
            privilegedProcessPathList,
            privilegedProcessInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWebTamperHostPolicyResponse {\n");
        sb.append("    protectDirNum: ").append(toIndentedString(protectDirNum)).append("\n");
        sb.append("    protectDirInfo: ").append(toIndentedString(protectDirInfo)).append("\n");
        sb.append("    enableTimingOff: ").append(toIndentedString(enableTimingOff)).append("\n");
        sb.append("    timingOffConfigInfo: ").append(toIndentedString(timingOffConfigInfo)).append("\n");
        sb.append("    enableRaspProtect: ").append(toIndentedString(enableRaspProtect)).append("\n");
        sb.append("    raspPath: ").append(toIndentedString(raspPath)).append("\n");
        sb.append("    enablePrivilegedProcess: ").append(toIndentedString(enablePrivilegedProcess)).append("\n");
        sb.append("    privilegedChildStatus: ").append(toIndentedString(privilegedChildStatus)).append("\n");
        sb.append("    privilegedProcessPathList: ").append(toIndentedString(privilegedProcessPathList)).append("\n");
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
