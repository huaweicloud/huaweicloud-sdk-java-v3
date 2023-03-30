package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 增加租户权限
 */
public class UserPrivilegeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    /**
     * 租户权限 INTERNAL_TEST: 内测用户权限，有服务配额限制 SYSTEM_ADMIN：系统管理员权限，可加权限 PARTNER：伙伴权限，暂不做配额限制 ME_PRIVILEGE:ME白名单权限
     */
    public static final class PrivilegeEnum {

        /**
         * Enum INTERNAL_TEST for value: "INTERNAL_TEST"
         */
        public static final PrivilegeEnum INTERNAL_TEST = new PrivilegeEnum("INTERNAL_TEST");

        /**
         * Enum SYSTEM_ADMIN for value: "SYSTEM_ADMIN"
         */
        public static final PrivilegeEnum SYSTEM_ADMIN = new PrivilegeEnum("SYSTEM_ADMIN");

        /**
         * Enum PARTNER for value: "PARTNER"
         */
        public static final PrivilegeEnum PARTNER = new PrivilegeEnum("PARTNER");

        /**
         * Enum ME_PRIVILEGE for value: "ME_PRIVILEGE"
         */
        public static final PrivilegeEnum ME_PRIVILEGE = new PrivilegeEnum("ME_PRIVILEGE");

        private static final Map<String, PrivilegeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrivilegeEnum> createStaticFields() {
            Map<String, PrivilegeEnum> map = new HashMap<>();
            map.put("INTERNAL_TEST", INTERNAL_TEST);
            map.put("SYSTEM_ADMIN", SYSTEM_ADMIN);
            map.put("PARTNER", PARTNER);
            map.put("ME_PRIVILEGE", ME_PRIVILEGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrivilegeEnum(String value) {
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
        public static PrivilegeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PrivilegeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrivilegeEnum(value);
            }
            return result;
        }

        public static PrivilegeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PrivilegeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrivilegeEnum) {
                return this.value.equals(((PrivilegeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privilege")

    private PrivilegeEnum privilege;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public UserPrivilegeInfo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UserPrivilegeInfo withPrivilege(PrivilegeEnum privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * 租户权限 INTERNAL_TEST: 内测用户权限，有服务配额限制 SYSTEM_ADMIN：系统管理员权限，可加权限 PARTNER：伙伴权限，暂不做配额限制 ME_PRIVILEGE:ME白名单权限
     * @return privilege
     */
    public PrivilegeEnum getPrivilege() {
        return privilege;
    }

    public void setPrivilege(PrivilegeEnum privilege) {
        this.privilege = privilege;
    }

    public UserPrivilegeInfo withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 配额过期时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserPrivilegeInfo userPrivilegeInfo = (UserPrivilegeInfo) o;
        return Objects.equals(this.tenantId, userPrivilegeInfo.tenantId)
            && Objects.equals(this.privilege, userPrivilegeInfo.privilege)
            && Objects.equals(this.expireTime, userPrivilegeInfo.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, privilege, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPrivilegeInfo {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
