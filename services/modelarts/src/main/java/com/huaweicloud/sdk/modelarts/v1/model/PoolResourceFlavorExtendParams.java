package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：自定义配置参数。 **约束限制**：不涉及。
 */
public class PoolResourceFlavorExtendParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerBaseSize")

    private String dockerBaseSize;

    public PoolResourceFlavorExtendParams withDockerBaseSize(String dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
        return this;
    }

    /**
     * **参数解释**：指定资源池节点的容器引擎空间大小。值为0时表示不限制大小。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return dockerBaseSize
     */
    public String getDockerBaseSize() {
        return dockerBaseSize;
    }

    public void setDockerBaseSize(String dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolResourceFlavorExtendParams that = (PoolResourceFlavorExtendParams) obj;
        return Objects.equals(this.dockerBaseSize, that.dockerBaseSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerBaseSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolResourceFlavorExtendParams {\n");
        sb.append("    dockerBaseSize: ").append(toIndentedString(dockerBaseSize)).append("\n");
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
