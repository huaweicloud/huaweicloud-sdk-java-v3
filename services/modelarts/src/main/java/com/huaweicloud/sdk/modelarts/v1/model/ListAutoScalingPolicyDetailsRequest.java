package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAutoScalingPolicyDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    /**
     * 自动扩缩容策略类型。可选值如下： - cron：定时扩缩容策略
     */
    public static final class PolicyTypeEnum {

        /**
         * Enum CRON for value: "cron"
         */
        public static final PolicyTypeEnum CRON = new PolicyTypeEnum("cron");

        private static final Map<String, PolicyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyTypeEnum> createStaticFields() {
            Map<String, PolicyTypeEnum> map = new HashMap<>();
            map.put("cron", CRON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyTypeEnum(String value) {
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
        public static PolicyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyTypeEnum(value));
        }

        public static PolicyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyTypeEnum) {
                return this.value.equals(((PolicyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private PolicyTypeEnum policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 指定排序字段。可选值如下： - created_at：自动扩缩容策略创建的时间，默认值。 - policy_name：策略名称。
     */
    public static final class SortByEnum {

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortByEnum CREATED_AT = new SortByEnum("created_at");

        /**
         * Enum POLICY_NAME for value: "policy_name"
         */
        public static final SortByEnum POLICY_NAME = new SortByEnum("policy_name");

        private static final Map<String, SortByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortByEnum> createStaticFields() {
            Map<String, SortByEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("policy_name", POLICY_NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortByEnum(String value) {
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
        public static SortByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortByEnum(value));
        }

        public static SortByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortByEnum) {
                return this.value.equals(((SortByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private SortByEnum sortBy;

    /**
     * 排序方式。可选值如下： - asc：递增排序。 - desc：递减排序，默认值。
     */
    public static final class OrderEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderEnum(value));
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private OrderEnum order;

    public ListAutoScalingPolicyDetailsRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务ID。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ListAutoScalingPolicyDetailsRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 模型ID。
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public ListAutoScalingPolicyDetailsRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 自动扩缩容策略名称，默认不过滤策略名称。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ListAutoScalingPolicyDetailsRequest withPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 自动扩缩容策略类型。可选值如下： - cron：定时扩缩容策略
     * @return policyType
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    public ListAutoScalingPolicyDetailsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页列表的起始页，默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAutoScalingPolicyDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定每一页返回的最大条目数，默认为1000。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAutoScalingPolicyDetailsRequest withSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 指定排序字段。可选值如下： - created_at：自动扩缩容策略创建的时间，默认值。 - policy_name：策略名称。
     * @return sortBy
     */
    public SortByEnum getSortBy() {
        return sortBy;
    }

    public void setSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
    }

    public ListAutoScalingPolicyDetailsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 排序方式。可选值如下： - asc：递增排序。 - desc：递减排序，默认值。
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAutoScalingPolicyDetailsRequest that = (ListAutoScalingPolicyDetailsRequest) obj;
        return Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.modelId, that.modelId)
            && Objects.equals(this.policyName, that.policyName) && Objects.equals(this.policyType, that.policyType)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, modelId, policyName, policyType, offset, limit, sortBy, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoScalingPolicyDetailsRequest {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
