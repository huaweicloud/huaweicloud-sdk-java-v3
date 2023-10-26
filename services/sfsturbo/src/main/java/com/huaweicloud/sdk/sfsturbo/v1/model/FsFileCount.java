package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 所有文件数目
 */
public class FsFileCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir")

    private Long dir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regular")

    private Long regular;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe")

    private Long pipe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char")

    private Long _char;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block")

    private Long block;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "socket")

    private Long socket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "symlink")

    private Long symlink;

    public FsFileCount withDir(Long dir) {
        this.dir = dir;
        return this;
    }

    /**
     * 目录数目
     * minimum: 0
     * @return dir
     */
    public Long getDir() {
        return dir;
    }

    public void setDir(Long dir) {
        this.dir = dir;
    }

    public FsFileCount withRegular(Long regular) {
        this.regular = regular;
        return this;
    }

    /**
     * 普通文件数目
     * minimum: 0
     * @return regular
     */
    public Long getRegular() {
        return regular;
    }

    public void setRegular(Long regular) {
        this.regular = regular;
    }

    public FsFileCount withPipe(Long pipe) {
        this.pipe = pipe;
        return this;
    }

    /**
     * 管道文件数目
     * minimum: 0
     * @return pipe
     */
    public Long getPipe() {
        return pipe;
    }

    public void setPipe(Long pipe) {
        this.pipe = pipe;
    }

    public FsFileCount withChar(Long _char) {
        this._char = _char;
        return this;
    }

    /**
     * 字符设备数目
     * minimum: 0
     * @return _char
     */
    public Long getChar() {
        return _char;
    }

    public void setChar(Long _char) {
        this._char = _char;
    }

    public FsFileCount withBlock(Long block) {
        this.block = block;
        return this;
    }

    /**
     * 块设备数目
     * minimum: 0
     * @return block
     */
    public Long getBlock() {
        return block;
    }

    public void setBlock(Long block) {
        this.block = block;
    }

    public FsFileCount withSocket(Long socket) {
        this.socket = socket;
        return this;
    }

    /**
     * 套接字数目
     * minimum: 0
     * @return socket
     */
    public Long getSocket() {
        return socket;
    }

    public void setSocket(Long socket) {
        this.socket = socket;
    }

    public FsFileCount withSymlink(Long symlink) {
        this.symlink = symlink;
        return this;
    }

    /**
     * 符号链接数目
     * minimum: 0
     * @return symlink
     */
    public Long getSymlink() {
        return symlink;
    }

    public void setSymlink(Long symlink) {
        this.symlink = symlink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FsFileCount that = (FsFileCount) obj;
        return Objects.equals(this.dir, that.dir) && Objects.equals(this.regular, that.regular)
            && Objects.equals(this.pipe, that.pipe) && Objects.equals(this._char, that._char)
            && Objects.equals(this.block, that.block) && Objects.equals(this.socket, that.socket)
            && Objects.equals(this.symlink, that.symlink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dir, regular, pipe, _char, block, socket, symlink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FsFileCount {\n");
        sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
        sb.append("    regular: ").append(toIndentedString(regular)).append("\n");
        sb.append("    pipe: ").append(toIndentedString(pipe)).append("\n");
        sb.append("    _char: ").append(toIndentedString(_char)).append("\n");
        sb.append("    block: ").append(toIndentedString(block)).append("\n");
        sb.append("    socket: ").append(toIndentedString(socket)).append("\n");
        sb.append("    symlink: ").append(toIndentedString(symlink)).append("\n");
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
