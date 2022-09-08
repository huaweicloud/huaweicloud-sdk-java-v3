package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UnscopedTokenInfoCatalog
 */
public class UnscopedTokenInfoCatalog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface")

    private String _interface;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public UnscopedTokenInfoCatalog withId(String id) {
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

    public UnscopedTokenInfoCatalog withInterface(String _interface) {
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

    public UnscopedTokenInfoCatalog withRegion(String region) {
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

    public UnscopedTokenInfoCatalog withRegionId(String regionId) {
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

    public UnscopedTokenInfoCatalog withUrl(String url) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnscopedTokenInfoCatalog unscopedTokenInfoCatalog = (UnscopedTokenInfoCatalog) o;
        return Objects.equals(this.id, unscopedTokenInfoCatalog.id)
            && Objects.equals(this._interface, unscopedTokenInfoCatalog._interface)
            && Objects.equals(this.region, unscopedTokenInfoCatalog.region)
            && Objects.equals(this.regionId, unscopedTokenInfoCatalog.regionId)
            && Objects.equals(this.url, unscopedTokenInfoCatalog.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, _interface, region, regionId, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnscopedTokenInfoCatalog {\n");
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
