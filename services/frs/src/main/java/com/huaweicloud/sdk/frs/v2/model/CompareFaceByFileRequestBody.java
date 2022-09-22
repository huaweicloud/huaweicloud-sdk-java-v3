package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CompareFaceByFileRequestBody
 */
public class CompareFaceByFileRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "image1_file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart image1File;

    @JsonProperty(value = "image2_file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart image2File;

    public CompareFaceByFileRequestBody withImage1File(FormDataFilePart image1File) {
        this.image1File = image1File;
        return this;
    }

    /**
     * 本地图片文件，图片不能超过8MB。上传文件时，请求格式为multipart。
     * @return image1File
     */
    public FormDataFilePart getImage1File() {
        return image1File;
    }

    public void setImage1File(FormDataFilePart image1File) {
        this.image1File = image1File;
    }

    public CompareFaceByFileRequestBody withImage2File(FormDataFilePart image2File) {
        this.image2File = image2File;
        return this;
    }

    /**
     * 本地图片文件，图片不能超过8MB。上传文件时，请求格式为multipart。
     * @return image2File
     */
    public FormDataFilePart getImage2File() {
        return image2File;
    }

    public void setImage2File(FormDataFilePart image2File) {
        this.image2File = image2File;
    }

    public CompareFaceByFileRequestBody withImage1File(InputStream inputStream, String fileName, String contentType) {
        this.image1File = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CompareFaceByFileRequestBody withImage1File(InputStream inputStream, String fileName) {
        this.image1File = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CompareFaceByFileRequestBody withImage1File(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.image1File = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    public CompareFaceByFileRequestBody withImage2File(InputStream inputStream, String fileName, String contentType) {
        this.image2File = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CompareFaceByFileRequestBody withImage2File(InputStream inputStream, String fileName) {
        this.image2File = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CompareFaceByFileRequestBody withImage2File(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.image2File = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("image1_file", image1File);
                put("image2_file", image2File);
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
        CompareFaceByFileRequestBody compareFaceByFileRequestBody = (CompareFaceByFileRequestBody) o;
        return Objects.equals(this.image1File, compareFaceByFileRequestBody.image1File)
            && Objects.equals(this.image2File, compareFaceByFileRequestBody.image2File);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image1File, image2File);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareFaceByFileRequestBody {\n");
        sb.append("    image1File: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    image2File: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
