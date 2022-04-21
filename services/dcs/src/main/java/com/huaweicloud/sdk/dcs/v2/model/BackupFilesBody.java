package com.huaweicloud.sdk.dcs.v2.model;

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
 * 备份文件列表的结构体
 */
public class BackupFilesBody {

    /**
     * 数据来源，当前仅支持OBS桶方式，取值为：self_build_obs。
     */
    public static final class FileSourceEnum {

        /**
         * Enum SELF_BUILD_OBS for value: "self_build_obs"
         */
        public static final FileSourceEnum SELF_BUILD_OBS = new FileSourceEnum("self_build_obs");

        private static final Map<String, FileSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileSourceEnum> createStaticFields() {
            Map<String, FileSourceEnum> map = new HashMap<>();
            map.put("self_build_obs", SELF_BUILD_OBS);
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
            FileSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FileSourceEnum(value);
            }
            return result;
        }

        public static FileSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FileSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    private List<Files> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    public BackupFilesBody withFileSource(FileSourceEnum fileSource) {
        this.fileSource = fileSource;
        return this;
    }

    /**
     * 数据来源，当前仅支持OBS桶方式，取值为：self_build_obs。
     * @return fileSource
     */
    public FileSourceEnum getFileSource() {
        return fileSource;
    }

    public void setFileSource(FileSourceEnum fileSource) {
        this.fileSource = fileSource;
    }

    public BackupFilesBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public BackupFilesBody withFiles(List<Files> files) {
        this.files = files;
        return this;
    }

    public BackupFilesBody addFilesItem(Files filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public BackupFilesBody withFiles(Consumer<List<Files>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 导入的备份文件文件列表。
     * @return files
     */
    public List<Files> getFiles() {
        return files;
    }

    public void setFiles(List<Files> files) {
        this.files = files;
    }

    public BackupFilesBody withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份记录ID，数据来源为备份记录时必须填写
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupFilesBody backupFilesBody = (BackupFilesBody) o;
        return Objects.equals(this.fileSource, backupFilesBody.fileSource)
            && Objects.equals(this.bucketName, backupFilesBody.bucketName)
            && Objects.equals(this.files, backupFilesBody.files)
            && Objects.equals(this.backupId, backupFilesBody.backupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSource, bucketName, files, backupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupFilesBody {\n");
        sb.append("    fileSource: ").append(toIndentedString(fileSource)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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
