package com.huaweicloud.sdk.geip.v3.model;

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
public class ListJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    /**
     * Gets or Sets fields
     */
    public static final class FieldsEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final FieldsEnum ID = new FieldsEnum("id");

        /**
         * Enum ACTION for value: "action"
         */
        public static final FieldsEnum ACTION = new FieldsEnum("action");

        /**
         * Enum STATUS for value: "status"
         */
        public static final FieldsEnum STATUS = new FieldsEnum("status");

        /**
         * Enum ERROR_TASK for value: "error_task"
         */
        public static final FieldsEnum ERROR_TASK = new FieldsEnum("error_task");

        /**
         * Enum ERROR_CODE for value: "error_code"
         */
        public static final FieldsEnum ERROR_CODE = new FieldsEnum("error_code");

        /**
         * Enum ERROR_MESSAGE for value: "error_message"
         */
        public static final FieldsEnum ERROR_MESSAGE = new FieldsEnum("error_message");

        /**
         * Enum START_TIME for value: "start_time"
         */
        public static final FieldsEnum START_TIME = new FieldsEnum("start_time");

        /**
         * Enum END_TIME for value: "end_time"
         */
        public static final FieldsEnum END_TIME = new FieldsEnum("end_time");

        private static final Map<String, FieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldsEnum> createStaticFields() {
            Map<String, FieldsEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("action", ACTION);
            map.put("status", STATUS);
            map.put("error_task", ERROR_TASK);
            map.put("error_code", ERROR_CODE);
            map.put("error_message", ERROR_MESSAGE);
            map.put("start_time", START_TIME);
            map.put("end_time", END_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FieldsEnum(String value) {
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
        public static FieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FieldsEnum(value));
        }

        public static FieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FieldsEnum) {
                return this.value.equals(((FieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<FieldsEnum> fields = null;

    /**
     * Gets or Sets sortKey
     */
    public static final class SortKeyEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final SortKeyEnum ID = new SortKeyEnum("id");

        /**
         * Enum START_TIME for value: "start_time"
         */
        public static final SortKeyEnum START_TIME = new SortKeyEnum("start_time");

        /**
         * Enum END_TIME for value: "end_time"
         */
        public static final SortKeyEnum END_TIME = new SortKeyEnum("end_time");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("start_time", START_TIME);
            map.put("end_time", END_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortKeyEnum(value));
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private List<SortKeyEnum> sortKey = null;

    /**
     * Gets or Sets sortDir
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDirEnum(value));
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private List<SortDirEnum> sortDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    /**
     * Gets or Sets action
     */
    public static final class ActionEnum {

        /**
         * Enum CREATEGEIPGRAPH for value: "CreateGEIPGraph"
         */
        public static final ActionEnum CREATEGEIPGRAPH = new ActionEnum("CreateGEIPGraph");

        /**
         * Enum UPDATEGEIPGRAPH for value: "UpdateGEIPGraph"
         */
        public static final ActionEnum UPDATEGEIPGRAPH = new ActionEnum("UpdateGEIPGraph");

        /**
         * Enum BINDGEIPGRAPH for value: "BindGEIPGraph"
         */
        public static final ActionEnum BINDGEIPGRAPH = new ActionEnum("BindGEIPGraph");

        /**
         * Enum UNBINDGEIPGRAPH for value: "UnBindGEIPGraph"
         */
        public static final ActionEnum UNBINDGEIPGRAPH = new ActionEnum("UnBindGEIPGraph");

        /**
         * Enum BATCHATTACHBANDWIDTHGRAPH for value: "BatchAttachBandwidthGraph"
         */
        public static final ActionEnum BATCHATTACHBANDWIDTHGRAPH = new ActionEnum("BatchAttachBandwidthGraph");

        /**
         * Enum BATCHDETACHBANDWIDTHGRAPH for value: "BatchDetachBandwidthGraph"
         */
        public static final ActionEnum BATCHDETACHBANDWIDTHGRAPH = new ActionEnum("BatchDetachBandwidthGraph");

        /**
         * Enum CREATEGEIPSEGMENTGRAPH for value: "CreateGeipSegmentGraph"
         */
        public static final ActionEnum CREATEGEIPSEGMENTGRAPH = new ActionEnum("CreateGeipSegmentGraph");

        /**
         * Enum BINDGEIPSEGMENTGRAPH for value: "BindGeipSegmentGraph"
         */
        public static final ActionEnum BINDGEIPSEGMENTGRAPH = new ActionEnum("BindGeipSegmentGraph");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("CreateGEIPGraph", CREATEGEIPGRAPH);
            map.put("UpdateGEIPGraph", UPDATEGEIPGRAPH);
            map.put("BindGEIPGraph", BINDGEIPGRAPH);
            map.put("UnBindGEIPGraph", UNBINDGEIPGRAPH);
            map.put("BatchAttachBandwidthGraph", BATCHATTACHBANDWIDTHGRAPH);
            map.put("BatchDetachBandwidthGraph", BATCHDETACHBANDWIDTHGRAPH);
            map.put("CreateGeipSegmentGraph", CREATEGEIPSEGMENTGRAPH);
            map.put("BindGeipSegmentGraph", BINDGEIPSEGMENTGRAPH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private List<ActionEnum> action = null;

    /**
     * Gets or Sets status
     */
    public static final class StatusEnum {

        /**
         * Enum FINISH_SUCC for value: "FINISH_SUCC"
         */
        public static final StatusEnum FINISH_SUCC = new StatusEnum("FINISH_SUCC");

        /**
         * Enum FINISH_ROLLBACK_SUCC for value: "FINISH_ROLLBACK_SUCC"
         */
        public static final StatusEnum FINISH_ROLLBACK_SUCC = new StatusEnum("FINISH_ROLLBACK_SUCC");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("FINISH_SUCC", FINISH_SUCC);
            map.put("FINISH_ROLLBACK_SUCC", FINISH_ROLLBACK_SUCC);
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

    private List<StatusEnum> status = null;

    public ListJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页条数
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页起始点
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListJobsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页起始点
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListJobsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 翻页方向
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListJobsRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public ListJobsRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListJobsRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 只显示指定的字段
     * @return fields
     */
    public List<FieldsEnum> getFields() {
        return fields;
    }

    public void setFields(List<FieldsEnum> fields) {
        this.fields = fields;
    }

    public ListJobsRequest withSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListJobsRequest addSortKeyItem(SortKeyEnum sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListJobsRequest withSortKey(Consumer<List<SortKeyEnum>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 按照sort_key指定的字段排序
     * @return sortKey
     */
    public List<SortKeyEnum> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
    }

    public ListJobsRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListJobsRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListJobsRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 排序的方向，倒序或者正序
     * @return sortDir
     */
    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    public ListJobsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListJobsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListJobsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID过滤
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListJobsRequest withAction(List<ActionEnum> action) {
        this.action = action;
        return this;
    }

    public ListJobsRequest addActionItem(ActionEnum actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public ListJobsRequest withAction(Consumer<List<ActionEnum>> actionSetter) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    /**
     * 根据action过滤
     * @return action
     */
    public List<ActionEnum> getAction() {
        return action;
    }

    public void setAction(List<ActionEnum> action) {
        this.action = action;
    }

    public ListJobsRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public ListJobsRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListJobsRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 根据job状态过滤
     * @return status
     */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobsRequest that = (ListJobsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.id, that.id)
            && Objects.equals(this.action, that.action) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, marker, pageReverse, fields, sortKey, sortDir, id, action, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
