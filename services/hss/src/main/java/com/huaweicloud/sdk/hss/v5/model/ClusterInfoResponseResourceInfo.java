package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源配置信息
 */
public class ClusterInfoResponseResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private String cpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_limit")

    private String memLimit;

    public ClusterInfoResponseResourceInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释** 资源限制类型：默认规则or自定义or自适应 **取值范围** 取值0-32
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ClusterInfoResponseResourceInfo withCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * **参数解释** cpu最大值 **取值范围** 字符长度0-32位
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public ClusterInfoResponseResourceInfo withMemLimit(String memLimit) {
        this.memLimit = memLimit;
        return this;
    }

    /**
     * **参数解释** 内存最大值 **取值范围** 字符长度0-32位
     * @return memLimit
     */
    public String getMemLimit() {
        return memLimit;
    }

    public void setMemLimit(String memLimit) {
        this.memLimit = memLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterInfoResponseResourceInfo that = (ClusterInfoResponseResourceInfo) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.cpuLimit, that.cpuLimit)
            && Objects.equals(this.memLimit, that.memLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, cpuLimit, memLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInfoResponseResourceInfo {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    memLimit: ").append(toIndentedString(memLimit)).append("\n");
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
