package com.huaweicloud.sdk.cce.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.ClusterStatus;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterMetadata;
import com.huaweicloud.sdk.cce.v3.model.V3ClusterSpec;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowClusterResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion = "v3";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind = "Cluster";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private ShowClusterMetadata metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec")
    
    private V3ClusterSpec spec = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private ClusterStatus status = null;

    public ShowClusterResponse withApiVersion(String apiVersion) {
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

    public ShowClusterResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * API类型，固定值“Cluster”或“cluster”，该值不可修改。  
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowClusterResponse withMetadata(ShowClusterMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowClusterResponse withMetadata(Consumer<ShowClusterMetadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new ShowClusterMetadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public ShowClusterMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ShowClusterMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowClusterResponse withSpec(V3ClusterSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowClusterResponse withSpec(Consumer<V3ClusterSpec> specSetter) {
        if(this.spec == null ){
            this.spec = new V3ClusterSpec();
            specSetter.accept(this.spec);
        }
        
        return this;
    }


    /**
     * Get spec
     * @return spec
     */
    public V3ClusterSpec getSpec() {
        return spec;
    }

    public void setSpec(V3ClusterSpec spec) {
        this.spec = spec;
    }

    public ShowClusterResponse withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    public ShowClusterResponse withStatus(Consumer<ClusterStatus> statusSetter) {
        if(this.status == null ){
            this.status = new ClusterStatus();
            statusSetter.accept(this.status);
        }
        
        return this;
    }


    /**
     * Get status
     * @return status
     */
    public ClusterStatus getStatus() {
        return status;
    }

    public void setStatus(ClusterStatus status) {
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
        ShowClusterResponse showClusterResponse = (ShowClusterResponse) o;
        return Objects.equals(this.apiVersion, showClusterResponse.apiVersion) &&
            Objects.equals(this.kind, showClusterResponse.kind) &&
            Objects.equals(this.metadata, showClusterResponse.metadata) &&
            Objects.equals(this.spec, showClusterResponse.spec) &&
            Objects.equals(this.status, showClusterResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterResponse {\n");
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

