package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListResourceInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListInstanceRequestBody body;

    public ListResourceInstancesRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /** 资源类型，目前有: smn_topic，主题 smn_sms，短信 smn_application，移动推送
     * 
     * @return resourceType */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListResourceInstancesRequest withBody(ListInstanceRequestBody body) {
        this.body = body;
        return this;
    }

    public ListResourceInstancesRequest withBody(Consumer<ListInstanceRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListInstanceRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ListInstanceRequestBody getBody() {
        return body;
    }

    public void setBody(ListInstanceRequestBody body) {
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
        ListResourceInstancesRequest listResourceInstancesRequest = (ListResourceInstancesRequest) o;
        return Objects.equals(this.resourceType, listResourceInstancesRequest.resourceType)
            && Objects.equals(this.body, listResourceInstancesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceInstancesRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
