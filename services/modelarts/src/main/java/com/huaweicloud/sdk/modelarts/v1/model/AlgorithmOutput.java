package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算法输出通道信息。
 */
public class AlgorithmOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_dir")

    private String localDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote")

    private Remote remote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    public AlgorithmOutput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据输出通道名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlgorithmOutput withLocalDir(String localDir) {
        this.localDir = localDir;
        return this;
    }

    /**
     * 数据输出通道映射的容器本地路径。
     * @return localDir
     */
    public String getLocalDir() {
        return localDir;
    }

    public void setLocalDir(String localDir) {
        this.localDir = localDir;
    }

    public AlgorithmOutput withRemote(Remote remote) {
        this.remote = remote;
        return this;
    }

    public AlgorithmOutput withRemote(Consumer<Remote> remoteSetter) {
        if (this.remote == null) {
            this.remote = new Remote();
            remoteSetter.accept(this.remote);
        }

        return this;
    }

    /**
     * Get remote
     * @return remote
     */
    public Remote getRemote() {
        return remote;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public AlgorithmOutput withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 数据传输模式，默认为“upload_periodically”。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public AlgorithmOutput withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 数据传输周期，默认为30s。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmOutput that = (AlgorithmOutput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.localDir, that.localDir)
            && Objects.equals(this.remote, that.remote) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, localDir, remote, mode, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmOutput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    localDir: ").append(toIndentedString(localDir)).append("\n");
        sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
