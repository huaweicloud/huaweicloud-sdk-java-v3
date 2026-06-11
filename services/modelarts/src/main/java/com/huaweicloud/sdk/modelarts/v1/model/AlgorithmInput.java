package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算法输入通道信息。
 */
public class AlgorithmInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_dir")

    private String localDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote")

    private AlgorithmRemote remote;

    public AlgorithmInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据输入通道名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlgorithmInput withLocalDir(String localDir) {
        this.localDir = localDir;
        return this;
    }

    /**
     * 数据输入输出通道映射的容器本地路径。
     * @return localDir
     */
    public String getLocalDir() {
        return localDir;
    }

    public void setLocalDir(String localDir) {
        this.localDir = localDir;
    }

    public AlgorithmInput withRemote(AlgorithmRemote remote) {
        this.remote = remote;
        return this;
    }

    public AlgorithmInput withRemote(Consumer<AlgorithmRemote> remoteSetter) {
        if (this.remote == null) {
            this.remote = new AlgorithmRemote();
            remoteSetter.accept(this.remote);
        }

        return this;
    }

    /**
     * Get remote
     * @return remote
     */
    public AlgorithmRemote getRemote() {
        return remote;
    }

    public void setRemote(AlgorithmRemote remote) {
        this.remote = remote;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmInput that = (AlgorithmInput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.localDir, that.localDir)
            && Objects.equals(this.remote, that.remote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, localDir, remote);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    localDir: ").append(toIndentedString(localDir)).append("\n");
        sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
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
