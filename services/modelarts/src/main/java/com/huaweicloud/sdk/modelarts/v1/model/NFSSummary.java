package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * sfsTurbo弹性文件系统输出。
 */
public class NFSSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nfs_path")

    private String nfsPath;

    public NFSSummary withNfsPath(String nfsPath) {
        this.nfsPath = nfsPath;
        return this;
    }

    /**
     * **参数解释**：sfsTurbo弹性文件系统url。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return nfsPath
     */
    public String getNfsPath() {
        return nfsPath;
    }

    public void setNfsPath(String nfsPath) {
        this.nfsPath = nfsPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NFSSummary that = (NFSSummary) obj;
        return Objects.equals(this.nfsPath, that.nfsPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nfsPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NFSSummary {\n");
        sb.append("    nfsPath: ").append(toIndentedString(nfsPath)).append("\n");
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
