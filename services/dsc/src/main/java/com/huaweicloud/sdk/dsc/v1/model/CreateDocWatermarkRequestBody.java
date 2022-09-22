package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateDocWatermarkRequestBody
 */
public class CreateDocWatermarkRequestBody implements SdkFormDataBody {

    /**
     * 要嵌入水印的文档类型
     */
    public static final class DocTypeEnum {

        /**
         * Enum WORD for value: "WORD"
         */
        public static final DocTypeEnum WORD = new DocTypeEnum("WORD");

        /**
         * Enum EXCEL for value: "EXCEL"
         */
        public static final DocTypeEnum EXCEL = new DocTypeEnum("EXCEL");

        /**
         * Enum PDF for value: "PDF"
         */
        public static final DocTypeEnum PDF = new DocTypeEnum("PDF");

        /**
         * Enum PPT for value: "PPT"
         */
        public static final DocTypeEnum PPT = new DocTypeEnum("PPT");

        private static final Map<String, DocTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DocTypeEnum> createStaticFields() {
            Map<String, DocTypeEnum> map = new HashMap<>();
            map.put("WORD", WORD);
            map.put("EXCEL", EXCEL);
            map.put("PDF", PDF);
            map.put("PPT", PPT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DocTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DocTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DocTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DocTypeEnum(value);
            }
            return result;
        }

