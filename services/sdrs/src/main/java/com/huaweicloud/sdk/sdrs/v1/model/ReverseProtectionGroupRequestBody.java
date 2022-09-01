package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 保护组切换请求体
 */
public class ReverseProtectionGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse-server-group")

    @JacksonXmlProperty(localName = "reverse-server-group")

    private ReverseProtectionGroupRequestParams reverseServerGroup;

    public ReverseProtectionGroupRequestBody withReverseServerGroup(
        ReverseProtectionGroupRequestParams reverseServerGroup) {
        this.reverseServerGroup = reverseServerGroup;
        return this;
    }

    public ReverseProtectionGroupRequestBody withReverseServerGroup(
        Consumer<ReverseProtectionGroupRequestParams> reverseServerGroupSetter) {
        if (this.reverseServerGroup == null) {
            this.reverseServerGroup = new ReverseProtectionGroupRequestParams();
            reverseServerGroupSetter.accept(this.reverseServerGroup);
        }

        return this;
    }

    /**
     * Get reverseServerGroup
     * @return reverseServerGroup
     */
    public ReverseProtectionGroupRequestParams getReverseServerGroup() {
        return reverseServerGroup;
    }

    public void setReverseServerGroup(ReverseProtectionGroupRequestParams reverseServerGroup) {
        this.reverseServerGroup = reverseServerGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReverseProtectionGroupRequestBody reverseProtectionGroupRequestBody = (ReverseProtectionGroupRequestBody) o;
        return Objects.equals(this.reverseServerGroup, reverseProtectionGroupRequestBody.reverseServerGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reverseServerGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReverseProtectionGroupRequestBody {\n");
        sb.append("    reverseServerGroup: ").append(toIndentedString(reverseServerGroup)).append("\n");
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
