package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 带宽统计信息，包含平均带宽和峰值带宽的各维度时间线统计。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoAverageInfoList> averageInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoPeakInfoList> peakInfoList =
        null;

    public SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo withAverageInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoAverageInfoList> averageInfoList) {
        this.averageInfoList = averageInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo addAverageInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoAverageInfoList averageInfoListItem) {
        if (this.averageInfoList == null) {
            this.averageInfoList = new ArrayList<>();
        }
        this.averageInfoList.add(averageInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo withAverageInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoAverageInfoList>> averageInfoListSetter) {
        if (this.averageInfoList == null) {
            this.averageInfoList = new ArrayList<>();
        }
        averageInfoListSetter.accept(this.averageInfoList);
        return this;
    }

    /**
     * **参数解释：** 平均带宽统计列表，包含各维度按时间线的平均带宽数据。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return averageInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoAverageInfoList> getAverageInfoList() {
        return averageInfoList;
    }

    public void setAverageInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoAverageInfoList> averageInfoList) {
        this.averageInfoList = averageInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo withPeakInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoPeakInfoList> peakInfoList) {
        this.peakInfoList = peakInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo addPeakInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoPeakInfoList peakInfoListItem) {
        if (this.peakInfoList == null) {
            this.peakInfoList = new ArrayList<>();
        }
        this.peakInfoList.add(peakInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo withPeakInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoPeakInfoList>> peakInfoListSetter) {
        if (this.peakInfoList == null) {
            this.peakInfoList = new ArrayList<>();
        }
        peakInfoListSetter.accept(this.peakInfoList);
        return this;
    }

    /**
     * **参数解释：** 峰值带宽统计列表，包含各维度按时间线的峰值带宽数据。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return peakInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoPeakInfoList> getPeakInfoList() {
        return peakInfoList;
    }

    public void setPeakInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfoPeakInfoList> peakInfoList) {
        this.peakInfoList = peakInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo that =
            (SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo) obj;
        return Objects.equals(this.averageInfoList, that.averageInfoList)
            && Objects.equals(this.peakInfoList, that.peakInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageInfoList, peakInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentSubscriptionInfoBandwidthStatisticsInfo {\n");
        sb.append("    averageInfoList: ").append(toIndentedString(averageInfoList)).append("\n");
        sb.append("    peakInfoList: ").append(toIndentedString(peakInfoList)).append("\n");
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
