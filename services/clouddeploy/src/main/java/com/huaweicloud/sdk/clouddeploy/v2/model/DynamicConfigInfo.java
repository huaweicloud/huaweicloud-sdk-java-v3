package com.huaweicloud.sdk.clouddeploy.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.clouddeploy.v2.model.KeyValueDO;
import com.huaweicloud.sdk.clouddeploy.v2.model.ParamTypeLimits;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 部署任务执行时传递的参数
 */
public class DynamicConfigInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limits")
    
    private List<ParamTypeLimits> limits = null;
        /**
     * 类型，如果填写动态参数，则类型必选
     */
    public static final class TypeEnum {

        
        /**
         * Enum TEXT for value: "text"
         */
        public static final TypeEnum TEXT = new TypeEnum("text");
        
        /**
         * Enum HOST_GROUP for value: "host_group"
         */
        public static final TypeEnum HOST_GROUP = new TypeEnum("host_group");
        
        /**
         * Enum ENCRYPT for value: "encrypt"
         */
        public static final TypeEnum ENCRYPT = new TypeEnum("encrypt");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("host_group", HOST_GROUP);
            map.put("encrypt", ENCRYPT);
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
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public DynamicConfigInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 执行部署任务时传递的参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public DynamicConfigInfo withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 执行部署任务时传递的参数值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    public DynamicConfigInfo withLimits(List<ParamTypeLimits> limits) {
        this.limits = limits;
        return this;
    }

    
    public DynamicConfigInfo addLimitsItem(ParamTypeLimits limitsItem) {
        if(this.limits == null) {
            this.limits = new ArrayList<>();
        }
        this.limits.add(limitsItem);
        return this;
    }

    public DynamicConfigInfo withLimits(Consumer<List<ParamTypeLimits>> limitsSetter) {
        if(this.limits == null) {
            this.limits = new ArrayList<>();
        }
        limitsSetter.accept(this.limits);
        return this;
    }

    /**
     * 参数值为枚举类型时，返回可选值列表
     * @return limits
     */
    public List<ParamTypeLimits> getLimits() {
        return limits;
    }

    public void setLimits(List<ParamTypeLimits> limits) {
        this.limits = limits;
    }

    

    public DynamicConfigInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型，如果填写动态参数，则类型必选
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public DynamicConfigInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DynamicConfigInfo dynamicConfigInfo = (DynamicConfigInfo) o;
        return Objects.equals(this.name, dynamicConfigInfo.name) &&
            Objects.equals(this.value, dynamicConfigInfo.value) &&
            Objects.equals(this.limits, dynamicConfigInfo.limits) &&
            Objects.equals(this.type, dynamicConfigInfo.type) &&
            Objects.equals(this.description, dynamicConfigInfo.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, value, limits, type, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicConfigInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

