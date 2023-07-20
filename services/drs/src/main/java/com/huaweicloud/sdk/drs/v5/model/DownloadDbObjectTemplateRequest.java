package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class DownloadDbObjectTemplateRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 请求语言类型。
     */
    public static final class XLanguageEnum {

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("en-us", EN_US);
            map.put("zh-cn", ZH_CN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    /**
     * 文件模板支持数据同步级别，不填默认为table表级。 - database：库级 - table：表级
     */
    public static final class FileImportDbLevelEnum {

        /**
         * Enum DATABASE for value: "database"
         */
        public static final FileImportDbLevelEnum DATABASE = new FileImportDbLevelEnum("database");

        /**
         * Enum TABLE for value: "table"
         */
        public static final FileImportDbLevelEnum TABLE = new FileImportDbLevelEnum("table");

        private static final Map<String, FileImportDbLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileImportDbLevelEnum> createStaticFields() {
            Map<String, FileImportDbLevelEnum> map = new HashMap<>();
            map.put("database", DATABASE);
            map.put("table", TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FileImportDbLevelEnum(String value) {
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
        public static FileImportDbLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FileImportDbLevelEnum(value));
        }

        public static FileImportDbLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FileImportDbLevelEnum) {
                return this.value.equals(((FileImportDbLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_import_db_level")

    private FileImportDbLevelEnum fileImportDbLevel;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public DownloadDbObjectTemplateRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DownloadDbObjectTemplateRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public DownloadDbObjectTemplateRequest withFileImportDbLevel(FileImportDbLevelEnum fileImportDbLevel) {
        this.fileImportDbLevel = fileImportDbLevel;
        return this;
    }

    /**
     * 文件模板支持数据同步级别，不填默认为table表级。 - database：库级 - table：表级
     * @return fileImportDbLevel
     */
    public FileImportDbLevelEnum getFileImportDbLevel() {
        return fileImportDbLevel;
    }

    public void setFileImportDbLevel(FileImportDbLevelEnum fileImportDbLevel) {
        this.fileImportDbLevel = fileImportDbLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadDbObjectTemplateRequest that = (DownloadDbObjectTemplateRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.fileImportDbLevel, that.fileImportDbLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, xLanguage, fileImportDbLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadDbObjectTemplateRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    fileImportDbLevel: ").append(toIndentedString(fileImportDbLevel)).append("\n");
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
