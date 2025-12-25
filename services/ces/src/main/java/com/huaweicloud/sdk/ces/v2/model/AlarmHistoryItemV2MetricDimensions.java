package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 资源信息。 **取值范围**： 不涉及。 
 */
public class AlarmHistoryItemV2MetricDimensions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public AlarmHistoryItemV2MetricDimensions withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 资源维度名称，如：弹性云服务器，则维度为instance_id。各服务资源的维度名称可查看：“[服务维度名称](ces_03_0059.xml)”。 **取值范围**： 以字母开头，只能包含字母、数字、“_”、“-”。长度为[1,32]个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlarmHistoryItemV2MetricDimensions withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 资源维度值，为资源的实例ID，如：4270ff17-aba3-4138-89fa-820594c39755。 **取值范围**： 字符串长度在 1 到 256 之间。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmHistoryItemV2MetricDimensions that = (AlarmHistoryItemV2MetricDimensions) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmHistoryItemV2MetricDimensions {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
