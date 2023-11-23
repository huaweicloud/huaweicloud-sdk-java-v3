package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用于标记用户及用户的权限。单个桶的ACL，Grant元素不能超过100个 
 */
@JacksonXmlRootElement(localName = "Grant")
public class Grant {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Grantee")

    @JacksonXmlProperty(localName = "Grantee")

    private Grantee grantee;

    /**
     * 授予的权限 
     */
    public static final class PermissionEnum {

        /**
         * Enum READ for value: "READ"
         */
        public static final PermissionEnum READ = new PermissionEnum("READ");

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final PermissionEnum WRITE = new PermissionEnum("WRITE");

        /**
         * Enum FULL_CONTROL for value: "FULL_CONTROL"
         */
        public static final PermissionEnum FULL_CONTROL = new PermissionEnum("FULL_CONTROL");

        private static final Map<String, PermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionEnum> createStaticFields() {
            Map<String, PermissionEnum> map = new HashMap<>();
            map.put("READ", READ);
            map.put("WRITE", WRITE);
            map.put("FULL_CONTROL", FULL_CONTROL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionEnum(String value) {
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
        public static PermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionEnum(value));
        }

        public static PermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionEnum) {
                return this.value.equals(((PermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Permission")

    @JacksonXmlProperty(localName = "Permission")

    private PermissionEnum permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Delivered")

    @JacksonXmlProperty(localName = "Delivered")

    private Boolean delivered;

    public Grant withGrantee(Grantee grantee) {
        this.grantee = grantee;
        return this;
    }

    public Grant withGrantee(Consumer<Grantee> granteeSetter) {
        if (this.grantee == null) {
            this.grantee = new Grantee();
            granteeSetter.accept(this.grantee);
        }

        return this;
    }

    /**
     * Get grantee
     * @return grantee
     */
    public Grantee getGrantee() {
        return grantee;
    }

    public void setGrantee(Grantee grantee) {
        this.grantee = grantee;
    }

    public Grant withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * 授予的权限 
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public Grant withDelivered(Boolean delivered) {
        this.delivered = delivered;
        return this;
    }

    /**
     * 桶的ACL是否向桶内对象传递 
     * @return delivered
     */
    public Boolean getDelivered() {
        return delivered;
    }

    public void setDelivered(Boolean delivered) {
        this.delivered = delivered;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant that = (Grant) obj;
        return Objects.equals(this.grantee, that.grantee) && Objects.equals(this.permission, that.permission)
            && Objects.equals(this.delivered, that.delivered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantee, permission, delivered);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Grant {\n");
        sb.append("    grantee: ").append(toIndentedString(grantee)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
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
