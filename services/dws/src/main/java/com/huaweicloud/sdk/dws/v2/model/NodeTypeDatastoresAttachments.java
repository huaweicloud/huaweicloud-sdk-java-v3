package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内核版本附加信息。
 */
public class NodeTypeDatastoresAttachments {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cn")

    private String minCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cn")

    private String maxCn;

    public NodeTypeDatastoresAttachments withMinCn(String minCn) {
        this.minCn = minCn;
        return this;
    }

    /**
     * 内核版本支持的最小CN。
     * @return minCn
     */
    public String getMinCn() {
        return minCn;
    }

    public void setMinCn(String minCn) {
        this.minCn = minCn;
    }

    public NodeTypeDatastoresAttachments withMaxCn(String maxCn) {
        this.maxCn = maxCn;
        return this;
    }

    /**
     * 内核版本支持的最大CN。
     * @return maxCn
     */
    public String getMaxCn() {
        return maxCn;
    }

    public void setMaxCn(String maxCn) {
        this.maxCn = maxCn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTypeDatastoresAttachments that = (NodeTypeDatastoresAttachments) obj;
        return Objects.equals(this.minCn, that.minCn) && Objects.equals(this.maxCn, that.maxCn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minCn, maxCn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTypeDatastoresAttachments {\n");
        sb.append("    minCn: ").append(toIndentedString(minCn)).append("\n");
        sb.append("    maxCn: ").append(toIndentedString(maxCn)).append("\n");
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
