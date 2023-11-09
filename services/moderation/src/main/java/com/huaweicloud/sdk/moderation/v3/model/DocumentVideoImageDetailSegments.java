package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DocumentVideoImageDetailSegments
 */
public class DocumentVideoImageDetailSegments {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment")

    private String segment;

    public DocumentVideoImageDetailSegments withSegment(String segment) {
        this.segment = segment;
        return this;
    }

    /**
     * 命中的风险片段
     * @return segment
     */
    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentVideoImageDetailSegments that = (DocumentVideoImageDetailSegments) obj;
        return Objects.equals(this.segment, that.segment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentVideoImageDetailSegments {\n");
        sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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
