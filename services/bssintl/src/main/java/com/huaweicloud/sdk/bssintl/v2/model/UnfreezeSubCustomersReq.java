package com.huaweicloud.sdk.bssintl.v2.model;

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
 * UnfreezeSubCustomersReq
 */
public class UnfreezeSubCustomersReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_ids")

    private List<String> customerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    /**
     * |参数名称：解冻类型| |参数的约束及描述：该参数非必填，解冻类型，支持枚举| |ACCOUNT：解冻账号，ACCOUNT_AND_RESOURCE：解冻账号与资源|
     */
    public static final class UnfreezeTypeEnum {

        /**
         * Enum ACCOUNT for value: "ACCOUNT"
         */
        public static final UnfreezeTypeEnum ACCOUNT = new UnfreezeTypeEnum("ACCOUNT");

        /**
         * Enum ACCOUNT_AND_RESOURCE for value: "ACCOUNT_AND_RESOURCE"
         */
        public static final UnfreezeTypeEnum ACCOUNT_AND_RESOURCE = new UnfreezeTypeEnum("ACCOUNT_AND_RESOURCE");

        private static final Map<String, UnfreezeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UnfreezeTypeEnum> createStaticFields() {
            Map<String, UnfreezeTypeEnum> map = new HashMap<>();
            map.put("ACCOUNT", ACCOUNT);
            map.put("ACCOUNT_AND_RESOURCE", ACCOUNT_AND_RESOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UnfreezeTypeEnum(String value) {
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
        public static UnfreezeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UnfreezeTypeEnum(value));
        }

        public static UnfreezeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UnfreezeTypeEnum) {
                return this.value.equals(((UnfreezeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unfreeze_type")

    private UnfreezeTypeEnum unfreezeType;

    public UnfreezeSubCustomersReq withCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }

    public UnfreezeSubCustomersReq addCustomerIdsItem(String customerIdsItem) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        this.customerIds.add(customerIdsItem);
        return this;
    }

    public UnfreezeSubCustomersReq withCustomerIds(Consumer<List<String>> customerIdsSetter) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        customerIdsSetter.accept(this.customerIds);
        return this;
    }

    /**
     * 需要解冻的客户账号ID列表。 您可以调用查询客户列表接口获取customer_id。
     * @return customerIds
     */
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public UnfreezeSubCustomersReq withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 解冻原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public UnfreezeSubCustomersReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见查询云经销商列表。如果需要查询云经销商的子客户列表，必须携带该字段。除此之外，此参数不做处理。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public UnfreezeSubCustomersReq withUnfreezeType(UnfreezeTypeEnum unfreezeType) {
        this.unfreezeType = unfreezeType;
        return this;
    }

    /**
     * |参数名称：解冻类型| |参数的约束及描述：该参数非必填，解冻类型，支持枚举| |ACCOUNT：解冻账号，ACCOUNT_AND_RESOURCE：解冻账号与资源|
     * @return unfreezeType
     */
    public UnfreezeTypeEnum getUnfreezeType() {
        return unfreezeType;
    }

    public void setUnfreezeType(UnfreezeTypeEnum unfreezeType) {
        this.unfreezeType = unfreezeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnfreezeSubCustomersReq that = (UnfreezeSubCustomersReq) obj;
        return Objects.equals(this.customerIds, that.customerIds) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId)
            && Objects.equals(this.unfreezeType, that.unfreezeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerIds, reason, indirectPartnerId, unfreezeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnfreezeSubCustomersReq {\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    unfreezeType: ").append(toIndentedString(unfreezeType)).append("\n");
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
