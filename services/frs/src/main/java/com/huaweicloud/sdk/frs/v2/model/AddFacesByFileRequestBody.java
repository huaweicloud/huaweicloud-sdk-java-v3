package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/** AddFacesByFileRequestBody */
public class AddFacesByFileRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "image_file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart imageFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_image_id")

    private String externalImageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_fields")

    private String externalFields;

    public AddFacesByFileRequestBody withImageFile(FormDataFilePart imageFile) {
        this.imageFile = imageFile;
        return this;
    }

    /** 本地图片文件，图片不能超过8MB，建议小于1MB。上传文件时，请求格式为multipart。
     * 
     * @return imageFile */
    public FormDataFilePart getImageFile() {
        return imageFile;
    }

    public void setImageFile(FormDataFilePart imageFile) {
        this.imageFile = imageFile;
    }

    public AddFacesByFileRequestBody withExternalImageId(String externalImageId) {
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

    public AddFacesByFileRequestBody withExternalFields(String externalFields) {
        this.externalFields = externalFields;
        return this;
    }

    /** 根据用户自定义数据类型，填入相应的数值。
     * 创建faceset时定义该字段，Json字符串不校验重复性，参考[自定义字段](https://support.huaweicloud.com/api-face/face_02_0012.html)。
     * 
     * @return externalFields */
    public String getExternalFields() {
        return externalFields;
    }

    public void setExternalFields(String externalFields) {
        this.externalFields = externalFields;
    }

    public AddFacesByFileRequestBody withImageFile(InputStream inputStream, String fileName, String contentType) {
        this.imageFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public AddFacesByFileRequestBody withImageFile(InputStream inputStream, String fileName) {
        this.imageFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public AddFacesByFileRequestBody withImageFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.imageFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                put("image_file", imageFile);
                if (externalImageId != null) {
                    put("external_image_id", new FormDataPart<>(externalImageId));
                }
                if (externalFields != null) {
                    put("external_fields", new FormDataPart<>(externalFields));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddFacesByFileRequestBody addFacesByFileRequestBody = (AddFacesByFileRequestBody) o;
        return Objects.equals(this.imageFile, addFacesByFileRequestBody.imageFile)
            && Objects.equals(this.externalImageId, addFacesByFileRequestBody.externalImageId)
            && Objects.equals(this.externalFields, addFacesByFileRequestBody.externalFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageFile, externalImageId, externalFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFacesByFileRequestBody {\n");
        sb.append("    imageFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    externalImageId: ").append(toIndentedString(externalImageId)).append("\n");
        sb.append("    externalFields: ").append(toIndentedString(externalFields)).append("\n");
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
