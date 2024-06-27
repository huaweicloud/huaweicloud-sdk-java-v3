package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMetricOrEventAlarmRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rules")

    private List<AlarmParamForV4Db> alarmRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Object metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListMetricOrEventAlarmRuleResponse withAlarmRules(List<AlarmParamForV4Db> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }

    public ListMetricOrEventAlarmRuleResponse addAlarmRulesItem(AlarmParamForV4Db alarmRulesItem) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        this.alarmRules.add(alarmRulesItem);
        return this;
    }

    public ListMetricOrEventAlarmRuleResponse withAlarmRules(Consumer<List<AlarmParamForV4Db>> alarmRulesSetter) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        alarmRulesSetter.accept(this.alarmRules);
        return this;
    }

    /**
     * 告警规则列表。
     * @return alarmRules
     */
    public List<AlarmParamForV4Db> getAlarmRules() {
        return alarmRules;
    }

    public void setAlarmRules(List<AlarmParamForV4Db> alarmRules) {
        this.alarmRules = alarmRules;
    }

    public ListMetricOrEventAlarmRuleResponse withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 元数据信息。
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public ListMetricOrEventAlarmRuleResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警规则数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMetricOrEventAlarmRuleResponse that = (ListMetricOrEventAlarmRuleResponse) obj;
        return Objects.equals(this.alarmRules, that.alarmRules) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRules, metadata, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricOrEventAlarmRuleResponse {\n");
        sb.append("    alarmRules: ").append(toIndentedString(alarmRules)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
