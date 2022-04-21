package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询流水线信息对象
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
     * 流水线名字。参数存在，则进行模糊匹配
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
     * devCloud项目ids。该参数存在，则获取对应项目下的流水线列表，逗号分隔，id个数取值[0,10]；如果不存在，则获取调用方所属租户的流水线列表
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
     * 创建人id。该参数存在，逗号分隔，id个数取值[0,10]
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
     * 执行人id。该参数存在，逗号分隔，id个数取值[0,10]；
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
     * 流水线运行状态。取值范围：waiting,running,verifying,handling,suspending,completed
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
     * 流水线结果，标记流水线。error、success、aborted
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
     * 用于排序的字段。取值为：pipeline_name,create_time,start_time
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
     * 排序类型。asc按排序字段升序，desc按排序字段降序
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
     * codehub搜索链接：git@codehub.XXX.git；gitee搜索链接：git@gitee.com.XXX.git；github搜索链接：git@github.com.XXX.git等
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
     * 偏移量。表示从此偏移量开始查询，offset大于等于0，默认取值为0
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
     * 每次查询的条目数量。取值[10-50]，默认取值为10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPipelineSimpleInfoRequestBody listPipelineSimpleInfoRequestBody = (ListPipelineSimpleInfoRequestBody) o;
        return Objects.equals(this.pipelineName, listPipelineSimpleInfoRequestBody.pipelineName)
            && Objects.equals(this.projectIds, listPipelineSimpleInfoRequestBody.projectIds)
            && Objects.equals(this.creatorIds, listPipelineSimpleInfoRequestBody.creatorIds)
            && Objects.equals(this.executorIds, listPipelineSimpleInfoRequestBody.executorIds)
            && Objects.equals(this.status, listPipelineSimpleInfoRequestBody.status)
            && Objects.equals(this.outcome, listPipelineSimpleInfoRequestBody.outcome)
            && Objects.equals(this.sortKey, listPipelineSimpleInfoRequestBody.sortKey)
            && Objects.equals(this.sortDir, listPipelineSimpleInfoRequestBody.sortDir)
            && Objects.equals(this.gitUrl, listPipelineSimpleInfoRequestBody.gitUrl)
            && Objects.equals(this.offset, listPipelineSimpleInfoRequestBody.offset)
            && Objects.equals(this.limit, listPipelineSimpleInfoRequestBody.limit);
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
