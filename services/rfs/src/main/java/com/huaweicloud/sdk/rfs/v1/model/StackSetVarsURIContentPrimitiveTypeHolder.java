package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StackSetVarsURIContentPrimitiveTypeHolder
 */
public class StackSetVarsURIContentPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_uri_content")

    private String varsUriContent;

    public StackSetVarsURIContentPrimitiveTypeHolder withVarsUriContent(String varsUriContent) {
        this.varsUriContent = varsUriContent;
        return this;
    }

    /**
     * vars_uri对应的文件内容
     * @return varsUriContent
     */
    public String getVarsUriContent() {
        return varsUriContent;
    }

    public void setVarsUriContent(String varsUriContent) {
        this.varsUriContent = varsUriContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackSetVarsURIContentPrimitiveTypeHolder that = (StackSetVarsURIContentPrimitiveTypeHolder) obj;
        return Objects.equals(this.varsUriContent, that.varsUriContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varsUriContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackSetVarsURIContentPrimitiveTypeHolder {\n");
        sb.append("    varsUriContent: ").append(toIndentedString(varsUriContent)).append("\n");
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
