package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateEdgeApplicationVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_app_id")

    private String edgeAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private String lastModifiedTime;

    /**
     * **参数说明**：应用版本状态。  **取值范围**：  - DRAFT：草稿  - PUBLISHED：发布  - OFF_SHELF：下线
     */
    public static final class StateEnum {

        /**
         * Enum DRAFT for value: "DRAFT"
         */
        public static final StateEnum DRAFT = new StateEnum("DRAFT");

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StateEnum PUBLISHED = new StateEnum("PUBLISHED");

        /**
         * Enum OFF_SHELF for value: "OFF_SHELF"
         */
        public static final StateEnum OFF_SHELF = new StateEnum("OFF_SHELF");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("DRAFT", DRAFT);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFF_SHELF", OFF_SHELF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private List<String> command = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private List<String> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_settings")

    private ContainerSettingsDTO containerSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private String publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "off_shelf_time")

    private String offShelfTime;

    public CreateEdgeApplicationVersionResponse withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    /**
     * **参数说明**：用户自定义应用唯一ID。  **取值范围**：只允许字母、数字、下划线（_）、连接符（-）、美元符号（$）的组合。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    public CreateEdgeApplicationVersionResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数说明**：应用版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateEdgeApplicationVersionResponse withDescription(String description) {
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

    public CreateEdgeApplicationVersionResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**：创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public CreateEdgeApplicationVersionResponse withLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**：最后一次修改时间。
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public CreateEdgeApplicationVersionResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数说明**：应用版本状态。  **取值范围**：  - DRAFT：草稿  - PUBLISHED：发布  - OFF_SHELF：下线
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public CreateEdgeApplicationVersionResponse withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public CreateEdgeApplicationVersionResponse addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public CreateEdgeApplicationVersionResponse withCommand(Consumer<List<String>> commandSetter) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        commandSetter.accept(this.command);
        return this;
    }

    /**
     * **参数说明**：启动命令。
     * @return command
     */
    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public CreateEdgeApplicationVersionResponse withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public CreateEdgeApplicationVersionResponse addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public CreateEdgeApplicationVersionResponse withArgs(Consumer<List<String>> argsSetter) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * **参数说明**：启动参数。
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public CreateEdgeApplicationVersionResponse withContainerSettings(ContainerSettingsDTO containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    public CreateEdgeApplicationVersionResponse withContainerSettings(
        Consumer<ContainerSettingsDTO> containerSettingsSetter) {
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

    public CreateEdgeApplicationVersionResponse withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * **参数说明**：发布时间。
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public CreateEdgeApplicationVersionResponse withOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
        return this;
    }

    /**
     * **参数说明**：下线时间。
     * @return offShelfTime
     */
    public String getOffShelfTime() {
        return offShelfTime;
    }

    public void setOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEdgeApplicationVersionResponse createEdgeApplicationVersionResponse =
            (CreateEdgeApplicationVersionResponse) o;
        return Objects.equals(this.edgeAppId, createEdgeApplicationVersionResponse.edgeAppId)
            && Objects.equals(this.version, createEdgeApplicationVersionResponse.version)
            && Objects.equals(this.description, createEdgeApplicationVersionResponse.description)
            && Objects.equals(this.createdTime, createEdgeApplicationVersionResponse.createdTime)
            && Objects.equals(this.lastModifiedTime, createEdgeApplicationVersionResponse.lastModifiedTime)
            && Objects.equals(this.state, createEdgeApplicationVersionResponse.state)
            && Objects.equals(this.command, createEdgeApplicationVersionResponse.command)
            && Objects.equals(this.args, createEdgeApplicationVersionResponse.args)
            && Objects.equals(this.containerSettings, createEdgeApplicationVersionResponse.containerSettings)
            && Objects.equals(this.publishTime, createEdgeApplicationVersionResponse.publishTime)
            && Objects.equals(this.offShelfTime, createEdgeApplicationVersionResponse.offShelfTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId,
            version,
            description,
            createdTime,
            lastModifiedTime,
            state,
            command,
            args,
            containerSettings,
            publishTime,
            offShelfTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeApplicationVersionResponse {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    containerSettings: ").append(toIndentedString(containerSettings)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    offShelfTime: ").append(toIndentedString(offShelfTime)).append("\n");
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
