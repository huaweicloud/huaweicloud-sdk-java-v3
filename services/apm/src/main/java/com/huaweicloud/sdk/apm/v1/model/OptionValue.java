package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可选值
 */
public class OptionValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hint")

    private String hint;

    public OptionValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 可选值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OptionValue withHint(String hint) {
        this.hint = hint;
        return this;
    }

    /**
     * 提示信息
     * @return hint
     */
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OptionValue that = (OptionValue) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.hint, that.hint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, hint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionValue {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
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
