package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** AddFacesBase64Req */
public class AddFacesBase64Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_base64")

    private String imageBase64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_fields")

    private Object externalFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_image_id")

    private String externalImageId;

    public AddFacesBase64Req withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    /** 图像数据，Base64编码，要求： • Base64编码后大小不超过8MB，建议小于1MB。 • 图片为JPG/JPEG/BMP/PNG格式。
     * 
     * @return imageBase64 */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public AddFacesBase64Req withExternalFields(Object externalFields) {
        this.externalFields = externalFields;
        return this;
    }

    /** 根据用户自定义数据类型，填入相应的数值。 创建faceset时定义该字段，Json字符串不校验重复性，参考[自定义字段](zh-cn_topic_0130807044.xml)。
     * 
     * @return externalFields */
    public Object getExternalFields() {
        return externalFields;
    }

    public void setExternalFields(Object externalFields) {
        this.externalFields = externalFields;
    }

    public AddFacesBase64Req withExternalImageId(String externalImageId) {
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
        AddFacesBase64Req addFacesBase64Req = (AddFacesBase64Req) o;
        return Objects.equals(this.imageBase64, addFacesBase64Req.imageBase64)
            && Objects.equals(this.externalFields, addFacesBase64Req.externalFields)
            && Objects.equals(this.externalImageId, addFacesBase64Req.externalImageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageBase64, externalFields, externalImageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFacesBase64Req {\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
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
