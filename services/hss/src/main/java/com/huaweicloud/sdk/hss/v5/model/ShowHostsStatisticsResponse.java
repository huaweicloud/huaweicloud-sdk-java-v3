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
public class ShowHostsStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotected_num")

    private Integer unprotectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_installed_num")

    private Integer notInstalledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_failed_num")

    private Integer installedFailedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_online_num")

    private Integer notOnlineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_basic_num")

    private Integer versionBasicNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_advanced_num")

    private Integer versionAdvancedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_enterprise_num")

    private Integer versionEnterpriseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_premium_num")

    private Integer versionPremiumNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_wtp_num")

    private Integer versionWtpNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_container_num")

    private Integer versionContainerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_num")

    private Integer hostGroupNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_num")

    private Integer serverGroupNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value_list")

    private List<AssetValueHostNumInfo> assetValueList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_list")

    private List<ServerGroupItem> serverGroupList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_host_num")

    private Integer ignoreHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_num")

    private Integer protectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_interrupt_num")

    private Integer protectInterruptNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_num")

    private Integer idleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "premium_non_sp_num")

    private Integer premiumNonSpNum;

    public ShowHostsStatisticsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 服务器总数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ShowHostsStatisticsResponse withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * 有风险服务器数
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public ShowHostsStatisticsResponse withUnprotectedNum(Integer unprotectedNum) {
        this.unprotectedNum = unprotectedNum;
        return this;
    }

    /**
     * 未防护服务器数
     * @return unprotectedNum
     */
    public Integer getUnprotectedNum() {
        return unprotectedNum;
    }

    public void setUnprotectedNum(Integer unprotectedNum) {
        this.unprotectedNum = unprotectedNum;
    }

    public ShowHostsStatisticsResponse withNotInstalledNum(Integer notInstalledNum) {
        this.notInstalledNum = notInstalledNum;
        return this;
    }

    /**
     * Agent未安装数
     * @return notInstalledNum
     */
    public Integer getNotInstalledNum() {
        return notInstalledNum;
    }

    public void setNotInstalledNum(Integer notInstalledNum) {
        this.notInstalledNum = notInstalledNum;
    }

    public ShowHostsStatisticsResponse withInstalledFailedNum(Integer installedFailedNum) {
        this.installedFailedNum = installedFailedNum;
        return this;
    }

    /**
     * Agent安装失败数
     * @return installedFailedNum
     */
    public Integer getInstalledFailedNum() {
        return installedFailedNum;
    }

    public void setInstalledFailedNum(Integer installedFailedNum) {
        this.installedFailedNum = installedFailedNum;
    }

    public ShowHostsStatisticsResponse withNotOnlineNum(Integer notOnlineNum) {
        this.notOnlineNum = notOnlineNum;
        return this;
    }

    /**
     * Agent不在线数
     * @return notOnlineNum
     */
    public Integer getNotOnlineNum() {
        return notOnlineNum;
    }

    public void setNotOnlineNum(Integer notOnlineNum) {
        this.notOnlineNum = notOnlineNum;
    }

    public ShowHostsStatisticsResponse withVersionBasicNum(Integer versionBasicNum) {
        this.versionBasicNum = versionBasicNum;
        return this;
    }

    /**
     * 开启基础版服务器数
     * @return versionBasicNum
     */
    public Integer getVersionBasicNum() {
        return versionBasicNum;
    }

    public void setVersionBasicNum(Integer versionBasicNum) {
        this.versionBasicNum = versionBasicNum;
    }

    public ShowHostsStatisticsResponse withVersionAdvancedNum(Integer versionAdvancedNum) {
        this.versionAdvancedNum = versionAdvancedNum;
        return this;
    }

    /**
     * 开启专业版服务器数
     * @return versionAdvancedNum
     */
    public Integer getVersionAdvancedNum() {
        return versionAdvancedNum;
    }

    public void setVersionAdvancedNum(Integer versionAdvancedNum) {
        this.versionAdvancedNum = versionAdvancedNum;
    }

    public ShowHostsStatisticsResponse withVersionEnterpriseNum(Integer versionEnterpriseNum) {
        this.versionEnterpriseNum = versionEnterpriseNum;
        return this;
    }

    /**
     * 开启企业版服务器数
     * @return versionEnterpriseNum
     */
    public Integer getVersionEnterpriseNum() {
        return versionEnterpriseNum;
    }

    public void setVersionEnterpriseNum(Integer versionEnterpriseNum) {
        this.versionEnterpriseNum = versionEnterpriseNum;
    }

    public ShowHostsStatisticsResponse withVersionPremiumNum(Integer versionPremiumNum) {
        this.versionPremiumNum = versionPremiumNum;
        return this;
    }

    /**
     * 开启旗舰版服务器数
     * @return versionPremiumNum
     */
    public Integer getVersionPremiumNum() {
        return versionPremiumNum;
    }

    public void setVersionPremiumNum(Integer versionPremiumNum) {
        this.versionPremiumNum = versionPremiumNum;
    }

    public ShowHostsStatisticsResponse withVersionWtpNum(Integer versionWtpNum) {
        this.versionWtpNum = versionWtpNum;
        return this;
    }

    /**
     * 开启网页防篡改版服务器数
     * @return versionWtpNum
     */
    public Integer getVersionWtpNum() {
        return versionWtpNum;
    }

    public void setVersionWtpNum(Integer versionWtpNum) {
        this.versionWtpNum = versionWtpNum;
    }

    public ShowHostsStatisticsResponse withVersionContainerNum(Integer versionContainerNum) {
        this.versionContainerNum = versionContainerNum;
        return this;
    }

    /**
     * 开启容器版服务器数
     * @return versionContainerNum
     */
    public Integer getVersionContainerNum() {
        return versionContainerNum;
    }

    public void setVersionContainerNum(Integer versionContainerNum) {
        this.versionContainerNum = versionContainerNum;
    }

    public ShowHostsStatisticsResponse withHostGroupNum(Integer hostGroupNum) {
        this.hostGroupNum = hostGroupNum;
        return this;
    }

    /**
     * 服务器组总数
     * @return hostGroupNum
     */
    public Integer getHostGroupNum() {
        return hostGroupNum;
    }

    public void setHostGroupNum(Integer hostGroupNum) {
        this.hostGroupNum = hostGroupNum;
    }

    public ShowHostsStatisticsResponse withServerGroupNum(Integer serverGroupNum) {
        this.serverGroupNum = serverGroupNum;
        return this;
    }

    /**
     * 资产服务器组数量
     * @return serverGroupNum
     */
    public Integer getServerGroupNum() {
        return serverGroupNum;
    }

    public void setServerGroupNum(Integer serverGroupNum) {
        this.serverGroupNum = serverGroupNum;
    }

    public ShowHostsStatisticsResponse withAssetValueList(List<AssetValueHostNumInfo> assetValueList) {
        this.assetValueList = assetValueList;
        return this;
    }

    public ShowHostsStatisticsResponse addAssetValueListItem(AssetValueHostNumInfo assetValueListItem) {
        if (this.assetValueList == null) {
            this.assetValueList = new ArrayList<>();
        }
        this.assetValueList.add(assetValueListItem);
        return this;
    }

    public ShowHostsStatisticsResponse withAssetValueList(Consumer<List<AssetValueHostNumInfo>> assetValueListSetter) {
        if (this.assetValueList == null) {
            this.assetValueList = new ArrayList<>();
        }
        assetValueListSetter.accept(this.assetValueList);
        return this;
    }

    /**
     * 资产重要性列表
     * @return assetValueList
     */
    public List<AssetValueHostNumInfo> getAssetValueList() {
        return assetValueList;
    }

    public void setAssetValueList(List<AssetValueHostNumInfo> assetValueList) {
        this.assetValueList = assetValueList;
    }

    public ShowHostsStatisticsResponse withServerGroupList(List<ServerGroupItem> serverGroupList) {
        this.serverGroupList = serverGroupList;
        return this;
    }

    public ShowHostsStatisticsResponse addServerGroupListItem(ServerGroupItem serverGroupListItem) {
        if (this.serverGroupList == null) {
            this.serverGroupList = new ArrayList<>();
        }
        this.serverGroupList.add(serverGroupListItem);
        return this;
    }

    public ShowHostsStatisticsResponse withServerGroupList(Consumer<List<ServerGroupItem>> serverGroupListSetter) {
        if (this.serverGroupList == null) {
            this.serverGroupList = new ArrayList<>();
        }
        serverGroupListSetter.accept(this.serverGroupList);
        return this;
    }

    /**
     * 服务器组列表
     * @return serverGroupList
     */
    public List<ServerGroupItem> getServerGroupList() {
        return serverGroupList;
    }

    public void setServerGroupList(List<ServerGroupItem> serverGroupList) {
        this.serverGroupList = serverGroupList;
    }

    public ShowHostsStatisticsResponse withIgnoreHostNum(Integer ignoreHostNum) {
        this.ignoreHostNum = ignoreHostNum;
        return this;
    }

    /**
     * 已忽略服务器数
     * @return ignoreHostNum
     */
    public Integer getIgnoreHostNum() {
        return ignoreHostNum;
    }

    public void setIgnoreHostNum(Integer ignoreHostNum) {
        this.ignoreHostNum = ignoreHostNum;
    }

    public ShowHostsStatisticsResponse withProtectedNum(Integer protectedNum) {
        this.protectedNum = protectedNum;
        return this;
    }

    /**
     * 防护中服务器数
     * @return protectedNum
     */
    public Integer getProtectedNum() {
        return protectedNum;
    }

    public void setProtectedNum(Integer protectedNum) {
        this.protectedNum = protectedNum;
    }

    public ShowHostsStatisticsResponse withProtectInterruptNum(Integer protectInterruptNum) {
        this.protectInterruptNum = protectInterruptNum;
        return this;
    }

    /**
     * 防护中断服务器数
     * @return protectInterruptNum
     */
    public Integer getProtectInterruptNum() {
        return protectInterruptNum;
    }

    public void setProtectInterruptNum(Integer protectInterruptNum) {
        this.protectInterruptNum = protectInterruptNum;
    }

    public ShowHostsStatisticsResponse withIdleNum(Integer idleNum) {
        this.idleNum = idleNum;
        return this;
    }

    /**
     * 空闲配额数
     * @return idleNum
     */
    public Integer getIdleNum() {
        return idleNum;
    }

    public void setIdleNum(Integer idleNum) {
        this.idleNum = idleNum;
    }

    public ShowHostsStatisticsResponse withPremiumNonSpNum(Integer premiumNonSpNum) {
        this.premiumNonSpNum = premiumNonSpNum;
        return this;
    }

    /**
     * 旗舰版主机未开启agent自保护数
     * @return premiumNonSpNum
     */
    public Integer getPremiumNonSpNum() {
        return premiumNonSpNum;
    }

    public void setPremiumNonSpNum(Integer premiumNonSpNum) {
        this.premiumNonSpNum = premiumNonSpNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHostsStatisticsResponse that = (ShowHostsStatisticsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.riskNum, that.riskNum)
            && Objects.equals(this.unprotectedNum, that.unprotectedNum)
            && Objects.equals(this.notInstalledNum, that.notInstalledNum)
            && Objects.equals(this.installedFailedNum, that.installedFailedNum)
            && Objects.equals(this.notOnlineNum, that.notOnlineNum)
            && Objects.equals(this.versionBasicNum, that.versionBasicNum)
            && Objects.equals(this.versionAdvancedNum, that.versionAdvancedNum)
            && Objects.equals(this.versionEnterpriseNum, that.versionEnterpriseNum)
            && Objects.equals(this.versionPremiumNum, that.versionPremiumNum)
            && Objects.equals(this.versionWtpNum, that.versionWtpNum)
            && Objects.equals(this.versionContainerNum, that.versionContainerNum)
            && Objects.equals(this.hostGroupNum, that.hostGroupNum)
            && Objects.equals(this.serverGroupNum, that.serverGroupNum)
            && Objects.equals(this.assetValueList, that.assetValueList)
            && Objects.equals(this.serverGroupList, that.serverGroupList)
            && Objects.equals(this.ignoreHostNum, that.ignoreHostNum)
            && Objects.equals(this.protectedNum, that.protectedNum)
            && Objects.equals(this.protectInterruptNum, that.protectInterruptNum)
            && Objects.equals(this.idleNum, that.idleNum) && Objects.equals(this.premiumNonSpNum, that.premiumNonSpNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum,
            riskNum,
            unprotectedNum,
            notInstalledNum,
            installedFailedNum,
            notOnlineNum,
            versionBasicNum,
            versionAdvancedNum,
            versionEnterpriseNum,
            versionPremiumNum,
            versionWtpNum,
            versionContainerNum,
            hostGroupNum,
            serverGroupNum,
            assetValueList,
            serverGroupList,
            ignoreHostNum,
            protectedNum,
            protectInterruptNum,
            idleNum,
            premiumNonSpNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHostsStatisticsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    unprotectedNum: ").append(toIndentedString(unprotectedNum)).append("\n");
        sb.append("    notInstalledNum: ").append(toIndentedString(notInstalledNum)).append("\n");
        sb.append("    installedFailedNum: ").append(toIndentedString(installedFailedNum)).append("\n");
        sb.append("    notOnlineNum: ").append(toIndentedString(notOnlineNum)).append("\n");
        sb.append("    versionBasicNum: ").append(toIndentedString(versionBasicNum)).append("\n");
        sb.append("    versionAdvancedNum: ").append(toIndentedString(versionAdvancedNum)).append("\n");
        sb.append("    versionEnterpriseNum: ").append(toIndentedString(versionEnterpriseNum)).append("\n");
        sb.append("    versionPremiumNum: ").append(toIndentedString(versionPremiumNum)).append("\n");
        sb.append("    versionWtpNum: ").append(toIndentedString(versionWtpNum)).append("\n");
        sb.append("    versionContainerNum: ").append(toIndentedString(versionContainerNum)).append("\n");
        sb.append("    hostGroupNum: ").append(toIndentedString(hostGroupNum)).append("\n");
        sb.append("    serverGroupNum: ").append(toIndentedString(serverGroupNum)).append("\n");
        sb.append("    assetValueList: ").append(toIndentedString(assetValueList)).append("\n");
        sb.append("    serverGroupList: ").append(toIndentedString(serverGroupList)).append("\n");
        sb.append("    ignoreHostNum: ").append(toIndentedString(ignoreHostNum)).append("\n");
        sb.append("    protectedNum: ").append(toIndentedString(protectedNum)).append("\n");
        sb.append("    protectInterruptNum: ").append(toIndentedString(protectInterruptNum)).append("\n");
        sb.append("    idleNum: ").append(toIndentedString(idleNum)).append("\n");
        sb.append("    premiumNonSpNum: ").append(toIndentedString(premiumNonSpNum)).append("\n");
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
