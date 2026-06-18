package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OutputResp
 */
public class OutputResp {

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

    private RemoteResp remote;

    public OutputResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：数据输出通道名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OutputResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：数据输出通道描述信息。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OutputResp withLocalDir(String localDir) {
        this.localDir = localDir;
        return this;
    }

    /**
     * **参数解释**：数据输出通道映射的容器本地路径。 **取值范围**：不涉及。
     * @return localDir
     */
    public String getLocalDir() {
        return localDir;
    }

    public void setLocalDir(String localDir) {
        this.localDir = localDir;
    }

    public OutputResp withAccessMethod(String accessMethod) {
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

    public OutputResp withRemote(RemoteResp remote) {
        this.remote = remote;
        return this;
    }

    public OutputResp withRemote(Consumer<RemoteResp> remoteSetter) {
        if (this.remote == null) {
            this.remote = new RemoteResp();
            remoteSetter.accept(this.remote);
        }

        return this;
    }

    /**
     * Get remote
     * @return remote
     */
    public RemoteResp getRemote() {
        return remote;
    }

    public void setRemote(RemoteResp remote) {
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
        OutputResp that = (OutputResp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.localDir, that.localDir) && Objects.equals(this.accessMethod, that.accessMethod)
            && Objects.equals(this.remote, that.remote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, localDir, accessMethod, remote);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    localDir: ").append(toIndentedString(localDir)).append("\n");
        sb.append("    accessMethod: ").append(toIndentedString(accessMethod)).append("\n");
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
