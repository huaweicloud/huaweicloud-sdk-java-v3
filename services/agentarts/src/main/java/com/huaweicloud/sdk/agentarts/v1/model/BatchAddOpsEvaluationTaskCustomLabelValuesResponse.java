package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class BatchAddOpsEvaluationTaskCustomLabelValuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public BatchAddOpsEvaluationTaskCustomLabelValuesResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * **参数解释：** 返回的结果的msg。 **约束限制：** 不涉及。 
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BatchAddOpsEvaluationTaskCustomLabelValuesResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** 返回的结果的code。 **约束限制：** 不涉及。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddOpsEvaluationTaskCustomLabelValuesResponse that =
            (BatchAddOpsEvaluationTaskCustomLabelValuesResponse) obj;
        return Objects.equals(this.msg, that.msg) && Objects.equals(this.code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddOpsEvaluationTaskCustomLabelValuesResponse {\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
