package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FlavorsItems
 */
public class FlavorsItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    @JacksonXmlProperty(localName = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_code")

    @JacksonXmlProperty(localName = "cloud_service_type_code")

    private String cloudServiceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_resource_type_code")

    @JacksonXmlProperty(localName = "cloud_resource_type_code")

    private String cloudResourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_mode")

    @JacksonXmlProperty(localName = "cache_mode")

    private String cacheMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    @JacksonXmlProperty(localName = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    @JacksonXmlProperty(localName = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    @JacksonXmlProperty(localName = "product_type")

    private String productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_type")

    @JacksonXmlProperty(localName = "cpu_type")

    private String cpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    @JacksonXmlProperty(localName = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    @JacksonXmlProperty(localName = "capacity")

    private List<String> capacity = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    @JacksonXmlProperty(localName = "billing_mode")

    private List<String> billingMode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_ip_count")

    @JacksonXmlProperty(localName = "tenant_ip_count")

    private Integer tenantIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pricing_type")

    @JacksonXmlProperty(localName = "pricing_type")

    private String pricingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dec")

    @JacksonXmlProperty(localName = "is_dec")

    private Boolean isDec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attrs")

    @JacksonXmlProperty(localName = "attrs")

    private List<AttrsObject> attrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors_available_zones")

    @JacksonXmlProperty(localName = "flavors_available_zones")

    private List<FlavorAzObject> flavorsAvailableZones = null;

    public FlavorsItems withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 产品规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public FlavorsItems withCloudServiceTypeCode(String cloudServiceTypeCode) {
        this.cloudServiceTypeCode = cloudServiceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码。
     * @return cloudServiceTypeCode
     */
    public String getCloudServiceTypeCode() {
        return cloudServiceTypeCode;
    }

    public void setCloudServiceTypeCode(String cloudServiceTypeCode) {
        this.cloudServiceTypeCode = cloudServiceTypeCode;
    }

    public FlavorsItems withCloudResourceTypeCode(String cloudResourceTypeCode) {
        this.cloudResourceTypeCode = cloudResourceTypeCode;
        return this;
    }

    /**
     * 云资源类型编码。
     * @return cloudResourceTypeCode
     */
    public String getCloudResourceTypeCode() {
        return cloudResourceTypeCode;
    }

    public void setCloudResourceTypeCode(String cloudResourceTypeCode) {
        this.cloudResourceTypeCode = cloudResourceTypeCode;
    }

    public FlavorsItems withCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }

    /**
     * 缓存实例类型。取值范围如下： - single：表示单机实例 - ha：表示主备实例 - cluster：表示cluster集群实例 - proxy：表示Proxy集群实例 - ha_rw_split： 表示读写分离实例 
     * @return cacheMode
     */
    public String getCacheMode() {
        return cacheMode;
    }

    public void setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
    }

    public FlavorsItems withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 缓存引擎类型。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public FlavorsItems withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 缓存版本，当缓存引擎为Redis时，取值为3.0、4.0或5.0。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public FlavorsItems withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Redis缓存实例的产品类型。取值当前仅支持： generic：标准类型 
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public FlavorsItems withCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /**
     * CPU架构类型。取值范围如下： - x86_64：X86架构 - aarch64: ARM架构 
     * @return cpuType
     */
    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public FlavorsItems withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型，取值当前仅支持： DRAM:内存存储 
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public FlavorsItems withCapacity(List<String> capacity) {
        this.capacity = capacity;
        return this;
    }

    public FlavorsItems addCapacityItem(String capacityItem) {
        if (this.capacity == null) {
            this.capacity = new ArrayList<>();
        }
        this.capacity.add(capacityItem);
        return this;
    }

    public FlavorsItems withCapacity(Consumer<List<String>> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new ArrayList<>();
        }
        capacitySetter.accept(this.capacity);
        return this;
    }

    /**
     * 缓存容量（G Byte）。
     * @return capacity
     */
    public List<String> getCapacity() {
        return capacity;
    }

    public void setCapacity(List<String> capacity) {
        this.capacity = capacity;
    }

    public FlavorsItems withBillingMode(List<String> billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    public FlavorsItems addBillingModeItem(String billingModeItem) {
        if (this.billingMode == null) {
            this.billingMode = new ArrayList<>();
        }
        this.billingMode.add(billingModeItem);
        return this;
    }

    public FlavorsItems withBillingMode(Consumer<List<String>> billingModeSetter) {
        if (this.billingMode == null) {
            this.billingMode = new ArrayList<>();
        }
        billingModeSetter.accept(this.billingMode);
        return this;
    }

    /**
     * 计费模式，取值范围如下： - Hourly：按需计费 - Monthly: 包月计费 - Yearly: 包周期计费 
     * @return billingMode
     */
    public List<String> getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(List<String> billingMode) {
        this.billingMode = billingMode;
    }

    public FlavorsItems withTenantIpCount(Integer tenantIpCount) {
        this.tenantIpCount = tenantIpCount;
        return this;
    }

    /**
     * 租户侧IP数量。
     * @return tenantIpCount
     */
    public Integer getTenantIpCount() {
        return tenantIpCount;
    }

    public void setTenantIpCount(Integer tenantIpCount) {
        this.tenantIpCount = tenantIpCount;
    }

    public FlavorsItems withPricingType(String pricingType) {
        this.pricingType = pricingType;
        return this;
    }

    /**
     * 定价类型，取值如下： - tier: 阶梯定价，一个规格对应多个容量 - normal: 规格和容量一一对应 
     * @return pricingType
     */
    public String getPricingType() {
        return pricingType;
    }

    public void setPricingType(String pricingType) {
        this.pricingType = pricingType;
    }

    public FlavorsItems withIsDec(Boolean isDec) {
        this.isDec = isDec;
        return this;
    }

    /**
     * 是否支持专属云。
     * @return isDec
     */
    public Boolean getIsDec() {
        return isDec;
    }

    public void setIsDec(Boolean isDec) {
        this.isDec = isDec;
    }

    public FlavorsItems withAttrs(List<AttrsObject> attrs) {
        this.attrs = attrs;
        return this;
    }

    public FlavorsItems addAttrsItem(AttrsObject attrsItem) {
        if (this.attrs == null) {
            this.attrs = new ArrayList<>();
        }
        this.attrs.add(attrsItem);
        return this;
    }

    public FlavorsItems withAttrs(Consumer<List<AttrsObject>> attrsSetter) {
        if (this.attrs == null) {
            this.attrs = new ArrayList<>();
        }
        attrsSetter.accept(this.attrs);
        return this;
    }

    /**
     * 规格的其他信息。
     * @return attrs
     */
    public List<AttrsObject> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AttrsObject> attrs) {
        this.attrs = attrs;
    }

    public FlavorsItems withFlavorsAvailableZones(List<FlavorAzObject> flavorsAvailableZones) {
        this.flavorsAvailableZones = flavorsAvailableZones;
        return this;
    }

    public FlavorsItems addFlavorsAvailableZonesItem(FlavorAzObject flavorsAvailableZonesItem) {
        if (this.flavorsAvailableZones == null) {
            this.flavorsAvailableZones = new ArrayList<>();
        }
        this.flavorsAvailableZones.add(flavorsAvailableZonesItem);
        return this;
    }

    public FlavorsItems withFlavorsAvailableZones(Consumer<List<FlavorAzObject>> flavorsAvailableZonesSetter) {
        if (this.flavorsAvailableZones == null) {
            this.flavorsAvailableZones = new ArrayList<>();
        }
        flavorsAvailableZonesSetter.accept(this.flavorsAvailableZones);
        return this;
    }

    /**
     * 有资源的可用区。
     * @return flavorsAvailableZones
     */
    public List<FlavorAzObject> getFlavorsAvailableZones() {
        return flavorsAvailableZones;
    }

    public void setFlavorsAvailableZones(List<FlavorAzObject> flavorsAvailableZones) {
        this.flavorsAvailableZones = flavorsAvailableZones;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorsItems flavorsItems = (FlavorsItems) o;
        return Objects.equals(this.specCode, flavorsItems.specCode)
            && Objects.equals(this.cloudServiceTypeCode, flavorsItems.cloudServiceTypeCode)
            && Objects.equals(this.cloudResourceTypeCode, flavorsItems.cloudResourceTypeCode)
            && Objects.equals(this.cacheMode, flavorsItems.cacheMode)
            && Objects.equals(this.engine, flavorsItems.engine)
            && Objects.equals(this.engineVersion, flavorsItems.engineVersion)
            && Objects.equals(this.productType, flavorsItems.productType)
            && Objects.equals(this.cpuType, flavorsItems.cpuType)
            && Objects.equals(this.storageType, flavorsItems.storageType)
            && Objects.equals(this.capacity, flavorsItems.capacity)
            && Objects.equals(this.billingMode, flavorsItems.billingMode)
            && Objects.equals(this.tenantIpCount, flavorsItems.tenantIpCount)
            && Objects.equals(this.pricingType, flavorsItems.pricingType)
            && Objects.equals(this.isDec, flavorsItems.isDec) && Objects.equals(this.attrs, flavorsItems.attrs)
            && Objects.equals(this.flavorsAvailableZones, flavorsItems.flavorsAvailableZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode,
            cloudServiceTypeCode,
            cloudResourceTypeCode,
            cacheMode,
            engine,
            engineVersion,
            productType,
            cpuType,
            storageType,
            capacity,
            billingMode,
            tenantIpCount,
            pricingType,
            isDec,
            attrs,
            flavorsAvailableZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorsItems {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    cloudServiceTypeCode: ").append(toIndentedString(cloudServiceTypeCode)).append("\n");
        sb.append("    cloudResourceTypeCode: ").append(toIndentedString(cloudResourceTypeCode)).append("\n");
        sb.append("    cacheMode: ").append(toIndentedString(cacheMode)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    cpuType: ").append(toIndentedString(cpuType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    tenantIpCount: ").append(toIndentedString(tenantIpCount)).append("\n");
        sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
        sb.append("    isDec: ").append(toIndentedString(isDec)).append("\n");
        sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
        sb.append("    flavorsAvailableZones: ").append(toIndentedString(flavorsAvailableZones)).append("\n");
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
