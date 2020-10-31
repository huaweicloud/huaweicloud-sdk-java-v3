package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.huaweicloud.sdk.iam.v3.model.ProtocolResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneListProtocolsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocols")
    
    private List<ProtocolResult> protocols = null;
    
    public KeystoneListProtocolsResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListProtocolsResponse withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public KeystoneListProtocolsResponse withProtocols(List<ProtocolResult> protocols) {
        this.protocols = protocols;
        return this;
    }

    
    public KeystoneListProtocolsResponse addProtocolsItem(ProtocolResult protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public KeystoneListProtocolsResponse withProtocols(Consumer<List<ProtocolResult>> protocolsSetter) {
        if(this.protocols == null ){
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /**
     * 协议信息列表。
     * @return protocols
     */
    public List<ProtocolResult> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<ProtocolResult> protocols) {
        this.protocols = protocols;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListProtocolsResponse keystoneListProtocolsResponse = (KeystoneListProtocolsResponse) o;
        return Objects.equals(this.links, keystoneListProtocolsResponse.links) &&
            Objects.equals(this.protocols, keystoneListProtocolsResponse.protocols);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, protocols);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListProtocolsResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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

