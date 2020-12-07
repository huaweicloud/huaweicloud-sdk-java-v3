package com.huaweicloud.sdk.smn.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointAttributesResponseBodyAttributes;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListApplicationEndpointAttributesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attributes")
    
    private ListApplicationEndpointAttributesResponseBodyAttributes attributes = null;

    public ListApplicationEndpointAttributesResponse withRequestId(String requestId) {
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

    public ListApplicationEndpointAttributesResponse withAttributes(ListApplicationEndpointAttributesResponseBodyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public ListApplicationEndpointAttributesResponse withAttributes(Consumer<ListApplicationEndpointAttributesResponseBodyAttributes> attributesSetter) {
        if(this.attributes == null ){
            this.attributes = new ListApplicationEndpointAttributesResponseBodyAttributes();
            attributesSetter.accept(this.attributes);
        }
        
        return this;
    }


    /**
     * Get attributes
     * @return attributes
     */
    public ListApplicationEndpointAttributesResponseBodyAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ListApplicationEndpointAttributesResponseBodyAttributes attributes) {
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
        ListApplicationEndpointAttributesResponse listApplicationEndpointAttributesResponse = (ListApplicationEndpointAttributesResponse) o;
        return Objects.equals(this.requestId, listApplicationEndpointAttributesResponse.requestId) &&
            Objects.equals(this.attributes, listApplicationEndpointAttributesResponse.attributes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, attributes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationEndpointAttributesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

