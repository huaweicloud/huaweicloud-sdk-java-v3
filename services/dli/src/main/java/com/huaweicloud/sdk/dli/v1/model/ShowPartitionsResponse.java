package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPartitionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private Partitions partitions;

    public ShowPartitionsResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求结果，true为成功，false为失败
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowPartitionsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowPartitionsResponse withPartitions(Partitions partitions) {
        this.partitions = partitions;
        return this;
    }

    public ShowPartitionsResponse withPartitions(Consumer<Partitions> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new Partitions();
            partitionsSetter.accept(this.partitions);
        }

        return this;
    }

    /**
     * Get partitions
     * @return partitions
     */
    public Partitions getPartitions() {
        return partitions;
    }

    public void setPartitions(Partitions partitions) {
        this.partitions = partitions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPartitionsResponse showPartitionsResponse = (ShowPartitionsResponse) o;
        return Objects.equals(this.isSuccess, showPartitionsResponse.isSuccess)
            && Objects.equals(this.message, showPartitionsResponse.message)
            && Objects.equals(this.partitions, showPartitionsResponse.partitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, partitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartitionsResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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
