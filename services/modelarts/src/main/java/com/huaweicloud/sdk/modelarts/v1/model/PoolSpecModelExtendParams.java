package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源池自定义配置参数。
 */
public class PoolSpecModelExtendParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerBaseSize")

    private String dockerBaseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeGroup")

    private String volumeGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private String runtime;

    public PoolSpecModelExtendParams withDockerBaseSize(String dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
        return this;
    }

    /**
     * **参数解释**：资源池创建的节点的容器引擎空间大小。值为0时表示不限制大小。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return dockerBaseSize
     */
    public String getDockerBaseSize() {
        return dockerBaseSize;
    }

    public void setDockerBaseSize(String dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
    }

    public PoolSpecModelExtendParams withVolumeGroup(String volumeGroup) {
        this.volumeGroup = volumeGroup;
        return this;
    }

    /**
     * **参数描述**：磁盘分组名称。 **取值范围**：不涉及。
     * @return volumeGroup
     */
    public String getVolumeGroup() {
        return volumeGroup;
    }

    public void setVolumeGroup(String volumeGroup) {
        this.volumeGroup = volumeGroup;
    }

    public PoolSpecModelExtendParams withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * **参数描述**：模型运行时环境。 **取值范围**：不涉及。
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolSpecModelExtendParams that = (PoolSpecModelExtendParams) obj;
        return Objects.equals(this.dockerBaseSize, that.dockerBaseSize)
            && Objects.equals(this.volumeGroup, that.volumeGroup) && Objects.equals(this.runtime, that.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerBaseSize, volumeGroup, runtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolSpecModelExtendParams {\n");
        sb.append("    dockerBaseSize: ").append(toIndentedString(dockerBaseSize)).append("\n");
        sb.append("    volumeGroup: ").append(toIndentedString(volumeGroup)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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
