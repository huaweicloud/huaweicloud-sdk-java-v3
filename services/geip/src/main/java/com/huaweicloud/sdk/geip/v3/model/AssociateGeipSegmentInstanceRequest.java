package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateGeipSegmentInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_segment_id")

    private String globalEipSegmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssociateInstanceGlobalEipSegmentRequestBody body;

    public AssociateGeipSegmentInstanceRequest withGlobalEipSegmentId(String globalEipSegmentId) {
        this.globalEipSegmentId = globalEipSegmentId;
        return this;
    }

    /**
     * global_eip_segment_id
     * @return globalEipSegmentId
     */
    public String getGlobalEipSegmentId() {
        return globalEipSegmentId;
    }

    public void setGlobalEipSegmentId(String globalEipSegmentId) {
        this.globalEipSegmentId = globalEipSegmentId;
    }

    public AssociateGeipSegmentInstanceRequest withBody(AssociateInstanceGlobalEipSegmentRequestBody body) {
        this.body = body;
        return this;
    }

    public AssociateGeipSegmentInstanceRequest withBody(
        Consumer<AssociateInstanceGlobalEipSegmentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AssociateInstanceGlobalEipSegmentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssociateInstanceGlobalEipSegmentRequestBody getBody() {
        return body;
    }

    public void setBody(AssociateInstanceGlobalEipSegmentRequestBody body) {
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
        AssociateGeipSegmentInstanceRequest that = (AssociateGeipSegmentInstanceRequest) obj;
        return Objects.equals(this.globalEipSegmentId, that.globalEipSegmentId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipSegmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateGeipSegmentInstanceRequest {\n");
        sb.append("    globalEipSegmentId: ").append(toIndentedString(globalEipSegmentId)).append("\n");
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
