package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 基线检测周期扫描配置
 */
public class SecurityCheckTaskCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_of_week")

    private List<String> dayOfWeek = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour")

    private Integer hour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minute")

    private Integer minute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "random_offset")

    private Integer randomOffset;

    public SecurityCheckTaskCondition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 定时任务，包含如下:   - fixed_weekday : 固定工作日
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SecurityCheckTaskCondition withDayOfWeek(List<String> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public SecurityCheckTaskCondition addDayOfWeekItem(String dayOfWeekItem) {
        if (this.dayOfWeek == null) {
            this.dayOfWeek = new ArrayList<>();
        }
        this.dayOfWeek.add(dayOfWeekItem);
        return this;
    }

    public SecurityCheckTaskCondition withDayOfWeek(Consumer<List<String>> dayOfWeekSetter) {
        if (this.dayOfWeek == null) {
            this.dayOfWeek = new ArrayList<>();
        }
        dayOfWeekSetter.accept(this.dayOfWeek);
        return this;
    }

    /**
     * 周几触发，可选0或多个
     * @return dayOfWeek
     */
    public List<String> getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(List<String> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public SecurityCheckTaskCondition withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * 在此参数表示的小时触发定时任务
     * minimum: 0
     * maximum: 23
     * @return hour
     */
    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public SecurityCheckTaskCondition withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * 在此参数表示的分钟触发定时任务
     * minimum: 0
     * maximum: 59
     * @return minute
     */
    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public SecurityCheckTaskCondition withRandomOffset(Integer randomOffset) {
        this.randomOffset = randomOffset;
        return this;
    }

    /**
     * 随机偏移时间
     * minimum: 0
     * maximum: 3600
     * @return randomOffset
     */
    public Integer getRandomOffset() {
        return randomOffset;
    }

    public void setRandomOffset(Integer randomOffset) {
        this.randomOffset = randomOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckTaskCondition that = (SecurityCheckTaskCondition) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.dayOfWeek, that.dayOfWeek)
            && Objects.equals(this.hour, that.hour) && Objects.equals(this.minute, that.minute)
            && Objects.equals(this.randomOffset, that.randomOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, dayOfWeek, hour, minute, randomOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckTaskCondition {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
        sb.append("    randomOffset: ").append(toIndentedString(randomOffset)).append("\n");
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
