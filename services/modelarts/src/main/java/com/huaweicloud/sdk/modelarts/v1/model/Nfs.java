package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * nfs方式的挂载卷。
 */
public class Nfs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nfs_server_path")

    private String nfsServerPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_path")

    private String localPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    public Nfs withNfsServerPath(String nfsServerPath) {
        this.nfsServerPath = nfsServerPath;
        return this;
    }

    /**
     * nfs服务端路径，如：“10.10.10.10:/example/path”。
     * @return nfsServerPath
     */
    public String getNfsServerPath() {
        return nfsServerPath;
    }

    public void setNfsServerPath(String nfsServerPath) {
        this.nfsServerPath = nfsServerPath;
    }

    public Nfs withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * 挂载到训练容器中的路径，如：“/example/path”。
     * @return localPath
     */
    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public Nfs withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * nfs挂载卷在容器中是否只读。
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
        Nfs that = (Nfs) obj;
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
        sb.append("class Nfs {\n");
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
