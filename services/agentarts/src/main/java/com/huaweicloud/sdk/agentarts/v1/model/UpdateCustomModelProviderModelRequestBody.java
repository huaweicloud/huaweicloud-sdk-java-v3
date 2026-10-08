package com.huaweicloud.sdk.agentarts.v1.model;

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
 * UpdateCustomModelProviderModelRequestBody
 */
public class UpdateCustomModelProviderModelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_service_name")

    private String modelServiceName;

    /**
     * **参数解释：** 模型的类型。 **约束限制：** 不涉及。 **取值范围：** - completions: 文本对话/图像理解 - responses: 多模态对话 - embeddings: 文本向量化 - rerank: 文本排序 - messages: 文本对话/图像理解 - realtime: 实时语音对话 - token_count: token计数 **默认取值：** 不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum COMPLETIONS for value: "completions"
         */
        public static final TypeEnum COMPLETIONS = new TypeEnum("completions");

        /**
         * Enum RESPONSES for value: "responses"
         */
        public static final TypeEnum RESPONSES = new TypeEnum("responses");

        /**
         * Enum EMBEDDINGS for value: "embeddings"
         */
        public static final TypeEnum EMBEDDINGS = new TypeEnum("embeddings");

        /**
         * Enum RERANK for value: "rerank"
         */
        public static final TypeEnum RERANK = new TypeEnum("rerank");

        /**
         * Enum MESSAGES for value: "messages"
         */
        public static final TypeEnum MESSAGES = new TypeEnum("messages");

        /**
         * Enum REALTIME for value: "realtime"
         */
        public static final TypeEnum REALTIME = new TypeEnum("realtime");

        /**
         * Enum TOKEN_COUNT for value: "token_count"
         */
        public static final TypeEnum TOKEN_COUNT = new TypeEnum("token_count");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("completions", COMPLETIONS);
            map.put("responses", RESPONSES);
            map.put("embeddings", EMBEDDINGS);
            map.put("rerank", RERANK);
            map.put("messages", MESSAGES);
            map.put("realtime", REALTIME);
            map.put("token_count", TOKEN_COUNT);
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

    private List<TypeEnum> type = null;

    /**
     * **参数解释：** API接口协议。 **约束限制：** 不涉及。 **取值范围：** - openai: 标准OpenAI协议 - anthropic: Anthropic协议 - maas_v1: MaaS标准API V1 **默认取值：** 不涉及。 
     */
    public static final class ProtocolEnum {

        /**
         * Enum OPENAI for value: "openai"
         */
        public static final ProtocolEnum OPENAI = new ProtocolEnum("openai");

        /**
         * Enum ANTHROPIC for value: "anthropic"
         */
        public static final ProtocolEnum ANTHROPIC = new ProtocolEnum("anthropic");

        /**
         * Enum MAAS_V1 for value: "maas_v1"
         */
        public static final ProtocolEnum MAAS_V1 = new ProtocolEnum("maas_v1");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("openai", OPENAI);
            map.put("anthropic", ANTHROPIC);
            map.put("maas_v1", MAAS_V1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateCustomModelProviderModelRequestBody withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * **参数解释：** 模型名称。 **约束限制：** 不涉及。 **取值范围：** 长度为1-256个字符。由字母、数字、连字符、点、下划线、星号、问号和@符号组成的字符，支持*的前缀通配以及后缀通配。 **默认取值：** 不涉及。 
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public UpdateCustomModelProviderModelRequestBody withModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }

    /**
     * **参数解释：** 显示名称。 **约束限制：** 不涉及。 **取值范围：** 长度为2-64个字符，支持中英文、数字及符号: . _ / | \\ -，须以中英文或数字开头结尾。符合正则条件^[\\u4e00-\\u9fa5A-Za-z0-9][\\u4e00-\\u9fa5A-Za-z0-9._/|\\\\-]{0,62}[\\u4e00-\\u9fa5A-Za-z0-9]$。 **默认取值：** 不涉及。 
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return modelServiceName;
    }

    public void setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
    }

    public UpdateCustomModelProviderModelRequestBody withType(List<TypeEnum> type) {
        this.type = type;
        return this;
    }

    public UpdateCustomModelProviderModelRequestBody addTypeItem(TypeEnum typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public UpdateCustomModelProviderModelRequestBody withType(Consumer<List<TypeEnum>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * **参数解释：** 模型的类型。 **约束限制：** 不涉及。 **取值范围：** 数组长度为1-10个。 **默认取值：** 不涉及。 
     * @return type
     */
    public List<TypeEnum> getType() {
        return type;
    }

    public void setType(List<TypeEnum> type) {
        this.type = type;
    }

    public UpdateCustomModelProviderModelRequestBody withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释：** API接口协议。 **约束限制：** 不涉及。 **取值范围：** - openai: 标准OpenAI协议 - anthropic: Anthropic协议 - maas_v1: MaaS标准API V1 **默认取值：** 不涉及。 
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public UpdateCustomModelProviderModelRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 模型的详细描述。 **取值范围：** 长度为 0-1000 个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCustomModelProviderModelRequestBody that = (UpdateCustomModelProviderModelRequestBody) obj;
        return Objects.equals(this.model, that.model) && Objects.equals(this.modelServiceName, that.modelServiceName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, modelServiceName, type, protocol, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomModelProviderModelRequestBody {\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    modelServiceName: ").append(toIndentedString(modelServiceName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
