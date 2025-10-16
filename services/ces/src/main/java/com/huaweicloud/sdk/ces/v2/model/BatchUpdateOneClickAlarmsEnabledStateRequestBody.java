package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateOneClickAlarmsEnabledStateRequestBody
 */
public class BatchUpdateOneClickAlarmsEnabledStateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_ids")

    private List<String> alarmIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    private Boolean alarmEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retain_when_all_disabled")

    private Boolean retainWhenAllDisabled;

    public BatchUpdateOneClickAlarmsEnabledStateRequestBody withAlarmIds(List<String> alarmIds) {
        this.alarmIds = alarmIds;
        return this;
    }

    public BatchUpdateOneClickAlarmsEnabledStateRequestBody addAlarmIdsItem(String alarmIdsItem) {
        if (this.alarmIds == null) {
            this.alarmIds = new ArrayList<>();
        }
        this.alarmIds.add(alarmIdsItem);
        return this;
    }

    public BatchUpdateOneClickAlarmsEnabledStateRequestBody withAlarmIds(Consumer<List<String>> alarmIdsSetter) {
        if (this.alarmIds == null) {
            this.alarmIds = new ArrayList<>();
        }
        alarmIdsSetter.accept(this.alarmIds);
        return this;
    }

    /**
     * 需要批量启停的告警规则的ID列表
     * @return alarmIds
     */
    public List<String> getAlarmIds() {
        return alarmIds;
    }

    public void setAlarmIds(List<String> alarmIds) {
        this.alarmIds = alarmIds;
    }

    public BatchUpdateOneClickAlarmsEnabledStateRequestBody withAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否开启告警规则。     **约束限制**： 不涉及。 **取值范围**： 布尔值。 - true:开启。 - false:关闭。 **默认取值**： true 
     * @return alarmEnabled
     */
    public Boolean getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public BatchUpdateOneClickAlarmsEnabledStateRequestBody withRetainWhenAllDisabled(Boolean retainWhenAllDisabled) {
        this.retainWhenAllDisabled = retainWhenAllDisabled;
        return this;
    }

    /**
     * 一键告警中的规则全部被停用时是否保留规则信息。true:保留；false:删除。
     * @return retainWhenAllDisabled
     */
    public Boolean getRetainWhenAllDisabled() {
        return retainWhenAllDisabled;
    }

    public void setRetainWhenAllDisabled(Boolean retainWhenAllDisabled) {
        this.retainWhenAllDisabled = retainWhenAllDisabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateOneClickAlarmsEnabledStateRequestBody that = (BatchUpdateOneClickAlarmsEnabledStateRequestBody) obj;
        return Objects.equals(this.alarmIds, that.alarmIds) && Objects.equals(this.alarmEnabled, that.alarmEnabled)
            && Objects.equals(this.retainWhenAllDisabled, that.retainWhenAllDisabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmIds, alarmEnabled, retainWhenAllDisabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateOneClickAlarmsEnabledStateRequestBody {\n");
        sb.append("    alarmIds: ").append(toIndentedString(alarmIds)).append("\n");
        sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
        sb.append("    retainWhenAllDisabled: ").append(toIndentedString(retainWhenAllDisabled)).append("\n");
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
