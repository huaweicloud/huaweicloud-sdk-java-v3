package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRepoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoid")

    private String repoid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRepoRequestBody body;

    public UpdateRepoRequest withRepoid(String repoid) {
        this.repoid = repoid;
        return this;
    }

    /**
     * 仓库id
     * @return repoid
     */
    public String getRepoid() {
        return repoid;
    }

    public void setRepoid(String repoid) {
        this.repoid = repoid;
    }

    public UpdateRepoRequest withBody(UpdateRepoRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateRepoRequest withBody(Consumer<UpdateRepoRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRepoRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRepoRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRepoRequestBody body) {
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
        UpdateRepoRequest that = (UpdateRepoRequest) obj;
        return Objects.equals(this.repoid, that.repoid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepoRequest {\n");
        sb.append("    repoid: ").append(toIndentedString(repoid)).append("\n");
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
