package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateObsBucketAuthorityPublicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ObsAuthorityConfigV2 body;

    public UpdateObsBucketAuthorityPublicRequest withBody(ObsAuthorityConfigV2 body) {
        this.body = body;
        return this;
    }

    public UpdateObsBucketAuthorityPublicRequest withBody(Consumer<ObsAuthorityConfigV2> bodySetter) {
        if (this.body == null) {
            this.body = new ObsAuthorityConfigV2();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ObsAuthorityConfigV2 getBody() {
        return body;
    }

    public void setBody(ObsAuthorityConfigV2 body) {
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
        UpdateObsBucketAuthorityPublicRequest updateObsBucketAuthorityPublicRequest =
            (UpdateObsBucketAuthorityPublicRequest) o;
        return Objects.equals(this.body, updateObsBucketAuthorityPublicRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateObsBucketAuthorityPublicRequest {\n");
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
