package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRepositoryWebhookRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private Integer hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private WebhookParamsDto body;

    public UpdateRepositoryWebhookRequest withRepositoryId(Integer repositoryId) {
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

    public UpdateRepositoryWebhookRequest withHookId(Integer hookId) {
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

    public UpdateRepositoryWebhookRequest withBody(WebhookParamsDto body) {
        this.body = body;
        return this;
    }

    public UpdateRepositoryWebhookRequest withBody(Consumer<WebhookParamsDto> bodySetter) {
        if (this.body == null) {
            this.body = new WebhookParamsDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public WebhookParamsDto getBody() {
        return body;
    }

    public void setBody(WebhookParamsDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRepositoryWebhookRequest that = (UpdateRepositoryWebhookRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.hookId, that.hookId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, hookId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepositoryWebhookRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
