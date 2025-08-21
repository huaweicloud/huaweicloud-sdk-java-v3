package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowRepositoryWebhookLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private Integer hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private Integer logId;

    public ShowRepositoryWebhookLogRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
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

    public ShowRepositoryWebhookLogRequest withHookId(Integer hookId) {
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

    public ShowRepositoryWebhookLogRequest withLogId(Integer logId) {
        this.logId = logId;
        return this;
    }

    /**
     * **参数解释：**  Webhook 日志id。
     * minimum: 1
     * maximum: 2147483647
     * @return logId
     */
    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryWebhookLogRequest that = (ShowRepositoryWebhookLogRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.hookId, that.hookId)
            && Objects.equals(this.logId, that.logId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, hookId, logId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryWebhookLogRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
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
