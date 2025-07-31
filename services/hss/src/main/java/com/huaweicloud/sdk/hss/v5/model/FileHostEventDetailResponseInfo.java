package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 某个服务器文件具体变更信息
 */
public class FileHostEventDetailResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    /**
     * 文件可信状态
     */
    public static final class StatusEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final StatusEnum ALL = new StatusEnum("all");

        /**
         * Enum TRUST for value: "trust"
         */
        public static final StatusEnum TRUST = new StatusEnum("trust");

        /**
         * Enum UNTRUST for value: "untrust"
         */
        public static final StatusEnum UNTRUST = new StatusEnum("untrust");

        /**
         * Enum UNKNOWN for value: "unknown"
         */
        public static final StatusEnum UNKNOWN = new StatusEnum("unknown");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("trust", TRUST);
            map.put("untrust", UNTRUST);
            map.put("unknown", UNKNOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * 变更类型
     */
    public static final class ChangeTypeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final ChangeTypeEnum ALL = new ChangeTypeEnum("all");

        /**
         * Enum REGISTRY for value: "registry"
         */
        public static final ChangeTypeEnum REGISTRY = new ChangeTypeEnum("registry");

        /**
         * Enum FILE for value: "file"
         */
        public static final ChangeTypeEnum FILE = new ChangeTypeEnum("file");

        private static final Map<String, ChangeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChangeTypeEnum> createStaticFields() {
            Map<String, ChangeTypeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("registry", REGISTRY);
            map.put("file", FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChangeTypeEnum(String value) {
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
        public static ChangeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChangeTypeEnum(value));
        }

        public static ChangeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChangeTypeEnum) {
                return this.value.equals(((ChangeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private ChangeTypeEnum changeType;

    /**
     * 变更类别
     */
    public static final class ChangeCategoryEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final ChangeCategoryEnum ALL = new ChangeCategoryEnum("all");

        /**
         * Enum MODIFY for value: "modify"
         */
        public static final ChangeCategoryEnum MODIFY = new ChangeCategoryEnum("modify");

        /**
         * Enum ADD for value: "add"
         */
        public static final ChangeCategoryEnum ADD = new ChangeCategoryEnum("add");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final ChangeCategoryEnum DELETE = new ChangeCategoryEnum("delete");

        private static final Map<String, ChangeCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChangeCategoryEnum> createStaticFields() {
            Map<String, ChangeCategoryEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("modify", MODIFY);
            map.put("add", ADD);
            map.put("delete", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChangeCategoryEnum(String value) {
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
        public static ChangeCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChangeCategoryEnum(value));
        }

        public static ChangeCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChangeCategoryEnum) {
                return this.value.equals(((ChangeCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_category")

    private ChangeCategoryEnum changeCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_change")

    private String afterChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_change")

    private String beforeChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_time")

    private Long latestTime;

    public FileHostEventDetailResponseInfo withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FileHostEventDetailResponseInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileHostEventDetailResponseInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public FileHostEventDetailResponseInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 文件可信状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public FileHostEventDetailResponseInfo withChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 变更类型
     * @return changeType
     */
    public ChangeTypeEnum getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
    }

    public FileHostEventDetailResponseInfo withChangeCategory(ChangeCategoryEnum changeCategory) {
        this.changeCategory = changeCategory;
        return this;
    }

    /**
     * 变更类别
     * @return changeCategory
     */
    public ChangeCategoryEnum getChangeCategory() {
        return changeCategory;
    }

    public void setChangeCategory(ChangeCategoryEnum changeCategory) {
        this.changeCategory = changeCategory;
    }

    public FileHostEventDetailResponseInfo withAfterChange(String afterChange) {
        this.afterChange = afterChange;
        return this;
    }

    /**
     * modified hash
     * @return afterChange
     */
    public String getAfterChange() {
        return afterChange;
    }

    public void setAfterChange(String afterChange) {
        this.afterChange = afterChange;
    }

    public FileHostEventDetailResponseInfo withBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange;
        return this;
    }

    /**
     * hash
     * @return beforeChange
     */
    public String getBeforeChange() {
        return beforeChange;
    }

    public void setBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange;
    }

    public FileHostEventDetailResponseInfo withLatestTime(Long latestTime) {
        this.latestTime = latestTime;
        return this;
    }

    /**
     * 最后变更时间
     * minimum: 1609430400000
     * maximum: 2147483647000
     * @return latestTime
     */
    public Long getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Long latestTime) {
        this.latestTime = latestTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileHostEventDetailResponseInfo that = (FileHostEventDetailResponseInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.status, that.status)
            && Objects.equals(this.changeType, that.changeType)
            && Objects.equals(this.changeCategory, that.changeCategory)
            && Objects.equals(this.afterChange, that.afterChange)
            && Objects.equals(this.beforeChange, that.beforeChange) && Objects.equals(this.latestTime, that.latestTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, fileName, filePath, status, changeType, changeCategory, afterChange, beforeChange, latestTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileHostEventDetailResponseInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    changeCategory: ").append(toIndentedString(changeCategory)).append("\n");
        sb.append("    afterChange: ").append(toIndentedString(afterChange)).append("\n");
        sb.append("    beforeChange: ").append(toIndentedString(beforeChange)).append("\n");
        sb.append("    latestTime: ").append(toIndentedString(latestTime)).append("\n");
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
