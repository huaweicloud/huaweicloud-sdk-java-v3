package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneShowEndpointRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoint_id")
    
    private String endpointId;

    public KeystoneShowEndpointRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    


    /**
     * Get endpointId
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowEndpointRequest keystoneShowEndpointRequest = (KeystoneShowEndpointRequest) o;
        return Objects.equals(this.endpointId, keystoneShowEndpointRequest.endpointId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endpointId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowEndpointRequest {\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
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

