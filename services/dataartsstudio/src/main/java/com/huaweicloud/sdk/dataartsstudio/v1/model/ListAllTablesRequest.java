package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListAllTablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    /**
     * 业务状态
     */
    public static final class StatusEnum {

        /**
         * Enum DRAFT for value: "DRAFT"
         */
        public static final StatusEnum DRAFT = new StatusEnum("DRAFT");

        /**
         * Enum PUBLISH_DEVELOPING for value: "PUBLISH_DEVELOPING"
         */
        public static final StatusEnum PUBLISH_DEVELOPING = new StatusEnum("PUBLISH_DEVELOPING");

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StatusEnum PUBLISHED = new StatusEnum("PUBLISHED");

        /**
         * Enum OFFLINE_DEVELOPING for value: "OFFLINE_DEVELOPING"
         */
        public static final StatusEnum OFFLINE_DEVELOPING = new StatusEnum("OFFLINE_DEVELOPING");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final StatusEnum OFFLINE = new StatusEnum("OFFLINE");

        /**
         * Enum REJECT for value: "REJECT"
         */
        public static final StatusEnum REJECT = new StatusEnum("REJECT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("DRAFT", DRAFT);
            map.put("PUBLISH_DEVELOPING", PUBLISH_DEVELOPING);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFFLINE_DEVELOPING", OFFLINE_DEVELOPING);
            map.put("OFFLINE", OFFLINE);
            map.put("REJECT", REJECT);
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
     * Gets or Sets syncStatus
     */
    public static final class SyncStatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final SyncStatusEnum RUNNING = new SyncStatusEnum("RUNNING");

        /**
         * Enum NO_NEED for value: "NO_NEED"
         */
        public static final SyncStatusEnum NO_NEED = new SyncStatusEnum("NO_NEED");

        /**
         * Enum SUMMARY_SUCCESS for value: "SUMMARY_SUCCESS"
         */
        public static final SyncStatusEnum SUMMARY_SUCCESS = new SyncStatusEnum("SUMMARY_SUCCESS");

        /**
         * Enum SUMMARY_FAILED for value: "SUMMARY_FAILED"
         */
        public static final SyncStatusEnum SUMMARY_FAILED = new SyncStatusEnum("SUMMARY_FAILED");

        private static final Map<String, SyncStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncStatusEnum> createStaticFields() {
            Map<String, SyncStatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("NO_NEED", NO_NEED);
            map.put("SUMMARY_SUCCESS", SUMMARY_SUCCESS);
            map.put("SUMMARY_FAILED", SUMMARY_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SyncStatusEnum(String value) {
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
        public static SyncStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SyncStatusEnum(value));
        }

        public static SyncStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncStatusEnum) {
                return this.value.equals(((SyncStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_status")

    private SyncStatusEnum syncStatus;

    /**
     * Gets or Sets syncKey
     */
    public static final class SyncKeyEnum {

        /**
         * Enum BUSINESS_ASSET for value: "BUSINESS_ASSET"
         */
        public static final SyncKeyEnum BUSINESS_ASSET = new SyncKeyEnum("BUSINESS_ASSET");

        /**
         * Enum DATA_QUALITY for value: "DATA_QUALITY"
         */
        public static final SyncKeyEnum DATA_QUALITY = new SyncKeyEnum("DATA_QUALITY");

        /**
         * Enum TECHNICAL_ASSET for value: "TECHNICAL_ASSET"
         */
        public static final SyncKeyEnum TECHNICAL_ASSET = new SyncKeyEnum("TECHNICAL_ASSET");

        /**
         * Enum META_DATA_LINK for value: "META_DATA_LINK"
         */
        public static final SyncKeyEnum META_DATA_LINK = new SyncKeyEnum("META_DATA_LINK");

        /**
         * Enum PHYSICAL_TABLE for value: "PHYSICAL_TABLE"
         */
        public static final SyncKeyEnum PHYSICAL_TABLE = new SyncKeyEnum("PHYSICAL_TABLE");

        /**
         * Enum DLF_TASK for value: "DLF_TASK"
         */
        public static final SyncKeyEnum DLF_TASK = new SyncKeyEnum("DLF_TASK");

        /**
         * Enum MATERIALIZATION for value: "MATERIALIZATION"
         */
        public static final SyncKeyEnum MATERIALIZATION = new SyncKeyEnum("MATERIALIZATION");

        private static final Map<String, SyncKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncKeyEnum> createStaticFields() {
            Map<String, SyncKeyEnum> map = new HashMap<>();
            map.put("BUSINESS_ASSET", BUSINESS_ASSET);
            map.put("DATA_QUALITY", DATA_QUALITY);
            map.put("TECHNICAL_ASSET", TECHNICAL_ASSET);
            map.put("META_DATA_LINK", META_DATA_LINK);
            map.put("PHYSICAL_TABLE", PHYSICAL_TABLE);
            map.put("DLF_TASK", DLF_TASK);
            map.put("MATERIALIZATION", MATERIALIZATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SyncKeyEnum(String value) {
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
        public static SyncKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SyncKeyEnum(value));
        }

        public static SyncKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncKeyEnum) {
                return this.value.equals(((SyncKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_key")

    private List<SyncKeyEnum> syncKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_id")

    private String bizCatalogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_id_list")

    private List<Long> bizCatalogIdList = null;

    /**
     * Gets or Sets bizTypeList
     */
    public static final class BizTypeListEnum {

        /**
         * Enum TABLE_MODEL_LOGIC for value: "TABLE_MODEL_LOGIC"
         */
        public static final BizTypeListEnum TABLE_MODEL_LOGIC = new BizTypeListEnum("TABLE_MODEL_LOGIC");

        /**
         * Enum TABLE_MODEL for value: "TABLE_MODEL"
         */
        public static final BizTypeListEnum TABLE_MODEL = new BizTypeListEnum("TABLE_MODEL");

        /**
         * Enum DIMENSION_LOGIC_TABLE for value: "DIMENSION_LOGIC_TABLE"
         */
        public static final BizTypeListEnum DIMENSION_LOGIC_TABLE = new BizTypeListEnum("DIMENSION_LOGIC_TABLE");

        /**
         * Enum FACT_LOGIC_TABLE for value: "FACT_LOGIC_TABLE"
         */
        public static final BizTypeListEnum FACT_LOGIC_TABLE = new BizTypeListEnum("FACT_LOGIC_TABLE");

        /**
         * Enum AGGREGATION_LOGIC_TABLE for value: "AGGREGATION_LOGIC_TABLE"
         */
        public static final BizTypeListEnum AGGREGATION_LOGIC_TABLE = new BizTypeListEnum("AGGREGATION_LOGIC_TABLE");

        private static final Map<String, BizTypeListEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BizTypeListEnum> createStaticFields() {
            Map<String, BizTypeListEnum> map = new HashMap<>();
            map.put("TABLE_MODEL_LOGIC", TABLE_MODEL_LOGIC);
            map.put("TABLE_MODEL", TABLE_MODEL);
            map.put("DIMENSION_LOGIC_TABLE", DIMENSION_LOGIC_TABLE);
            map.put("FACT_LOGIC_TABLE", FACT_LOGIC_TABLE);
            map.put("AGGREGATION_LOGIC_TABLE", AGGREGATION_LOGIC_TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BizTypeListEnum(String value) {
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
        public static BizTypeListEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BizTypeListEnum(value));
        }

        public static BizTypeListEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BizTypeListEnum) {
                return this.value.equals(((BizTypeListEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type_list")

    private List<BizTypeListEnum> bizTypeList = null;

    public ListAllTablesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListAllTablesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按名称或编码模糊查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAllTablesRequest withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 按创建者查询
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ListAllTablesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 业务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListAllTablesRequest withSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * Get syncStatus
     * @return syncStatus
     */
    public SyncStatusEnum getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
    }

    public ListAllTablesRequest withSyncKey(List<SyncKeyEnum> syncKey) {
        this.syncKey = syncKey;
        return this;
    }

    public ListAllTablesRequest addSyncKeyItem(SyncKeyEnum syncKeyItem) {
        if (this.syncKey == null) {
            this.syncKey = new ArrayList<>();
        }
        this.syncKey.add(syncKeyItem);
        return this;
    }

    public ListAllTablesRequest withSyncKey(Consumer<List<SyncKeyEnum>> syncKeySetter) {
        if (this.syncKey == null) {
            this.syncKey = new ArrayList<>();
        }
        syncKeySetter.accept(this.syncKey);
        return this;
    }

    /**
     * Get syncKey
     * @return syncKey
     */
    public List<SyncKeyEnum> getSyncKey() {
        return syncKey;
    }

    public void setSyncKey(List<SyncKeyEnum> syncKey) {
        this.syncKey = syncKey;
    }

    public ListAllTablesRequest withBizCatalogId(String bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
        return this;
    }

    /**
     * 所属的业务分层的id
     * @return bizCatalogId
     */
    public String getBizCatalogId() {
        return bizCatalogId;
    }

    public void setBizCatalogId(String bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
    }

    public ListAllTablesRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 时间过滤左边界,与end_time一起使用,只支持时间范围过滤,单边过滤无效
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListAllTablesRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 时间过滤右边界,与begin_time一起使用只支持时间范围过滤,单边过滤无效
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAllTablesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数，即查询Y条数据。默认值50，取值范围[1,100]
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAllTablesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标，即跳过X条数据，仅支持0或limit的整数倍，不满足则向下取整。默认值0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAllTablesRequest withBizCatalogIdList(List<Long> bizCatalogIdList) {
        this.bizCatalogIdList = bizCatalogIdList;
        return this;
    }

    public ListAllTablesRequest addBizCatalogIdListItem(Long bizCatalogIdListItem) {
        if (this.bizCatalogIdList == null) {
            this.bizCatalogIdList = new ArrayList<>();
        }
        this.bizCatalogIdList.add(bizCatalogIdListItem);
        return this;
    }

    public ListAllTablesRequest withBizCatalogIdList(Consumer<List<Long>> bizCatalogIdListSetter) {
        if (this.bizCatalogIdList == null) {
            this.bizCatalogIdList = new ArrayList<>();
        }
        bizCatalogIdListSetter.accept(this.bizCatalogIdList);
        return this;
    }

    /**
     * 所属主题的id列表
     * @return bizCatalogIdList
     */
    public List<Long> getBizCatalogIdList() {
        return bizCatalogIdList;
    }

    public void setBizCatalogIdList(List<Long> bizCatalogIdList) {
        this.bizCatalogIdList = bizCatalogIdList;
    }

    public ListAllTablesRequest withBizTypeList(List<BizTypeListEnum> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }

    public ListAllTablesRequest addBizTypeListItem(BizTypeListEnum bizTypeListItem) {
        if (this.bizTypeList == null) {
            this.bizTypeList = new ArrayList<>();
        }
        this.bizTypeList.add(bizTypeListItem);
        return this;
    }

    public ListAllTablesRequest withBizTypeList(Consumer<List<BizTypeListEnum>> bizTypeListSetter) {
        if (this.bizTypeList == null) {
            this.bizTypeList = new ArrayList<>();
        }
        bizTypeListSetter.accept(this.bizTypeList);
        return this;
    }

    /**
     * 查询的表类型，必填
     * @return bizTypeList
     */
    public List<BizTypeListEnum> getBizTypeList() {
        return bizTypeList;
    }

    public void setBizTypeList(List<BizTypeListEnum> bizTypeList) {
        this.bizTypeList = bizTypeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllTablesRequest that = (ListAllTablesRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.name, that.name)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.status, that.status)
            && Objects.equals(this.syncStatus, that.syncStatus) && Objects.equals(this.syncKey, that.syncKey)
            && Objects.equals(this.bizCatalogId, that.bizCatalogId) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.bizCatalogIdList, that.bizCatalogIdList)
            && Objects.equals(this.bizTypeList, that.bizTypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            name,
            createBy,
            status,
            syncStatus,
            syncKey,
            bizCatalogId,
            beginTime,
            endTime,
            limit,
            offset,
            bizCatalogIdList,
            bizTypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllTablesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    syncKey: ").append(toIndentedString(syncKey)).append("\n");
        sb.append("    bizCatalogId: ").append(toIndentedString(bizCatalogId)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    bizCatalogIdList: ").append(toIndentedString(bizCatalogIdList)).append("\n");
        sb.append("    bizTypeList: ").append(toIndentedString(bizTypeList)).append("\n");
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
