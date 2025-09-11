package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSlowSqlStackResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gs_stack")

    private String gsStack;

    public ShowSlowSqlStackResponse withGsStack(String gsStack) {
        this.gsStack = gsStack;
        return this;
    }

    /**
     * **参数解释**: 堆栈信息。 **取值范围**: 不涉及。
     * @return gsStack
     */
    public String getGsStack() {
        return gsStack;
    }

    public void setGsStack(String gsStack) {
        this.gsStack = gsStack;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowSqlStackResponse that = (ShowSlowSqlStackResponse) obj;
        return Objects.equals(this.gsStack, that.gsStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gsStack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowSqlStackResponse {\n");
        sb.append("    gsStack: ").append(toIndentedString(gsStack)).append("\n");
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
