package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class TokenCatalogEndpoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    @JacksonXmlProperty(localName = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface")

    @JacksonXmlProperty(localName = "interface")

    private String _interface;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    public TokenCatalogEndpoint withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 终端节点的URL。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TokenCatalogEndpoint withRegion(String region) {
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

    public TokenCatalogEndpoint withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 终端节点所属区域ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public TokenCatalogEndpoint withInterface(String _interface) {
        this._interface = _interface;
        return this;
    }

    /**
     * 接口类型，描述接口在该终端节点的可见性。值为“public”，表示该接口为公开接口。
     * @return _interface
     */
    public String getInterface() {
        return _interface;
    }

    public void setInterface(String _interface) {
        this._interface = _interface;
    }

    public TokenCatalogEndpoint withId(String id) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenCatalogEndpoint tokenCatalogEndpoint = (TokenCatalogEndpoint) o;
        return Objects.equals(this.url, tokenCatalogEndpoint.url)
            && Objects.equals(this.region, tokenCatalogEndpoint.region)
            && Objects.equals(this.regionId, tokenCatalogEndpoint.regionId)
            && Objects.equals(this._interface, tokenCatalogEndpoint._interface)
            && Objects.equals(this.id, tokenCatalogEndpoint.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, region, regionId, _interface, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenCatalogEndpoint {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
