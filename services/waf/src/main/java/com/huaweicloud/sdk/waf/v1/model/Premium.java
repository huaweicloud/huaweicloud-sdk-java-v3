package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Premium
 */
public class Premium {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "purchased")

    private Boolean purchased;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb")

    private Integer elb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated")

    private Integer dedicated;

    public Premium withPurchased(Boolean purchased) {
        this.purchased = purchased;
        return this;
    }

    /**
     * 是否开通独享模式
     * @return purchased
     */
    public Boolean getPurchased() {
        return purchased;
    }

    public void setPurchased(Boolean purchased) {
        this.purchased = purchased;
    }

    public Premium withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 独享实例数量，包括elb
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Premium withElb(Integer elb) {
        this.elb = elb;
        return this;
    }

    /**
     * elb实例数量
     * @return elb
     */
    public Integer getElb() {
        return elb;
    }

    public void setElb(Integer elb) {
        this.elb = elb;
    }

    public Premium withDedicated(Integer dedicated) {
        this.dedicated = dedicated;
        return this;
    }

    /**
     * 独享WAF实例数量
     * @return dedicated
     */
    public Integer getDedicated() {
        return dedicated;
    }

    public void setDedicated(Integer dedicated) {
        this.dedicated = dedicated;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Premium premium = (Premium) o;
        return Objects.equals(this.purchased, premium.purchased) && Objects.equals(this.total, premium.total)
            && Objects.equals(this.elb, premium.elb) && Objects.equals(this.dedicated, premium.dedicated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchased, total, elb, dedicated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Premium {\n");
        sb.append("    purchased: ").append(toIndentedString(purchased)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    elb: ").append(toIndentedString(elb)).append("\n");
        sb.append("    dedicated: ").append(toIndentedString(dedicated)).append("\n");
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
