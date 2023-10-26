package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowVulStaticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_urgent_repair")

    private Integer needUrgentRepair;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unrepair")

    private Integer unrepair;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existed_vul_hosts")

    private Integer existedVulHosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "today_handle")

    private Integer todayHandle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_handle")

    private Integer allHandle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported")

    private Integer supported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_library_update_time")

    private Long vulLibraryUpdateTime;

    public ShowVulStaticsResponse withNeedUrgentRepair(Integer needUrgentRepair) {
        this.needUrgentRepair = needUrgentRepair;
        return this;
    }

    /**
     * 需紧急修复的漏洞数
     * minimum: 0
     * maximum: 2147483647
     * @return needUrgentRepair
     */
    public Integer getNeedUrgentRepair() {
        return needUrgentRepair;
    }

    public void setNeedUrgentRepair(Integer needUrgentRepair) {
        this.needUrgentRepair = needUrgentRepair;
    }

    public ShowVulStaticsResponse withUnrepair(Integer unrepair) {
        this.unrepair = unrepair;
        return this;
    }

    /**
     * 未完成修复的漏洞数
     * minimum: 0
     * maximum: 2147483647
     * @return unrepair
     */
    public Integer getUnrepair() {
        return unrepair;
    }

    public void setUnrepair(Integer unrepair) {
        this.unrepair = unrepair;
    }

    public ShowVulStaticsResponse withExistedVulHosts(Integer existedVulHosts) {
        this.existedVulHosts = existedVulHosts;
        return this;
    }

    /**
     * 存在漏洞的服务器数
     * minimum: 0
     * maximum: 2147483647
     * @return existedVulHosts
     */
    public Integer getExistedVulHosts() {
        return existedVulHosts;
    }

    public void setExistedVulHosts(Integer existedVulHosts) {
        this.existedVulHosts = existedVulHosts;
    }

    public ShowVulStaticsResponse withTodayHandle(Integer todayHandle) {
        this.todayHandle = todayHandle;
        return this;
    }

    /**
     * 今日处理漏洞数
     * minimum: 0
     * maximum: 2147483647
     * @return todayHandle
     */
    public Integer getTodayHandle() {
        return todayHandle;
    }

    public void setTodayHandle(Integer todayHandle) {
        this.todayHandle = todayHandle;
    }

    public ShowVulStaticsResponse withAllHandle(Integer allHandle) {
        this.allHandle = allHandle;
        return this;
    }

    /**
     * 累计处理漏洞数
     * minimum: 0
     * maximum: 2147483647
     * @return allHandle
     */
    public Integer getAllHandle() {
        return allHandle;
    }

    public void setAllHandle(Integer allHandle) {
        this.allHandle = allHandle;
    }

    public ShowVulStaticsResponse withSupported(Integer supported) {
        this.supported = supported;
        return this;
    }

    /**
     * 已支持漏洞数
     * minimum: 0
     * maximum: 2147483647
     * @return supported
     */
    public Integer getSupported() {
        return supported;
    }

    public void setSupported(Integer supported) {
        this.supported = supported;
    }

    public ShowVulStaticsResponse withVulLibraryUpdateTime(Long vulLibraryUpdateTime) {
        this.vulLibraryUpdateTime = vulLibraryUpdateTime;
        return this;
    }

    /**
     * 漏洞库更新时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return vulLibraryUpdateTime
     */
    public Long getVulLibraryUpdateTime() {
        return vulLibraryUpdateTime;
    }

    public void setVulLibraryUpdateTime(Long vulLibraryUpdateTime) {
        this.vulLibraryUpdateTime = vulLibraryUpdateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulStaticsResponse that = (ShowVulStaticsResponse) obj;
        return Objects.equals(this.needUrgentRepair, that.needUrgentRepair)
            && Objects.equals(this.unrepair, that.unrepair)
            && Objects.equals(this.existedVulHosts, that.existedVulHosts)
            && Objects.equals(this.todayHandle, that.todayHandle) && Objects.equals(this.allHandle, that.allHandle)
            && Objects.equals(this.supported, that.supported)
            && Objects.equals(this.vulLibraryUpdateTime, that.vulLibraryUpdateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(needUrgentRepair, unrepair, existedVulHosts, todayHandle, allHandle, supported, vulLibraryUpdateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulStaticsResponse {\n");
        sb.append("    needUrgentRepair: ").append(toIndentedString(needUrgentRepair)).append("\n");
        sb.append("    unrepair: ").append(toIndentedString(unrepair)).append("\n");
        sb.append("    existedVulHosts: ").append(toIndentedString(existedVulHosts)).append("\n");
        sb.append("    todayHandle: ").append(toIndentedString(todayHandle)).append("\n");
        sb.append("    allHandle: ").append(toIndentedString(allHandle)).append("\n");
        sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
        sb.append("    vulLibraryUpdateTime: ").append(toIndentedString(vulLibraryUpdateTime)).append("\n");
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
