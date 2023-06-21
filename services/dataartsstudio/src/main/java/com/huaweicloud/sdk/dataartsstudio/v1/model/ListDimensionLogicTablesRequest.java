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
public class ListDimensionLogicTablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
            SyncStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SyncStatusEnum(value);
            }
            return result;
        }

        public static SyncStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SyncStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
            SyncKeyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SyncKeyEnum(value);
            }
            return result;
        }

        public static SyncKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SyncKeyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "l2_id")

    private Long l2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_id")

    private Long dimensionId;

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
    @JsonProperty(value = "biz_catalog_id")

    private String bizCatalogId;

    /**
     * 维度类型
     */
    public static final class DimensionTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final DimensionTypeEnum COMMON = new DimensionTypeEnum("COMMON");

        /**
         * Enum LOOKUP for value: "LOOKUP"
         */
        public static final DimensionTypeEnum LOOKUP = new DimensionTypeEnum("LOOKUP");

        /**
         * Enum HIERARCHIES for value: "HIERARCHIES"
         */
        public static final DimensionTypeEnum HIERARCHIES = new DimensionTypeEnum("HIERARCHIES");

        private static final Map<String, DimensionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimensionTypeEnum> createStaticFields() {
            Map<String, DimensionTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("LOOKUP", LOOKUP);
            map.put("HIERARCHIES", HIERARCHIES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimensionTypeEnum(String value) {
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
        public static DimensionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DimensionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DimensionTypeEnum(value);
            }
            return result;
        }

        public static DimensionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DimensionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimensionTypeEnum) {
                return this.value.equals(((DimensionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_type")

    private DimensionTypeEnum dimensionType;

    public ListDimensionLogicTablesRequest withWorkspace(String workspace) {
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

    public ListDimensionLogicTablesRequest withName(String name) {
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

    public ListDimensionLogicTablesRequest withCreateBy(String createBy) {
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

    public ListDimensionLogicTablesRequest withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * 按审核人查询
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public ListDimensionLogicTablesRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 按负责人查询
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListDimensionLogicTablesRequest withStatus(StatusEnum status) {
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

    public ListDimensionLogicTablesRequest withSyncStatus(SyncStatusEnum syncStatus) {
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

    public ListDimensionLogicTablesRequest withSyncKey(List<SyncKeyEnum> syncKey) {
        this.syncKey = syncKey;
        return this;
    }

    public ListDimensionLogicTablesRequest addSyncKeyItem(SyncKeyEnum syncKeyItem) {
        if (this.syncKey == null) {
            this.syncKey = new ArrayList<>();
        }
        this.syncKey.add(syncKeyItem);
        return this;
    }

    public ListDimensionLogicTablesRequest withSyncKey(Consumer<List<SyncKeyEnum>> syncKeySetter) {
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

    public ListDimensionLogicTablesRequest withL2Id(Long l2Id) {
        this.l2Id = l2Id;
        return this;
    }

    /**
     * 主题域l2 id
     * @return l2Id
     */
    public Long getL2Id() {
        return l2Id;
    }

    public void setL2Id(Long l2Id) {
        this.l2Id = l2Id;
    }

    public ListDimensionLogicTablesRequest withDimensionId(Long dimensionId) {
        this.dimensionId = dimensionId;
        return this;
    }

    /**
     * 依据维度id查维度属性
     * @return dimensionId
     */
    public Long getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(Long dimensionId) {
        this.dimensionId = dimensionId;
    }

    public ListDimensionLogicTablesRequest withBeginTime(String beginTime) {
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

    public ListDimensionLogicTablesRequest withEndTime(String endTime) {
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

    public ListDimensionLogicTablesRequest withLimit(Integer limit) {
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

    public ListDimensionLogicTablesRequest withOffset(Integer offset) {
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

    public ListDimensionLogicTablesRequest withBizCatalogId(String bizCatalogId) {
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

    public ListDimensionLogicTablesRequest withDimensionType(DimensionTypeEnum dimensionType) {
        this.dimensionType = dimensionType;
        return this;
    }

    /**
     * 维度类型
     * @return dimensionType
     */
    public DimensionTypeEnum getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(DimensionTypeEnum dimensionType) {
        this.dimensionType = dimensionType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDimensionLogicTablesRequest listDimensionLogicTablesRequest = (ListDimensionLogicTablesRequest) o;
        return Objects.equals(this.workspace, listDimensionLogicTablesRequest.workspace)
            && Objects.equals(this.name, listDimensionLogicTablesRequest.name)
            && Objects.equals(this.createBy, listDimensionLogicTablesRequest.createBy)
            && Objects.equals(this.approver, listDimensionLogicTablesRequest.approver)
            && Objects.equals(this.owner, listDimensionLogicTablesRequest.owner)
            && Objects.equals(this.status, listDimensionLogicTablesRequest.status)
            && Objects.equals(this.syncStatus, listDimensionLogicTablesRequest.syncStatus)
            && Objects.equals(this.syncKey, listDimensionLogicTablesRequest.syncKey)
            && Objects.equals(this.l2Id, listDimensionLogicTablesRequest.l2Id)
            && Objects.equals(this.dimensionId, listDimensionLogicTablesRequest.dimensionId)
            && Objects.equals(this.beginTime, listDimensionLogicTablesRequest.beginTime)
            && Objects.equals(this.endTime, listDimensionLogicTablesRequest.endTime)
            && Objects.equals(this.limit, listDimensionLogicTablesRequest.limit)
            && Objects.equals(this.offset, listDimensionLogicTablesRequest.offset)
            && Objects.equals(this.bizCatalogId, listDimensionLogicTablesRequest.bizCatalogId)
            && Objects.equals(this.dimensionType, listDimensionLogicTablesRequest.dimensionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            name,
            createBy,
            approver,
            owner,
            status,
            syncStatus,
            syncKey,
            l2Id,
            dimensionId,
            beginTime,
            endTime,
            limit,
            offset,
            bizCatalogId,
            dimensionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDimensionLogicTablesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    syncKey: ").append(toIndentedString(syncKey)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    bizCatalogId: ").append(toIndentedString(bizCatalogId)).append("\n");
        sb.append("    dimensionType: ").append(toIndentedString(dimensionType)).append("\n");
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
