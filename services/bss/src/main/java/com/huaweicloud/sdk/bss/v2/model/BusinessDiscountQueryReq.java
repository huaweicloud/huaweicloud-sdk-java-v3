package com.huaweicloud.sdk.bss.v2.model;

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
 * 查询商务折扣信息请求体
 */
public class BusinessDiscountQueryReq {

    /**
     * 报价项类型，必填，PRODUCT_ITEM（产品报价项）/ CATEGORY_ITEM（分类报价项）
     */
    public static final class QuotingItemTypeEnum {

        /**
         * Enum PRODUCT_ITEM for value: "PRODUCT_ITEM"
         */
        public static final QuotingItemTypeEnum PRODUCT_ITEM = new QuotingItemTypeEnum("PRODUCT_ITEM");

        /**
         * Enum CATEGORY_ITEM for value: "CATEGORY_ITEM"
         */
        public static final QuotingItemTypeEnum CATEGORY_ITEM = new QuotingItemTypeEnum("CATEGORY_ITEM");

        private static final Map<String, QuotingItemTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QuotingItemTypeEnum> createStaticFields() {
            Map<String, QuotingItemTypeEnum> map = new HashMap<>();
            map.put("PRODUCT_ITEM", PRODUCT_ITEM);
            map.put("CATEGORY_ITEM", CATEGORY_ITEM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QuotingItemTypeEnum(String value) {
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
        public static QuotingItemTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QuotingItemTypeEnum(value));
        }

        public static QuotingItemTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QuotingItemTypeEnum) {
                return this.value.equals(((QuotingItemTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quoting_item_type")

    private QuotingItemTypeEnum quotingItemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_types")

    private List<String> cloudServiceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_modes")

    private List<String> chargingModes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public BusinessDiscountQueryReq withQuotingItemType(QuotingItemTypeEnum quotingItemType) {
        this.quotingItemType = quotingItemType;
        return this;
    }

    /**
     * 报价项类型，必填，PRODUCT_ITEM（产品报价项）/ CATEGORY_ITEM（分类报价项）
     * @return quotingItemType
     */
    public QuotingItemTypeEnum getQuotingItemType() {
        return quotingItemType;
    }

    public void setQuotingItemType(QuotingItemTypeEnum quotingItemType) {
        this.quotingItemType = quotingItemType;
    }

    public BusinessDiscountQueryReq withCloudServiceTypes(List<String> cloudServiceTypes) {
        this.cloudServiceTypes = cloudServiceTypes;
        return this;
    }

    public BusinessDiscountQueryReq addCloudServiceTypesItem(String cloudServiceTypesItem) {
        if (this.cloudServiceTypes == null) {
            this.cloudServiceTypes = new ArrayList<>();
        }
        this.cloudServiceTypes.add(cloudServiceTypesItem);
        return this;
    }

    public BusinessDiscountQueryReq withCloudServiceTypes(Consumer<List<String>> cloudServiceTypesSetter) {
        if (this.cloudServiceTypes == null) {
            this.cloudServiceTypes = new ArrayList<>();
        }
        cloudServiceTypesSetter.accept(this.cloudServiceTypes);
        return this;
    }

    /**
     * 云服务类型编码列表，非必填，大小写不敏感，数组范围限制:0-100，字符长度限制1-64。此参数不携带或携带值为空列表或携带值为null时，不作为筛选条件。
     * @return cloudServiceTypes
     */
    public List<String> getCloudServiceTypes() {
        return cloudServiceTypes;
    }

    public void setCloudServiceTypes(List<String> cloudServiceTypes) {
        this.cloudServiceTypes = cloudServiceTypes;
    }

    public BusinessDiscountQueryReq withChargingModes(List<String> chargingModes) {
        this.chargingModes = chargingModes;
        return this;
    }

    public BusinessDiscountQueryReq addChargingModesItem(String chargingModesItem) {
        if (this.chargingModes == null) {
            this.chargingModes = new ArrayList<>();
        }
        this.chargingModes.add(chargingModesItem);
        return this;
    }

    public BusinessDiscountQueryReq withChargingModes(Consumer<List<String>> chargingModesSetter) {
        if (this.chargingModes == null) {
            this.chargingModes = new ArrayList<>();
        }
        chargingModesSetter.accept(this.chargingModes);
        return this;
    }

    /**
     * 计费模式列表，非必填，大小写不敏感，数组范围限制:0-20，字符长度限制1-64。此参数不携带或携带值为空列表或携带值为null时，不作为筛选条件。
     * @return chargingModes
     */
    public List<String> getChargingModes() {
        return chargingModes;
    }

    public void setChargingModes(List<String> chargingModes) {
        this.chargingModes = chargingModes;
    }

    public BusinessDiscountQueryReq withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 运营站点编码，非必填，大小写不敏感，字符长度限制1-64。此参数不携带或携带值为null时，不作为筛选条件。
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public BusinessDiscountQueryReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页偏移量，非必填，取值范围0-2147483647，默认值0
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public BusinessDiscountQueryReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数，非必填，取值范围1-1000，默认值20
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessDiscountQueryReq that = (BusinessDiscountQueryReq) obj;
        return Objects.equals(this.quotingItemType, that.quotingItemType)
            && Objects.equals(this.cloudServiceTypes, that.cloudServiceTypes)
            && Objects.equals(this.chargingModes, that.chargingModes) && Objects.equals(this.siteCode, that.siteCode)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotingItemType, cloudServiceTypes, chargingModes, siteCode, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessDiscountQueryReq {\n");
        sb.append("    quotingItemType: ").append(toIndentedString(quotingItemType)).append("\n");
        sb.append("    cloudServiceTypes: ").append(toIndentedString(cloudServiceTypes)).append("\n");
        sb.append("    chargingModes: ").append(toIndentedString(chargingModes)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
