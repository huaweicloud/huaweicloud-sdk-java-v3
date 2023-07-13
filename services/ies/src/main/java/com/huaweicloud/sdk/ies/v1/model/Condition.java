package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 场地条件
 */
public class Condition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private Integer environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space")

    private Integer space;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transport")

    private Integer transport;

    /**
     * 整柜安装评估 取值范围：   - UNCLEAR：不清楚是否允许整柜安装，需要评估   - UNSUPPORT：不允许整柜安装，需将设备放入现有机柜   - SUPPORT：可支持整柜安装，并入现有机柜组
     */
    public static final class InstallationEnum {

        /**
         * Enum UNCLEAR for value: "UNCLEAR"
         */
        public static final InstallationEnum UNCLEAR = new InstallationEnum("UNCLEAR");

        /**
         * Enum UNSUPPORT for value: "UNSUPPORT"
         */
        public static final InstallationEnum UNSUPPORT = new InstallationEnum("UNSUPPORT");

        /**
         * Enum SUPPORT for value: "SUPPORT"
         */
        public static final InstallationEnum SUPPORT = new InstallationEnum("SUPPORT");

        private static final Map<String, InstallationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstallationEnum> createStaticFields() {
            Map<String, InstallationEnum> map = new HashMap<>();
            map.put("UNCLEAR", UNCLEAR);
            map.put("UNSUPPORT", UNSUPPORT);
            map.put("SUPPORT", SUPPORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstallationEnum(String value) {
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
        public static InstallationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstallationEnum(value));
        }

        public static InstallationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstallationEnum) {
                return this.value.equals(((InstallationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installation")

    private InstallationEnum installation;

    public Condition withEnvironment(Integer environment) {
        this.environment = environment;
        return this;
    }

    /**
     * 机房环境条件 取值范围：   - 0：机房条件不属于上述任何一种情况   - 1：机房使用模块化数据中心方案进行建设   - 2：机房已通过国家级或行业级标准化认证
     * minimum: 0
     * maximum: 2
     * @return environment
     */
    public Integer getEnvironment() {
        return environment;
    }

    public void setEnvironment(Integer environment) {
        this.environment = environment;
    }

    public Condition withSpace(Integer space) {
        this.space = space;
        return this;
    }

    /**
     * 机柜空间条件 取值范围：   - 0：暂无扩容计划，不考虑额外余量   - 1：机柜余量相对充裕，可放置空间超过3柜   - 2：机柜余量相对紧张，可放置空间3柜以内
     * minimum: 0
     * maximum: 2
     * @return space
     */
    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public Condition withTransport(Integer transport) {
        this.transport = transport;
        return this;
    }

    /**
     * 运输条件 取值范围：   - 0：运输通道和机房门的高度或宽度不满足要求   - 1：运输通道，货梯，机房门均可满足整机柜滚轮搬运   - 2：运输通道，货梯，机房门不能支持整机柜滚轮搬运，沿途有台阶
     * minimum: 0
     * maximum: 2
     * @return transport
     */
    public Integer getTransport() {
        return transport;
    }

    public void setTransport(Integer transport) {
        this.transport = transport;
    }

    public Condition withInstallation(InstallationEnum installation) {
        this.installation = installation;
        return this;
    }

    /**
     * 整柜安装评估 取值范围：   - UNCLEAR：不清楚是否允许整柜安装，需要评估   - UNSUPPORT：不允许整柜安装，需将设备放入现有机柜   - SUPPORT：可支持整柜安装，并入现有机柜组
     * @return installation
     */
    public InstallationEnum getInstallation() {
        return installation;
    }

    public void setInstallation(InstallationEnum installation) {
        this.installation = installation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Condition that = (Condition) obj;
        return Objects.equals(this.environment, that.environment) && Objects.equals(this.space, that.space)
            && Objects.equals(this.transport, that.transport) && Objects.equals(this.installation, that.installation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, space, transport, installation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
        sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
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
