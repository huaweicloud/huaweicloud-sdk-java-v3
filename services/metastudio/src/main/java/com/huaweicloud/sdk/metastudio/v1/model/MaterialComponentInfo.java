package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 可替换的素材组件信息
 */
public class MaterialComponentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    /**
     * 素材组件类型。 * CLOTHES： 衣服 * PANTS： 裤子 * SHOES： 鞋子 * HAIR： 头发 * EYELASH： 睫毛 * EYEBROW： 眉毛
     */
    public static final class ComponentTypeEnum {

        /**
         * Enum CLOTHES for value: "CLOTHES"
         */
        public static final ComponentTypeEnum CLOTHES = new ComponentTypeEnum("CLOTHES");

        /**
         * Enum PANTS for value: "PANTS"
         */
        public static final ComponentTypeEnum PANTS = new ComponentTypeEnum("PANTS");

        /**
         * Enum SHOES for value: "SHOES"
         */
        public static final ComponentTypeEnum SHOES = new ComponentTypeEnum("SHOES");

        /**
         * Enum HAIR for value: "HAIR"
         */
        public static final ComponentTypeEnum HAIR = new ComponentTypeEnum("HAIR");

        /**
         * Enum EYELASH for value: "EYELASH"
         */
        public static final ComponentTypeEnum EYELASH = new ComponentTypeEnum("EYELASH");

        /**
         * Enum EYEBROW for value: "EYEBROW"
         */
        public static final ComponentTypeEnum EYEBROW = new ComponentTypeEnum("EYEBROW");

        private static final Map<String, ComponentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComponentTypeEnum> createStaticFields() {
            Map<String, ComponentTypeEnum> map = new HashMap<>();
            map.put("CLOTHES", CLOTHES);
            map.put("PANTS", PANTS);
            map.put("SHOES", SHOES);
            map.put("HAIR", HAIR);
            map.put("EYELASH", EYELASH);
            map.put("EYEBROW", EYEBROW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ComponentTypeEnum(String value) {
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
        public static ComponentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ComponentTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ComponentTypeEnum(value);
            }
            return result;
        }

        public static ComponentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ComponentTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ComponentTypeEnum) {
                return this.value.equals(((ComponentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_type")

    private ComponentTypeEnum componentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_desc")

    private String componentDesc;

    public MaterialComponentInfo withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 素材组件名称。
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public MaterialComponentInfo withComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * 素材组件类型。 * CLOTHES： 衣服 * PANTS： 裤子 * SHOES： 鞋子 * HAIR： 头发 * EYELASH： 睫毛 * EYEBROW： 眉毛
     * @return componentType
     */
    public ComponentTypeEnum getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
    }

    public MaterialComponentInfo withComponentDesc(String componentDesc) {
        this.componentDesc = componentDesc;
        return this;
    }

    /**
     * 素材组件描述。
     * @return componentDesc
     */
    public String getComponentDesc() {
        return componentDesc;
    }

    public void setComponentDesc(String componentDesc) {
        this.componentDesc = componentDesc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaterialComponentInfo materialComponentInfo = (MaterialComponentInfo) o;
        return Objects.equals(this.componentName, materialComponentInfo.componentName)
            && Objects.equals(this.componentType, materialComponentInfo.componentType)
            && Objects.equals(this.componentDesc, materialComponentInfo.componentDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentName, componentType, componentDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MaterialComponentInfo {\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    componentDesc: ").append(toIndentedString(componentDesc)).append("\n");
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
