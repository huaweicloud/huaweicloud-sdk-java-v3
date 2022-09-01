package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订阅批量操作请求
 */
public class SubscriptionOperateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_ids")

    @JacksonXmlProperty(localName = "subscription_ids")

    private List<String> subscriptionIds = null;

    /**
    * 操作类型
    */
    public static final class OperationEnum {

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final OperationEnum DISABLE = new OperationEnum("DISABLE");

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final OperationEnum ENABLE = new OperationEnum("ENABLE");

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("DISABLE", DISABLE);
            map.put("ENABLE", ENABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationEnum(value);
            }
            return result;
        }

        public static OperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationEnum) {
                return this.value.equals(((OperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    @JacksonXmlProperty(localName = "operation")

    private OperationEnum operation;

    public SubscriptionOperateReq withSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    public SubscriptionOperateReq addSubscriptionIdsItem(String subscriptionIdsItem) {
        if (this.subscriptionIds == null) {
            this.subscriptionIds = new ArrayList<>();
        }
        this.subscriptionIds.add(subscriptionIdsItem);
        return this;
    }

    public SubscriptionOperateReq withSubscriptionIds(Consumer<List<String>> subscriptionIdsSetter) {
        if (this.subscriptionIds == null) {
            this.subscriptionIds = new ArrayList<>();
        }
        subscriptionIdsSetter.accept(this.subscriptionIds);
        return this;
    }

    /**
     * 订阅对象ID列表，单次批量操作最多支持10个订阅
     * @return subscriptionIds
     */
    public List<String> getSubscriptionIds() {
        return subscriptionIds;
    }

    public void setSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    public SubscriptionOperateReq withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作类型
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionOperateReq subscriptionOperateReq = (SubscriptionOperateReq) o;
        return Objects.equals(this.subscriptionIds, subscriptionOperateReq.subscriptionIds)
            && Objects.equals(this.operation, subscriptionOperateReq.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionIds, operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionOperateReq {\n");
        sb.append("    subscriptionIds: ").append(toIndentedString(subscriptionIds)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
