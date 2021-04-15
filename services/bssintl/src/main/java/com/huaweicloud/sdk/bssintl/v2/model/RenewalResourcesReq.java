package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RenewalResourcesReq
 */
public class RenewalResourcesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_type")
    
    private Integer periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_num")
    
    private Integer periodNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_policy")
    
    private Integer expirePolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_pay")
    
    private Integer isAutoPay;

    public RenewalResourcesReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public RenewalResourcesReq addResourceIdsItem(String resourceIdsItem) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public RenewalResourcesReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * |参数名称：资源ID列表。只支持传入主资源ID，最多100个资源ID。哪些资源是主资源请根据“2.1-查询客户包周期资源列表”接口响应参数中的“is_main_resource”来标识。| |参数约束以及描述：资源ID列表。只支持传入主资源ID，最多100个资源ID。哪些资源是主资源请根据“2.1-查询客户包周期资源列表”接口响应参数中的“is_main_resource”来标识。|
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    

    public RenewalResourcesReq withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * |参数名称：周期类型：2：月；3：年| |参数的约束及描述：周期类型：2：月；3：年|
     * minimum: 2
     * maximum: 3
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    

    public RenewalResourcesReq withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    


    /**
     * |参数名称：周期数目：如果是月，目前支持1-11；如果是年，目前支持1-3| |参数的约束及描述：周期数目：如果是月，目前支持1-11；如果是年，目前支持1-3|
     * minimum: 1
     * maximum: 11
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    

    public RenewalResourcesReq withExpirePolicy(Integer expirePolicy) {
        this.expirePolicy = expirePolicy;
        return this;
    }

    


    /**
     * |参数名称：到期策略：0：进入宽限期1：转按需2：自动退订3：自动续订| |参数的约束及描述：到期策略：0：进入宽限期1：转按需2：自动退订3：自动续订|
     * minimum: 0
     * maximum: 3
     * @return expirePolicy
     */
    public Integer getExpirePolicy() {
        return expirePolicy;
    }

    public void setExpirePolicy(Integer expirePolicy) {
        this.expirePolicy = expirePolicy;
    }

    

    public RenewalResourcesReq withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * |参数名称：是否自动支付。0：否1：是不填写的话，默认值是0，不自动支付。| |参数的约束及描述：是否自动支付。0：否1：是不填写的话，默认值是0，不自动支付。|
     * minimum: 0
     * maximum: 1
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenewalResourcesReq renewalResourcesReq = (RenewalResourcesReq) o;
        return Objects.equals(this.resourceIds, renewalResourcesReq.resourceIds) &&
            Objects.equals(this.periodType, renewalResourcesReq.periodType) &&
            Objects.equals(this.periodNum, renewalResourcesReq.periodNum) &&
            Objects.equals(this.expirePolicy, renewalResourcesReq.expirePolicy) &&
            Objects.equals(this.isAutoPay, renewalResourcesReq.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceIds, periodType, periodNum, expirePolicy, isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenewalResourcesReq {\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    expirePolicy: ").append(toIndentedString(expirePolicy)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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

