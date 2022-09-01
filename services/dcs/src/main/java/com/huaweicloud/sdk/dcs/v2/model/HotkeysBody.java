package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 热key记录结构体
 */
public class HotkeysBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    /**
     * key类型
     */
    public static final class TypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final TypeEnum STRING = new TypeEnum("string");

        /**
         * Enum LIST for value: "list"
         */
        public static final TypeEnum LIST = new TypeEnum("list");

        /**
         * Enum SET for value: "set"
         */
        public static final TypeEnum SET = new TypeEnum("set");

        /**
         * Enum ZSET for value: "zset"
         */
        public static final TypeEnum ZSET = new TypeEnum("zset");

        /**
         * Enum HASH for value: "hash"
         */
        public static final TypeEnum HASH = new TypeEnum("hash");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("list", LIST);
            map.put("set", SET);
            map.put("zset", ZSET);
            map.put("hash", HASH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard")

    @JacksonXmlProperty(localName = "shard")

    private String shard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    @JacksonXmlProperty(localName = "db")

    private Integer db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    @JacksonXmlProperty(localName = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq")

    @JacksonXmlProperty(localName = "freq")

    private Integer freq;

    public HotkeysBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * key名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotkeysBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * key类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public HotkeysBody withShard(String shard) {
        this.shard = shard;
        return this;
    }

    /**
     * 热key所在的分片，仅在实例类型为集群时支持,格式为ip:port
     * @return shard
     */
    public String getShard() {
        return shard;
    }

    public void setShard(String shard) {
        this.shard = shard;
    }

    public HotkeysBody withDb(Integer db) {
        this.db = db;
        return this;
    }

    /**
     * 热key所在的db
     * @return db
     */
    public Integer getDb() {
        return db;
    }

    public void setDb(Integer db) {
        this.db = db;
    }

    public HotkeysBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * key的value大小。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public HotkeysBody withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * key大小的单位。type为string时，单位是：byte；type为list/set/zset/hash时，单位是：count
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public HotkeysBody withFreq(Integer freq) {
        this.freq = freq;
        return this;
    }

    /**
     * 表示某个key在一段时间的访问频度，会随着访问的频率而变化。  该值并不是简单的访问频率值，而是一个基于概率的对数计数器结果，最大为255(可表示100万次访问)，超过255后如果继续频繁访问该值并不会继续增大，同时默认如果每过一分钟没有访问，该值会衰减1。 
     * @return freq
     */
    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HotkeysBody hotkeysBody = (HotkeysBody) o;
        return Objects.equals(this.name, hotkeysBody.name) && Objects.equals(this.type, hotkeysBody.type)
            && Objects.equals(this.shard, hotkeysBody.shard) && Objects.equals(this.db, hotkeysBody.db)
            && Objects.equals(this.size, hotkeysBody.size) && Objects.equals(this.unit, hotkeysBody.unit)
            && Objects.equals(this.freq, hotkeysBody.freq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, shard, db, size, unit, freq);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotkeysBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    shard: ").append(toIndentedString(shard)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    freq: ").append(toIndentedString(freq)).append("\n");
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
