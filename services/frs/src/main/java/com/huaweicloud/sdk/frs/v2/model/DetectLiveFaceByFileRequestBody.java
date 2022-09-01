package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DetectLiveFaceByFileRequestBody
 */
public class DetectLiveFaceByFileRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "image_file", access = JsonProperty.Access.WRITE_ONLY)
    @JacksonXmlProperty(localName = "image_file")

    private FormDataFilePart imageFile;

    public DetectLiveFaceByFileRequestBody withImageFile(FormDataFilePart imageFile) {
        this.imageFile = imageFile;
        return this;
    }

    /**
     * 本地图片文件。上传文件时，请求格式为multipart。
     * @return imageFile
     */
    public FormDataFilePart getImageFile() {
        return imageFile;
    }

    public void setImageFile(FormDataFilePart imageFile) {
        this.imageFile = imageFile;
    }

    public DetectLiveFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName, String contentType) {
        this.imageFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public DetectLiveFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName) {
        this.imageFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public DetectLiveFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.imageFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                put("image_file", imageFile);
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
        DetectLiveFaceByFileRequestBody detectLiveFaceByFileRequestBody = (DetectLiveFaceByFileRequestBody) o;
        return Objects.equals(this.imageFile, detectLiveFaceByFileRequestBody.imageFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLiveFaceByFileRequestBody {\n");
        sb.append("    imageFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
