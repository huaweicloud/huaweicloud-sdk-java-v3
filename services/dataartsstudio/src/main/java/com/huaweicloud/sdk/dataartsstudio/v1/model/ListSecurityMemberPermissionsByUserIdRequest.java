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
public class ListSecurityMemberPermissionsByUserIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * 数据源类型 - HIVE数据源 - DWS数据源 - [DLI数据源](tag:nohcs)
     */
    public static final class DatasourceTypeEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final DatasourceTypeEnum HIVE = new DatasourceTypeEnum("HIVE");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DatasourceTypeEnum DWS = new DatasourceTypeEnum("DWS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final DatasourceTypeEnum DLI = new DatasourceTypeEnum("DLI");

        private static final Map<String, DatasourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatasourceTypeEnum> createStaticFields() {
            Map<String, DatasourceTypeEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            map.put("DWS", DWS);
            map.put("DLI", DLI);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    /**
     * 权限账号类型 * SELF_ACCOUNT 个人账号权限 * WORKSPACE_ACCOUNT 空间调度账号权限
     */
    public static final class AccountTypeEnum {

        /**
         * Enum SELF_ACCOUNT for value: "SELF_ACCOUNT"
         */
        public static final AccountTypeEnum SELF_ACCOUNT = new AccountTypeEnum("SELF_ACCOUNT");

        /**
         * Enum WORKSPACE_ACCOUNT for value: "WORKSPACE_ACCOUNT"
         */
        public static final AccountTypeEnum WORKSPACE_ACCOUNT = new AccountTypeEnum("WORKSPACE_ACCOUNT");

        private static final Map<String, AccountTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccountTypeEnum> createStaticFields() {
            Map<String, AccountTypeEnum> map = new HashMap<>();
            map.put("SELF_ACCOUNT", SELF_ACCOUNT);
            map.put("WORKSPACE_ACCOUNT", WORKSPACE_ACCOUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccountTypeEnum(String value) {
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
        public static AccountTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccountTypeEnum(value));
        }

        public static AccountTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccountTypeEnum) {
                return this.value.equals(((AccountTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private AccountTypeEnum accountType;

    /**
     * 权限状态,REVOKE_FAILED,TO_BE_REVOKE,INACTIVE,PERMANENTLY_ACTIVE,ACTIVE,EXPIRE_SOON
     */
    public static final class ExpireStatusEnum {

        /**
         * Enum REVOKE_FAILED for value: "REVOKE_FAILED"
         */
        public static final ExpireStatusEnum REVOKE_FAILED = new ExpireStatusEnum("REVOKE_FAILED");

        /**
         * Enum TO_BE_REVOKE for value: "TO_BE_REVOKE"
         */
        public static final ExpireStatusEnum TO_BE_REVOKE = new ExpireStatusEnum("TO_BE_REVOKE");

        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final ExpireStatusEnum INACTIVE = new ExpireStatusEnum("INACTIVE");

        /**
         * Enum PERMANENTLY_ACTIVE for value: "PERMANENTLY_ACTIVE"
         */
        public static final ExpireStatusEnum PERMANENTLY_ACTIVE = new ExpireStatusEnum("PERMANENTLY_ACTIVE");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final ExpireStatusEnum ACTIVE = new ExpireStatusEnum("ACTIVE");

        /**
         * Enum EXPIRE_SOON for value: "EXPIRE_SOON"
         */
        public static final ExpireStatusEnum EXPIRE_SOON = new ExpireStatusEnum("EXPIRE_SOON");

        private static final Map<String, ExpireStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExpireStatusEnum> createStaticFields() {
            Map<String, ExpireStatusEnum> map = new HashMap<>();
            map.put("REVOKE_FAILED", REVOKE_FAILED);
            map.put("TO_BE_REVOKE", TO_BE_REVOKE);
            map.put("INACTIVE", INACTIVE);
            map.put("PERMANENTLY_ACTIVE", PERMANENTLY_ACTIVE);
            map.put("ACTIVE", ACTIVE);
            map.put("EXPIRE_SOON", EXPIRE_SOON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExpireStatusEnum(String value) {
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
        public static ExpireStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExpireStatusEnum(value));
        }

        public static ExpireStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExpireStatusEnum) {
                return this.value.equals(((ExpireStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_status")

    private ExpireStatusEnum expireStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_expire_time")

    private Long startExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_expire_time")

    private Long endExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    /**
     * 排序参数,EXPIRE_TIME
     */
    public static final class OrderByEnum {

        /**
         * Enum EXPIRE_TIME for value: "EXPIRE_TIME"
         */
        public static final OrderByEnum EXPIRE_TIME = new OrderByEnum("EXPIRE_TIME");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("EXPIRE_TIME", EXPIRE_TIME);
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

    public ListSecurityMemberPermissionsByUserIdRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * IAM用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withLimit(Integer limit) {
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

    public ListSecurityMemberPermissionsByUserIdRequest withOffset(Integer offset) {
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

    public ListSecurityMemberPermissionsByUserIdRequest withDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型 - HIVE数据源 - DWS数据源 - [DLI数据源](tag:nohcs)
     * @return datasourceType
     */
    public DatasourceTypeEnum getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Schema名，正向模糊匹配
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 权限账号类型 * SELF_ACCOUNT 个人账号权限 * WORKSPACE_ACCOUNT 空间调度账号权限
     * @return accountType
     */
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withExpireStatus(ExpireStatusEnum expireStatus) {
        this.expireStatus = expireStatus;
        return this;
    }

    /**
     * 权限状态,REVOKE_FAILED,TO_BE_REVOKE,INACTIVE,PERMANENTLY_ACTIVE,ACTIVE,EXPIRE_SOON
     * @return expireStatus
     */
    public ExpireStatusEnum getExpireStatus() {
        return expireStatus;
    }

    public void setExpireStatus(ExpireStatusEnum expireStatus) {
        this.expireStatus = expireStatus;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withStartExpireTime(Long startExpireTime) {
        this.startExpireTime = startExpireTime;
        return this;
    }

    /**
     * 过期时间开始时间戳，毫秒。
     * minimum: 0
     * maximum: 2830012519194
     * @return startExpireTime
     */
    public Long getStartExpireTime() {
        return startExpireTime;
    }

    public void setStartExpireTime(Long startExpireTime) {
        this.startExpireTime = startExpireTime;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withEndExpireTime(Long endExpireTime) {
        this.endExpireTime = endExpireTime;
        return this;
    }

    /**
     * 过期时间结束时间戳，毫秒。
     * minimum: 0
     * maximum: 2830012519194
     * @return endExpireTime
     */
    public Long getEndExpireTime() {
        return endExpireTime;
    }

    public void setEndExpireTime(Long endExpireTime) {
        this.endExpireTime = endExpireTime;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withWorkspace(String workspace) {
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

    public ListSecurityMemberPermissionsByUserIdRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序参数,EXPIRE_TIME
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListSecurityMemberPermissionsByUserIdRequest withOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
        return this;
    }

    /**
     * 升序/降序。true升序，false降序
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
        ListSecurityMemberPermissionsByUserIdRequest that = (ListSecurityMemberPermissionsByUserIdRequest) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.accountType, that.accountType)
            && Objects.equals(this.expireStatus, that.expireStatus)
            && Objects.equals(this.startExpireTime, that.startExpireTime)
            && Objects.equals(this.endExpireTime, that.endExpireTime) && Objects.equals(this.workspace, that.workspace)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.orderByAsc, that.orderByAsc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId,
            userName,
            limit,
            offset,
            datasourceType,
            databaseName,
            schemaName,
            tableName,
            accountType,
            expireStatus,
            startExpireTime,
            endExpireTime,
            workspace,
            orderBy,
            orderByAsc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityMemberPermissionsByUserIdRequest {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    expireStatus: ").append(toIndentedString(expireStatus)).append("\n");
        sb.append("    startExpireTime: ").append(toIndentedString(startExpireTime)).append("\n");
        sb.append("    endExpireTime: ").append(toIndentedString(endExpireTime)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
