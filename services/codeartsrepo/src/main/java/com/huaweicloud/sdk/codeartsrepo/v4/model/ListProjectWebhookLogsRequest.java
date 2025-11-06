package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectWebhookLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private Integer hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_after")

    private OffsetDateTime createdAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_before")

    private OffsetDateTime createdBefore;

    public ListProjectWebhookLogsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位uuid，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/en-us/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **取值范围：** 字符串长度32。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListProjectWebhookLogsRequest withHookId(Integer hookId) {
        this.hookId = hookId;
        return this;
    }

    /**
     * **参数解释：**  Webhook id。
     * minimum: 1
     * maximum: 2147483647
     * @return hookId
     */
    public Integer getHookId() {
        return hookId;
    }

    public void setHookId(Integer hookId) {
        this.hookId = hookId;
    }

    public ListProjectWebhookLogsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectWebhookLogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
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

    public ListProjectWebhookLogsRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库ID
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ListProjectWebhookLogsRequest withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * **参数解释：** Webhook每次发送消息时会在请求体中带上uuid字段。uuid具有唯一性，合并请求相关的Webhook事件中的uuid会包含合并请求iid。此处可以使用完整的uuid或者合并请求iid。 **约束限制：** 可选。 **取值范围：** 字符串长度不少于1，不超过100。 **默认取值：** 不涉及。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ListProjectWebhookLogsRequest withCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * **参数解释：** 检索执行时间段的起始时间
     * @return createdAfter
     */
    public OffsetDateTime getCreatedAfter() {
        return createdAfter;
    }

    public void setCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
    }

    public ListProjectWebhookLogsRequest withCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * **参数解释：** 检索执行时间段的结束时间
     * @return createdBefore
     */
    public OffsetDateTime getCreatedBefore() {
        return createdBefore;
    }

    public void setCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectWebhookLogsRequest that = (ListProjectWebhookLogsRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.hookId, that.hookId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.createdAfter, that.createdAfter)
            && Objects.equals(this.createdBefore, that.createdBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, hookId, offset, limit, repositoryId, uuid, createdAfter, createdBefore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectWebhookLogsRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
        sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
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
