package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportHistoryVO
 */
public class ReportHistoryVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_time")

    private Long sendTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_period")

    private StatisticPeriod statisticPeriod;

    public ReportHistoryVO withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**： 报告ID **取值范围**： 不涉及
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ReportHistoryVO withSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    /**
     * **参数解释**： 发送时间 **取值范围**： 不涉及
     * @return sendTime
     */
    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    public ReportHistoryVO withStatisticPeriod(StatisticPeriod statisticPeriod) {
        this.statisticPeriod = statisticPeriod;
        return this;
    }

    public ReportHistoryVO withStatisticPeriod(Consumer<StatisticPeriod> statisticPeriodSetter) {
        if (this.statisticPeriod == null) {
            this.statisticPeriod = new StatisticPeriod();
            statisticPeriodSetter.accept(this.statisticPeriod);
        }

        return this;
    }

    /**
     * Get statisticPeriod
     * @return statisticPeriod
     */
    public StatisticPeriod getStatisticPeriod() {
        return statisticPeriod;
    }

    public void setStatisticPeriod(StatisticPeriod statisticPeriod) {
        this.statisticPeriod = statisticPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportHistoryVO that = (ReportHistoryVO) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.sendTime, that.sendTime)
            && Objects.equals(this.statisticPeriod, that.statisticPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, sendTime, statisticPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportHistoryVO {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
        sb.append("    statisticPeriod: ").append(toIndentedString(statisticPeriod)).append("\n");
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
