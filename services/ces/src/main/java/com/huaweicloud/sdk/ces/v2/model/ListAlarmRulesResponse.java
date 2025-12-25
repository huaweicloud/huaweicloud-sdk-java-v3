package com.huaweicloud.sdk.ces.v2.model;

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
public class ListAlarmRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarms")

    private List<ListAlarmRespBodyAlarms> alarms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAlarmRulesResponse withAlarms(List<ListAlarmRespBodyAlarms> alarms) {
        this.alarms = alarms;
        return this;
    }

    public ListAlarmRulesResponse addAlarmsItem(ListAlarmRespBodyAlarms alarmsItem) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        this.alarms.add(alarmsItem);
        return this;
    }

    public ListAlarmRulesResponse withAlarms(Consumer<List<ListAlarmRespBodyAlarms>> alarmsSetter) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        alarmsSetter.accept(this.alarms);
        return this;
    }

    /**
     * **参数解释**： 告警规则列表。 **取值范围**： 最多包含100个告警规则信息。 
     * @return alarms
     */
    public List<ListAlarmRespBodyAlarms> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<ListAlarmRespBodyAlarms> alarms) {
        this.alarms = alarms;
    }

    public ListAlarmRulesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 告警规则总数。 **取值范围**： [0,10000] 
     * minimum: 0
     * maximum: 10000
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
        ListAlarmRulesResponse that = (ListAlarmRulesResponse) obj;
        return Objects.equals(this.alarms, that.alarms) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarms, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmRulesResponse {\n");
        sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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
