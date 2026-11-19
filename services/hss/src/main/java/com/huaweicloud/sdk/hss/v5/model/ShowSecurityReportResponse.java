package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private Integer reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_sub_id")

    private Integer reportSubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name")

    private String reportName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_category")

    private String reportCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sending_period")

    private String sendingPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_type")

    private String logoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_id")

    private String logoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_type")

    private String subscriptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private StatPeriodRes statPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview_info")

    private OverviewInfoRes overviewInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scans_info")

    private ScansInfoRes scansInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intrusion_info")

    private IntrusionInfoRes intrusionInfo;

    public ShowSecurityReportResponse withReportId(Integer reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**： 报告ID **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return reportId
     */
    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public ShowSecurityReportResponse withReportSubId(Integer reportSubId) {
        this.reportSubId = reportSubId;
        return this;
    }

    /**
     * **参数解释**： 报告子ID **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return reportSubId
     */
    public Integer getReportSubId() {
        return reportSubId;
    }

    public void setReportSubId(Integer reportSubId) {
        this.reportSubId = reportSubId;
    }

    public ShowSecurityReportResponse withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释**： 报告名称 **取值范围**： 字符长度0-128位 
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public ShowSecurityReportResponse withReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
        return this;
    }

    /**
     * **参数解释**： 报告类别 **取值范围**： 字符长度0-64位 
     * @return reportCategory
     */
    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public ShowSecurityReportResponse withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释**： 报告发送的时间段 **取值范围**： 字符长度0-64位 
     * @return sendingPeriod
     */
    public String getSendingPeriod() {
        return sendingPeriod;
    }

    public void setSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
    }

    public ShowSecurityReportResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释**： 主题URN **取值范围**： 字符长度0-256位 
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ShowSecurityReportResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 主题的显示名 **取值范围**： 字符长度0-256位 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowSecurityReportResponse withLogoType(String logoType) {
        this.logoType = logoType;
        return this;
    }

    /**
     * **参数解释**： 报告logo类型 **取值范围**： - default：华为logo - customize：自定义logo 
     * @return logoType
     */
    public String getLogoType() {
        return logoType;
    }

    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }

    public ShowSecurityReportResponse withLogoId(String logoId) {
        this.logoId = logoId;
        return this;
    }

    /**
     * **参数解释**： 自定义logo的文件ID **取值范围**： 字符长度0-256位 
     * @return logoId
     */
    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public ShowSecurityReportResponse withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * **参数解释**： 订阅的方式 **取值范围**： 字符长度0-64位 
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public ShowSecurityReportResponse withStatPeriod(StatPeriodRes statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public ShowSecurityReportResponse withStatPeriod(Consumer<StatPeriodRes> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new StatPeriodRes();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public StatPeriodRes getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(StatPeriodRes statPeriod) {
        this.statPeriod = statPeriod;
    }

    public ShowSecurityReportResponse withOverviewInfo(OverviewInfoRes overviewInfo) {
        this.overviewInfo = overviewInfo;
        return this;
    }

    public ShowSecurityReportResponse withOverviewInfo(Consumer<OverviewInfoRes> overviewInfoSetter) {
        if (this.overviewInfo == null) {
            this.overviewInfo = new OverviewInfoRes();
            overviewInfoSetter.accept(this.overviewInfo);
        }

        return this;
    }

    /**
     * Get overviewInfo
     * @return overviewInfo
     */
    public OverviewInfoRes getOverviewInfo() {
        return overviewInfo;
    }

    public void setOverviewInfo(OverviewInfoRes overviewInfo) {
        this.overviewInfo = overviewInfo;
    }

    public ShowSecurityReportResponse withScansInfo(ScansInfoRes scansInfo) {
        this.scansInfo = scansInfo;
        return this;
    }

    public ShowSecurityReportResponse withScansInfo(Consumer<ScansInfoRes> scansInfoSetter) {
        if (this.scansInfo == null) {
            this.scansInfo = new ScansInfoRes();
            scansInfoSetter.accept(this.scansInfo);
        }

        return this;
    }

    /**
     * Get scansInfo
     * @return scansInfo
     */
    public ScansInfoRes getScansInfo() {
        return scansInfo;
    }

    public void setScansInfo(ScansInfoRes scansInfo) {
        this.scansInfo = scansInfo;
    }

    public ShowSecurityReportResponse withIntrusionInfo(IntrusionInfoRes intrusionInfo) {
        this.intrusionInfo = intrusionInfo;
        return this;
    }

    public ShowSecurityReportResponse withIntrusionInfo(Consumer<IntrusionInfoRes> intrusionInfoSetter) {
        if (this.intrusionInfo == null) {
            this.intrusionInfo = new IntrusionInfoRes();
            intrusionInfoSetter.accept(this.intrusionInfo);
        }

        return this;
    }

    /**
     * Get intrusionInfo
     * @return intrusionInfo
     */
    public IntrusionInfoRes getIntrusionInfo() {
        return intrusionInfo;
    }

    public void setIntrusionInfo(IntrusionInfoRes intrusionInfo) {
        this.intrusionInfo = intrusionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityReportResponse that = (ShowSecurityReportResponse) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.reportSubId, that.reportSubId)
            && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportCategory, that.reportCategory)
            && Objects.equals(this.sendingPeriod, that.sendingPeriod) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.logoType, that.logoType)
            && Objects.equals(this.logoId, that.logoId) && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.statPeriod, that.statPeriod) && Objects.equals(this.overviewInfo, that.overviewInfo)
            && Objects.equals(this.scansInfo, that.scansInfo) && Objects.equals(this.intrusionInfo, that.intrusionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId,
            reportSubId,
            reportName,
            reportCategory,
            sendingPeriod,
            topicUrn,
            displayName,
            logoType,
            logoId,
            subscriptionType,
            statPeriod,
            overviewInfo,
            scansInfo,
            intrusionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityReportResponse {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    reportSubId: ").append(toIndentedString(reportSubId)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    sendingPeriod: ").append(toIndentedString(sendingPeriod)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    logoType: ").append(toIndentedString(logoType)).append("\n");
        sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    statPeriod: ").append(toIndentedString(statPeriod)).append("\n");
        sb.append("    overviewInfo: ").append(toIndentedString(overviewInfo)).append("\n");
        sb.append("    scansInfo: ").append(toIndentedString(scansInfo)).append("\n");
        sb.append("    intrusionInfo: ").append(toIndentedString(intrusionInfo)).append("\n");
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
