package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateEvaluateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")

    private String xServiceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")

    private String xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EvaluateRequestReq body;

    public CreateEvaluateRequest withXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
        return this;
    }

    /**
     * 调用智能客服服务标志。
     * @return xServiceKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")
    public String getXServiceKey() {
        return xServiceKey;
    }

    public void setXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
    }

    public CreateEvaluateRequest withXSite(String xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 站点标记，0-中国站  1-国际站
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")
    public String getXSite() {
        return xSite;
    }

    public void setXSite(String xSite) {
        this.xSite = xSite;
    }

    public CreateEvaluateRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 区域语言简写，en-us  zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public CreateEvaluateRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话Id
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public CreateEvaluateRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求Id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateEvaluateRequest withBody(EvaluateRequestReq body) {
        this.body = body;
        return this;
    }

    public CreateEvaluateRequest withBody(Consumer<EvaluateRequestReq> bodySetter) {
        if (this.body == null) {
            this.body = new EvaluateRequestReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EvaluateRequestReq getBody() {
        return body;
    }

    public void setBody(EvaluateRequestReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEvaluateRequest createEvaluateRequest = (CreateEvaluateRequest) o;
        return Objects.equals(this.xServiceKey, createEvaluateRequest.xServiceKey)
            && Objects.equals(this.xSite, createEvaluateRequest.xSite)
            && Objects.equals(this.xLanguage, createEvaluateRequest.xLanguage)
            && Objects.equals(this.sessionId, createEvaluateRequest.sessionId)
            && Objects.equals(this.requestId, createEvaluateRequest.requestId)
            && Objects.equals(this.body, createEvaluateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xServiceKey, xSite, xLanguage, sessionId, requestId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEvaluateRequest {\n");
        sb.append("    xServiceKey: ").append(toIndentedString(xServiceKey)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
