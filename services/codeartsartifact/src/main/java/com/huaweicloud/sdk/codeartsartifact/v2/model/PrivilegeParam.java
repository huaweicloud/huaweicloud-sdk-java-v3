package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PrivilegeParam
 */
public class PrivilegeParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_service_id")

    private String areaServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granted_object_path")

    private String grantedObjectPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granted_object_type_id")

    private String grantedObjectTypeId;

    /**
     * **参数解释**: 操作权限，多个权限以英文逗号隔开。 **约束限制**: 不涉及。 **取值范围**: 可选值：createrepository,editrepository,restore,deleterepository,physicdelete,restoreall,clearall,deleteorredeploy,downloadorview,import,upload,export。 **默认取值**: 无。 
     */
    public static final class OperationsEnum {

        /**
         * Enum CREATEREPOSITORY for value: "createrepository"
         */
        public static final OperationsEnum CREATEREPOSITORY = new OperationsEnum("createrepository");

        /**
         * Enum EDITREPOSITORY for value: "editrepository"
         */
        public static final OperationsEnum EDITREPOSITORY = new OperationsEnum("editrepository");

        /**
         * Enum RESTORE for value: "restore"
         */
        public static final OperationsEnum RESTORE = new OperationsEnum("restore");

        /**
         * Enum DELETEREPOSITORY for value: "deleterepository"
         */
        public static final OperationsEnum DELETEREPOSITORY = new OperationsEnum("deleterepository");

        /**
         * Enum PHYSICDELETE for value: "physicdelete"
         */
        public static final OperationsEnum PHYSICDELETE = new OperationsEnum("physicdelete");

        /**
         * Enum RESTOREALL for value: "restoreall"
         */
        public static final OperationsEnum RESTOREALL = new OperationsEnum("restoreall");

        /**
         * Enum CLEARALL for value: "clearall"
         */
        public static final OperationsEnum CLEARALL = new OperationsEnum("clearall");

        /**
         * Enum DELETEORREDEPLOY for value: "deleteorredeploy"
         */
        public static final OperationsEnum DELETEORREDEPLOY = new OperationsEnum("deleteorredeploy");

        /**
         * Enum DOWNLOADORVIEW for value: "downloadorview"
         */
        public static final OperationsEnum DOWNLOADORVIEW = new OperationsEnum("downloadorview");

        /**
         * Enum IMPORT for value: "import"
         */
        public static final OperationsEnum IMPORT = new OperationsEnum("import");

        /**
         * Enum UPLOAD for value: "upload"
         */
        public static final OperationsEnum UPLOAD = new OperationsEnum("upload");

        /**
         * Enum EXPORT for value: "export"
         */
        public static final OperationsEnum EXPORT = new OperationsEnum("export");

        private static final Map<String, OperationsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationsEnum> createStaticFields() {
            Map<String, OperationsEnum> map = new HashMap<>();
            map.put("createrepository", CREATEREPOSITORY);
            map.put("editrepository", EDITREPOSITORY);
            map.put("restore", RESTORE);
            map.put("deleterepository", DELETEREPOSITORY);
            map.put("physicdelete", PHYSICDELETE);
            map.put("restoreall", RESTOREALL);
            map.put("clearall", CLEARALL);
            map.put("deleteorredeploy", DELETEORREDEPLOY);
            map.put("downloadorview", DOWNLOADORVIEW);
            map.put("import", IMPORT);
            map.put("upload", UPLOAD);
            map.put("export", EXPORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationsEnum(String value) {
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
        public static OperationsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationsEnum(value));
        }

        public static OperationsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationsEnum) {
                return this.value.equals(((OperationsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private OperationsEnum operations;

    public PrivilegeParam withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * **参数解释**: 角色id。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public PrivilegeParam withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 项目ID，可以从调用API处获取，也可以从控制台获取。获取方式请参考[获取项目ID](CloudArtifact_api_0015.xml)。 **约束限制**: 只能由英文字母、数字组成，且长度为32个字符。 **取值范围**: 不涉及。 **默认取值**: 无。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PrivilegeParam withAreaServiceId(String areaServiceId) {
        this.areaServiceId = areaServiceId;
        return this;
    }

    /**
     * **参数解释**: 地域服务id。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return areaServiceId
     */
    public String getAreaServiceId() {
        return areaServiceId;
    }

    public void setAreaServiceId(String areaServiceId) {
        this.areaServiceId = areaServiceId;
    }

    public PrivilegeParam withGrantedObjectPath(String grantedObjectPath) {
        this.grantedObjectPath = grantedObjectPath;
        return this;
    }

    /**
     * **参数解释**: 授权对象路径。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return grantedObjectPath
     */
    public String getGrantedObjectPath() {
        return grantedObjectPath;
    }

    public void setGrantedObjectPath(String grantedObjectPath) {
        this.grantedObjectPath = grantedObjectPath;
    }

    public PrivilegeParam withGrantedObjectTypeId(String grantedObjectTypeId) {
        this.grantedObjectTypeId = grantedObjectTypeId;
        return this;
    }

    /**
     * **参数解释**: 授权对象id。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return grantedObjectTypeId
     */
    public String getGrantedObjectTypeId() {
        return grantedObjectTypeId;
    }

    public void setGrantedObjectTypeId(String grantedObjectTypeId) {
        this.grantedObjectTypeId = grantedObjectTypeId;
    }

    public PrivilegeParam withOperations(OperationsEnum operations) {
        this.operations = operations;
        return this;
    }

    /**
     * **参数解释**: 操作权限，多个权限以英文逗号隔开。 **约束限制**: 不涉及。 **取值范围**: 可选值：createrepository,editrepository,restore,deleterepository,physicdelete,restoreall,clearall,deleteorredeploy,downloadorview,import,upload,export。 **默认取值**: 无。 
     * @return operations
     */
    public OperationsEnum getOperations() {
        return operations;
    }

    public void setOperations(OperationsEnum operations) {
        this.operations = operations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivilegeParam that = (PrivilegeParam) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.areaServiceId, that.areaServiceId)
            && Objects.equals(this.grantedObjectPath, that.grantedObjectPath)
            && Objects.equals(this.grantedObjectTypeId, that.grantedObjectTypeId)
            && Objects.equals(this.operations, that.operations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, projectId, areaServiceId, grantedObjectPath, grantedObjectTypeId, operations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegeParam {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    areaServiceId: ").append(toIndentedString(areaServiceId)).append("\n");
        sb.append("    grantedObjectPath: ").append(toIndentedString(grantedObjectPath)).append("\n");
        sb.append("    grantedObjectTypeId: ").append(toIndentedString(grantedObjectTypeId)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
