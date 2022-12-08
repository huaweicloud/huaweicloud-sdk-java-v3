package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：kafka更新配置，支持topicPrefix、userTopics、brokers，需要把该字段新的对应值全量写入。
 */
public class UpdateKafkaConfigRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_prefix")

    private String topicPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_topics")

    private List<String> userTopics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<String> brokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public UpdateKafkaConfigRequestDTO withTopicPrefix(String topicPrefix) {
        this.topicPrefix = topicPrefix;
        return this;
    }

    /**
     * **参数说明**：Topic前缀，不携带时以user_topics中具体Topic为准，携带时前缀将拼接在user_topics中的topic前方，例如：topic_prefixv2x-v1-tracks，topic_prefixv2x-v1-bsm。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return topicPrefix
     */
    public String getTopicPrefix() {
        return topicPrefix;
    }

    public void setTopicPrefix(String topicPrefix) {
        this.topicPrefix = topicPrefix;
    }

    public UpdateKafkaConfigRequestDTO withUserTopics(List<String> userTopics) {
        this.userTopics = userTopics;
        return this;
    }

    public UpdateKafkaConfigRequestDTO addUserTopicsItem(String userTopicsItem) {
        if (this.userTopics == null) {
            this.userTopics = new ArrayList<>();
        }
        this.userTopics.add(userTopicsItem);
        return this;
    }

    public UpdateKafkaConfigRequestDTO withUserTopics(Consumer<List<String>> userTopicsSetter) {
        if (this.userTopics == null) {
            this.userTopics = new ArrayList<>();
        }
        userTopicsSetter.accept(this.userTopics);
        return this;
    }

    /**
     * **参数说明**：用户订阅kafka的主题列表。  **取值范围**：  - v2x-v1-tracks：edge上报的车辆轨迹数据  - v2x-v1-bsm：车载T-BOX，mqtt协议接入rsu， websocket协议接入rsu上报的BSM消息数据  - v2x-v1-rsi：mqtt协议接入rsu，edge上报的RSI消息数据  - v2x-v1-rsm： mqtt协议接入rsu，edge上报的RSM消息数据  - v2x-v1-spat：mqtt协议接入rsu， websocket协议接入rsu上报的SPAT消息数据  - v2x-v1-edge-flow：edge上报的车流量统计信息数据
     * @return userTopics
     */
    public List<String> getUserTopics() {
        return userTopics;
    }

    public void setUserTopics(List<String> userTopics) {
        this.userTopics = userTopics;
    }

    public UpdateKafkaConfigRequestDTO withBrokers(List<String> brokers) {
        this.brokers = brokers;
        return this;
    }

    public UpdateKafkaConfigRequestDTO addBrokersItem(String brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public UpdateKafkaConfigRequestDTO withBrokers(Consumer<List<String>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * **参数说明**：用户kafka的brokers列表。
     * @return brokers
     */
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    public UpdateKafkaConfigRequestDTO withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数说明**：kafka用户名。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UpdateKafkaConfigRequestDTO withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数说明**：kafka密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateKafkaConfigRequestDTO updateKafkaConfigRequestDTO = (UpdateKafkaConfigRequestDTO) o;
        return Objects.equals(this.topicPrefix, updateKafkaConfigRequestDTO.topicPrefix)
            && Objects.equals(this.userTopics, updateKafkaConfigRequestDTO.userTopics)
            && Objects.equals(this.brokers, updateKafkaConfigRequestDTO.brokers)
            && Objects.equals(this.username, updateKafkaConfigRequestDTO.username)
            && Objects.equals(this.password, updateKafkaConfigRequestDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicPrefix, userTopics, brokers, username, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKafkaConfigRequestDTO {\n");
        sb.append("    topicPrefix: ").append(toIndentedString(topicPrefix)).append("\n");
        sb.append("    userTopics: ").append(toIndentedString(userTopics)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
