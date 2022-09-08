package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RunShellCommandRequestBody
 */
public class RunShellCommandRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_ids")

    private List<String> phoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    public RunShellCommandRequestBody withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 手机管理命令 - 推送文件场景固定填写push - 安装apk场景固定填写install - 安装多apk场景固定填写install-multiple - 卸载apk场景固定填写uninstall - 执行命令固定写shell
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public RunShellCommandRequestBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * - 推送文件场景：指定OBS桶中的tar文件。最大长度为1024字节，只支持大小写字母、数字、下划线（_）、点（.）、斜线（/）、冒号（:）、中划线（-）。推送的文件只支持tar文件类型。文件格式：obs://obs-bucket-name/obs-file-path/file.tar  - 安装apk场景：指定OBS桶中的apk文件（需要提前上传到指定桶中）。单apk场景，只能传一个apk。最大长度为1024字节，只支持大小写字母、数字、下划线（_）、点（.）、斜线（/）、冒号（:）、中划线（-）。推送的文件只支持apk文件类型。文件格式：obs://obs-bucket-name/obs-file-path/file.apk  - 安装多apk场景：指定OBS桶中的apk文件（需要提前上传到指定桶中）。多apk场景，最多传50个apk，中间用空格分开，最大长度8100字节，只支持大小写字母、数字、下划线（_）、点（.）、斜线（/）、冒号（:）、中划线（-）。推送的文件只支持apk文件类型。文件格式：obs://obs-bucket-name/obs-file-path/file.apk  - 卸载apk场景：待卸载的APP名称。最大长度为1024字节，只支持大小写字母、数字、下划线（_）、点（.）、斜线（/）、冒号（:）、中划线（-）  - 执行命令场景：待执行的命令。最大长度为1024字节，只支持大小写字母、数字、下划线（_）、点（.）、斜线（/）、冒号（:）、中划线（-）
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RunShellCommandRequestBody withPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
        return this;
    }

    public RunShellCommandRequestBody addPhoneIdsItem(String phoneIdsItem) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        this.phoneIds.add(phoneIdsItem);
        return this;
    }

    public RunShellCommandRequestBody withPhoneIds(Consumer<List<String>> phoneIdsSetter) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        phoneIdsSetter.accept(this.phoneIds);
        return this;
    }

    /**
     * 云手机ID列表 server_ids参数不存在时必选
     * @return phoneIds
     */
    public List<String> getPhoneIds() {
        return phoneIds;
    }

    public void setPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
    }

    public RunShellCommandRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public RunShellCommandRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public RunShellCommandRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 云手机服务器ID列表 phone_ids参数不存在时必选
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunShellCommandRequestBody runShellCommandRequestBody = (RunShellCommandRequestBody) o;
        return Objects.equals(this.command, runShellCommandRequestBody.command)
            && Objects.equals(this.content, runShellCommandRequestBody.content)
            && Objects.equals(this.phoneIds, runShellCommandRequestBody.phoneIds)
            && Objects.equals(this.serverIds, runShellCommandRequestBody.serverIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, content, phoneIds, serverIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunShellCommandRequestBody {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    phoneIds: ").append(toIndentedString(phoneIds)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
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
