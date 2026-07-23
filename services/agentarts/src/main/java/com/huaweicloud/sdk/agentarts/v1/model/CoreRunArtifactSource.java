package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * **参数解释**: Agent来源数据结构。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
 */
public class CoreRunArtifactSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commands")

    private List<String> commands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_instance_id")

    private UUID swrInstanceId;

    public CoreRunArtifactSource withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**: Agent镜像地址，用于运行时拉取镜像启动Agent服务，可以通过SWR控制台以及SWR的镜像查询接口获取对应的镜像地址。 **约束限制**: 必须是一个有效的SWR镜像地址。 **取值范围**: 长度为 1 - 2048 个字符。 **默认取值**: 不涉及。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CoreRunArtifactSource withCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

    public CoreRunArtifactSource addCommandsItem(String commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        this.commands.add(commandsItem);
        return this;
    }

    public CoreRunArtifactSource withCommands(Consumer<List<String>> commandsSetter) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /**
     * **参数解释**: 启动镜像的命令，示例：python main.py --port=8080。 **约束限制**: 不涉及。 **取值范围**: 最多 10 个元素，每个元素长度为 1 - 256 个字符。 **默认取值**: 不涉及。 
     * @return commands
     */
    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public CoreRunArtifactSource withSwrInstanceId(UUID swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
        return this;
    }

    /**
     * **参数解释**: SWR企业版实例ID。 **约束限制**: 不涉及。 **取值范围**: 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值**: 不涉及。
     * @return swrInstanceId
     */
    public UUID getSwrInstanceId() {
        return swrInstanceId;
    }

    public void setSwrInstanceId(UUID swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunArtifactSource that = (CoreRunArtifactSource) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.commands, that.commands)
            && Objects.equals(this.swrInstanceId, that.swrInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, commands, swrInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunArtifactSource {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    swrInstanceId: ").append(toIndentedString(swrInstanceId)).append("\n");
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
