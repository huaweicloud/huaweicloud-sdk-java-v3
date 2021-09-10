package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 节点重装场景服务器相关配置 */
public class ReinstallVolumeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lvmConfig")

    private String lvmConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Storage storage;

    public ReinstallVolumeConfig withLvmConfig(String lvmConfig) {
        this.lvmConfig = lvmConfig;
        return this;
    }

    /** Docker数据盘配置项。 默认配置示例如下： ```
     * \"lvmConfig\":\"dockerThinpool=vgpaas/90%VG;kubernetesLV=vgpaas/10%VG;diskType=evs;lvType=linear\" ``` 包含如下字段： -
     * userLV：用户空间的大小，示例格式：vgpaas/20%VG - userPath：用户空间挂载路径，示例格式：/home/wqt-test - diskType：磁盘类型，目前只有evs、hdd和ssd三种格式 -
     * lvType：逻辑卷的类型，目前支持linear和striped两种，示例格式：striped - dockerThinpool：Docker盘的空间大小，示例格式：vgpaas/60%VG -
     * kubernetesLV：Kubelet空间大小，示例格式：vgpaas/20%VG
     * 
     * @return lvmConfig */
    public String getLvmConfig() {
        return lvmConfig;
    }

    public void setLvmConfig(String lvmConfig) {
        this.lvmConfig = lvmConfig;
    }

    public ReinstallVolumeConfig withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    public ReinstallVolumeConfig withStorage(Consumer<Storage> storageSetter) {
        if (this.storage == null) {
            this.storage = new Storage();
            storageSetter.accept(this.storage);
        }

        return this;
    }

    /** Get storage
     * 
     * @return storage */
    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReinstallVolumeConfig reinstallVolumeConfig = (ReinstallVolumeConfig) o;
        return Objects.equals(this.lvmConfig, reinstallVolumeConfig.lvmConfig)
            && Objects.equals(this.storage, reinstallVolumeConfig.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lvmConfig, storage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallVolumeConfig {\n");
        sb.append("    lvmConfig: ").append(toIndentedString(lvmConfig)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
