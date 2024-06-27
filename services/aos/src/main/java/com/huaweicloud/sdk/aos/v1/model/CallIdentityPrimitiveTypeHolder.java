package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CallIdentityPrimitiveTypeHolder
 */
public class CallIdentityPrimitiveTypeHolder {

    /**
     * 仅支持资源栈集权限模式为SERVICE_MANAGED时指定该参数。用于指定用户是以组织管理账号还是成员帐户中的服务委托管理员身份调用资源栈集。默认为SELF。 当资源栈集权限模式为SELF_MANAGED时，默认为SELF。 * 无论指定何种用户身份，涉及操作的资源栈集始终在组织管理账号名下。*   * `SELF` - 以组织管理账号身份调用。   * `DELEGATED_ADMIN` - 以服务委托管理员身份调用。用户的华为云账号必须在组织中已经被注册为”资源编排资源栈集服务“的委托管理员。
     */
    public static final class CallIdentityEnum {

        /**
         * Enum SELF for value: "SELF"
         */
        public static final CallIdentityEnum SELF = new CallIdentityEnum("SELF");

        /**
         * Enum DELEGATED_ADMIN for value: "DELEGATED_ADMIN"
         */
        public static final CallIdentityEnum DELEGATED_ADMIN = new CallIdentityEnum("DELEGATED_ADMIN");

        private static final Map<String, CallIdentityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CallIdentityEnum> createStaticFields() {
            Map<String, CallIdentityEnum> map = new HashMap<>();
            map.put("SELF", SELF);
            map.put("DELEGATED_ADMIN", DELEGATED_ADMIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CallIdentityEnum(String value) {
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
        public static CallIdentityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CallIdentityEnum(value));
        }

        public static CallIdentityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CallIdentityEnum) {
                return this.value.equals(((CallIdentityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_identity")

    private CallIdentityEnum callIdentity;

    public CallIdentityPrimitiveTypeHolder withCallIdentity(CallIdentityEnum callIdentity) {
        this.callIdentity = callIdentity;
        return this;
    }

    /**
     * 仅支持资源栈集权限模式为SERVICE_MANAGED时指定该参数。用于指定用户是以组织管理账号还是成员帐户中的服务委托管理员身份调用资源栈集。默认为SELF。 当资源栈集权限模式为SELF_MANAGED时，默认为SELF。 * 无论指定何种用户身份，涉及操作的资源栈集始终在组织管理账号名下。*   * `SELF` - 以组织管理账号身份调用。   * `DELEGATED_ADMIN` - 以服务委托管理员身份调用。用户的华为云账号必须在组织中已经被注册为”资源编排资源栈集服务“的委托管理员。
     * @return callIdentity
     */
    public CallIdentityEnum getCallIdentity() {
        return callIdentity;
    }

    public void setCallIdentity(CallIdentityEnum callIdentity) {
        this.callIdentity = callIdentity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CallIdentityPrimitiveTypeHolder that = (CallIdentityPrimitiveTypeHolder) obj;
        return Objects.equals(this.callIdentity, that.callIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callIdentity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallIdentityPrimitiveTypeHolder {\n");
        sb.append("    callIdentity: ").append(toIndentedString(callIdentity)).append("\n");
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
