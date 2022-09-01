package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateFaceReq
 */
public class UpdateFaceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_fields")

    @JacksonXmlProperty(localName = "external_fields")

    private Object externalFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_image_id")

    @JacksonXmlProperty(localName = "external_image_id")

    private String externalImageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_id")

    @JacksonXmlProperty(localName = "face_id")

    private String faceId;

    public UpdateFaceReq withExternalFields(Object externalFields) {
        this.externalFields = externalFields;
        return this;
    }

    /**
     * Json字符串不校验重复性，自定义字段的key值长度范围为[1,36]，string类型的value长度范围为[1,256]，具体参见[[自定义字段](https://support.huaweicloud.com/api-face/face_02_0012.html)](tag:hc)。[[自定义字段](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0012.html)](tag:hk)。这里是待修改的参数，external_image_id和external_fields至少选一个。
     * @return externalFields
     */
    public Object getExternalFields() {
        return externalFields;
    }

    public void setExternalFields(Object externalFields) {
        this.externalFields = externalFields;
    }

    public UpdateFaceReq withExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
        return this;
    }

    /**
     * 用户指定的图片外部ID，与当前图像绑定。用户没提供，系统会生成一个。该ID长度范围为1～36位，可以包含字母、数字、中划线或者下划线，不包含其他的特殊字符。 这里是待修改的参数，external_image_id和external_fields至少选一个。
     * @return externalImageId
     */
    public String getExternalImageId() {
        return externalImageId;
    }

    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    public UpdateFaceReq withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * 人脸库ID，由系统内部生成的唯一ID。
     * @return faceId
     */
    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFaceReq updateFaceReq = (UpdateFaceReq) o;
        return Objects.equals(this.externalFields, updateFaceReq.externalFields)
            && Objects.equals(this.externalImageId, updateFaceReq.externalImageId)
            && Objects.equals(this.faceId, updateFaceReq.faceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalFields, externalImageId, faceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFaceReq {\n");
        sb.append("    externalFields: ").append(toIndentedString(externalFields)).append("\n");
        sb.append("    externalImageId: ").append(toIndentedString(externalImageId)).append("\n");
        sb.append("    faceId: ").append(toIndentedString(faceId)).append("\n");
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
