package com.huaweicloud.sdk.asm.v1.model;

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
 * 网格参数定义
 */
public class MeshSpec {

    /**
     * 网格类型： InCluster: 集群内控制平面形态，基础版网格取值为InCluster
     */
    public static final class TypeEnum {

        /**
         * Enum INCLUSTER for value: "InCluster"
         */
        public static final TypeEnum INCLUSTER = new TypeEnum("InCluster");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("InCluster", INCLUSTER);
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
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParams")

    private MeshExtendParams extendParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<MeshTags> tags = null;

    public MeshSpec withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 网格类型： InCluster: 集群内控制平面形态，基础版网格取值为InCluster
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public MeshSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 网格版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MeshSpec withExtendParams(MeshExtendParams extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    public MeshSpec withExtendParams(Consumer<MeshExtendParams> extendParamsSetter) {
        if (this.extendParams == null) {
            this.extendParams = new MeshExtendParams();
            extendParamsSetter.accept(this.extendParams);
        }

        return this;
    }

    /**
     * Get extendParams
     * @return extendParams
     */
    public MeshExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(MeshExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    public MeshSpec withTags(List<MeshTags> tags) {
        this.tags = tags;
        return this;
    }

    public MeshSpec addTagsItem(MeshTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public MeshSpec withTags(Consumer<List<MeshTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 网格资源标签
     * @return tags
     */
    public List<MeshTags> getTags() {
        return tags;
    }

    public void setTags(List<MeshTags> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MeshSpec that = (MeshSpec) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.extendParams, that.extendParams) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, extendParams, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeshSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
