package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateIteratorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_uri")

    private String branchUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IteratorVersionInfo body;

    public CreateIteratorRequest withBranchUri(String branchUri) {
        this.branchUri = branchUri;
        return this;
    }

    /**
     * 分支URI
     * @return branchUri
     */
    public String getBranchUri() {
        return branchUri;
    }

    public void setBranchUri(String branchUri) {
        this.branchUri = branchUri;
    }

    public CreateIteratorRequest withBody(IteratorVersionInfo body) {
        this.body = body;
        return this;
    }

    public CreateIteratorRequest withBody(Consumer<IteratorVersionInfo> bodySetter) {
        if (this.body == null) {
            this.body = new IteratorVersionInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IteratorVersionInfo getBody() {
        return body;
    }

    public void setBody(IteratorVersionInfo body) {
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
        CreateIteratorRequest that = (CreateIteratorRequest) obj;
        return Objects.equals(this.branchUri, that.branchUri) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchUri, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIteratorRequest {\n");
        sb.append("    branchUri: ").append(toIndentedString(branchUri)).append("\n");
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
