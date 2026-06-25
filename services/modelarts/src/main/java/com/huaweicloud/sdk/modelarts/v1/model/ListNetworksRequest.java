package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListNetworksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelSelector")

    private String labelSelector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue")

    private String _continue;

    public ListNetworksRequest withLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    /**
     * **参数解释**：标签筛选。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return labelSelector
     */
    public String getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
    }

    public ListNetworksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：分页单次查询返回的资源数量。 **约束限制**：不涉及。 **取值范围**：0 - 500。 **默认取值**：500。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListNetworksRequest withContinue(String _continue) {
        this._continue = _continue;
        return this;
    }

    /**
     * **参数解释**：分页查询的偏移标志。取值来自用户上一次分页查询响应结果中metadata.continue中的值，值为空默认无偏移。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return _continue
     */
    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNetworksRequest that = (ListNetworksRequest) obj;
        return Objects.equals(this.labelSelector, that.labelSelector) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this._continue, that._continue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelSelector, limit, _continue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworksRequest {\n");
        sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
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
