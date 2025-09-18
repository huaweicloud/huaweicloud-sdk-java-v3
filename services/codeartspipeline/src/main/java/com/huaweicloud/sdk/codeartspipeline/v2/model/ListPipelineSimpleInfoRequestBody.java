package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 查询流水线信息对象 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
 */
public class ListPipelineSimpleInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_name")

    private String pipelineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_ids")

    private String projectIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_ids")

    private String creatorIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_ids")

    private String executorIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outcome")

    private String outcome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListPipelineSimpleInfoRequestBody withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * **参数解释**： 流水线名字。查询时进行模糊匹配。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public ListPipelineSimpleInfoRequestBody withProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }

    /**
     * **参数解释**： 项目id，有多个值时用逗号分隔，id个数取值[0,10]，非必选。如果该参数有值，则获取对应项目下的流水线列表；如果没有值，则获取用户有权限的所有项目的流水线列表 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return projectIds
     */
    public String getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(String projectIds) {
        this.projectIds = projectIds;
    }

    public ListPipelineSimpleInfoRequestBody withCreatorIds(String creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }

    /**
     * **参数解释**： 创建人id，有多个值时用逗号分隔，id个数取值[0,10]，非必选 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return creatorIds
     */
    public String getCreatorIds() {
        return creatorIds;
    }

    public void setCreatorIds(String creatorIds) {
        this.creatorIds = creatorIds;
    }

    public ListPipelineSimpleInfoRequestBody withExecutorIds(String executorIds) {
        this.executorIds = executorIds;
        return this;
    }

    /**
     * **参数解释**： 执行人id。有多个值时用逗号分隔，id个数取值[0,10]，非必选。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return executorIds
     */
    public String getExecutorIds() {
        return executorIds;
    }

    public void setExecutorIds(String executorIds) {
        this.executorIds = executorIds;
    }

    public ListPipelineSimpleInfoRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 流水线运行状态。 **约束限制**： 不涉及。 **取值范围**： - waiting：等待中。 - running：运行中。 - verifying：待审核。 - suspending：挂起。 - completed：执行完成。 **默认取值**： 不涉及。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPipelineSimpleInfoRequestBody withOutcome(String outcome) {
        this.outcome = outcome;
        return this;
    }

    /**
     * **参数解释**： 流水线执行结果。 **约束限制**： 不涉及。 **取值范围**： - success：成功。 - error：失败。 - aborted：终止。 **默认取值**： 不涉及。 
     * @return outcome
     */
    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public ListPipelineSimpleInfoRequestBody withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**： 用于排序的字段，非必选。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListPipelineSimpleInfoRequestBody withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**： 排序方式。 **约束限制**： 不涉及。 **取值范围**： - asc：按排序字段升序。 - desc：按排序字段降序。 **默认取值**： 不涉及。 
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListPipelineSimpleInfoRequestBody withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释**： 代码仓地址。仅支持codehub仓库，如：git@codehub.XXX.git **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public ListPipelineSimpleInfoRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 偏移量。表示从此偏移量开始查询。 **约束限制**： 不涉及。 **取值范围**： offset大于等于0。 **默认取值**： 不涉及。 
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPipelineSimpleInfoRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 每次查询的条目数量。 **约束限制**： 不涉及。 **取值范围**： 取值[10-50]。 **默认取值**： 10。 
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
        ListPipelineSimpleInfoRequestBody that = (ListPipelineSimpleInfoRequestBody) obj;
        return Objects.equals(this.pipelineName, that.pipelineName) && Objects.equals(this.projectIds, that.projectIds)
            && Objects.equals(this.creatorIds, that.creatorIds) && Objects.equals(this.executorIds, that.executorIds)
            && Objects.equals(this.status, that.status) && Objects.equals(this.outcome, that.outcome)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.gitUrl, that.gitUrl) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineName,
            projectIds,
            creatorIds,
            executorIds,
            status,
            outcome,
            sortKey,
            sortDir,
            gitUrl,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineSimpleInfoRequestBody {\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
        sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
        sb.append("    executorIds: ").append(toIndentedString(executorIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
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
