package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 过滤策略。
 */
public class SubscriptionsFilterPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "string_equals")

    private List<String> stringEquals = null;

    public SubscriptionsFilterPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 过滤策略名称。 包含小写英文字母([a-z])、数字([0-9])、下划线(_)，下划线不得开始、结尾或连续出现），长度限制{1,32}，不能是smn_开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubscriptionsFilterPolicy withStringEquals(List<String> stringEquals) {
        this.stringEquals = stringEquals;
        return this;
    }

    public SubscriptionsFilterPolicy addStringEqualsItem(String stringEqualsItem) {
        if (this.stringEquals == null) {
            this.stringEquals = new ArrayList<>();
        }
        this.stringEquals.add(stringEqualsItem);
        return this;
    }

    public SubscriptionsFilterPolicy withStringEquals(Consumer<List<String>> stringEqualsSetter) {
        if (this.stringEquals == null) {
            this.stringEquals = new ArrayList<>();
        }
        stringEqualsSetter.accept(this.stringEquals);
        return this;
    }

    /**
     * 字符串精确匹配数组。数组长度[1, 10]，数组内容不能重复，值不能为null或者空字符串“ ”，长度限制[1,32]，中英文、数字、下划线
     * @return stringEquals
     */
    public List<String> getStringEquals() {
        return stringEquals;
    }

    public void setStringEquals(List<String> stringEquals) {
        this.stringEquals = stringEquals;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionsFilterPolicy that = (SubscriptionsFilterPolicy) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.stringEquals, that.stringEquals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stringEquals);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionsFilterPolicy {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    stringEquals: ").append(toIndentedString(stringEquals)).append("\n");
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
