package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * KafkaConnectionDetail
 */
public class KafkaConnectionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_ssl")

    private Boolean saslSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    /**
     * 收到Server端确认信号个数，表示procuder需要收到多少个这样的确认信号，算消息发送成功。acks参数代表了数据备份的可用性。支持选项： acks=0：表示producer不需要等待任何确认收到的信息，副本将立即加到socket buffer并认为已经发送。没有任何保障可以保证此种情况下server已经成功接收数据，同时重试配置不会发生作用（因为客户端不知道是否失败）回馈的offset会总是设置为-1。 acks=1：这意味着至少要等待leader已经成功将数据写入本地log，但是并没有等待所有follower是否成功写入。如果follower没有成功备份数据，而此时leader又无法提供服务，则消息会丢失。 acks=all：这意味着leader需要等待ISR中所有备份都成功写入日志，只有任何一个备份存活，数据都不会丢失。min.insync.replicas指定必须确认写入才能被认为成功的副本的最小数量。
     */
    public static final class AcksEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final AcksEnum _0 = new AcksEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final AcksEnum _1 = new AcksEnum("1");

        /**
         * Enum ALL for value: "all"
         */
        public static final AcksEnum ALL = new AcksEnum("all");

        private static final Map<String, AcksEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AcksEnum> createStaticFields() {
            Map<String, AcksEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AcksEnum(String value) {
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
        public static AcksEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AcksEnum(value));
        }

        public static AcksEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AcksEnum) {
                return this.value.equals(((AcksEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acks")

    private AcksEnum acks;

    public KafkaConnectionDetail withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * kafka实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public KafkaConnectionDetail withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * kafka连接地址。
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public KafkaConnectionDetail withSaslSsl(Boolean saslSsl) {
        this.saslSsl = saslSsl;
        return this;
    }

    /**
     * kafka实例是否开启了SASL_SSL。
     * @return saslSsl
     */
    public Boolean getSaslSsl() {
        return saslSsl;
    }

    public void setSaslSsl(Boolean saslSsl) {
        this.saslSsl = saslSsl;
    }

    public KafkaConnectionDetail withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * kafka实例用户名。实例开启了SASL_SSL时必填
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public KafkaConnectionDetail withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * kafka实例密码。实例开启了SASL_SSL时必填
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public KafkaConnectionDetail withAcks(AcksEnum acks) {
        this.acks = acks;
        return this;
    }

    /**
     * 收到Server端确认信号个数，表示procuder需要收到多少个这样的确认信号，算消息发送成功。acks参数代表了数据备份的可用性。支持选项： acks=0：表示producer不需要等待任何确认收到的信息，副本将立即加到socket buffer并认为已经发送。没有任何保障可以保证此种情况下server已经成功接收数据，同时重试配置不会发生作用（因为客户端不知道是否失败）回馈的offset会总是设置为-1。 acks=1：这意味着至少要等待leader已经成功将数据写入本地log，但是并没有等待所有follower是否成功写入。如果follower没有成功备份数据，而此时leader又无法提供服务，则消息会丢失。 acks=all：这意味着leader需要等待ISR中所有备份都成功写入日志，只有任何一个备份存活，数据都不会丢失。min.insync.replicas指定必须确认写入才能被认为成功的副本的最小数量。
     * @return acks
     */
    public AcksEnum getAcks() {
        return acks;
    }

    public void setAcks(AcksEnum acks) {
        this.acks = acks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaConnectionDetail that = (KafkaConnectionDetail) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.addr, that.addr)
            && Objects.equals(this.saslSsl, that.saslSsl) && Objects.equals(this.username, that.username)
            && Objects.equals(this.password, that.password) && Objects.equals(this.acks, that.acks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, addr, saslSsl, username, password, acks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaConnectionDetail {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    saslSsl: ").append(toIndentedString(saslSsl)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    acks: ").append(toIndentedString(acks)).append("\n");
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
