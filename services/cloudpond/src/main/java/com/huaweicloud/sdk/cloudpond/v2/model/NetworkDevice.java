package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网络设备详情
 */
public class NetworkDevice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_site_id")

    private String edgeSiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private NetworkDeviceStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offering_id")

    private String offeringId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NetworkDeviceSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_options")

    private MarketOptions marketOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private ProductInfo productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private LayoutLocation location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public NetworkDevice withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网络设备资源ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NetworkDevice withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public NetworkDevice withEdgeSiteId(String edgeSiteId) {
        this.edgeSiteId = edgeSiteId;
        return this;
    }

    /**
     * 站点ID
     * @return edgeSiteId
     */
    public String getEdgeSiteId() {
        return edgeSiteId;
    }

    public void setEdgeSiteId(String edgeSiteId) {
        this.edgeSiteId = edgeSiteId;
    }

    public NetworkDevice withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetworkDevice withStatus(NetworkDeviceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public NetworkDeviceStatus getStatus() {
        return status;
    }

    public void setStatus(NetworkDeviceStatus status) {
        this.status = status;
    }

    public NetworkDevice withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }

    /**
     * 商品ID
     * @return offeringId
     */
    public String getOfferingId() {
        return offeringId;
    }

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    public NetworkDevice withSpec(NetworkDeviceSpec spec) {
        this.spec = spec;
        return this;
    }

    public NetworkDevice withSpec(Consumer<NetworkDeviceSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new NetworkDeviceSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public NetworkDeviceSpec getSpec() {
        return spec;
    }

    public void setSpec(NetworkDeviceSpec spec) {
        this.spec = spec;
    }

    public NetworkDevice withMarketOptions(MarketOptions marketOptions) {
        this.marketOptions = marketOptions;
        return this;
    }

    public NetworkDevice withMarketOptions(Consumer<MarketOptions> marketOptionsSetter) {
        if (this.marketOptions == null) {
            this.marketOptions = new MarketOptions();
            marketOptionsSetter.accept(this.marketOptions);
        }

        return this;
    }

    /**
     * Get marketOptions
     * @return marketOptions
     */
    public MarketOptions getMarketOptions() {
        return marketOptions;
    }

    public void setMarketOptions(MarketOptions marketOptions) {
        this.marketOptions = marketOptions;
    }

    public NetworkDevice withProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public NetworkDevice withProductInfo(Consumer<ProductInfo> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new ProductInfo();
            productInfoSetter.accept(this.productInfo);
        }

        return this;
    }

    /**
     * Get productInfo
     * @return productInfo
     */
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public NetworkDevice withLocation(LayoutLocation location) {
        this.location = location;
        return this;
    }

    public NetworkDevice withLocation(Consumer<LayoutLocation> locationSetter) {
        if (this.location == null) {
            this.location = new LayoutLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public LayoutLocation getLocation() {
        return location;
    }

    public void setLocation(LayoutLocation location) {
        this.location = location;
    }

    public NetworkDevice withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NetworkDevice withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkDevice that = (NetworkDevice) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.edgeSiteId, that.edgeSiteId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.offeringId, that.offeringId)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.marketOptions, that.marketOptions)
            && Objects.equals(this.productInfo, that.productInfo) && Objects.equals(this.location, that.location)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            edgeSiteId,
            name,
            status,
            offeringId,
            spec,
            marketOptions,
            productInfo,
            location,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkDevice {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    edgeSiteId: ").append(toIndentedString(edgeSiteId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    offeringId: ").append(toIndentedString(offeringId)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    marketOptions: ").append(toIndentedString(marketOptions)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
