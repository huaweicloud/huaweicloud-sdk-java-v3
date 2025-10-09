package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ClusterLogConfigLogConfigs
 */
public class ClusterLogConfigLogConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    /**
     * **参数解释**： 组件类型 , 合法取值为control，audit，system-addon。 **约束限制**： - 仅查询集群日志配置信息接口响应中返回该参数 - 作为**配置集群日志**接口更新参数时不支持配置  **取值范围**： - control: 控制面组件日志。 - audit: 控制面审计日志。 - system-addon: 系统插件日志。 **默认取值**： 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum CONTROL for value: "control"
         */
        public static final TypeEnum CONTROL = new TypeEnum("control");

        /**
         * Enum AUDIT for value: "audit"
         */
        public static final TypeEnum AUDIT = new TypeEnum("audit");

        /**
         * Enum SYSTEM_ADDON for value: "system-addon"
         */
        public static final TypeEnum SYSTEM_ADDON = new TypeEnum("system-addon");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("control", CONTROL);
            map.put("audit", AUDIT);
            map.put("system-addon", SYSTEM_ADDON);
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

    public ClusterLogConfigLogConfigs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 日志类型 **约束限制**： 必须为 **kube-apiserver**、**kube-controller-manager**、**kube-scheduler**、**audit** 或者系统插件名称 **取值范围**： - kube-apiserver：采集kube-apiserver组件日志 - kube-controller-manager：采集kube-controller-manager日志 - kube-scheduler：采集kube-scheduler日志 - audit：采集审计日志 - 系统插件名称：采集插件日志  **默认取值**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterLogConfigLogConfigs withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**： 是否采集 **取值范围**： - true：开启日志采集 - false：关闭日志采集
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ClusterLogConfigLogConfigs withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 组件类型 , 合法取值为control，audit，system-addon。 **约束限制**： - 仅查询集群日志配置信息接口响应中返回该参数 - 作为**配置集群日志**接口更新参数时不支持配置  **取值范围**： - control: 控制面组件日志。 - audit: 控制面审计日志。 - system-addon: 系统插件日志。 **默认取值**： 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterLogConfigLogConfigs that = (ClusterLogConfigLogConfigs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enable, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterLogConfigLogConfigs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
