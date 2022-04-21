package com.huaweicloud.sdk.codecraft.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateCompetitionScoreRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateScoresRequestModel body;

    public CreateCompetitionScoreRequest withBody(CreateScoresRequestModel body) {
        this.body = body;
        return this;
    }

    public CreateCompetitionScoreRequest withBody(Consumer<CreateScoresRequestModel> bodySetter) {
        if (this.body == null) {
            this.body = new CreateScoresRequestModel();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateScoresRequestModel getBody() {
        return body;
    }

    public void setBody(CreateScoresRequestModel body) {
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
        CreateCompetitionScoreRequest createCompetitionScoreRequest = (CreateCompetitionScoreRequest) o;
        return Objects.equals(this.body, createCompetitionScoreRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompetitionScoreRequest {\n");
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
