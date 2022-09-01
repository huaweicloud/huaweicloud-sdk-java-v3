package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateMqsInstanceTopicReq
 */
public class CreateMqsInstanceTopicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    @JacksonXmlProperty(localName = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    @JacksonXmlProperty(localName = "replication")

    private Integer replication;

    /**
     * 权限类型。   - all：发布+订阅   - pub：发布   - sub：订阅
     */
    public static final class AccessPolicyEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final AccessPolicyEnum ALL = new AccessPolicyEnum("all");

        /**
         * Enum PUB for value: "pub"
         */
        public static final AccessPolicyEnum PUB = new AccessPolicyEnum("pub");

        /**
         * Enum SUB for value: "sub"
         */
        public static final AccessPolicyEnum SUB = new AccessPolicyEnum("sub");

        private static final Map<String, AccessPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessPolicyEnum> createStaticFields() {
            Map<String, AccessPolicyEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("pub", PUB);
            map.put("sub", SUB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessPolicyEnum(String value) {
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
        public static AccessPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessPolicyEnum(value);
            }
            return result;
        }

        public static AccessPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessPolicyEnum) {
                return this.value.equals(((AccessPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    @JacksonXmlProperty(localName = "access_policy")

    private AccessPolicyEnum accessPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_message_flush")

    @JacksonXmlProperty(localName = "sync_message_flush")

    private Boolean syncMessageFlush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_replication")

    @JacksonXmlProperty(localName = "sync_replication")

    private Boolean syncReplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_time")

    @JacksonXmlProperty(localName = "retention_time")

    private Integer retentionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    @JacksonXmlProperty(localName = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_word")

    @JacksonXmlProperty(localName = "sensitive_word")

    private String sensitiveWord;

    public CreateMqsInstanceTopicReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * topic名称，以字母开头，仅能包含数字,字母,下划线(_)，中划线（-）,长度3-200字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateMqsInstanceTopicReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 集成应用key。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateMqsInstanceTopicReq withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * topic分区数，设置消费的并发数。  取值范围：1-50。  默认值：3。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public CreateMqsInstanceTopicReq withReplication(Integer replication) {
        this.replication = replication;
        return this;
    }

    /**
     * 副本数，配置数据的可靠性。  取值范围：1-3。  默认值：3。  > 体验版实例的副本数只能为1。
     * @return replication
     */
    public Integer getReplication() {
        return replication;
    }

    public void setReplication(Integer replication) {
        this.replication = replication;
    }

    public CreateMqsInstanceTopicReq withAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * 权限类型。   - all：发布+订阅   - pub：发布   - sub：订阅
     * @return accessPolicy
     */
    public AccessPolicyEnum getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public CreateMqsInstanceTopicReq withSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
        return this;
    }

    /**
     * 是否使用同步落盘。默认值为false。同步落盘会导致性能降低。
     * @return syncMessageFlush
     */
    public Boolean getSyncMessageFlush() {
        return syncMessageFlush;
    }

    public void setSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
    }

    public CreateMqsInstanceTopicReq withSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
        return this;
    }

    /**
     * 是否开启同步复制，开启后，客户端生产消息时相应的也要设置acks=-1，否则不生效,默认关闭。
     * @return syncReplication
     */
    public Boolean getSyncReplication() {
        return syncReplication;
    }

    public void setSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
    }

    public CreateMqsInstanceTopicReq withRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * 消息老化时间。默认值为72。取值范围1~720，单位小时。
     * @return retentionTime
     */
    public Integer getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
    }

    public CreateMqsInstanceTopicReq withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 权限类型对应的标签。  当权限类型是all时，发布和订阅的标签用符号“&”隔开。  当有多个标签时，标签用符号“||”隔开。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CreateMqsInstanceTopicReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。长度0-1000字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateMqsInstanceTopicReq withSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord;
        return this;
    }

    /**
     * 敏感字段。  当有多个敏感字段时，敏感字段用符号“||”隔开。
     * @return sensitiveWord
     */
    public String getSensitiveWord() {
        return sensitiveWord;
    }

    public void setSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMqsInstanceTopicReq createMqsInstanceTopicReq = (CreateMqsInstanceTopicReq) o;
        return Objects.equals(this.name, createMqsInstanceTopicReq.name)
            && Objects.equals(this.appId, createMqsInstanceTopicReq.appId)
            && Objects.equals(this.partition, createMqsInstanceTopicReq.partition)
            && Objects.equals(this.replication, createMqsInstanceTopicReq.replication)
            && Objects.equals(this.accessPolicy, createMqsInstanceTopicReq.accessPolicy)
            && Objects.equals(this.syncMessageFlush, createMqsInstanceTopicReq.syncMessageFlush)
            && Objects.equals(this.syncReplication, createMqsInstanceTopicReq.syncReplication)
            && Objects.equals(this.retentionTime, createMqsInstanceTopicReq.retentionTime)
            && Objects.equals(this.tag, createMqsInstanceTopicReq.tag)
            && Objects.equals(this.description, createMqsInstanceTopicReq.description)
            && Objects.equals(this.sensitiveWord, createMqsInstanceTopicReq.sensitiveWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            appId,
            partition,
            replication,
            accessPolicy,
            syncMessageFlush,
            syncReplication,
            retentionTime,
            tag,
            description,
            sensitiveWord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMqsInstanceTopicReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
        sb.append("    syncMessageFlush: ").append(toIndentedString(syncMessageFlush)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sensitiveWord: ").append(toIndentedString(sensitiveWord)).append("\n");
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
