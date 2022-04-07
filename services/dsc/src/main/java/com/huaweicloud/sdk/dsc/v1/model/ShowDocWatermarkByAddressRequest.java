package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ShowDocWatermarkByAddressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ShowDocWatermarkByAddressRequestBody body;

    public ShowDocWatermarkByAddressRequest withBody(ShowDocWatermarkByAddressRequestBody body) {
        this.body = body;
        return this;
    }

    public ShowDocWatermarkByAddressRequest withBody(Consumer<ShowDocWatermarkByAddressRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ShowDocWatermarkByAddressRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ShowDocWatermarkByAddressRequestBody getBody() {
        return body;
    }

    public void setBody(ShowDocWatermarkByAddressRequestBody body) {
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
        ShowDocWatermarkByAddressRequest showDocWatermarkByAddressRequest = (ShowDocWatermarkByAddressRequest) o;
        return Objects.equals(this.body, showDocWatermarkByAddressRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDocWatermarkByAddressRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
