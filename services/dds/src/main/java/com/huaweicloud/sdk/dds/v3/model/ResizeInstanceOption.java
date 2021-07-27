package com.huaweicloud.sdk.dds.v3.model;




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
 * ResizeInstanceOption
 */
public class ResizeInstanceOption  {

    /**
     * 对象类型。 - 对于集群实例，该参数为必选。变更mongos节点规格时，取值为“mongos”；变更shard组规格时，取值为“shard”。 - 对于副本集和单节点实例，不传该参数。
     */
    public static final class TargetTypeEnum {

        
        /**
         * Enum MONGOS for value: "mongos"
         */
        public static final TargetTypeEnum MONGOS = new TargetTypeEnum("mongos");
        
        /**
         * Enum SHARD for value: "shard"
         */
        public static final TargetTypeEnum SHARD = new TargetTypeEnum("shard");
        

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("mongos", MONGOS);
            map.put("shard", SHARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetTypeEnum(String value) {
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
        public static TargetTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TargetTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TargetTypeEnum(value);
            }
            return result;
        }

        public static TargetTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TargetTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetTypeEnum) {
                return this.value.equals(((TargetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_type")
    
    private TargetTypeEnum targetType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_id")
    
    private String targetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_spec_code")
    
    private String targetSpecCode;

    public ResizeInstanceOption withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    


    /**
     * 对象类型。 - 对于集群实例，该参数为必选。变更mongos节点规格时，取值为“mongos”；变更shard组规格时，取值为“shard”。 - 对于副本集和单节点实例，不传该参数。
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    

    public ResizeInstanceOption withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    


    /**
     * 待变更规格的节点ID或实例ID，可以调用“查询实例列表”接口获取。如果未申请实例，可以调用“创建实例”接口创建。 - 对于集群实例，变更mongos节点规格时，取值为mongos节点ID；变更shard组规格时，取值为shard组ID。 - 对于副本集实例，取值为相应的实例ID。 - 对于单节点实例，取值为相应的实例ID。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    

    public ResizeInstanceOption withTargetSpecCode(String targetSpecCode) {
        this.targetSpecCode = targetSpecCode;
        return this;
    }

    


    /**
     * 变更至新规格的资源规格编码。
     * @return targetSpecCode
     */
    public String getTargetSpecCode() {
        return targetSpecCode;
    }

    public void setTargetSpecCode(String targetSpecCode) {
        this.targetSpecCode = targetSpecCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInstanceOption resizeInstanceOption = (ResizeInstanceOption) o;
        return Objects.equals(this.targetType, resizeInstanceOption.targetType) &&
            Objects.equals(this.targetId, resizeInstanceOption.targetId) &&
            Objects.equals(this.targetSpecCode, resizeInstanceOption.targetSpecCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(targetType, targetId, targetSpecCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceOption {\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetSpecCode: ").append(toIndentedString(targetSpecCode)).append("\n");
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

