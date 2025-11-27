package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ContainerMountInfo
 */
public class ContainerMountInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_path")

    private String hostPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_propagation")

    private String mountPropagation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_name")

    private String mountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_path")

    private String subPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_path_expr")

    private String subPathExpr;

    public ContainerMountInfo withHostPath(String hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * 主机路径
     * @return hostPath
     */
    public String getHostPath() {
        return hostPath;
    }

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    public ContainerMountInfo withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * 挂载路径
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public ContainerMountInfo withMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
        return this;
    }

    /**
     * 挂载传播方式
     * @return mountPropagation
     */
    public String getMountPropagation() {
        return mountPropagation;
    }

    public void setMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    public ContainerMountInfo withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * 是否只读
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public ContainerMountInfo withMountName(String mountName) {
        this.mountName = mountName;
        return this;
    }

    /**
     * 卷名称
     * @return mountName
     */
    public String getMountName() {
        return mountName;
    }

    public void setMountName(String mountName) {
        this.mountName = mountName;
    }

    public ContainerMountInfo withSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }

    /**
     * 子路径
     * @return subPath
     */
    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public ContainerMountInfo withSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
        return this;
    }

    /**
     * 子路径表达式
     * @return subPathExpr
     */
    public String getSubPathExpr() {
        return subPathExpr;
    }

    public void setSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerMountInfo that = (ContainerMountInfo) obj;
        return Objects.equals(this.hostPath, that.hostPath) && Objects.equals(this.mountPath, that.mountPath)
            && Objects.equals(this.mountPropagation, that.mountPropagation)
            && Objects.equals(this.readOnly, that.readOnly) && Objects.equals(this.mountName, that.mountName)
            && Objects.equals(this.subPath, that.subPath) && Objects.equals(this.subPathExpr, that.subPathExpr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostPath, mountPath, mountPropagation, readOnly, mountName, subPath, subPathExpr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerMountInfo {\n");
        sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
        sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    mountName: ").append(toIndentedString(mountName)).append("\n");
        sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
        sb.append("    subPathExpr: ").append(toIndentedString(subPathExpr)).append("\n");
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
