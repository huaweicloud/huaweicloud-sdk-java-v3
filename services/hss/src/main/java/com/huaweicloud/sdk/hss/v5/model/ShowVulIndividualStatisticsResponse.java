package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowVulIndividualStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_urgent_repair_num")

    private Integer needUrgentRepairNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unhandled_num")

    private Integer unhandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existed_vul_host_num")

    private Integer existedVulHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "today_handled_num")

    private Integer todayHandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_handled_num")

    private Integer allHandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_library_supported_num")

    private Integer vulLibrarySupportedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_library_update_time")

    private Long vulLibraryUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_vul_unhandled_num")

    private Integer linuxVulUnhandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_vul_unhandled_num")

    private Integer windowsVulUnhandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_cms_vul_unhandled_num")

    private Integer webCmsVulUnhandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_vul_unhandled_num")

    private Integer appVulUnhandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urgent_vul_unhandled_num")

    private Integer urgentVulUnhandledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_reboot_host_num")

    private Integer needRebootHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_vul_handle_num")

    private Integer maxVulHandleNum;

    public ShowVulIndividualStatisticsResponse withNeedUrgentRepairNum(Integer needUrgentRepairNum) {
        this.needUrgentRepairNum = needUrgentRepairNum;
        return this;
    }

    /**
     * **参数解释**: 需要紧急修复的漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return needUrgentRepairNum
     */
    public Integer getNeedUrgentRepairNum() {
        return needUrgentRepairNum;
    }

    public void setNeedUrgentRepairNum(Integer needUrgentRepairNum) {
        this.needUrgentRepairNum = needUrgentRepairNum;
    }

    public ShowVulIndividualStatisticsResponse withUnhandledNum(Integer unhandledNum) {
        this.unhandledNum = unhandledNum;
        return this;
    }

    /**
     * **参数解释**: 未完成修复的漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return unhandledNum
     */
    public Integer getUnhandledNum() {
        return unhandledNum;
    }

    public void setUnhandledNum(Integer unhandledNum) {
        this.unhandledNum = unhandledNum;
    }

    public ShowVulIndividualStatisticsResponse withExistedVulHostNum(Integer existedVulHostNum) {
        this.existedVulHostNum = existedVulHostNum;
        return this;
    }

    /**
     * **参数解释**: 存在漏洞的服务器数量 **取值范围**: 最小值0，最大值2147483647 
     * @return existedVulHostNum
     */
    public Integer getExistedVulHostNum() {
        return existedVulHostNum;
    }

    public void setExistedVulHostNum(Integer existedVulHostNum) {
        this.existedVulHostNum = existedVulHostNum;
    }

    public ShowVulIndividualStatisticsResponse withTodayHandledNum(Integer todayHandledNum) {
        this.todayHandledNum = todayHandledNum;
        return this;
    }

    /**
     * **参数解释**: 今日处理的漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return todayHandledNum
     */
    public Integer getTodayHandledNum() {
        return todayHandledNum;
    }

    public void setTodayHandledNum(Integer todayHandledNum) {
        this.todayHandledNum = todayHandledNum;
    }

    public ShowVulIndividualStatisticsResponse withAllHandledNum(Integer allHandledNum) {
        this.allHandledNum = allHandledNum;
        return this;
    }

    /**
     * **参数解释**: 累计处理的漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return allHandledNum
     */
    public Integer getAllHandledNum() {
        return allHandledNum;
    }

    public void setAllHandledNum(Integer allHandledNum) {
        this.allHandledNum = allHandledNum;
    }

    public ShowVulIndividualStatisticsResponse withVulLibrarySupportedNum(Integer vulLibrarySupportedNum) {
        this.vulLibrarySupportedNum = vulLibrarySupportedNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞库已支持漏洞数 **取值范围**: 最小值0，最大值2147483647 
     * @return vulLibrarySupportedNum
     */
    public Integer getVulLibrarySupportedNum() {
        return vulLibrarySupportedNum;
    }

    public void setVulLibrarySupportedNum(Integer vulLibrarySupportedNum) {
        this.vulLibrarySupportedNum = vulLibrarySupportedNum;
    }

    public ShowVulIndividualStatisticsResponse withVulLibraryUpdateTime(Long vulLibraryUpdateTime) {
        this.vulLibraryUpdateTime = vulLibraryUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 漏洞库更新时间，Unix时间戳格式，单位为毫秒 **取值范围**: 最小值0，最大值9223372036854775807 
     * @return vulLibraryUpdateTime
     */
    public Long getVulLibraryUpdateTime() {
        return vulLibraryUpdateTime;
    }

    public void setVulLibraryUpdateTime(Long vulLibraryUpdateTime) {
        this.vulLibraryUpdateTime = vulLibraryUpdateTime;
    }

    public ShowVulIndividualStatisticsResponse withLinuxVulUnhandledNum(Integer linuxVulUnhandledNum) {
        this.linuxVulUnhandledNum = linuxVulUnhandledNum;
        return this;
    }

    /**
     * **参数解释**: 未处置的Linux漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return linuxVulUnhandledNum
     */
    public Integer getLinuxVulUnhandledNum() {
        return linuxVulUnhandledNum;
    }

    public void setLinuxVulUnhandledNum(Integer linuxVulUnhandledNum) {
        this.linuxVulUnhandledNum = linuxVulUnhandledNum;
    }

    public ShowVulIndividualStatisticsResponse withWindowsVulUnhandledNum(Integer windowsVulUnhandledNum) {
        this.windowsVulUnhandledNum = windowsVulUnhandledNum;
        return this;
    }

    /**
     * **参数解释**: 未处置的Windows漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return windowsVulUnhandledNum
     */
    public Integer getWindowsVulUnhandledNum() {
        return windowsVulUnhandledNum;
    }

    public void setWindowsVulUnhandledNum(Integer windowsVulUnhandledNum) {
        this.windowsVulUnhandledNum = windowsVulUnhandledNum;
    }

    public ShowVulIndividualStatisticsResponse withWebCmsVulUnhandledNum(Integer webCmsVulUnhandledNum) {
        this.webCmsVulUnhandledNum = webCmsVulUnhandledNum;
        return this;
    }

    /**
     * **参数解释**: 未处置的Web CMS漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return webCmsVulUnhandledNum
     */
    public Integer getWebCmsVulUnhandledNum() {
        return webCmsVulUnhandledNum;
    }

    public void setWebCmsVulUnhandledNum(Integer webCmsVulUnhandledNum) {
        this.webCmsVulUnhandledNum = webCmsVulUnhandledNum;
    }

    public ShowVulIndividualStatisticsResponse withAppVulUnhandledNum(Integer appVulUnhandledNum) {
        this.appVulUnhandledNum = appVulUnhandledNum;
        return this;
    }

    /**
     * **参数解释**: 未处置的应用漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return appVulUnhandledNum
     */
    public Integer getAppVulUnhandledNum() {
        return appVulUnhandledNum;
    }

    public void setAppVulUnhandledNum(Integer appVulUnhandledNum) {
        this.appVulUnhandledNum = appVulUnhandledNum;
    }

    public ShowVulIndividualStatisticsResponse withUrgentVulUnhandledNum(Integer urgentVulUnhandledNum) {
        this.urgentVulUnhandledNum = urgentVulUnhandledNum;
        return this;
    }

    /**
     * **参数解释**: 未处置的应急漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return urgentVulUnhandledNum
     */
    public Integer getUrgentVulUnhandledNum() {
        return urgentVulUnhandledNum;
    }

    public void setUrgentVulUnhandledNum(Integer urgentVulUnhandledNum) {
        this.urgentVulUnhandledNum = urgentVulUnhandledNum;
    }

    public ShowVulIndividualStatisticsResponse withNeedRebootHostNum(Integer needRebootHostNum) {
        this.needRebootHostNum = needRebootHostNum;
        return this;
    }

    /**
     * **参数解释**: 修复成功待重启的主机数量 **取值范围**: 最小值0，最大值2147483647 
     * @return needRebootHostNum
     */
    public Integer getNeedRebootHostNum() {
        return needRebootHostNum;
    }

    public void setNeedRebootHostNum(Integer needRebootHostNum) {
        this.needRebootHostNum = needRebootHostNum;
    }

    public ShowVulIndividualStatisticsResponse withMaxVulHandleNum(Integer maxVulHandleNum) {
        this.maxVulHandleNum = maxVulHandleNum;
        return this;
    }

    /**
     * **参数解释**: 单次最大可处置的漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * @return maxVulHandleNum
     */
    public Integer getMaxVulHandleNum() {
        return maxVulHandleNum;
    }

    public void setMaxVulHandleNum(Integer maxVulHandleNum) {
        this.maxVulHandleNum = maxVulHandleNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulIndividualStatisticsResponse that = (ShowVulIndividualStatisticsResponse) obj;
        return Objects.equals(this.needUrgentRepairNum, that.needUrgentRepairNum)
            && Objects.equals(this.unhandledNum, that.unhandledNum)
            && Objects.equals(this.existedVulHostNum, that.existedVulHostNum)
            && Objects.equals(this.todayHandledNum, that.todayHandledNum)
            && Objects.equals(this.allHandledNum, that.allHandledNum)
            && Objects.equals(this.vulLibrarySupportedNum, that.vulLibrarySupportedNum)
            && Objects.equals(this.vulLibraryUpdateTime, that.vulLibraryUpdateTime)
            && Objects.equals(this.linuxVulUnhandledNum, that.linuxVulUnhandledNum)
            && Objects.equals(this.windowsVulUnhandledNum, that.windowsVulUnhandledNum)
            && Objects.equals(this.webCmsVulUnhandledNum, that.webCmsVulUnhandledNum)
            && Objects.equals(this.appVulUnhandledNum, that.appVulUnhandledNum)
            && Objects.equals(this.urgentVulUnhandledNum, that.urgentVulUnhandledNum)
            && Objects.equals(this.needRebootHostNum, that.needRebootHostNum)
            && Objects.equals(this.maxVulHandleNum, that.maxVulHandleNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(needUrgentRepairNum,
            unhandledNum,
            existedVulHostNum,
            todayHandledNum,
            allHandledNum,
            vulLibrarySupportedNum,
            vulLibraryUpdateTime,
            linuxVulUnhandledNum,
            windowsVulUnhandledNum,
            webCmsVulUnhandledNum,
            appVulUnhandledNum,
            urgentVulUnhandledNum,
            needRebootHostNum,
            maxVulHandleNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulIndividualStatisticsResponse {\n");
        sb.append("    needUrgentRepairNum: ").append(toIndentedString(needUrgentRepairNum)).append("\n");
        sb.append("    unhandledNum: ").append(toIndentedString(unhandledNum)).append("\n");
        sb.append("    existedVulHostNum: ").append(toIndentedString(existedVulHostNum)).append("\n");
        sb.append("    todayHandledNum: ").append(toIndentedString(todayHandledNum)).append("\n");
        sb.append("    allHandledNum: ").append(toIndentedString(allHandledNum)).append("\n");
        sb.append("    vulLibrarySupportedNum: ").append(toIndentedString(vulLibrarySupportedNum)).append("\n");
        sb.append("    vulLibraryUpdateTime: ").append(toIndentedString(vulLibraryUpdateTime)).append("\n");
        sb.append("    linuxVulUnhandledNum: ").append(toIndentedString(linuxVulUnhandledNum)).append("\n");
        sb.append("    windowsVulUnhandledNum: ").append(toIndentedString(windowsVulUnhandledNum)).append("\n");
        sb.append("    webCmsVulUnhandledNum: ").append(toIndentedString(webCmsVulUnhandledNum)).append("\n");
        sb.append("    appVulUnhandledNum: ").append(toIndentedString(appVulUnhandledNum)).append("\n");
        sb.append("    urgentVulUnhandledNum: ").append(toIndentedString(urgentVulUnhandledNum)).append("\n");
        sb.append("    needRebootHostNum: ").append(toIndentedString(needRebootHostNum)).append("\n");
        sb.append("    maxVulHandleNum: ").append(toIndentedString(maxVulHandleNum)).append("\n");
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
