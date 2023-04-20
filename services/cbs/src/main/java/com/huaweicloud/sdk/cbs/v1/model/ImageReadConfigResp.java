package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ImageReadConfig;
import com.huaweicloud.sdk.cbs.v1.model.Resolution;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ImageReadConfigResp  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="read_content")
    

    private String readContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resolution")
    

    private Resolution resolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_url")
    

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    public ImageReadConfigResp withReadContent(String readContent) {
        this.readContent = readContent;
        return this;
    }

    


    /**
     * 播报内容，长度为1~2500
     * @return readContent
     */
    public String getReadContent() {
        return readContent;
    }

    public void setReadContent(String readContent) {
        this.readContent = readContent;
    }

    

    public ImageReadConfigResp withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * 图片id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    

    public ImageReadConfigResp withResolution(Resolution resolution) {
        this.resolution = resolution;
        return this;
    }

    public ImageReadConfigResp withResolution(Consumer<Resolution> resolutionSetter) {
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

    

    public ImageReadConfigResp withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    


    /**
     * 图片地址
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    

    public ImageReadConfigResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 图片名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageReadConfigResp imageReadConfigResp = (ImageReadConfigResp) o;
        return Objects.equals(this.readContent, imageReadConfigResp.readContent) &&
            Objects.equals(this.imageId, imageReadConfigResp.imageId) &&
            Objects.equals(this.resolution, imageReadConfigResp.resolution) &&
            Objects.equals(this.imageUrl, imageReadConfigResp.imageUrl) &&
            Objects.equals(this.name, imageReadConfigResp.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(readContent, imageId, resolution, imageUrl, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageReadConfigResp {\n");
        sb.append("    readContent: ").append(toIndentedString(readContent)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

