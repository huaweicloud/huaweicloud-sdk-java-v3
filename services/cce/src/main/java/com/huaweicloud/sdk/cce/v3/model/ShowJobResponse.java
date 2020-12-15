package com.huaweicloud.sdk.cce.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.CCEJobMetadata;
import com.huaweicloud.sdk.cce.v3.model.CCEJobSpec;
import com.huaweicloud.sdk.cce.v3.model.CCEJobStatus;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion = "v3";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind = "Job";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private CCEJobMetadata metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec")
    
    private CCEJobSpec spec = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private CCEJobStatus status = null;

    public ShowJobResponse withApiVersion(String apiVersion) {
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

    public ShowJobResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * API类型，固定值“Job”，该值不可修改。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowJobResponse withMetadata(CCEJobMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowJobResponse withMetadata(Consumer<CCEJobMetadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new CCEJobMetadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public CCEJobMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CCEJobMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowJobResponse withSpec(CCEJobSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowJobResponse withSpec(Consumer<CCEJobSpec> specSetter) {
        if(this.spec == null ){
            this.spec = new CCEJobSpec();
            specSetter.accept(this.spec);
        }
        
        return this;
    }


    /**
     * Get spec
     * @return spec
     */
    public CCEJobSpec getSpec() {
        return spec;
    }

    public void setSpec(CCEJobSpec spec) {
        this.spec = spec;
    }

    public ShowJobResponse withStatus(CCEJobStatus status) {
        this.status = status;
        return this;
    }

    public ShowJobResponse withStatus(Consumer<CCEJobStatus> statusSetter) {
        if(this.status == null ){
            this.status = new CCEJobStatus();
            statusSetter.accept(this.status);
        }
        
        return this;
    }


    /**
     * Get status
     * @return status
     */
    public CCEJobStatus getStatus() {
        return status;
    }

    public void setStatus(CCEJobStatus status) {
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
        ShowJobResponse showJobResponse = (ShowJobResponse) o;
        return Objects.equals(this.apiVersion, showJobResponse.apiVersion) &&
            Objects.equals(this.kind, showJobResponse.kind) &&
            Objects.equals(this.metadata, showJobResponse.metadata) &&
            Objects.equals(this.spec, showJobResponse.spec) &&
            Objects.equals(this.status, showJobResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
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

