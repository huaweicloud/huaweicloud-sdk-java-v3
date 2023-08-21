package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEdgeSecSubscriptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_domain_num")

    private Integer wafDomainNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_rule_num")

    private Integer wafRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddos_domain_num")

    private Integer ddosDomainNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_infos")

    private List<EdgeSecProductResource> productInfos = null;

    public ListEdgeSecSubscriptionResponse withWafDomainNum(Integer wafDomainNum) {
        this.wafDomainNum = wafDomainNum;
        return this;
    }

    /**
     * 已经添加的WAF防护域名数量
     * @return wafDomainNum
     */
    public Integer getWafDomainNum() {
        return wafDomainNum;
    }

    public void setWafDomainNum(Integer wafDomainNum) {
        this.wafDomainNum = wafDomainNum;
    }

    public ListEdgeSecSubscriptionResponse withWafRuleNum(Integer wafRuleNum) {
        this.wafRuleNum = wafRuleNum;
        return this;
    }

    /**
     * 已经添加的WAF IP黑白规则数量
     * @return wafRuleNum
     */
    public Integer getWafRuleNum() {
        return wafRuleNum;
    }

    public void setWafRuleNum(Integer wafRuleNum) {
        this.wafRuleNum = wafRuleNum;
    }

    public ListEdgeSecSubscriptionResponse withDdosDomainNum(Integer ddosDomainNum) {
        this.ddosDomainNum = ddosDomainNum;
        return this;
    }

    /**
     * 已经添加的DDoS防护域名数量
     * @return ddosDomainNum
     */
    public Integer getDdosDomainNum() {
        return ddosDomainNum;
    }

    public void setDdosDomainNum(Integer ddosDomainNum) {
        this.ddosDomainNum = ddosDomainNum;
    }

    public ListEdgeSecSubscriptionResponse withProductInfos(List<EdgeSecProductResource> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    public ListEdgeSecSubscriptionResponse addProductInfosItem(EdgeSecProductResource productInfosItem) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        this.productInfos.add(productInfosItem);
        return this;
    }

    public ListEdgeSecSubscriptionResponse withProductInfos(Consumer<List<EdgeSecProductResource>> productInfosSetter) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * 产品信息
     * @return productInfos
     */
    public List<EdgeSecProductResource> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<EdgeSecProductResource> productInfos) {
        this.productInfos = productInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEdgeSecSubscriptionResponse that = (ListEdgeSecSubscriptionResponse) obj;
        return Objects.equals(this.wafDomainNum, that.wafDomainNum) && Objects.equals(this.wafRuleNum, that.wafRuleNum)
            && Objects.equals(this.ddosDomainNum, that.ddosDomainNum)
            && Objects.equals(this.productInfos, that.productInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wafDomainNum, wafRuleNum, ddosDomainNum, productInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeSecSubscriptionResponse {\n");
        sb.append("    wafDomainNum: ").append(toIndentedString(wafDomainNum)).append("\n");
        sb.append("    wafRuleNum: ").append(toIndentedString(wafRuleNum)).append("\n");
        sb.append("    ddosDomainNum: ").append(toIndentedString(ddosDomainNum)).append("\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
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
