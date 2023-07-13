package com.huaweicloud.sdk.apig.v2.model;

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
public class ListSpecialThrottlingConfigurationsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throttle_specials")

    private List<ThrottleSpecialInfo> throttleSpecials = null;

    public ListSpecialThrottlingConfigurationsV2Response withSize(Integer size) {
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

    public ListSpecialThrottlingConfigurationsV2Response withTotal(Long total) {
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

    public ListSpecialThrottlingConfigurationsV2Response withThrottleSpecials(
        List<ThrottleSpecialInfo> throttleSpecials) {
        this.throttleSpecials = throttleSpecials;
        return this;
    }

    public ListSpecialThrottlingConfigurationsV2Response addThrottleSpecialsItem(
        ThrottleSpecialInfo throttleSpecialsItem) {
        if (this.throttleSpecials == null) {
            this.throttleSpecials = new ArrayList<>();
        }
        this.throttleSpecials.add(throttleSpecialsItem);
        return this;
    }

    public ListSpecialThrottlingConfigurationsV2Response withThrottleSpecials(
        Consumer<List<ThrottleSpecialInfo>> throttleSpecialsSetter) {
        if (this.throttleSpecials == null) {
            this.throttleSpecials = new ArrayList<>();
        }
        throttleSpecialsSetter.accept(this.throttleSpecials);
        return this;
    }

    /**
     * 本次查询返回的特殊配置列表
     * @return throttleSpecials
     */
    public List<ThrottleSpecialInfo> getThrottleSpecials() {
        return throttleSpecials;
    }

    public void setThrottleSpecials(List<ThrottleSpecialInfo> throttleSpecials) {
        this.throttleSpecials = throttleSpecials;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSpecialThrottlingConfigurationsV2Response that = (ListSpecialThrottlingConfigurationsV2Response) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.throttleSpecials, that.throttleSpecials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, throttleSpecials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecialThrottlingConfigurationsV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
