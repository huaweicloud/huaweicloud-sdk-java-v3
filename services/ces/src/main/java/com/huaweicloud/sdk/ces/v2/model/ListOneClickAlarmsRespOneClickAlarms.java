package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListOneClickAlarmsRespOneClickAlarms
 */
public class ListOneClickAlarmsRespOneClickAlarms {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarm_id")

    private String oneClickAlarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public ListOneClickAlarmsRespOneClickAlarms withOneClickAlarmId(String oneClickAlarmId) {
        this.oneClickAlarmId = oneClickAlarmId;
        return this;
    }

    /**
     * 一键告警ID
     * @return oneClickAlarmId
     */
    public String getOneClickAlarmId() {
        return oneClickAlarmId;
    }

    public void setOneClickAlarmId(String oneClickAlarmId) {
        this.oneClickAlarmId = oneClickAlarmId;
    }

    public ListOneClickAlarmsRespOneClickAlarms withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 查询服务的命名空间，各服务命名空间请参考[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListOneClickAlarmsRespOneClickAlarms withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 一键告警描述，长度范围[0,256]，该字段默认值为空字符串
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListOneClickAlarmsRespOneClickAlarms withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 开关
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOneClickAlarmsRespOneClickAlarms that = (ListOneClickAlarmsRespOneClickAlarms) obj;
        return Objects.equals(this.oneClickAlarmId, that.oneClickAlarmId)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneClickAlarmId, namespace, description, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOneClickAlarmsRespOneClickAlarms {\n");
        sb.append("    oneClickAlarmId: ").append(toIndentedString(oneClickAlarmId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
