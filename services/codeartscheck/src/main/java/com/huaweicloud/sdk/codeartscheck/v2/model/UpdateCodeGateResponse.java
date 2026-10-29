package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateCodeGateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpStatus")

    private String httpStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public UpdateCodeGateResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释：** 更新成功时返回\"更新门禁配置成功\"。 **取值范围：** 不涉及。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UpdateCodeGateResponse withHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    /**
     * **参数解释：** HTTP响应状态。 **取值范围：** - OK：请求已成功处理，服务器返回了请求的资源或操作结果。 - ACCEPTED：请求已被服务器接受，但处理尚未完成（通常用于异步操作）。 - INTERNAL_SERVER_ERROR：接口内部异常。 - BAD_REQUEST：参数校验异常。
     * @return httpStatus
     */
    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public UpdateCodeGateResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 接口响应状态。 **取值范围：** - success：接口响应成功。 - error：接口响应失败。
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
        UpdateCodeGateResponse that = (UpdateCodeGateResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.httpStatus, that.httpStatus)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, httpStatus, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCodeGateResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
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
