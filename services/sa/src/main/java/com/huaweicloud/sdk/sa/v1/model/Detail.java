package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sa.v1.model.CloudServers;
import com.huaweicloud.sdk.sa.v1.model.Container;
import com.huaweicloud.sdk.sa.v1.model.PublicIps;
import com.huaweicloud.sdk.sa.v1.model.Volumes;
import com.huaweicloud.sdk.sa.v1.model.Vpcs;
import com.huaweicloud.sdk.sa.v1.model.Websites;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 资源详情，例如： \&quot;details\&quot;: {   \&quot;CloudServers\&quot;: {   \&quot;status\&quot;: \&quot;ACTIVE\&quot;,   ...   } }
 */
public class Detail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_servers")
    
    private CloudServers cloudServers;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpcs")
    
    private Vpcs vpcs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ips")
    
    private PublicIps publicIps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes")
    
    private Volumes volumes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="containers")
    
    private Container containers;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="websites")
    
    private Websites websites;

    public Detail withCloudServers(CloudServers cloudServers) {
        this.cloudServers = cloudServers;
        return this;
    }

    public Detail withCloudServers(Consumer<CloudServers> cloudServersSetter) {
        if(this.cloudServers == null ){
            this.cloudServers = new CloudServers();
            cloudServersSetter.accept(this.cloudServers);
        }
        
        return this;
    }


    /**
     * Get cloudServers
     * @return cloudServers
     */
    public CloudServers getCloudServers() {
        return cloudServers;
    }

    public void setCloudServers(CloudServers cloudServers) {
        this.cloudServers = cloudServers;
    }

    

    public Detail withVpcs(Vpcs vpcs) {
        this.vpcs = vpcs;
        return this;
    }

    public Detail withVpcs(Consumer<Vpcs> vpcsSetter) {
        if(this.vpcs == null ){
            this.vpcs = new Vpcs();
            vpcsSetter.accept(this.vpcs);
        }
        
        return this;
    }


    /**
     * Get vpcs
     * @return vpcs
     */
    public Vpcs getVpcs() {
        return vpcs;
    }

    public void setVpcs(Vpcs vpcs) {
        this.vpcs = vpcs;
    }

    

    public Detail withPublicIps(PublicIps publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    public Detail withPublicIps(Consumer<PublicIps> publicIpsSetter) {
        if(this.publicIps == null ){
            this.publicIps = new PublicIps();
            publicIpsSetter.accept(this.publicIps);
        }
        
        return this;
    }


    /**
     * Get publicIps
     * @return publicIps
     */
    public PublicIps getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(PublicIps publicIps) {
        this.publicIps = publicIps;
    }

    

    public Detail withVolumes(Volumes volumes) {
        this.volumes = volumes;
        return this;
    }

    public Detail withVolumes(Consumer<Volumes> volumesSetter) {
        if(this.volumes == null ){
            this.volumes = new Volumes();
            volumesSetter.accept(this.volumes);
        }
        
        return this;
    }


    /**
     * Get volumes
     * @return volumes
     */
    public Volumes getVolumes() {
        return volumes;
    }

    public void setVolumes(Volumes volumes) {
        this.volumes = volumes;
    }

    

    public Detail withContainers(Container containers) {
        this.containers = containers;
        return this;
    }

    public Detail withContainers(Consumer<Container> containersSetter) {
        if(this.containers == null ){
            this.containers = new Container();
            containersSetter.accept(this.containers);
        }
        
        return this;
    }


    /**
     * Get containers
     * @return containers
     */
    public Container getContainers() {
        return containers;
    }

    public void setContainers(Container containers) {
        this.containers = containers;
    }

    

    public Detail withWebsites(Websites websites) {
        this.websites = websites;
        return this;
    }

    public Detail withWebsites(Consumer<Websites> websitesSetter) {
        if(this.websites == null ){
            this.websites = new Websites();
            websitesSetter.accept(this.websites);
        }
        
        return this;
    }


    /**
     * Get websites
     * @return websites
     */
    public Websites getWebsites() {
        return websites;
    }

    public void setWebsites(Websites websites) {
        this.websites = websites;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Detail detail = (Detail) o;
        return Objects.equals(this.cloudServers, detail.cloudServers) &&
            Objects.equals(this.vpcs, detail.vpcs) &&
            Objects.equals(this.publicIps, detail.publicIps) &&
            Objects.equals(this.volumes, detail.volumes) &&
            Objects.equals(this.containers, detail.containers) &&
            Objects.equals(this.websites, detail.websites);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cloudServers, vpcs, publicIps, volumes, containers, websites);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Detail {\n");
        sb.append("    cloudServers: ").append(toIndentedString(cloudServers)).append("\n");
        sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
        sb.append("    websites: ").append(toIndentedString(websites)).append("\n");
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

