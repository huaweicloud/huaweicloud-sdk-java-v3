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
 * BizAppParam
 */
public class BizAppParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 前端默认是CONSOLE，不需要传参。rest接口无参数是API，有参数只能是：SERVICE_DISCOVERY
     */
    public static final class RegisterTypeEnum {

        /**
         * Enum API for value: "API"
         */
        public static final RegisterTypeEnum API = new RegisterTypeEnum("API");

        /**
         * Enum CONSOLESERVICE_DISCOVERY for value: "CONSOLESERVICE_DISCOVERY"
         */
        public static final RegisterTypeEnum CONSOLESERVICE_DISCOVERY =
            new RegisterTypeEnum("CONSOLESERVICE_DISCOVERY");

        private static final Map<String, RegisterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegisterTypeEnum> createStaticFields() {
            Map<String, RegisterTypeEnum> map = new HashMap<>();
            map.put("API", API);
            map.put("CONSOLESERVICE_DISCOVERY", CONSOLESERVICE_DISCOVERY);
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

    public BizAppParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BizAppParam withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 应用名称.字符集长度2-64，仅支持字符集：中文字符、英文字母、数字、下划线、中划线、点
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BizAppParam withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 应用关联的企业项目id。企业级用户必传
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public BizAppParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 唯一标识.字符集长度2-64，仅支持字符集：英文字母、数字、下划线、中划线、点
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BizAppParam withRegisterType(RegisterTypeEnum registerType) {
        this.registerType = registerType;
        return this;
    }

    /**
     * 前端默认是CONSOLE，不需要传参。rest接口无参数是API，有参数只能是：SERVICE_DISCOVERY
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
        BizAppParam that = (BizAppParam) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.epsId, that.epsId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.registerType, that.registerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, displayName, epsId, name, registerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BizAppParam {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
