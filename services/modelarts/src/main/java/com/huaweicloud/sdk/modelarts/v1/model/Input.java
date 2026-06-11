package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Input
 */
public class Input {

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
    @JsonProperty(value = "access_method")

    private String accessMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote")

    private InputDataInfo remote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_constraint")

    private List<InputRemoteConstraint> remoteConstraint = null;

    public Input withName(String name) {
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

    public Input withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据输入通道描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Input withLocalDir(String localDir) {
        this.localDir = localDir;
        return this;
    }

    /**
     * 数据输入通道映射的容器本地路径。例如，“/home/ma-user/modelarts/inputs/data_url_0”。
     * @return localDir
     */
    public String getLocalDir() {
        return localDir;
    }

    public void setLocalDir(String localDir) {
        this.localDir = localDir;
    }

    public Input withAccessMethod(String accessMethod) {
        this.accessMethod = accessMethod;
        return this;
    }

    /**
     * **参数解释**：数据输入通道路径（local_dir）的下发方式。 **约束限制**：不涉及。 **取值范围**： - parameter：超参形式 - env：环境变量形式  **默认取值**：默认超参形式。
     * @return accessMethod
     */
    public String getAccessMethod() {
        return accessMethod;
    }

    public void setAccessMethod(String accessMethod) {
        this.accessMethod = accessMethod;
    }

    public Input withRemote(InputDataInfo remote) {
        this.remote = remote;
        return this;
    }

    public Input withRemote(Consumer<InputDataInfo> remoteSetter) {
        if (this.remote == null) {
            this.remote = new InputDataInfo();
            remoteSetter.accept(this.remote);
        }

        return this;
    }

    /**
     * Get remote
     * @return remote
     */
    public InputDataInfo getRemote() {
        return remote;
    }

    public void setRemote(InputDataInfo remote) {
        this.remote = remote;
    }

    public Input withRemoteConstraint(List<InputRemoteConstraint> remoteConstraint) {
        this.remoteConstraint = remoteConstraint;
        return this;
    }

    public Input addRemoteConstraintItem(InputRemoteConstraint remoteConstraintItem) {
        if (this.remoteConstraint == null) {
            this.remoteConstraint = new ArrayList<>();
        }
        this.remoteConstraint.add(remoteConstraintItem);
        return this;
    }

    public Input withRemoteConstraint(Consumer<List<InputRemoteConstraint>> remoteConstraintSetter) {
        if (this.remoteConstraint == null) {
            this.remoteConstraint = new ArrayList<>();
        }
        remoteConstraintSetter.accept(this.remoteConstraint);
        return this;
    }

    /**
     * 数据输入约束。
     * @return remoteConstraint
     */
    public List<InputRemoteConstraint> getRemoteConstraint() {
        return remoteConstraint;
    }

    public void setRemoteConstraint(List<InputRemoteConstraint> remoteConstraint) {
        this.remoteConstraint = remoteConstraint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Input that = (Input) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.localDir, that.localDir) && Objects.equals(this.accessMethod, that.accessMethod)
            && Objects.equals(this.remote, that.remote) && Objects.equals(this.remoteConstraint, that.remoteConstraint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, localDir, accessMethod, remote, remoteConstraint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Input {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    localDir: ").append(toIndentedString(localDir)).append("\n");
        sb.append("    accessMethod: ").append(toIndentedString(accessMethod)).append("\n");
        sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
        sb.append("    remoteConstraint: ").append(toIndentedString(remoteConstraint)).append("\n");
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
