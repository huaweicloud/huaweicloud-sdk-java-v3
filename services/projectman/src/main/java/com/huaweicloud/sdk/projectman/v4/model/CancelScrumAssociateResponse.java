package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CancelScrumAssociateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private CancelAssociateIssueResponseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CancelScrumAssociateResponse withResult(CancelAssociateIssueResponseResult result) {
        this.result = result;
        return this;
    }

    public CancelScrumAssociateResponse withResult(Consumer<CancelAssociateIssueResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new CancelAssociateIssueResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public CancelAssociateIssueResponseResult getResult() {
        return result;
    }

    public void setResult(CancelAssociateIssueResponseResult result) {
        this.result = result;
    }

    public CancelScrumAssociateResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 接口整体响应状态。 **取值范围**： - success：取消关联工作项成功。 - error：取消关联工作项失败,详见错误码说明。
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
        CancelScrumAssociateResponse that = (CancelScrumAssociateResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelScrumAssociateResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
