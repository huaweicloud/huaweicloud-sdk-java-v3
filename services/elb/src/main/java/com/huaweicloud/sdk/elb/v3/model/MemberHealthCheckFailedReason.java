package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MemberHealthCheckFailedReason
 */
public class MemberHealthCheckFailedReason {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_code")

    private String reasonCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_response")

    private String expectedResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthcheck_response")

    private String healthcheckResponse;

    public MemberHealthCheckFailedReason withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * **参数解释**：健康检查异常原因码。  **取值范围**： - CONNECT_TIMEOUT: 负载均衡健康检查时向后端服务器建立连接超时。 - CONNECT_REFUSED: 负载均衡健康检查时向后端服务器拒绝连接。 - CONNECT_FAILED: 负载均衡健康检查时向后端服务器建立连接失败。 - CONNECT_INTERRUPT: 负载均衡健康检查与后端服务器连接中断。 - SSL_HANDSHAKE_ERROR: 负载均衡健康检查时与后端服务器SSL握手失败。 - RECV_RESPONSE_FAILED: 负载均衡健康检查时从后端服务器接收响应失败。 - RECV_RESPONSE_TIMEOUT: 负载均衡健康检查时从后端服务器接收响应超时。 - SEND_REQUEST_FAILED: 负载均衡健康检查时向后端服务器发送请求失败。 - SEND_REQUEST_TIMEOUT: 负载均衡健康检查时向后端服务器发送请求超时。 - RESPONSE_FORMAT_ERROR: 负载均衡健康检查时从后端服务器接收响应格式错误。 - RESPONSE_MISMATCH: 负载均衡健康检查时从后端服务器接收的响应码与预期配置返回码不一致。
     * @return reasonCode
     */
    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public MemberHealthCheckFailedReason withExpectedResponse(String expectedResponse) {
        this.expectedResponse = expectedResponse;
        return this;
    }

    /**
     * **参数解释**：健康检查预期响应状态码。支持HTTP,HTTPS,GRPC健康检查。只有reason_code为RESPONSE_MISMATCH时，支持非null取值。  **取值范围**： - 单值：单个返回码。当type为GRPC[或GRPCS](tag:not_open)时，取值范围为0-99；当type为其他协议时，取值范围为200-599。例如：\"0\"或\"200\"。 - 列表：多个特定返回码，逗号分隔，最多支持5个返回码。例如:\"200,202\"或\"0,1\"。 - 区间：一个返回码区间，区间内\"-\"分隔，区间之间逗号分隔，最多支持5个区间。例如\"200-204,300-399\"或\"0-5,10-12,20-30\"。
     * @return expectedResponse
     */
    public String getExpectedResponse() {
        return expectedResponse;
    }

    public void setExpectedResponse(String expectedResponse) {
        this.expectedResponse = expectedResponse;
    }

    public MemberHealthCheckFailedReason withHealthcheckResponse(String healthcheckResponse) {
        this.healthcheckResponse = healthcheckResponse;
        return this;
    }

    /**
     * **参数解释**：健康检查探测实际响应状态码。支持HTTP,HTTPS,GRPC健康检查。只有reason_code为RESPONSE_MISMATCH时，支持非null取值。  **取值范围**： - 单个返回码。当type为GRPC[或GRPCS](tag:not_open)时，取值范围为0-99；当type为其他协议时，取值范围为200-599。例如：\"0\"或\"200\"。
     * @return healthcheckResponse
     */
    public String getHealthcheckResponse() {
        return healthcheckResponse;
    }

    public void setHealthcheckResponse(String healthcheckResponse) {
        this.healthcheckResponse = healthcheckResponse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberHealthCheckFailedReason that = (MemberHealthCheckFailedReason) obj;
        return Objects.equals(this.reasonCode, that.reasonCode)
            && Objects.equals(this.expectedResponse, that.expectedResponse)
            && Objects.equals(this.healthcheckResponse, that.healthcheckResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reasonCode, expectedResponse, healthcheckResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberHealthCheckFailedReason {\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    expectedResponse: ").append(toIndentedString(expectedResponse)).append("\n");
        sb.append("    healthcheckResponse: ").append(toIndentedString(healthcheckResponse)).append("\n");
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
