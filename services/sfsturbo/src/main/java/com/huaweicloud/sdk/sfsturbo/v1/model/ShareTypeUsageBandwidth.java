package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShareTypeUsageBandwidth
 */
public class ShareTypeUsageBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private Integer usage;

    public ShareTypeUsageBandwidth withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总带宽
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShareTypeUsageBandwidth withUsage(Integer usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 已用带宽
     * @return usage
     */
    public Integer getUsage() {
        return usage;
    }

    public void setUsage(Integer usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareTypeUsageBandwidth that = (ShareTypeUsageBandwidth) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareTypeUsageBandwidth {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
