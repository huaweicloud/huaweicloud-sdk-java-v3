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
 * ShowDocWatermarkRequestBody
 */
public class ShowDocWatermarkRequestBody implements SdkFormDataBody {

    /**
     * 待提取水印的文档类型
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

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    public ShowDocWatermarkRequestBody withDocType(DocTypeEnum docType) {
        this.docType = docType;
        return this;
    }

    /**
     * 待提取水印的文档类型
     * @return docType
     */
    public DocTypeEnum getDocType() {
        return docType;
    }

    public void setDocType(DocTypeEnum docType) {
        this.docType = docType;
    }

    public ShowDocWatermarkRequestBody withFilePassword(String filePassword) {
        this.filePassword = filePassword;
        return this;
    }

    /**
     * 解密文件的密码， 最大支持长度256。如果Office文档有读密码或域控的权限密码，请输入读密码，或者有读权限的域控密码。
     * @return filePassword
     */
    public String getFilePassword() {
        return filePassword;
    }

    public void setFilePassword(String filePassword) {
        this.filePassword = filePassword;
    }

    public ShowDocWatermarkRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * 上传要提取水印的文档
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public ShowDocWatermarkRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ShowDocWatermarkRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ShowDocWatermarkRequestBody withFile(InputStream inputStream, String fileName, Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                put("doc_type", new FormDataPart<>(docType));
                if (filePassword != null) {
                    put("file_password", new FormDataPart<>(filePassword));
                }
                put("file", file);
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
        ShowDocWatermarkRequestBody showDocWatermarkRequestBody = (ShowDocWatermarkRequestBody) o;
        return Objects.equals(this.docType, showDocWatermarkRequestBody.docType)
            && Objects.equals(this.filePassword, showDocWatermarkRequestBody.filePassword)
            && Objects.equals(this.file, showDocWatermarkRequestBody.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docType, filePassword, file);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDocWatermarkRequestBody {\n");
        sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
        sb.append("    filePassword: ").append(toIndentedString(filePassword)).append("\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
