package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 函数挂载结构体。
 */
public class FuncMount  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mount_type")
    
    private String mountType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mount_resource")
    
    private String mountResource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mount_share_path")
    
    private String mountSharePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="local_mount_path")
    
    private String localMountPath;

    public FuncMount withMountType(String mountType) {
        this.mountType = mountType;
        return this;
    }

    


    /**
     * 挂载类型(sfs/sfsTurbo/ecs)，func_mounts非空时必选。
     * @return mountType
     */
    public String getMountType() {
        return mountType;
    }

    public void setMountType(String mountType) {
        this.mountType = mountType;
    }

    public FuncMount withMountResource(String mountResource) {
        this.mountResource = mountResource;
        return this;
    }

    


    /**
     * 挂载资源ID（对应云服务ID），func_mounts非空时必选。
     * @return mountResource
     */
    public String getMountResource() {
        return mountResource;
    }

    public void setMountResource(String mountResource) {
        this.mountResource = mountResource;
    }

    public FuncMount withMountSharePath(String mountSharePath) {
        this.mountSharePath = mountSharePath;
        return this;
    }

    


    /**
     * 远端挂载路径（例如192.168.0.12:/data），如果mount_type为ecs，必选。
     * @return mountSharePath
     */
    public String getMountSharePath() {
        return mountSharePath;
    }

    public void setMountSharePath(String mountSharePath) {
        this.mountSharePath = mountSharePath;
    }

    public FuncMount withLocalMountPath(String localMountPath) {
        this.localMountPath = localMountPath;
        return this;
    }

    


    /**
     * 函数访问路径，func_mounts非空时必选。
     * @return localMountPath
     */
    public String getLocalMountPath() {
        return localMountPath;
    }

    public void setLocalMountPath(String localMountPath) {
        this.localMountPath = localMountPath;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuncMount funcMount = (FuncMount) o;
        return Objects.equals(this.mountType, funcMount.mountType) &&
            Objects.equals(this.mountResource, funcMount.mountResource) &&
            Objects.equals(this.mountSharePath, funcMount.mountSharePath) &&
            Objects.equals(this.localMountPath, funcMount.localMountPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mountType, mountResource, mountSharePath, localMountPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuncMount {\n");
            sb.append("    mountType: ").append(toIndentedString(mountType)).append("\n");
            sb.append("    mountResource: ").append(toIndentedString(mountResource)).append("\n");
            sb.append("    mountSharePath: ").append(toIndentedString(mountSharePath)).append("\n");
            sb.append("    localMountPath: ").append(toIndentedString(localMountPath)).append("\n");
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

