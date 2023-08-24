package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateConnectionInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_code")

    private Integer resCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_log")

    private String resLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_msg")

    private String resMsg;

    public CreateConnectionInfoResponse withResCode(Integer resCode) {
        this.resCode = resCode;
        return this;
    }

    /**
     * 状态码
     * @return resCode
     */
    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    public CreateConnectionInfoResponse withResLog(String resLog) {
        this.resLog = resLog;
        return this;
    }

    /**
     * 成功信息
     * @return resLog
     */
    public String getResLog() {
        return resLog;
    }

    public void setResLog(String resLog) {
        this.resLog = resLog;
    }

    public CreateConnectionInfoResponse withResMsg(String resMsg) {
        this.resMsg = resMsg;
        return this;
    }

    /**
     * 成功信息
     * @return resMsg
     */
    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateConnectionInfoResponse that = (CreateConnectionInfoResponse) obj;
        return Objects.equals(this.resCode, that.resCode) && Objects.equals(this.resLog, that.resLog)
            && Objects.equals(this.resMsg, that.resMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resCode, resLog, resMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConnectionInfoResponse {\n");
        sb.append("    resCode: ").append(toIndentedString(resCode)).append("\n");
        sb.append("    resLog: ").append(toIndentedString(resLog)).append("\n");
        sb.append("    resMsg: ").append(toIndentedString(resMsg)).append("\n");
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
