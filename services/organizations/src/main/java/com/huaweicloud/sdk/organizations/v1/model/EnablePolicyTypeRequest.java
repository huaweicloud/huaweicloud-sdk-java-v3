package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class EnablePolicyTypeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PolicyTypeReqBody body;

    public EnablePolicyTypeRequest withBody(PolicyTypeReqBody body) {
        this.body = body;
        return this;
    }

    public EnablePolicyTypeRequest withBody(Consumer<PolicyTypeReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new PolicyTypeReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PolicyTypeReqBody getBody() {
        return body;
    }

    public void setBody(PolicyTypeReqBody body) {
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
        EnablePolicyTypeRequest enablePolicyTypeRequest = (EnablePolicyTypeRequest) o;
        return Objects.equals(this.body, enablePolicyTypeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnablePolicyTypeRequest {\n");
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
