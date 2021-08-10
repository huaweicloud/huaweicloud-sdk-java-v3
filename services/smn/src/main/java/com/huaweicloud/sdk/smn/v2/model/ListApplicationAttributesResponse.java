package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListApplicationAttributesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private ListApplicationAttributesResponseBodyAttributes attributes;

    public ListApplicationAttributesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求的唯一标识ID。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListApplicationAttributesResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /** Application的唯一标识ID。
     * 
     * @return applicationId */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ListApplicationAttributesResponse withAttributes(
        ListApplicationAttributesResponseBodyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public ListApplicationAttributesResponse withAttributes(
        Consumer<ListApplicationAttributesResponseBodyAttributes> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ListApplicationAttributesResponseBodyAttributes();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    /** Get attributes
     * 
     * @return attributes */
    public ListApplicationAttributesResponseBodyAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ListApplicationAttributesResponseBodyAttributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApplicationAttributesResponse listApplicationAttributesResponse = (ListApplicationAttributesResponse) o;
        return Objects.equals(this.requestId, listApplicationAttributesResponse.requestId)
            && Objects.equals(this.applicationId, listApplicationAttributesResponse.applicationId)
            && Objects.equals(this.attributes, listApplicationAttributesResponse.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, applicationId, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationAttributesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
