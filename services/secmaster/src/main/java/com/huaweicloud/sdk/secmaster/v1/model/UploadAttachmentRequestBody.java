package com.huaweicloud.sdk.secmaster.v1.model;

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
 * UploadAttachmentRequestBody
 */
public class UploadAttachmentRequestBody implements SdkFormDataBody {

    /**
     * 固定枚举，当前仅支持user_task/用户任务
     */
    public static final class FileTypeEnum {

        /**
         * Enum USER_TASK for value: "user_task"
         */
        public static final FileTypeEnum USER_TASK = new FileTypeEnum("user_task");

        private static final Map<String, FileTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileTypeEnum> createStaticFields() {
            Map<String, FileTypeEnum> map = new HashMap<>();
            map.put("user_task", USER_TASK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FileTypeEnum(String value) {
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
        public static FileTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FileTypeEnum(value));
        }

        public static FileTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FileTypeEnum) {
                return this.value.equals(((FileTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileType")

    private FileTypeEnum fileType;

    @JsonProperty(value = "uploadFile", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart uploadFile;

    public UploadAttachmentRequestBody withFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 固定枚举，当前仅支持user_task/用户任务
     * @return fileType
     */
    public FileTypeEnum getFileType() {
        return fileType;
    }

    public void setFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
    }

    public UploadAttachmentRequestBody withUploadFile(FormDataFilePart uploadFile) {
        this.uploadFile = uploadFile;
        return this;
    }

    /**
     * 导入的流程文件
     * @return uploadFile
     */
    public FormDataFilePart getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(FormDataFilePart uploadFile) {
        this.uploadFile = uploadFile;
    }

    public UploadAttachmentRequestBody withUploadFile(InputStream inputStream, String fileName, String contentType) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UploadAttachmentRequestBody withUploadFile(InputStream inputStream, String fileName) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UploadAttachmentRequestBody withUploadFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (fileType != null) {
                    put("fileType", new FormDataPart<>(fileType));
                }
                put("uploadFile", uploadFile);
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadAttachmentRequestBody that = (UploadAttachmentRequestBody) obj;
        return Objects.equals(this.fileType, that.fileType) && Objects.equals(this.uploadFile, that.uploadFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileType, uploadFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAttachmentRequestBody {\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    uploadFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
