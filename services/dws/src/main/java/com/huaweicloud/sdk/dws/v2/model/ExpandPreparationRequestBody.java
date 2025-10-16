package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 扩容准备操作请求体。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class ExpandPreparationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_node")

    private Integer numNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_retry")

    private Boolean isRetry;

    public ExpandPreparationRequestBody withNumNode(Integer numNode) {
        this.numNode = numNode;
        return this;
    }

    /**
     * **参数解释**： 扩容节点数。 **取值范围：** 大于等于3。
     * @return numNode
     */
    public Integer getNumNode() {
        return numNode;
    }

    public void setNumNode(Integer numNode) {
        this.numNode = numNode;
    }

    public ExpandPreparationRequestBody withIsRetry(Boolean isRetry) {
        this.isRetry = isRetry;
        return this;
    }

    /**
     * **参数解释**： 是否是扩容准备重试。 **约束限制**： 不涉及。 **取值范围**： true：扩容准备重试； false：首次进行扩容准备； **默认取值**： false
     * @return isRetry
     */
    public Boolean getIsRetry() {
        return isRetry;
    }

    public void setIsRetry(Boolean isRetry) {
        this.isRetry = isRetry;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandPreparationRequestBody that = (ExpandPreparationRequestBody) obj;
        return Objects.equals(this.numNode, that.numNode) && Objects.equals(this.isRetry, that.isRetry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numNode, isRetry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandPreparationRequestBody {\n");
        sb.append("    numNode: ").append(toIndentedString(numNode)).append("\n");
        sb.append("    isRetry: ").append(toIndentedString(isRetry)).append("\n");
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
