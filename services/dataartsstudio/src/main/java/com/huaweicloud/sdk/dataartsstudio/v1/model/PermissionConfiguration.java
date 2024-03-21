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
 * PermissionConfiguration
 */
public class PermissionConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private String datasourceType;

    /**
     * 权限类型：   * `ALLOW` - 设置数据源操作权限类型为允许对资源访问
     */
    public static final class PermissionTypesEnum {

        /**
         * Enum ALLOW for value: "ALLOW"
         */
        public static final PermissionTypesEnum ALLOW = new PermissionTypesEnum("ALLOW");

        private static final Map<String, PermissionTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionTypesEnum> createStaticFields() {
            Map<String, PermissionTypesEnum> map = new HashMap<>();
            map.put("ALLOW", ALLOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionTypesEnum(String value) {
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
        public static PermissionTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionTypesEnum(value));
        }

        public static PermissionTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionTypesEnum) {
                return this.value.equals(((PermissionTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_types")

    private List<PermissionTypesEnum> permissionTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_actions")

    private List<PermissionActions> permissionActions = null;

    public PermissionConfiguration withDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型
     * @return datasourceType
     */
    public String getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
    }

    public PermissionConfiguration withPermissionTypes(List<PermissionTypesEnum> permissionTypes) {
        this.permissionTypes = permissionTypes;
        return this;
    }

    public PermissionConfiguration addPermissionTypesItem(PermissionTypesEnum permissionTypesItem) {
        if (this.permissionTypes == null) {
            this.permissionTypes = new ArrayList<>();
        }
        this.permissionTypes.add(permissionTypesItem);
        return this;
    }

    public PermissionConfiguration withPermissionTypes(Consumer<List<PermissionTypesEnum>> permissionTypesSetter) {
        if (this.permissionTypes == null) {
            this.permissionTypes = new ArrayList<>();
        }
        permissionTypesSetter.accept(this.permissionTypes);
        return this;
    }

    /**
     * 数据源操作权限类型
     * @return permissionTypes
     */
    public List<PermissionTypesEnum> getPermissionTypes() {
        return permissionTypes;
    }

    public void setPermissionTypes(List<PermissionTypesEnum> permissionTypes) {
        this.permissionTypes = permissionTypes;
    }

    public PermissionConfiguration withPermissionActions(List<PermissionActions> permissionActions) {
        this.permissionActions = permissionActions;
        return this;
    }

    public PermissionConfiguration addPermissionActionsItem(PermissionActions permissionActionsItem) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        this.permissionActions.add(permissionActionsItem);
        return this;
    }

    public PermissionConfiguration withPermissionActions(Consumer<List<PermissionActions>> permissionActionsSetter) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        permissionActionsSetter.accept(this.permissionActions);
        return this;
    }

    /**
     * 数据源支持的权限操作列表
     * @return permissionActions
     */
    public List<PermissionActions> getPermissionActions() {
        return permissionActions;
    }

    public void setPermissionActions(List<PermissionActions> permissionActions) {
        this.permissionActions = permissionActions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionConfiguration that = (PermissionConfiguration) obj;
        return Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.permissionTypes, that.permissionTypes)
            && Objects.equals(this.permissionActions, that.permissionActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasourceType, permissionTypes, permissionActions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionConfiguration {\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    permissionTypes: ").append(toIndentedString(permissionTypes)).append("\n");
        sb.append("    permissionActions: ").append(toIndentedString(permissionActions)).append("\n");
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
