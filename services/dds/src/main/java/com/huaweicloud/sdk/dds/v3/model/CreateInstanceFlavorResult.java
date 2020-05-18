package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 实例规格详情。
 */
public class CreateInstanceFlavorResult  {

    /**
     * 节点类型。 取值：   - 社区版集群实例包含mongos、shard和config节点，各节点下该参数取值分别为“mongos”、“shard”和“config”。   - 增强版集群实例下该参数取值为“shard”。   - 社区版副本集实例下该参数取值为“replica”。   - 社区版单节点实例下该参数取值为“single”。
     */
    public static class TypeEnum {

        
        /**
         * Enum MONGOS for value: "mongos"
         */
        public static final TypeEnum MONGOS = new TypeEnum("mongos");

        
        /**
         * Enum SHARD for value: "shard"
         */
        public static final TypeEnum SHARD = new TypeEnum("shard");

        
        /**
         * Enum CONFIG for value: "config"
         */
        public static final TypeEnum CONFIG = new TypeEnum("config");

        
        /**
         * Enum REPLICA for value: "replica"
         */
        public static final TypeEnum REPLICA = new TypeEnum("replica");

        
        /**
         * Enum SINGLE for value: "single"
         */
        public static final TypeEnum SINGLE = new TypeEnum("single");

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("mongos", MONGOS);
                        put("shard", SHARD);
                        put("config", CONFIG);
                        put("replica", REPLICA);
                        put("single", SINGLE);
                    }
                };

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="num")
    
    private Integer num;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage")
    
    private String storage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    private String specCode;

    public CreateInstanceFlavorResult withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 节点类型。 取值：   - 社区版集群实例包含mongos、shard和config节点，各节点下该参数取值分别为“mongos”、“shard”和“config”。   - 增强版集群实例下该参数取值为“shard”。   - 社区版副本集实例下该参数取值为“replica”。   - 社区版单节点实例下该参数取值为“single”。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateInstanceFlavorResult withNum(Integer num) {
        this.num = num;
        return this;
    }

    


    /**
     * 节点数量。 取值：   - 社区版集群实例下“mongos”类型的节点数量可取2~16。   - 社区版集群实例下“shard”类型的组数量可取2~16，增强版集群实例下“shard”类型的组数量可取2~12。   - “shard”类型的组数量可取2~16。   - “config”类型的组数量只能取1。   - “replica”类型的组数量只能取1。   - “single”类型的节点数量只能取1。
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public CreateInstanceFlavorResult withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    


    /**
     * 磁盘类型。 取值：ULTRAHIGH，表示SSD。   - 对于社区版集群实例的shard和config节点、副本集、以及单节点实例，该参数有效。mongos节点不涉及选择磁盘，该参数无意义。   - 对于增强版集群实例，不传该参数。
     * @return storage
     */
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public CreateInstanceFlavorResult withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小。 取值：必须为10的整数倍。单位为GB。   - 对于社区版集群实例，shard组可取10GB~2000GB，config组仅可取20GB。mongos节点不涉及选择磁盘，该参数无意义。   - 对于增强版集群实例，不传该参数。   - 对于社区版副本集实例，可取10GB~2000GB。   - 对于社区版单节点实例，可取10GB~1000GB。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CreateInstanceFlavorResult withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 资源规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceFlavorResult createInstanceFlavorResult = (CreateInstanceFlavorResult) o;
        return Objects.equals(this.type, createInstanceFlavorResult.type) &&
            Objects.equals(this.num, createInstanceFlavorResult.num) &&
            Objects.equals(this.storage, createInstanceFlavorResult.storage) &&
            Objects.equals(this.size, createInstanceFlavorResult.size) &&
            Objects.equals(this.specCode, createInstanceFlavorResult.specCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, num, storage, size, specCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceFlavorResult {\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    num: ").append(toIndentedString(num)).append("\n");
            sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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

