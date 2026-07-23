package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListOpsSynthesisItemsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synthesis_id")

    private String synthesisId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListOpsSynthesisItemsRequest withSynthesisId(String synthesisId) {
        this.synthesisId = synthesisId;
        return this;
    }

    /**
     * **参数解释：** 合成任务的唯一标识符（ID），该参数用于在路径中指定特定的合成任务，以便执行查询、停止或删除等操作。 **约束限制：** 字符串长度限制为1到64个字符。通常采用标准 UUID格式。 **取值范围：** 1-64位字符。 **默认取值：** 不涉及。 
     * @return synthesisId
     */
    public String getSynthesisId() {
        return synthesisId;
    }

    public void setSynthesisId(String synthesisId) {
        this.synthesisId = synthesisId;
    }

    public ListOpsSynthesisItemsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 分页查询的起始偏移量。用于指定从满足条件的第几条记录开始返回，常与 limit参数配合实现分页功能。 **约束限制：** 必须为整数，且大小在0到10,000之间。 **取值范围：** 0-10000。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListOpsSynthesisItemsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 单次查询返回的最大记录数量。用于控制分页查询时每页显示的数据条数。 **约束限制：** 必须为整数，且大小在1到100之间。 **取值范围：** 1-100。 **默认取值：** 10。 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsSynthesisItemsRequest that = (ListOpsSynthesisItemsRequest) obj;
        return Objects.equals(this.synthesisId, that.synthesisId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(synthesisId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsSynthesisItemsRequest {\n");
        sb.append("    synthesisId: ").append(toIndentedString(synthesisId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
