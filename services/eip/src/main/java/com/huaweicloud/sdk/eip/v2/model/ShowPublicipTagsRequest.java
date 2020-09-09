package com.huaweicloud.sdk.eip.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowPublicipTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_id")
    
    private String publicipId;

    public ShowPublicipTagsRequest withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    


    /**
     * Get publicipId
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPublicipTagsRequest showPublicipTagsRequest = (ShowPublicipTagsRequest) o;
        return Objects.equals(this.publicipId, showPublicipTagsRequest.publicipId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicipId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublicipTagsRequest {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
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

