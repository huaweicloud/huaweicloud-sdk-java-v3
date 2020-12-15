package com.huaweicloud.sdk.cce.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.NodeMetadata;
import com.huaweicloud.sdk.cce.v3.model.V3NodeSpec;
import com.huaweicloud.sdk.cce.v3.model.V3NodeStatus;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowNodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion = "v3";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind = "Node";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private NodeMetadata metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec")
    
    private V3NodeSpec spec = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private V3NodeStatus status = null;

    public ShowNodeResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    


    /**
     * API版本，固定值“v3”，该值不可修改。  
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowNodeResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * API类型，固定值“Node”，该值不可修改。  
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowNodeResponse withMetadata(NodeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowNodeResponse withMetadata(Consumer<NodeMetadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new NodeMetadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public NodeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(NodeMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowNodeResponse withSpec(V3NodeSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowNodeResponse withSpec(Consumer<V3NodeSpec> specSetter) {
        if(this.spec == null ){
            this.spec = new V3NodeSpec();
            specSetter.accept(this.spec);
        }
        
        return this;
    }


    /**
     * Get spec
     * @return spec
     */
    public V3NodeSpec getSpec() {
        return spec;
    }

    public void setSpec(V3NodeSpec spec) {
        this.spec = spec;
    }

    public ShowNodeResponse withStatus(V3NodeStatus status) {
        this.status = status;
        return this;
    }

    public ShowNodeResponse withStatus(Consumer<V3NodeStatus> statusSetter) {
        if(this.status == null ){
            this.status = new V3NodeStatus();
            statusSetter.accept(this.status);
        }
        
        return this;
    }


    /**
     * Get status
     * @return status
     */
    public V3NodeStatus getStatus() {
        return status;
    }

    public void setStatus(V3NodeStatus status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNodeResponse showNodeResponse = (ShowNodeResponse) o;
        return Objects.equals(this.apiVersion, showNodeResponse.apiVersion) &&
            Objects.equals(this.kind, showNodeResponse.kind) &&
            Objects.equals(this.metadata, showNodeResponse.metadata) &&
            Objects.equals(this.spec, showNodeResponse.spec) &&
            Objects.equals(this.status, showNodeResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNodeResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

