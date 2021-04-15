package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.BasePage;
import com.huaweicloud.sdk.roma.v2.model.ThrottleForApi;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRequestThrottlingPoliciesBindedToApiV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Long total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttles")
    
    private List<ThrottleForApi> throttles = null;
    
    public ListRequestThrottlingPoliciesBindedToApiV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListRequestThrottlingPoliciesBindedToApiV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    


    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    

    public ListRequestThrottlingPoliciesBindedToApiV2Response withThrottles(List<ThrottleForApi> throttles) {
        this.throttles = throttles;
        return this;
    }

    
    public ListRequestThrottlingPoliciesBindedToApiV2Response addThrottlesItem(ThrottleForApi throttlesItem) {
        if(this.throttles == null) {
            this.throttles = new ArrayList<>();
        }
        this.throttles.add(throttlesItem);
        return this;
    }

    public ListRequestThrottlingPoliciesBindedToApiV2Response withThrottles(Consumer<List<ThrottleForApi>> throttlesSetter) {
        if(this.throttles == null) {
            this.throttles = new ArrayList<>();
        }
        throttlesSetter.accept(this.throttles);
        return this;
    }

    /**
     * 本次查询返回的流控策略列表
     * @return throttles
     */
    public List<ThrottleForApi> getThrottles() {
        return throttles;
    }

    public void setThrottles(List<ThrottleForApi> throttles) {
        this.throttles = throttles;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRequestThrottlingPoliciesBindedToApiV2Response listRequestThrottlingPoliciesBindedToApiV2Response = (ListRequestThrottlingPoliciesBindedToApiV2Response) o;
        return Objects.equals(this.size, listRequestThrottlingPoliciesBindedToApiV2Response.size) &&
            Objects.equals(this.total, listRequestThrottlingPoliciesBindedToApiV2Response.total) &&
            Objects.equals(this.throttles, listRequestThrottlingPoliciesBindedToApiV2Response.throttles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, total, throttles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRequestThrottlingPoliciesBindedToApiV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    throttles: ").append(toIndentedString(throttles)).append("\n");
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

