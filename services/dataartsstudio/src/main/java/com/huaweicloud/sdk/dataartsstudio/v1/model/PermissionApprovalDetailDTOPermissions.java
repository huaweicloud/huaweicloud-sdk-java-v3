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
 * PermissionApprovalDetailDTOPermissions
 */
public class PermissionApprovalDetailDTOPermissions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    /**
     * 权限操作,SELECT,
     */
    public static final class PermissionActionEnum {

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final PermissionActionEnum SELECT = new PermissionActionEnum("SELECT");

        private static final Map<String, PermissionActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionActionEnum> createStaticFields() {
            Map<String, PermissionActionEnum> map = new HashMap<>();
            map.put("SELECT", SELECT);
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

    private List<PermissionActionEnum> permissionAction = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_id")

    private String secrecyLevelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    public PermissionApprovalDetailDTOPermissions withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名称
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public PermissionApprovalDetailDTOPermissions withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public PermissionApprovalDetailDTOPermissions withPermissionAction(List<PermissionActionEnum> permissionAction) {
        this.permissionAction = permissionAction;
        return this;
    }

    public PermissionApprovalDetailDTOPermissions addPermissionActionItem(PermissionActionEnum permissionActionItem) {
        if (this.permissionAction == null) {
            this.permissionAction = new ArrayList<>();
        }
        this.permissionAction.add(permissionActionItem);
        return this;
    }

    public PermissionApprovalDetailDTOPermissions withPermissionAction(
        Consumer<List<PermissionActionEnum>> permissionActionSetter) {
        if (this.permissionAction == null) {
            this.permissionAction = new ArrayList<>();
        }
        permissionActionSetter.accept(this.permissionAction);
        return this;
    }

    /**
     * 权限
     * @return permissionAction
     */
    public List<PermissionActionEnum> getPermissionAction() {
        return permissionAction;
    }

    public void setPermissionAction(List<PermissionActionEnum> permissionAction) {
        this.permissionAction = permissionAction;
    }

    public PermissionApprovalDetailDTOPermissions withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 申请权限所在的空间权限集
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public PermissionApprovalDetailDTOPermissions withSchemaName(String schemaName) {
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

    public PermissionApprovalDetailDTOPermissions withSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
        return this;
    }

    /**
     * 密级
     * @return secrecyLevelId
     */
    public String getSecrecyLevelId() {
        return secrecyLevelId;
    }

    public void setSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
    }

    public PermissionApprovalDetailDTOPermissions withTableName(String tableName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionApprovalDetailDTOPermissions that = (PermissionApprovalDetailDTOPermissions) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.permissionAction, that.permissionAction)
            && Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.secrecyLevelId, that.secrecyLevelId)
            && Objects.equals(this.tableName, that.tableName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(columnName, databaseName, permissionAction, permissionSetId, schemaName, secrecyLevelId, tableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionApprovalDetailDTOPermissions {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    permissionAction: ").append(toIndentedString(permissionAction)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    secrecyLevelId: ").append(toIndentedString(secrecyLevelId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
