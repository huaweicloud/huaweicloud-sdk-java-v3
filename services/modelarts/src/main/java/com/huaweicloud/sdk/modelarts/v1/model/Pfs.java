package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练作业obsfs挂载卷信息。
 */
public class Pfs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pfs_path")

    private String pfsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_path")

    private String localPath;

    public Pfs withPfsPath(String pfsPath) {
        this.pfsPath = pfsPath;
        return this;
    }

    /**
     * obsfs的地址。如：“/test-bucket/path”。
     * @return pfsPath
     */
    public String getPfsPath() {
        return pfsPath;
    }

    public void setPfsPath(String pfsPath) {
        this.pfsPath = pfsPath;
    }

    public Pfs withLocalPath(String localPath) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pfs that = (Pfs) obj;
        return Objects.equals(this.pfsPath, that.pfsPath) && Objects.equals(this.localPath, that.localPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pfsPath, localPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pfs {\n");
        sb.append("    pfsPath: ").append(toIndentedString(pfsPath)).append("\n");
        sb.append("    localPath: ").append(toIndentedString(localPath)).append("\n");
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
