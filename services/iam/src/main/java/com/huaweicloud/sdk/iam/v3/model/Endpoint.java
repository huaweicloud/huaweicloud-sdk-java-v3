package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Endpoint  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private String serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interface")
    
    private String _interface;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;

    public Endpoint withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 终端节点所属服务的ID。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Endpoint withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * 终端节点所属区域的ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Endpoint withLinks(Links links) {
        this.links = links;
        return this;
    }

    public Endpoint withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Endpoint withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 终端节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Endpoint withInterface(String _interface) {
        this._interface = _interface;
        return this;
    }

    


    /**
     * 终端节点平面。
     * @return _interface
     */
    public String getInterface() {
        return _interface;
    }

    public void setInterface(String _interface) {
        this._interface = _interface;
    }

    public Endpoint withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 终端节点所属区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Endpoint withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 终端节点的地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Endpoint withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * 终端节点是否可用。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoint endpoint = (Endpoint) o;
        return Objects.equals(this.serviceId, endpoint.serviceId) &&
            Objects.equals(this.regionId, endpoint.regionId) &&
            Objects.equals(this.links, endpoint.links) &&
            Objects.equals(this.id, endpoint.id) &&
            Objects.equals(this._interface, endpoint._interface) &&
            Objects.equals(this.region, endpoint.region) &&
            Objects.equals(this.url, endpoint.url) &&
            Objects.equals(this.enabled, endpoint.enabled);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, regionId, links, id, _interface, region, url, enabled);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

