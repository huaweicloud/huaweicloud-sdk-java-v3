package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HistoryPeriodInfo
 */
public class HistoryPeriodInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private Integer reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_sub_id")

    private Integer reportSubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private StatPeriod statPeriod;

    public HistoryPeriodInfo withReportId(Integer reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**: 报告ID **取值范围**: 最小值0，最大值2147483647 
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

    public HistoryPeriodInfo withReportSubId(Integer reportSubId) {
        this.reportSubId = reportSubId;
        return this;
    }

    /**
     * **参数解释**: 报告子ID **取值范围**: 最小值0，最大值2147483647 
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

    public HistoryPeriodInfo withStatPeriod(StatPeriod statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public HistoryPeriodInfo withStatPeriod(Consumer<StatPeriod> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new StatPeriod();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public StatPeriod getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(StatPeriod statPeriod) {
        this.statPeriod = statPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistoryPeriodInfo that = (HistoryPeriodInfo) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.reportSubId, that.reportSubId)
            && Objects.equals(this.statPeriod, that.statPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, reportSubId, statPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryPeriodInfo {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    reportSubId: ").append(toIndentedString(reportSubId)).append("\n");
        sb.append("    statPeriod: ").append(toIndentedString(statPeriod)).append("\n");
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
