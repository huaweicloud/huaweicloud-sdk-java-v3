package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportInstancesTaskBody
 */
public class ExportInstancesTaskBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "included_instances")

    private List<String> includedInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private String capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    private String availableZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    /**
     * 按照产品类型筛选实例，generic-普通版本，enterprise-企业版
     */
    public static final class ProductTypeEnum {

        /**
         * Enum GENERIC for value: "generic"
         */
        public static final ProductTypeEnum GENERIC = new ProductTypeEnum("generic");

        /**
         * Enum ENTERPRISE for value: "enterprise"
         */
        public static final ProductTypeEnum ENTERPRISE = new ProductTypeEnum("enterprise");

        private static final Map<String, ProductTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProductTypeEnum> createStaticFields() {
            Map<String, ProductTypeEnum> map = new HashMap<>();
            map.put("generic", GENERIC);
            map.put("enterprise", ENTERPRISE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProductTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProductTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProductTypeEnum(value));
        }

        public static ProductTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProductTypeEnum) {
                return this.value.equals(((ProductTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private ProductTypeEnum productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_mode")

    private String cacheMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_type")

    private String cpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    public ExportInstancesTaskBody withIncludedInstances(List<String> includedInstances) {
        this.includedInstances = includedInstances;
        return this;
    }

    public ExportInstancesTaskBody addIncludedInstancesItem(String includedInstancesItem) {
        if (this.includedInstances == null) {
            this.includedInstances = new ArrayList<>();
        }
        this.includedInstances.add(includedInstancesItem);
        return this;
    }

    public ExportInstancesTaskBody withIncludedInstances(Consumer<List<String>> includedInstancesSetter) {
        if (this.includedInstances == null) {
            this.includedInstances = new ArrayList<>();
        }
        includedInstancesSetter.accept(this.includedInstances);
        return this;
    }

    /**
     * 导出实例列表，如果为空，则会导出满足其余参数条件的所有实例
     * @return includedInstances
     */
    public List<String> getIncludedInstances() {
        return includedInstances;
    }

    public void setIncludedInstances(List<String> includedInstances) {
        this.includedInstances = includedInstances;
    }

    public ExportInstancesTaskBody withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 局点名称，用于导出的文件名命名
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ExportInstancesTaskBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按照实例名称筛选实例
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExportInstancesTaskBody withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 按照实例规格筛选实例
     * @return capacity
     */
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public ExportInstancesTaskBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 按照实例ID筛选实例
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ExportInstancesTaskBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 按照ip筛选实例
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ExportInstancesTaskBody withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    /**
     * 按照可用区筛选实例
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    public ExportInstancesTaskBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 按照实例状态筛选实例
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExportInstancesTaskBody withProductType(ProductTypeEnum productType) {
        this.productType = productType;
        return this;
    }

    /**
     * 按照产品类型筛选实例，generic-普通版本，enterprise-企业版
     * @return productType
     */
    public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }

    public ExportInstancesTaskBody withCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }

    /**
     * 按照实例类型筛选实例
     * @return cacheMode
     */
    public String getCacheMode() {
        return cacheMode;
    }

    public void setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
    }

    public ExportInstancesTaskBody withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 按照缓存引擎筛选实例
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ExportInstancesTaskBody withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 按照缓存引擎版本筛选实例
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ExportInstancesTaskBody withCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /**
     * 按照CPU类型筛选实例
     * @return cpuType
     */
    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public ExportInstancesTaskBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 按照企业项目ID筛选实例
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ExportInstancesTaskBody withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 按照计费方式筛选实例
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ExportInstancesTaskBody withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 按照标签筛选实例
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportInstancesTaskBody that = (ExportInstancesTaskBody) obj;
        return Objects.equals(this.includedInstances, that.includedInstances)
            && Objects.equals(this.region, that.region) && Objects.equals(this.name, that.name)
            && Objects.equals(this.capacity, that.capacity) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.availableZone, that.availableZone)
            && Objects.equals(this.status, that.status) && Objects.equals(this.productType, that.productType)
            && Objects.equals(this.cacheMode, that.cacheMode) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.cpuType, that.cpuType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includedInstances,
            region,
            name,
            capacity,
            instanceId,
            ip,
            availableZone,
            status,
            productType,
            cacheMode,
            engine,
            engineVersion,
            cpuType,
            enterpriseProjectId,
            chargingMode,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportInstancesTaskBody {\n");
        sb.append("    includedInstances: ").append(toIndentedString(includedInstances)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    cacheMode: ").append(toIndentedString(cacheMode)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    cpuType: ").append(toIndentedString(cpuType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
