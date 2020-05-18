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
 * RestartInstanceRequestBody
 */
public class RestartInstanceRequestBody  {

    /**
     * 待重启对象的类型。 - 重启集群实例下的节点时，该参数必选。取值为“mongos”、“shard”、或“config”。 - 重启整个实例时，不传该参数。
     */
    public static class TargetTypeEnum {

        
        /**
         * Enum MONGOS for value: "mongos"
         */
        public static final TargetTypeEnum MONGOS = new TargetTypeEnum("mongos");

        
        /**
         * Enum SHARD for value: "shard"
         */
        public static final TargetTypeEnum SHARD = new TargetTypeEnum("shard");

        
        /**
         * Enum CONFIG for value: "config"
         */
        public static final TargetTypeEnum CONFIG = new TargetTypeEnum("config");

        

        public static Map<String, TargetTypeEnum> staticFields =
                new HashMap<String, TargetTypeEnum>() {
                    { 
                        put("mongos", MONGOS);
                        put("shard", SHARD);
                        put("config", CONFIG);
                    }
                };

        private String value;

        TargetTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TargetTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TargetTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TargetTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TargetTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TargetTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TargetTypeEnum) {
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

    public RestartInstanceRequestBody withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    


    /**
     * 待重启对象的类型。 - 重启集群实例下的节点时，该参数必选。取值为“mongos”、“shard”、或“config”。 - 重启整个实例时，不传该参数。
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    public RestartInstanceRequestBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    


    /**
     * 待重启对象的ID。 - 重启集群实例下的节点时，对于mongos节点，取值为mongos节点ID，对于shard和config组，取值为shard和config组ID。 - 重启整个实例时，取值为实例ID。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestartInstanceRequestBody restartInstanceRequestBody = (RestartInstanceRequestBody) o;
        return Objects.equals(this.targetType, restartInstanceRequestBody.targetType) &&
            Objects.equals(this.targetId, restartInstanceRequestBody.targetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(targetType, targetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartInstanceRequestBody {\n");
            sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
            sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

