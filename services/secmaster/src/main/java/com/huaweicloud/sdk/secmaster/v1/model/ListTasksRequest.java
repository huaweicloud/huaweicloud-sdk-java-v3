package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ListTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释**: 待办的业务类型 - WORKFLOWPUBLISH 流程发布 - WORKFLOWNODEAPPROVE 流程节点审核 - PLAYBOOKPUBLISH 剧本发布 - PLAYBOOKNODEAPPROVE 剧本节点审核  **约束限制**: 不涉及         **取值范围**: - WORKFLOWPUBLISH - WORKFLOWNODEAPPROVE - PLAYBOOKPUBLISH - PLAYBOOKNODEAPPROVE  **默认值**:  不涉及
     */
    public static final class BusinessTypeEnum {

        /**
         * Enum WORKFLOWPUBLISH for value: "WORKFLOWPUBLISH"
         */
        public static final BusinessTypeEnum WORKFLOWPUBLISH = new BusinessTypeEnum("WORKFLOWPUBLISH");

        /**
         * Enum WORKFLOWNODEAPPROVE for value: "WORKFLOWNODEAPPROVE"
         */
        public static final BusinessTypeEnum WORKFLOWNODEAPPROVE = new BusinessTypeEnum("WORKFLOWNODEAPPROVE");

        /**
         * Enum PLAYBOOKPUBLISH for value: "PLAYBOOKPUBLISH"
         */
        public static final BusinessTypeEnum PLAYBOOKPUBLISH = new BusinessTypeEnum("PLAYBOOKPUBLISH");

        /**
         * Enum PLAYBOOKNODEAPPROVE for value: "PLAYBOOKNODEAPPROVE"
         */
        public static final BusinessTypeEnum PLAYBOOKNODEAPPROVE = new BusinessTypeEnum("PLAYBOOKNODEAPPROVE");

        private static final Map<String, BusinessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BusinessTypeEnum> createStaticFields() {
            Map<String, BusinessTypeEnum> map = new HashMap<>();
            map.put("WORKFLOWPUBLISH", WORKFLOWPUBLISH);
            map.put("WORKFLOWNODEAPPROVE", WORKFLOWNODEAPPROVE);
            map.put("PLAYBOOKPUBLISH", PLAYBOOKPUBLISH);
            map.put("PLAYBOOKNODEAPPROVE", PLAYBOOKNODEAPPROVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BusinessTypeEnum(String value) {
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
        public static BusinessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BusinessTypeEnum(value));
        }

        public static BusinessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BusinessTypeEnum) {
                return this.value.equals(((BusinessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private BusinessTypeEnum businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    /**
     * **参数解释**: 待办的分类 - my_todo 待处理的待办 - all_handled 已处理的待办   **约束限制**: 不涉及         **取值范围**: - my_todo - all_handled   **默认值**:  my_todo
     */
    public static final class QueryTypeEnum {

        /**
         * Enum MY_TODO for value: "my_todo"
         */
        public static final QueryTypeEnum MY_TODO = new QueryTypeEnum("my_todo");

        /**
         * Enum ALL_HANDLED for value: "all_handled"
         */
        public static final QueryTypeEnum ALL_HANDLED = new QueryTypeEnum("all_handled");

        private static final Map<String, QueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryTypeEnum> createStaticFields() {
            Map<String, QueryTypeEnum> map = new HashMap<>();
            map.put("my_todo", MY_TODO);
            map.put("all_handled", ALL_HANDLED);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_date")

    private String fromDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_date")

    private String toDate;

    public ListTasksRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**: 工作空间ID **取值范围**: 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 待办请求的偏移量 **约束限制**: 不涉及         **取值范围**: 0-9999 **默认值**:  0
     * minimum: 0
     * maximum: 9999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 待办分页大小 **约束限制**: 不涉及         **取值范围**: 1-100 **默认值**:  10
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

    public ListTasksRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**: 待办的排序字段 - create_time 按照创建时间排序 - update_time 按照更新时间排序  **约束限制**: 不涉及         **取值范围**: - create_time - update_time  **默认值**:  create_time
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListTasksRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**: 待办的排序方式 - ASC 按照升序排序 - DESC 按照降序排序  **约束限制**: 不涉及         **取值范围**: - ASC - DESC  **默认值**:  DESC
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListTasksRequest withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * **参数解释**: 待办的备注 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ListTasksRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 待办的任务名称 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTasksRequest withBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * **参数解释**: 待办的业务类型 - WORKFLOWPUBLISH 流程发布 - WORKFLOWNODEAPPROVE 流程节点审核 - PLAYBOOKPUBLISH 剧本发布 - PLAYBOOKNODEAPPROVE 剧本节点审核  **约束限制**: 不涉及         **取值范围**: - WORKFLOWPUBLISH - WORKFLOWNODEAPPROVE - PLAYBOOKPUBLISH - PLAYBOOKNODEAPPROVE  **默认值**:  不涉及
     * @return businessType
     */
    public BusinessTypeEnum getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessTypeEnum businessType) {
        this.businessType = businessType;
    }

    public ListTasksRequest withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * **参数解释**: 待办的创建人 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ListTasksRequest withQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * **参数解释**: 待办的分类 - my_todo 待处理的待办 - all_handled 已处理的待办   **约束限制**: 不涉及         **取值范围**: - my_todo - all_handled   **默认值**:  my_todo
     * @return queryType
     */
    public QueryTypeEnum getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
    }

    public ListTasksRequest withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * **参数解释**: 起始时间，格式是 \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z\" **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public ListTasksRequest withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * **参数解释**: 的截止时间，格式是 \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z\" **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksRequest that = (ListTasksRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.note, that.note)
            && Objects.equals(this.name, that.name) && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.queryType, that.queryType)
            && Objects.equals(this.fromDate, that.fromDate) && Objects.equals(this.toDate, that.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            offset,
            limit,
            sortKey,
            sortDir,
            note,
            name,
            businessType,
            creatorName,
            queryType,
            fromDate,
            toDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
