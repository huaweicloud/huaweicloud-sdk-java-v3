package com.huaweicloud.sdk.iotedge.v2.model;

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
 * 更新边缘模块请求结构体
 */
public class UpdateEdgeModuleReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_settings")

    private ContainerSettingsReqDTO containerSettings;

    /**
     * 模块期望状态: RUNNING(升级后期望模块运行)，STOPPED(升级后期望模块停止)，空值默认继承升级前模块期望状态
     */
    public static final class DesiredStateEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final DesiredStateEnum RUNNING = new DesiredStateEnum("RUNNING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final DesiredStateEnum STOPPED = new DesiredStateEnum("STOPPED");

        private static final Map<String, DesiredStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DesiredStateEnum> createStaticFields() {
            Map<String, DesiredStateEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("STOPPED", STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DesiredStateEnum(String value) {
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
        public static DesiredStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DesiredStateEnum(value));
        }

        public static DesiredStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DesiredStateEnum) {
                return this.value.equals(((DesiredStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desired_state")

    private DesiredStateEnum desiredState;

    public UpdateEdgeModuleReqDTO withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * 边缘应用版本
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public UpdateEdgeModuleReqDTO withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * 边缘模块名称
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public UpdateEdgeModuleReqDTO withContainerSettings(ContainerSettingsReqDTO containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    public UpdateEdgeModuleReqDTO withContainerSettings(Consumer<ContainerSettingsReqDTO> containerSettingsSetter) {
        if (this.containerSettings == null) {
            this.containerSettings = new ContainerSettingsReqDTO();
            containerSettingsSetter.accept(this.containerSettings);
        }

        return this;
    }

    /**
     * Get containerSettings
     * @return containerSettings
     */
    public ContainerSettingsReqDTO getContainerSettings() {
        return containerSettings;
    }

    public void setContainerSettings(ContainerSettingsReqDTO containerSettings) {
        this.containerSettings = containerSettings;
    }

    public UpdateEdgeModuleReqDTO withDesiredState(DesiredStateEnum desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * 模块期望状态: RUNNING(升级后期望模块运行)，STOPPED(升级后期望模块停止)，空值默认继承升级前模块期望状态
     * @return desiredState
     */
    public DesiredStateEnum getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(DesiredStateEnum desiredState) {
        this.desiredState = desiredState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEdgeModuleReqDTO that = (UpdateEdgeModuleReqDTO) obj;
        return Objects.equals(this.appVersion, that.appVersion) && Objects.equals(this.moduleName, that.moduleName)
            && Objects.equals(this.containerSettings, that.containerSettings)
            && Objects.equals(this.desiredState, that.desiredState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appVersion, moduleName, containerSettings, desiredState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeModuleReqDTO {\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    containerSettings: ").append(toIndentedString(containerSettings)).append("\n");
        sb.append("    desiredState: ").append(toIndentedString(desiredState)).append("\n");
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
