package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 启动后处理或者停止前处理参数。
 */
public class LifecycleProcessParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private List<String> command = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public LifecycleProcessParameter withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public LifecycleProcessParameter addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public LifecycleProcessParameter withCommand(Consumer<List<String>> commandSetter) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        commandSetter.accept(this.command);
        return this;
    }

    /**
     * 命令参数，适用于command类型
     * @return command
     */
    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public LifecycleProcessParameter withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 默认为POD实例的IP地址。也可以自己指定。适用于http类型。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public LifecycleProcessParameter withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号，适用于http类型。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public LifecycleProcessParameter withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 请求url，适用于http类型。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LifecycleProcessParameter lifecycleProcessParameter = (LifecycleProcessParameter) o;
        return Objects.equals(this.command, lifecycleProcessParameter.command)
            && Objects.equals(this.host, lifecycleProcessParameter.host)
            && Objects.equals(this.port, lifecycleProcessParameter.port)
            && Objects.equals(this.path, lifecycleProcessParameter.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, host, port, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LifecycleProcessParameter {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
