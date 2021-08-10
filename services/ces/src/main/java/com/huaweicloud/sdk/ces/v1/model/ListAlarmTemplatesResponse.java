package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListAlarmTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_templates")

    private List<AlarmTemplate> alarmTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MetaData metaData;

    public ListAlarmTemplatesResponse withAlarmTemplates(List<AlarmTemplate> alarmTemplates) {
        this.alarmTemplates = alarmTemplates;
        return this;
    }

    public ListAlarmTemplatesResponse addAlarmTemplatesItem(AlarmTemplate alarmTemplatesItem) {
        if (this.alarmTemplates == null) {
            this.alarmTemplates = new ArrayList<>();
        }
        this.alarmTemplates.add(alarmTemplatesItem);
        return this;
    }

    public ListAlarmTemplatesResponse withAlarmTemplates(Consumer<List<AlarmTemplate>> alarmTemplatesSetter) {
        if (this.alarmTemplates == null) {
            this.alarmTemplates = new ArrayList<>();
        }
        alarmTemplatesSetter.accept(this.alarmTemplates);
        return this;
    }

    /** 自定义告警模板详细信息。
     * 
     * @return alarmTemplates */
    public List<AlarmTemplate> getAlarmTemplates() {
        return alarmTemplates;
    }

    public void setAlarmTemplates(List<AlarmTemplate> alarmTemplates) {
        this.alarmTemplates = alarmTemplates;
    }

    public ListAlarmTemplatesResponse withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListAlarmTemplatesResponse withMetaData(Consumer<MetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /** Get metaData
     * 
     * @return metaData */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
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
            && Objects.equals(this.metaData, listAlarmTemplatesResponse.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmTemplates, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmTemplatesResponse {\n");
        sb.append("    alarmTemplates: ").append(toIndentedString(alarmTemplates)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
