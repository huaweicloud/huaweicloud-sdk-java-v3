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
 * 场景组件信息。
 */
public class SceneComponentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    /**
     * 组件类型。 * CAMERA：摄像机 * PANEL：屏幕 * LIGHT：灯光
     */
    public static final class ComponentTypeEnum {

        /**
         * Enum CAMERA for value: "CAMERA"
         */
        public static final ComponentTypeEnum CAMERA = new ComponentTypeEnum("CAMERA");

        /**
         * Enum PANEL for value: "PANEL"
         */
        public static final ComponentTypeEnum PANEL = new ComponentTypeEnum("PANEL");

        /**
         * Enum LIGHT for value: "LIGHT"
         */
        public static final ComponentTypeEnum LIGHT = new ComponentTypeEnum("LIGHT");

        private static final Map<String, ComponentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComponentTypeEnum> createStaticFields() {
            Map<String, ComponentTypeEnum> map = new HashMap<>();
            map.put("CAMERA", CAMERA);
            map.put("PANEL", PANEL);
            map.put("LIGHT", LIGHT);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentTypeEnum(value));
        }

        public static ComponentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public SceneComponentInfo withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 组件索引。
     * minimum: 1
     * maximum: 10
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public SceneComponentInfo withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 组件名称。
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public SceneComponentInfo withComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * 组件类型。 * CAMERA：摄像机 * PANEL：屏幕 * LIGHT：灯光
     * @return componentType
     */
    public ComponentTypeEnum getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
    }

    public SceneComponentInfo withComponentDesc(String componentDesc) {
        this.componentDesc = componentDesc;
        return this;
    }

    /**
     * 组件描述。
     * @return componentDesc
     */
    public String getComponentDesc() {
        return componentDesc;
    }

    public void setComponentDesc(String componentDesc) {
        this.componentDesc = componentDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SceneComponentInfo that = (SceneComponentInfo) obj;
        return Objects.equals(this.index, that.index) && Objects.equals(this.componentName, that.componentName)
            && Objects.equals(this.componentType, that.componentType)
            && Objects.equals(this.componentDesc, that.componentDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, componentName, componentType, componentDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SceneComponentInfo {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
