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
 * 本地IDE（如PyCharm、VSCode）或SSH客户端，通过SSH远程接入Notebook实例时需要的相关配置。
 */
public class Endpoints {

    /**
     * **参数解释**：支持的服务。 **取值范围**： - NOTEBOOK：可以通过https协议访问Notebook - SSH：可以通过SSH协议远程连接Notebook
     */
    public static final class DevServiceEnum {

        /**
         * Enum AI_FLOW for value: "AI_FLOW"
         */
        public static final DevServiceEnum AI_FLOW = new DevServiceEnum("AI_FLOW");

        /**
         * Enum MA_STUDIO for value: "MA_STUDIO"
         */
        public static final DevServiceEnum MA_STUDIO = new DevServiceEnum("MA_STUDIO");

        /**
         * Enum NOTEBOOK for value: "NOTEBOOK"
         */
        public static final DevServiceEnum NOTEBOOK = new DevServiceEnum("NOTEBOOK");

        /**
         * Enum SSH for value: "SSH"
         */
        public static final DevServiceEnum SSH = new DevServiceEnum("SSH");

        /**
         * Enum TENSOR_BOARD for value: "TENSOR_BOARD"
         */
        public static final DevServiceEnum TENSOR_BOARD = new DevServiceEnum("TENSOR_BOARD");

        /**
         * Enum WEB_IDE for value: "WEB_IDE"
         */
        public static final DevServiceEnum WEB_IDE = new DevServiceEnum("WEB_IDE");

        private static final Map<String, DevServiceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DevServiceEnum> createStaticFields() {
            Map<String, DevServiceEnum> map = new HashMap<>();
            map.put("AI_FLOW", AI_FLOW);
            map.put("MA_STUDIO", MA_STUDIO);
            map.put("NOTEBOOK", NOTEBOOK);
            map.put("SSH", SSH);
            map.put("TENSOR_BOARD", TENSOR_BOARD);
            map.put("WEB_IDE", WEB_IDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DevServiceEnum(String value) {
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
        public static DevServiceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DevServiceEnum(value));
        }

        public static DevServiceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DevServiceEnum) {
                return this.value.equals(((DevServiceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_service")

    private DevServiceEnum devService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extensions")

    private Map<String, String> extensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_keys")

    private List<String> sshKeys = null;

    public Endpoints withDevService(DevServiceEnum devService) {
        this.devService = devService;
        return this;
    }

    /**
     * **参数解释**：支持的服务。 **取值范围**： - NOTEBOOK：可以通过https协议访问Notebook - SSH：可以通过SSH协议远程连接Notebook
     * @return devService
     */
    public DevServiceEnum getDevService() {
        return devService;
    }

    public void setDevService(DevServiceEnum devService) {
        this.devService = devService;
    }

    public Endpoints withExtensions(Map<String, String> extensions) {
        this.extensions = extensions;
        return this;
    }

    public Endpoints putExtensionsItem(String key, String extensionsItem) {
        if (this.extensions == null) {
            this.extensions = new HashMap<>();
        }
        this.extensions.put(key, extensionsItem);
        return this;
    }

    public Endpoints withExtensions(Consumer<Map<String, String>> extensionsSetter) {
        if (this.extensions == null) {
            this.extensions = new HashMap<>();
        }
        extensionsSetter.accept(this.extensions);
        return this;
    }

    /**
     * **参数解释**：通过应用专属URL直接打开应用进入远程开发模式。包含应用的各种扩展配置。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return extensions
     */
    public Map<String, String> getExtensions() {
        return extensions;
    }

    public void setExtensions(Map<String, String> extensions) {
        this.extensions = extensions;
    }

    public Endpoints withSshKeys(List<String> sshKeys) {
        this.sshKeys = sshKeys;
        return this;
    }

    public Endpoints addSshKeysItem(String sshKeysItem) {
        if (this.sshKeys == null) {
            this.sshKeys = new ArrayList<>();
        }
        this.sshKeys.add(sshKeysItem);
        return this;
    }

    public Endpoints withSshKeys(Consumer<List<String>> sshKeysSetter) {
        if (this.sshKeys == null) {
            this.sshKeys = new ArrayList<>();
        }
        sshKeysSetter.accept(this.sshKeys);
        return this;
    }

    /**
     * **参数解释**：SSH密钥对名称列表。允许设置多个密钥对实现同时对SSH实例的访问。 **约束限制**：不涉及。 **取值范围**：0 - 1024个密钥对 **默认取值**：不涉及。
     * @return sshKeys
     */
    public List<String> getSshKeys() {
        return sshKeys;
    }

    public void setSshKeys(List<String> sshKeys) {
        this.sshKeys = sshKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Endpoints that = (Endpoints) obj;
        return Objects.equals(this.devService, that.devService) && Objects.equals(this.extensions, that.extensions)
            && Objects.equals(this.sshKeys, that.sshKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devService, extensions, sshKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoints {\n");
        sb.append("    devService: ").append(toIndentedString(devService)).append("\n");
        sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
        sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
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
