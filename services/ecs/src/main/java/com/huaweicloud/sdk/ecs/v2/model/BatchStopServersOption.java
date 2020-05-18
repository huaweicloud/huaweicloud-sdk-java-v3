package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ServerId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class BatchStopServersOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="servers")
    
    private List<ServerId> servers = new ArrayList<>();
        /**
     * 关机类型，默认为SOFT：  - SOFT：普通关机（默认）。 - HARD：强制关机。
     */
    public static class TypeEnum {

        
        /**
         * Enum SOFT for value: "SOFT"
         */
        public static final TypeEnum SOFT = new TypeEnum("SOFT");

        
        /**
         * Enum HARD for value: "HARD"
         */
        public static final TypeEnum HARD = new TypeEnum("HARD");

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("SOFT", SOFT);
                        put("HARD", HARD);
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
    
    private TypeEnum type = TypeEnum.SOFT;

    public BatchStopServersOption withServers(List<ServerId> servers) {
        this.servers = servers;
        return this;
    }

    
    public BatchStopServersOption addServersItem(ServerId serversItem) {
        this.servers.add(serversItem);
        return this;
    }

    public BatchStopServersOption withServers(Consumer<List<ServerId>> serversSetter) {
        if(this.servers == null ){
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 标记为启动云服务器操作。
     * @return servers
     */
    public List<ServerId> getServers() {
        return servers;
    }

    public void setServers(List<ServerId> servers) {
        this.servers = servers;
    }

    public BatchStopServersOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 关机类型，默认为SOFT：  - SOFT：普通关机（默认）。 - HARD：强制关机。
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
        BatchStopServersOption batchStopServersOption = (BatchStopServersOption) o;
        return Objects.equals(this.servers, batchStopServersOption.servers) &&
            Objects.equals(this.type, batchStopServersOption.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(servers, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopServersOption {\n");
            sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

