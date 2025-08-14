package com.huaweicloud.sdk.identitycenter.v1.model;

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
 * the struct of SSOConfiguration
 */
public class SSOConfigurationDto {

    /**
     * MFA生效模式
     */
    public static final class MfaModeEnum {

        /**
         * Enum CONTEXT_AWARE for value: "CONTEXT_AWARE"
         */
        public static final MfaModeEnum CONTEXT_AWARE = new MfaModeEnum("CONTEXT_AWARE");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final MfaModeEnum DISABLED = new MfaModeEnum("DISABLED");

        /**
         * Enum ALWAYS_ON for value: "ALWAYS_ON"
         */
        public static final MfaModeEnum ALWAYS_ON = new MfaModeEnum("ALWAYS_ON");

        private static final Map<String, MfaModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MfaModeEnum> createStaticFields() {
            Map<String, MfaModeEnum> map = new HashMap<>();
            map.put("CONTEXT_AWARE", CONTEXT_AWARE);
            map.put("DISABLED", DISABLED);
            map.put("ALWAYS_ON", ALWAYS_ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MfaModeEnum(String value) {
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
        public static MfaModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MfaModeEnum(value));
        }

        public static MfaModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MfaModeEnum) {
                return this.value.equals(((MfaModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mfa_mode")

    private MfaModeEnum mfaMode;

    /**
     * 未注册MFA情况下，可选择的登录行为
     */
    public static final class NoMfaSigninBehaviorEnum {

        /**
         * Enum ALLOWED_WITH_ENROLLMENT for value: "ALLOWED_WITH_ENROLLMENT"
         */
        public static final NoMfaSigninBehaviorEnum ALLOWED_WITH_ENROLLMENT =
            new NoMfaSigninBehaviorEnum("ALLOWED_WITH_ENROLLMENT");

        /**
         * Enum ALLOWED for value: "ALLOWED"
         */
        public static final NoMfaSigninBehaviorEnum ALLOWED = new NoMfaSigninBehaviorEnum("ALLOWED");

        /**
         * Enum EMAIL_OTP for value: "EMAIL_OTP"
         */
        public static final NoMfaSigninBehaviorEnum EMAIL_OTP = new NoMfaSigninBehaviorEnum("EMAIL_OTP");

        /**
         * Enum BLOCKED for value: "BLOCKED"
         */
        public static final NoMfaSigninBehaviorEnum BLOCKED = new NoMfaSigninBehaviorEnum("BLOCKED");

        private static final Map<String, NoMfaSigninBehaviorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NoMfaSigninBehaviorEnum> createStaticFields() {
            Map<String, NoMfaSigninBehaviorEnum> map = new HashMap<>();
            map.put("ALLOWED_WITH_ENROLLMENT", ALLOWED_WITH_ENROLLMENT);
            map.put("ALLOWED", ALLOWED);
            map.put("EMAIL_OTP", EMAIL_OTP);
            map.put("BLOCKED", BLOCKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NoMfaSigninBehaviorEnum(String value) {
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
        public static NoMfaSigninBehaviorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NoMfaSigninBehaviorEnum(value));
        }

        public static NoMfaSigninBehaviorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NoMfaSigninBehaviorEnum) {
                return this.value.equals(((NoMfaSigninBehaviorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_mfa_signin_behavior")

    private NoMfaSigninBehaviorEnum noMfaSigninBehavior;

    /**
     * 没有密码情况下登录的行为
     */
    public static final class NoPasswordSigninBehaviorEnum {

        /**
         * Enum BLOCKED for value: "BLOCKED"
         */
        public static final NoPasswordSigninBehaviorEnum BLOCKED = new NoPasswordSigninBehaviorEnum("BLOCKED");

        /**
         * Enum EMAIL_OTP for value: "EMAIL_OTP"
         */
        public static final NoPasswordSigninBehaviorEnum EMAIL_OTP = new NoPasswordSigninBehaviorEnum("EMAIL_OTP");

        private static final Map<String, NoPasswordSigninBehaviorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NoPasswordSigninBehaviorEnum> createStaticFields() {
            Map<String, NoPasswordSigninBehaviorEnum> map = new HashMap<>();
            map.put("BLOCKED", BLOCKED);
            map.put("EMAIL_OTP", EMAIL_OTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NoPasswordSigninBehaviorEnum(String value) {
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
        public static NoPasswordSigninBehaviorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new NoPasswordSigninBehaviorEnum(value));
        }

        public static NoPasswordSigninBehaviorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NoPasswordSigninBehaviorEnum) {
                return this.value.equals(((NoPasswordSigninBehaviorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_password_signin_behavior")

    private NoPasswordSigninBehaviorEnum noPasswordSigninBehavior;

    /**
     * Gets or Sets allowedMfaTypes
     */
    public static final class AllowedMfaTypesEnum {

        /**
         * Enum TOTP for value: "TOTP"
         */
        public static final AllowedMfaTypesEnum TOTP = new AllowedMfaTypesEnum("TOTP");

        /**
         * Enum WEBAUTHN for value: "WEBAUTHN"
         */
        public static final AllowedMfaTypesEnum WEBAUTHN = new AllowedMfaTypesEnum("WEBAUTHN");

        /**
         * Enum WEBAUTHN_SECURITY_KEY for value: "WEBAUTHN_SECURITY_KEY"
         */
        public static final AllowedMfaTypesEnum WEBAUTHN_SECURITY_KEY =
            new AllowedMfaTypesEnum("WEBAUTHN_SECURITY_KEY");

        private static final Map<String, AllowedMfaTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AllowedMfaTypesEnum> createStaticFields() {
            Map<String, AllowedMfaTypesEnum> map = new HashMap<>();
            map.put("TOTP", TOTP);
            map.put("WEBAUTHN", WEBAUTHN);
            map.put("WEBAUTHN_SECURITY_KEY", WEBAUTHN_SECURITY_KEY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AllowedMfaTypesEnum(String value) {
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
        public static AllowedMfaTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AllowedMfaTypesEnum(value));
        }

        public static AllowedMfaTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AllowedMfaTypesEnum) {
                return this.value.equals(((AllowedMfaTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_mfa_types")

    private List<AllowedMfaTypesEnum> allowedMfaTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_configuration")

    private SessionConfigurationDto sessionConfiguration;

    public SSOConfigurationDto withMfaMode(MfaModeEnum mfaMode) {
        this.mfaMode = mfaMode;
        return this;
    }

    /**
     * MFA生效模式
     * @return mfaMode
     */
    public MfaModeEnum getMfaMode() {
        return mfaMode;
    }

    public void setMfaMode(MfaModeEnum mfaMode) {
        this.mfaMode = mfaMode;
    }

    public SSOConfigurationDto withNoMfaSigninBehavior(NoMfaSigninBehaviorEnum noMfaSigninBehavior) {
        this.noMfaSigninBehavior = noMfaSigninBehavior;
        return this;
    }

    /**
     * 未注册MFA情况下，可选择的登录行为
     * @return noMfaSigninBehavior
     */
    public NoMfaSigninBehaviorEnum getNoMfaSigninBehavior() {
        return noMfaSigninBehavior;
    }

    public void setNoMfaSigninBehavior(NoMfaSigninBehaviorEnum noMfaSigninBehavior) {
        this.noMfaSigninBehavior = noMfaSigninBehavior;
    }

    public SSOConfigurationDto withNoPasswordSigninBehavior(NoPasswordSigninBehaviorEnum noPasswordSigninBehavior) {
        this.noPasswordSigninBehavior = noPasswordSigninBehavior;
        return this;
    }

    /**
     * 没有密码情况下登录的行为
     * @return noPasswordSigninBehavior
     */
    public NoPasswordSigninBehaviorEnum getNoPasswordSigninBehavior() {
        return noPasswordSigninBehavior;
    }

    public void setNoPasswordSigninBehavior(NoPasswordSigninBehaviorEnum noPasswordSigninBehavior) {
        this.noPasswordSigninBehavior = noPasswordSigninBehavior;
    }

    public SSOConfigurationDto withAllowedMfaTypes(List<AllowedMfaTypesEnum> allowedMfaTypes) {
        this.allowedMfaTypes = allowedMfaTypes;
        return this;
    }

    public SSOConfigurationDto addAllowedMfaTypesItem(AllowedMfaTypesEnum allowedMfaTypesItem) {
        if (this.allowedMfaTypes == null) {
            this.allowedMfaTypes = new ArrayList<>();
        }
        this.allowedMfaTypes.add(allowedMfaTypesItem);
        return this;
    }

    public SSOConfigurationDto withAllowedMfaTypes(Consumer<List<AllowedMfaTypesEnum>> allowedMfaTypesSetter) {
        if (this.allowedMfaTypes == null) {
            this.allowedMfaTypes = new ArrayList<>();
        }
        allowedMfaTypesSetter.accept(this.allowedMfaTypes);
        return this;
    }

    /**
     * 允许的MFA类型
     * @return allowedMfaTypes
     */
    public List<AllowedMfaTypesEnum> getAllowedMfaTypes() {
        return allowedMfaTypes;
    }

    public void setAllowedMfaTypes(List<AllowedMfaTypesEnum> allowedMfaTypes) {
        this.allowedMfaTypes = allowedMfaTypes;
    }

    public SSOConfigurationDto withSessionConfiguration(SessionConfigurationDto sessionConfiguration) {
        this.sessionConfiguration = sessionConfiguration;
        return this;
    }

    public SSOConfigurationDto withSessionConfiguration(Consumer<SessionConfigurationDto> sessionConfigurationSetter) {
        if (this.sessionConfiguration == null) {
            this.sessionConfiguration = new SessionConfigurationDto();
            sessionConfigurationSetter.accept(this.sessionConfiguration);
        }

        return this;
    }

    /**
     * Get sessionConfiguration
     * @return sessionConfiguration
     */
    public SessionConfigurationDto getSessionConfiguration() {
        return sessionConfiguration;
    }

    public void setSessionConfiguration(SessionConfigurationDto sessionConfiguration) {
        this.sessionConfiguration = sessionConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SSOConfigurationDto that = (SSOConfigurationDto) obj;
        return Objects.equals(this.mfaMode, that.mfaMode)
            && Objects.equals(this.noMfaSigninBehavior, that.noMfaSigninBehavior)
            && Objects.equals(this.noPasswordSigninBehavior, that.noPasswordSigninBehavior)
            && Objects.equals(this.allowedMfaTypes, that.allowedMfaTypes)
            && Objects.equals(this.sessionConfiguration, that.sessionConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(mfaMode, noMfaSigninBehavior, noPasswordSigninBehavior, allowedMfaTypes, sessionConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSOConfigurationDto {\n");
        sb.append("    mfaMode: ").append(toIndentedString(mfaMode)).append("\n");
        sb.append("    noMfaSigninBehavior: ").append(toIndentedString(noMfaSigninBehavior)).append("\n");
        sb.append("    noPasswordSigninBehavior: ").append(toIndentedString(noPasswordSigninBehavior)).append("\n");
        sb.append("    allowedMfaTypes: ").append(toIndentedString(allowedMfaTypes)).append("\n");
        sb.append("    sessionConfiguration: ").append(toIndentedString(sessionConfiguration)).append("\n");
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
