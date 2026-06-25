package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPoolNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue")

    private String _continue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    public ListPoolNodesRequest withContinue(String _continue) {
        this._continue = _continue;
        return this;
    }

    /**
     * **参数解释**：分页查询的偏移标志。 **约束限制**：可选。 **取值范围**：取值来自用户上一次分页查询响应结果中metadata.continue中的值，值为空默认无偏移。 **默认取值**：不涉及。
     * @return _continue
     */
    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    public ListPoolNodesRequest withLimit(Integer limit) {
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

    public ListPoolNodesRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池的ID，取值自资源池详情的metadata.name字段。 **约束限制**：只能以小写字母开头，数字、中划线组成，不能以中划线结尾，且长度为36-63个字符。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPoolNodesRequest that = (ListPoolNodesRequest) obj;
        return Objects.equals(this._continue, that._continue) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.poolName, that.poolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_continue, limit, poolName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolNodesRequest {\n");
        sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
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
