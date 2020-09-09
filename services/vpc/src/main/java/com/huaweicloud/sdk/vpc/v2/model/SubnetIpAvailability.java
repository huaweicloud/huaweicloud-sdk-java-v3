package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class SubnetIpAvailability  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_ips")
    
    private Integer usedIps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_name")
    
    private String subnetName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private Integer ipVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_ips")
    
    private Integer totalIps;

    public SubnetIpAvailability withUsedIps(Integer usedIps) {
        this.usedIps = usedIps;
        return this;
    }

    


    /**
     * 子网中已经使用的IP数目（不包含系统预留地址）
     * @return usedIps
     */
    public Integer getUsedIps() {
        return usedIps;
    }

    public void setUsedIps(Integer usedIps) {
        this.usedIps = usedIps;
    }

    public SubnetIpAvailability withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public SubnetIpAvailability withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    


    /**
     * 子网名称
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public SubnetIpAvailability withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * 子网的IP版本，取值为4或者6
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public SubnetIpAvailability withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 子网的CIDR
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public SubnetIpAvailability withTotalIps(Integer totalIps) {
        this.totalIps = totalIps;
        return this;
    }

    


    /**
     * 子网中IP总数（不包含系统预留地址）
     * @return totalIps
     */
    public Integer getTotalIps() {
        return totalIps;
    }

    public void setTotalIps(Integer totalIps) {
        this.totalIps = totalIps;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubnetIpAvailability subnetIpAvailability = (SubnetIpAvailability) o;
        return Objects.equals(this.usedIps, subnetIpAvailability.usedIps) &&
            Objects.equals(this.subnetId, subnetIpAvailability.subnetId) &&
            Objects.equals(this.subnetName, subnetIpAvailability.subnetName) &&
            Objects.equals(this.ipVersion, subnetIpAvailability.ipVersion) &&
            Objects.equals(this.cidr, subnetIpAvailability.cidr) &&
            Objects.equals(this.totalIps, subnetIpAvailability.totalIps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(usedIps, subnetId, subnetName, ipVersion, cidr, totalIps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubnetIpAvailability {\n");
        sb.append("    usedIps: ").append(toIndentedString(usedIps)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    totalIps: ").append(toIndentedString(totalIps)).append("\n");
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

