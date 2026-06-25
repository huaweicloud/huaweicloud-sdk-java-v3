package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点的metadata信息。
 */
public class NodeListMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue")

    private String _continue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remainingItemCount")

    private Long remainingItemCount;

    public NodeListMetadata withContinue(String _continue) {
        this._continue = _continue;
        return this;
    }

    /**
     * **参数解释**：分页查询的偏移标志。 **取值范围**：取值来自用户上一次分页查询响应结果中metadata.continue中的值，值为空默认无偏移。
     * @return _continue
     */
    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    public NodeListMetadata withRemainingItemCount(Long remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
        return this;
    }

    /**
     * **参数解释**：分页查询中剩余资源的数量。 **默认取值**：不涉及。
     * @return remainingItemCount
     */
    public Long getRemainingItemCount() {
        return remainingItemCount;
    }

    public void setRemainingItemCount(Long remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeListMetadata that = (NodeListMetadata) obj;
        return Objects.equals(this._continue, that._continue)
            && Objects.equals(this.remainingItemCount, that.remainingItemCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_continue, remainingItemCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeListMetadata {\n");
        sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
        sb.append("    remainingItemCount: ").append(toIndentedString(remainingItemCount)).append("\n");
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
