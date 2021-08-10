package com.huaweicloud.sdk.codecraft.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class RegisterCompetitionInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RegisterInfoRequestModel body;

    public RegisterCompetitionInfoRequest withBody(RegisterInfoRequestModel body) {
        this.body = body;
        return this;
    }

    public RegisterCompetitionInfoRequest withBody(Consumer<RegisterInfoRequestModel> bodySetter) {
        if (this.body == null) {
            this.body = new RegisterInfoRequestModel();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public RegisterInfoRequestModel getBody() {
        return body;
    }

    public void setBody(RegisterInfoRequestModel body) {
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
        RegisterCompetitionInfoRequest registerCompetitionInfoRequest = (RegisterCompetitionInfoRequest) o;
        return Objects.equals(this.body, registerCompetitionInfoRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterCompetitionInfoRequest {\n");
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
