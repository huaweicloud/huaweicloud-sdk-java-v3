package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCategoryStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private StatusResponseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ShowCategoryStatusResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 查询结果总数。  **取值范围**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowCategoryStatusResponse withResult(StatusResponseResult result) {
        this.result = result;
        return this;
    }

    public ShowCategoryStatusResponse withResult(Consumer<StatusResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new StatusResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public StatusResponseResult getResult() {
        return result;
    }

    public void setResult(StatusResponseResult result) {
        this.result = result;
    }

    public ShowCategoryStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态码。  **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCategoryStatusResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**： 响应信息。  **取值范围**： 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCategoryStatusResponse that = (ShowCategoryStatusResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.result, that.result)
            && Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, result, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCategoryStatusResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
