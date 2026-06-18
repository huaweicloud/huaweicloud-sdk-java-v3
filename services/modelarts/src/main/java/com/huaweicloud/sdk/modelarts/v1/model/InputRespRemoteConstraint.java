package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InputRespRemoteConstraint
 */
public class InputRespRemoteConstraint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private String attributes;

    public InputRespRemoteConstraint withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * **参数解释**：数据输入类型，包括数据存储位置、数据集两种方式。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public InputRespRemoteConstraint withAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * **参数解释**：相关属性。 **约束限制**：不涉及。 **取值范围**： 数据输入为数据集时：   - data_format：数据格式   - data_segmentation：数据切分方式   - dataset_type：标注类型  **默认取值**：不涉及。
     * @return attributes
     */
    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputRespRemoteConstraint that = (InputRespRemoteConstraint) obj;
        return Objects.equals(this.dataType, that.dataType) && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputRespRemoteConstraint {\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
