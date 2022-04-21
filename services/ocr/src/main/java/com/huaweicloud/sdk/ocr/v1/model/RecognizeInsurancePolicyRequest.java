package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RecognizeInsurancePolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private InsurancePolicyRequestBody body;

    public RecognizeInsurancePolicyRequest withBody(InsurancePolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public RecognizeInsurancePolicyRequest withBody(Consumer<InsurancePolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new InsurancePolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public InsurancePolicyRequestBody getBody() {
        return body;
    }

    public void setBody(InsurancePolicyRequestBody body) {
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
        RecognizeInsurancePolicyRequest recognizeInsurancePolicyRequest = (RecognizeInsurancePolicyRequest) o;
        return Objects.equals(this.body, recognizeInsurancePolicyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeInsurancePolicyRequest {\n");
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
