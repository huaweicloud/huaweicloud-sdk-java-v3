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
 * 插件模板的具体信息。
 */
public class PluginTemplateSpecV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private Boolean optional;

    /**
     * **参数解释**：插件模板类型。 **取值范围**：可选值如下： - helm：helm类型 - ccePlugin：CCE类型
     */
    public static final class TypeEnum {

        /**
         * Enum HELM for value: "helm"
         */
        public static final TypeEnum HELM = new TypeEnum("helm");

        /**
         * Enum _CCEPLUGIN for value: " ccePlugin"
         */
        public static final TypeEnum _CCEPLUGIN = new TypeEnum(" ccePlugin");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("helm", HELM);
            map.put(" ccePlugin", _CCEPLUGIN);
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
    @JsonProperty(value = "logoURL")

    private String logoURL;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<PluginTemplateVersionV2> versions = null;

    public PluginTemplateSpecV2 withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * **参数解释**：是否为必安装插件。 **取值范围**： - true：是 - false：否
     * @return optional
     */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public PluginTemplateSpecV2 withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：插件模板类型。 **取值范围**：可选值如下： - helm：helm类型 - ccePlugin：CCE类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PluginTemplateSpecV2 withLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }

    /**
     * **参数解释**：Logo图片地址。 **取值范围**：不涉及。
     * @return logoURL
     */
    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public PluginTemplateSpecV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：插件模板描述。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PluginTemplateSpecV2 withVersions(List<PluginTemplateVersionV2> versions) {
        this.versions = versions;
        return this;
    }

    public PluginTemplateSpecV2 addVersionsItem(PluginTemplateVersionV2 versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public PluginTemplateSpecV2 withVersions(Consumer<List<PluginTemplateVersionV2>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * **参数解释**：插件模板版本的详细信息。
     * @return versions
     */
    public List<PluginTemplateVersionV2> getVersions() {
        return versions;
    }

    public void setVersions(List<PluginTemplateVersionV2> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginTemplateSpecV2 that = (PluginTemplateSpecV2) obj;
        return Objects.equals(this.optional, that.optional) && Objects.equals(this.type, that.type)
            && Objects.equals(this.logoURL, that.logoURL) && Objects.equals(this.description, that.description)
            && Objects.equals(this.versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optional, type, logoURL, description, versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginTemplateSpecV2 {\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    logoURL: ").append(toIndentedString(logoURL)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
