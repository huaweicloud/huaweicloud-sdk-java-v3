package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** Webhook执行日志数据。
 */
public class WebhookLogDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_hook_id")

    private Integer webHookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private String trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_status")

    private String responseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_duration")

    private Double executionDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public WebhookLogDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** Webhook 日志id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WebhookLogDto withWebHookId(Integer webHookId) {
        this.webHookId = webHookId;
        return this;
    }

    /**
     * **参数解释：** Webhook id。
     * minimum: 1
     * maximum: 2147483647
     * @return webHookId
     */
    public Integer getWebHookId() {
        return webHookId;
    }

    public void setWebHookId(Integer webHookId) {
        this.webHookId = webHookId;
    }

    public WebhookLogDto withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * **参数解释：** 触发类型。
     * @return trigger
     */
    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public WebhookLogDto withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** 请求地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebhookLogDto withResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }

    /**
     * **参数解释：** 响应状态，默认是响应码，如果webhook地址未返回或者其他异常情况，则记录为internal error
     * @return responseStatus
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public WebhookLogDto withExecutionDuration(Double executionDuration) {
        this.executionDuration = executionDuration;
        return this;
    }

    /**
     * **参数解释：** 响应耗时，单位是秒
     * minimum: 0
     * maximum: 300
     * @return executionDuration
     */
    public Double getExecutionDuration() {
        return executionDuration;
    }

    public void setExecutionDuration(Double executionDuration) {
        this.executionDuration = executionDuration;
    }

    public WebhookLogDto withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * **参数解释：** Webhook每次发送消息的时候，会在请求体中带上uuid字段，此处为该记录的uuid字段
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public WebhookLogDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookLogDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebhookLogDto that = (WebhookLogDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.webHookId, that.webHookId)
            && Objects.equals(this.trigger, that.trigger) && Objects.equals(this.url, that.url)
            && Objects.equals(this.responseStatus, that.responseStatus)
            && Objects.equals(this.executionDuration, that.executionDuration) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, webHookId, trigger, url, responseStatus, executionDuration, uuid, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookLogDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    webHookId: ").append(toIndentedString(webHookId)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
        sb.append("    executionDuration: ").append(toIndentedString(executionDuration)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
