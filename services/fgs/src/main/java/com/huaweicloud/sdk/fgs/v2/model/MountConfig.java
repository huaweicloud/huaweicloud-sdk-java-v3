package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.fgs.v2.model.FuncMount;
import com.huaweicloud.sdk.fgs.v2.model.MountUser;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 函数挂载配置。
 */
public class MountConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mount_user")
    
    private MountUser mountUser = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="func_mounts")
    
    private List<FuncMount> funcMounts = new ArrayList<>();
    
    public MountConfig withMountUser(MountUser mountUser) {
        this.mountUser = mountUser;
        return this;
    }

    public MountConfig withMountUser(Consumer<MountUser> mountUserSetter) {
        if(this.mountUser == null ){
            this.mountUser = new MountUser();
        }
        mountUserSetter.accept(this.mountUser);
        return this;
    }


    /**
     * Get mountUser
     * @return mountUser
     */
    public MountUser getMountUser() {
        return mountUser;
    }

    public void setMountUser(MountUser mountUser) {
        this.mountUser = mountUser;
    }

    public MountConfig withFuncMounts(List<FuncMount> funcMounts) {
        this.funcMounts = funcMounts;
        return this;
    }

    
    public MountConfig addFuncMountsItem(FuncMount funcMountsItem) {
        this.funcMounts.add(funcMountsItem);
        return this;
    }

    public MountConfig withFuncMounts(Consumer<List<FuncMount>> funcMountsSetter) {
        if(this.funcMounts == null ){
            this.funcMounts = new ArrayList<>();
        }
        funcMountsSetter.accept(this.funcMounts);
        return this;
    }

    /**
     * 函数挂载列表。
     * @return funcMounts
     */
    public List<FuncMount> getFuncMounts() {
        return funcMounts;
    }

    public void setFuncMounts(List<FuncMount> funcMounts) {
        this.funcMounts = funcMounts;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MountConfig mountConfig = (MountConfig) o;
        return Objects.equals(this.mountUser, mountConfig.mountUser) &&
            Objects.equals(this.funcMounts, mountConfig.funcMounts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mountUser, funcMounts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MountConfig {\n");
            sb.append("    mountUser: ").append(toIndentedString(mountUser)).append("\n");
            sb.append("    funcMounts: ").append(toIndentedString(funcMounts)).append("\n");
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

