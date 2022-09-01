package com.huaweicloud.sdk.roma.v2.model;

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
public class BatchPublishOrOfflineApiV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    @JacksonXmlProperty(localName = "success")

    private List<PublishResp> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    @JacksonXmlProperty(localName = "failure")

    private List<BatchFailure> failure = null;

    public BatchPublishOrOfflineApiV2Response withSuccess(List<PublishResp> success) {
        this.success = success;
        return this;
    }

    public BatchPublishOrOfflineApiV2Response addSuccessItem(PublishResp successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public BatchPublishOrOfflineApiV2Response withSuccess(Consumer<List<PublishResp>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 发布或下线成功的信息
     * @return success
     */
    public List<PublishResp> getSuccess() {
        return success;
    }

    public void setSuccess(List<PublishResp> success) {
        this.success = success;
    }

    public BatchPublishOrOfflineApiV2Response withFailure(List<BatchFailure> failure) {
        this.failure = failure;
        return this;
    }

    public BatchPublishOrOfflineApiV2Response addFailureItem(BatchFailure failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public BatchPublishOrOfflineApiV2Response withFailure(Consumer<List<BatchFailure>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 发布或下线失败的API及错误信息
     * @return failure
     */
    public List<BatchFailure> getFailure() {
        return failure;
    }

    public void setFailure(List<BatchFailure> failure) {
        this.failure = failure;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchPublishOrOfflineApiV2Response batchPublishOrOfflineApiV2Response = (BatchPublishOrOfflineApiV2Response) o;
        return Objects.equals(this.success, batchPublishOrOfflineApiV2Response.success)
            && Objects.equals(this.failure, batchPublishOrOfflineApiV2Response.failure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchPublishOrOfflineApiV2Response {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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
