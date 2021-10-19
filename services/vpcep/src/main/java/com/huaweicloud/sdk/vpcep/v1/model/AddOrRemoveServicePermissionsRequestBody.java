package com.huaweicloud.sdk.vpcep.v1.model;

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

/** 操作权限请求结构体 */
public class AddOrRemoveServicePermissionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<String> permissions = null;

    /** 要执行的操作。 add/remove。 */
    public static final class ActionEnum {

        /** Enum ADD for value: "add" */
        public static final ActionEnum ADD = new ActionEnum("add");

        /** Enum REMOVE for value: "remove" */
        public static final ActionEnum REMOVE = new ActionEnum("remove");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("add", ADD);
            map.put("remove", REMOVE);
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
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    private ActionEnum action;

    public AddOrRemoveServicePermissionsRequestBody withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public AddOrRemoveServicePermissionsRequestBody addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public AddOrRemoveServicePermissionsRequestBody withPermissions(Consumer<List<String>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /** permission列表。 权限格式为：iam:domain::domain_id 其中， ● “iam:domain::”为固定格式。 ● “domain_id”为可连接用户的帐号ID。
     * 支持输入1~64个字符，包括“a~z”、 “A~Z”、“0~9”或者“*”。“*”表示 所有终端节点可连接。 例如：iam:domain:: 6e9dfd51d1124e8d8498dce894923a0dd
     * 
     * @return permissions */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public AddOrRemoveServicePermissionsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /** 要执行的操作。 add/remove。
     * 
     * @return action */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddOrRemoveServicePermissionsRequestBody addOrRemoveServicePermissionsRequestBody =
            (AddOrRemoveServicePermissionsRequestBody) o;
        return Objects.equals(this.permissions, addOrRemoveServicePermissionsRequestBody.permissions)
            && Objects.equals(this.action, addOrRemoveServicePermissionsRequestBody.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrRemoveServicePermissionsRequestBody {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
