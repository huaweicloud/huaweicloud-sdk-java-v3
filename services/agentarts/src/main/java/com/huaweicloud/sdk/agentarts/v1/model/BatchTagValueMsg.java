package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 批量添加评估任务的自定义标签值返回体。 **约束限制：** 不涉及。 
 */
public class BatchTagValueMsg {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public BatchTagValueMsg withMsg(String msg) {
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

    public BatchTagValueMsg withCode(String code) {
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
        BatchTagValueMsg that = (BatchTagValueMsg) obj;
        return Objects.equals(this.msg, that.msg) && Objects.equals(this.code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTagValueMsg {\n");
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
