package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/** CreateImageWatermarkRequestBody */
public class CreateImageWatermarkRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blind_watermark")

    private String blindWatermark;

    public CreateImageWatermarkRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /** 要添加水印的图片文件，添加的图片短边尺寸需要超过512像素。
     * 
     * @return file */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public CreateImageWatermarkRequestBody withBlindWatermark(String blindWatermark) {
        this.blindWatermark = blindWatermark;
        return this;
    }

    /** 嵌入暗水印的内容，长度不超过32个字符。当前仅支持数字及英文大小写。
     * 
     * @return blindWatermark */
    public String getBlindWatermark() {
        return blindWatermark;
    }

    public void setBlindWatermark(String blindWatermark) {
        this.blindWatermark = blindWatermark;
    }

    public CreateImageWatermarkRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CreateImageWatermarkRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CreateImageWatermarkRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                put("file", file);
                put("blind_watermark", new FormDataPart<>(blindWatermark));
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
        CreateImageWatermarkRequestBody createImageWatermarkRequestBody = (CreateImageWatermarkRequestBody) o;
        return Objects.equals(this.file, createImageWatermarkRequestBody.file)
            && Objects.equals(this.blindWatermark, createImageWatermarkRequestBody.blindWatermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, blindWatermark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageWatermarkRequestBody {\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    blindWatermark: ").append(toIndentedString(blindWatermark)).append("\n");
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
