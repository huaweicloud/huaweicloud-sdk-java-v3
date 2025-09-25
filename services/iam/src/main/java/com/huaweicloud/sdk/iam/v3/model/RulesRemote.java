package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class RulesRemote {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "any_one_of")

    private List<String> anyOneOf = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_any_of")

    private List<String> notAnyOf = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex")

    private Boolean regex;

    public RulesRemote withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 表示IdP断言中的属性。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RulesRemote withAnyOneOf(List<String> anyOneOf) {
        this.anyOneOf = anyOneOf;
        return this;
    }

    public RulesRemote addAnyOneOfItem(String anyOneOfItem) {
        if (this.anyOneOf == null) {
            this.anyOneOf = new ArrayList<>();
        }
        this.anyOneOf.add(anyOneOfItem);
        return this;
    }

    public RulesRemote withAnyOneOf(Consumer<List<String>> anyOneOfSetter) {
        if (this.anyOneOf == null) {
            this.anyOneOf = new ArrayList<>();
        }
        anyOneOfSetter.accept(this.anyOneOf);
        return this;
    }

    /**
     * 输入属性值中包含指定值才生效，并返回布尔值，返回值不能用于local块中的占位符。在同一个remote数组元素中，any_one_of与not_any_of互斥，两者至多填写一个，不能同时填写。
     * @return anyOneOf
     */
    public List<String> getAnyOneOf() {
        return anyOneOf;
    }

    public void setAnyOneOf(List<String> anyOneOf) {
        this.anyOneOf = anyOneOf;
    }

    public RulesRemote withNotAnyOf(List<String> notAnyOf) {
        this.notAnyOf = notAnyOf;
        return this;
    }

    public RulesRemote addNotAnyOfItem(String notAnyOfItem) {
        if (this.notAnyOf == null) {
            this.notAnyOf = new ArrayList<>();
        }
        this.notAnyOf.add(notAnyOfItem);
        return this;
    }

    public RulesRemote withNotAnyOf(Consumer<List<String>> notAnyOfSetter) {
        if (this.notAnyOf == null) {
            this.notAnyOf = new ArrayList<>();
        }
        notAnyOfSetter.accept(this.notAnyOf);
        return this;
    }

    /**
     * 输入属性值中不包含指定值才生效，并返回布尔值，返回值不能用于local块中的占位符。在同一个remote数组元素中，any_one_of与not_any_of互斥，两者至多填写一个，不能同时填写。
     * @return notAnyOf
     */
    public List<String> getNotAnyOf() {
        return notAnyOf;
    }

    public void setNotAnyOf(List<String> notAnyOf) {
        this.notAnyOf = notAnyOf;
    }

    public RulesRemote withRegex(Boolean regex) {
        this.regex = regex;
        return this;
    }

    /**
     * 同级的any_one_of或not_any_of的值是否支持正则表达式，true：支持正则表达式，false：不支持正则表达式，默认为false。
     * @return regex
     */
    public Boolean getRegex() {
        return regex;
    }

    public void setRegex(Boolean regex) {
        this.regex = regex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RulesRemote that = (RulesRemote) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.anyOneOf, that.anyOneOf)
            && Objects.equals(this.notAnyOf, that.notAnyOf) && Objects.equals(this.regex, that.regex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, anyOneOf, notAnyOf, regex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RulesRemote {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    anyOneOf: ").append(toIndentedString(anyOneOf)).append("\n");
        sb.append("    notAnyOf: ").append(toIndentedString(notAnyOf)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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
