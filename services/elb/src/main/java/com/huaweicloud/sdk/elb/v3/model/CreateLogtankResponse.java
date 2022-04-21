package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateLogtankResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank")

    private Logtank logtank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateLogtankResponse withLogtank(Logtank logtank) {
        this.logtank = logtank;
        return this;
    }

    public CreateLogtankResponse withLogtank(Consumer<Logtank> logtankSetter) {
        if (this.logtank == null) {
            this.logtank = new Logtank();
            logtankSetter.accept(this.logtank);
        }

        return this;
    }

    /**
     * Get logtank
     * @return logtank
     */
    public Logtank getLogtank() {
        return logtank;
    }

    public void setLogtank(Logtank logtank) {
        this.logtank = logtank;
    }

    public CreateLogtankResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLogtankResponse createLogtankResponse = (CreateLogtankResponse) o;
        return Objects.equals(this.logtank, createLogtankResponse.logtank)
            && Objects.equals(this.requestId, createLogtankResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logtank, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogtankResponse {\n");
        sb.append("    logtank: ").append(toIndentedString(logtank)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
