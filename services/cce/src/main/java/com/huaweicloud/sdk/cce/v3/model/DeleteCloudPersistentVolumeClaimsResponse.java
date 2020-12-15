package com.huaweicloud.sdk.cce.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.PersistentVolumeClaimMetadata;
import com.huaweicloud.sdk.cce.v3.model.PersistentVolumeClaimSpec;
import com.huaweicloud.sdk.cce.v3.model.PersistentVolumeClaimStatus;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DeleteCloudPersistentVolumeClaimsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion = "v1";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind = "PersistentVolumeClaim";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private PersistentVolumeClaimMetadata metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec")
    
    private PersistentVolumeClaimSpec spec = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private PersistentVolumeClaimStatus status = null;

    public DeleteCloudPersistentVolumeClaimsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    


    /**
     * API版本，固定值**v1**
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * API类型，固定值**PersistentVolumeClaim**
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withMetadata(PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withMetadata(Consumer<PersistentVolumeClaimMetadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new PersistentVolumeClaimMetadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public PersistentVolumeClaimMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withSpec(Consumer<PersistentVolumeClaimSpec> specSetter) {
        if(this.spec == null ){
            this.spec = new PersistentVolumeClaimSpec();
            specSetter.accept(this.spec);
        }
        
        return this;
    }


    /**
     * Get spec
     * @return spec
     */
    public PersistentVolumeClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withStatus(PersistentVolumeClaimStatus status) {
        this.status = status;
        return this;
    }

    public DeleteCloudPersistentVolumeClaimsResponse withStatus(Consumer<PersistentVolumeClaimStatus> statusSetter) {
        if(this.status == null ){
            this.status = new PersistentVolumeClaimStatus();
            statusSetter.accept(this.status);
        }
        
        return this;
    }


    /**
     * Get status
     * @return status
     */
    public PersistentVolumeClaimStatus getStatus() {
        return status;
    }

    public void setStatus(PersistentVolumeClaimStatus status) {
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
        DeleteCloudPersistentVolumeClaimsResponse deleteCloudPersistentVolumeClaimsResponse = (DeleteCloudPersistentVolumeClaimsResponse) o;
        return Objects.equals(this.apiVersion, deleteCloudPersistentVolumeClaimsResponse.apiVersion) &&
            Objects.equals(this.kind, deleteCloudPersistentVolumeClaimsResponse.kind) &&
            Objects.equals(this.metadata, deleteCloudPersistentVolumeClaimsResponse.metadata) &&
            Objects.equals(this.spec, deleteCloudPersistentVolumeClaimsResponse.spec) &&
            Objects.equals(this.status, deleteCloudPersistentVolumeClaimsResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCloudPersistentVolumeClaimsResponse {\n");
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

