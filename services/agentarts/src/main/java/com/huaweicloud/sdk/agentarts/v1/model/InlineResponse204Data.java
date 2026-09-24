package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 批量删除结果对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class InlineResponse204Data {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_ids")

    private List<String> successIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_ids")

    private List<String> failedIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_requested")

    private Integer totalRequested;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_deleted")

    private Integer totalDeleted;

    public InlineResponse204Data withSuccessIds(List<String> successIds) {
        this.successIds = successIds;
        return this;
    }

    public InlineResponse204Data addSuccessIdsItem(String successIdsItem) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        this.successIds.add(successIdsItem);
        return this;
    }

    public InlineResponse204Data withSuccessIds(Consumer<List<String>> successIdsSetter) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        successIdsSetter.accept(this.successIds);
        return this;
    }

    /**
     * **参数解释：** 成功删除的任务ID列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return successIds
     */
    public List<String> getSuccessIds() {
        return successIds;
    }

    public void setSuccessIds(List<String> successIds) {
        this.successIds = successIds;
    }

    public InlineResponse204Data withFailedIds(List<String> failedIds) {
        this.failedIds = failedIds;
        return this;
    }

    public InlineResponse204Data addFailedIdsItem(String failedIdsItem) {
        if (this.failedIds == null) {
            this.failedIds = new ArrayList<>();
        }
        this.failedIds.add(failedIdsItem);
        return this;
    }

    public InlineResponse204Data withFailedIds(Consumer<List<String>> failedIdsSetter) {
        if (this.failedIds == null) {
            this.failedIds = new ArrayList<>();
        }
        failedIdsSetter.accept(this.failedIds);
        return this;
    }

    /**
     * **参数解释：** 删除失败的任务ID列表（通常因为ID不存在、状态已删除或权限不足）。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return failedIds
     */
    public List<String> getFailedIds() {
        return failedIds;
    }

    public void setFailedIds(List<String> failedIds) {
        this.failedIds = failedIds;
    }

    public InlineResponse204Data withTotalRequested(Integer totalRequested) {
        this.totalRequested = totalRequested;
        return this;
    }

    /**
     * **参数解释：** 请求删除的任务总数。 **约束限制：** 不涉及。 **取值范围：** 非负整数。 **默认取值：** 不涉及。 
     * minimum: 0
     * @return totalRequested
     */
    public Integer getTotalRequested() {
        return totalRequested;
    }

    public void setTotalRequested(Integer totalRequested) {
        this.totalRequested = totalRequested;
    }

    public InlineResponse204Data withTotalDeleted(Integer totalDeleted) {
        this.totalDeleted = totalDeleted;
        return this;
    }

    /**
     * **参数解释：** 实际删除成功的任务数。 **约束限制：** 不涉及。 **取值范围：** 非负整数。 **默认取值：** 不涉及。 
     * minimum: 0
     * @return totalDeleted
     */
    public Integer getTotalDeleted() {
        return totalDeleted;
    }

    public void setTotalDeleted(Integer totalDeleted) {
        this.totalDeleted = totalDeleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InlineResponse204Data that = (InlineResponse204Data) obj;
        return Objects.equals(this.successIds, that.successIds) && Objects.equals(this.failedIds, that.failedIds)
            && Objects.equals(this.totalRequested, that.totalRequested)
            && Objects.equals(this.totalDeleted, that.totalDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successIds, failedIds, totalRequested, totalDeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse204Data {\n");
        sb.append("    successIds: ").append(toIndentedString(successIds)).append("\n");
        sb.append("    failedIds: ").append(toIndentedString(failedIds)).append("\n");
        sb.append("    totalRequested: ").append(toIndentedString(totalRequested)).append("\n");
        sb.append("    totalDeleted: ").append(toIndentedString(totalDeleted)).append("\n");
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
