package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 报告内容订阅，包含安全报告的各类统计数据详情。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class SecurityReportContentResponseReportContentSubscriptionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview_statistics_list_info")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoOverviewStatisticsListInfo> overviewStatisticsListInfo =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_statistics_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoRequestStatisticsInfoList> requestStatisticsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps_statistics_info")

    private SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo qpsStatisticsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_statistics_info")

    private SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo bandwidthStatisticsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_code_statistics_info")

    private SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo responseCodeStatisticsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type_distribution_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoAttackTypeDistributionInfoList> attackTypeDistributionInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attacked_domains_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedDomainsInfoList> topAttackedDomainsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attack_source_ips_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceIpsInfoList> topAttackSourceIpsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attacked_urls_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedUrlsInfoList> topAttackedUrlsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attack_source_locations_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceLocationsInfoList> topAttackSourceLocationsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_abnormal_urls_info")

    private SecurityReportContentResponseReportContentSubscriptionInfoTopAbnormalUrlsInfo topAbnormalUrlsInfo;

    public SecurityReportContentResponseReportContentSubscriptionInfo withOverviewStatisticsListInfo(
        List<SecurityReportContentResponseReportContentSubscriptionInfoOverviewStatisticsListInfo> overviewStatisticsListInfo) {
        this.overviewStatisticsListInfo = overviewStatisticsListInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo addOverviewStatisticsListInfoItem(
        SecurityReportContentResponseReportContentSubscriptionInfoOverviewStatisticsListInfo overviewStatisticsListInfoItem) {
        if (this.overviewStatisticsListInfo == null) {
            this.overviewStatisticsListInfo = new ArrayList<>();
        }
        this.overviewStatisticsListInfo.add(overviewStatisticsListInfoItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withOverviewStatisticsListInfo(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoOverviewStatisticsListInfo>> overviewStatisticsListInfoSetter) {
        if (this.overviewStatisticsListInfo == null) {
            this.overviewStatisticsListInfo = new ArrayList<>();
        }
        overviewStatisticsListInfoSetter.accept(this.overviewStatisticsListInfo);
        return this;
    }

    /**
     * **参数解释：** 总览统计信息，包含各维度的汇总统计数据及TOP域名详情。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return overviewStatisticsListInfo
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoOverviewStatisticsListInfo> getOverviewStatisticsListInfo() {
        return overviewStatisticsListInfo;
    }

    public void setOverviewStatisticsListInfo(
        List<SecurityReportContentResponseReportContentSubscriptionInfoOverviewStatisticsListInfo> overviewStatisticsListInfo) {
        this.overviewStatisticsListInfo = overviewStatisticsListInfo;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withRequestStatisticsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoRequestStatisticsInfoList> requestStatisticsInfoList) {
        this.requestStatisticsInfoList = requestStatisticsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo addRequestStatisticsInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoRequestStatisticsInfoList requestStatisticsInfoListItem) {
        if (this.requestStatisticsInfoList == null) {
            this.requestStatisticsInfoList = new ArrayList<>();
        }
        this.requestStatisticsInfoList.add(requestStatisticsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withRequestStatisticsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoRequestStatisticsInfoList>> requestStatisticsInfoListSetter) {
        if (this.requestStatisticsInfoList == null) {
            this.requestStatisticsInfoList = new ArrayList<>();
        }
        requestStatisticsInfoListSetter.accept(this.requestStatisticsInfoList);
        return this;
    }

    /**
     * **参数解释：** 请求次数统计信息，包含各维度按时间线的请求数量统计。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return requestStatisticsInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoRequestStatisticsInfoList> getRequestStatisticsInfoList() {
        return requestStatisticsInfoList;
    }

    public void setRequestStatisticsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoRequestStatisticsInfoList> requestStatisticsInfoList) {
        this.requestStatisticsInfoList = requestStatisticsInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withQpsStatisticsInfo(
        SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo qpsStatisticsInfo) {
        this.qpsStatisticsInfo = qpsStatisticsInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withQpsStatisticsInfo(
        Consumer<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo> qpsStatisticsInfoSetter) {
        if (this.qpsStatisticsInfo == null) {
            this.qpsStatisticsInfo = new SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo();
            qpsStatisticsInfoSetter.accept(this.qpsStatisticsInfo);
        }

        return this;
    }

    /**
     * Get qpsStatisticsInfo
     * @return qpsStatisticsInfo
     */
    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo getQpsStatisticsInfo() {
        return qpsStatisticsInfo;
    }

    public void setQpsStatisticsInfo(
        SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo qpsStatisticsInfo) {
        this.qpsStatisticsInfo = qpsStatisticsInfo;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withBandwidthStatisticsInfo(
        SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo bandwidthStatisticsInfo) {
        this.bandwidthStatisticsInfo = bandwidthStatisticsInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withBandwidthStatisticsInfo(
        Consumer<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo> bandwidthStatisticsInfoSetter) {
        if (this.bandwidthStatisticsInfo == null) {
            this.bandwidthStatisticsInfo =
                new SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo();
            bandwidthStatisticsInfoSetter.accept(this.bandwidthStatisticsInfo);
        }

        return this;
    }

    /**
     * Get bandwidthStatisticsInfo
     * @return bandwidthStatisticsInfo
     */
    public SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo getBandwidthStatisticsInfo() {
        return bandwidthStatisticsInfo;
    }

    public void setBandwidthStatisticsInfo(
        SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo bandwidthStatisticsInfo) {
        this.bandwidthStatisticsInfo = bandwidthStatisticsInfo;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withResponseCodeStatisticsInfo(
        SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo responseCodeStatisticsInfo) {
        this.responseCodeStatisticsInfo = responseCodeStatisticsInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withResponseCodeStatisticsInfo(
        Consumer<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo> responseCodeStatisticsInfoSetter) {
        if (this.responseCodeStatisticsInfo == null) {
            this.responseCodeStatisticsInfo =
                new SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo();
            responseCodeStatisticsInfoSetter.accept(this.responseCodeStatisticsInfo);
        }

        return this;
    }

    /**
     * Get responseCodeStatisticsInfo
     * @return responseCodeStatisticsInfo
     */
    public SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo getResponseCodeStatisticsInfo() {
        return responseCodeStatisticsInfo;
    }

    public void setResponseCodeStatisticsInfo(
        SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo responseCodeStatisticsInfo) {
        this.responseCodeStatisticsInfo = responseCodeStatisticsInfo;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withAttackTypeDistributionInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoAttackTypeDistributionInfoList> attackTypeDistributionInfoList) {
        this.attackTypeDistributionInfoList = attackTypeDistributionInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo addAttackTypeDistributionInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoAttackTypeDistributionInfoList attackTypeDistributionInfoListItem) {
        if (this.attackTypeDistributionInfoList == null) {
            this.attackTypeDistributionInfoList = new ArrayList<>();
        }
        this.attackTypeDistributionInfoList.add(attackTypeDistributionInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withAttackTypeDistributionInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoAttackTypeDistributionInfoList>> attackTypeDistributionInfoListSetter) {
        if (this.attackTypeDistributionInfoList == null) {
            this.attackTypeDistributionInfoList = new ArrayList<>();
        }
        attackTypeDistributionInfoListSetter.accept(this.attackTypeDistributionInfoList);
        return this;
    }

    /**
     * **参数解释：** 攻击类型分布统计信息，包含各攻击类型的数量分布。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return attackTypeDistributionInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoAttackTypeDistributionInfoList> getAttackTypeDistributionInfoList() {
        return attackTypeDistributionInfoList;
    }

    public void setAttackTypeDistributionInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoAttackTypeDistributionInfoList> attackTypeDistributionInfoList) {
        this.attackTypeDistributionInfoList = attackTypeDistributionInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAttackedDomainsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedDomainsInfoList> topAttackedDomainsInfoList) {
        this.topAttackedDomainsInfoList = topAttackedDomainsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo addTopAttackedDomainsInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedDomainsInfoList topAttackedDomainsInfoListItem) {
        if (this.topAttackedDomainsInfoList == null) {
            this.topAttackedDomainsInfoList = new ArrayList<>();
        }
        this.topAttackedDomainsInfoList.add(topAttackedDomainsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAttackedDomainsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedDomainsInfoList>> topAttackedDomainsInfoListSetter) {
        if (this.topAttackedDomainsInfoList == null) {
            this.topAttackedDomainsInfoList = new ArrayList<>();
        }
        topAttackedDomainsInfoListSetter.accept(this.topAttackedDomainsInfoList);
        return this;
    }

    /**
     * **参数解释：** TOP被攻击的域名信息，按被攻击次数排序的域名列表。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topAttackedDomainsInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedDomainsInfoList> getTopAttackedDomainsInfoList() {
        return topAttackedDomainsInfoList;
    }

    public void setTopAttackedDomainsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedDomainsInfoList> topAttackedDomainsInfoList) {
        this.topAttackedDomainsInfoList = topAttackedDomainsInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAttackSourceIpsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceIpsInfoList> topAttackSourceIpsInfoList) {
        this.topAttackSourceIpsInfoList = topAttackSourceIpsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo addTopAttackSourceIpsInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceIpsInfoList topAttackSourceIpsInfoListItem) {
        if (this.topAttackSourceIpsInfoList == null) {
            this.topAttackSourceIpsInfoList = new ArrayList<>();
        }
        this.topAttackSourceIpsInfoList.add(topAttackSourceIpsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAttackSourceIpsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceIpsInfoList>> topAttackSourceIpsInfoListSetter) {
        if (this.topAttackSourceIpsInfoList == null) {
            this.topAttackSourceIpsInfoList = new ArrayList<>();
        }
        topAttackSourceIpsInfoListSetter.accept(this.topAttackSourceIpsInfoList);
        return this;
    }

    /**
     * **参数解释：** TOP攻击的源IP信息，按攻击次数排序的攻击源IP列表。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topAttackSourceIpsInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceIpsInfoList> getTopAttackSourceIpsInfoList() {
        return topAttackSourceIpsInfoList;
    }

    public void setTopAttackSourceIpsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceIpsInfoList> topAttackSourceIpsInfoList) {
        this.topAttackSourceIpsInfoList = topAttackSourceIpsInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAttackedUrlsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedUrlsInfoList> topAttackedUrlsInfoList) {
        this.topAttackedUrlsInfoList = topAttackedUrlsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo addTopAttackedUrlsInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedUrlsInfoList topAttackedUrlsInfoListItem) {
        if (this.topAttackedUrlsInfoList == null) {
            this.topAttackedUrlsInfoList = new ArrayList<>();
        }
        this.topAttackedUrlsInfoList.add(topAttackedUrlsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAttackedUrlsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedUrlsInfoList>> topAttackedUrlsInfoListSetter) {
        if (this.topAttackedUrlsInfoList == null) {
            this.topAttackedUrlsInfoList = new ArrayList<>();
        }
        topAttackedUrlsInfoListSetter.accept(this.topAttackedUrlsInfoList);
        return this;
    }

    /**
     * **参数解释：** TOP被攻击的URL信息，按被攻击次数排序的URL列表。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topAttackedUrlsInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedUrlsInfoList> getTopAttackedUrlsInfoList() {
        return topAttackedUrlsInfoList;
    }

    public void setTopAttackedUrlsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackedUrlsInfoList> topAttackedUrlsInfoList) {
        this.topAttackedUrlsInfoList = topAttackedUrlsInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAttackSourceLocationsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceLocationsInfoList> topAttackSourceLocationsInfoList) {
        this.topAttackSourceLocationsInfoList = topAttackSourceLocationsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo addTopAttackSourceLocationsInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceLocationsInfoList topAttackSourceLocationsInfoListItem) {
        if (this.topAttackSourceLocationsInfoList == null) {
            this.topAttackSourceLocationsInfoList = new ArrayList<>();
        }
        this.topAttackSourceLocationsInfoList.add(topAttackSourceLocationsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAttackSourceLocationsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceLocationsInfoList>> topAttackSourceLocationsInfoListSetter) {
        if (this.topAttackSourceLocationsInfoList == null) {
            this.topAttackSourceLocationsInfoList = new ArrayList<>();
        }
        topAttackSourceLocationsInfoListSetter.accept(this.topAttackSourceLocationsInfoList);
        return this;
    }

    /**
     * **参数解释：** TOP攻击的源地理位置信息，按攻击次数排序的地理位置列表。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topAttackSourceLocationsInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceLocationsInfoList> getTopAttackSourceLocationsInfoList() {
        return topAttackSourceLocationsInfoList;
    }

    public void setTopAttackSourceLocationsInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoTopAttackSourceLocationsInfoList> topAttackSourceLocationsInfoList) {
        this.topAttackSourceLocationsInfoList = topAttackSourceLocationsInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAbnormalUrlsInfo(
        SecurityReportContentResponseReportContentSubscriptionInfoTopAbnormalUrlsInfo topAbnormalUrlsInfo) {
        this.topAbnormalUrlsInfo = topAbnormalUrlsInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfo withTopAbnormalUrlsInfo(
        Consumer<SecurityReportContentResponseReportContentSubscriptionInfoTopAbnormalUrlsInfo> topAbnormalUrlsInfoSetter) {
        if (this.topAbnormalUrlsInfo == null) {
            this.topAbnormalUrlsInfo =
                new SecurityReportContentResponseReportContentSubscriptionInfoTopAbnormalUrlsInfo();
            topAbnormalUrlsInfoSetter.accept(this.topAbnormalUrlsInfo);
        }

        return this;
    }

    /**
     * Get topAbnormalUrlsInfo
     * @return topAbnormalUrlsInfo
     */
    public SecurityReportContentResponseReportContentSubscriptionInfoTopAbnormalUrlsInfo getTopAbnormalUrlsInfo() {
        return topAbnormalUrlsInfo;
    }

    public void setTopAbnormalUrlsInfo(
        SecurityReportContentResponseReportContentSubscriptionInfoTopAbnormalUrlsInfo topAbnormalUrlsInfo) {
        this.topAbnormalUrlsInfo = topAbnormalUrlsInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentSubscriptionInfo that =
            (SecurityReportContentResponseReportContentSubscriptionInfo) obj;
        return Objects.equals(this.overviewStatisticsListInfo, that.overviewStatisticsListInfo)
            && Objects.equals(this.requestStatisticsInfoList, that.requestStatisticsInfoList)
            && Objects.equals(this.qpsStatisticsInfo, that.qpsStatisticsInfo)
            && Objects.equals(this.bandwidthStatisticsInfo, that.bandwidthStatisticsInfo)
            && Objects.equals(this.responseCodeStatisticsInfo, that.responseCodeStatisticsInfo)
            && Objects.equals(this.attackTypeDistributionInfoList, that.attackTypeDistributionInfoList)
            && Objects.equals(this.topAttackedDomainsInfoList, that.topAttackedDomainsInfoList)
            && Objects.equals(this.topAttackSourceIpsInfoList, that.topAttackSourceIpsInfoList)
            && Objects.equals(this.topAttackedUrlsInfoList, that.topAttackedUrlsInfoList)
            && Objects.equals(this.topAttackSourceLocationsInfoList, that.topAttackSourceLocationsInfoList)
            && Objects.equals(this.topAbnormalUrlsInfo, that.topAbnormalUrlsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overviewStatisticsListInfo,
            requestStatisticsInfoList,
            qpsStatisticsInfo,
            bandwidthStatisticsInfo,
            responseCodeStatisticsInfo,
            attackTypeDistributionInfoList,
            topAttackedDomainsInfoList,
            topAttackSourceIpsInfoList,
            topAttackedUrlsInfoList,
            topAttackSourceLocationsInfoList,
            topAbnormalUrlsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentSubscriptionInfo {\n");
        sb.append("    overviewStatisticsListInfo: ").append(toIndentedString(overviewStatisticsListInfo)).append("\n");
        sb.append("    requestStatisticsInfoList: ").append(toIndentedString(requestStatisticsInfoList)).append("\n");
        sb.append("    qpsStatisticsInfo: ").append(toIndentedString(qpsStatisticsInfo)).append("\n");
        sb.append("    bandwidthStatisticsInfo: ").append(toIndentedString(bandwidthStatisticsInfo)).append("\n");
        sb.append("    responseCodeStatisticsInfo: ").append(toIndentedString(responseCodeStatisticsInfo)).append("\n");
        sb.append("    attackTypeDistributionInfoList: ")
            .append(toIndentedString(attackTypeDistributionInfoList))
            .append("\n");
        sb.append("    topAttackedDomainsInfoList: ").append(toIndentedString(topAttackedDomainsInfoList)).append("\n");
        sb.append("    topAttackSourceIpsInfoList: ").append(toIndentedString(topAttackSourceIpsInfoList)).append("\n");
        sb.append("    topAttackedUrlsInfoList: ").append(toIndentedString(topAttackedUrlsInfoList)).append("\n");
        sb.append("    topAttackSourceLocationsInfoList: ")
            .append(toIndentedString(topAttackSourceLocationsInfoList))
            .append("\n");
        sb.append("    topAbnormalUrlsInfo: ").append(toIndentedString(topAbnormalUrlsInfo)).append("\n");
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
