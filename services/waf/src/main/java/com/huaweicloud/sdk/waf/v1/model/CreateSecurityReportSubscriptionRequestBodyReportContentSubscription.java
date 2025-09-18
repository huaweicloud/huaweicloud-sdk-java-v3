package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 报告内容订阅，配置订阅报告包含的具体统计模块启用状态。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class CreateSecurityReportSubscriptionRequestBodyReportContentSubscription {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview_statistics_enable")

    private Boolean overviewStatisticsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_day_enable")

    private Boolean groupByDayEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_statistics_enable")

    private Boolean requestStatisticsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps_statistics_enable")

    private Boolean qpsStatisticsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_statistics_enable")

    private Boolean bandwidthStatisticsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_code_statistics_enable")

    private Boolean responseCodeStatisticsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type_distribution_enable")

    private Boolean attackTypeDistributionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attacked_domains_enable")

    private Boolean topAttackedDomainsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attack_source_ips_enable")

    private Boolean topAttackSourceIpsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attacked_urls_enable")

    private Boolean topAttackedUrlsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_attack_source_locations_enable")

    private Boolean topAttackSourceLocationsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_error_pages_enable")

    private Boolean topErrorPagesEnable;

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withOverviewStatisticsEnable(
        Boolean overviewStatisticsEnable) {
        this.overviewStatisticsEnable = overviewStatisticsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用总览统计内容（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return overviewStatisticsEnable
     */
    public Boolean getOverviewStatisticsEnable() {
        return overviewStatisticsEnable;
    }

    public void setOverviewStatisticsEnable(Boolean overviewStatisticsEnable) {
        this.overviewStatisticsEnable = overviewStatisticsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withGroupByDayEnable(
        Boolean groupByDayEnable) {
        this.groupByDayEnable = groupByDayEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用按天分组统计（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return groupByDayEnable
     */
    public Boolean getGroupByDayEnable() {
        return groupByDayEnable;
    }

    public void setGroupByDayEnable(Boolean groupByDayEnable) {
        this.groupByDayEnable = groupByDayEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withRequestStatisticsEnable(
        Boolean requestStatisticsEnable) {
        this.requestStatisticsEnable = requestStatisticsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用请求次数统计内容（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return requestStatisticsEnable
     */
    public Boolean getRequestStatisticsEnable() {
        return requestStatisticsEnable;
    }

    public void setRequestStatisticsEnable(Boolean requestStatisticsEnable) {
        this.requestStatisticsEnable = requestStatisticsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withQpsStatisticsEnable(
        Boolean qpsStatisticsEnable) {
        this.qpsStatisticsEnable = qpsStatisticsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用QPS统计内容（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return qpsStatisticsEnable
     */
    public Boolean getQpsStatisticsEnable() {
        return qpsStatisticsEnable;
    }

    public void setQpsStatisticsEnable(Boolean qpsStatisticsEnable) {
        this.qpsStatisticsEnable = qpsStatisticsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withBandwidthStatisticsEnable(
        Boolean bandwidthStatisticsEnable) {
        this.bandwidthStatisticsEnable = bandwidthStatisticsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用带宽统计内容（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return bandwidthStatisticsEnable
     */
    public Boolean getBandwidthStatisticsEnable() {
        return bandwidthStatisticsEnable;
    }

    public void setBandwidthStatisticsEnable(Boolean bandwidthStatisticsEnable) {
        this.bandwidthStatisticsEnable = bandwidthStatisticsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withResponseCodeStatisticsEnable(
        Boolean responseCodeStatisticsEnable) {
        this.responseCodeStatisticsEnable = responseCodeStatisticsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用响应码统计内容（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return responseCodeStatisticsEnable
     */
    public Boolean getResponseCodeStatisticsEnable() {
        return responseCodeStatisticsEnable;
    }

    public void setResponseCodeStatisticsEnable(Boolean responseCodeStatisticsEnable) {
        this.responseCodeStatisticsEnable = responseCodeStatisticsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withAttackTypeDistributionEnable(
        Boolean attackTypeDistributionEnable) {
        this.attackTypeDistributionEnable = attackTypeDistributionEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用攻击类型分布统计（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return attackTypeDistributionEnable
     */
    public Boolean getAttackTypeDistributionEnable() {
        return attackTypeDistributionEnable;
    }

    public void setAttackTypeDistributionEnable(Boolean attackTypeDistributionEnable) {
        this.attackTypeDistributionEnable = attackTypeDistributionEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withTopAttackedDomainsEnable(
        Boolean topAttackedDomainsEnable) {
        this.topAttackedDomainsEnable = topAttackedDomainsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用TOP被攻击域名统计（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return topAttackedDomainsEnable
     */
    public Boolean getTopAttackedDomainsEnable() {
        return topAttackedDomainsEnable;
    }

    public void setTopAttackedDomainsEnable(Boolean topAttackedDomainsEnable) {
        this.topAttackedDomainsEnable = topAttackedDomainsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withTopAttackSourceIpsEnable(
        Boolean topAttackSourceIpsEnable) {
        this.topAttackSourceIpsEnable = topAttackSourceIpsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用TOP攻击源IP统计（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return topAttackSourceIpsEnable
     */
    public Boolean getTopAttackSourceIpsEnable() {
        return topAttackSourceIpsEnable;
    }

    public void setTopAttackSourceIpsEnable(Boolean topAttackSourceIpsEnable) {
        this.topAttackSourceIpsEnable = topAttackSourceIpsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withTopAttackedUrlsEnable(
        Boolean topAttackedUrlsEnable) {
        this.topAttackedUrlsEnable = topAttackedUrlsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用TOP被攻击URL统计（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return topAttackedUrlsEnable
     */
    public Boolean getTopAttackedUrlsEnable() {
        return topAttackedUrlsEnable;
    }

    public void setTopAttackedUrlsEnable(Boolean topAttackedUrlsEnable) {
        this.topAttackedUrlsEnable = topAttackedUrlsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withTopAttackSourceLocationsEnable(
        Boolean topAttackSourceLocationsEnable) {
        this.topAttackSourceLocationsEnable = topAttackSourceLocationsEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用TOP攻击源地理位置统计（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return topAttackSourceLocationsEnable
     */
    public Boolean getTopAttackSourceLocationsEnable() {
        return topAttackSourceLocationsEnable;
    }

    public void setTopAttackSourceLocationsEnable(Boolean topAttackSourceLocationsEnable) {
        this.topAttackSourceLocationsEnable = topAttackSourceLocationsEnable;
    }

    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription withTopErrorPagesEnable(
        Boolean topErrorPagesEnable) {
        this.topErrorPagesEnable = topErrorPagesEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用TOP错误页面统计（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return topErrorPagesEnable
     */
    public Boolean getTopErrorPagesEnable() {
        return topErrorPagesEnable;
    }

    public void setTopErrorPagesEnable(Boolean topErrorPagesEnable) {
        this.topErrorPagesEnable = topErrorPagesEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecurityReportSubscriptionRequestBodyReportContentSubscription that =
            (CreateSecurityReportSubscriptionRequestBodyReportContentSubscription) obj;
        return Objects.equals(this.overviewStatisticsEnable, that.overviewStatisticsEnable)
            && Objects.equals(this.groupByDayEnable, that.groupByDayEnable)
            && Objects.equals(this.requestStatisticsEnable, that.requestStatisticsEnable)
            && Objects.equals(this.qpsStatisticsEnable, that.qpsStatisticsEnable)
            && Objects.equals(this.bandwidthStatisticsEnable, that.bandwidthStatisticsEnable)
            && Objects.equals(this.responseCodeStatisticsEnable, that.responseCodeStatisticsEnable)
            && Objects.equals(this.attackTypeDistributionEnable, that.attackTypeDistributionEnable)
            && Objects.equals(this.topAttackedDomainsEnable, that.topAttackedDomainsEnable)
            && Objects.equals(this.topAttackSourceIpsEnable, that.topAttackSourceIpsEnable)
            && Objects.equals(this.topAttackedUrlsEnable, that.topAttackedUrlsEnable)
            && Objects.equals(this.topAttackSourceLocationsEnable, that.topAttackSourceLocationsEnable)
            && Objects.equals(this.topErrorPagesEnable, that.topErrorPagesEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overviewStatisticsEnable,
            groupByDayEnable,
            requestStatisticsEnable,
            qpsStatisticsEnable,
            bandwidthStatisticsEnable,
            responseCodeStatisticsEnable,
            attackTypeDistributionEnable,
            topAttackedDomainsEnable,
            topAttackSourceIpsEnable,
            topAttackedUrlsEnable,
            topAttackSourceLocationsEnable,
            topErrorPagesEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityReportSubscriptionRequestBodyReportContentSubscription {\n");
        sb.append("    overviewStatisticsEnable: ").append(toIndentedString(overviewStatisticsEnable)).append("\n");
        sb.append("    groupByDayEnable: ").append(toIndentedString(groupByDayEnable)).append("\n");
        sb.append("    requestStatisticsEnable: ").append(toIndentedString(requestStatisticsEnable)).append("\n");
        sb.append("    qpsStatisticsEnable: ").append(toIndentedString(qpsStatisticsEnable)).append("\n");
        sb.append("    bandwidthStatisticsEnable: ").append(toIndentedString(bandwidthStatisticsEnable)).append("\n");
        sb.append("    responseCodeStatisticsEnable: ")
            .append(toIndentedString(responseCodeStatisticsEnable))
            .append("\n");
        sb.append("    attackTypeDistributionEnable: ")
            .append(toIndentedString(attackTypeDistributionEnable))
            .append("\n");
        sb.append("    topAttackedDomainsEnable: ").append(toIndentedString(topAttackedDomainsEnable)).append("\n");
        sb.append("    topAttackSourceIpsEnable: ").append(toIndentedString(topAttackSourceIpsEnable)).append("\n");
        sb.append("    topAttackedUrlsEnable: ").append(toIndentedString(topAttackedUrlsEnable)).append("\n");
        sb.append("    topAttackSourceLocationsEnable: ")
            .append(toIndentedString(topAttackSourceLocationsEnable))
            .append("\n");
        sb.append("    topErrorPagesEnable: ").append(toIndentedString(topErrorPagesEnable)).append("\n");
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
