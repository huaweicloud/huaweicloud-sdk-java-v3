package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListObejectLevelCompareDetailRequest {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private String compareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_job_id")

    private String compareJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListObejectLevelCompareDetailRequest withXLanguage(XLanguageEnum xLanguage) {
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

    public ListObejectLevelCompareDetailRequest withJobId(String jobId) {
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

    public ListObejectLevelCompareDetailRequest withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * 对象类型： - DB：数据库。 - TABLE：表。 - VIEW：视图。 - EVENT：事件。 - ROUTINE：存储过程和函数。 - INDEX：索引。 - TRIGGER：触发器。 - SYNONYM：同义词。 - FUNCTION：函数。 - PROCEDURE：存储过程。 - TYPE：自定义类型。 - RULE：规则。 - DEFAULT_TYPE：缺省值。 - PLAN_GUIDE：执行计划。 - CONSTRAINT：约束。 - FILE_GROUP：文件组。 - PARTITION_FUNCTION：分区函数。 - PARTITION_SCHEME：分区方案。 - TABLE_COLLATION：表的排序规则。
     * @return compareType
     */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public ListObejectLevelCompareDetailRequest withCompareJobId(String compareJobId) {
        this.compareJobId = compareJobId;
        return this;
    }

    /**
     * 对比任务ID，不填写时默认返回最新的对比任务信息。
     * @return compareJobId
     */
    public String getCompareJobId() {
        return compareJobId;
    }

    public void setCompareJobId(String compareJobId) {
        this.compareJobId = compareJobId;
    }

    public ListObejectLevelCompareDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，最大值1000。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListObejectLevelCompareDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询， offset大于等于0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListObejectLevelCompareDetailRequest that = (ListObejectLevelCompareDetailRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.compareType, that.compareType)
            && Objects.equals(this.compareJobId, that.compareJobId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, jobId, compareType, compareJobId, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObejectLevelCompareDetailRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    compareJobId: ").append(toIndentedString(compareJobId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
