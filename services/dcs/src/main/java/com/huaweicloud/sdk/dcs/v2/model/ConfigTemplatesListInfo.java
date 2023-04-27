package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ConfigTemplatesListInfo
 */
public class ConfigTemplatesListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_mode")

    private String cacheMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 产品类型。 取值范围如下： - generic：普通版 - enterprise：企业版 
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
            ProductTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProductTypeEnum(value);
            }
            return result;
        }

        public static ProductTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProductTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /**
     * 存储类型。 取值范围如下： - DRAM - SSD 
     */
    public static final class StorageTypeEnum {

        /**
         * Enum DRAM for value: "DRAM"
         */
        public static final StorageTypeEnum DRAM = new StorageTypeEnum("DRAM");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final StorageTypeEnum SSD = new StorageTypeEnum("SSD");

        private static final Map<String, StorageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageTypeEnum> createStaticFields() {
            Map<String, StorageTypeEnum> map = new HashMap<>();
            map.put("DRAM", DRAM);
            map.put("SSD", SSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageTypeEnum(String value) {
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
        public static StorageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StorageTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StorageTypeEnum(value);
            }
            return result;
        }

        public static StorageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StorageTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageTypeEnum) {
                return this.value.equals(((StorageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private StorageTypeEnum storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ConfigTemplatesListInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ConfigTemplatesListInfo withCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }

    /**
     * 缓存实例类型。取值范围如下： - single：表示单机实例 - ha：表示主备实例 - cluster：表示cluster集群实例 - proxy：表示Proxy集群实例 [- ha_rw_split： 表示读写分离实例](tag:hws) 
     * @return cacheMode
     */
    public String getCacheMode() {
        return cacheMode;
    }

    public void setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
    }

    public ConfigTemplatesListInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigTemplatesListInfo withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 缓存引擎：Redis[和Memcached](tag:hws,hws_hk,ocb,sbc,tm,ctc,cmcc)。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ConfigTemplatesListInfo withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 缓存版本。  当缓存引擎为Redis时，取值为4.0或5.0。  [当缓存引擎为Memcached时，该字段为可选，取值为空。](tag:hws,hws_hk,ocb,sbc,tm,ctc,cmcc) 
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ConfigTemplatesListInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigTemplatesListInfo withProductType(ProductTypeEnum productType) {
        this.productType = productType;
        return this;
    }

    /**
     * 产品类型。 取值范围如下： - generic：普通版 - enterprise：企业版 
     * @return productType
     */
    public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }

    public ConfigTemplatesListInfo withStorageType(StorageTypeEnum storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型。 取值范围如下： - DRAM - SSD 
     * @return storageType
     */
    public StorageTypeEnum getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageTypeEnum storageType) {
        this.storageType = storageType;
    }

    public ConfigTemplatesListInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模板类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigTemplatesListInfo configTemplatesListInfo = (ConfigTemplatesListInfo) o;
        return Objects.equals(this.templateId, configTemplatesListInfo.templateId)
            && Objects.equals(this.cacheMode, configTemplatesListInfo.cacheMode)
            && Objects.equals(this.description, configTemplatesListInfo.description)
            && Objects.equals(this.engine, configTemplatesListInfo.engine)
            && Objects.equals(this.engineVersion, configTemplatesListInfo.engineVersion)
            && Objects.equals(this.name, configTemplatesListInfo.name)
            && Objects.equals(this.productType, configTemplatesListInfo.productType)
            && Objects.equals(this.storageType, configTemplatesListInfo.storageType)
            && Objects.equals(this.type, configTemplatesListInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(templateId, cacheMode, description, engine, engineVersion, name, productType, storageType, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigTemplatesListInfo {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    cacheMode: ").append(toIndentedString(cacheMode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
