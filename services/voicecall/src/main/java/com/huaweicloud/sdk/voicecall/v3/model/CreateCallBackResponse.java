package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateCallBackResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultcode")

    private String resultcode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultdesc")

    private String resultdesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessionId")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idlePort")

    private Integer idlePort;

    public CreateCallBackResponse withResultcode(String resultcode) {
        this.resultcode = resultcode;
        return this;
    }

    /**
     * 请求返回的结果码
     * @return resultcode
     */
    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public CreateCallBackResponse withResultdesc(String resultdesc) {
        this.resultdesc = resultdesc;
        return this;
    }

    /**
     * 请求返回的结果描述
     * @return resultdesc
     */
    public String getResultdesc() {
        return resultdesc;
    }

    public void setResultdesc(String resultdesc) {
        this.resultdesc = resultdesc;
    }

    public CreateCallBackResponse withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 请求返回的会话sessionId，用于标记一路会话。如果请求失败，则sessionId为空表示会话建立失败
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public CreateCallBackResponse withIdlePort(Integer idlePort) {
        this.idlePort = idlePort;
        return this;
    }

    /**
     * 请求参数中returnIdlePort为true时响应消息携带该参数
     * @return idlePort
     */
    public Integer getIdlePort() {
        return idlePort;
    }

    public void setIdlePort(Integer idlePort) {
        this.idlePort = idlePort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCallBackResponse that = (CreateCallBackResponse) obj;
        return Objects.equals(this.resultcode, that.resultcode) && Objects.equals(this.resultdesc, that.resultdesc)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.idlePort, that.idlePort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultcode, resultdesc, sessionId, idlePort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCallBackResponse {\n");
        sb.append("    resultcode: ").append(toIndentedString(resultcode)).append("\n");
        sb.append("    resultdesc: ").append(toIndentedString(resultdesc)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    idlePort: ").append(toIndentedString(idlePort)).append("\n");
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
