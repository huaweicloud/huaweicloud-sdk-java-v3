package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * data，统一的返回结果的最外层数据结构。
 */
public class ResetLinkAttributeAndStandardResultData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private LinkAttributeAndElementVO value;

    public ResetLinkAttributeAndStandardResultData withValue(LinkAttributeAndElementVO value) {
        this.value = value;
        return this;
    }

    public ResetLinkAttributeAndStandardResultData withValue(Consumer<LinkAttributeAndElementVO> valueSetter) {
        if (this.value == null) {
            this.value = new LinkAttributeAndElementVO();
            valueSetter.accept(this.value);
        }

        return this;
    }

    /**
     * Get value
     * @return value
     */
    public LinkAttributeAndElementVO getValue() {
        return value;
    }

    public void setValue(LinkAttributeAndElementVO value) {
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
        ResetLinkAttributeAndStandardResultData that = (ResetLinkAttributeAndStandardResultData) obj;
        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetLinkAttributeAndStandardResultData {\n");
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
