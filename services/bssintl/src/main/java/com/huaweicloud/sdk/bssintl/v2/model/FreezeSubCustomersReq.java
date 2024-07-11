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
 * FreezeSubCustomersReq
 */
public class FreezeSubCustomersReq {

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
     * |参数名称：冻结类型| |参数的约束及描述：该参数非必填，冻结类型，支持枚举| |ACCOUNT：冻结账户，ACCOUNT_AND_RESOURCE：冻结账户与资源|
     */
    public static final class FreezeTypeEnum {

        /**
         * Enum ACCOUNT for value: "ACCOUNT"
         */
        public static final FreezeTypeEnum ACCOUNT = new FreezeTypeEnum("ACCOUNT");

        /**
         * Enum ACCOUNT_AND_RESOURCE for value: "ACCOUNT_AND_RESOURCE"
         */
        public static final FreezeTypeEnum ACCOUNT_AND_RESOURCE = new FreezeTypeEnum("ACCOUNT_AND_RESOURCE");

        private static final Map<String, FreezeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FreezeTypeEnum> createStaticFields() {
            Map<String, FreezeTypeEnum> map = new HashMap<>();
            map.put("ACCOUNT", ACCOUNT);
            map.put("ACCOUNT_AND_RESOURCE", ACCOUNT_AND_RESOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FreezeTypeEnum(String value) {
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
        public static FreezeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FreezeTypeEnum(value));
        }

        public static FreezeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FreezeTypeEnum) {
                return this.value.equals(((FreezeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze_type")

    private FreezeTypeEnum freezeType;

    public FreezeSubCustomersReq withCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }

    public FreezeSubCustomersReq addCustomerIdsItem(String customerIdsItem) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        this.customerIds.add(customerIdsItem);
        return this;
    }

    public FreezeSubCustomersReq withCustomerIds(Consumer<List<String>> customerIdsSetter) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        customerIdsSetter.accept(this.customerIds);
        return this;
    }

    /**
     * 需要冻结的客户账号ID列表。 您可以调用查询客户列表接口获取customer_id。
     * @return customerIds
     */
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public FreezeSubCustomersReq withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 冻结原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public FreezeSubCustomersReq withIndirectPartnerId(String indirectPartnerId) {
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

    public FreezeSubCustomersReq withFreezeType(FreezeTypeEnum freezeType) {
        this.freezeType = freezeType;
        return this;
    }

    /**
     * |参数名称：冻结类型| |参数的约束及描述：该参数非必填，冻结类型，支持枚举| |ACCOUNT：冻结账户，ACCOUNT_AND_RESOURCE：冻结账户与资源|
     * @return freezeType
     */
    public FreezeTypeEnum getFreezeType() {
        return freezeType;
    }

    public void setFreezeType(FreezeTypeEnum freezeType) {
        this.freezeType = freezeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreezeSubCustomersReq that = (FreezeSubCustomersReq) obj;
        return Objects.equals(this.customerIds, that.customerIds) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId)
            && Objects.equals(this.freezeType, that.freezeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerIds, reason, indirectPartnerId, freezeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreezeSubCustomersReq {\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    freezeType: ").append(toIndentedString(freezeType)).append("\n");
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
