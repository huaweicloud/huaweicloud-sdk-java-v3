package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 更新标签信息的请求体，支持修改名称、类型及枚举值。 **约束限制：** name、type、enums为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class UpdateOpsLabelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enums")

    private List<OpsLabelValueItem> enums = null;

    public UpdateOpsLabelRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 更新后的标签名称。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateOpsLabelRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 标签的类型（如 free-text 等）。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateOpsLabelRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 对该标签用途或修改变动的详细说明。 **约束限制：** 字符串长度为0到400个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateOpsLabelRequestBody withEnums(List<OpsLabelValueItem> enums) {
        this.enums = enums;
        return this;
    }

    public UpdateOpsLabelRequestBody addEnumsItem(OpsLabelValueItem enumsItem) {
        if (this.enums == null) {
            this.enums = new ArrayList<>();
        }
        this.enums.add(enumsItem);
        return this;
    }

    public UpdateOpsLabelRequestBody withEnums(Consumer<List<OpsLabelValueItem>> enumsSetter) {
        if (this.enums == null) {
            this.enums = new ArrayList<>();
        }
        enumsSetter.accept(this.enums);
        return this;
    }

    /**
     * **参数解释：** 标签的可选值（枚举）列表。 **约束限制：** 数组长度为0到100。 **取值范围：** 不涉及。 **默认取值：** 空列表。 
     * @return enums
     */
    public List<OpsLabelValueItem> getEnums() {
        return enums;
    }

    public void setEnums(List<OpsLabelValueItem> enums) {
        this.enums = enums;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOpsLabelRequestBody that = (UpdateOpsLabelRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description) && Objects.equals(this.enums, that.enums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, enums);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsLabelRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enums: ").append(toIndentedString(enums)).append("\n");
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
