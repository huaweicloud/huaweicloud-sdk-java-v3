package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowQuotasRespQuotasResources
 */
public class ShowQuotasRespQuotasResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    public ShowQuotasRespQuotasResources withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 配额名称。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowQuotasRespQuotasResources withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额数量。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ShowQuotasRespQuotasResources withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用的数量。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public ShowQuotasRespQuotasResources withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 配额调整的最小值。
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public ShowQuotasRespQuotasResources withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 配额调整的最大值。
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
        ShowQuotasRespQuotasResources showQuotasRespQuotasResources = (ShowQuotasRespQuotasResources) o;
        return Objects.equals(this.type, showQuotasRespQuotasResources.type)
            && Objects.equals(this.quota, showQuotasRespQuotasResources.quota)
            && Objects.equals(this.used, showQuotasRespQuotasResources.used)
            && Objects.equals(this.min, showQuotasRespQuotasResources.min)
            && Objects.equals(this.max, showQuotasRespQuotasResources.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, quota, used, min, max);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasRespQuotasResources {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
