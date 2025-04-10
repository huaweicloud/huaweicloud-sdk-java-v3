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
 * 用户权限详情
 */
public class AccountPermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_msg")

    private String expireMsg;

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
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_name")

    private String memberName;

    /**
     * 权限类别,ALL,SELECT,UPDATE,CREATE,DROP,ALTER,INDEX,LOCK,READ,WRITE
     */
    public static final class PermissionActionEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final PermissionActionEnum ALL = new PermissionActionEnum("ALL");

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final PermissionActionEnum SELECT = new PermissionActionEnum("SELECT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final PermissionActionEnum UPDATE = new PermissionActionEnum("UPDATE");

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final PermissionActionEnum CREATE = new PermissionActionEnum("CREATE");

        /**
         * Enum DROP for value: "DROP"
         */
        public static final PermissionActionEnum DROP = new PermissionActionEnum("DROP");

        /**
         * Enum ALTER for value: "ALTER"
         */
        public static final PermissionActionEnum ALTER = new PermissionActionEnum("ALTER");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final PermissionActionEnum INDEX = new PermissionActionEnum("INDEX");

        /**
         * Enum LOCK for value: "LOCK"
         */
        public static final PermissionActionEnum LOCK = new PermissionActionEnum("LOCK");

        /**
         * Enum READ for value: "READ"
         */
        public static final PermissionActionEnum READ = new PermissionActionEnum("READ");

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final PermissionActionEnum WRITE = new PermissionActionEnum("WRITE");

        private static final Map<String, PermissionActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionActionEnum> createStaticFields() {
            Map<String, PermissionActionEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("SELECT", SELECT);
            map.put("UPDATE", UPDATE);
            map.put("CREATE", CREATE);
            map.put("DROP", DROP);
            map.put("ALTER", ALTER);
            map.put("INDEX", INDEX);
            map.put("LOCK", LOCK);
            map.put("READ", READ);
            map.put("WRITE", WRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionActionEnum(String value) {
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
        public static PermissionActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionActionEnum(value));
        }

        public static PermissionActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionActionEnum) {
                return this.value.equals(((PermissionActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_action")

    private PermissionActionEnum permissionAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_action_code")

    private Long permissionActionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_level_security")

    private String rowLevelSecurity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_level_security_desc")

    private String rowLevelSecurityDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public AccountPermission withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public AccountPermission withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public AccountPermission withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public AccountPermission withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public AccountPermission withDatasourceType(DatasourceTypeEnum datasourceType) {
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

    public AccountPermission withExpireMsg(String expireMsg) {
        this.expireMsg = expireMsg;
        return this;
    }

    /**
     * 到期信息
     * @return expireMsg
     */
    public String getExpireMsg() {
        return expireMsg;
    }

    public void setExpireMsg(String expireMsg) {
        this.expireMsg = expireMsg;
    }

    public AccountPermission withExpireStatus(ExpireStatusEnum expireStatus) {
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

    public AccountPermission withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间
     * minimum: 0
     * maximum: 2830012519194
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public AccountPermission withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 权限id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountPermission withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AccountPermission withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 成员id
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public AccountPermission withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * 成员名称
     * @return memberName
     */
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public AccountPermission withPermissionAction(PermissionActionEnum permissionAction) {
        this.permissionAction = permissionAction;
        return this;
    }

    /**
     * 权限类别,ALL,SELECT,UPDATE,CREATE,DROP,ALTER,INDEX,LOCK,READ,WRITE
     * @return permissionAction
     */
    public PermissionActionEnum getPermissionAction() {
        return permissionAction;
    }

    public void setPermissionAction(PermissionActionEnum permissionAction) {
        this.permissionAction = permissionAction;
    }

    public AccountPermission withPermissionActionCode(Long permissionActionCode) {
        this.permissionActionCode = permissionActionCode;
        return this;
    }

    /**
     * 权限位图
     * minimum: 0
     * maximum: 2830012519194
     * @return permissionActionCode
     */
    public Long getPermissionActionCode() {
        return permissionActionCode;
    }

    public void setPermissionActionCode(Long permissionActionCode) {
        this.permissionActionCode = permissionActionCode;
    }

    public AccountPermission withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AccountPermission withRowLevelSecurity(String rowLevelSecurity) {
        this.rowLevelSecurity = rowLevelSecurity;
        return this;
    }

    /**
     * 行级权限表达式
     * @return rowLevelSecurity
     */
    public String getRowLevelSecurity() {
        return rowLevelSecurity;
    }

    public void setRowLevelSecurity(String rowLevelSecurity) {
        this.rowLevelSecurity = rowLevelSecurity;
    }

    public AccountPermission withRowLevelSecurityDesc(String rowLevelSecurityDesc) {
        this.rowLevelSecurityDesc = rowLevelSecurityDesc;
        return this;
    }

    /**
     * 行级权限描述
     * @return rowLevelSecurityDesc
     */
    public String getRowLevelSecurityDesc() {
        return rowLevelSecurityDesc;
    }

    public void setRowLevelSecurityDesc(String rowLevelSecurityDesc) {
        this.rowLevelSecurityDesc = rowLevelSecurityDesc;
    }

    public AccountPermission withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public AccountPermission withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public AccountPermission withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountPermission that = (AccountPermission) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.columnName, that.columnName) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.expireMsg, that.expireMsg) && Objects.equals(this.expireStatus, that.expireStatus)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.memberId, that.memberId)
            && Objects.equals(this.memberName, that.memberName)
            && Objects.equals(this.permissionAction, that.permissionAction)
            && Objects.equals(this.permissionActionCode, that.permissionActionCode)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.rowLevelSecurity, that.rowLevelSecurity)
            && Objects.equals(this.rowLevelSecurityDesc, that.rowLevelSecurityDesc)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            clusterName,
            columnName,
            databaseName,
            datasourceType,
            expireMsg,
            expireStatus,
            expireTime,
            id,
            instanceId,
            memberId,
            memberName,
            permissionAction,
            permissionActionCode,
            projectId,
            rowLevelSecurity,
            rowLevelSecurityDesc,
            schemaName,
            tableName,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountPermission {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    expireMsg: ").append(toIndentedString(expireMsg)).append("\n");
        sb.append("    expireStatus: ").append(toIndentedString(expireStatus)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    memberName: ").append(toIndentedString(memberName)).append("\n");
        sb.append("    permissionAction: ").append(toIndentedString(permissionAction)).append("\n");
        sb.append("    permissionActionCode: ").append(toIndentedString(permissionActionCode)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    rowLevelSecurity: ").append(toIndentedString(rowLevelSecurity)).append("\n");
        sb.append("    rowLevelSecurityDesc: ").append(toIndentedString(rowLevelSecurityDesc)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
