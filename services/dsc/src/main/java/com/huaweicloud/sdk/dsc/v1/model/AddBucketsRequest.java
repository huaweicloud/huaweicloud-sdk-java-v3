package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddBucketsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BucketsRequest body;

    public AddBucketsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资产类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AddBucketsRequest withBody(BucketsRequest body) {
        this.body = body;
        return this;
    }

    public AddBucketsRequest withBody(Consumer<BucketsRequest> bodySetter) {
        if (this.body == null) {
            this.body = new BucketsRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BucketsRequest getBody() {
        return body;
    }

    public void setBody(BucketsRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddBucketsRequest addBucketsRequest = (AddBucketsRequest) o;
        return Objects.equals(this.type, addBucketsRequest.type) && Objects.equals(this.body, addBucketsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddBucketsRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
