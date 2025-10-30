package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServerOffering
 */
public class ServerOffering {

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

    private ServerSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private ProductInfo productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sale_cycles")

    private List<SaleCycle> saleCycles = null;

    public ServerOffering withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 服务器销售商品id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerOffering withZoneCode(String zoneCode) {
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

    public ServerOffering withSceneCode(String sceneCode) {
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

    public ServerOffering withStatus(OfferingStatus status) {
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

    public ServerOffering withSpec(ServerSpec spec) {
        this.spec = spec;
        return this;
    }

    public ServerOffering withSpec(Consumer<ServerSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ServerSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ServerSpec getSpec() {
        return spec;
    }

    public void setSpec(ServerSpec spec) {
        this.spec = spec;
    }

    public ServerOffering withProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public ServerOffering withProductInfo(Consumer<ProductInfo> productInfoSetter) {
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

    public ServerOffering withSaleCycles(List<SaleCycle> saleCycles) {
        this.saleCycles = saleCycles;
        return this;
    }

    public ServerOffering addSaleCyclesItem(SaleCycle saleCyclesItem) {
        if (this.saleCycles == null) {
            this.saleCycles = new ArrayList<>();
        }
        this.saleCycles.add(saleCyclesItem);
        return this;
    }

    public ServerOffering withSaleCycles(Consumer<List<SaleCycle>> saleCyclesSetter) {
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
        ServerOffering that = (ServerOffering) obj;
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
        sb.append("class ServerOffering {\n");
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
