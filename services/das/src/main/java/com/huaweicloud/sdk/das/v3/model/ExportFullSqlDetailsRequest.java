package com.huaweicloud.sdk.das.v3.model;

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
 * Request Object
 */
public class ExportFullSqlDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private List<Long> taskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuzzy")

    private String fuzzy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private String userList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_list")

    private String dbList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private String operationList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip_list")

    private String clientIpList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id_list")

    private String threadIdList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id_list")

    private String trxIdList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id_list")

    private String sessionIdList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private String statusList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_ids")

    private String sqlTemplateIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_min")

    private Double costMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_max")

    private Double costMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_min")

    private Long scanMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_max")

    private Long scanMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_min")

    private Long affectMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_max")

    private Long affectMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_min")

    private Long returnMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_max")

    private Long returnMax;

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

    public ExportFullSqlDetailsRequest withInstanceId(String instanceId) {
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

    public ExportFullSqlDetailsRequest withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间（Unix timestamp），单位：毫秒。
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ExportFullSqlDetailsRequest withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间（Unix timestamp），单位：毫秒。
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ExportFullSqlDetailsRequest withTaskIds(List<Long> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public ExportFullSqlDetailsRequest addTaskIdsItem(Long taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public ExportFullSqlDetailsRequest withTaskIds(Consumer<List<Long>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * SQL洞察任务ID列表，时间范围大于1天的SQL洞察任务后台将拆分为多个任务解析，该场景支持多任务过滤导出。
     * @return taskIds
     */
    public List<Long> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<Long> taskIds) {
        this.taskIds = taskIds;
    }

    public ExportFullSqlDetailsRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ExportFullSqlDetailsRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字（可组合，用逗号分隔）。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ExportFullSqlDetailsRequest withFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }

    /**
     * 是否模糊匹配。
     * @return fuzzy
     */
    public String getFuzzy() {
        return fuzzy;
    }

    public void setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
    }

    public ExportFullSqlDetailsRequest withUserList(String userList) {
        this.userList = userList;
        return this;
    }

    /**
     * 用户名（可组合，用空格分隔）。
     * @return userList
     */
    public String getUserList() {
        return userList;
    }

    public void setUserList(String userList) {
        this.userList = userList;
    }

    public ExportFullSqlDetailsRequest withDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }

    /**
     * 数据库（可组合，用空格分隔）。
     * @return dbList
     */
    public String getDbList() {
        return dbList;
    }

    public void setDbList(String dbList) {
        this.dbList = dbList;
    }

    public ExportFullSqlDetailsRequest withOperationList(String operationList) {
        this.operationList = operationList;
        return this;
    }

    /**
     * 操作类型（可组合，用空格分隔）。
     * @return operationList
     */
    public String getOperationList() {
        return operationList;
    }

    public void setOperationList(String operationList) {
        this.operationList = operationList;
    }

    public ExportFullSqlDetailsRequest withClientIpList(String clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }

    /**
     * 客户端IP（可组合，用空格分隔）。
     * @return clientIpList
     */
    public String getClientIpList() {
        return clientIpList;
    }

    public void setClientIpList(String clientIpList) {
        this.clientIpList = clientIpList;
    }

    public ExportFullSqlDetailsRequest withThreadIdList(String threadIdList) {
        this.threadIdList = threadIdList;
        return this;
    }

    /**
     * 线程ID（可组合，用空格分隔）。
     * @return threadIdList
     */
    public String getThreadIdList() {
        return threadIdList;
    }

    public void setThreadIdList(String threadIdList) {
        this.threadIdList = threadIdList;
    }

    public ExportFullSqlDetailsRequest withTrxIdList(String trxIdList) {
        this.trxIdList = trxIdList;
        return this;
    }

    /**
     * 事务ID（可组合，用空格分隔）。
     * @return trxIdList
     */
    public String getTrxIdList() {
        return trxIdList;
    }

    public void setTrxIdList(String trxIdList) {
        this.trxIdList = trxIdList;
    }

    public ExportFullSqlDetailsRequest withSessionIdList(String sessionIdList) {
        this.sessionIdList = sessionIdList;
        return this;
    }

    /**
     * 会话ID（可组合，用空格分隔）。
     * @return sessionIdList
     */
    public String getSessionIdList() {
        return sessionIdList;
    }

    public void setSessionIdList(String sessionIdList) {
        this.sessionIdList = sessionIdList;
    }

    public ExportFullSqlDetailsRequest withStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }

    /**
     * 执行状态（0:成功，1:失败，可组合，用空格分隔）。
     * @return statusList
     */
    public String getStatusList() {
        return statusList;
    }

    public void setStatusList(String statusList) {
        this.statusList = statusList;
    }

    public ExportFullSqlDetailsRequest withSqlTemplateIds(String sqlTemplateIds) {
        this.sqlTemplateIds = sqlTemplateIds;
        return this;
    }

    /**
     * SQL模板ID（可组合，用空格分隔）。
     * @return sqlTemplateIds
     */
    public String getSqlTemplateIds() {
        return sqlTemplateIds;
    }

    public void setSqlTemplateIds(String sqlTemplateIds) {
        this.sqlTemplateIds = sqlTemplateIds;
    }

    public ExportFullSqlDetailsRequest withCostMin(Double costMin) {
        this.costMin = costMin;
        return this;
    }

    /**
     * 最小执行耗时（毫秒）。
     * @return costMin
     */
    public Double getCostMin() {
        return costMin;
    }

    public void setCostMin(Double costMin) {
        this.costMin = costMin;
    }

    public ExportFullSqlDetailsRequest withCostMax(Double costMax) {
        this.costMax = costMax;
        return this;
    }

    /**
     * 最大执行耗时（毫秒）。
     * @return costMax
     */
    public Double getCostMax() {
        return costMax;
    }

    public void setCostMax(Double costMax) {
        this.costMax = costMax;
    }

    public ExportFullSqlDetailsRequest withScanMin(Long scanMin) {
        this.scanMin = scanMin;
        return this;
    }

    /**
     * 最小扫描行数。
     * @return scanMin
     */
    public Long getScanMin() {
        return scanMin;
    }

    public void setScanMin(Long scanMin) {
        this.scanMin = scanMin;
    }

    public ExportFullSqlDetailsRequest withScanMax(Long scanMax) {
        this.scanMax = scanMax;
        return this;
    }

    /**
     * 最大扫描行数。
     * @return scanMax
     */
    public Long getScanMax() {
        return scanMax;
    }

    public void setScanMax(Long scanMax) {
        this.scanMax = scanMax;
    }

    public ExportFullSqlDetailsRequest withAffectMin(Long affectMin) {
        this.affectMin = affectMin;
        return this;
    }

    /**
     * 最小影响行数。
     * @return affectMin
     */
    public Long getAffectMin() {
        return affectMin;
    }

    public void setAffectMin(Long affectMin) {
        this.affectMin = affectMin;
    }

    public ExportFullSqlDetailsRequest withAffectMax(Long affectMax) {
        this.affectMax = affectMax;
        return this;
    }

    /**
     * 最大影响行数。
     * @return affectMax
     */
    public Long getAffectMax() {
        return affectMax;
    }

    public void setAffectMax(Long affectMax) {
        this.affectMax = affectMax;
    }

    public ExportFullSqlDetailsRequest withReturnMin(Long returnMin) {
        this.returnMin = returnMin;
        return this;
    }

    /**
     * 最小返回行数。
     * @return returnMin
     */
    public Long getReturnMin() {
        return returnMin;
    }

    public void setReturnMin(Long returnMin) {
        this.returnMin = returnMin;
    }

    public ExportFullSqlDetailsRequest withReturnMax(Long returnMax) {
        this.returnMax = returnMax;
        return this;
    }

    /**
     * 最大返回行数。
     * @return returnMax
     */
    public Long getReturnMax() {
        return returnMax;
    }

    public void setReturnMax(Long returnMax) {
        this.returnMax = returnMax;
    }

    public ExportFullSqlDetailsRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段（execute_at:执行时间, execute_cost:执行耗时, lock_wait_time:锁等待时间, rows_examined:扫描行数, rows_returned:返回行数）。
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ExportFullSqlDetailsRequest withAsc(Boolean asc) {
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

    public ExportFullSqlDetailsRequest withPage(Integer page) {
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

    public ExportFullSqlDetailsRequest withLimit(Integer limit) {
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

    public ExportFullSqlDetailsRequest withXLanguage(XLanguageEnum xLanguage) {
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
        ExportFullSqlDetailsRequest that = (ExportFullSqlDetailsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.taskIds, that.taskIds)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.keyword, that.keyword)
            && Objects.equals(this.fuzzy, that.fuzzy) && Objects.equals(this.userList, that.userList)
            && Objects.equals(this.dbList, that.dbList) && Objects.equals(this.operationList, that.operationList)
            && Objects.equals(this.clientIpList, that.clientIpList)
            && Objects.equals(this.threadIdList, that.threadIdList) && Objects.equals(this.trxIdList, that.trxIdList)
            && Objects.equals(this.sessionIdList, that.sessionIdList)
            && Objects.equals(this.statusList, that.statusList)
            && Objects.equals(this.sqlTemplateIds, that.sqlTemplateIds) && Objects.equals(this.costMin, that.costMin)
            && Objects.equals(this.costMax, that.costMax) && Objects.equals(this.scanMin, that.scanMin)
            && Objects.equals(this.scanMax, that.scanMax) && Objects.equals(this.affectMin, that.affectMin)
            && Objects.equals(this.affectMax, that.affectMax) && Objects.equals(this.returnMin, that.returnMin)
            && Objects.equals(this.returnMax, that.returnMax) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.asc, that.asc) && Objects.equals(this.page, that.page)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.xLanguage, that.xLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            startAt,
            endAt,
            taskIds,
            nodeId,
            keyword,
            fuzzy,
            userList,
            dbList,
            operationList,
            clientIpList,
            threadIdList,
            trxIdList,
            sessionIdList,
            statusList,
            sqlTemplateIds,
            costMin,
            costMax,
            scanMin,
            scanMax,
            affectMin,
            affectMax,
            returnMin,
            returnMax,
            sortField,
            asc,
            page,
            limit,
            xLanguage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFullSqlDetailsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    fuzzy: ").append(toIndentedString(fuzzy)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    dbList: ").append(toIndentedString(dbList)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
        sb.append("    clientIpList: ").append(toIndentedString(clientIpList)).append("\n");
        sb.append("    threadIdList: ").append(toIndentedString(threadIdList)).append("\n");
        sb.append("    trxIdList: ").append(toIndentedString(trxIdList)).append("\n");
        sb.append("    sessionIdList: ").append(toIndentedString(sessionIdList)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    sqlTemplateIds: ").append(toIndentedString(sqlTemplateIds)).append("\n");
        sb.append("    costMin: ").append(toIndentedString(costMin)).append("\n");
        sb.append("    costMax: ").append(toIndentedString(costMax)).append("\n");
        sb.append("    scanMin: ").append(toIndentedString(scanMin)).append("\n");
        sb.append("    scanMax: ").append(toIndentedString(scanMax)).append("\n");
        sb.append("    affectMin: ").append(toIndentedString(affectMin)).append("\n");
        sb.append("    affectMax: ").append(toIndentedString(affectMax)).append("\n");
        sb.append("    returnMin: ").append(toIndentedString(returnMin)).append("\n");
        sb.append("    returnMax: ").append(toIndentedString(returnMax)).append("\n");
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
