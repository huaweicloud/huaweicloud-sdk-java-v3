package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 开启后，支持设置停机时间及停机命令等，避免正在处理的请求被强制中断，从而提高系统的可用性和稳定性。 **约束限制：** 长度不超过255。 **取值范围：** - 协议范围：http/https。 - 端口范围：1-65535。 - 地址范围：仅包含字母、数字、点号（.）、中划线（-)、下划线（_）、斜杠（/）的路径，非斜杠（/）开头。 **默认取值：** 不涉及。
 */
public class TerminationGrace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_stop_cmd")

    private String preStopCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "termination_grace_period_seconds")

    private Integer terminationGracePeriodSeconds;

    public TerminationGrace withPreStopCmd(String preStopCmd) {
        this.preStopCmd = preStopCmd;
        return this;
    }

    /**
     * **参数解释：** 停机命令在容器收到停止信号时触发，但必须在停机时间的宽限期内完成，否则容器会被强制停止。您可以通过该命令精细化操作，如关闭数据库连接、释放文件句柄、停止子进程等。 **约束限制：** 长度不超过255。 **取值范围：** - 协议范围：http/https。 - 端口范围：1-65535。 - 地址范围：仅包含字母、数字、点号（.）、中划线（-)、下划线（_）、斜杠（/）的路径，非斜杠（/）开头。 **默认取值：** 不涉及。
     * @return preStopCmd
     */
    public String getPreStopCmd() {
        return preStopCmd;
    }

    public void setPreStopCmd(String preStopCmd) {
        this.preStopCmd = preStopCmd;
    }

    public TerminationGrace withTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }

    /**
     * **参数解释：** 该参数表示 Pod 收到停止信号到强制停止的最大时间窗口，用于 Pod 执行清理操作（如关闭连接、释放资源、保存状态等）。 **约束限制：** 长度不超过255。 **取值范围：** - 协议范围：http/https。 - 端口范围：1-65535。 - 地址范围：仅包含字母、数字、点号（.）、中划线（-)、下划线（_）、斜杠（/）的路径，非斜杠（/）开头。 **默认取值：** 不涉及。
     * minimum: 0
     * maximum: 3600
     * @return terminationGracePeriodSeconds
     */
    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TerminationGrace that = (TerminationGrace) obj;
        return Objects.equals(this.preStopCmd, that.preStopCmd)
            && Objects.equals(this.terminationGracePeriodSeconds, that.terminationGracePeriodSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preStopCmd, terminationGracePeriodSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerminationGrace {\n");
        sb.append("    preStopCmd: ").append(toIndentedString(preStopCmd)).append("\n");
        sb.append("    terminationGracePeriodSeconds: ")
            .append(toIndentedString(terminationGracePeriodSeconds))
            .append("\n");
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
