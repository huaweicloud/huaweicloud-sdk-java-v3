package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 内核版本附加信息。 **取值范围**： 不涉及。
 */
public class NodeTypeDatastoresAttachments {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cn")

    private Integer minCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cn")

    private Integer maxCn;

    public NodeTypeDatastoresAttachments withMinCn(Integer minCn) {
        this.minCn = minCn;
        return this;
    }

    /**
     * **参数解释**： 内核版本支持的最小CN。 **取值范围**： 大于0的正整数。
     * @return minCn
     */
    public Integer getMinCn() {
        return minCn;
    }

    public void setMinCn(Integer minCn) {
        this.minCn = minCn;
    }

    public NodeTypeDatastoresAttachments withMaxCn(Integer maxCn) {
        this.maxCn = maxCn;
        return this;
    }

    /**
     * **参数解释**： 内核版本支持的最大CN。 **取值范围**： 大于0的正整数。
     * @return maxCn
     */
    public Integer getMaxCn() {
        return maxCn;
    }

    public void setMaxCn(Integer maxCn) {
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
