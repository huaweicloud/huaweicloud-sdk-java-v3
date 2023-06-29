package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LeagueUpdateVo
 */
public class LeagueUpdateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dp_enabled")

    private Boolean dpEnabled;

    /**
     * 隐私保护类别，HIGH.高，STANDARD.标准
     */
    public static final class PrivacyProtectionTypeEnum {

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final PrivacyProtectionTypeEnum HIGH = new PrivacyProtectionTypeEnum("HIGH");

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final PrivacyProtectionTypeEnum STANDARD = new PrivacyProtectionTypeEnum("STANDARD");

        private static final Map<String, PrivacyProtectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrivacyProtectionTypeEnum> createStaticFields() {
            Map<String, PrivacyProtectionTypeEnum> map = new HashMap<>();
            map.put("HIGH", HIGH);
            map.put("STANDARD", STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrivacyProtectionTypeEnum(String value) {
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
        public static PrivacyProtectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PrivacyProtectionTypeEnum(value));
        }

        public static PrivacyProtectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrivacyProtectionTypeEnum) {
                return this.value.equals(((PrivacyProtectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_protection_type")

    private PrivacyProtectionTypeEnum privacyProtectionType;

    public LeagueUpdateVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LeagueUpdateVo withDpEnabled(Boolean dpEnabled) {
        this.dpEnabled = dpEnabled;
        return this;
    }

    /**
     * 差分隐私开关
     * @return dpEnabled
     */
    public Boolean getDpEnabled() {
        return dpEnabled;
    }

    public void setDpEnabled(Boolean dpEnabled) {
        this.dpEnabled = dpEnabled;
    }

    public LeagueUpdateVo withPrivacyProtectionType(PrivacyProtectionTypeEnum privacyProtectionType) {
        this.privacyProtectionType = privacyProtectionType;
        return this;
    }

    /**
     * 隐私保护类别，HIGH.高，STANDARD.标准
     * @return privacyProtectionType
     */
    public PrivacyProtectionTypeEnum getPrivacyProtectionType() {
        return privacyProtectionType;
    }

    public void setPrivacyProtectionType(PrivacyProtectionTypeEnum privacyProtectionType) {
        this.privacyProtectionType = privacyProtectionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LeagueUpdateVo that = (LeagueUpdateVo) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.dpEnabled, that.dpEnabled)
            && Objects.equals(this.privacyProtectionType, that.privacyProtectionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dpEnabled, privacyProtectionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeagueUpdateVo {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dpEnabled: ").append(toIndentedString(dpEnabled)).append("\n");
        sb.append("    privacyProtectionType: ").append(toIndentedString(privacyProtectionType)).append("\n");
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
