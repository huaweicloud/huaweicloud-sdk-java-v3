package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额信息
 */
public class QuotaResponseDdosQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current")

    private Integer current;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    public QuotaResponseDdosQuota withCurrent(Integer current) {
        this.current = current;
        return this;
    }

    /**
     * 当前用户已使用配额
     * @return current
     */
    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public QuotaResponseDdosQuota withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 最大配额
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaResponseDdosQuota that = (QuotaResponseDdosQuota) obj;
        return Objects.equals(this.current, that.current) && Objects.equals(this.quota, that.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaResponseDdosQuota {\n");
        sb.append("    current: ").append(toIndentedString(current)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
