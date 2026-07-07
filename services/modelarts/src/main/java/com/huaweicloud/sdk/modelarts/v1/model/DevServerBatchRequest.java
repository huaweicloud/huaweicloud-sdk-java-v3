package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Lite Server实例批量操作请求体。
 */
public class DevServerBatchRequest {

    /**
     * **参数解释**：批量操作类型。 **约束限制**：不涉及。 **取值范围**： - START：批量启动Lite Server实例 - STOP：批量停止Lite Server实例 - REBOOT：批量重启Lite Server实例 - CHANGEOS：批量切换Lite Server服务器操作系统镜像 - REINSTALLOS：批量重装Lite Server服务器操作系统镜像 - DELETE：批量删除Lite Server实例 **默认取值**：不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum START for value: "START"
         */
        public static final TypeEnum START = new TypeEnum("START");

        /**
         * Enum STOP for value: "STOP"
         */
        public static final TypeEnum STOP = new TypeEnum("STOP");

        /**
         * Enum REBOOT for value: "REBOOT"
         */
        public static final TypeEnum REBOOT = new TypeEnum("REBOOT");

        /**
         * Enum CHANGEOS for value: "CHANGEOS"
         */
        public static final TypeEnum CHANGEOS = new TypeEnum("CHANGEOS");

        /**
         * Enum REINSTALLOS for value: "REINSTALLOS"
         */
        public static final TypeEnum REINSTALLOS = new TypeEnum("REINSTALLOS");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final TypeEnum DELETE = new TypeEnum("DELETE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("START", START);
            map.put("STOP", STOP);
            map.put("REBOOT", REBOOT);
            map.put("CHANGEOS", CHANGEOS);
            map.put("REINSTALLOS", REINSTALLOS);
            map.put("DELETE", DELETE);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<BatchActionDevServerIds> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private ServerOsRequest extendParam;

    public DevServerBatchRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：批量操作类型。 **约束限制**：不涉及。 **取值范围**： - START：批量启动Lite Server实例 - STOP：批量停止Lite Server实例 - REBOOT：批量重启Lite Server实例 - CHANGEOS：批量切换Lite Server服务器操作系统镜像 - REINSTALLOS：批量重装Lite Server服务器操作系统镜像 - DELETE：批量删除Lite Server实例 **默认取值**：不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DevServerBatchRequest withServers(List<BatchActionDevServerIds> servers) {
        this.servers = servers;
        return this;
    }

    public DevServerBatchRequest addServersItem(BatchActionDevServerIds serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public DevServerBatchRequest withServers(Consumer<List<BatchActionDevServerIds>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * **参数解释**：批量操作Lite Server ID列表。
     * @return servers
     */
    public List<BatchActionDevServerIds> getServers() {
        return servers;
    }

    public void setServers(List<BatchActionDevServerIds> servers) {
        this.servers = servers;
    }

    public DevServerBatchRequest withExtendParam(ServerOsRequest extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public DevServerBatchRequest withExtendParam(Consumer<ServerOsRequest> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ServerOsRequest();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public ServerOsRequest getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ServerOsRequest extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DevServerBatchRequest that = (DevServerBatchRequest) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.servers, that.servers)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, servers, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevServerBatchRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
