package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：mrsKafka配置信息。
 */
public class MrsKafkaConfigResponseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_config_id")

    private String kafkaConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_topics")

    private List<String> kafkaTopics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<String> brokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    /**
     * **参数说明**：一套kafka的连接状态。  **取值范围**：  - OFFLINE：离线  - ONLINE：在线
     */
    public static final class StatusEnum {

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final StatusEnum OFFLINE = new StatusEnum("OFFLINE");

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final StatusEnum ONLINE = new StatusEnum("ONLINE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("OFFLINE", OFFLINE);
            map.put("ONLINE", ONLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication")

    private Boolean authentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    public MrsKafkaConfigResponseDTO withKafkaConfigId(String kafkaConfigId) {
        this.kafkaConfigId = kafkaConfigId;
        return this;
    }

    /**
     * **参数说明**：每一套Kafka配置的唯一ID。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return kafkaConfigId
     */
    public String getKafkaConfigId() {
        return kafkaConfigId;
    }

    public void setKafkaConfigId(String kafkaConfigId) {
        this.kafkaConfigId = kafkaConfigId;
    }

    public MrsKafkaConfigResponseDTO withKafkaTopics(List<String> kafkaTopics) {
        this.kafkaTopics = kafkaTopics;
        return this;
    }

    public MrsKafkaConfigResponseDTO addKafkaTopicsItem(String kafkaTopicsItem) {
        if (this.kafkaTopics == null) {
            this.kafkaTopics = new ArrayList<>();
        }
        this.kafkaTopics.add(kafkaTopicsItem);
        return this;
    }

    public MrsKafkaConfigResponseDTO withKafkaTopics(Consumer<List<String>> kafkaTopicsSetter) {
        if (this.kafkaTopics == null) {
            this.kafkaTopics = new ArrayList<>();
        }
        kafkaTopicsSetter.accept(this.kafkaTopics);
        return this;
    }

    /**
     * **参数说明**：kafka的主题列表。  **取值范围**：  - v2x-v1-tracks：edge上报的车辆轨迹数据  - v2x-v1-bsm：车载T-BOX，mqtt协议接入rsu， websocket协议接入rsu上报的BSM消息数据  - v2x-v1-rsi：mqtt协议接入rsu，edge上报的RSI消息数据  - v2x-v1-rsm： mqtt协议接入rsu，edge上报的RSM消息数据  - v2x-v1-spat：mqtt协议接入rsu， websocket协议接入rsu上报的SPAT消息数据  - v2x-v1-edge-flow：edge上报的车流量统计信息数据
     * @return kafkaTopics
     */
    public List<String> getKafkaTopics() {
        return kafkaTopics;
    }

    public void setKafkaTopics(List<String> kafkaTopics) {
        this.kafkaTopics = kafkaTopics;
    }

    public MrsKafkaConfigResponseDTO withBrokers(List<String> brokers) {
        this.brokers = brokers;
        return this;
    }

    public MrsKafkaConfigResponseDTO addBrokersItem(String brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public MrsKafkaConfigResponseDTO withBrokers(Consumer<List<String>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * **参数说明**：Kafka broker列表。
     * @return brokers
     */
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    public MrsKafkaConfigResponseDTO withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数说明**：mrskafka用户名，若开启安全认证该参数必填。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MrsKafkaConfigResponseDTO withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：一套kafka的连接状态。  **取值范围**：  - OFFLINE：离线  - ONLINE：在线
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public MrsKafkaConfigResponseDTO withAuthentication(Boolean authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * **参数说明**：是否开启kerberos安全认证的开关。若开启安全认证则需要先上传kerberos安全认证的凭证。
     * @return authentication
     */
    public Boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Boolean authentication) {
        this.authentication = authentication;
    }

    public MrsKafkaConfigResponseDTO withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**：创建时间。 格式为yyyy-MM-dd'T'HH:mm:ss'Z' 例如：2015-12-12T12:12:12Z
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public MrsKafkaConfigResponseDTO withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**：修改时间。 格式为yyyy-MM-dd'T'HH:mm:ss'Z' 例如：2015-12-12T12:12:12Z
     * @return lastModifiedTime
     */
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MrsKafkaConfigResponseDTO mrsKafkaConfigResponseDTO = (MrsKafkaConfigResponseDTO) o;
        return Objects.equals(this.kafkaConfigId, mrsKafkaConfigResponseDTO.kafkaConfigId)
            && Objects.equals(this.kafkaTopics, mrsKafkaConfigResponseDTO.kafkaTopics)
            && Objects.equals(this.brokers, mrsKafkaConfigResponseDTO.brokers)
            && Objects.equals(this.username, mrsKafkaConfigResponseDTO.username)
            && Objects.equals(this.status, mrsKafkaConfigResponseDTO.status)
            && Objects.equals(this.authentication, mrsKafkaConfigResponseDTO.authentication)
            && Objects.equals(this.createdTime, mrsKafkaConfigResponseDTO.createdTime)
            && Objects.equals(this.lastModifiedTime, mrsKafkaConfigResponseDTO.lastModifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(kafkaConfigId, kafkaTopics, brokers, username, status, authentication, createdTime, lastModifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MrsKafkaConfigResponseDTO {\n");
        sb.append("    kafkaConfigId: ").append(toIndentedString(kafkaConfigId)).append("\n");
        sb.append("    kafkaTopics: ").append(toIndentedString(kafkaTopics)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
