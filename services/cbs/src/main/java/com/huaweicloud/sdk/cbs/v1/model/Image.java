package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ImageFrame;
import com.huaweicloud.sdk.cbs.v1.model.Time;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Image
 */
public class Image  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_frame")
    

    private ImageFrame imageFrame;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_url")
    

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resolution_type")
    

    private Integer resolutionType;

    public Image withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public Image withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public Image withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Image withImageFrame(ImageFrame imageFrame) {
        this.imageFrame = imageFrame;
        return this;
    }

    public Image withImageFrame(Consumer<ImageFrame> imageFrameSetter) {
        if(this.imageFrame == null ){
            this.imageFrame = new ImageFrame();
            imageFrameSetter.accept(this.imageFrame);
        }
        
        return this;
    }


    /**
     * Get imageFrame
     * @return imageFrame
     */
    public ImageFrame getImageFrame() {
        return imageFrame;
    }

    public void setImageFrame(ImageFrame imageFrame) {
        this.imageFrame = imageFrame;
    }

    

    public Image withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    


    /**
     * 图片的obs路径
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    

    public Image withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Image withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 0：背景图 1：图标 2：系统背景
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public Image withResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
        return this;
    }

    


    /**
     * 横竖屏模式。0：横版1：竖版
     * @return resolutionType
     */
    public Integer getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image image = (Image) o;
        return Objects.equals(this.createTime, image.createTime) &&
            Objects.equals(this.updateTime, image.updateTime) &&
            Objects.equals(this.id, image.id) &&
            Objects.equals(this.imageFrame, image.imageFrame) &&
            Objects.equals(this.imageUrl, image.imageUrl) &&
            Objects.equals(this.name, image.name) &&
            Objects.equals(this.type, image.type) &&
            Objects.equals(this.resolutionType, image.resolutionType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createTime, updateTime, id, imageFrame, imageUrl, name, type, resolutionType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageFrame: ").append(toIndentedString(imageFrame)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
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

