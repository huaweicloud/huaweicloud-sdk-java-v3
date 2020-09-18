package com.huaweicloud.sdk.elb.v3.model;




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
 * listener对象中的ipgroup信息
 */
public class UpdateListenerIpGroupOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipgroup_id")
    
    private String ipgroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_ipgroup")
    
    private Boolean enableIpgroup;
    /**
     * 访问控制组的类型。 white:白名单，只允许指定ip访问； black:黑名单，不允许指定ip访问； 
     */
    public static final class TypeEnum {

        
        /**
         * Enum WHITE for value: "white"
         */
        public static final TypeEnum WHITE = new TypeEnum("white");
        
        /**
         * Enum BLACK for value: "black"
         */
        public static final TypeEnum BLACK = new TypeEnum("black");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("white", WHITE);
            map.put("black", BLACK);
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

    public UpdateListenerIpGroupOption withIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
        return this;
    }

    


    /**
     * 监听器关联的访问控制组的id。 创建时必选，更新时非必选。 指定的ipgroup必须已存在，不能指定为null，否则与enable_ipgroup冲突。 
     * @return ipgroupId
     */
    public String getIpgroupId() {
        return ipgroupId;
    }

    public void setIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
    }

    public UpdateListenerIpGroupOption withEnableIpgroup(Boolean enableIpgroup) {
        this.enableIpgroup = enableIpgroup;
        return this;
    }

    


    /**
     * 访问控制组的状态。 True:开启访问控制； Flase：关闭访问控制； 开启访问控制的监听器，允许直接删除。
     * @return enableIpgroup
     */
    public Boolean getEnableIpgroup() {
        return enableIpgroup;
    }

    public void setEnableIpgroup(Boolean enableIpgroup) {
        this.enableIpgroup = enableIpgroup;
    }

    public UpdateListenerIpGroupOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 访问控制组的类型。 white:白名单，只允许指定ip访问； black:黑名单，不允许指定ip访问； 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
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
        UpdateListenerIpGroupOption updateListenerIpGroupOption = (UpdateListenerIpGroupOption) o;
        return Objects.equals(this.ipgroupId, updateListenerIpGroupOption.ipgroupId) &&
            Objects.equals(this.enableIpgroup, updateListenerIpGroupOption.enableIpgroup) &&
            Objects.equals(this.type, updateListenerIpGroupOption.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipgroupId, enableIpgroup, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerIpGroupOption {\n");
        sb.append("    ipgroupId: ").append(toIndentedString(ipgroupId)).append("\n");
        sb.append("    enableIpgroup: ").append(toIndentedString(enableIpgroup)).append("\n");
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

