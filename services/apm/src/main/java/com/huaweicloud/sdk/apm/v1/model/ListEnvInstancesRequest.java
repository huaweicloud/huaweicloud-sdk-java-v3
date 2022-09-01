package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListEnvInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")

    @JacksonXmlProperty(localName = "x-business-id")

    private Long xBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private InstanceSearchParam body;

    public ListEnvInstancesRequest withXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
        return this;
    }

    /**
     * 应用id
     * @return xBusinessId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")
    public Long getXBusinessId() {
        return xBusinessId;
    }

    public void setXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
    }

    public ListEnvInstancesRequest withBody(InstanceSearchParam body) {
        this.body = body;
        return this;
    }

    public ListEnvInstancesRequest withBody(Consumer<InstanceSearchParam> bodySetter) {
        if (this.body == null) {
            this.body = new InstanceSearchParam();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public InstanceSearchParam getBody() {
        return body;
    }

    public void setBody(InstanceSearchParam body) {
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
        ListEnvInstancesRequest listEnvInstancesRequest = (ListEnvInstancesRequest) o;
        return Objects.equals(this.xBusinessId, listEnvInstancesRequest.xBusinessId)
            && Objects.equals(this.body, listEnvInstancesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xBusinessId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvInstancesRequest {\n");
        sb.append("    xBusinessId: ").append(toIndentedString(xBusinessId)).append("\n");
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
