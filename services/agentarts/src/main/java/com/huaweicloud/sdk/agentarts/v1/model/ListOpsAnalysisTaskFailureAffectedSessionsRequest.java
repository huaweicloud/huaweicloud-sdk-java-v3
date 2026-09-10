package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListOpsAnalysisTaskFailureAffectedSessionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_task_id")

    private String analysisTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_sub_category_name")

    private String errorSubCategoryName;

    public ListOpsAnalysisTaskFailureAffectedSessionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 返回结果偏移量。 **约束限制：** 必须为非负整数。 **取值范围：** 0-100000。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListOpsAnalysisTaskFailureAffectedSessionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 限制数量。 **约束限制：** 不涉及。 **取值范围：** 正整数，最大值100。 **默认取值：** 100。
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

    public ListOpsAnalysisTaskFailureAffectedSessionsRequest withAnalysisTaskId(String analysisTaskId) {
        this.analysisTaskId = analysisTaskId;
        return this;
    }

    /**
     * **参数解释：** 分析任务ID，标识任务的唯一标识符。获取方法请参考查询分析任务列表。  **约束限制：** 不涉及  **取值范围：** 32位ID字符串。  **默认取值：** 无
     * @return analysisTaskId
     */
    public String getAnalysisTaskId() {
        return analysisTaskId;
    }

    public void setAnalysisTaskId(String analysisTaskId) {
        this.analysisTaskId = analysisTaskId;
    }

    public ListOpsAnalysisTaskFailureAffectedSessionsRequest withErrorSubCategoryName(String errorSubCategoryName) {
        this.errorSubCategoryName = errorSubCategoryName;
        return this;
    }

    /**
     * Get errorSubCategoryName
     * @return errorSubCategoryName
     */
    public String getErrorSubCategoryName() {
        return errorSubCategoryName;
    }

    public void setErrorSubCategoryName(String errorSubCategoryName) {
        this.errorSubCategoryName = errorSubCategoryName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAnalysisTaskFailureAffectedSessionsRequest that =
            (ListOpsAnalysisTaskFailureAffectedSessionsRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.analysisTaskId, that.analysisTaskId)
            && Objects.equals(this.errorSubCategoryName, that.errorSubCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, analysisTaskId, errorSubCategoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAnalysisTaskFailureAffectedSessionsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    analysisTaskId: ").append(toIndentedString(analysisTaskId)).append("\n");
        sb.append("    errorSubCategoryName: ").append(toIndentedString(errorSubCategoryName)).append("\n");
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
