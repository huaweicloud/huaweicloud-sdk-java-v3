package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TaskLogFile
 */
public class TaskLogFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    /**
     * 文件类型: - DIRECTORY：目录 - FILE：文件
     */
    public static final class FileTypeEnum {

        /**
         * Enum DIRECTORY for value: "DIRECTORY"
         */
        public static final FileTypeEnum DIRECTORY = new FileTypeEnum("DIRECTORY");

        /**
         * Enum FILE for value: "FILE"
         */
        public static final FileTypeEnum FILE = new FileTypeEnum("FILE");

        private static final Map<String, FileTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileTypeEnum> createStaticFields() {
            Map<String, FileTypeEnum> map = new HashMap<>();
            map.put("DIRECTORY", DIRECTORY);
            map.put("FILE", FILE);
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
    @JsonProperty(value = "file_type")

    private FileTypeEnum fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    public TaskLogFile withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public TaskLogFile withFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型: - DIRECTORY：目录 - FILE：文件
     * @return fileType
     */
    public FileTypeEnum getFileType() {
        return fileType;
    }

    public void setFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
    }

    public TaskLogFile withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小，单位字节。
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public TaskLogFile withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 文件显示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskLogFile that = (TaskLogFile) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.displayName, that.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileType, fileSize, displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskLogFile {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
