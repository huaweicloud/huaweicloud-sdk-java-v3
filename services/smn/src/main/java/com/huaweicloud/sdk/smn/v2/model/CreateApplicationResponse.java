package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateApplicationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_urn")

    @JacksonXmlProperty(localName = "application_urn")

    private String applicationUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    @JacksonXmlProperty(localName = "application_id")

    private String applicationId;

    public CreateApplicationResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateApplicationResponse withApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
        return this;
    }

    /**
     * Application的唯一资源标识。
     * @return applicationUrn
     */
    public String getApplicationUrn() {
        return applicationUrn;
    }

    public void setApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
    }

    public CreateApplicationResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Application资源的ID。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateApplicationResponse createApplicationResponse = (CreateApplicationResponse) o;
        return Objects.equals(this.requestId, createApplicationResponse.requestId)
            && Objects.equals(this.applicationUrn, createApplicationResponse.applicationUrn)
            && Objects.equals(this.applicationId, createApplicationResponse.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, applicationUrn, applicationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApplicationResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    applicationUrn: ").append(toIndentedString(applicationUrn)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
