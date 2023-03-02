package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto crerate Body Object
 */
public class ImageWisedesignCombineBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private Integer x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private Integer y;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "w")

    private Integer w;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "h")

    private Integer h;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flipx")

    private Boolean flipx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flipy")

    private Boolean flipy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate")

    private Integer rotate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opacity")

    private Float opacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_base64")

    private String imageBase64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backgroundattrs")

    private ImageWisedesignCombineBodyBackgroundattrs backgroundattrs;

    public ImageWisedesignCombineBody withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 图层标识，范围5个图层以内, 0 代表背景层
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ImageWisedesignCombineBody withX(Integer x) {
        this.x = x;
        return this;
    }

    /**
     * 图层左上角的横坐标位置，单位为px，默认为0
     * @return x
     */
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public ImageWisedesignCombineBody withY(Integer y) {
        this.y = y;
        return this;
    }

    /**
     * 图层左上角的纵坐标位置，单位为px，默认为0
     * @return y
     */
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public ImageWisedesignCombineBody withW(Integer w) {
        this.w = w;
        return this;
    }

    /**
     * 图层宽度，单位为px，默认为上传图片的宽度
     * @return w
     */
    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public ImageWisedesignCombineBody withH(Integer h) {
        this.h = h;
        return this;
    }

    /**
     * 图层高度，单位为px，默认为上传图片的高度
     * @return h
     */
    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public ImageWisedesignCombineBody withFlipx(Boolean flipx) {
        this.flipx = flipx;
        return this;
    }

    /**
     * 是否水平翻转，默认值为false
     * @return flipx
     */
    public Boolean getFlipx() {
        return flipx;
    }

    public void setFlipx(Boolean flipx) {
        this.flipx = flipx;
    }

    public ImageWisedesignCombineBody withFlipy(Boolean flipy) {
        this.flipy = flipy;
        return this;
    }

    /**
     * 是否垂直翻转，默认值为false
     * @return flipy
     */
    public Boolean getFlipy() {
        return flipy;
    }

    public void setFlipy(Boolean flipy) {
        this.flipy = flipy;
    }

    public ImageWisedesignCombineBody withRotate(Integer rotate) {
        this.rotate = rotate;
        return this;
    }

    /**
     * 图层旋转角度，范围[-180, +180]，默认为0
     * @return rotate
     */
    public Integer getRotate() {
        return rotate;
    }

    public void setRotate(Integer rotate) {
        this.rotate = rotate;
    }

    public ImageWisedesignCombineBody withOpacity(Float opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * 图层透明度，范围[0, 1]，默认为1
     * @return opacity
     */
    public Float getOpacity() {
        return opacity;
    }

    public void setOpacity(Float opacity) {
        this.opacity = opacity;
    }

    public ImageWisedesignCombineBody withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    /**
     * 非背景图的图像数据，base64编码，要求base64编码最长边最大3000px，支持JPG/PNG/BMP/JPEG格式
     * @return imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public ImageWisedesignCombineBody withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 与image_base64二选一  图片的URL路径，目前支持：  - 公网HTTP/HTTPS URL  - 华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[[配置OBS服务的访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)](tag:hc)[[配置OBS服务的访问权限](https://support.huaweicloud.com/intl/zh-cn/api-moderation/moderation_03_0020.html)](tag:hk)。  > - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 > - 请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 > - lmage不支持跨区域OBS，OBS的区域需要和服务保持一致。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ImageWisedesignCombineBody withBackgroundattrs(ImageWisedesignCombineBodyBackgroundattrs backgroundattrs) {
        this.backgroundattrs = backgroundattrs;
        return this;
    }

    public ImageWisedesignCombineBody withBackgroundattrs(
        Consumer<ImageWisedesignCombineBodyBackgroundattrs> backgroundattrsSetter) {
        if (this.backgroundattrs == null) {
            this.backgroundattrs = new ImageWisedesignCombineBodyBackgroundattrs();
            backgroundattrsSetter.accept(this.backgroundattrs);
        }

        return this;
    }

    /**
     * Get backgroundattrs
     * @return backgroundattrs
     */
    public ImageWisedesignCombineBodyBackgroundattrs getBackgroundattrs() {
        return backgroundattrs;
    }

    public void setBackgroundattrs(ImageWisedesignCombineBodyBackgroundattrs backgroundattrs) {
        this.backgroundattrs = backgroundattrs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageWisedesignCombineBody imageWisedesignCombineBody = (ImageWisedesignCombineBody) o;
        return Objects.equals(this.id, imageWisedesignCombineBody.id)
            && Objects.equals(this.x, imageWisedesignCombineBody.x)
            && Objects.equals(this.y, imageWisedesignCombineBody.y)
            && Objects.equals(this.w, imageWisedesignCombineBody.w)
            && Objects.equals(this.h, imageWisedesignCombineBody.h)
            && Objects.equals(this.flipx, imageWisedesignCombineBody.flipx)
            && Objects.equals(this.flipy, imageWisedesignCombineBody.flipy)
            && Objects.equals(this.rotate, imageWisedesignCombineBody.rotate)
            && Objects.equals(this.opacity, imageWisedesignCombineBody.opacity)
            && Objects.equals(this.imageBase64, imageWisedesignCombineBody.imageBase64)
            && Objects.equals(this.imageUrl, imageWisedesignCombineBody.imageUrl)
            && Objects.equals(this.backgroundattrs, imageWisedesignCombineBody.backgroundattrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, x, y, w, h, flipx, flipy, rotate, opacity, imageBase64, imageUrl, backgroundattrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWisedesignCombineBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    w: ").append(toIndentedString(w)).append("\n");
        sb.append("    h: ").append(toIndentedString(h)).append("\n");
        sb.append("    flipx: ").append(toIndentedString(flipx)).append("\n");
        sb.append("    flipy: ").append(toIndentedString(flipy)).append("\n");
        sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
        sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    backgroundattrs: ").append(toIndentedString(backgroundattrs)).append("\n");
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
