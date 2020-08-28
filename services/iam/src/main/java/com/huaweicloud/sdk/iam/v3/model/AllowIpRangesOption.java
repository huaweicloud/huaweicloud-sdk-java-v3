package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class AllowIpRangesOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_range")
    
    private String ipRange;

    public AllowIpRangesOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AllowIpRangesOption withIpRange(String ipRange) {
        this.ipRange = ipRange;
        return this;
    }

    


    /**
     * IP地址区间,例如:0.0.0.0-255.255.255.255。
     * @return ipRange
     */
    public String getIpRange() {
        return ipRange;
    }

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllowIpRangesOption allowIpRangesOption = (AllowIpRangesOption) o;
        return Objects.equals(this.description, allowIpRangesOption.description) &&
            Objects.equals(this.ipRange, allowIpRangesOption.ipRange);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, ipRange);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowIpRangesOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
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

