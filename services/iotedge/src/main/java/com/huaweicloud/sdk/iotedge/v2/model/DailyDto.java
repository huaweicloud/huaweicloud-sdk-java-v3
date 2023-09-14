package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 每天的时间描述结构体
 */
public class DailyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exceptional_dates")

    private ExceptionalDates exceptionalDates;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_spans")

    private List<TimeSpans> timeSpans = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weekdays")

    private Object weekdays;

    public DailyDto withExceptionalDates(ExceptionalDates exceptionalDates) {
        this.exceptionalDates = exceptionalDates;
        return this;
    }

    public DailyDto withExceptionalDates(Consumer<ExceptionalDates> exceptionalDatesSetter) {
        if (this.exceptionalDates == null) {
            this.exceptionalDates = new ExceptionalDates();
            exceptionalDatesSetter.accept(this.exceptionalDates);
        }

        return this;
    }

    /**
     * Get exceptionalDates
     * @return exceptionalDates
     */
    public ExceptionalDates getExceptionalDates() {
        return exceptionalDates;
    }

    public void setExceptionalDates(ExceptionalDates exceptionalDates) {
        this.exceptionalDates = exceptionalDates;
    }

    public DailyDto withTimeSpans(List<TimeSpans> timeSpans) {
        this.timeSpans = timeSpans;
        return this;
    }

    public DailyDto addTimeSpansItem(TimeSpans timeSpansItem) {
        if (this.timeSpans == null) {
            this.timeSpans = new ArrayList<>();
        }
        this.timeSpans.add(timeSpansItem);
        return this;
    }

    public DailyDto withTimeSpans(Consumer<List<TimeSpans>> timeSpansSetter) {
        if (this.timeSpans == null) {
            this.timeSpans = new ArrayList<>();
        }
        timeSpansSetter.accept(this.timeSpans);
        return this;
    }

    /**
     * 时间段描述
     * @return timeSpans
     */
    public List<TimeSpans> getTimeSpans() {
        return timeSpans;
    }

    public void setTimeSpans(List<TimeSpans> timeSpans) {
        this.timeSpans = timeSpans;
    }

    public DailyDto withWeekdays(Object weekdays) {
        this.weekdays = weekdays;
        return this;
    }

    /**
     * 描述此任务有效的星期几，为数组。如果为null，则表示start_time-endtime之间，每天都执行；如果为空数组，则表示start_time-endtime之间，每天都不执行；如果为[1, 2]，则表示每周一、二执行。
     * @return weekdays
     */
    public Object getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(Object weekdays) {
        this.weekdays = weekdays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DailyDto that = (DailyDto) obj;
        return Objects.equals(this.exceptionalDates, that.exceptionalDates)
            && Objects.equals(this.timeSpans, that.timeSpans) && Objects.equals(this.weekdays, that.weekdays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exceptionalDates, timeSpans, weekdays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailyDto {\n");
        sb.append("    exceptionalDates: ").append(toIndentedString(exceptionalDates)).append("\n");
        sb.append("    timeSpans: ").append(toIndentedString(timeSpans)).append("\n");
        sb.append("    weekdays: ").append(toIndentedString(weekdays)).append("\n");
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
