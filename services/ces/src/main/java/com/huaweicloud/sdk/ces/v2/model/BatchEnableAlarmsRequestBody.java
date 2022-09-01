package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "alarm_ids")

    private List<String> alarmIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    @JacksonXmlProperty(localName = "alarm_enabled")

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
     * 需要批量启停的告警规则的ID列表
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
     * 告警开关
     * @return alarmEnabled
     */
    public Boolean getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchEnableAlarmsRequestBody batchEnableAlarmsRequestBody = (BatchEnableAlarmsRequestBody) o;
        return Objects.equals(this.alarmIds, batchEnableAlarmsRequestBody.alarmIds)
            && Objects.equals(this.alarmEnabled, batchEnableAlarmsRequestBody.alarmEnabled);
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
