package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteApplicationEndpointRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoint_urn")
    
    private String endpointUrn;

    public DeleteApplicationEndpointRequest withEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
        return this;
    }

    


    /**
     * Get endpointUrn
     * @return endpointUrn
     */
    public String getEndpointUrn() {
        return endpointUrn;
    }

    public void setEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteApplicationEndpointRequest deleteApplicationEndpointRequest = (DeleteApplicationEndpointRequest) o;
        return Objects.equals(this.endpointUrn, deleteApplicationEndpointRequest.endpointUrn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endpointUrn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteApplicationEndpointRequest {\n");
        sb.append("    endpointUrn: ").append(toIndentedString(endpointUrn)).append("\n");
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

