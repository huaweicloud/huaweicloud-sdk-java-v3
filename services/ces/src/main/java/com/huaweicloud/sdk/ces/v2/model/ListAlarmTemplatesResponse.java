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
public class ListAlarmTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_templates")

    private List<AlarmTemplates> alarmTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAlarmTemplatesResponse withAlarmTemplates(List<AlarmTemplates> alarmTemplates) {
        this.alarmTemplates = alarmTemplates;
        return this;
    }

    public ListAlarmTemplatesResponse addAlarmTemplatesItem(AlarmTemplates alarmTemplatesItem) {
        if (this.alarmTemplates == null) {
            this.alarmTemplates = new ArrayList<>();
        }
        this.alarmTemplates.add(alarmTemplatesItem);
        return this;
    }

    public ListAlarmTemplatesResponse withAlarmTemplates(Consumer<List<AlarmTemplates>> alarmTemplatesSetter) {
        if (this.alarmTemplates == null) {
            this.alarmTemplates = new ArrayList<>();
        }
        alarmTemplatesSetter.accept(this.alarmTemplates);
        return this;
    }

    /**
     * 告警模板列表
     * @return alarmTemplates
     */
    public List<AlarmTemplates> getAlarmTemplates() {
        return alarmTemplates;
    }

    public void setAlarmTemplates(List<AlarmTemplates> alarmTemplates) {
        this.alarmTemplates = alarmTemplates;
    }

    public ListAlarmTemplatesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警模板记录总数
     * minimum: 0
     * maximum: 9999999
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmTemplatesResponse listAlarmTemplatesResponse = (ListAlarmTemplatesResponse) o;
        return Objects.equals(this.alarmTemplates, listAlarmTemplatesResponse.alarmTemplates)
            && Objects.equals(this.count, listAlarmTemplatesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmTemplates, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmTemplatesResponse {\n");
        sb.append("    alarmTemplates: ").append(toIndentedString(alarmTemplates)).append("\n");
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
