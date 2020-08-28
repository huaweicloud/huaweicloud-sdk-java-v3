package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CountPreoccupyIpNumRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_flavor_id")
    
    private String l7FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_target_enable")
    
    private Boolean ipTargetEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private Boolean ipVersion = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer_id")
    
    private String loadbalancerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_number")
    
    private Integer availabilityZoneNumber;

    public CountPreoccupyIpNumRequest withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    


    /**
     * Get l7FlavorId
     * @return l7FlavorId
     */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public CountPreoccupyIpNumRequest withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    


    /**
     * Get ipTargetEnable
     * @return ipTargetEnable
     */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    public CountPreoccupyIpNumRequest withIpVersion(Boolean ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * Get ipVersion
     * @return ipVersion
     */
    public Boolean getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Boolean ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CountPreoccupyIpNumRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    


    /**
     * Get loadbalancerId
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CountPreoccupyIpNumRequest withAvailabilityZoneNumber(Integer availabilityZoneNumber) {
        this.availabilityZoneNumber = availabilityZoneNumber;
        return this;
    }

    


    /**
     * Get availabilityZoneNumber
     * @return availabilityZoneNumber
     */
    public Integer getAvailabilityZoneNumber() {
        return availabilityZoneNumber;
    }

    public void setAvailabilityZoneNumber(Integer availabilityZoneNumber) {
        this.availabilityZoneNumber = availabilityZoneNumber;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountPreoccupyIpNumRequest countPreoccupyIpNumRequest = (CountPreoccupyIpNumRequest) o;
        return Objects.equals(this.l7FlavorId, countPreoccupyIpNumRequest.l7FlavorId) &&
            Objects.equals(this.ipTargetEnable, countPreoccupyIpNumRequest.ipTargetEnable) &&
            Objects.equals(this.ipVersion, countPreoccupyIpNumRequest.ipVersion) &&
            Objects.equals(this.loadbalancerId, countPreoccupyIpNumRequest.loadbalancerId) &&
            Objects.equals(this.availabilityZoneNumber, countPreoccupyIpNumRequest.availabilityZoneNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(l7FlavorId, ipTargetEnable, ipVersion, loadbalancerId, availabilityZoneNumber);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountPreoccupyIpNumRequest {\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    ipTargetEnable: ").append(toIndentedString(ipTargetEnable)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    availabilityZoneNumber: ").append(toIndentedString(availabilityZoneNumber)).append("\n");
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

