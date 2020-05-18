package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * quota详细信息
 */
public class QuotaInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private Integer used;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    
    private Integer quota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min")
    
    private Integer min;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max")
    
    private Integer max;

    public QuotaInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 查询的资源类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QuotaInfo withUsed(Integer used) {
        this.used = used;
        return this;
    }

    


    /**
     * 已使用的资源配额。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public QuotaInfo withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    


    /**
     * 查询出的资源的总配额。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public QuotaInfo withMin(Integer min) {
        this.min = min;
        return this;
    }

    


    /**
     * 资源的最小配额。
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public QuotaInfo withMax(Integer max) {
        this.max = max;
        return this;
    }

    


    /**
     * 资源的最大配额。
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaInfo quotaInfo = (QuotaInfo) o;
        return Objects.equals(this.type, quotaInfo.type) &&
            Objects.equals(this.used, quotaInfo.used) &&
            Objects.equals(this.quota, quotaInfo.quota) &&
            Objects.equals(this.min, quotaInfo.min) &&
            Objects.equals(this.max, quotaInfo.max);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, used, quota, min, max);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaInfo {\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    used: ").append(toIndentedString(used)).append("\n");
            sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
            sb.append("    min: ").append(toIndentedString(min)).append("\n");
            sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

