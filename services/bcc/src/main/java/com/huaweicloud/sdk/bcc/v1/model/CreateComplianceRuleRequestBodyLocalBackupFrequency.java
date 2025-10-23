package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 本地备份频率，如按天 2次/天，按周 周一，三，五每天执行2次
 */
public class CreateComplianceRuleRequestBodyLocalBackupFrequency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "times_per_day")

    private Integer timesPerDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days_of_week")

    private List<String> daysOfWeek = null;

    public CreateComplianceRuleRequestBodyLocalBackupFrequency withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 备份频率类型，可选daily weekly
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateComplianceRuleRequestBodyLocalBackupFrequency withTimesPerDay(Integer timesPerDay) {
        this.timesPerDay = timesPerDay;
        return this;
    }

    /**
     * 每日执行次数
     * minimum: 1
     * maximum: 24
     * @return timesPerDay
     */
    public Integer getTimesPerDay() {
        return timesPerDay;
    }

    public void setTimesPerDay(Integer timesPerDay) {
        this.timesPerDay = timesPerDay;
    }

    public CreateComplianceRuleRequestBodyLocalBackupFrequency withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * daily类型下，间隔多少天
     * minimum: 1
     * maximum: 30
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public CreateComplianceRuleRequestBodyLocalBackupFrequency withDaysOfWeek(List<String> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    public CreateComplianceRuleRequestBodyLocalBackupFrequency addDaysOfWeekItem(String daysOfWeekItem) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        this.daysOfWeek.add(daysOfWeekItem);
        return this;
    }

    public CreateComplianceRuleRequestBodyLocalBackupFrequency withDaysOfWeek(Consumer<List<String>> daysOfWeekSetter) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        daysOfWeekSetter.accept(this.daysOfWeek);
        return this;
    }

    /**
     * 如果type是weekly必选，表示一周内那些天备份 如：[\"MO\", \"TU\", \"WE\", \"TH\", \"FR\", \"SA\", \"SU\"]
     * @return daysOfWeek
     */
    public List<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<String> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateComplianceRuleRequestBodyLocalBackupFrequency that =
            (CreateComplianceRuleRequestBodyLocalBackupFrequency) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.timesPerDay, that.timesPerDay)
            && Objects.equals(this.interval, that.interval) && Objects.equals(this.daysOfWeek, that.daysOfWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, timesPerDay, interval, daysOfWeek);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComplianceRuleRequestBodyLocalBackupFrequency {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    timesPerDay: ").append(toIndentedString(timesPerDay)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
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
