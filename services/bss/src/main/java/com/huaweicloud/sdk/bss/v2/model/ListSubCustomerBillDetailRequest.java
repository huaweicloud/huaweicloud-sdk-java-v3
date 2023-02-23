package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSubCustomerBillDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle")

    private String billCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_detail_type")

    private Integer billDetailType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_manager_id")

    private String accountManagerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_type")

    private String associationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_date_begin")

    private String billDateBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_date_end")

    private String billDateEnd;

    public ListSubCustomerBillDetailRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言。忽略大小写，默认 zh_cn：中文 en_us：英文
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListSubCustomerBillDetailRequest withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /**
     * 账期所在月份。格式：YYYY-MM
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public ListSubCustomerBillDetailRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。您可以调用[查询客户列表](https://support.huaweicloud.com/api-bpconsole/mc_00021.html)接口获取customer_id。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ListSubCustomerBillDetailRequest withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用[查询云服务类型列表](https://support.huaweicloud.com/api-bpconsole/zh-cn_topic_0000001256679455.html)接口获取。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串或携带值为null时，作为筛选条件。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public ListSubCustomerBillDetailRequest withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)对应云服务的“区域”列的值。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串或携带值为null时，作为筛选条件。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ListSubCustomerBillDetailRequest withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。1：包周期3：按需10：预留实例此参数不携带或携带值为空时，默认查询所有计费模式下的消费记录；携带值为空串或携带值为null时，作为筛选条件。
     * minimum: 0
     * maximum: 64
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListSubCustomerBillDetailRequest withBillDetailType(Integer billDetailType) {
        this.billDetailType = billDetailType;
        return this;
    }

    /**
     * 账单类型。1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费16：调账-扣费18：消费-按月付费20：退款-变更 此参数不携带或携带值为空时，不作为筛选条件；携带值为空串或携带值为null时，作为筛选条件。
     * minimum: 0
     * maximum: 127
     * @return billDetailType
     */
    public Integer getBillDetailType() {
        return billDetailType;
    }

    public void setBillDetailType(Integer billDetailType) {
        this.billDetailType = billDetailType;
    }

    public ListSubCustomerBillDetailRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源标识。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串或携带值为null时，作为筛选条件。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListSubCustomerBillDetailRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串或携带值为null时，作为筛选条件。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListSubCustomerBillDetailRequest withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * 订单ID或交易ID，扣费维度的唯一标识。账单类型为1，2，3，4，8时为订单ID。其它场景下为交易ID。非月末扣费：应收ID月末扣费：账单ID 此参数不携带或携带值为空时，不作为筛选条件；携带值为空串或携带值为null时，作为筛选条件。
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public ListSubCustomerBillDetailRequest withAccountManagerId(String accountManagerId) {
        this.accountManagerId = accountManagerId;
        return this;
    }

    /**
     * 客户经理标识。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串或携带值为null时，作为筛选条件。
     * @return accountManagerId
     */
    public String getAccountManagerId() {
        return accountManagerId;
    }

    public void setAccountManagerId(String accountManagerId) {
        this.accountManagerId = accountManagerId;
    }

    public ListSubCustomerBillDetailRequest withAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * 子客户的关联类型：1：顾问销售2：代售 此参数不携带或携带值为空时，不作为筛选条件；携带值为空串或携带值为null时，作为筛选条件。
     * @return associationType
     */
    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public ListSubCustomerBillDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。默认值为0。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
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

    public ListSubCustomerBillDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的数量限制。默认值为10。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSubCustomerBillDetailRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见[查询云经销商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。  说明： 华为云总经销商可以查询名下所有子客户消费（包括云经销商子客户）。如果是普通经销商，那么此处可以为空。如果华为云总经销商需要查询客户在云经销商关联期间的消费，需要携带该字段；除此之外，此参数不做处理。否则只能查询该客户在与自己关联期间的消费。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public ListSubCustomerBillDetailRequest withBillDateBegin(String billDateBegin) {
        this.billDateBegin = billDateBegin;
        return this;
    }

    /**
     * 查询的资源消费记录的开始日期，格式为YYYY-MM-DD。此参数不携带或携带值为空时，不作为筛选条件；不支持携带值为空串。 说明： 必须和cycle（即资源的消费账期）在同一个月。
     * @return billDateBegin
     */
    public String getBillDateBegin() {
        return billDateBegin;
    }

    public void setBillDateBegin(String billDateBegin) {
        this.billDateBegin = billDateBegin;
    }

    public ListSubCustomerBillDetailRequest withBillDateEnd(String billDateEnd) {
        this.billDateEnd = billDateEnd;
        return this;
    }

    /**
     * 查询的资源消费记录的结束日期，格式为YYYY-MM-DD。此参数不携带或携带值为空时，不作为筛选条件；不支持携带值为空串。 说明： 必须和cycle（即资源的消费账期）在同一个月。bill_date_begin和bill_date_end两个参数必须同时出现，否则仅按照cycle（即资源的消费账期）进行查询。
     * @return billDateEnd
     */
    public String getBillDateEnd() {
        return billDateEnd;
    }

    public void setBillDateEnd(String billDateEnd) {
        this.billDateEnd = billDateEnd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubCustomerBillDetailRequest listSubCustomerBillDetailRequest = (ListSubCustomerBillDetailRequest) o;
        return Objects.equals(this.xLanguage, listSubCustomerBillDetailRequest.xLanguage)
            && Objects.equals(this.billCycle, listSubCustomerBillDetailRequest.billCycle)
            && Objects.equals(this.customerId, listSubCustomerBillDetailRequest.customerId)
            && Objects.equals(this.serviceTypeCode, listSubCustomerBillDetailRequest.serviceTypeCode)
            && Objects.equals(this.regionCode, listSubCustomerBillDetailRequest.regionCode)
            && Objects.equals(this.chargingMode, listSubCustomerBillDetailRequest.chargingMode)
            && Objects.equals(this.billDetailType, listSubCustomerBillDetailRequest.billDetailType)
            && Objects.equals(this.resourceId, listSubCustomerBillDetailRequest.resourceId)
            && Objects.equals(this.resourceName, listSubCustomerBillDetailRequest.resourceName)
            && Objects.equals(this.tradeId, listSubCustomerBillDetailRequest.tradeId)
            && Objects.equals(this.accountManagerId, listSubCustomerBillDetailRequest.accountManagerId)
            && Objects.equals(this.associationType, listSubCustomerBillDetailRequest.associationType)
            && Objects.equals(this.offset, listSubCustomerBillDetailRequest.offset)
            && Objects.equals(this.limit, listSubCustomerBillDetailRequest.limit)
            && Objects.equals(this.indirectPartnerId, listSubCustomerBillDetailRequest.indirectPartnerId)
            && Objects.equals(this.billDateBegin, listSubCustomerBillDetailRequest.billDateBegin)
            && Objects.equals(this.billDateEnd, listSubCustomerBillDetailRequest.billDateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage,
            billCycle,
            customerId,
            serviceTypeCode,
            regionCode,
            chargingMode,
            billDetailType,
            resourceId,
            resourceName,
            tradeId,
            accountManagerId,
            associationType,
            offset,
            limit,
            indirectPartnerId,
            billDateBegin,
            billDateEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerBillDetailRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    billDetailType: ").append(toIndentedString(billDetailType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    accountManagerId: ").append(toIndentedString(accountManagerId)).append("\n");
        sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    billDateBegin: ").append(toIndentedString(billDateBegin)).append("\n");
        sb.append("    billDateEnd: ").append(toIndentedString(billDateEnd)).append("\n");
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
