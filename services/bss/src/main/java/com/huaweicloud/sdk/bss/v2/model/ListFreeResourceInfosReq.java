package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListFreeResourceInfosReq
 */
public class ListFreeResourceInfosReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code_list")

    private List<String> serviceTypeCodeList = null;

    public ListFreeResourceInfosReq withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ListFreeResourceInfosReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ListFreeResourceInfosReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID，即资源包ID。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ListFreeResourceInfosReq withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 产品名称，即资源包名称。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ListFreeResourceInfosReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListFreeResourceInfosReq withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态： 0：未生效1：生效中2：已用完3：已失效4：已退订 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * minimum: 0
     * maximum: 4
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListFreeResourceInfosReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始，默认为0。  说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。 例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFreeResourceInfosReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的记录数，默认为10。
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

    public ListFreeResourceInfosReq withServiceTypeCodeList(List<String> serviceTypeCodeList) {
        this.serviceTypeCodeList = serviceTypeCodeList;
        return this;
    }

    public ListFreeResourceInfosReq addServiceTypeCodeListItem(String serviceTypeCodeListItem) {
        if (this.serviceTypeCodeList == null) {
            this.serviceTypeCodeList = new ArrayList<>();
        }
        this.serviceTypeCodeList.add(serviceTypeCodeListItem);
        return this;
    }

    public ListFreeResourceInfosReq withServiceTypeCodeList(Consumer<List<String>> serviceTypeCodeListSetter) {
        if (this.serviceTypeCodeList == null) {
            this.serviceTypeCodeList = new ArrayList<>();
        }
        serviceTypeCodeListSetter.accept(this.serviceTypeCodeList);
        return this;
    }

    /**
     * 云服务类型编码列表，大小写不敏感。 例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。 此参数不携带或携带值为空列表或携带值为null时，不作为筛选条件，返回其他条件匹配的记录。
     * @return serviceTypeCodeList
     */
    public List<String> getServiceTypeCodeList() {
        return serviceTypeCodeList;
    }

    public void setServiceTypeCodeList(List<String> serviceTypeCodeList) {
        this.serviceTypeCodeList = serviceTypeCodeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFreeResourceInfosReq that = (ListFreeResourceInfosReq) obj;
        return Objects.equals(this.regionCode, that.regionCode) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.serviceTypeCodeList, that.serviceTypeCodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCode,
            orderId,
            productId,
            productName,
            enterpriseProjectId,
            status,
            offset,
            limit,
            serviceTypeCodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourceInfosReq {\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    serviceTypeCodeList: ").append(toIndentedString(serviceTypeCodeList)).append("\n");
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
