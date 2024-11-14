package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowFsDirResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private Long mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private Long uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gid")

    private Long gid;

    public ShowFsDirResponse withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 目录全路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowFsDirResponse withMode(Long mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 目录权限，仅20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB、HPC缓存型文件系统返回该字段。第三位表示目录所有者的权限，第四位表示目录所属用户组的权限，第五位表示其他用户的权限。目录所有者由uid指定，目录所属用户组由gid指定，不是目录所有者且不在目录所属用户组的用户为其他用户。例如：40755中第三位7代表目录所有者对该目录具有读、写、执行权限；第四位5代表目录所属用户组对该目录具有读、执行权限；第五位5代表其他用户对该目录具有读、执行权限。
     * minimum: 0
     * @return mode
     */
    public Long getMode() {
        return mode;
    }

    public void setMode(Long mode) {
        this.mode = mode;
    }

    public ShowFsDirResponse withUid(Long uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 目录所有者的用户id，仅20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB、HPC缓存型文件系统返回该字段。
     * minimum: 0
     * @return uid
     */
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public ShowFsDirResponse withGid(Long gid) {
        this.gid = gid;
        return this;
    }

    /**
     * 目录所属用户组id，仅20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB、HPC缓存型文件系统返回该字段。
     * minimum: 0
     * @return gid
     */
    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFsDirResponse that = (ShowFsDirResponse) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.gid, that.gid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, mode, uid, gid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFsDirResponse {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
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
