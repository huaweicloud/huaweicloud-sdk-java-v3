package com.huaweicloud.sdk.iec.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.BaseId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量重启边缘实例对象
 */
public class BatchReboot  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="servers")
    
    private List<BaseId> servers = null;
        /**
     * 重启类型：   - SOFT：普通重启。  - HARD：强制重启。  > 重启必须指定重启类型。
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

    public BatchReboot withServers(List<BaseId> servers) {
        this.servers = servers;
        return this;
    }

    
    public BatchReboot addServersItem(BaseId serversItem) {
        if(this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public BatchReboot withServers(Consumer<List<BaseId>> serversSetter) {
        if(this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 待重启的边缘实例列表。
     * @return servers
     */
    public List<BaseId> getServers() {
        return servers;
    }

    public void setServers(List<BaseId> servers) {
        this.servers = servers;
    }

    

    public BatchReboot withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 重启类型：   - SOFT：普通重启。  - HARD：强制重启。  > 重启必须指定重启类型。
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
        BatchReboot batchReboot = (BatchReboot) o;
        return Objects.equals(this.servers, batchReboot.servers) &&
            Objects.equals(this.type, batchReboot.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(servers, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchReboot {\n");
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

