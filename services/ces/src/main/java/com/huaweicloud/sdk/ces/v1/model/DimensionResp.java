package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 指标维度。 
 */
public class DimensionResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public DimensionResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 监控维度名称，如ECS的维度为instance_id。各服务资源的指标维度名称可查看：“[服务维度名称](ces_03_0059.xml)”。 **取值范围**： 以字母开头，只能包含字母、数字、“_”、“-”。长度[1,32]个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DimensionResp withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 监控维度取值，例如ECS的ID。 **取值范围**： 长度为[0,256]个字符。 
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
        DimensionResp that = (DimensionResp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionResp {\n");
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
