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
public class CatalogEndpoints  {



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
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;

    public CatalogEndpoints withId(String id) {
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

    public CatalogEndpoints withInterface(String _interface) {
        this._interface = _interface;
        return this;
    }

    


    /**
     * 终端节点平面，public表示为公开。
     * @return _interface
     */
    public String getInterface() {
        return _interface;
    }

    public void setInterface(String _interface) {
        this._interface = _interface;
    }

    public CatalogEndpoints withRegion(String region) {
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

    public CatalogEndpoints withRegionId(String regionId) {
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

    public CatalogEndpoints withUrl(String url) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogEndpoints catalogEndpoints = (CatalogEndpoints) o;
        return Objects.equals(this.id, catalogEndpoints.id) &&
            Objects.equals(this._interface, catalogEndpoints._interface) &&
            Objects.equals(this.region, catalogEndpoints.region) &&
            Objects.equals(this.regionId, catalogEndpoints.regionId) &&
            Objects.equals(this.url, catalogEndpoints.url);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, _interface, region, regionId, url);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogEndpoints {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

