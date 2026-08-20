package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联/取消关联响应对象
 */
public class AssociateIpdIssuesResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Map<String, List<AssociateRespDetail>> result = null;

    public AssociateIpdIssuesResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 响应状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AssociateIpdIssuesResp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 关联失败的原因。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AssociateIpdIssuesResp withResult(Map<String, List<AssociateRespDetail>> result) {
        this.result = result;
        return this;
    }

    public AssociateIpdIssuesResp putResultItem(String key, List<AssociateRespDetail> resultItem) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        this.result.put(key, resultItem);
        return this;
    }

    public AssociateIpdIssuesResp withResult(Consumer<Map<String, List<AssociateRespDetail>>> resultSetter) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 关联工作项的响应结果。
     * @return result
     */
    public Map<String, List<AssociateRespDetail>> getResult() {
        return result;
    }

    public void setResult(Map<String, List<AssociateRespDetail>> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateIpdIssuesResp that = (AssociateIpdIssuesResp) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateIpdIssuesResp {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
