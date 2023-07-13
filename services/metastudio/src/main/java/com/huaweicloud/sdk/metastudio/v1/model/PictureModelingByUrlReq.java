package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务请求
 */
public class PictureModelingByUrlReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture_url")

    private String pictureUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style_id")

    private String styleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_url")

    private String notifyUrl;

    public PictureModelingByUrlReq withPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    /**
     * 图片URL
     * @return pictureUrl
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public PictureModelingByUrlReq withStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }

    /**
     * 风格ID
     * @return styleId
     */
    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public PictureModelingByUrlReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 风格ID
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PictureModelingByUrlReq withNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * 照片建模任务结束的回调地址。
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PictureModelingByUrlReq that = (PictureModelingByUrlReq) obj;
        return Objects.equals(this.pictureUrl, that.pictureUrl) && Objects.equals(this.styleId, that.styleId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.notifyUrl, that.notifyUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pictureUrl, styleId, name, notifyUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureModelingByUrlReq {\n");
        sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
        sb.append("    styleId: ").append(toIndentedString(styleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
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
