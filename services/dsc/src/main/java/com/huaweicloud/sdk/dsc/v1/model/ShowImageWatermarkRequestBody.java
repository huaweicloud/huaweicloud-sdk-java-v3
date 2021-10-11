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

/** ShowImageWatermarkRequestBody */
public class ShowImageWatermarkRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mark_len")

    private String markLen;

    public ShowImageWatermarkRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /** 待提取暗水印的图片文件。
     * 
     * @return file */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public ShowImageWatermarkRequestBody withMarkLen(String markLen) {
        this.markLen = markLen;
        return this;
    }

    /** 指定待提取水印的长度，mark_len长度大于0，小于32。设置后可以提升水印提取性能
     * 
     * @return markLen */
    public String getMarkLen() {
        return markLen;
    }

    public void setMarkLen(String markLen) {
        this.markLen = markLen;
    }

    public ShowImageWatermarkRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ShowImageWatermarkRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ShowImageWatermarkRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                put("file", file);
                if (markLen != null) {
                    put("mark_len", new FormDataPart<>(markLen));
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
        ShowImageWatermarkRequestBody showImageWatermarkRequestBody = (ShowImageWatermarkRequestBody) o;
        return Objects.equals(this.file, showImageWatermarkRequestBody.file)
            && Objects.equals(this.markLen, showImageWatermarkRequestBody.markLen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, markLen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageWatermarkRequestBody {\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    markLen: ").append(toIndentedString(markLen)).append("\n");
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
