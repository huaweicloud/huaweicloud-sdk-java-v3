package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowJobDetailRequest {

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
     * 任务详情类型。取值： - overview：任务概览信息。 - detail：任务基本信息。 - network：测试连接结果信息，需配合query_id参数一起查询。 - precheck：预检查结果信息，需配合query_id参数一起查询。 - progress：任务进度信息。 - log：任务日志信息，支持分页查询参数offset与limit。 - comapre：查询对比任务。 - file：对象导入信息
     */
    public static final class TypeEnum {

        /**
         * Enum OVERVIEW for value: "overview"
         */
        public static final TypeEnum OVERVIEW = new TypeEnum("overview");

        /**
         * Enum DETAIL for value: "detail"
         */
        public static final TypeEnum DETAIL = new TypeEnum("detail");

        /**
         * Enum NETWORK for value: "network"
         */
        public static final TypeEnum NETWORK = new TypeEnum("network");

        /**
         * Enum PRECHECK for value: "precheck"
         */
        public static final TypeEnum PRECHECK = new TypeEnum("precheck");

        /**
         * Enum PROGRESS for value: "progress"
         */
        public static final TypeEnum PROGRESS = new TypeEnum("progress");

        /**
         * Enum LOG for value: "log"
         */
        public static final TypeEnum LOG = new TypeEnum("log");

        /**
         * Enum COMAPRE for value: "comapre"
         */
        public static final TypeEnum COMAPRE = new TypeEnum("comapre");

        /**
         * Enum FILE for value: "file"
         */
        public static final TypeEnum FILE = new TypeEnum("file");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("overview", OVERVIEW);
            map.put("detail", DETAIL);
            map.put("network", NETWORK);
            map.put("precheck", PRECHECK);
            map.put("progress", PROGRESS);
            map.put("log", LOG);
            map.put("comapre", COMAPRE);
            map.put("file", FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 对比任务类型 - object_compare：对象对比。 - line_compare：行对比。 - content_compare：内容对比。 - data_compare：数据对比。
     */
    public static final class CompareTypeEnum {

        /**
         * Enum OBJECT_COMPARE for value: "object_compare"
         */
        public static final CompareTypeEnum OBJECT_COMPARE = new CompareTypeEnum("object_compare");

        /**
         * Enum LINE_COMPARE for value: "line_compare"
         */
        public static final CompareTypeEnum LINE_COMPARE = new CompareTypeEnum("line_compare");

        /**
         * Enum CONTENT_COMPARE for value: "content_compare"
         */
        public static final CompareTypeEnum CONTENT_COMPARE = new CompareTypeEnum("content_compare");

        /**
         * Enum DATA_COMPARE for value: "data_compare"
         */
        public static final CompareTypeEnum DATA_COMPARE = new CompareTypeEnum("data_compare");

        private static final Map<String, CompareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompareTypeEnum> createStaticFields() {
            Map<String, CompareTypeEnum> map = new HashMap<>();
            map.put("object_compare", OBJECT_COMPARE);
            map.put("line_compare", LINE_COMPARE);
            map.put("content_compare", CONTENT_COMPARE);
            map.put("data_compare", DATA_COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompareTypeEnum(String value) {
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
        public static CompareTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CompareTypeEnum(value));
        }

        public static CompareTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompareTypeEnum) {
                return this.value.equals(((CompareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private CompareTypeEnum compareType;

    /**
     * 查询对比内容。取值： - overview：对比任务概览。 - list：数据对比任务列表。 - detail：对比详情。
     */
    public static final class QueryTypeEnum {

        /**
         * Enum OVERVIEW for value: "overview"
         */
        public static final QueryTypeEnum OVERVIEW = new QueryTypeEnum("overview");

        /**
         * Enum LIST for value: "list"
         */
        public static final QueryTypeEnum LIST = new QueryTypeEnum("list");

        /**
         * Enum DETAIL for value: "detail"
         */
        public static final QueryTypeEnum DETAIL = new QueryTypeEnum("detail");

        private static final Map<String, QueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryTypeEnum> createStaticFields() {
            Map<String, QueryTypeEnum> map = new HashMap<>();
            map.put("overview", OVERVIEW);
            map.put("list", LIST);
            map.put("detail", DETAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueryTypeEnum(String value) {
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
        public static QueryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryTypeEnum(value));
        }

        public static QueryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryTypeEnum) {
                return this.value.equals(((QueryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private QueryTypeEnum queryType;

    /**
     * 查询对象对比详情类型。取值： - DB：库级对比详情。 - TABLE：表级对比详情。 - INDEX：索引对比详情。
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum DB for value: "DB"
         */
        public static final ObjectTypeEnum DB = new ObjectTypeEnum("DB");

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final ObjectTypeEnum TABLE = new ObjectTypeEnum("TABLE");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final ObjectTypeEnum INDEX = new ObjectTypeEnum("INDEX");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("DB", DB);
            map.put("TABLE", TABLE);
            map.put("INDEX", INDEX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectTypeEnum(String value) {
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
        public static ObjectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObjectTypeEnum(value));
        }

        public static ObjectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectTypeEnum) {
                return this.value.equals(((ObjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private ObjectTypeEnum objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_id")

    private String compareTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_name")

    private String sourceDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_name")

    private String targetDbName;

    /**
     * 对比结果类型。取值： - compare：对比完成。 - uncompare：无法对比。
     */
    public static final class CompareDetailTypeEnum {

        /**
         * Enum COMPARE for value: "compare"
         */
        public static final CompareDetailTypeEnum COMPARE = new CompareDetailTypeEnum("compare");

        /**
         * Enum UNCOMPARE for value: "uncompare"
         */
        public static final CompareDetailTypeEnum UNCOMPARE = new CompareDetailTypeEnum("uncompare");

        private static final Map<String, CompareDetailTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompareDetailTypeEnum> createStaticFields() {
            Map<String, CompareDetailTypeEnum> map = new HashMap<>();
            map.put("compare", COMPARE);
            map.put("uncompare", UNCOMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompareDetailTypeEnum(String value) {
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
        public static CompareDetailTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CompareDetailTypeEnum(value));
        }

        public static CompareDetailTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompareDetailTypeEnum) {
                return this.value.equals(((CompareDetailTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_detail_type")

    private CompareDetailTypeEnum compareDetailType;

    public ShowJobDetailRequest withJobId(String jobId) {
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

    public ShowJobDetailRequest withXLanguage(XLanguageEnum xLanguage) {
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

    public ShowJobDetailRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 任务详情类型。取值： - overview：任务概览信息。 - detail：任务基本信息。 - network：测试连接结果信息，需配合query_id参数一起查询。 - precheck：预检查结果信息，需配合query_id参数一起查询。 - progress：任务进度信息。 - log：任务日志信息，支持分页查询参数offset与limit。 - comapre：查询对比任务。 - file：对象导入信息
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowJobDetailRequest withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * 通过指定Query ID查询任务详情。  说明：部分type类型的任务详情，需要通过触发该操作的请求返回的query_id进行操作结果查询。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public ShowJobDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示查询该偏移量后面的记录。  说明：部分type类型的任务详情支持分页查询，可以通过传递该参数进行分页控制。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowJobDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回记录的数量限制。  说明：部分type类型的任务详情支持分页查询，可以通过传递该参数进行分页控制。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowJobDetailRequest withCompareType(CompareTypeEnum compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * 对比任务类型 - object_compare：对象对比。 - line_compare：行对比。 - content_compare：内容对比。 - data_compare：数据对比。
     * @return compareType
     */
    public CompareTypeEnum getCompareType() {
        return compareType;
    }

    public void setCompareType(CompareTypeEnum compareType) {
        this.compareType = compareType;
    }

    public ShowJobDetailRequest withQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询对比内容。取值： - overview：对比任务概览。 - list：数据对比任务列表。 - detail：对比详情。
     * @return queryType
     */
    public QueryTypeEnum getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
    }

    public ShowJobDetailRequest withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 查询对象对比详情类型。取值： - DB：库级对比详情。 - TABLE：表级对比详情。 - INDEX：索引对比详情。
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public ShowJobDetailRequest withCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
        return this;
    }

    /**
     * 对比任务ID。
     * @return compareTaskId
     */
    public String getCompareTaskId() {
        return compareTaskId;
    }

    public void setCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
    }

    public ShowJobDetailRequest withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    /**
     * 数据对比源库名称。
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public ShowJobDetailRequest withTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
        return this;
    }

    /**
     * 数据对比目标库名称。
     * @return targetDbName
     */
    public String getTargetDbName() {
        return targetDbName;
    }

    public void setTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
    }

    public ShowJobDetailRequest withCompareDetailType(CompareDetailTypeEnum compareDetailType) {
        this.compareDetailType = compareDetailType;
        return this;
    }

    /**
     * 对比结果类型。取值： - compare：对比完成。 - uncompare：无法对比。
     * @return compareDetailType
     */
    public CompareDetailTypeEnum getCompareDetailType() {
        return compareDetailType;
    }

    public void setCompareDetailType(CompareDetailTypeEnum compareDetailType) {
        this.compareDetailType = compareDetailType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobDetailRequest that = (ShowJobDetailRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.type, that.type) && Objects.equals(this.queryId, that.queryId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.compareType, that.compareType) && Objects.equals(this.queryType, that.queryType)
            && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.compareTaskId, that.compareTaskId)
            && Objects.equals(this.sourceDbName, that.sourceDbName)
            && Objects.equals(this.targetDbName, that.targetDbName)
            && Objects.equals(this.compareDetailType, that.compareDetailType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            xLanguage,
            type,
            queryId,
            offset,
            limit,
            compareType,
            queryType,
            objectType,
            compareTaskId,
            sourceDbName,
            targetDbName,
            compareDetailType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobDetailRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    compareTaskId: ").append(toIndentedString(compareTaskId)).append("\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    targetDbName: ").append(toIndentedString(targetDbName)).append("\n");
        sb.append("    compareDetailType: ").append(toIndentedString(compareDetailType)).append("\n");
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
