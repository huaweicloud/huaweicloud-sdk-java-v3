package com.huaweicloud.sdk.aom.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EnvParam
 */
public class EnvParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    /**
     * 环境类型，取值：DEV、TEST、PRE、ONLINE，不区分大小写
     */
    public static final class EnvTypeEnum {

        /**
         * Enum DEV for value: "DEV"
         */
        public static final EnvTypeEnum DEV = new EnvTypeEnum("DEV");

        /**
         * Enum TEST for value: "TEST"
         */
        public static final EnvTypeEnum TEST = new EnvTypeEnum("TEST");

        /**
         * Enum PRE for value: "PRE"
         */
        public static final EnvTypeEnum PRE = new EnvTypeEnum("PRE");

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final EnvTypeEnum ONLINE = new EnvTypeEnum("ONLINE");

        private static final Map<String, EnvTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EnvTypeEnum> createStaticFields() {
            Map<String, EnvTypeEnum> map = new HashMap<>();
            map.put("DEV", DEV);
            map.put("TEST", TEST);
            map.put("PRE", PRE);
            map.put("ONLINE", ONLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EnvTypeEnum(String value) {
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
        public static EnvTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EnvTypeEnum(value));
        }

        public static EnvTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EnvTypeEnum) {
                return this.value.equals(((EnvTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_type")

    private EnvTypeEnum envType;

    /**
     * OS类型，取值：LINUX、WINDOWS。创建环境必传，不可修改
     */
    public static final class OsTypeEnum {

        /**
         * Enum LINUX for value: "LINUX"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("LINUX");

        /**
         * Enum WINDOWS for value: "WINDOWS"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("WINDOWS");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("LINUX", LINUX);
            map.put("WINDOWS", WINDOWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    /**
     * 注册类型，取值：API、SERVICE_DISCOVERY、CONSOLE，默认值：API
     */
    public static final class RegisterTypeEnum {

        /**
         * Enum API for value: "API"
         */
        public static final RegisterTypeEnum API = new RegisterTypeEnum("API");

        /**
         * Enum CONSOLE for value: "CONSOLE"
         */
        public static final RegisterTypeEnum CONSOLE = new RegisterTypeEnum("CONSOLE");

        /**
         * Enum SERVICE_DISCOVERY for value: "SERVICE_DISCOVERY"
         */
        public static final RegisterTypeEnum SERVICE_DISCOVERY = new RegisterTypeEnum("SERVICE_DISCOVERY");

        private static final Map<String, RegisterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegisterTypeEnum> createStaticFields() {
            Map<String, RegisterTypeEnum> map = new HashMap<>();
            map.put("API", API);
            map.put("CONSOLE", CONSOLE);
            map.put("SERVICE_DISCOVERY", SERVICE_DISCOVERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RegisterTypeEnum(String value) {
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
        public static RegisterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RegisterTypeEnum(value));
        }

        public static RegisterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RegisterTypeEnum) {
                return this.value.equals(((RegisterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_type")

    private RegisterTypeEnum registerType;

    public EnvParam withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 环境关联组件id；id长度不能超过36位，由大小写字母、数字组成。创建环境必传，修改环境时非必选
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public EnvParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述：最大255字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnvParam withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 显示名：字符集长度2-64，仅支持字符集：中文字符、英文字母、数字、下划线、中划线、点
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public EnvParam withEnvType(EnvTypeEnum envType) {
        this.envType = envType;
        return this;
    }

    /**
     * 环境类型，取值：DEV、TEST、PRE、ONLINE，不区分大小写
     * @return envType
     */
    public EnvTypeEnum getEnvType() {
        return envType;
    }

    public void setEnvType(EnvTypeEnum envType) {
        this.envType = envType;
    }

    public EnvParam withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * OS类型，取值：LINUX、WINDOWS。创建环境必传，不可修改
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public EnvParam withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 环境关联region。创建环境必传，不可修改
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public EnvParam withRegisterType(RegisterTypeEnum registerType) {
        this.registerType = registerType;
        return this;
    }

    /**
     * 注册类型，取值：API、SERVICE_DISCOVERY、CONSOLE，默认值：API
     * @return registerType
     */
    public RegisterTypeEnum getRegisterType() {
        return registerType;
    }

    public void setRegisterType(RegisterTypeEnum registerType) {
        this.registerType = registerType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvParam that = (EnvParam) obj;
        return Objects.equals(this.componentId, that.componentId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.envName, that.envName) && Objects.equals(this.envType, that.envType)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.region, that.region)
            && Objects.equals(this.registerType, that.registerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, description, envName, envType, osType, region, registerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvParam {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    registerType: ").append(toIndentedString(registerType)).append("\n");
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
