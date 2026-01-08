package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：要添加或删除的资源标签。  **约束限制**：不涉及
 */
public class ChangeResourceTagOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ChangeResourceTagOption withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**：标签的键。  **约束限制**：不能传入空值。  **取值范围**：最大长度36个unicode字符。 不能包含非打印字符\"=\"，“*”，“<”，“>”，“\\”，“,”，\"|\"，“/”。  **默认取值**：不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ChangeResourceTagOption withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**：标签的值，可以传入空字符串，表示任何值。  **约束限制**：注意删除标签也需要同时传入标签键值。  **取值范围**：最大长度255个unicode字符。 不能包含非打印字符\"=\"，“*”，“<”，“>”，“\\”，“,”，\"|\"，“/”。  **默认取值**：不涉及
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
        ChangeResourceTagOption that = (ChangeResourceTagOption) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeResourceTagOption {\n");
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
