package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 聚合结果
 */
public class SearchPolicyRequestBodyGroupByGroupByHit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest")

    private String dest;

    public SearchPolicyRequestBodyGroupByGroupByHit withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 源字段
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public SearchPolicyRequestBodyGroupByGroupByHit withDest(String dest) {
        this.dest = dest;
        return this;
    }

    /**
     * 目标字段
     * @return dest
     */
    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchPolicyRequestBodyGroupByGroupByHit that = (SearchPolicyRequestBodyGroupByGroupByHit) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.dest, that.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, dest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchPolicyRequestBodyGroupByGroupByHit {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
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
