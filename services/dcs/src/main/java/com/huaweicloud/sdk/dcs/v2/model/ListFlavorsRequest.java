package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListFlavorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_mode")

    private String cacheMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    /** CPU架构类型。取值范围如下： - x86_64：X86架构 - aarch64：ARM架构 */
    public static final class CpuTypeEnum {

        /** Enum X86_64 for value: "x86_64" */
        public static final CpuTypeEnum X86_64 = new CpuTypeEnum("x86_64");

        /** Enum AARCH64 for value: "aarch64" */
        public static final CpuTypeEnum AARCH64 = new CpuTypeEnum("aarch64");

        private static final Map<String, CpuTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CpuTypeEnum> createStaticFields() {
            Map<String, CpuTypeEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("aarch64", AARCH64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CpuTypeEnum(String value) {
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
        public static CpuTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CpuTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CpuTypeEnum(value);
            }
            return result;
        }

        public static CpuTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CpuTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CpuTypeEnum) {
                return this.value.equals(((CpuTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_type")

    private CpuTypeEnum cpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private String capacity;

    public ListFlavorsRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /** 产品规格编码。
     * 
     * @return specCode */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ListFlavorsRequest withCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }

    /** 缓存实例类型。取值范围如下： - single：表示单机实例 - ha：表示主备实例 - cluster：表示cluster集群实例 - proxy：表示Proxy集群实例 - ha_rw_split： 表示读写分离实例
     * 
     * @return cacheMode */
    public String getCacheMode() {
        return cacheMode;
    }

    public void setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
    }

    public ListFlavorsRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /** 缓存引擎类型。取值范围如下： - Redis - Memcached
     * 
     * @return engine */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ListFlavorsRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /** 缓存版本，当缓存引擎为Redis时，取值范围如下： - 3.0 - 4.0 - 5.0
     * 
     * @return engineVersion */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ListFlavorsRequest withCpuType(CpuTypeEnum cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /** CPU架构类型。取值范围如下： - x86_64：X86架构 - aarch64：ARM架构
     * 
     * @return cpuType */
    public CpuTypeEnum getCpuType() {
        return cpuType;
    }

    public void setCpuType(CpuTypeEnum cpuType) {
        this.cpuType = cpuType;
    }

    public ListFlavorsRequest withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /** 缓存容量（G Byte）。 - Redis3.0：单机和主备类型实例取值：2、4、8、16、32、64。Proxy集群实例规格支持64、128、256、512和1024。 -
     * Redis4.0和Redis5.0：单机和主备类型实例取值：0.125、0.25、0.5、1、2、4、8、16、32、64。Cluster集群实例规格支持24、32、48、64、96、128、192、256、384、512、768、1024。
     * - Memcached：单机和主备类型实例取值：2、4、8、16、32、64。
     * 
     * @return capacity */
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorsRequest listFlavorsRequest = (ListFlavorsRequest) o;
        return Objects.equals(this.specCode, listFlavorsRequest.specCode)
            && Objects.equals(this.cacheMode, listFlavorsRequest.cacheMode)
            && Objects.equals(this.engine, listFlavorsRequest.engine)
            && Objects.equals(this.engineVersion, listFlavorsRequest.engineVersion)
            && Objects.equals(this.cpuType, listFlavorsRequest.cpuType)
            && Objects.equals(this.capacity, listFlavorsRequest.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, cacheMode, engine, engineVersion, cpuType, capacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsRequest {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    cacheMode: ").append(toIndentedString(cacheMode)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    cpuType: ").append(toIndentedString(cpuType)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
