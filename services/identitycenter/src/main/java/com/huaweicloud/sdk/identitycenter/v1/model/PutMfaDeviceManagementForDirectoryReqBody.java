package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PutMfaDeviceManagementForDirectoryReqBody
 */
public class PutMfaDeviceManagementForDirectoryReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_id")

    private String identityStoreId;

    /**
     * 允许用户自行管理MFA的行为
     */
    public static final class UserPermissionEnum {

        /**
         * Enum READ_ACTIONS for value: "READ_ACTIONS"
         */
        public static final UserPermissionEnum READ_ACTIONS = new UserPermissionEnum("READ_ACTIONS");

        /**
         * Enum ALL_ACTIONS for value: "ALL_ACTIONS"
         */
        public static final UserPermissionEnum ALL_ACTIONS = new UserPermissionEnum("ALL_ACTIONS");

        private static final Map<String, UserPermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UserPermissionEnum> createStaticFields() {
            Map<String, UserPermissionEnum> map = new HashMap<>();
            map.put("READ_ACTIONS", READ_ACTIONS);
            map.put("ALL_ACTIONS", ALL_ACTIONS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UserPermissionEnum(String value) {
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
        public static UserPermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UserPermissionEnum(value));
        }

        public static UserPermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UserPermissionEnum) {
                return this.value.equals(((UserPermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_permission")

    private UserPermissionEnum userPermission;

    public PutMfaDeviceManagementForDirectoryReqBody withIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
        return this;
    }

    /**
     * 关联到IAM身份中心实例的身份源的全局唯一标识符（ID）。
     * @return identityStoreId
     */
    public String getIdentityStoreId() {
        return identityStoreId;
    }

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    public PutMfaDeviceManagementForDirectoryReqBody withUserPermission(UserPermissionEnum userPermission) {
        this.userPermission = userPermission;
        return this;
    }

    /**
     * 允许用户自行管理MFA的行为
     * @return userPermission
     */
    public UserPermissionEnum getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(UserPermissionEnum userPermission) {
        this.userPermission = userPermission;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutMfaDeviceManagementForDirectoryReqBody that = (PutMfaDeviceManagementForDirectoryReqBody) obj;
        return Objects.equals(this.identityStoreId, that.identityStoreId)
            && Objects.equals(this.userPermission, that.userPermission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityStoreId, userPermission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutMfaDeviceManagementForDirectoryReqBody {\n");
        sb.append("    identityStoreId: ").append(toIndentedString(identityStoreId)).append("\n");
        sb.append("    userPermission: ").append(toIndentedString(userPermission)).append("\n");
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
