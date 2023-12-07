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
 * PermissionSetPermissionUpdateDTO
 */
public class PermissionSetPermissionUpdateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    /**
     * 权限操作,ALL,SELECT,UPDATE,CREATE,DROP,ALTER,INDEX,LOCK,READ,WRITE
     */
    public static final class PermissionActionsEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final PermissionActionsEnum ALL = new PermissionActionsEnum("ALL");

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final PermissionActionsEnum SELECT = new PermissionActionsEnum("SELECT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final PermissionActionsEnum UPDATE = new PermissionActionsEnum("UPDATE");

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final PermissionActionsEnum CREATE = new PermissionActionsEnum("CREATE");

        /**
         * Enum DROP for value: "DROP"
         */
        public static final PermissionActionsEnum DROP = new PermissionActionsEnum("DROP");

        /**
         * Enum ALTER for value: "ALTER"
         */
        public static final PermissionActionsEnum ALTER = new PermissionActionsEnum("ALTER");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final PermissionActionsEnum INDEX = new PermissionActionsEnum("INDEX");

        /**
         * Enum LOCK for value: "LOCK"
         */
        public static final PermissionActionsEnum LOCK = new PermissionActionsEnum("LOCK");

        /**
         * Enum READ for value: "READ"
         */
        public static final PermissionActionsEnum READ = new PermissionActionsEnum("READ");

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final PermissionActionsEnum WRITE = new PermissionActionsEnum("WRITE");

        private static final Map<String, PermissionActionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionActionsEnum> createStaticFields() {
            Map<String, PermissionActionsEnum> map = new HashMap<>();
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

        PermissionActionsEnum(String value) {
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
        public static PermissionActionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionActionsEnum(value));
        }

        public static PermissionActionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionActionsEnum) {
                return this.value.equals(((PermissionActionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_actions")

    private List<PermissionActionsEnum> permissionActions = null;

    public PermissionSetPermissionUpdateDTO withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接id
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public PermissionSetPermissionUpdateDTO withPermissionActions(List<PermissionActionsEnum> permissionActions) {
        this.permissionActions = permissionActions;
        return this;
    }

    public PermissionSetPermissionUpdateDTO addPermissionActionsItem(PermissionActionsEnum permissionActionsItem) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        this.permissionActions.add(permissionActionsItem);
        return this;
    }

    public PermissionSetPermissionUpdateDTO withPermissionActions(
        Consumer<List<PermissionActionsEnum>> permissionActionsSetter) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        permissionActionsSetter.accept(this.permissionActions);
        return this;
    }

    /**
     * 权限操作列表
     * @return permissionActions
     */
    public List<PermissionActionsEnum> getPermissionActions() {
        return permissionActions;
    }

    public void setPermissionActions(List<PermissionActionsEnum> permissionActions) {
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
        PermissionSetPermissionUpdateDTO that = (PermissionSetPermissionUpdateDTO) obj;
        return Objects.equals(this.dwId, that.dwId) && Objects.equals(this.permissionActions, that.permissionActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwId, permissionActions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionSetPermissionUpdateDTO {\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
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
