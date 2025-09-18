package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** QPS统计信息，包含平均QPS和峰值QPS的各维度时间线统计。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList> averageInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoPeakInfoList> peakInfoList =
        null;

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo withAverageInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList> averageInfoList) {
        this.averageInfoList = averageInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo addAverageInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList averageInfoListItem) {
        if (this.averageInfoList == null) {
            this.averageInfoList = new ArrayList<>();
        }
        this.averageInfoList.add(averageInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo withAverageInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList>> averageInfoListSetter) {
        if (this.averageInfoList == null) {
            this.averageInfoList = new ArrayList<>();
        }
        averageInfoListSetter.accept(this.averageInfoList);
        return this;
    }

    /**
     * **参数解释：** 平均QPS统计列表，包含各维度按时间线的平均QPS数据。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return averageInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList> getAverageInfoList() {
        return averageInfoList;
    }

    public void setAverageInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList> averageInfoList) {
        this.averageInfoList = averageInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo withPeakInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoPeakInfoList> peakInfoList) {
        this.peakInfoList = peakInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo addPeakInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoPeakInfoList peakInfoListItem) {
        if (this.peakInfoList == null) {
            this.peakInfoList = new ArrayList<>();
        }
        this.peakInfoList.add(peakInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo withPeakInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoPeakInfoList>> peakInfoListSetter) {
        if (this.peakInfoList == null) {
            this.peakInfoList = new ArrayList<>();
        }
        peakInfoListSetter.accept(this.peakInfoList);
        return this;
    }

    /**
     * **参数解释：** 峰值QPS统计列表，包含各维度按时间线的峰值QPS数据。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return peakInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoPeakInfoList> getPeakInfoList() {
        return peakInfoList;
    }

    public void setPeakInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoPeakInfoList> peakInfoList) {
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
        SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo that =
            (SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo) obj;
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
        sb.append("class SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfo {\n");
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
