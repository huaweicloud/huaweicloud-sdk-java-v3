package com.huaweicloud.sdk.rocketmq.v2.model;

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
 * ClientData
 */
public class ClientData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addr")

    private String clientAddr;

    /**
     * **参数解释**： 消费类型。 **约束限制**： 不涉及。 **取值范围**： - CONSUME_POP：POP消费模式 - CONSUME_PASSIVELY：推消费模式 - CONSUME_ACTIVELY：拉消费模式 **默认取值**： 不涉及。
     */
    public static final class ConsumeTypeEnum {

        /**
         * Enum CONSUME_POP for value: "CONSUME_POP"
         */
        public static final ConsumeTypeEnum CONSUME_POP = new ConsumeTypeEnum("CONSUME_POP");

        /**
         * Enum CONSUME_PASSIVELY for value: "CONSUME_PASSIVELY"
         */
        public static final ConsumeTypeEnum CONSUME_PASSIVELY = new ConsumeTypeEnum("CONSUME_PASSIVELY");

        /**
         * Enum CONSUME_ACTIVELY for value: "CONSUME_ACTIVELY"
         */
        public static final ConsumeTypeEnum CONSUME_ACTIVELY = new ConsumeTypeEnum("CONSUME_ACTIVELY");

        private static final Map<String, ConsumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConsumeTypeEnum> createStaticFields() {
            Map<String, ConsumeTypeEnum> map = new HashMap<>();
            map.put("CONSUME_POP", CONSUME_POP);
            map.put("CONSUME_PASSIVELY", CONSUME_PASSIVELY);
            map.put("CONSUME_ACTIVELY", CONSUME_ACTIVELY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConsumeTypeEnum(String value) {
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
        public static ConsumeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConsumeTypeEnum(value));
        }

        public static ConsumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConsumeTypeEnum) {
                return this.value.equals(((ConsumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_type")

    private ConsumeTypeEnum consumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<Subscription> subscriptions = null;

    public ClientData withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释**： 客户端语言。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ClientData withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 客户端版本。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClientData withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * **参数解释**： 客户端ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ClientData withClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }

    /**
     * **参数解释**： 客户端地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return clientAddr
     */
    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    public ClientData withConsumeType(ConsumeTypeEnum consumeType) {
        this.consumeType = consumeType;
        return this;
    }

    /**
     * **参数解释**： 消费类型。 **约束限制**： 不涉及。 **取值范围**： - CONSUME_POP：POP消费模式 - CONSUME_PASSIVELY：推消费模式 - CONSUME_ACTIVELY：拉消费模式 **默认取值**： 不涉及。
     * @return consumeType
     */
    public ConsumeTypeEnum getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(ConsumeTypeEnum consumeType) {
        this.consumeType = consumeType;
    }

    public ClientData withSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public ClientData addSubscriptionsItem(Subscription subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public ClientData withSubscriptions(Consumer<List<Subscription>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * **参数解释**： 订阅关系列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return subscriptions
     */
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClientData that = (ClientData) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.version, that.version)
            && Objects.equals(this.clientId, that.clientId) && Objects.equals(this.clientAddr, that.clientAddr)
            && Objects.equals(this.consumeType, that.consumeType)
            && Objects.equals(this.subscriptions, that.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, version, clientId, clientAddr, consumeType, subscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientData {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
        sb.append("    consumeType: ").append(toIndentedString(consumeType)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
