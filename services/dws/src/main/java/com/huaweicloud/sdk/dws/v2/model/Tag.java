package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 标签信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class Tag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**： 标签的键。 **约束限制**： 不涉及。 **取值范围**： - 输入标签键的最大长度为128个unicode字符，不能为空字符串，且首尾字符不能为空格； - 不能包含“=”,“*”,“<”,“>”,“\\\\”,“,”,“|”,“/”； - 只能包含大写字母（A-Z）、小写字母（a-z）、数字（0-9）和特殊字符（中划线-、下划线_）以及中文字符； **默认取值**： 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Tag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 标签的值。 **约束限制**： 不涉及。 **取值范围**： - 输入标签值的最大长度为256个字符，首尾字符不能为空格，可以为空字符串。 - 不能包含“=”,“*”,“<”,“>”,“\\\\”,“,”,“|”,“/”。 - 只能包含大写字母（A-Z）、小写字母（a-z）、数字（0-9）和特殊字符（中划线-、下划线_）以及中文字符。 **默认取值**： 不涉及。
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
        Tag that = (Tag) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
