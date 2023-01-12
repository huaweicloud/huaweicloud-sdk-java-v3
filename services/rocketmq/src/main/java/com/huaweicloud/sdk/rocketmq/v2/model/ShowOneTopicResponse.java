package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
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
public class ShowOneTopicResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_read_queue_num")

    private BigDecimal totalReadQueueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_write_queue_num")

    private BigDecimal totalWriteQueueNum;

    /**
     * 权限。
     */
    public static final class PermissionEnum {

        /**
         * Enum SUB for value: "sub"
         */
        public static final PermissionEnum SUB = new PermissionEnum("sub");

        /**
         * Enum PUB for value: "pub"
         */
        public static final PermissionEnum PUB = new PermissionEnum("pub");

        /**
         * Enum ALL for value: "all"
         */
        public static final PermissionEnum ALL = new PermissionEnum("all");

        private static final Map<String, PermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionEnum> createStaticFields() {
            Map<String, PermissionEnum> map = new HashMap<>();
            map.put("sub", SUB);
            map.put("pub", PUB);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionEnum(String value) {
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
        public static PermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PermissionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PermissionEnum(value);
            }
            return result;
        }

        public static PermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PermissionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionEnum) {
                return this.value.equals(((PermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private PermissionEnum permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<TopicBrokers> brokers = null;

    public ShowOneTopicResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowOneTopicResponse withTotalReadQueueNum(BigDecimal totalReadQueueNum) {
        this.totalReadQueueNum = totalReadQueueNum;
        return this;
    }

    /**
     * 总读队列个数。
     * @return totalReadQueueNum
     */
    public BigDecimal getTotalReadQueueNum() {
        return totalReadQueueNum;
    }

    public void setTotalReadQueueNum(BigDecimal totalReadQueueNum) {
        this.totalReadQueueNum = totalReadQueueNum;
    }

    public ShowOneTopicResponse withTotalWriteQueueNum(BigDecimal totalWriteQueueNum) {
        this.totalWriteQueueNum = totalWriteQueueNum;
        return this;
    }

    /**
     * 总写队列个数。
     * @return totalWriteQueueNum
     */
    public BigDecimal getTotalWriteQueueNum() {
        return totalWriteQueueNum;
    }

    public void setTotalWriteQueueNum(BigDecimal totalWriteQueueNum) {
        this.totalWriteQueueNum = totalWriteQueueNum;
    }

    public ShowOneTopicResponse withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * 权限。
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public ShowOneTopicResponse withBrokers(List<TopicBrokers> brokers) {
        this.brokers = brokers;
        return this;
    }

    public ShowOneTopicResponse addBrokersItem(TopicBrokers brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ShowOneTopicResponse withBrokers(Consumer<List<TopicBrokers>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * 关联的代理。
     * @return brokers
     */
    public List<TopicBrokers> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<TopicBrokers> brokers) {
        this.brokers = brokers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOneTopicResponse showOneTopicResponse = (ShowOneTopicResponse) o;
        return Objects.equals(this.name, showOneTopicResponse.name)
            && Objects.equals(this.totalReadQueueNum, showOneTopicResponse.totalReadQueueNum)
            && Objects.equals(this.totalWriteQueueNum, showOneTopicResponse.totalWriteQueueNum)
            && Objects.equals(this.permission, showOneTopicResponse.permission)
            && Objects.equals(this.brokers, showOneTopicResponse.brokers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalReadQueueNum, totalWriteQueueNum, permission, brokers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOneTopicResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalReadQueueNum: ").append(toIndentedString(totalReadQueueNum)).append("\n");
        sb.append("    totalWriteQueueNum: ").append(toIndentedString(totalWriteQueueNum)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
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
