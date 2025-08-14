package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 策略执行时间规则，若开启勒索防护时开启备份功能，则该字段必选 **约束限制**: 不涉及 **取值范围**: 不涉及  **默认取值**: 不涉及 
 */
public class BackupTriggerPropertiesRequestInfo1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private List<String> pattern = null;

    public BackupTriggerPropertiesRequestInfo1 withPattern(List<String> pattern) {
        this.pattern = pattern;
        return this;
    }

    public BackupTriggerPropertiesRequestInfo1 addPatternItem(String patternItem) {
        if (this.pattern == null) {
            this.pattern = new ArrayList<>();
        }
        this.pattern.add(patternItem);
        return this;
    }

    public BackupTriggerPropertiesRequestInfo1 withPattern(Consumer<List<String>> patternSetter) {
        if (this.pattern == null) {
            this.pattern = new ArrayList<>();
        }
        patternSetter.accept(this.pattern);
        return this;
    }

    /**
     * **参数解释**: 调度规则。若开启勒索防护时开启备份功能，则该字段必选。 **约束限制**: 限制24条规则。 **取值范围**: 调度器的调度规则，可参照iCalendar RFC 2445规范中的事件规则，但仅支持FREQ、BYDAY、BYHOUR、BYMINUTE、INTERVAL等参数，其中FREQ仅支持WEEKLY和DAILY，BYDAY支持一周七天（MO、TU、WE、TH、FR、SA、SU），BYHOUR支持0-23小时，BYMINUTE支持0-59分钟，并且间隔不能小于一小时，一天最大24个时间点。例如，周一到周天，每天14:00调度，其规则为：'FREQ=WEEKLY;BYDAY=MO，TU，WE，TH，FR，SA，SU;BYHOUR=14;BYMINUTE=00'。每天14:00调度，其规则为'FREQ=DAILY;INTERVAL=1;BYHOUR=14;BYMINUTE=00'。  **默认取值**: 不涉及 
     * @return pattern
     */
    public List<String> getPattern() {
        return pattern;
    }

    public void setPattern(List<String> pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupTriggerPropertiesRequestInfo1 that = (BackupTriggerPropertiesRequestInfo1) obj;
        return Objects.equals(this.pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupTriggerPropertiesRequestInfo1 {\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
