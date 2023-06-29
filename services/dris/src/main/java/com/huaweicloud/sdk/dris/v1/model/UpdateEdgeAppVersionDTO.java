package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEdgeAppVersionDTO
 */
public class UpdateEdgeAppVersionDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_settings")

    private ContainerSettingsDTO containerSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private Object command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private Object args;

    public UpdateEdgeAppVersionDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：应用描述。  **取值范围**：只允许中文、字母、数字、下划线（_）、中文分号（；）、中文冒号（：）、中文问号（？）、中文感叹号（！）中文逗号（，）、中文句号（。）、英文引号（;）、英文冒号（:）、英文逗号（,）、英文句号（.）、英文问号（?）、英文感叹号（!）、顿号（、）、连接符（-）的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateEdgeAppVersionDTO withContainerSettings(ContainerSettingsDTO containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    public UpdateEdgeAppVersionDTO withContainerSettings(Consumer<ContainerSettingsDTO> containerSettingsSetter) {
        if (this.containerSettings == null) {
            this.containerSettings = new ContainerSettingsDTO();
            containerSettingsSetter.accept(this.containerSettings);
        }

        return this;
    }

    /**
     * Get containerSettings
     * @return containerSettings
     */
    public ContainerSettingsDTO getContainerSettings() {
        return containerSettings;
    }

    public void setContainerSettings(ContainerSettingsDTO containerSettings) {
        this.containerSettings = containerSettings;
    }

    public UpdateEdgeAppVersionDTO withCommand(Object command) {
        this.command = command;
        return this;
    }

    /**
     * **参数说明**：启动命令。
     * @return command
     */
    public Object getCommand() {
        return command;
    }

    public void setCommand(Object command) {
        this.command = command;
    }

    public UpdateEdgeAppVersionDTO withArgs(Object args) {
        this.args = args;
        return this;
    }

    /**
     * **参数说明**：启动参数。
     * @return args
     */
    public Object getArgs() {
        return args;
    }

    public void setArgs(Object args) {
        this.args = args;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEdgeAppVersionDTO that = (UpdateEdgeAppVersionDTO) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.containerSettings, that.containerSettings)
            && Objects.equals(this.command, that.command) && Objects.equals(this.args, that.args);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, containerSettings, command, args);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeAppVersionDTO {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    containerSettings: ").append(toIndentedString(containerSettings)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
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
