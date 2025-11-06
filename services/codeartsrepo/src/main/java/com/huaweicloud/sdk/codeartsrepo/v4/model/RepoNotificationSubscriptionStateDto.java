package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RepoNotificationSubscriptionStateDto
 */
public class RepoNotificationSubscriptionStateDto {

    /**
     * **参数解释：** 配资源。
     */
    public static final class ConfigSourceEnum {

        /**
         * Enum REPO for value: "repo"
         */
        public static final ConfigSourceEnum REPO = new ConfigSourceEnum("repo");

        /**
         * Enum PRODUCT for value: "product"
         */
        public static final ConfigSourceEnum PRODUCT = new ConfigSourceEnum("product");

        private static final Map<String, ConfigSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigSourceEnum> createStaticFields() {
            Map<String, ConfigSourceEnum> map = new HashMap<>();
            map.put("repo", REPO);
            map.put("product", PRODUCT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfigSourceEnum(String value) {
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
        public static ConfigSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfigSourceEnum(value));
        }

        public static ConfigSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfigSourceEnum) {
                return this.value.equals(((ConfigSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_source")

    private ConfigSourceEnum configSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public RepoNotificationSubscriptionStateDto withConfigSource(ConfigSourceEnum configSource) {
        this.configSource = configSource;
        return this;
    }

    /**
     * **参数解释：** 配资源。
     * @return configSource
     */
    public ConfigSourceEnum getConfigSource() {
        return configSource;
    }

    public void setConfigSource(ConfigSourceEnum configSource) {
        this.configSource = configSource;
    }

    public RepoNotificationSubscriptionStateDto withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释：** 开启通知。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoNotificationSubscriptionStateDto that = (RepoNotificationSubscriptionStateDto) obj;
        return Objects.equals(this.configSource, that.configSource) && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configSource, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoNotificationSubscriptionStateDto {\n");
        sb.append("    configSource: ").append(toIndentedString(configSource)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
