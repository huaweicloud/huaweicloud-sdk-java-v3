package com.huaweicloud.sdk.das.v3.model;

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
public class ListFullSqlTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_left")

    private Long rangeLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_right")

    private Long rangeRight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at_left")

    private Long createAtLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at_right")

    private Long createAtRight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private String threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id")

    private String trxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

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

    public ListFullSqlTasksRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListFullSqlTasksRequest withRangeLeft(Long rangeLeft) {
        this.rangeLeft = rangeLeft;
        return this;
    }

    /**
     * 最小任务起止时间（Unix timestamp），单位：毫秒。
     * @return rangeLeft
     */
    public Long getRangeLeft() {
        return rangeLeft;
    }

    public void setRangeLeft(Long rangeLeft) {
        this.rangeLeft = rangeLeft;
    }

    public ListFullSqlTasksRequest withRangeRight(Long rangeRight) {
        this.rangeRight = rangeRight;
        return this;
    }

    /**
     * 最大任务起止时间（Unix timestamp），单位：毫秒。
     * @return rangeRight
     */
    public Long getRangeRight() {
        return rangeRight;
    }

    public void setRangeRight(Long rangeRight) {
        this.rangeRight = rangeRight;
    }

    public ListFullSqlTasksRequest withCreateAtLeft(Long createAtLeft) {
        this.createAtLeft = createAtLeft;
        return this;
    }

    /**
     * 最小任务创建时间（Unix timestamp），单位：毫秒。
     * @return createAtLeft
     */
    public Long getCreateAtLeft() {
        return createAtLeft;
    }

    public void setCreateAtLeft(Long createAtLeft) {
        this.createAtLeft = createAtLeft;
    }

    public ListFullSqlTasksRequest withCreateAtRight(Long createAtRight) {
        this.createAtRight = createAtRight;
        return this;
    }

    /**
     * 最大任务创建时间（Unix timestamp），单位：毫秒。
     * @return createAtRight
     */
    public Long getCreateAtRight() {
        return createAtRight;
    }

    public void setCreateAtRight(Long createAtRight) {
        this.createAtRight = createAtRight;
    }

    public ListFullSqlTasksRequest withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ListFullSqlTasksRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListFullSqlTasksRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListFullSqlTasksRequest withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作类型。
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ListFullSqlTasksRequest withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程ID。
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public ListFullSqlTasksRequest withTrxId(String trxId) {
        this.trxId = trxId;
        return this;
    }

    /**
     * 事务ID。
     * @return trxId
     */
    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public ListFullSqlTasksRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行状态（0:成功，1:失败）。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListFullSqlTasksRequest withSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
        return this;
    }

    /**
     * SQL模板ID。
     * @return sqlTemplateId
     */
    public String getSqlTemplateId() {
        return sqlTemplateId;
    }

    public void setSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
    }

    public ListFullSqlTasksRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段（create_at:任务创建时间, range_start_at,range_end_at:任务起止时间）。
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ListFullSqlTasksRequest withAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }

    /**
     * 排序顺序（true:正序, false:逆序）。
     * @return asc
     */
    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public ListFullSqlTasksRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 页码。
     * minimum: 1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListFullSqlTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数。最大为100。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFullSqlTasksRequest withXLanguage(XLanguageEnum xLanguage) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFullSqlTasksRequest that = (ListFullSqlTasksRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.rangeLeft, that.rangeLeft)
            && Objects.equals(this.rangeRight, that.rangeRight) && Objects.equals(this.createAtLeft, that.createAtLeft)
            && Objects.equals(this.createAtRight, that.createAtRight) && Objects.equals(this.user, that.user)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.threadId, that.threadId)
            && Objects.equals(this.trxId, that.trxId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.sqlTemplateId, that.sqlTemplateId) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.asc, that.asc) && Objects.equals(this.page, that.page)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.xLanguage, that.xLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            rangeLeft,
            rangeRight,
            createAtLeft,
            createAtRight,
            user,
            keyword,
            dbName,
            operation,
            threadId,
            trxId,
            status,
            sqlTemplateId,
            sortField,
            asc,
            page,
            limit,
            xLanguage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFullSqlTasksRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    rangeLeft: ").append(toIndentedString(rangeLeft)).append("\n");
        sb.append("    rangeRight: ").append(toIndentedString(rangeRight)).append("\n");
        sb.append("    createAtLeft: ").append(toIndentedString(createAtLeft)).append("\n");
        sb.append("    createAtRight: ").append(toIndentedString(createAtRight)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    trxId: ").append(toIndentedString(trxId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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
