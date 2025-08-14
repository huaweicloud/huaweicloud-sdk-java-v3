package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调度器属性
 */
public class BackupTriggerPropertiesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private List<String> pattern = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public BackupTriggerPropertiesInfo withPattern(List<String> pattern) {
        this.pattern = pattern;
        return this;
    }

    public BackupTriggerPropertiesInfo addPatternItem(String patternItem) {
        if (this.pattern == null) {
            this.pattern = new ArrayList<>();
        }
        this.pattern.add(patternItem);
        return this;
    }

    public BackupTriggerPropertiesInfo withPattern(Consumer<List<String>> patternSetter) {
        if (this.pattern == null) {
            this.pattern = new ArrayList<>();
        }
        patternSetter.accept(this.pattern);
        return this;
    }

    /**
     * **参数解释**: 调度器的调度策略 **取值范围**: ，长度限制为10240个字符，参照iCalendar RFC 2445规范，但仅支持FREQ、BYDAY、BYHOUR、BYMINUTE四个参数，其中FREQ仅支持WEEKLY和DAILY，BYDAY支持一周七天（MO、TU、WE、TH、FR、SA、SU），BYHOUR支持0-23小时，BYMINUTE支持0-59分钟，并且时间点间隔不能小于一小时，一个备份策略可以同时设置多个备份时间点，一天最多可以设置24个时间点 
     * @return pattern
     */
    public List<String> getPattern() {
        return pattern;
    }

    public void setPattern(List<String> pattern) {
        this.pattern = pattern;
    }

    public BackupTriggerPropertiesInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 调度器开始时间，例如：2020-01-08 09:59:49 **取值范围**: 字符长度0-256 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupTriggerPropertiesInfo that = (BackupTriggerPropertiesInfo) obj;
        return Objects.equals(this.pattern, that.pattern) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupTriggerPropertiesInfo {\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
