package com.huaweicloud.sdk.smn.v2.model;

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
 * 通知策略请求体
 */
public class NotifyPolicyRequestBody {

    /**
     * 通知策略类型，当前仅支持语音。
     */
    public static final class ProtocolEnum {

        /**
         * Enum CALLNOTIFY for value: "callnotify"
         */
        public static final ProtocolEnum CALLNOTIFY = new ProtocolEnum("callnotify");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("callnotify", CALLNOTIFY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polling")

    private List<PollingPolicyRequest> polling = null;

    public NotifyPolicyRequestBody withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 通知策略类型，当前仅支持语音。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public NotifyPolicyRequestBody withPolling(List<PollingPolicyRequest> polling) {
        this.polling = polling;
        return this;
    }

    public NotifyPolicyRequestBody addPollingItem(PollingPolicyRequest pollingItem) {
        if (this.polling == null) {
            this.polling = new ArrayList<>();
        }
        this.polling.add(pollingItem);
        return this;
    }

    public NotifyPolicyRequestBody withPolling(Consumer<List<PollingPolicyRequest>> pollingSetter) {
        if (this.polling == null) {
            this.polling = new ArrayList<>();
        }
        pollingSetter.accept(this.polling);
        return this;
    }

    /**
     * 轮询策略订阅终端。
     * @return polling
     */
    public List<PollingPolicyRequest> getPolling() {
        return polling;
    }

    public void setPolling(List<PollingPolicyRequest> polling) {
        this.polling = polling;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotifyPolicyRequestBody that = (NotifyPolicyRequestBody) obj;
        return Objects.equals(this.protocol, that.protocol) && Objects.equals(this.polling, that.polling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, polling);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotifyPolicyRequestBody {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    polling: ").append(toIndentedString(polling)).append("\n");
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
