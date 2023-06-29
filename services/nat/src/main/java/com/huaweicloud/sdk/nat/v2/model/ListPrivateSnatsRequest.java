package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListPrivateSnatsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private List<String> gatewayId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private List<String> cidr = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private List<String> virsubnetId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_id")

    private List<String> transitIpId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_address")

    private List<String> transitIpAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    public ListPrivateSnatsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 功能说明：每页返回的个数。 取值范围：0~2000。 默认值：2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPrivateSnatsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 功能说明：分页查询起始的资源ID，为空时查询第一页。 值从上一次查询的PageInfo中的next_marker或者previous_marker中获取。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListPrivateSnatsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 是否查询前一页。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListPrivateSnatsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListPrivateSnatsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListPrivateSnatsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * SNAT规则的ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListPrivateSnatsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListPrivateSnatsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListPrivateSnatsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * SNAT规则的描述。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListPrivateSnatsRequest withGatewayId(List<String> gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public ListPrivateSnatsRequest addGatewayIdItem(String gatewayIdItem) {
        if (this.gatewayId == null) {
            this.gatewayId = new ArrayList<>();
        }
        this.gatewayId.add(gatewayIdItem);
        return this;
    }

    public ListPrivateSnatsRequest withGatewayId(Consumer<List<String>> gatewayIdSetter) {
        if (this.gatewayId == null) {
            this.gatewayId = new ArrayList<>();
        }
        gatewayIdSetter.accept(this.gatewayId);
        return this;
    }

    /**
     * 私网NAT网关实例的ID。
     * @return gatewayId
     */
    public List<String> getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(List<String> gatewayId) {
        this.gatewayId = gatewayId;
    }

    public ListPrivateSnatsRequest withCidr(List<String> cidr) {
        this.cidr = cidr;
        return this;
    }

    public ListPrivateSnatsRequest addCidrItem(String cidrItem) {
        if (this.cidr == null) {
            this.cidr = new ArrayList<>();
        }
        this.cidr.add(cidrItem);
        return this;
    }

    public ListPrivateSnatsRequest withCidr(Consumer<List<String>> cidrSetter) {
        if (this.cidr == null) {
            this.cidr = new ArrayList<>();
        }
        cidrSetter.accept(this.cidr);
        return this;
    }

    /**
     * 规则匹配的CIDR。
     * @return cidr
     */
    public List<String> getCidr() {
        return cidr;
    }

    public void setCidr(List<String> cidr) {
        this.cidr = cidr;
    }

    public ListPrivateSnatsRequest withVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    public ListPrivateSnatsRequest addVirsubnetIdItem(String virsubnetIdItem) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        this.virsubnetId.add(virsubnetIdItem);
        return this;
    }

    public ListPrivateSnatsRequest withVirsubnetId(Consumer<List<String>> virsubnetIdSetter) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        virsubnetIdSetter.accept(this.virsubnetId);
        return this;
    }

    /**
     * 规则匹配的子网的ID。
     * @return virsubnetId
     */
    public List<String> getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public ListPrivateSnatsRequest withTransitIpId(List<String> transitIpId) {
        this.transitIpId = transitIpId;
        return this;
    }

    public ListPrivateSnatsRequest addTransitIpIdItem(String transitIpIdItem) {
        if (this.transitIpId == null) {
            this.transitIpId = new ArrayList<>();
        }
        this.transitIpId.add(transitIpIdItem);
        return this;
    }

    public ListPrivateSnatsRequest withTransitIpId(Consumer<List<String>> transitIpIdSetter) {
        if (this.transitIpId == null) {
            this.transitIpId = new ArrayList<>();
        }
        transitIpIdSetter.accept(this.transitIpId);
        return this;
    }

    /**
     * 中转IP的ID。
     * @return transitIpId
     */
    public List<String> getTransitIpId() {
        return transitIpId;
    }

    public void setTransitIpId(List<String> transitIpId) {
        this.transitIpId = transitIpId;
    }

    public ListPrivateSnatsRequest withTransitIpAddress(List<String> transitIpAddress) {
        this.transitIpAddress = transitIpAddress;
        return this;
    }

    public ListPrivateSnatsRequest addTransitIpAddressItem(String transitIpAddressItem) {
        if (this.transitIpAddress == null) {
            this.transitIpAddress = new ArrayList<>();
        }
        this.transitIpAddress.add(transitIpAddressItem);
        return this;
    }

    public ListPrivateSnatsRequest withTransitIpAddress(Consumer<List<String>> transitIpAddressSetter) {
        if (this.transitIpAddress == null) {
            this.transitIpAddress = new ArrayList<>();
        }
        transitIpAddressSetter.accept(this.transitIpAddress);
        return this;
    }

    /**
     * 中转IP地址。
     * @return transitIpAddress
     */
    public List<String> getTransitIpAddress() {
        return transitIpAddress;
    }

    public void setTransitIpAddress(List<String> transitIpAddress) {
        this.transitIpAddress = transitIpAddress;
    }

    public ListPrivateSnatsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListPrivateSnatsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListPrivateSnatsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目ID。创建SNAT规则时，关联的企业项目ID。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPrivateSnatsRequest that = (ListPrivateSnatsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.pageReverse, that.pageReverse) && Objects.equals(this.id, that.id)
            && Objects.equals(this.description, that.description) && Objects.equals(this.gatewayId, that.gatewayId)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.transitIpId, that.transitIpId)
            && Objects.equals(this.transitIpAddress, that.transitIpAddress)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            pageReverse,
            id,
            description,
            gatewayId,
            cidr,
            virsubnetId,
            transitIpId,
            transitIpAddress,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateSnatsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    transitIpId: ").append(toIndentedString(transitIpId)).append("\n");
        sb.append("    transitIpAddress: ").append(toIndentedString(transitIpAddress)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
