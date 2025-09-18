package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ActionsPipelineRunsQueryDTO
 */
public class ActionsPipelineRunsQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Long page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private String pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_url")

    private String httpsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_name")

    private String pipelineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_run_name")

    private String pipelineRunName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private String event;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actor")

    private String actor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ActionsPipelineRunsQueryDTO withPage(Long page) {
        this.page = page;
        return this;
    }

    /**
     * **参数解释**： 分页查询页码。 **约束限制**： 不涉及。 **取值范围**： 大于0。 **默认取值**： 不涉及。 
     * @return page
     */
    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public ActionsPipelineRunsQueryDTO withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释**： 每页的查询数量。 **约束限制**： 不涉及。 **取值范围**： 固定20。 **默认取值**： 不涉及。 
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public ActionsPipelineRunsQueryDTO withHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
        return this;
    }

    /**
     * **参数解释**： 代码源地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return httpsUrl
     */
    public String getHttpsUrl() {
        return httpsUrl;
    }

    public void setHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
    }

    public ActionsPipelineRunsQueryDTO withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * **参数解释**： 流水线名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public ActionsPipelineRunsQueryDTO withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： 文件所处路径。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ActionsPipelineRunsQueryDTO withPipelineRunName(String pipelineRunName) {
        this.pipelineRunName = pipelineRunName;
        return this;
    }

    /**
     * **参数解释**： 流水线运行人名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return pipelineRunName
     */
    public String getPipelineRunName() {
        return pipelineRunName;
    }

    public void setPipelineRunName(String pipelineRunName) {
        this.pipelineRunName = pipelineRunName;
    }

    public ActionsPipelineRunsQueryDTO withEvent(String event) {
        this.event = event;
        return this;
    }

    /**
     * **参数解释**： 流水线触发类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return event
     */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public ActionsPipelineRunsQueryDTO withActor(String actor) {
        this.actor = actor;
        return this;
    }

    /**
     * **参数解释**： 流水线创建者名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return actor
     */
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public ActionsPipelineRunsQueryDTO withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释**： 代码源分支。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public ActionsPipelineRunsQueryDTO withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 流水线运行状态。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionsPipelineRunsQueryDTO that = (ActionsPipelineRunsQueryDTO) obj;
        return Objects.equals(this.page, that.page) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.httpsUrl, that.httpsUrl) && Objects.equals(this.pipelineName, that.pipelineName)
            && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.pipelineRunName, that.pipelineRunName) && Objects.equals(this.event, that.event)
            && Objects.equals(this.actor, that.actor) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(page, pageSize, httpsUrl, pipelineName, filePath, pipelineRunName, event, actor, branch, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsPipelineRunsQueryDTO {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    httpsUrl: ").append(toIndentedString(httpsUrl)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    pipelineRunName: ").append(toIndentedString(pipelineRunName)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
