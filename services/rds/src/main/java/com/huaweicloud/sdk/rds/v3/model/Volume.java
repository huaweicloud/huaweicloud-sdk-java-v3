package com.huaweicloud.sdk.rds.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Volume
 */
public class Volume  {

    /**
     * 磁盘类型。 取值范围如下，区分大小写： - COMMON，表示SATA。 - HIGH，表示SAS。 - ULTRAHIGH，表示SSD。 - ULTRAHIGHPRO，表示SSD尊享版，仅支持超高性能型尊享版（需申请权限）。
     */
    public static final class TypeEnum {

        
        /**
         * Enum ULTRAHIGH for value: "ULTRAHIGH"
         */
        public static final TypeEnum ULTRAHIGH = new TypeEnum("ULTRAHIGH");
        
        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final TypeEnum HIGH = new TypeEnum("HIGH");
        
        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final TypeEnum COMMON = new TypeEnum("COMMON");
        
        /**
         * Enum NVMESSD for value: "NVMESSD"
         */
        public static final TypeEnum NVMESSD = new TypeEnum("NVMESSD");
        
        /**
         * Enum ULTRAHIGHPRO for value: "ULTRAHIGHPRO"
         */
        public static final TypeEnum ULTRAHIGHPRO = new TypeEnum("ULTRAHIGHPRO");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ULTRAHIGH", ULTRAHIGH);
            map.put("HIGH", HIGH);
            map.put("COMMON", COMMON);
            map.put("NVMESSD", NVMESSD);
            map.put("ULTRAHIGHPRO", ULTRAHIGHPRO);
            return Collections.unmodifiableMap(map);
        }

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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="size")
    
    private Integer size;

    public Volume withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 磁盘类型。 取值范围如下，区分大小写： - COMMON，表示SATA。 - HIGH，表示SAS。 - ULTRAHIGH，表示SSD。 - ULTRAHIGHPRO，表示SSD尊享版，仅支持超高性能型尊享版（需申请权限）。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Volume withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小，单位为GB。 取值范围：40GB~4000GB，必须为10的整数倍。  部分用户支持40GB~6000GB，如果您想创建存储空间最大为6000GB的数据库实例，或提高扩容上限到10000GB，请联系客服开通。  说明：对于只读实例，该参数无效，磁盘大小，默认和主实例相同。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Volume volume = (Volume) o;
        return Objects.equals(this.type, volume.type) &&
            Objects.equals(this.size, volume.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volume {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

