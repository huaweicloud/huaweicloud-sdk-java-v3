package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteSecretForScheduleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteSecretForScheduleRequestBody body;

    public DeleteSecretForScheduleRequest withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 凭据名称。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public DeleteSecretForScheduleRequest withBody(DeleteSecretForScheduleRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteSecretForScheduleRequest withBody(Consumer<DeleteSecretForScheduleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteSecretForScheduleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteSecretForScheduleRequestBody getBody() {
        return body;
    }

    public void setBody(DeleteSecretForScheduleRequestBody body) {
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
        DeleteSecretForScheduleRequest deleteSecretForScheduleRequest = (DeleteSecretForScheduleRequest) o;
        return Objects.equals(this.secretName, deleteSecretForScheduleRequest.secretName)
            && Objects.equals(this.body, deleteSecretForScheduleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecretForScheduleRequest {\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
