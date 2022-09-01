package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDependcyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_id")

    @JacksonXmlProperty(localName = "depend_id")

    private String dependId;

    public ShowDependcyRequest withDependId(String dependId) {
        this.dependId = dependId;
        return this;
    }

    /**
     * 依赖包的ID。
     * @return dependId
     */
    public String getDependId() {
        return dependId;
    }

    public void setDependId(String dependId) {
        this.dependId = dependId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDependcyRequest showDependcyRequest = (ShowDependcyRequest) o;
        return Objects.equals(this.dependId, showDependcyRequest.dependId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDependcyRequest {\n");
        sb.append("    dependId: ").append(toIndentedString(dependId)).append("\n");
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
