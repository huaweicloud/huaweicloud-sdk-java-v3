package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 所有类型的资源可用数量
 */
public class ResourceAvailableNums {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexus")

    private Integer flexus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic")

    private Integer basic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle")

    private Integer middle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle_on_demand")

    private Integer middleOnDemand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advance")

    private Integer advance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_party_cmww")

    private Integer thirdPartyCmww;

    public ResourceAvailableNums withFlexus(Integer flexus) {
        this.flexus = flexus;
        return this;
    }

    /**
     * flexus版资源数。
     * minimum: 0
     * maximum: 1000000
     * @return flexus
     */
    public Integer getFlexus() {
        return flexus;
    }

    public void setFlexus(Integer flexus) {
        this.flexus = flexus;
    }

    public ResourceAvailableNums withBasic(Integer basic) {
        this.basic = basic;
        return this;
    }

    /**
     * 基础版资源数。
     * minimum: 0
     * maximum: 1000000
     * @return basic
     */
    public Integer getBasic() {
        return basic;
    }

    public void setBasic(Integer basic) {
        this.basic = basic;
    }

    public ResourceAvailableNums withMiddle(Integer middle) {
        this.middle = middle;
        return this;
    }

    /**
     * 进阶版资源数。
     * minimum: 0
     * maximum: 1000000
     * @return middle
     */
    public Integer getMiddle() {
        return middle;
    }

    public void setMiddle(Integer middle) {
        this.middle = middle;
    }

    public ResourceAvailableNums withMiddleOnDemand(Integer middleOnDemand) {
        this.middleOnDemand = middleOnDemand;
        return this;
    }

    /**
     * 进阶测试版资源数。
     * minimum: 0
     * maximum: 1000000
     * @return middleOnDemand
     */
    public Integer getMiddleOnDemand() {
        return middleOnDemand;
    }

    public void setMiddleOnDemand(Integer middleOnDemand) {
        this.middleOnDemand = middleOnDemand;
    }

    public ResourceAvailableNums withAdvance(Integer advance) {
        this.advance = advance;
        return this;
    }

    /**
     * 高级版资源数。
     * minimum: 0
     * maximum: 1000000
     * @return advance
     */
    public Integer getAdvance() {
        return advance;
    }

    public void setAdvance(Integer advance) {
        this.advance = advance;
    }

    public ResourceAvailableNums withThirdPartyCmww(Integer thirdPartyCmww) {
        this.thirdPartyCmww = thirdPartyCmww;
        return this;
    }

    /**
     * 出门问问资源数。
     * minimum: 0
     * maximum: 1000000
     * @return thirdPartyCmww
     */
    public Integer getThirdPartyCmww() {
        return thirdPartyCmww;
    }

    public void setThirdPartyCmww(Integer thirdPartyCmww) {
        this.thirdPartyCmww = thirdPartyCmww;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceAvailableNums that = (ResourceAvailableNums) obj;
        return Objects.equals(this.flexus, that.flexus) && Objects.equals(this.basic, that.basic)
            && Objects.equals(this.middle, that.middle) && Objects.equals(this.middleOnDemand, that.middleOnDemand)
            && Objects.equals(this.advance, that.advance) && Objects.equals(this.thirdPartyCmww, that.thirdPartyCmww);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flexus, basic, middle, middleOnDemand, advance, thirdPartyCmww);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceAvailableNums {\n");
        sb.append("    flexus: ").append(toIndentedString(flexus)).append("\n");
        sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
        sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
        sb.append("    middleOnDemand: ").append(toIndentedString(middleOnDemand)).append("\n");
        sb.append("    advance: ").append(toIndentedString(advance)).append("\n");
        sb.append("    thirdPartyCmww: ").append(toIndentedString(thirdPartyCmww)).append("\n");
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
