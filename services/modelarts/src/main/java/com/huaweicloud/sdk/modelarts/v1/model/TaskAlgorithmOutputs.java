package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskAlgorithmOutputs
 */
public class TaskAlgorithmOutputs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_dir")

    private String localDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote")

    private TaskAlgorithmRemote remote;

    public TaskAlgorithmOutputs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：数据输出通道名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskAlgorithmOutputs withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：数据输出通道描述信息。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskAlgorithmOutputs withLocalDir(String localDir) {
        this.localDir = localDir;
        return this;
    }

    /**
     * **参数解释**：数据输出通道映射的容器本地路径。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return localDir
     */
    public String getLocalDir() {
        return localDir;
    }

    public void setLocalDir(String localDir) {
        this.localDir = localDir;
    }

    public TaskAlgorithmOutputs withRemote(TaskAlgorithmRemote remote) {
        this.remote = remote;
        return this;
    }

    public TaskAlgorithmOutputs withRemote(Consumer<TaskAlgorithmRemote> remoteSetter) {
        if (this.remote == null) {
            this.remote = new TaskAlgorithmRemote();
            remoteSetter.accept(this.remote);
        }

        return this;
    }

    /**
     * Get remote
     * @return remote
     */
    public TaskAlgorithmRemote getRemote() {
        return remote;
    }

    public void setRemote(TaskAlgorithmRemote remote) {
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
        TaskAlgorithmOutputs that = (TaskAlgorithmOutputs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.localDir, that.localDir) && Objects.equals(this.remote, that.remote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, localDir, remote);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskAlgorithmOutputs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
