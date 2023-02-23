package com.huaweicloud.sdk.ges.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowMetadata2Request  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata_id")
    

    private String metadataId;

    public ShowMetadata2Request withMetadataId(String metadataId) {
        this.metadataId = metadataId;
        return this;
    }

    


    /**
     * 元数据ID。
     * @return metadataId
     */
    public String getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(String metadataId) {
        this.metadataId = metadataId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMetadata2Request showMetadata2Request = (ShowMetadata2Request) o;
        return Objects.equals(this.metadataId, showMetadata2Request.metadataId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metadataId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetadata2Request {\n");
        sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
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

