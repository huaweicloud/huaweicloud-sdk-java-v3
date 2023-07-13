package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改高危命令的请求体
 */
public class RenameHighRiskCommandsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commands")

    private List<CommandInfo> commands = null;

    public RenameHighRiskCommandsRequest withCommands(List<CommandInfo> commands) {
        this.commands = commands;
        return this;
    }

    public RenameHighRiskCommandsRequest addCommandsItem(CommandInfo commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        this.commands.add(commandsItem);
        return this;
    }

    public RenameHighRiskCommandsRequest withCommands(Consumer<List<CommandInfo>> commandsSetter) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /**
     * 高危命令与对应重命名命令。
     * @return commands
     */
    public List<CommandInfo> getCommands() {
        return commands;
    }

    public void setCommands(List<CommandInfo> commands) {
        this.commands = commands;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RenameHighRiskCommandsRequest that = (RenameHighRiskCommandsRequest) obj;
        return Objects.equals(this.commands, that.commands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenameHighRiskCommandsRequest {\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
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
