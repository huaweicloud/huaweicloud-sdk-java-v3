package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddonInfo
 */
public class AddonInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateName")

    private String addonTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonInstanceID")

    private String addonInstanceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersion")

    private String targetVersion;

    /**
     * **参数解释：** 插件检查类型 **约束限制：** 此参数必填。 **取值范围：** - addonStatic: 运行中插件巡检 - addonUpgrade: 插件升级前检查  **默认取值：** 不涉及 
     */
    public static final class TypeEnum {

        /**
         * Enum ADDONSTATIC for value: "addonStatic"
         */
        public static final TypeEnum ADDONSTATIC = new TypeEnum("addonStatic");

        /**
         * Enum ADDONUPGRADE for value: "addonUpgrade"
         */
        public static final TypeEnum ADDONUPGRADE = new TypeEnum("addonUpgrade");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("addonStatic", ADDONSTATIC);
            map.put("addonUpgrade", ADDONUPGRADE);
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
    @JsonProperty(value = "values")

    private Map<String, Object> values = null;

    public AddonInfo withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * **参数解释：** 插件模板名称 **约束限制：** 不涉及 **取值范围：** cce服务支持的插件模板 **默认取值：** 不涉及 
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    public AddonInfo withAddonInstanceID(String addonInstanceID) {
        this.addonInstanceID = addonInstanceID;
        return this;
    }

    /**
     * **参数解释：** 插件实例ID，可以通过[获取AddonInstance列表](cce_02_0326.xml)中的items[].metadata.uid字段获取 **约束限制：** 此参数必填 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return addonInstanceID
     */
    public String getAddonInstanceID() {
        return addonInstanceID;
    }

    public void setAddonInstanceID(String addonInstanceID) {
        this.addonInstanceID = addonInstanceID;
    }

    public AddonInfo withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * **参数解释：** 插件升级的目标版本 **约束限制：** 插件升级场景下，此参数必填。 **取值范围：** cce服务提供的插件版本，可以通过[查询AddonTemplates列表](cce_02_0321.xml)中的items[].spec.versions.version字段获取 **默认取值：** 不涉及 
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public AddonInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 插件检查类型 **约束限制：** 此参数必填。 **取值范围：** - addonStatic: 运行中插件巡检 - addonUpgrade: 插件升级前检查  **默认取值：** 不涉及 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AddonInfo withValues(Map<String, Object> values) {
        this.values = values;
        return this;
    }

    public AddonInfo putValuesItem(String key, Object valuesItem) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public AddonInfo withValues(Consumer<Map<String, Object>> valuesSetter) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释：** 插件模板编辑/升级参数（各插件不同），请根据具体插件模板信息填写参数 **约束限制：** 不涉及 
     * @return values
     */
    public Map<String, Object> getValues() {
        return values;
    }

    public void setValues(Map<String, Object> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddonInfo that = (AddonInfo) obj;
        return Objects.equals(this.addonTemplateName, that.addonTemplateName)
            && Objects.equals(this.addonInstanceID, that.addonInstanceID)
            && Objects.equals(this.targetVersion, that.targetVersion) && Objects.equals(this.type, that.type)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addonTemplateName, addonInstanceID, targetVersion, type, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonInfo {\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    addonInstanceID: ").append(toIndentedString(addonInstanceID)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
