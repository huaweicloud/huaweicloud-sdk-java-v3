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
public class SecurityReportContentResponseReportContentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview_statistics_list_info")

    private List<SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo> overviewStatisticsListInfo =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_statistics_info_list")

    private List<SecurityReportContentResponseReportContentInfoRequestStatisticsInfoList> requestStatisticsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps_statistics_info")

    private SecurityReportContentResponseReportContentInfoQpsStatisticsInfo qpsStatisticsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_statistics_info")

    private SecurityReportContentResponseReportContentInfoBandwidthStatisticsInfo bandwidthStatisticsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_code_statistics_info")

    private SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfo responseCodeStatisticsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type_distribution_info_list")

    private List<SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList> attackTypeDistributionInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attacked_domains_info_list")

    private List<SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList> topAttackedDomainsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attack_source_ips_info_list")

    private List<SecurityReportContentResponseReportContentInfoTopAttackSourceIpsInfoList> topAttackSourceIpsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attacked_urls_info_list")

    private List<SecurityReportContentResponseReportContentInfoTopAttackedUrlsInfoList> topAttackedUrlsInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attack_source_locations_info_list")

    private List<SecurityReportContentResponseReportContentInfoTopAttackSourceLocationsInfoList> topAttackSourceLocationsInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_abnormal_urls_info")

    private SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo topAbnormalUrlsInfo;

    public SecurityReportContentResponseReportContentInfo withOverviewStatisticsListInfo(
        List<SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo> overviewStatisticsListInfo) {
        this.overviewStatisticsListInfo = overviewStatisticsListInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo addOverviewStatisticsListInfoItem(
        SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo overviewStatisticsListInfoItem) {
        if (this.overviewStatisticsListInfo == null) {
            this.overviewStatisticsListInfo = new ArrayList<>();
        }
        this.overviewStatisticsListInfo.add(overviewStatisticsListInfoItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withOverviewStatisticsListInfo(
        Consumer<List<SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo>> overviewStatisticsListInfoSetter) {
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
    public List<SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo> getOverviewStatisticsListInfo() {
        return overviewStatisticsListInfo;
    }

    public void setOverviewStatisticsListInfo(
        List<SecurityReportContentResponseReportContentInfoOverviewStatisticsListInfo> overviewStatisticsListInfo) {
        this.overviewStatisticsListInfo = overviewStatisticsListInfo;
    }

    public SecurityReportContentResponseReportContentInfo withRequestStatisticsInfoList(
        List<SecurityReportContentResponseReportContentInfoRequestStatisticsInfoList> requestStatisticsInfoList) {
        this.requestStatisticsInfoList = requestStatisticsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo addRequestStatisticsInfoListItem(
        SecurityReportContentResponseReportContentInfoRequestStatisticsInfoList requestStatisticsInfoListItem) {
        if (this.requestStatisticsInfoList == null) {
            this.requestStatisticsInfoList = new ArrayList<>();
        }
        this.requestStatisticsInfoList.add(requestStatisticsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withRequestStatisticsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoRequestStatisticsInfoList>> requestStatisticsInfoListSetter) {
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
    public List<SecurityReportContentResponseReportContentInfoRequestStatisticsInfoList> getRequestStatisticsInfoList() {
        return requestStatisticsInfoList;
    }

    public void setRequestStatisticsInfoList(
        List<SecurityReportContentResponseReportContentInfoRequestStatisticsInfoList> requestStatisticsInfoList) {
        this.requestStatisticsInfoList = requestStatisticsInfoList;
    }

    public SecurityReportContentResponseReportContentInfo withQpsStatisticsInfo(
        SecurityReportContentResponseReportContentInfoQpsStatisticsInfo qpsStatisticsInfo) {
        this.qpsStatisticsInfo = qpsStatisticsInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withQpsStatisticsInfo(
        Consumer<SecurityReportContentResponseReportContentInfoQpsStatisticsInfo> qpsStatisticsInfoSetter) {
        if (this.qpsStatisticsInfo == null) {
            this.qpsStatisticsInfo = new SecurityReportContentResponseReportContentInfoQpsStatisticsInfo();
            qpsStatisticsInfoSetter.accept(this.qpsStatisticsInfo);
        }

        return this;
    }

    /**
     * Get qpsStatisticsInfo
     * @return qpsStatisticsInfo
     */
    public SecurityReportContentResponseReportContentInfoQpsStatisticsInfo getQpsStatisticsInfo() {
        return qpsStatisticsInfo;
    }

    public void setQpsStatisticsInfo(
        SecurityReportContentResponseReportContentInfoQpsStatisticsInfo qpsStatisticsInfo) {
        this.qpsStatisticsInfo = qpsStatisticsInfo;
    }

    public SecurityReportContentResponseReportContentInfo withBandwidthStatisticsInfo(
        SecurityReportContentResponseReportContentInfoBandwidthStatisticsInfo bandwidthStatisticsInfo) {
        this.bandwidthStatisticsInfo = bandwidthStatisticsInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withBandwidthStatisticsInfo(
        Consumer<SecurityReportContentResponseReportContentInfoBandwidthStatisticsInfo> bandwidthStatisticsInfoSetter) {
        if (this.bandwidthStatisticsInfo == null) {
            this.bandwidthStatisticsInfo = new SecurityReportContentResponseReportContentInfoBandwidthStatisticsInfo();
            bandwidthStatisticsInfoSetter.accept(this.bandwidthStatisticsInfo);
        }

        return this;
    }

    /**
     * Get bandwidthStatisticsInfo
     * @return bandwidthStatisticsInfo
     */
    public SecurityReportContentResponseReportContentInfoBandwidthStatisticsInfo getBandwidthStatisticsInfo() {
        return bandwidthStatisticsInfo;
    }

    public void setBandwidthStatisticsInfo(
        SecurityReportContentResponseReportContentInfoBandwidthStatisticsInfo bandwidthStatisticsInfo) {
        this.bandwidthStatisticsInfo = bandwidthStatisticsInfo;
    }

    public SecurityReportContentResponseReportContentInfo withResponseCodeStatisticsInfo(
        SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfo responseCodeStatisticsInfo) {
        this.responseCodeStatisticsInfo = responseCodeStatisticsInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withResponseCodeStatisticsInfo(
        Consumer<SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfo> responseCodeStatisticsInfoSetter) {
        if (this.responseCodeStatisticsInfo == null) {
            this.responseCodeStatisticsInfo =
                new SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfo();
            responseCodeStatisticsInfoSetter.accept(this.responseCodeStatisticsInfo);
        }

        return this;
    }

    /**
     * Get responseCodeStatisticsInfo
     * @return responseCodeStatisticsInfo
     */
    public SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfo getResponseCodeStatisticsInfo() {
        return responseCodeStatisticsInfo;
    }

    public void setResponseCodeStatisticsInfo(
        SecurityReportContentResponseReportContentInfoResponseCodeStatisticsInfo responseCodeStatisticsInfo) {
        this.responseCodeStatisticsInfo = responseCodeStatisticsInfo;
    }

    public SecurityReportContentResponseReportContentInfo withAttackTypeDistributionInfoList(
        List<SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList> attackTypeDistributionInfoList) {
        this.attackTypeDistributionInfoList = attackTypeDistributionInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo addAttackTypeDistributionInfoListItem(
        SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList attackTypeDistributionInfoListItem) {
        if (this.attackTypeDistributionInfoList == null) {
            this.attackTypeDistributionInfoList = new ArrayList<>();
        }
        this.attackTypeDistributionInfoList.add(attackTypeDistributionInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withAttackTypeDistributionInfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList>> attackTypeDistributionInfoListSetter) {
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
    public List<SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList> getAttackTypeDistributionInfoList() {
        return attackTypeDistributionInfoList;
    }

    public void setAttackTypeDistributionInfoList(
        List<SecurityReportContentResponseReportContentInfoAttackTypeDistributionInfoList> attackTypeDistributionInfoList) {
        this.attackTypeDistributionInfoList = attackTypeDistributionInfoList;
    }

    public SecurityReportContentResponseReportContentInfo withTopAttackedDomainsInfoList(
        List<SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList> topAttackedDomainsInfoList) {
        this.topAttackedDomainsInfoList = topAttackedDomainsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo addTopAttackedDomainsInfoListItem(
        SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList topAttackedDomainsInfoListItem) {
        if (this.topAttackedDomainsInfoList == null) {
            this.topAttackedDomainsInfoList = new ArrayList<>();
        }
        this.topAttackedDomainsInfoList.add(topAttackedDomainsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withTopAttackedDomainsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList>> topAttackedDomainsInfoListSetter) {
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
    public List<SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList> getTopAttackedDomainsInfoList() {
        return topAttackedDomainsInfoList;
    }

    public void setTopAttackedDomainsInfoList(
        List<SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList> topAttackedDomainsInfoList) {
        this.topAttackedDomainsInfoList = topAttackedDomainsInfoList;
    }

    public SecurityReportContentResponseReportContentInfo withTopAttackSourceIpsInfoList(
        List<SecurityReportContentResponseReportContentInfoTopAttackSourceIpsInfoList> topAttackSourceIpsInfoList) {
        this.topAttackSourceIpsInfoList = topAttackSourceIpsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo addTopAttackSourceIpsInfoListItem(
        SecurityReportContentResponseReportContentInfoTopAttackSourceIpsInfoList topAttackSourceIpsInfoListItem) {
        if (this.topAttackSourceIpsInfoList == null) {
            this.topAttackSourceIpsInfoList = new ArrayList<>();
        }
        this.topAttackSourceIpsInfoList.add(topAttackSourceIpsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withTopAttackSourceIpsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoTopAttackSourceIpsInfoList>> topAttackSourceIpsInfoListSetter) {
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
    public List<SecurityReportContentResponseReportContentInfoTopAttackSourceIpsInfoList> getTopAttackSourceIpsInfoList() {
        return topAttackSourceIpsInfoList;
    }

    public void setTopAttackSourceIpsInfoList(
        List<SecurityReportContentResponseReportContentInfoTopAttackSourceIpsInfoList> topAttackSourceIpsInfoList) {
        this.topAttackSourceIpsInfoList = topAttackSourceIpsInfoList;
    }

    public SecurityReportContentResponseReportContentInfo withTopAttackedUrlsInfoList(
        List<SecurityReportContentResponseReportContentInfoTopAttackedUrlsInfoList> topAttackedUrlsInfoList) {
        this.topAttackedUrlsInfoList = topAttackedUrlsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo addTopAttackedUrlsInfoListItem(
        SecurityReportContentResponseReportContentInfoTopAttackedUrlsInfoList topAttackedUrlsInfoListItem) {
        if (this.topAttackedUrlsInfoList == null) {
            this.topAttackedUrlsInfoList = new ArrayList<>();
        }
        this.topAttackedUrlsInfoList.add(topAttackedUrlsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withTopAttackedUrlsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoTopAttackedUrlsInfoList>> topAttackedUrlsInfoListSetter) {
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
    public List<SecurityReportContentResponseReportContentInfoTopAttackedUrlsInfoList> getTopAttackedUrlsInfoList() {
        return topAttackedUrlsInfoList;
    }

    public void setTopAttackedUrlsInfoList(
        List<SecurityReportContentResponseReportContentInfoTopAttackedUrlsInfoList> topAttackedUrlsInfoList) {
        this.topAttackedUrlsInfoList = topAttackedUrlsInfoList;
    }

    public SecurityReportContentResponseReportContentInfo withTopAttackSourceLocationsInfoList(
        List<SecurityReportContentResponseReportContentInfoTopAttackSourceLocationsInfoList> topAttackSourceLocationsInfoList) {
        this.topAttackSourceLocationsInfoList = topAttackSourceLocationsInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo addTopAttackSourceLocationsInfoListItem(
        SecurityReportContentResponseReportContentInfoTopAttackSourceLocationsInfoList topAttackSourceLocationsInfoListItem) {
        if (this.topAttackSourceLocationsInfoList == null) {
            this.topAttackSourceLocationsInfoList = new ArrayList<>();
        }
        this.topAttackSourceLocationsInfoList.add(topAttackSourceLocationsInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withTopAttackSourceLocationsInfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoTopAttackSourceLocationsInfoList>> topAttackSourceLocationsInfoListSetter) {
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
    public List<SecurityReportContentResponseReportContentInfoTopAttackSourceLocationsInfoList> getTopAttackSourceLocationsInfoList() {
        return topAttackSourceLocationsInfoList;
    }

    public void setTopAttackSourceLocationsInfoList(
        List<SecurityReportContentResponseReportContentInfoTopAttackSourceLocationsInfoList> topAttackSourceLocationsInfoList) {
        this.topAttackSourceLocationsInfoList = topAttackSourceLocationsInfoList;
    }

    public SecurityReportContentResponseReportContentInfo withTopAbnormalUrlsInfo(
        SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo topAbnormalUrlsInfo) {
        this.topAbnormalUrlsInfo = topAbnormalUrlsInfo;
        return this;
    }

    public SecurityReportContentResponseReportContentInfo withTopAbnormalUrlsInfo(
        Consumer<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo> topAbnormalUrlsInfoSetter) {
        if (this.topAbnormalUrlsInfo == null) {
            this.topAbnormalUrlsInfo = new SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo();
            topAbnormalUrlsInfoSetter.accept(this.topAbnormalUrlsInfo);
        }

        return this;
    }

    /**
     * Get topAbnormalUrlsInfo
     * @return topAbnormalUrlsInfo
     */
    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo getTopAbnormalUrlsInfo() {
        return topAbnormalUrlsInfo;
    }

    public void setTopAbnormalUrlsInfo(
        SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo topAbnormalUrlsInfo) {
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
        SecurityReportContentResponseReportContentInfo that = (SecurityReportContentResponseReportContentInfo) obj;
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
        sb.append("class SecurityReportContentResponseReportContentInfo {\n");
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
