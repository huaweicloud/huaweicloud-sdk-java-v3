package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePeriodElasticResourcePoolSpecChangeOrderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody body;

    public CreatePeriodElasticResourcePoolSpecChangeOrderRequest withBody(
        CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody body) {
        this.body = body;
        return this;
    }

    public CreatePeriodElasticResourcePoolSpecChangeOrderRequest withBody(
        Consumer<CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody getBody() {
        return body;
    }

    public void setBody(CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody body) {
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
        CreatePeriodElasticResourcePoolSpecChangeOrderRequest that =
            (CreatePeriodElasticResourcePoolSpecChangeOrderRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePeriodElasticResourcePoolSpecChangeOrderRequest {\n");
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
