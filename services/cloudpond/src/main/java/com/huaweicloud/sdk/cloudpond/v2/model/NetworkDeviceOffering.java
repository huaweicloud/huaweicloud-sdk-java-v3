package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NetworkDeviceOffering
 */
public class NetworkDeviceOffering {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_code")

    private String zoneCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_code")

    private String sceneCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private OfferingStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NetworkDeviceSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private ProductInfo productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sale_cycles")

    private List<SaleCycle> saleCycles = null;

    public NetworkDeviceOffering withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网络设备商品ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NetworkDeviceOffering withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

    /**
     * 地区编码，表示允许在这个地区购买部署
     * @return zoneCode
     */
    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public NetworkDeviceOffering withSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }

    /**
     * 销售场景编码
     * @return sceneCode
     */
    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }

    public NetworkDeviceOffering withStatus(OfferingStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public OfferingStatus getStatus() {
        return status;
    }

    public void setStatus(OfferingStatus status) {
        this.status = status;
    }

    public NetworkDeviceOffering withSpec(NetworkDeviceSpec spec) {
        this.spec = spec;
        return this;
    }

    public NetworkDeviceOffering withSpec(Consumer<NetworkDeviceSpec> specSetter) {
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

    public NetworkDeviceOffering withProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public NetworkDeviceOffering withProductInfo(Consumer<ProductInfo> productInfoSetter) {
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

    public NetworkDeviceOffering withSaleCycles(List<SaleCycle> saleCycles) {
        this.saleCycles = saleCycles;
        return this;
    }

    public NetworkDeviceOffering addSaleCyclesItem(SaleCycle saleCyclesItem) {
        if (this.saleCycles == null) {
            this.saleCycles = new ArrayList<>();
        }
        this.saleCycles.add(saleCyclesItem);
        return this;
    }

    public NetworkDeviceOffering withSaleCycles(Consumer<List<SaleCycle>> saleCyclesSetter) {
        if (this.saleCycles == null) {
            this.saleCycles = new ArrayList<>();
        }
        saleCyclesSetter.accept(this.saleCycles);
        return this;
    }

    /**
     * Get saleCycles
     * @return saleCycles
     */
    public List<SaleCycle> getSaleCycles() {
        return saleCycles;
    }

    public void setSaleCycles(List<SaleCycle> saleCycles) {
        this.saleCycles = saleCycles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkDeviceOffering that = (NetworkDeviceOffering) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.zoneCode, that.zoneCode)
            && Objects.equals(this.sceneCode, that.sceneCode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.productInfo, that.productInfo)
            && Objects.equals(this.saleCycles, that.saleCycles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zoneCode, sceneCode, status, spec, productInfo, saleCycles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkDeviceOffering {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
        sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    saleCycles: ").append(toIndentedString(saleCycles)).append("\n");
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
