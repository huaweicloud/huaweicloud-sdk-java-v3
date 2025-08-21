package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchCreateApplicationViewRequestBodyComponentList
 */
public class BatchCreateApplicationViewRequestBodyComponentList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    public BatchCreateApplicationViewRequestBodyComponentList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 组件名称。 **约束限制：** 不涉及。 **取值范围：** 由中文、英文字母、数字、中划线、下划线组成，长度在3~50个字符之间。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchCreateApplicationViewRequestBodyComponentList withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * **参数解释：** 父节点名称。 **约束限制：** 不涉及。 **取值范围：** 字符串，长度3到50个字符。 **默认取值：** 不涉及。
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateApplicationViewRequestBodyComponentList that =
            (BatchCreateApplicationViewRequestBodyComponentList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.parentName, that.parentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parentName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateApplicationViewRequestBodyComponentList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
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
