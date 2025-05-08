package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListExecutionStepsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_step_id_list")

    private List<String> executionStepIdList = null;

    public ListExecutionStepsRequest withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * Get executionId
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public ListExecutionStepsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListExecutionStepsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 从offset指定的下一条数据开始查询
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListExecutionStepsRequest withExecutionStepIdList(List<String> executionStepIdList) {
        this.executionStepIdList = executionStepIdList;
        return this;
    }

    public ListExecutionStepsRequest addExecutionStepIdListItem(String executionStepIdListItem) {
        if (this.executionStepIdList == null) {
            this.executionStepIdList = new ArrayList<>();
        }
        this.executionStepIdList.add(executionStepIdListItem);
        return this;
    }

    public ListExecutionStepsRequest withExecutionStepIdList(Consumer<List<String>> executionStepIdListSetter) {
        if (this.executionStepIdList == null) {
            this.executionStepIdList = new ArrayList<>();
        }
        executionStepIdListSetter.accept(this.executionStepIdList);
        return this;
    }

    /**
     * 步骤id数组
     * @return executionStepIdList
     */
    public List<String> getExecutionStepIdList() {
        return executionStepIdList;
    }

    public void setExecutionStepIdList(List<String> executionStepIdList) {
        this.executionStepIdList = executionStepIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExecutionStepsRequest that = (ListExecutionStepsRequest) obj;
        return Objects.equals(this.executionId, that.executionId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.executionStepIdList, that.executionStepIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionId, limit, offset, executionStepIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExecutionStepsRequest {\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    executionStepIdList: ").append(toIndentedString(executionStepIdList)).append("\n");
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
