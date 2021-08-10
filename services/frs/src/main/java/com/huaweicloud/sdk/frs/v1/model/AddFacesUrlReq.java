package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** AddFacesUrlReq */
public class AddFacesUrlReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_fields")

    private Object externalFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_image_id")

    private String externalImageId;

    public AddFacesUrlReq withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /** 图片的URL路径，目前仅支持华为云上OBS的URL，且人脸识别服务有权限读取该OBS桶的数据。 开通读取权限的操作请参见服务授权。
     * 
     * @return imageUrl */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public AddFacesUrlReq withExternalFields(Object externalFields) {
        this.externalFields = externalFields;
        return this;
    }

    /** 根据用户自定义数据类型，填入相应的数值。 创建faceset时定义该字段，Json字符串不校验重复性，参考自定义字段。
     * 
     * @return externalFields */
    public Object getExternalFields() {
        return externalFields;
    }

    public void setExternalFields(Object externalFields) {
        this.externalFields = externalFields;
    }

    public AddFacesUrlReq withExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
        return this;
    }

    /** 用户指定的图片外部ID，与当前图像绑定。用户没提供，系统会生成一个。 该ID长度范围为1～36位，可以包含字母、数字、中划线或者下划线，不包含其他的特殊字符。
     * 
     * @return externalImageId */
    public String getExternalImageId() {
        return externalImageId;
    }

    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddFacesUrlReq addFacesUrlReq = (AddFacesUrlReq) o;
        return Objects.equals(this.imageUrl, addFacesUrlReq.imageUrl)
            && Objects.equals(this.externalFields, addFacesUrlReq.externalFields)
            && Objects.equals(this.externalImageId, addFacesUrlReq.externalImageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageUrl, externalFields, externalImageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFacesUrlReq {\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    externalFields: ").append(toIndentedString(externalFields)).append("\n");
        sb.append("    externalImageId: ").append(toIndentedString(externalImageId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
