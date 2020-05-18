package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.AddShardingNodeVolumeOption;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * AddShardingNodeRequestBody
 */
public class AddShardingNodeRequestBody  {

    /**
     * 待扩容的对象类型。 - 扩容mongos节点时，取值为“mongos”。 - 扩容shard组时，取值为“shard”。
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

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("mongos", MONGOS);
                        put("shard", SHARD);
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
    @JsonProperty(value="spec_code")
    
    private String specCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="num")
    
    private Integer num;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    private AddShardingNodeVolumeOption volume = null;

    public AddShardingNodeRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 待扩容的对象类型。 - 扩容mongos节点时，取值为“mongos”。 - 扩容shard组时，取值为“shard”。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AddShardingNodeRequestBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 资源规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public AddShardingNodeRequestBody withNum(Integer num) {
        this.num = num;
        return this;
    }

    


    /**
     * 一个社区版集群实例下，最多支持16个mongos节点和16个shard组。
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public AddShardingNodeRequestBody withVolume(AddShardingNodeVolumeOption volume) {
        this.volume = volume;
        return this;
    }

    public AddShardingNodeRequestBody withVolume(Consumer<AddShardingNodeVolumeOption> volumeSetter) {
        if(this.volume == null ){
            this.volume = new AddShardingNodeVolumeOption();
        }
        volumeSetter.accept(this.volume);
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public AddShardingNodeVolumeOption getVolume() {
        return volume;
    }

    public void setVolume(AddShardingNodeVolumeOption volume) {
        this.volume = volume;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddShardingNodeRequestBody addShardingNodeRequestBody = (AddShardingNodeRequestBody) o;
        return Objects.equals(this.type, addShardingNodeRequestBody.type) &&
            Objects.equals(this.specCode, addShardingNodeRequestBody.specCode) &&
            Objects.equals(this.num, addShardingNodeRequestBody.num) &&
            Objects.equals(this.volume, addShardingNodeRequestBody.volume);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, specCode, num, volume);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddShardingNodeRequestBody {\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
            sb.append("    num: ").append(toIndentedString(num)).append("\n");
            sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

