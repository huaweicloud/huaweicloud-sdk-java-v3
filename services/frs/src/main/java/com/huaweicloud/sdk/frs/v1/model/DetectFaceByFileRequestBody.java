package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/** DetectFaceByFileRequestBody */
public class DetectFaceByFileRequestBody implements SdkFormDataBody {

    @com.fasterxml.jackson.annotation.JsonIgnore

    private FormDataFilePart imageFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private String attributes;

    public DetectFaceByFileRequestBody withImageFile(FormDataFilePart imageFile) {
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

    public DetectFaceByFileRequestBody withAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }

    /** 是否返回人脸属性，希望获取的属性列表，多个属性间使用逗号（,）隔开。目前支持的属性有： • 0：人脸姿态 • 1：性别 • 2：年龄 • 3：人脸关键点 • 4：装束（帽子、眼镜） • 5：笑脸
     * 
     * @return attributes */
    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public DetectFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName, String contentType) {
        this.imageFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public DetectFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName) {
        this.imageFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public DetectFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.imageFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                put("image_file", imageFile);
                put("attributes", new FormDataPart<>(attributes));
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
        DetectFaceByFileRequestBody detectFaceByFileRequestBody = (DetectFaceByFileRequestBody) o;
        return Objects.equals(this.imageFile, detectFaceByFileRequestBody.imageFile)
            && Objects.equals(this.attributes, detectFaceByFileRequestBody.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageFile, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectFaceByFileRequestBody {\n");
        sb.append("    imageFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
