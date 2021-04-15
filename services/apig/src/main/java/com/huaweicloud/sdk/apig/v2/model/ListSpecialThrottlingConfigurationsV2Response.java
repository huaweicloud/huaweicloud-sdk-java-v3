package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.ThrottleSpecialResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSpecialThrottlingConfigurationsV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttle_specials")
    
    private List<ThrottleSpecialResp> throttleSpecials = null;
    
    public ListSpecialThrottlingConfigurationsV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 符合条件的特殊设置总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListSpecialThrottlingConfigurationsV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次查询返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListSpecialThrottlingConfigurationsV2Response withThrottleSpecials(List<ThrottleSpecialResp> throttleSpecials) {
        this.throttleSpecials = throttleSpecials;
        return this;
    }

    
    public ListSpecialThrottlingConfigurationsV2Response addThrottleSpecialsItem(ThrottleSpecialResp throttleSpecialsItem) {
        if(this.throttleSpecials == null) {
            this.throttleSpecials = new ArrayList<>();
        }
        this.throttleSpecials.add(throttleSpecialsItem);
        return this;
    }

    public ListSpecialThrottlingConfigurationsV2Response withThrottleSpecials(Consumer<List<ThrottleSpecialResp>> throttleSpecialsSetter) {
        if(this.throttleSpecials == null) {
            this.throttleSpecials = new ArrayList<>();
        }
        throttleSpecialsSetter.accept(this.throttleSpecials);
        return this;
    }

    /**
     * 本次查询返回的特殊配置列表
     * @return throttleSpecials
     */
    public List<ThrottleSpecialResp> getThrottleSpecials() {
        return throttleSpecials;
    }

    public void setThrottleSpecials(List<ThrottleSpecialResp> throttleSpecials) {
        this.throttleSpecials = throttleSpecials;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSpecialThrottlingConfigurationsV2Response listSpecialThrottlingConfigurationsV2Response = (ListSpecialThrottlingConfigurationsV2Response) o;
        return Objects.equals(this.total, listSpecialThrottlingConfigurationsV2Response.total) &&
            Objects.equals(this.size, listSpecialThrottlingConfigurationsV2Response.size) &&
            Objects.equals(this.throttleSpecials, listSpecialThrottlingConfigurationsV2Response.throttleSpecials);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, throttleSpecials);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecialThrottlingConfigurationsV2Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    throttleSpecials: ").append(toIndentedString(throttleSpecials)).append("\n");
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

