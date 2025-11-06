package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRepositoryWebhookLogResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_headers")

    private Object requestHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_data")

    private Object requestData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_headers")

    private Object responseHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_body")

    private Object responseBody;

    public ShowRepositoryWebhookLogResponse withId(Integer id) {
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

    public ShowRepositoryWebhookLogResponse withWebHookId(Integer webHookId) {
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

    public ShowRepositoryWebhookLogResponse withTrigger(String trigger) {
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

    public ShowRepositoryWebhookLogResponse withUrl(String url) {
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

    public ShowRepositoryWebhookLogResponse withResponseStatus(String responseStatus) {
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

    public ShowRepositoryWebhookLogResponse withExecutionDuration(Double executionDuration) {
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

    public ShowRepositoryWebhookLogResponse withUuid(String uuid) {
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

    public ShowRepositoryWebhookLogResponse withCreatedAt(String createdAt) {
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

    public ShowRepositoryWebhookLogResponse withUpdatedAt(String updatedAt) {
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

    public ShowRepositoryWebhookLogResponse withRequestHeaders(Object requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }

    /**
     * **参数解释：** 请求头，此处会将敏感信息如传递的token隐藏
     * @return requestHeaders
     */
    public Object getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(Object requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    public ShowRepositoryWebhookLogResponse withRequestData(Object requestData) {
        this.requestData = requestData;
        return this;
    }

    /**
     * **参数解释：** 请求体，此处会将用户邮箱隐藏
     * @return requestData
     */
    public Object getRequestData() {
        return requestData;
    }

    public void setRequestData(Object requestData) {
        this.requestData = requestData;
    }

    public ShowRepositoryWebhookLogResponse withResponseHeaders(Object responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }

    /**
     * **参数解释：** 响应头
     * @return responseHeaders
     */
    public Object getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(Object responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public ShowRepositoryWebhookLogResponse withResponseBody(Object responseBody) {
        this.responseBody = responseBody;
        return this;
    }

    /**
     * **参数解释：** 响应体
     * @return responseBody
     */
    public Object getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(Object responseBody) {
        this.responseBody = responseBody;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryWebhookLogResponse that = (ShowRepositoryWebhookLogResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.webHookId, that.webHookId)
            && Objects.equals(this.trigger, that.trigger) && Objects.equals(this.url, that.url)
            && Objects.equals(this.responseStatus, that.responseStatus)
            && Objects.equals(this.executionDuration, that.executionDuration) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.requestHeaders, that.requestHeaders)
            && Objects.equals(this.requestData, that.requestData)
            && Objects.equals(this.responseHeaders, that.responseHeaders)
            && Objects.equals(this.responseBody, that.responseBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            webHookId,
            trigger,
            url,
            responseStatus,
            executionDuration,
            uuid,
            createdAt,
            updatedAt,
            requestHeaders,
            requestData,
            responseHeaders,
            responseBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryWebhookLogResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    webHookId: ").append(toIndentedString(webHookId)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
        sb.append("    executionDuration: ").append(toIndentedString(executionDuration)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
        sb.append("    requestData: ").append(toIndentedString(requestData)).append("\n");
        sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
        sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
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
