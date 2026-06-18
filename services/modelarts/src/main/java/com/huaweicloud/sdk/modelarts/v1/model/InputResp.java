package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InputResp
 */
public class InputResp {

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

    private InputDataInfoResp remote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_constraint")

    private List<InputRespRemoteConstraint> remoteConstraint = null;

    public InputResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：数据输入通道名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：数据输入通道描述信息。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InputResp withLocalDir(String localDir) {
        this.localDir = localDir;
        return this;
    }

    /**
     * **参数解释**：数据输入通道映射的容器本地路径。例如，“/home/ma-user/modelarts/inputs/data_url_0”。 **取值范围**：不涉及。
     * @return localDir
     */
    public String getLocalDir() {
        return localDir;
    }

    public void setLocalDir(String localDir) {
        this.localDir = localDir;
    }

    public InputResp withAccessMethod(String accessMethod) {
        this.accessMethod = accessMethod;
        return this;
    }

    /**
     * **参数解释**：数据输入通道路径（local_dir）的下发方式。 **取值范围**： - parameter：超参形式 - env：环境变量形式
     * @return accessMethod
     */
    public String getAccessMethod() {
        return accessMethod;
    }

    public void setAccessMethod(String accessMethod) {
        this.accessMethod = accessMethod;
    }

    public InputResp withRemote(InputDataInfoResp remote) {
        this.remote = remote;
        return this;
    }

    public InputResp withRemote(Consumer<InputDataInfoResp> remoteSetter) {
        if (this.remote == null) {
            this.remote = new InputDataInfoResp();
            remoteSetter.accept(this.remote);
        }

        return this;
    }

    /**
     * Get remote
     * @return remote
     */
    public InputDataInfoResp getRemote() {
        return remote;
    }

    public void setRemote(InputDataInfoResp remote) {
        this.remote = remote;
    }

    public InputResp withRemoteConstraint(List<InputRespRemoteConstraint> remoteConstraint) {
        this.remoteConstraint = remoteConstraint;
        return this;
    }

    public InputResp addRemoteConstraintItem(InputRespRemoteConstraint remoteConstraintItem) {
        if (this.remoteConstraint == null) {
            this.remoteConstraint = new ArrayList<>();
        }
        this.remoteConstraint.add(remoteConstraintItem);
        return this;
    }

    public InputResp withRemoteConstraint(Consumer<List<InputRespRemoteConstraint>> remoteConstraintSetter) {
        if (this.remoteConstraint == null) {
            this.remoteConstraint = new ArrayList<>();
        }
        remoteConstraintSetter.accept(this.remoteConstraint);
        return this;
    }

    /**
     * **参数解释**：数据输入约束。
     * @return remoteConstraint
     */
    public List<InputRespRemoteConstraint> getRemoteConstraint() {
        return remoteConstraint;
    }

    public void setRemoteConstraint(List<InputRespRemoteConstraint> remoteConstraint) {
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
        InputResp that = (InputResp) obj;
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
        sb.append("class InputResp {\n");
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
