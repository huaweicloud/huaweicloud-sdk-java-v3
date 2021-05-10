package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.ClusterMetadata;
import com.huaweicloud.sdk.cce.v3.model.ClusterStatus;
import com.huaweicloud.sdk.cce.v3.model.V3ClusterSpec;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class V3Cluster  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private ClusterMetadata metadata;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec")
    
    private V3ClusterSpec spec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private ClusterStatus status;

    public V3Cluster withKind(String kind) {
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

    

    public V3Cluster withApiVersion(String apiVersion) {
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

    

    public V3Cluster withMetadata(ClusterMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public V3Cluster withMetadata(Consumer<ClusterMetadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new ClusterMetadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public ClusterMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ClusterMetadata metadata) {
        this.metadata = metadata;
    }

    

    public V3Cluster withSpec(V3ClusterSpec spec) {
        this.spec = spec;
        return this;
    }

    public V3Cluster withSpec(Consumer<V3ClusterSpec> specSetter) {
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

    

    public V3Cluster withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    public V3Cluster withStatus(Consumer<ClusterStatus> statusSetter) {
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
        V3Cluster v3Cluster = (V3Cluster) o;
        return Objects.equals(this.kind, v3Cluster.kind) &&
            Objects.equals(this.apiVersion, v3Cluster.apiVersion) &&
            Objects.equals(this.metadata, v3Cluster.metadata) &&
            Objects.equals(this.spec, v3Cluster.spec) &&
            Objects.equals(this.status, v3Cluster.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V3Cluster {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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

