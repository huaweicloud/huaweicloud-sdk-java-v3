package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** TOP5排名对象列表。 **取值范围：** 容量种类排名前五的应用或组件或分组的容量信息组成的列表。
 */
public class CapacityOrderResponseRankList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CapacityOrderResponseRankList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 应用或组件或者分组id。 **取值范围：** 容量种类排名在前五个的应用或者组件或分组对应的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CapacityOrderResponseRankList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 应用或组件或者分组的名称。 **取值范围：** 容量种类排名在前五个的应用或者组件或分组对应的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CapacityOrderResponseRankList withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 应用或组件或者分组的容量值。 **取值范围：** 容量种类排名在前五个的应用或者组件或分组对应的容量值。
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
        CapacityOrderResponseRankList that = (CapacityOrderResponseRankList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapacityOrderResponseRankList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
