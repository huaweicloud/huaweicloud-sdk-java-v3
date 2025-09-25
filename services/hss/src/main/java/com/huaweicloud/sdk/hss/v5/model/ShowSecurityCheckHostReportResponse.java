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
public class ShowSecurityCheckHostReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_result")

    private SecurityCheckHostResultResponseInfo hostResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_period_start")

    private Long scanPeriodStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_period_end")

    private Long scanPeriodEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_rating")

    private Integer riskRating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free")

    private Boolean free;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_num_info")

    private SecurityCheckRiskNumInfo eventNumInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_info")

    private SecurityCheckRiskNumInfo vulNumInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_num_info")

    private SecurityCheckRiskNumInfo baselineNumInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_num_info")

    private SecurityCheckRiskNumInfo assetNumInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_change_num")

    private Integer assetChangeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_num")

    private Integer appNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_num")

    private Integer portNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_list")

    private List<SecurityCheckRiskEventInfo> eventList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_list")

    private List<SecurityCheckVulInfo> vulList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_config_list")

    private List<SecurityConfigInfo> securityConfigList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_config_item_list")

    private List<SecurityConfigItemInfo> securityConfigItemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_policy_list")

    private List<SecurityConfigPwdPolicyInfo> pwdPolicyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_list")

    private List<SecurityConfigWeakPwdInfo> weakPwdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_change_list")

    private List<SecurityConfigUserChangeInfo> userChangeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_list")

    private List<SecurityConfigPortInfo> portList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_list")

    private List<AppResponseInfo> appList = null;

    public ShowSecurityCheckHostReportResponse withHostResult(SecurityCheckHostResultResponseInfo hostResult) {
        this.hostResult = hostResult;
        return this;
    }

    public ShowSecurityCheckHostReportResponse withHostResult(
        Consumer<SecurityCheckHostResultResponseInfo> hostResultSetter) {
        if (this.hostResult == null) {
            this.hostResult = new SecurityCheckHostResultResponseInfo();
            hostResultSetter.accept(this.hostResult);
        }

        return this;
    }

    /**
     * Get hostResult
     * @return hostResult
     */
    public SecurityCheckHostResultResponseInfo getHostResult() {
        return hostResult;
    }

    public void setHostResult(SecurityCheckHostResultResponseInfo hostResult) {
        this.hostResult = hostResult;
    }

    public ShowSecurityCheckHostReportResponse withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * **参数解释**： 服务器运行状态 **取值范围**： - ACTIVE：运行中 - SHUTOFF：关机 - BUILDING：创建中 - ERROR：故障 
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ShowSecurityCheckHostReportResponse withScanPeriodStart(Long scanPeriodStart) {
        this.scanPeriodStart = scanPeriodStart;
        return this;
    }

    /**
     * **参数解释**： 体检周期开始时间 **取值范围**： 不涉及 
     * @return scanPeriodStart
     */
    public Long getScanPeriodStart() {
        return scanPeriodStart;
    }

    public void setScanPeriodStart(Long scanPeriodStart) {
        this.scanPeriodStart = scanPeriodStart;
    }

    public ShowSecurityCheckHostReportResponse withScanPeriodEnd(Long scanPeriodEnd) {
        this.scanPeriodEnd = scanPeriodEnd;
        return this;
    }

    /**
     * **参数解释**： 体检周期结束时间 **取值范围**： 不涉及 
     * @return scanPeriodEnd
     */
    public Long getScanPeriodEnd() {
        return scanPeriodEnd;
    }

    public void setScanPeriodEnd(Long scanPeriodEnd) {
        this.scanPeriodEnd = scanPeriodEnd;
    }

    public ShowSecurityCheckHostReportResponse withRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
        return this;
    }

    /**
     * **参数解释**： 风险评分 **取值范围**： 不涉及 
     * @return riskRating
     */
    public Integer getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
    }

    public ShowSecurityCheckHostReportResponse withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 风险级别 **取值范围**： - high：高危 - medium：中危 - low：低危 - safe：安全，无风险 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ShowSecurityCheckHostReportResponse withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * **参数解释**： 安全风险数量 **取值范围**： 不涉及 
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public ShowSecurityCheckHostReportResponse withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最新检测时间 **取值范围**： 不涉及 
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public ShowSecurityCheckHostReportResponse withFree(Boolean free) {
        this.free = free;
        return this;
    }

    /**
     * **参数解释**: 是否是免费安全体检的报告 **取值范围**: - true：免费安全体检的报告 - false：非免费安全体检的报告 
     * @return free
     */
    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public ShowSecurityCheckHostReportResponse withEventNumInfo(SecurityCheckRiskNumInfo eventNumInfo) {
        this.eventNumInfo = eventNumInfo;
        return this;
    }

    public ShowSecurityCheckHostReportResponse withEventNumInfo(Consumer<SecurityCheckRiskNumInfo> eventNumInfoSetter) {
        if (this.eventNumInfo == null) {
            this.eventNumInfo = new SecurityCheckRiskNumInfo();
            eventNumInfoSetter.accept(this.eventNumInfo);
        }

        return this;
    }

    /**
     * Get eventNumInfo
     * @return eventNumInfo
     */
    public SecurityCheckRiskNumInfo getEventNumInfo() {
        return eventNumInfo;
    }

    public void setEventNumInfo(SecurityCheckRiskNumInfo eventNumInfo) {
        this.eventNumInfo = eventNumInfo;
    }

    public ShowSecurityCheckHostReportResponse withVulNumInfo(SecurityCheckRiskNumInfo vulNumInfo) {
        this.vulNumInfo = vulNumInfo;
        return this;
    }

    public ShowSecurityCheckHostReportResponse withVulNumInfo(Consumer<SecurityCheckRiskNumInfo> vulNumInfoSetter) {
        if (this.vulNumInfo == null) {
            this.vulNumInfo = new SecurityCheckRiskNumInfo();
            vulNumInfoSetter.accept(this.vulNumInfo);
        }

        return this;
    }

    /**
     * Get vulNumInfo
     * @return vulNumInfo
     */
    public SecurityCheckRiskNumInfo getVulNumInfo() {
        return vulNumInfo;
    }

    public void setVulNumInfo(SecurityCheckRiskNumInfo vulNumInfo) {
        this.vulNumInfo = vulNumInfo;
    }

    public ShowSecurityCheckHostReportResponse withBaselineNumInfo(SecurityCheckRiskNumInfo baselineNumInfo) {
        this.baselineNumInfo = baselineNumInfo;
        return this;
    }

    public ShowSecurityCheckHostReportResponse withBaselineNumInfo(
        Consumer<SecurityCheckRiskNumInfo> baselineNumInfoSetter) {
        if (this.baselineNumInfo == null) {
            this.baselineNumInfo = new SecurityCheckRiskNumInfo();
            baselineNumInfoSetter.accept(this.baselineNumInfo);
        }

        return this;
    }

    /**
     * Get baselineNumInfo
     * @return baselineNumInfo
     */
    public SecurityCheckRiskNumInfo getBaselineNumInfo() {
        return baselineNumInfo;
    }

    public void setBaselineNumInfo(SecurityCheckRiskNumInfo baselineNumInfo) {
        this.baselineNumInfo = baselineNumInfo;
    }

    public ShowSecurityCheckHostReportResponse withAssetNumInfo(SecurityCheckRiskNumInfo assetNumInfo) {
        this.assetNumInfo = assetNumInfo;
        return this;
    }

    public ShowSecurityCheckHostReportResponse withAssetNumInfo(Consumer<SecurityCheckRiskNumInfo> assetNumInfoSetter) {
        if (this.assetNumInfo == null) {
            this.assetNumInfo = new SecurityCheckRiskNumInfo();
            assetNumInfoSetter.accept(this.assetNumInfo);
        }

        return this;
    }

    /**
     * Get assetNumInfo
     * @return assetNumInfo
     */
    public SecurityCheckRiskNumInfo getAssetNumInfo() {
        return assetNumInfo;
    }

    public void setAssetNumInfo(SecurityCheckRiskNumInfo assetNumInfo) {
        this.assetNumInfo = assetNumInfo;
    }

    public ShowSecurityCheckHostReportResponse withAssetChangeNum(Integer assetChangeNum) {
        this.assetChangeNum = assetChangeNum;
        return this;
    }

    /**
     * **参数解释**： 主机资产变动记录数量 **取值范围**： 不涉及 
     * @return assetChangeNum
     */
    public Integer getAssetChangeNum() {
        return assetChangeNum;
    }

    public void setAssetChangeNum(Integer assetChangeNum) {
        this.assetChangeNum = assetChangeNum;
    }

    public ShowSecurityCheckHostReportResponse withAppNum(Integer appNum) {
        this.appNum = appNum;
        return this;
    }

    /**
     * **参数解释**： 软件数量 **取值范围**： 不涉及 
     * @return appNum
     */
    public Integer getAppNum() {
        return appNum;
    }

    public void setAppNum(Integer appNum) {
        this.appNum = appNum;
    }

    public ShowSecurityCheckHostReportResponse withPortNum(Integer portNum) {
        this.portNum = portNum;
        return this;
    }

    /**
     * **参数解释**： 危险端口数量 **取值范围**： 不涉及 
     * @return portNum
     */
    public Integer getPortNum() {
        return portNum;
    }

    public void setPortNum(Integer portNum) {
        this.portNum = portNum;
    }

    public ShowSecurityCheckHostReportResponse withEventList(List<SecurityCheckRiskEventInfo> eventList) {
        this.eventList = eventList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addEventListItem(SecurityCheckRiskEventInfo eventListItem) {
        if (this.eventList == null) {
            this.eventList = new ArrayList<>();
        }
        this.eventList.add(eventListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withEventList(
        Consumer<List<SecurityCheckRiskEventInfo>> eventListSetter) {
        if (this.eventList == null) {
            this.eventList = new ArrayList<>();
        }
        eventListSetter.accept(this.eventList);
        return this;
    }

    /**
     * **参数解释**： 入侵事件列表 **取值范围**： 不涉及 
     * @return eventList
     */
    public List<SecurityCheckRiskEventInfo> getEventList() {
        return eventList;
    }

    public void setEventList(List<SecurityCheckRiskEventInfo> eventList) {
        this.eventList = eventList;
    }

    public ShowSecurityCheckHostReportResponse withVulList(List<SecurityCheckVulInfo> vulList) {
        this.vulList = vulList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addVulListItem(SecurityCheckVulInfo vulListItem) {
        if (this.vulList == null) {
            this.vulList = new ArrayList<>();
        }
        this.vulList.add(vulListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withVulList(Consumer<List<SecurityCheckVulInfo>> vulListSetter) {
        if (this.vulList == null) {
            this.vulList = new ArrayList<>();
        }
        vulListSetter.accept(this.vulList);
        return this;
    }

    /**
     * **参数解释**： 漏洞列表 **取值范围**： 不涉及 
     * @return vulList
     */
    public List<SecurityCheckVulInfo> getVulList() {
        return vulList;
    }

    public void setVulList(List<SecurityCheckVulInfo> vulList) {
        this.vulList = vulList;
    }

    public ShowSecurityCheckHostReportResponse withSecurityConfigList(List<SecurityConfigInfo> securityConfigList) {
        this.securityConfigList = securityConfigList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addSecurityConfigListItem(SecurityConfigInfo securityConfigListItem) {
        if (this.securityConfigList == null) {
            this.securityConfigList = new ArrayList<>();
        }
        this.securityConfigList.add(securityConfigListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withSecurityConfigList(
        Consumer<List<SecurityConfigInfo>> securityConfigListSetter) {
        if (this.securityConfigList == null) {
            this.securityConfigList = new ArrayList<>();
        }
        securityConfigListSetter.accept(this.securityConfigList);
        return this;
    }

    /**
     * **参数解释**： 配置检测列表 **取值范围**： 不涉及 
     * @return securityConfigList
     */
    public List<SecurityConfigInfo> getSecurityConfigList() {
        return securityConfigList;
    }

    public void setSecurityConfigList(List<SecurityConfigInfo> securityConfigList) {
        this.securityConfigList = securityConfigList;
    }

    public ShowSecurityCheckHostReportResponse withSecurityConfigItemList(
        List<SecurityConfigItemInfo> securityConfigItemList) {
        this.securityConfigItemList = securityConfigItemList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addSecurityConfigItemListItem(
        SecurityConfigItemInfo securityConfigItemListItem) {
        if (this.securityConfigItemList == null) {
            this.securityConfigItemList = new ArrayList<>();
        }
        this.securityConfigItemList.add(securityConfigItemListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withSecurityConfigItemList(
        Consumer<List<SecurityConfigItemInfo>> securityConfigItemListSetter) {
        if (this.securityConfigItemList == null) {
            this.securityConfigItemList = new ArrayList<>();
        }
        securityConfigItemListSetter.accept(this.securityConfigItemList);
        return this;
    }

    /**
     * **参数解释**： 配置检查项列表 **取值范围**： 不涉及 
     * @return securityConfigItemList
     */
    public List<SecurityConfigItemInfo> getSecurityConfigItemList() {
        return securityConfigItemList;
    }

    public void setSecurityConfigItemList(List<SecurityConfigItemInfo> securityConfigItemList) {
        this.securityConfigItemList = securityConfigItemList;
    }

    public ShowSecurityCheckHostReportResponse withPwdPolicyList(List<SecurityConfigPwdPolicyInfo> pwdPolicyList) {
        this.pwdPolicyList = pwdPolicyList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addPwdPolicyListItem(SecurityConfigPwdPolicyInfo pwdPolicyListItem) {
        if (this.pwdPolicyList == null) {
            this.pwdPolicyList = new ArrayList<>();
        }
        this.pwdPolicyList.add(pwdPolicyListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withPwdPolicyList(
        Consumer<List<SecurityConfigPwdPolicyInfo>> pwdPolicyListSetter) {
        if (this.pwdPolicyList == null) {
            this.pwdPolicyList = new ArrayList<>();
        }
        pwdPolicyListSetter.accept(this.pwdPolicyList);
        return this;
    }

    /**
     * **参数解释**： 口令复杂度策略列表 **取值范围**： 不涉及 
     * @return pwdPolicyList
     */
    public List<SecurityConfigPwdPolicyInfo> getPwdPolicyList() {
        return pwdPolicyList;
    }

    public void setPwdPolicyList(List<SecurityConfigPwdPolicyInfo> pwdPolicyList) {
        this.pwdPolicyList = pwdPolicyList;
    }

    public ShowSecurityCheckHostReportResponse withWeakPwdList(List<SecurityConfigWeakPwdInfo> weakPwdList) {
        this.weakPwdList = weakPwdList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addWeakPwdListItem(SecurityConfigWeakPwdInfo weakPwdListItem) {
        if (this.weakPwdList == null) {
            this.weakPwdList = new ArrayList<>();
        }
        this.weakPwdList.add(weakPwdListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withWeakPwdList(
        Consumer<List<SecurityConfigWeakPwdInfo>> weakPwdListSetter) {
        if (this.weakPwdList == null) {
            this.weakPwdList = new ArrayList<>();
        }
        weakPwdListSetter.accept(this.weakPwdList);
        return this;
    }

    /**
     * **参数解释**： 经典弱口令列表 **取值范围**： 不涉及 
     * @return weakPwdList
     */
    public List<SecurityConfigWeakPwdInfo> getWeakPwdList() {
        return weakPwdList;
    }

    public void setWeakPwdList(List<SecurityConfigWeakPwdInfo> weakPwdList) {
        this.weakPwdList = weakPwdList;
    }

    public ShowSecurityCheckHostReportResponse withUserChangeList(List<SecurityConfigUserChangeInfo> userChangeList) {
        this.userChangeList = userChangeList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addUserChangeListItem(SecurityConfigUserChangeInfo userChangeListItem) {
        if (this.userChangeList == null) {
            this.userChangeList = new ArrayList<>();
        }
        this.userChangeList.add(userChangeListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withUserChangeList(
        Consumer<List<SecurityConfigUserChangeInfo>> userChangeListSetter) {
        if (this.userChangeList == null) {
            this.userChangeList = new ArrayList<>();
        }
        userChangeListSetter.accept(this.userChangeList);
        return this;
    }

    /**
     * **参数解释**： 主机账户的历史变动记录 **取值范围**： 不涉及 
     * @return userChangeList
     */
    public List<SecurityConfigUserChangeInfo> getUserChangeList() {
        return userChangeList;
    }

    public void setUserChangeList(List<SecurityConfigUserChangeInfo> userChangeList) {
        this.userChangeList = userChangeList;
    }

    public ShowSecurityCheckHostReportResponse withPortList(List<SecurityConfigPortInfo> portList) {
        this.portList = portList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addPortListItem(SecurityConfigPortInfo portListItem) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        this.portList.add(portListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withPortList(Consumer<List<SecurityConfigPortInfo>> portListSetter) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        portListSetter.accept(this.portList);
        return this;
    }

    /**
     * **参数解释**： 危险开放端口列表 **取值范围**： 不涉及 
     * @return portList
     */
    public List<SecurityConfigPortInfo> getPortList() {
        return portList;
    }

    public void setPortList(List<SecurityConfigPortInfo> portList) {
        this.portList = portList;
    }

    public ShowSecurityCheckHostReportResponse withAppList(List<AppResponseInfo> appList) {
        this.appList = appList;
        return this;
    }

    public ShowSecurityCheckHostReportResponse addAppListItem(AppResponseInfo appListItem) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        this.appList.add(appListItem);
        return this;
    }

    public ShowSecurityCheckHostReportResponse withAppList(Consumer<List<AppResponseInfo>> appListSetter) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        appListSetter.accept(this.appList);
        return this;
    }

    /**
     * **参数解释**： 资产的软件列表 **取值范围**： 不涉及 
     * @return appList
     */
    public List<AppResponseInfo> getAppList() {
        return appList;
    }

    public void setAppList(List<AppResponseInfo> appList) {
        this.appList = appList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityCheckHostReportResponse that = (ShowSecurityCheckHostReportResponse) obj;
        return Objects.equals(this.hostResult, that.hostResult) && Objects.equals(this.hostStatus, that.hostStatus)
            && Objects.equals(this.scanPeriodStart, that.scanPeriodStart)
            && Objects.equals(this.scanPeriodEnd, that.scanPeriodEnd)
            && Objects.equals(this.riskRating, that.riskRating) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.riskNum, that.riskNum) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.free, that.free) && Objects.equals(this.eventNumInfo, that.eventNumInfo)
            && Objects.equals(this.vulNumInfo, that.vulNumInfo)
            && Objects.equals(this.baselineNumInfo, that.baselineNumInfo)
            && Objects.equals(this.assetNumInfo, that.assetNumInfo)
            && Objects.equals(this.assetChangeNum, that.assetChangeNum) && Objects.equals(this.appNum, that.appNum)
            && Objects.equals(this.portNum, that.portNum) && Objects.equals(this.eventList, that.eventList)
            && Objects.equals(this.vulList, that.vulList)
            && Objects.equals(this.securityConfigList, that.securityConfigList)
            && Objects.equals(this.securityConfigItemList, that.securityConfigItemList)
            && Objects.equals(this.pwdPolicyList, that.pwdPolicyList)
            && Objects.equals(this.weakPwdList, that.weakPwdList)
            && Objects.equals(this.userChangeList, that.userChangeList) && Objects.equals(this.portList, that.portList)
            && Objects.equals(this.appList, that.appList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostResult,
            hostStatus,
            scanPeriodStart,
            scanPeriodEnd,
            riskRating,
            severity,
            riskNum,
            scanTime,
            free,
            eventNumInfo,
            vulNumInfo,
            baselineNumInfo,
            assetNumInfo,
            assetChangeNum,
            appNum,
            portNum,
            eventList,
            vulList,
            securityConfigList,
            securityConfigItemList,
            pwdPolicyList,
            weakPwdList,
            userChangeList,
            portList,
            appList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityCheckHostReportResponse {\n");
        sb.append("    hostResult: ").append(toIndentedString(hostResult)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    scanPeriodStart: ").append(toIndentedString(scanPeriodStart)).append("\n");
        sb.append("    scanPeriodEnd: ").append(toIndentedString(scanPeriodEnd)).append("\n");
        sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    free: ").append(toIndentedString(free)).append("\n");
        sb.append("    eventNumInfo: ").append(toIndentedString(eventNumInfo)).append("\n");
        sb.append("    vulNumInfo: ").append(toIndentedString(vulNumInfo)).append("\n");
        sb.append("    baselineNumInfo: ").append(toIndentedString(baselineNumInfo)).append("\n");
        sb.append("    assetNumInfo: ").append(toIndentedString(assetNumInfo)).append("\n");
        sb.append("    assetChangeNum: ").append(toIndentedString(assetChangeNum)).append("\n");
        sb.append("    appNum: ").append(toIndentedString(appNum)).append("\n");
        sb.append("    portNum: ").append(toIndentedString(portNum)).append("\n");
        sb.append("    eventList: ").append(toIndentedString(eventList)).append("\n");
        sb.append("    vulList: ").append(toIndentedString(vulList)).append("\n");
        sb.append("    securityConfigList: ").append(toIndentedString(securityConfigList)).append("\n");
        sb.append("    securityConfigItemList: ").append(toIndentedString(securityConfigItemList)).append("\n");
        sb.append("    pwdPolicyList: ").append(toIndentedString(pwdPolicyList)).append("\n");
        sb.append("    weakPwdList: ").append(toIndentedString(weakPwdList)).append("\n");
        sb.append("    userChangeList: ").append(toIndentedString(userChangeList)).append("\n");
        sb.append("    portList: ").append(toIndentedString(portList)).append("\n");
        sb.append("    appList: ").append(toIndentedString(appList)).append("\n");
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
