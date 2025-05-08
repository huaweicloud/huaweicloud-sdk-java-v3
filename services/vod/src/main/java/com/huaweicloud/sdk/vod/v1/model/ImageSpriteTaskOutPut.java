package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageSpriteTaskOutPut
 */
public class ImageSpriteTaskOutPut {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_info")

    private ObsInfo obsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sprite_image_list")

    private List<String> spriteImageList = null;

    public ImageSpriteTaskOutPut withObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public ImageSpriteTaskOutPut withObsInfo(Consumer<ObsInfo> obsInfoSetter) {
        if (this.obsInfo == null) {
            this.obsInfo = new ObsInfo();
            obsInfoSetter.accept(this.obsInfo);
        }

        return this;
    }

    /**
     * Get obsInfo
     * @return obsInfo
     */
    public ObsInfo getObsInfo() {
        return obsInfo;
    }

    public void setObsInfo(ObsInfo obsInfo) {
        this.obsInfo = obsInfo;
    }

    public ImageSpriteTaskOutPut withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 雪碧图的高度
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ImageSpriteTaskOutPut withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 雪碧图的宽度
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public ImageSpriteTaskOutPut withSpriteImageList(List<String> spriteImageList) {
        this.spriteImageList = spriteImageList;
        return this;
    }

    public ImageSpriteTaskOutPut addSpriteImageListItem(String spriteImageListItem) {
        if (this.spriteImageList == null) {
            this.spriteImageList = new ArrayList<>();
        }
        this.spriteImageList.add(spriteImageListItem);
        return this;
    }

    public ImageSpriteTaskOutPut withSpriteImageList(Consumer<List<String>> spriteImageListSetter) {
        if (this.spriteImageList == null) {
            this.spriteImageList = new ArrayList<>();
        }
        spriteImageListSetter.accept(this.spriteImageList);
        return this;
    }

    /**
     * 雪碧图对象列表
     * @return spriteImageList
     */
    public List<String> getSpriteImageList() {
        return spriteImageList;
    }

    public void setSpriteImageList(List<String> spriteImageList) {
        this.spriteImageList = spriteImageList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageSpriteTaskOutPut that = (ImageSpriteTaskOutPut) obj;
        return Objects.equals(this.obsInfo, that.obsInfo) && Objects.equals(this.height, that.height)
            && Objects.equals(this.width, that.width) && Objects.equals(this.spriteImageList, that.spriteImageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsInfo, height, width, spriteImageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSpriteTaskOutPut {\n");
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    spriteImageList: ").append(toIndentedString(spriteImageList)).append("\n");
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
