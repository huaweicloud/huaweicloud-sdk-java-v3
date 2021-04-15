package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sa.v1.model.Addresses;
import com.huaweicloud.sdk.sa.v1.model.Flavor;
import com.huaweicloud.sdk.sa.v1.model.Metadata;
import com.huaweicloud.sdk.sa.v1.model.SecurityGroups;
import com.huaweicloud.sdk.sa.v1.model.VolumesAttached;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CloudServers
 */
public class CloudServers  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addresses")
    
    private List<Addresses> addresses = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private Flavor flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<SecurityGroups> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Metadata metadata;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_id")
    
    private String hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_status")
    
    private String hostStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes_attached")
    
    private List<VolumesAttached> volumesAttached = null;
    
    public CloudServers withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 弹性云服务器状态。 取值范围： ACTIVE、BUILD、ERROR、HARD_REBOOT、MIGRATING、REBOOT、REBUILD、RESIZE、REVERT_RESIZE、SHUTOFF、VERIFY_RESIZE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public CloudServers withAddresses(List<Addresses> addresses) {
        this.addresses = addresses;
        return this;
    }

    
    public CloudServers addAddressesItem(Addresses addressesItem) {
        if(this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public CloudServers withAddresses(Consumer<List<Addresses>> addressesSetter) {
        if(this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 弹性云服务器的网络属性。
     * @return addresses
     */
    public List<Addresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Addresses> addresses) {
        this.addresses = addresses;
    }

    

    public CloudServers withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public CloudServers withFlavor(Consumer<Flavor> flavorSetter) {
        if(this.flavor == null ){
            this.flavor = new Flavor();
            flavorSetter.accept(this.flavor);
        }
        
        return this;
    }


    /**
     * Get flavor
     * @return flavor
     */
    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    

    public CloudServers withSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public CloudServers addSecurityGroupsItem(SecurityGroups securityGroupsItem) {
        if(this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CloudServers withSecurityGroups(Consumer<List<SecurityGroups>> securityGroupsSetter) {
        if(this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 弹性云服务器所属安全组列表。
     * @return securityGroups
     */
    public List<SecurityGroups> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
    }

    

    public CloudServers withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CloudServers withMetadata(Consumer<Metadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    

    public CloudServers withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 弹性云服务器所在主机的主机ID。
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    

    public CloudServers withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    


    /**
     * 云服务器所在主机状态。 UP：服务正常； UNKNOWN：状态未知； DOWN：服务异常； MAINTENANCE：维护状态； 空字符串：弹性云服务器无主机信息。
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    

    public CloudServers withVolumesAttached(List<VolumesAttached> volumesAttached) {
        this.volumesAttached = volumesAttached;
        return this;
    }

    
    public CloudServers addVolumesAttachedItem(VolumesAttached volumesAttachedItem) {
        if(this.volumesAttached == null) {
            this.volumesAttached = new ArrayList<>();
        }
        this.volumesAttached.add(volumesAttachedItem);
        return this;
    }

    public CloudServers withVolumesAttached(Consumer<List<VolumesAttached>> volumesAttachedSetter) {
        if(this.volumesAttached == null) {
            this.volumesAttached = new ArrayList<>();
        }
        volumesAttachedSetter.accept(this.volumesAttached);
        return this;
    }

    /**
     * 挂载到弹性云服务器上的磁盘。
     * @return volumesAttached
     */
    public List<VolumesAttached> getVolumesAttached() {
        return volumesAttached;
    }

    public void setVolumesAttached(List<VolumesAttached> volumesAttached) {
        this.volumesAttached = volumesAttached;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudServers cloudServers = (CloudServers) o;
        return Objects.equals(this.status, cloudServers.status) &&
            Objects.equals(this.addresses, cloudServers.addresses) &&
            Objects.equals(this.flavor, cloudServers.flavor) &&
            Objects.equals(this.securityGroups, cloudServers.securityGroups) &&
            Objects.equals(this.metadata, cloudServers.metadata) &&
            Objects.equals(this.hostId, cloudServers.hostId) &&
            Objects.equals(this.hostStatus, cloudServers.hostStatus) &&
            Objects.equals(this.volumesAttached, cloudServers.volumesAttached);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, addresses, flavor, securityGroups, metadata, hostId, hostStatus, volumesAttached);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudServers {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
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

