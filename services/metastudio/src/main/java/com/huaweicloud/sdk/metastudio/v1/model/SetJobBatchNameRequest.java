package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SetJobBatchNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")

    private String xAppUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SetJobBatchNameReq body;

    public SetJobBatchNameRequest withXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
        return this;
    }

    /**
     * 第三方用户ID。不允许输入中文。
     * @return xAppUserId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")
    public String getXAppUserId() {
        return xAppUserId;
    }

    public void setXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
    }

    public SetJobBatchNameRequest withBody(SetJobBatchNameReq body) {
        this.body = body;
        return this;
    }

    public SetJobBatchNameRequest withBody(Consumer<SetJobBatchNameReq> bodySetter) {
        if (this.body == null) {
            this.body = new SetJobBatchNameReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetJobBatchNameReq getBody() {
        return body;
    }

    public void setBody(SetJobBatchNameReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetJobBatchNameRequest that = (SetJobBatchNameRequest) obj;
        return Objects.equals(this.xAppUserId, that.xAppUserId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAppUserId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetJobBatchNameRequest {\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
