package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSecurityPermissionSetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    /**
     * 权限集类型过滤,TOP_PERMISSION_SET,SUB_PERMISSION_SET,ALL_PERMISSION_SET
     */
    public static final class TypeFilterEnum {

        /**
         * Enum TOP_PERMISSION_SET for value: "TOP_PERMISSION_SET"
         */
        public static final TypeFilterEnum TOP_PERMISSION_SET = new TypeFilterEnum("TOP_PERMISSION_SET");

        /**
         * Enum SUB_PERMISSION_SET for value: "SUB_PERMISSION_SET"
         */
        public static final TypeFilterEnum SUB_PERMISSION_SET = new TypeFilterEnum("SUB_PERMISSION_SET");

        /**
         * Enum ALL_PERMISSION_SET for value: "ALL_PERMISSION_SET"
         */
        public static final TypeFilterEnum ALL_PERMISSION_SET = new TypeFilterEnum("ALL_PERMISSION_SET");

        private static final Map<String, TypeFilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeFilterEnum> createStaticFields() {
            Map<String, TypeFilterEnum> map = new HashMap<>();
            map.put("TOP_PERMISSION_SET", TOP_PERMISSION_SET);
            map.put("SUB_PERMISSION_SET", SUB_PERMISSION_SET);
            map.put("ALL_PERMISSION_SET", ALL_PERMISSION_SET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeFilterEnum(String value) {
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
        public static TypeFilterEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeFilterEnum(value));
        }

        public static TypeFilterEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeFilterEnum) {
                return this.value.equals(((TypeFilterEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_filter")

    private TypeFilterEnum typeFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_id")

    private String managerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_name")

    private String managerName;

    /**
     * 管理员类型,USER,USER_GROUP
     */
    public static final class ManagerTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final ManagerTypeEnum USER = new ManagerTypeEnum("USER");

        /**
         * Enum USER_GROUP for value: "USER_GROUP"
         */
        public static final ManagerTypeEnum USER_GROUP = new ManagerTypeEnum("USER_GROUP");

        private static final Map<String, ManagerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ManagerTypeEnum> createStaticFields() {
            Map<String, ManagerTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("USER_GROUP", USER_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ManagerTypeEnum(String value) {
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
        public static ManagerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ManagerTypeEnum(value));
        }

        public static ManagerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ManagerTypeEnum) {
                return this.value.equals(((ManagerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_type")

    private ManagerTypeEnum managerType;

    /**
     * 数据源类型,HIVE
     */
    public static final class DatasourceTypeEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final DatasourceTypeEnum HIVE = new DatasourceTypeEnum("HIVE");

        private static final Map<String, DatasourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatasourceTypeEnum> createStaticFields() {
            Map<String, DatasourceTypeEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatasourceTypeEnum(String value) {
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
        public static DatasourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatasourceTypeEnum(value));
        }

        public static DatasourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatasourceTypeEnum) {
                return this.value.equals(((DatasourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private DatasourceTypeEnum datasourceType;

    /**
     * 同步状态,UNKNOWN,NOT_SYNC,SYNCING,SYNC_SUCCESS,SYNC_FAIL
     */
    public static final class SyncStatusEnum {

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final SyncStatusEnum UNKNOWN = new SyncStatusEnum("UNKNOWN");

        /**
         * Enum NOT_SYNC for value: "NOT_SYNC"
         */
        public static final SyncStatusEnum NOT_SYNC = new SyncStatusEnum("NOT_SYNC");

        /**
         * Enum SYNCING for value: "SYNCING"
         */
        public static final SyncStatusEnum SYNCING = new SyncStatusEnum("SYNCING");

        /**
         * Enum SYNC_SUCCESS for value: "SYNC_SUCCESS"
         */
        public static final SyncStatusEnum SYNC_SUCCESS = new SyncStatusEnum("SYNC_SUCCESS");

        /**
         * Enum SYNC_FAIL for value: "SYNC_FAIL"
         */
        public static final SyncStatusEnum SYNC_FAIL = new SyncStatusEnum("SYNC_FAIL");

        private static final Map<String, SyncStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncStatusEnum> createStaticFields() {
            Map<String, SyncStatusEnum> map = new HashMap<>();
            map.put("UNKNOWN", UNKNOWN);
            map.put("NOT_SYNC", NOT_SYNC);
            map.put("SYNCING", SYNCING);
            map.put("SYNC_SUCCESS", SYNC_SUCCESS);
            map.put("SYNC_FAIL", SYNC_FAIL);
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
     * 排序参数, NAME,CREATE_TIME,UPDATE_TIME
     */
    public static final class OrderByEnum {

        /**
         * Enum NAME for value: "NAME"
         */
        public static final OrderByEnum NAME = new OrderByEnum("NAME");

        /**
         * Enum CREATE_TIME for value: "CREATE_TIME"
         */
        public static final OrderByEnum CREATE_TIME = new OrderByEnum("CREATE_TIME");

        /**
         * Enum UPDATE_TIME for value: "UPDATE_TIME"
         */
        public static final OrderByEnum UPDATE_TIME = new OrderByEnum("UPDATE_TIME");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("NAME", NAME);
            map.put("CREATE_TIME", CREATE_TIME);
            map.put("UPDATE_TIME", UPDATE_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderByEnum(String value) {
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
        public static OrderByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderByEnum(value));
        }

        public static OrderByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderByEnum) {
                return this.value.equals(((OrderByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private OrderByEnum orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_asc")

    private Boolean orderByAsc;

    public ListSecurityPermissionSetsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * workspace 信息
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListSecurityPermissionSetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecurityPermissionSetsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * offset
     * minimum: 0
     * maximum: 99999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSecurityPermissionSetsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSecurityPermissionSetsRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父权限集id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ListSecurityPermissionSetsRequest withTypeFilter(TypeFilterEnum typeFilter) {
        this.typeFilter = typeFilter;
        return this;
    }

    /**
     * 权限集类型过滤,TOP_PERMISSION_SET,SUB_PERMISSION_SET,ALL_PERMISSION_SET
     * @return typeFilter
     */
    public TypeFilterEnum getTypeFilter() {
        return typeFilter;
    }

    public void setTypeFilter(TypeFilterEnum typeFilter) {
        this.typeFilter = typeFilter;
    }

    public ListSecurityPermissionSetsRequest withManagerId(String managerId) {
        this.managerId = managerId;
        return this;
    }

    /**
     * 管理员id
     * @return managerId
     */
    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public ListSecurityPermissionSetsRequest withManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }

    /**
     * 管理员名称
     * @return managerName
     */
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public ListSecurityPermissionSetsRequest withManagerType(ManagerTypeEnum managerType) {
        this.managerType = managerType;
        return this;
    }

    /**
     * 管理员类型,USER,USER_GROUP
     * @return managerType
     */
    public ManagerTypeEnum getManagerType() {
        return managerType;
    }

    public void setManagerType(ManagerTypeEnum managerType) {
        this.managerType = managerType;
    }

    public ListSecurityPermissionSetsRequest withDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型,HIVE
     * @return datasourceType
     */
    public DatasourceTypeEnum getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
    }

    public ListSecurityPermissionSetsRequest withSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * 同步状态,UNKNOWN,NOT_SYNC,SYNCING,SYNC_SUCCESS,SYNC_FAIL
     * @return syncStatus
     */
    public SyncStatusEnum getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
    }

    public ListSecurityPermissionSetsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序参数, NAME,CREATE_TIME,UPDATE_TIME
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListSecurityPermissionSetsRequest withOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
        return this;
    }

    /**
     * 是否升序（仅指定排序参数时有效）
     * @return orderByAsc
     */
    public Boolean getOrderByAsc() {
        return orderByAsc;
    }

    public void setOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityPermissionSetsRequest that = (ListSecurityPermissionSetsRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.name, that.name)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.typeFilter, that.typeFilter)
            && Objects.equals(this.managerId, that.managerId) && Objects.equals(this.managerName, that.managerName)
            && Objects.equals(this.managerType, that.managerType)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.syncStatus, that.syncStatus) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.orderByAsc, that.orderByAsc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            limit,
            offset,
            name,
            parentId,
            typeFilter,
            managerId,
            managerName,
            managerType,
            datasourceType,
            syncStatus,
            orderBy,
            orderByAsc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityPermissionSetsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    typeFilter: ").append(toIndentedString(typeFilter)).append("\n");
        sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
        sb.append("    managerName: ").append(toIndentedString(managerName)).append("\n");
        sb.append("    managerType: ").append(toIndentedString(managerType)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    orderByAsc: ").append(toIndentedString(orderByAsc)).append("\n");
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
