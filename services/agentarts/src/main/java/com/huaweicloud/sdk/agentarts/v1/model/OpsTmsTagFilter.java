package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** TMS标签过滤条件，用于按标签键和值列表过滤资源实例。 用于查询请求中的tags和sys_tags字段，以及响应中的标签聚合列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
 */
public class OpsTmsTagFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public OpsTmsTagFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 标签键。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public OpsTmsTagFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public OpsTmsTagFilter addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public OpsTmsTagFilter withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释：** 标签值列表，表示匹配该键下任意一个值的资源。数组元素为字符串类型，表示标签值。value以*开头时使用LIKE模糊匹配（contains），否则使用精确匹配。values为空列表时表示any_value（匹配该key下任意value）。 **约束限制：** 数组元素最小数量为0，最大数量为20。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTmsTagFilter that = (OpsTmsTagFilter) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTmsTagFilter {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
