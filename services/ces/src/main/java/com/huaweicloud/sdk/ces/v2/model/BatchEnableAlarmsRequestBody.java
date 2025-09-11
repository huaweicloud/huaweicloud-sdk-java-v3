package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchEnableAlarmsRequestBody
 */
public class BatchEnableAlarmsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_ids")

    private List<String> alarmIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    private Boolean alarmEnabled;

    public BatchEnableAlarmsRequestBody withAlarmIds(List<String> alarmIds) {
        this.alarmIds = alarmIds;
        return this;
    }

    public BatchEnableAlarmsRequestBody addAlarmIdsItem(String alarmIdsItem) {
        if (this.alarmIds == null) {
            this.alarmIds = new ArrayList<>();
        }
        this.alarmIds.add(alarmIdsItem);
        return this;
    }

    public BatchEnableAlarmsRequestBody withAlarmIds(Consumer<List<String>> alarmIdsSetter) {
        if (this.alarmIds == null) {
            this.alarmIds = new ArrayList<>();
        }
        alarmIdsSetter.accept(this.alarmIds);
        return this;
    }

    /**
     * **参数解释**： 需要批量启停的告警规则的ID列表。 **约束限制**： 告警规则的ID的数量最多为100个，最少1个。 
     * @return alarmIds
     */
    public List<String> getAlarmIds() {
        return alarmIds;
    }

    public void setAlarmIds(List<String> alarmIds) {
        this.alarmIds = alarmIds;
    }

    public BatchEnableAlarmsRequestBody withAlarmEnabled(Boolean alarmEnabled) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchEnableAlarmsRequestBody that = (BatchEnableAlarmsRequestBody) obj;
        return Objects.equals(this.alarmIds, that.alarmIds) && Objects.equals(this.alarmEnabled, that.alarmEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmIds, alarmEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchEnableAlarmsRequestBody {\n");
        sb.append("    alarmIds: ").append(toIndentedString(alarmIds)).append("\n");
        sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
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
