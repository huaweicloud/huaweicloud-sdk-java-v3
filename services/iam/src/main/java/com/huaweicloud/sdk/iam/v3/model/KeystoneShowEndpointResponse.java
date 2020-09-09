package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Endpoint;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneShowEndpointResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoint")
    
    private Endpoint endpoint = null;

    public KeystoneShowEndpointResponse withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public KeystoneShowEndpointResponse withEndpoint(Consumer<Endpoint> endpointSetter) {
        if(this.endpoint == null ){
            this.endpoint = new Endpoint();
            endpointSetter.accept(this.endpoint);
        }
        
        return this;
    }


    /**
     * Get endpoint
     * @return endpoint
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowEndpointResponse keystoneShowEndpointResponse = (KeystoneShowEndpointResponse) o;
        return Objects.equals(this.endpoint, keystoneShowEndpointResponse.endpoint);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endpoint);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowEndpointResponse {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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

