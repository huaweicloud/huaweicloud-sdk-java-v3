package com.huaweicloud.sdk.eds.v1.model;

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
 * UserReq
 */
public class UserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    /**
     * Gets or Sets roleList
     */
    public static final class RoleListEnum {

        /**
         * Enum ROLE_DATA_VIEWER for value: "ROLE_DATA_VIEWER"
         */
        public static final RoleListEnum ROLE_DATA_VIEWER = new RoleListEnum("ROLE_DATA_VIEWER");

        /**
         * Enum ROLE_DATA_OPERATOR for value: "ROLE_DATA_OPERATOR"
         */
        public static final RoleListEnum ROLE_DATA_OPERATOR = new RoleListEnum("ROLE_DATA_OPERATOR");

        /**
         * Enum ROLE_CONTRACT_APPROVER for value: "ROLE_CONTRACT_APPROVER"
         */
        public static final RoleListEnum ROLE_CONTRACT_APPROVER = new RoleListEnum("ROLE_CONTRACT_APPROVER");

        /**
         * Enum ROLE_OFFER_APPROVER for value: "ROLE_OFFER_APPROVER"
         */
        public static final RoleListEnum ROLE_OFFER_APPROVER = new RoleListEnum("ROLE_OFFER_APPROVER");

        /**
         * Enum ROLE_CONNECTOR_OPERATOR for value: "ROLE_CONNECTOR_OPERATOR"
         */
        public static final RoleListEnum ROLE_CONNECTOR_OPERATOR = new RoleListEnum("ROLE_CONNECTOR_OPERATOR");

        /**
         * Enum ROLE_CONNECTOR_AUDITOR for value: "ROLE_CONNECTOR_AUDITOR"
         */
        public static final RoleListEnum ROLE_CONNECTOR_AUDITOR = new RoleListEnum("ROLE_CONNECTOR_AUDITOR");

        /**
         * Enum ROLE_DATA_RECEIVER for value: "ROLE_DATA_RECEIVER"
         */
        public static final RoleListEnum ROLE_DATA_RECEIVER = new RoleListEnum("ROLE_DATA_RECEIVER");

        private static final Map<String, RoleListEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleListEnum> createStaticFields() {
            Map<String, RoleListEnum> map = new HashMap<>();
            map.put("ROLE_DATA_VIEWER", ROLE_DATA_VIEWER);
            map.put("ROLE_DATA_OPERATOR", ROLE_DATA_OPERATOR);
            map.put("ROLE_CONTRACT_APPROVER", ROLE_CONTRACT_APPROVER);
            map.put("ROLE_OFFER_APPROVER", ROLE_OFFER_APPROVER);
            map.put("ROLE_CONNECTOR_OPERATOR", ROLE_CONNECTOR_OPERATOR);
            map.put("ROLE_CONNECTOR_AUDITOR", ROLE_CONNECTOR_AUDITOR);
            map.put("ROLE_DATA_RECEIVER", ROLE_DATA_RECEIVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleListEnum(String value) {
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
        public static RoleListEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoleListEnum(value));
        }

        public static RoleListEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleListEnum) {
                return this.value.equals(((RoleListEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_list")

    private List<RoleListEnum> roleList = null;

    public UserReq withUserName(String userName) {
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

    public UserReq withRoleList(List<RoleListEnum> roleList) {
        this.roleList = roleList;
        return this;
    }

    public UserReq addRoleListItem(RoleListEnum roleListItem) {
        if (this.roleList == null) {
            this.roleList = new ArrayList<>();
        }
        this.roleList.add(roleListItem);
        return this;
    }

    public UserReq withRoleList(Consumer<List<RoleListEnum>> roleListSetter) {
        if (this.roleList == null) {
            this.roleList = new ArrayList<>();
        }
        roleListSetter.accept(this.roleList);
        return this;
    }

    /**
     * 角色列表
     * @return roleList
     */
    public List<RoleListEnum> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleListEnum> roleList) {
        this.roleList = roleList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserReq that = (UserReq) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.roleList, that.roleList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, roleList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserReq {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    roleList: ").append(toIndentedString(roleList)).append("\n");
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
