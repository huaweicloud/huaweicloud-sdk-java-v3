package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行命令。
 */
public class LifeCycleConfigurationExec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private List<Object> command = null;

    public LifeCycleConfigurationExec withCommand(List<Object> command) {
        this.command = command;
        return this;
    }

    public LifeCycleConfigurationExec addCommandItem(Object commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public LifeCycleConfigurationExec withCommand(Consumer<List<Object>> commandSetter) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        commandSetter.accept(this.command);
        return this;
    }

    /**
     * shell语句。
     * @return command
     */
    public List<Object> getCommand() {
        return command;
    }

    public void setCommand(List<Object> command) {
        this.command = command;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LifeCycleConfigurationExec that = (LifeCycleConfigurationExec) obj;
        return Objects.equals(this.command, that.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LifeCycleConfigurationExec {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
