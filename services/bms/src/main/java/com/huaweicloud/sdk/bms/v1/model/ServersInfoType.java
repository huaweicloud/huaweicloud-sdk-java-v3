package com.huaweicloud.sdk.bms.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.ServersList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据结构说明
 */
public class ServersInfoType  {

    /**
     * 重启类型：SOFT：普通重启。HARD：强制重启。
     */
    public static final class TypeEnum {

        
        /**
         * Enum SOFT for value: "SOFT"
         */
        public static final TypeEnum SOFT = new TypeEnum("SOFT");
        
        /**
         * Enum HARD for value: "HARD"
         */
        public static final TypeEnum HARD = new TypeEnum("HARD");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SOFT", SOFT);
            map.put("HARD", HARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
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
    @JsonProperty(value="servers")
    
    private List<ServersList> servers = null;
    
    public ServersInfoType withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 重启类型：SOFT：普通重启。HARD：强制重启。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public ServersInfoType withServers(List<ServersList> servers) {
        this.servers = servers;
        return this;
    }

    
    public ServersInfoType addServersItem(ServersList serversItem) {
        this.servers.add(serversItem);
        return this;
    }

    public ServersInfoType withServers(Consumer<List<ServersList>> serversSetter) {
        if(this.servers == null ){
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 裸金属服务器ID列表，详情请参见表3 servers字段数据结构说明。
     * @return servers
     */
    public List<ServersList> getServers() {
        return servers;
    }

    public void setServers(List<ServersList> servers) {
        this.servers = servers;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServersInfoType serversInfoType = (ServersInfoType) o;
        return Objects.equals(this.type, serversInfoType.type) &&
            Objects.equals(this.servers, serversInfoType.servers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, servers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServersInfoType {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

