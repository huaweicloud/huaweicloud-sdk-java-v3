package com.huaweicloud.sdk.ims.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class JobEntities  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    
    private String imageId;

    public JobEntities withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobEntities jobEntities = (JobEntities) o;
        return Objects.equals(this.imageId, jobEntities.imageId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEntities {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

