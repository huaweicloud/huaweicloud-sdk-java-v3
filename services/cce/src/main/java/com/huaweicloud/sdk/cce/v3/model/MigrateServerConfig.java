package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点迁移场景服务器配置
 */
public class MigrateServerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rootVolume")

    private MigrateVolumeSpec rootVolume;

    public MigrateServerConfig withRootVolume(MigrateVolumeSpec rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public MigrateServerConfig withRootVolume(Consumer<MigrateVolumeSpec> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new MigrateVolumeSpec();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public MigrateVolumeSpec getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(MigrateVolumeSpec rootVolume) {
        this.rootVolume = rootVolume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrateServerConfig that = (MigrateServerConfig) obj;
        return Objects.equals(this.rootVolume, that.rootVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rootVolume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateServerConfig {\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
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
