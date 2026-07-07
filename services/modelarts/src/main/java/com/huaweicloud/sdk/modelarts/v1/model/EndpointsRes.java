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
 * 本地IDE（如PyCharm、VS Code）或SSH客户端，通过SSH远程接入Notebook实例时需要的相关配置。
 */
public class EndpointsRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_service")

    private String devService;

    /**
     * **参数解释**：访问Notebook的途径。 **取值范围**：枚举类型，取值如下： - NOTEBOOK：可以通过https协议访问Notebook。 - SSH：可以通过SSH协议远程连接Notebook。
     */
    public static final class ServiceEnum {

        /**
         * Enum NOTEBOOK for value: "NOTEBOOK"
         */
        public static final ServiceEnum NOTEBOOK = new ServiceEnum("NOTEBOOK");

        /**
         * Enum SSH for value: "SSH"
         */
        public static final ServiceEnum SSH = new ServiceEnum("SSH");

        private static final Map<String, ServiceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceEnum> createStaticFields() {
            Map<String, ServiceEnum> map = new HashMap<>();
            map.put("NOTEBOOK", NOTEBOOK);
            map.put("SSH", SSH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceEnum(String value) {
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
        public static ServiceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServiceEnum(value));
        }

        public static ServiceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceEnum) {
                return this.value.equals(((ServiceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private ServiceEnum service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_pair_names")

    private List<String> keyPairNames = null;

    public EndpointsRes withDevService(String devService) {
        this.devService = devService;
        return this;
    }

    /**
     * **参数解释**：访问Notebook的途径。 **取值范围**：枚举类型，取值如下： - NOTEBOOK：可以通过https协议访问Notebook。 - SSH：可以通过SSH协议远程连接Notebook。
     * @return devService
     */
    public String getDevService() {
        return devService;
    }

    public void setDevService(String devService) {
        this.devService = devService;
    }

    public EndpointsRes withService(ServiceEnum service) {
        this.service = service;
        return this;
    }

    /**
     * **参数解释**：访问Notebook的途径。 **取值范围**：枚举类型，取值如下： - NOTEBOOK：可以通过https协议访问Notebook。 - SSH：可以通过SSH协议远程连接Notebook。
     * @return service
     */
    public ServiceEnum getService() {
        return service;
    }

    public void setService(ServiceEnum service) {
        this.service = service;
    }

    public EndpointsRes withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**：实例私有IP地址。 **取值范围**：不涉及。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public EndpointsRes withKeyPairNames(List<String> keyPairNames) {
        this.keyPairNames = keyPairNames;
        return this;
    }

    public EndpointsRes addKeyPairNamesItem(String keyPairNamesItem) {
        if (this.keyPairNames == null) {
            this.keyPairNames = new ArrayList<>();
        }
        this.keyPairNames.add(keyPairNamesItem);
        return this;
    }

    public EndpointsRes withKeyPairNames(Consumer<List<String>> keyPairNamesSetter) {
        if (this.keyPairNames == null) {
            this.keyPairNames = new ArrayList<>();
        }
        keyPairNamesSetter.accept(this.keyPairNames);
        return this;
    }

    /**
     * **参数解释**：SSH密钥对名称列表，允许设置多个密钥对实现同时对SSH实例的访问。 **取值范围**：不涉及。
     * @return keyPairNames
     */
    public List<String> getKeyPairNames() {
        return keyPairNames;
    }

    public void setKeyPairNames(List<String> keyPairNames) {
        this.keyPairNames = keyPairNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointsRes that = (EndpointsRes) obj;
        return Objects.equals(this.devService, that.devService) && Objects.equals(this.service, that.service)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.keyPairNames, that.keyPairNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devService, service, uri, keyPairNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointsRes {\n");
        sb.append("    devService: ").append(toIndentedString(devService)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    keyPairNames: ").append(toIndentedString(keyPairNames)).append("\n");
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
