package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.Resolution;
import com.huaweicloud.sdk.cbs.v1.model.UrlResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ImageUrlResp  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resolution")
    

    private Resolution resolution;

    public ImageUrlResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 图片id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ImageUrlResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ImageUrlResp withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 访问地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public ImageUrlResp withResolution(Resolution resolution) {
        this.resolution = resolution;
        return this;
    }

    public ImageUrlResp withResolution(Consumer<Resolution> resolutionSetter) {
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
        ImageUrlResp imageUrlResp = (ImageUrlResp) o;
        return Objects.equals(this.id, imageUrlResp.id) &&
            Objects.equals(this.name, imageUrlResp.name) &&
            Objects.equals(this.url, imageUrlResp.url) &&
            Objects.equals(this.resolution, imageUrlResp.resolution);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, url, resolution);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageUrlResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

