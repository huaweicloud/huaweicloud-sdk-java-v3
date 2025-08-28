package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateLogtankResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank")

    private Logtank logtank;

    public UpdateLogtankResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateLogtankResponse withLogtank(Logtank logtank) {
        this.logtank = logtank;
        return this;
    }

    public UpdateLogtankResponse withLogtank(Consumer<Logtank> logtankSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLogtankResponse that = (UpdateLogtankResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.logtank, that.logtank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, logtank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogtankResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    logtank: ").append(toIndentedString(logtank)).append("\n");
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
