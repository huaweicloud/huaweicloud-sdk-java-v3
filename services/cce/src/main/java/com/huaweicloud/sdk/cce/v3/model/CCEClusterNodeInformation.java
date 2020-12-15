package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.CCEClusterNodeInformationMetadata;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CCEClusterNodeInformation
 */
public class CCEClusterNodeInformation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private CCEClusterNodeInformationMetadata metadata = null;

    public CCEClusterNodeInformation withMetadata(CCEClusterNodeInformationMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CCEClusterNodeInformation withMetadata(Consumer<CCEClusterNodeInformationMetadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new CCEClusterNodeInformationMetadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public CCEClusterNodeInformationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CCEClusterNodeInformationMetadata metadata) {
        this.metadata = metadata;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CCEClusterNodeInformation ccEClusterNodeInformation = (CCEClusterNodeInformation) o;
        return Objects.equals(this.metadata, ccEClusterNodeInformation.metadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CCEClusterNodeInformation {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

