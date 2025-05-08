package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户容器镜像。
 */
public class CustomImage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private String args;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gid")

    private String gid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    public CustomImage withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CustomImage withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 镜像地址
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CustomImage withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 启动容器镜像的命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public CustomImage withArgs(String args) {
        this.args = args;
        return this;
    }

    /**
     * 启动容器镜像的命令行参数
     * @return args
     */
    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public CustomImage withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * 镜像容器工作目录
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public CustomImage withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 镜像容器的用户id
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public CustomImage withGid(String gid) {
        this.gid = gid;
        return this;
    }

    /**
     * 镜像容器的用户组id
     * @return gid
     */
    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public CustomImage withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * 是否是公共镜像
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomImage that = (CustomImage) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.image, that.image)
            && Objects.equals(this.command, that.command) && Objects.equals(this.args, that.args)
            && Objects.equals(this.workingDir, that.workingDir) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.gid, that.gid) && Objects.equals(this.isPublic, that.isPublic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, image, command, args, workingDir, uid, gid, isPublic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomImage {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
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
