package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmHost
 */
public class AlarmHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_infos")

    private List<AlarmInfo> alarmInfos = null;

    public AlarmHost withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public AlarmHost withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public AlarmHost withAlarmInfos(List<AlarmInfo> alarmInfos) {
        this.alarmInfos = alarmInfos;
        return this;
    }

    public AlarmHost addAlarmInfosItem(AlarmInfo alarmInfosItem) {
        if (this.alarmInfos == null) {
            this.alarmInfos = new ArrayList<>();
        }
        this.alarmInfos.add(alarmInfosItem);
        return this;
    }

    public AlarmHost withAlarmInfos(Consumer<List<AlarmInfo>> alarmInfosSetter) {
        if (this.alarmInfos == null) {
            this.alarmInfos = new ArrayList<>();
        }
        alarmInfosSetter.accept(this.alarmInfos);
        return this;
    }

    /**
     * 告警信息
     * @return alarmInfos
     */
    public List<AlarmInfo> getAlarmInfos() {
        return alarmInfos;
    }

    public void setAlarmInfos(List<AlarmInfo> alarmInfos) {
        this.alarmInfos = alarmInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmHost that = (AlarmHost) obj;
        return Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.alarmInfos, that.alarmInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceName, resourceId, alarmInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmHost {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    alarmInfos: ").append(toIndentedString(alarmInfos)).append("\n");
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
