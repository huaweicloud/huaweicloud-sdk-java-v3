package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** 创建Schema字段的请求对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsCreateSchemaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 字段的数据存储与校验类型。 **约束限制：** 必填；必须在预定义的枚举值中选择。 **取值范围：** - String：字符串类型 - Integer：整数类型 - Float：浮点数类型 - Boolean：布尔值类型 **默认取值：** 不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum STRING for value: "String"
         */
        public static final TypeEnum STRING = new TypeEnum("String");

        /**
         * Enum INTEGER for value: "Integer"
         */
        public static final TypeEnum INTEGER = new TypeEnum("Integer");

        /**
         * Enum FLOAT for value: "Float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("Float");

        /**
         * Enum BOOLEAN for value: "Boolean"
         */
        public static final TypeEnum BOOLEAN = new TypeEnum("Boolean");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("String", STRING);
            map.put("Integer", INTEGER);
            map.put("Float", FLOAT);
            map.put("Boolean", BOOLEAN);
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

    /**
     * **参数解释：** 字段的内容类型。 **约束限制：** 不涉及。 **取值范围：** - text：纯文本 - image：图片 - audio：音频 - video：视频 - file：文件 **默认取值：** 不涉及。
     */
    public static final class ContentTypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final ContentTypeEnum TEXT = new ContentTypeEnum("text");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final ContentTypeEnum IMAGE = new ContentTypeEnum("image");

        /**
         * Enum AUDIO for value: "audio"
         */
        public static final ContentTypeEnum AUDIO = new ContentTypeEnum("audio");

        /**
         * Enum VIDEO for value: "video"
         */
        public static final ContentTypeEnum VIDEO = new ContentTypeEnum("video");

        /**
         * Enum FILE for value: "file"
         */
        public static final ContentTypeEnum FILE = new ContentTypeEnum("file");

        private static final Map<String, ContentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentTypeEnum> createStaticFields() {
            Map<String, ContentTypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("image", IMAGE);
            map.put("audio", AUDIO);
            map.put("video", VIDEO);
            map.put("file", FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ContentTypeEnum(String value) {
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
        public static ContentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ContentTypeEnum(value));
        }

        public static ContentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ContentTypeEnum) {
                return this.value.equals(((ContentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private ContentTypeEnum contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_required")

    private Boolean isRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public OpsCreateSchemaRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 字段的唯一标识符。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsCreateSchemaRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评测集字段的唯一标识符。 **约束限制：** 不涉及。 **取值范围：** 由英文字母、数字和下划线组成，且以字母开头，长度为1~50个字符。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpsCreateSchemaRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 字段的数据存储与校验类型。 **约束限制：** 必填；必须在预定义的枚举值中选择。 **取值范围：** - String：字符串类型 - Integer：整数类型 - Float：浮点数类型 - Boolean：布尔值类型 **默认取值：** 不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OpsCreateSchemaRequest withContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * **参数解释：** 字段的内容类型。 **约束限制：** 不涉及。 **取值范围：** - text：纯文本 - image：图片 - audio：音频 - video：视频 - file：文件 **默认取值：** 不涉及。
     * @return contentType
     */
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public OpsCreateSchemaRequest withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * **参数解释：** 标识该字段在写入数据时是否必填。 **约束限制：** 不涉及。 **取值范围：** - true：必填 - false：可选 **默认取值：** false。
     * @return isRequired
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public OpsCreateSchemaRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 该字段的具体业务含义说明。 **约束限制：** 不涉及。 **取值范围：** 由任意字符组成，长度为1~200个字符。 **默认取值：** 不涉及。
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
        OpsCreateSchemaRequest that = (OpsCreateSchemaRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.contentType, that.contentType)
            && Objects.equals(this.isRequired, that.isRequired) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, contentType, isRequired, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsCreateSchemaRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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
