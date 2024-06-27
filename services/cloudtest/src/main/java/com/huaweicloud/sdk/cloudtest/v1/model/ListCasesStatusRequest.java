package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCasesStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testServiceId")

    private String testServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    public ListCasesStatusRequest withTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
        return this;
    }

    /**
     * projectUUId
     * @return testServiceId
     */
    public String getTestServiceId() {
        return testServiceId;
    }

    public void setTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
    }

    public ListCasesStatusRequest withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
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
        ListCasesStatusRequest that = (ListCasesStatusRequest) obj;
        return Objects.equals(this.testServiceId, that.testServiceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testServiceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCasesStatusRequest {\n");
        sb.append("    testServiceId: ").append(toIndentedString(testServiceId)).append("\n");
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