        public static DocTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DocTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DocTypeEnum) {
                return this.value.equals(((DocTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_type")

    private DocTypeEnum docType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_password")

    private String filePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marked_file_password")

    private String markedFilePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_password")

    private String readonlyPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible_watermark")

    private String visibleWatermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_size")

    private String fontSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation")

    private String rotation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opacity")

    private String opacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blind_watermark")

    private String blindWatermark;

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    @JsonProperty(value = "image_mark", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart imageMark;

    /**
     * 该字段为空时，默认为**TEXT**类型。  当该字段为**IMAGE**时: - 请求的表单中必须包含名为“image”的图像文件，图像格式必须为“png”或“jpg”，否则返回参数错误； - 图像文件大小不超过1MB； - “visible_watermark”，“font_size”，“rotation”和“opacity”字段无效。
     */
    public static final class VisibleTypeEnum {

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final VisibleTypeEnum TEXT = new VisibleTypeEnum("TEXT");

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final VisibleTypeEnum IMAGE = new VisibleTypeEnum("IMAGE");

        private static final Map<String, VisibleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibleTypeEnum> createStaticFields() {
            Map<String, VisibleTypeEnum> map = new HashMap<>();
            map.put("TEXT", TEXT);
            map.put("IMAGE", IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibleTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VisibleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VisibleTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VisibleTypeEnum(value);
            }
            return result;
        }

        public static VisibleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VisibleTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibleTypeEnum) {
                return this.value.equals(((VisibleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible_type")

    private VisibleTypeEnum visibleType;

    public CreateDocWatermarkRequestBody withDocType(DocTypeEnum docType) {
        this.docType = docType;
        return this;
    }

    /**
     * 要嵌入水印的文档类型
     * @return docType
     */
    public DocTypeEnum getDocType() {
        return docType;
    }

    public void setDocType(DocTypeEnum docType) {
        this.docType = docType;
    }

    public CreateDocWatermarkRequestBody withFilePassword(String filePassword) {
        this.filePassword = filePassword;
        return this;
    }

    /**
     * 输入文件有密码时，读取文件的密码， 最大支持长度256。如果Office文档有读密码或域控的权限密码，请输入读密码，或者有读权限的域控密码。
     * @return filePassword
     */
    public String getFilePassword() {
        return filePassword;
    }

    public void setFilePassword(String filePassword) {
        this.filePassword = filePassword;
    }

    public CreateDocWatermarkRequestBody withMarkedFilePassword(String markedFilePassword) {
        this.markedFilePassword = markedFilePassword;
        return this;
    }

    /**
     * 添加水印后给文件设置密码， 最大支持长度256。默认不加文档密码。
     * @return markedFilePassword
     */
    public String getMarkedFilePassword() {
        return markedFilePassword;
    }

    public void setMarkedFilePassword(String markedFilePassword) {
        this.markedFilePassword = markedFilePassword;
    }

    public CreateDocWatermarkRequestBody withReadonlyPassword(String readonlyPassword) {
        this.readonlyPassword = readonlyPassword;
        return this;
    }

    /**
     * 添加水印后给文件设置只读密码， 最大支持长度256。默认不加只读密码。
     * @return readonlyPassword
     */
    public String getReadonlyPassword() {
        return readonlyPassword;
    }

    public void setReadonlyPassword(String readonlyPassword) {
        this.readonlyPassword = readonlyPassword;
    }

    public CreateDocWatermarkRequestBody withVisibleWatermark(String visibleWatermark) {
        this.visibleWatermark = visibleWatermark;
        return this;
    }

    /**
     * 明水印内容，与“blind_watermark”字段至少有一个不为空
     * @return visibleWatermark
     */
    public String getVisibleWatermark() {
        return visibleWatermark;
    }

    public void setVisibleWatermark(String visibleWatermark) {
        this.visibleWatermark = visibleWatermark;
    }

    public CreateDocWatermarkRequestBody withFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * 明水印字体大小，取值为[1,100]，默认值50
     * @return fontSize
     */
    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public CreateDocWatermarkRequestBody withRotation(String rotation) {
        this.rotation = rotation;
        return this;
    }

    /**
     * 明水印旋转角度，逆时针方向，取值为[0,90]，默认值45
     * @return rotation
     */
    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    public CreateDocWatermarkRequestBody withOpacity(String opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * 明水印的透明度，取值[0,1]，默认值为0.3；
     * @return opacity
     */
    public String getOpacity() {
        return opacity;
    }

    public void setOpacity(String opacity) {
        this.opacity = opacity;
    }

    public CreateDocWatermarkRequestBody withBlindWatermark(String blindWatermark) {
        this.blindWatermark = blindWatermark;
        return this;
    }

    /**
     * 暗水印内容，与“visible_watermark”字段至少有一个不为空
     * @return blindWatermark
     */
    public String getBlindWatermark() {
        return blindWatermark;
    }

    public void setBlindWatermark(String blindWatermark) {
        this.blindWatermark = blindWatermark;
    }

    public CreateDocWatermarkRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * 要添加水印的文档
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public CreateDocWatermarkRequestBody withImageMark(FormDataFilePart imageMark) {
        this.imageMark = imageMark;
        return this;
    }

    /**
     * 图形水印的字节流。图形文件的格式必须为“png”或“jpg”，否则返回参数错误；图像文件大小不超过1MB；在分段的请求体“Content-Disposition”部分，参数“name”的值必须为“image_mark”。
     * @return imageMark
     */
    public FormDataFilePart getImageMark() {
        return imageMark;
    }

    public void setImageMark(FormDataFilePart imageMark) {
        this.imageMark = imageMark;
    }

    public CreateDocWatermarkRequestBody withVisibleType(VisibleTypeEnum visibleType) {
        this.visibleType = visibleType;
        return this;
    }

    /**
     * 该字段为空时，默认为**TEXT**类型。  当该字段为**IMAGE**时: - 请求的表单中必须包含名为“image”的图像文件，图像格式必须为“png”或“jpg”，否则返回参数错误； - 图像文件大小不超过1MB； - “visible_watermark”，“font_size”，“rotation”和“opacity”字段无效。
     * @return visibleType
     */
    public VisibleTypeEnum getVisibleType() {
        return visibleType;
    }

    public void setVisibleType(VisibleTypeEnum visibleType) {
        this.visibleType = visibleType;
    }

    public CreateDocWatermarkRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CreateDocWatermarkRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CreateDocWatermarkRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    public CreateDocWatermarkRequestBody withImageMark(InputStream inputStream, String fileName, String contentType) {
        this.imageMark = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CreateDocWatermarkRequestBody withImageMark(InputStream inputStream, String fileName) {
        this.imageMark = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CreateDocWatermarkRequestBody withImageMark(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.imageMark = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("doc_type", new FormDataPart<>(docType));
                if (filePassword != null) {
                    put("file_password", new FormDataPart<>(filePassword));
                }
                if (markedFilePassword != null) {
                    put("marked_file_password", new FormDataPart<>(markedFilePassword));
                }
                if (readonlyPassword != null) {
                    put("readonly_password", new FormDataPart<>(readonlyPassword));
                }
                if (visibleWatermark != null) {
                    put("visible_watermark", new FormDataPart<>(visibleWatermark));
                }
                if (fontSize != null) {
                    put("font_size", new FormDataPart<>(fontSize));
                }
                if (rotation != null) {
                    put("rotation", new FormDataPart<>(rotation));
                }
                if (opacity != null) {
                    put("opacity", new FormDataPart<>(opacity));
                }
                if (blindWatermark != null) {
                    put("blind_watermark", new FormDataPart<>(blindWatermark));
                }
                put("file", file);
                if (imageMark != null) {
                    put("image_mark", imageMark);
                }
                if (visibleType != null) {
                    put("visible_type", new FormDataPart<>(visibleType));
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
        CreateDocWatermarkRequestBody createDocWatermarkRequestBody = (CreateDocWatermarkRequestBody) o;
        return Objects.equals(this.docType, createDocWatermarkRequestBody.docType)
            && Objects.equals(this.filePassword, createDocWatermarkRequestBody.filePassword)
            && Objects.equals(this.markedFilePassword, createDocWatermarkRequestBody.markedFilePassword)
            && Objects.equals(this.readonlyPassword, createDocWatermarkRequestBody.readonlyPassword)
            && Objects.equals(this.visibleWatermark, createDocWatermarkRequestBody.visibleWatermark)
            && Objects.equals(this.fontSize, createDocWatermarkRequestBody.fontSize)
            && Objects.equals(this.rotation, createDocWatermarkRequestBody.rotation)
            && Objects.equals(this.opacity, createDocWatermarkRequestBody.opacity)
            && Objects.equals(this.blindWatermark, createDocWatermarkRequestBody.blindWatermark)
            && Objects.equals(this.file, createDocWatermarkRequestBody.file)
            && Objects.equals(this.imageMark, createDocWatermarkRequestBody.imageMark)
            && Objects.equals(this.visibleType, createDocWatermarkRequestBody.visibleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docType,
            filePassword,
            markedFilePassword,
            readonlyPassword,
            visibleWatermark,
            fontSize,
            rotation,
            opacity,
            blindWatermark,
            file,
            imageMark,
            visibleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDocWatermarkRequestBody {\n");
        sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
        sb.append("    filePassword: ").append(toIndentedString(filePassword)).append("\n");
        sb.append("    markedFilePassword: ").append(toIndentedString(markedFilePassword)).append("\n");
        sb.append("    readonlyPassword: ").append(toIndentedString(readonlyPassword)).append("\n");
        sb.append("    visibleWatermark: ").append(toIndentedString(visibleWatermark)).append("\n");
        sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
        sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
        sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
        sb.append("    blindWatermark: ").append(toIndentedString(blindWatermark)).append("\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    imageMark: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    visibleType: ").append(toIndentedString(visibleType)).append("\n");
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
