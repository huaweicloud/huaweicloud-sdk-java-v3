package com.huaweicloud.sdk.bms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.KeyValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateBaremetalServerMetadataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private KeyValue metadata = null;

    public UpdateBaremetalServerMetadataResponse withMetadata(KeyValue metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpdateBaremetalServerMetadataResponse withMetadata(Consumer<KeyValue> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new KeyValue();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public KeyValue getMetadata() {
        return metadata;
    }

    public void setMetadata(KeyValue metadata) {
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
        UpdateBaremetalServerMetadataResponse updateBaremetalServerMetadataResponse = (UpdateBaremetalServerMetadataResponse) o;
        return Objects.equals(this.metadata, updateBaremetalServerMetadataResponse.metadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBaremetalServerMetadataResponse {\n");
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

