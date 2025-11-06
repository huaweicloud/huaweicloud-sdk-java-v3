package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNotificationSubscriptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

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
    @JsonProperty(value = "webhook_config")

    private RepoWebHookSubscriptionDto webhookConfig;

    /**
     * **参数解释：** 仓库使用量告警阀值（百分比）。
     */
    public static final class WaringRepoUsageRateEnum {

        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final WaringRepoUsageRateEnum NUMBER_60 = new WaringRepoUsageRateEnum(60);

        /**
         * Enum NUMBER_80 for value: 80
         */
        public static final WaringRepoUsageRateEnum NUMBER_80 = new WaringRepoUsageRateEnum(80);

        /**
         * Enum NUMBER_90 for value: 90
         */
        public static final WaringRepoUsageRateEnum NUMBER_90 = new WaringRepoUsageRateEnum(90);

        private static final Map<Integer, WaringRepoUsageRateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, WaringRepoUsageRateEnum> createStaticFields() {
            Map<Integer, WaringRepoUsageRateEnum> map = new HashMap<>();
            map.put(60, NUMBER_60);
            map.put(80, NUMBER_80);
            map.put(90, NUMBER_90);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        WaringRepoUsageRateEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static WaringRepoUsageRateEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WaringRepoUsageRateEnum(value));
        }

        public static WaringRepoUsageRateEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WaringRepoUsageRateEnum) {
                return this.value.equals(((WaringRepoUsageRateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waring_repo_usage_rate")

    private WaringRepoUsageRateEnum waringRepoUsageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscript_events")

    private List<RepoSubscriptionEventDto> subscriptEvents = null;

    public ShowNotificationSubscriptionResponse withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowNotificationSubscriptionResponse withEnabled(Boolean enabled) {
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

    public ShowNotificationSubscriptionResponse withConfigSource(ConfigSourceEnum configSource) {
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

    public ShowNotificationSubscriptionResponse withWebhookConfig(RepoWebHookSubscriptionDto webhookConfig) {
        this.webhookConfig = webhookConfig;
        return this;
    }

    public ShowNotificationSubscriptionResponse withWebhookConfig(
        Consumer<RepoWebHookSubscriptionDto> webhookConfigSetter) {
        if (this.webhookConfig == null) {
            this.webhookConfig = new RepoWebHookSubscriptionDto();
            webhookConfigSetter.accept(this.webhookConfig);
        }

        return this;
    }

    /**
     * Get webhookConfig
     * @return webhookConfig
     */
    public RepoWebHookSubscriptionDto getWebhookConfig() {
        return webhookConfig;
    }

    public void setWebhookConfig(RepoWebHookSubscriptionDto webhookConfig) {
        this.webhookConfig = webhookConfig;
    }

    public ShowNotificationSubscriptionResponse withWaringRepoUsageRate(WaringRepoUsageRateEnum waringRepoUsageRate) {
        this.waringRepoUsageRate = waringRepoUsageRate;
        return this;
    }

    /**
     * **参数解释：** 仓库使用量告警阀值（百分比）。
     * @return waringRepoUsageRate
     */
    public WaringRepoUsageRateEnum getWaringRepoUsageRate() {
        return waringRepoUsageRate;
    }

    public void setWaringRepoUsageRate(WaringRepoUsageRateEnum waringRepoUsageRate) {
        this.waringRepoUsageRate = waringRepoUsageRate;
    }

    public ShowNotificationSubscriptionResponse withSubscriptEvents(List<RepoSubscriptionEventDto> subscriptEvents) {
        this.subscriptEvents = subscriptEvents;
        return this;
    }

    public ShowNotificationSubscriptionResponse addSubscriptEventsItem(RepoSubscriptionEventDto subscriptEventsItem) {
        if (this.subscriptEvents == null) {
            this.subscriptEvents = new ArrayList<>();
        }
        this.subscriptEvents.add(subscriptEventsItem);
        return this;
    }

    public ShowNotificationSubscriptionResponse withSubscriptEvents(
        Consumer<List<RepoSubscriptionEventDto>> subscriptEventsSetter) {
        if (this.subscriptEvents == null) {
            this.subscriptEvents = new ArrayList<>();
        }
        subscriptEventsSetter.accept(this.subscriptEvents);
        return this;
    }

    /**
     * **参数解释：** 通知事件。
     * @return subscriptEvents
     */
    public List<RepoSubscriptionEventDto> getSubscriptEvents() {
        return subscriptEvents;
    }

    public void setSubscriptEvents(List<RepoSubscriptionEventDto> subscriptEvents) {
        this.subscriptEvents = subscriptEvents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNotificationSubscriptionResponse that = (ShowNotificationSubscriptionResponse) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.configSource, that.configSource)
            && Objects.equals(this.webhookConfig, that.webhookConfig)
            && Objects.equals(this.waringRepoUsageRate, that.waringRepoUsageRate)
            && Objects.equals(this.subscriptEvents, that.subscriptEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, enabled, configSource, webhookConfig, waringRepoUsageRate, subscriptEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNotificationSubscriptionResponse {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    configSource: ").append(toIndentedString(configSource)).append("\n");
        sb.append("    webhookConfig: ").append(toIndentedString(webhookConfig)).append("\n");
        sb.append("    waringRepoUsageRate: ").append(toIndentedString(waringRepoUsageRate)).append("\n");
        sb.append("    subscriptEvents: ").append(toIndentedString(subscriptEvents)).append("\n");
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
