package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份文件信息。
 */
public class BackupInfo {

    /**
     * 备份文件来源：（全部大写） - OBS：存放在OBS中的备份文件。 - RDS：RDS实例的备份文件。
     */
    public static final class FileSourceEnum {

        /**
         * Enum OBS for value: "OBS"
         */
        public static final FileSourceEnum OBS = new FileSourceEnum("OBS");

        /**
         * Enum RDS for value: "RDS"
         */
        public static final FileSourceEnum RDS = new FileSourceEnum("RDS");

        private static final Map<String, FileSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileSourceEnum> createStaticFields() {
            Map<String, FileSourceEnum> map = new HashMap<>();
            map.put("OBS", OBS);
            map.put("RDS", RDS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FileSourceEnum(String value) {
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
        public static FileSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FileSourceEnum(value));
        }

        public static FileSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FileSourceEnum) {
                return this.value.equals(((FileSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_source")

    private FileSourceEnum fileSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<BackupFileInfo> files = null;

    public BackupInfo withFileSource(FileSourceEnum fileSource) {
        this.fileSource = fileSource;
        return this;
    }

    /**
     * 备份文件来源：（全部大写） - OBS：存放在OBS中的备份文件。 - RDS：RDS实例的备份文件。
     * @return fileSource
     */
    public FileSourceEnum getFileSource() {
        return fileSource;
    }

    public void setFileSource(FileSourceEnum fileSource) {
        this.fileSource = fileSource;
    }

    public BackupInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名称，使用OBS桶备份文件恢复时必填。 约束：长度范围为3～63个字符，仅支持小写字母、数字、中划线（-）、点（.），且只能以字母或数字开头和结尾，禁止使用IP地址。 如果选择从OBS桶获取备份文件必填，参考登录[客户端登录](https://support.huaweicloud.com/clientogw-obs/zh-cn_topic_0045829058.html)OBS Browser客户端，首页为OBS桶列表，可以获取到备份文件所在桶的名称。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public BackupInfo withFiles(List<BackupFileInfo> files) {
        this.files = files;
        return this;
    }

    public BackupInfo addFilesItem(BackupFileInfo filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public BackupInfo withFiles(Consumer<List<BackupFileInfo>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 备份文件信息列表。
     * @return files
     */
    public List<BackupFileInfo> getFiles() {
        return files;
    }

    public void setFiles(List<BackupFileInfo> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupInfo that = (BackupInfo) obj;
        return Objects.equals(this.fileSource, that.fileSource) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSource, bucketName, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupInfo {\n");
        sb.append("    fileSource: ").append(toIndentedString(fileSource)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
