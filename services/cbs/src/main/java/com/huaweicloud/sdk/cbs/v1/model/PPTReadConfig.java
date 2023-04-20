package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.Resolution;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class PPTReadConfig  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="read_content")
    

    private String readContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resolution")
    

    private Resolution resolution;

    public PPTReadConfig withReadContent(String readContent) {
        this.readContent = readContent;
        return this;
    }

    


    /**
     * 播报内容，长度为3~2500
     * @return readContent
     */
    public String getReadContent() {
        return readContent;
    }

    public void setReadContent(String readContent) {
        this.readContent = readContent;
    }

    

    public PPTReadConfig withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * PPT转化有的图片id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    

    public PPTReadConfig withResolution(Resolution resolution) {
        this.resolution = resolution;
        return this;
    }

    public PPTReadConfig withResolution(Consumer<Resolution> resolutionSetter) {
        if(this.resolution == null ){
            this.resolution = new Resolution();
            resolutionSetter.accept(this.resolution);
        }
        
        return this;
    }


    /**
     * Get resolution
     * @return resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PPTReadConfig ppTReadConfig = (PPTReadConfig) o;
        return Objects.equals(this.readContent, ppTReadConfig.readContent) &&
            Objects.equals(this.imageId, ppTReadConfig.imageId) &&
            Objects.equals(this.resolution, ppTReadConfig.resolution);
    }
    @Override
    public int hashCode() {
        return Objects.hash(readContent, imageId, resolution);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PPTReadConfig {\n");
        sb.append("    readContent: ").append(toIndentedString(readContent)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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

