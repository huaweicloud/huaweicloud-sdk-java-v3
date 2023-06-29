package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 下发设备命令消息结构
 */
public class ActionDeviceCommand {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private Cmd cmd;

    public ActionDeviceCommand withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * **参数说明**：下发命令的设备ID。 - 当创建设备数据规则时，若device_id为空，则命令下发给触发条件的设备。  - 当创建定时规则时，不允许为空。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ActionDeviceCommand withCmd(Cmd cmd) {
        this.cmd = cmd;
        return this;
    }

    public ActionDeviceCommand withCmd(Consumer<Cmd> cmdSetter) {
        if (this.cmd == null) {
            this.cmd = new Cmd();
            cmdSetter.accept(this.cmd);
        }

        return this;
    }

    /**
     * Get cmd
     * @return cmd
     */
    public Cmd getCmd() {
        return cmd;
    }

    public void setCmd(Cmd cmd) {
        this.cmd = cmd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionDeviceCommand that = (ActionDeviceCommand) obj;
        return Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.cmd, that.cmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, cmd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDeviceCommand {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
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
