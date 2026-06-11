package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * nfs方式的挂载卷。
 */
public class NfsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nfs_server_path")

    private String nfsServerPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_path")

    private String localPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    public NfsResp withNfsServerPath(String nfsServerPath) {
        this.nfsServerPath = nfsServerPath;
        return this;
    }

    /**
     * **参数解释**：nfs服务端路径，如：“10.10.10.10:/example/path”。 **取值范围**：不涉及。
     * @return nfsServerPath
     */
    public String getNfsServerPath() {
        return nfsServerPath;
    }

    public void setNfsServerPath(String nfsServerPath) {
        this.nfsServerPath = nfsServerPath;
    }

    public NfsResp withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * **参数解释**：挂载到训练容器中的路径，如：“/example/path”。 **取值范围**：不涉及。
     * @return localPath
     */
    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public NfsResp withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * **参数解释**：nfs挂载卷在容器中是否只读。 **取值范围**： - true：只读 - false：非只读
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NfsResp that = (NfsResp) obj;
        return Objects.equals(this.nfsServerPath, that.nfsServerPath) && Objects.equals(this.localPath, that.localPath)
            && Objects.equals(this.readOnly, that.readOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nfsServerPath, localPath, readOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NfsResp {\n");
        sb.append("    nfsServerPath: ").append(toIndentedString(nfsServerPath)).append("\n");
        sb.append("    localPath: ").append(toIndentedString(localPath)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
