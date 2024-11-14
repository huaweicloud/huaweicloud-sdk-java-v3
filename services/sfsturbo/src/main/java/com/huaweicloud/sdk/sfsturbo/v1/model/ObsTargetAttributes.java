package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 后端存储属性
 */
public class ObsTargetAttributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_mode")

    private Integer fileMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_mode")

    private Integer dirMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private Integer uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gid")

    private Integer gid;

    public ObsTargetAttributes withFileMode(Integer fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * 导入的文件权限。取值范围是0到777。  第一位表示文件所有者的权限，取值范围是0到7；第二位表示文件所属用户组的权限，取值范围是0到7；第三位表示其他用户的权限，取值范围是0到7。文件所有者由uid指定，文件所属用户组由gid指定，不是文件所有者且不在文件所属用户组的用户为其他用户。  数字4、2、1分别表示读、写、执行权限，这些数字相加，即可得到所需的权限组合。例如：750中第一位7代表该文件所有者对该文件具有读、写、执行权限；第二位5代表该文件所属用户组对该文件具有读、执行权限；第三位0代表其他用户对该文件无权限。 
     * @return fileMode
     */
    public Integer getFileMode() {
        return fileMode;
    }

    public void setFileMode(Integer fileMode) {
        this.fileMode = fileMode;
    }

    public ObsTargetAttributes withDirMode(Integer dirMode) {
        this.dirMode = dirMode;
        return this;
    }

    /**
     * 导入的目录权限。取值范围是0到777。  第一位表示目录所有者的权限，取值范围是0到7；第二位表示目录所属用户组的权限，取值范围是0到7；第三位表示其他用户的权限，取值范围是0到7。目录所有者由uid指定，目录所属用户组由gid指定，不是目录所有者且不在目录所属用户组的用户为其他用户。  数字4、2、1分别表示读、写、执行权限，这些数字相加，即可得到所需的权限组合。例如：750中第一位7代表该目录所有者对该目录具有读、写、执行权限；第二位5代表该目录所属用户组对该目录具有读、执行权限；第三位0代表其他用户对该文件无权限。 
     * @return dirMode
     */
    public Integer getDirMode() {
        return dirMode;
    }

    public void setDirMode(Integer dirMode) {
        this.dirMode = dirMode;
    }

    public ObsTargetAttributes withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 导入对象所有者的用户id，默认值是0，取值范围是0到4,294,967,294（即2^32-2）。
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public ObsTargetAttributes withGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * 导入对象所属用户组id，默认值是0，取值范围是0到4,294,967,294（即2^32-2）。
     * @return gid
     */
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
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
        ObsTargetAttributes that = (ObsTargetAttributes) obj;
        return Objects.equals(this.fileMode, that.fileMode) && Objects.equals(this.dirMode, that.dirMode)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.gid, that.gid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileMode, dirMode, uid, gid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsTargetAttributes {\n");
        sb.append("    fileMode: ").append(toIndentedString(fileMode)).append("\n");
        sb.append("    dirMode: ").append(toIndentedString(dirMode)).append("\n");
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
