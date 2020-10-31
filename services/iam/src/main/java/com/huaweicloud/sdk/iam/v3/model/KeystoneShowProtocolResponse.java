package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ProtocolResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneShowProtocolResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ProtocolResult protocol = null;

    public KeystoneShowProtocolResponse withProtocol(ProtocolResult protocol) {
        this.protocol = protocol;
        return this;
    }

    public KeystoneShowProtocolResponse withProtocol(Consumer<ProtocolResult> protocolSetter) {
        if(this.protocol == null ){
            this.protocol = new ProtocolResult();
            protocolSetter.accept(this.protocol);
        }
        
        return this;
    }


    /**
     * Get protocol
     * @return protocol
     */
    public ProtocolResult getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolResult protocol) {
        this.protocol = protocol;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowProtocolResponse keystoneShowProtocolResponse = (KeystoneShowProtocolResponse) o;
        return Objects.equals(this.protocol, keystoneShowProtocolResponse.protocol);
    }
    @Override
    public int hashCode() {
        return Objects.hash(protocol);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowProtocolResponse {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

