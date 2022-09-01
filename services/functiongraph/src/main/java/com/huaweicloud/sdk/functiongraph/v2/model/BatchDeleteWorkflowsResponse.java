package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchDeleteWorkflowsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    @JacksonXmlProperty(localName = "success")

    private List<String> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    @JacksonXmlProperty(localName = "fail")

    private List<OperateErrorInfo> fail = null;

    public BatchDeleteWorkflowsResponse withSuccess(List<String> success) {
        this.success = success;
        return this;
    }

    public BatchDeleteWorkflowsResponse addSuccessItem(String successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public BatchDeleteWorkflowsResponse withSuccess(Consumer<List<String>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 成功流程URN列表
     * @return success
     */
    public List<String> getSuccess() {
        return success;
    }

    public void setSuccess(List<String> success) {
        this.success = success;
    }

    public BatchDeleteWorkflowsResponse withFail(List<OperateErrorInfo> fail) {
        this.fail = fail;
        return this;
    }

    public BatchDeleteWorkflowsResponse addFailItem(OperateErrorInfo failItem) {
        if (this.fail == null) {
            this.fail = new ArrayList<>();
        }
        this.fail.add(failItem);
        return this;
    }

    public BatchDeleteWorkflowsResponse withFail(Consumer<List<OperateErrorInfo>> failSetter) {
        if (this.fail == null) {
            this.fail = new ArrayList<>();
        }
        failSetter.accept(this.fail);
        return this;
    }

    /**
     * 错误流程详情
     * @return fail
     */
    public List<OperateErrorInfo> getFail() {
        return fail;
    }

    public void setFail(List<OperateErrorInfo> fail) {
        this.fail = fail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteWorkflowsResponse batchDeleteWorkflowsResponse = (BatchDeleteWorkflowsResponse) o;
        return Objects.equals(this.success, batchDeleteWorkflowsResponse.success)
            && Objects.equals(this.fail, batchDeleteWorkflowsResponse.fail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, fail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteWorkflowsResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
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
