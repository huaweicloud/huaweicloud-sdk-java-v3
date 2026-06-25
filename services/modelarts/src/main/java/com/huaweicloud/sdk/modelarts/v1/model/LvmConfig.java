package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * lvm配置管理。
 */
public class LvmConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lvType")

    private String lvType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public LvmConfig withLvType(String lvType) {
        this.lvType = lvType;
        return this;
    }

    /**
     * **参数解释**：LVM写入模式。 **取值范围**：可选项如下： - linear：线性模式。 - striped：条带模式，使用多块磁盘组成条带模式，能够提升磁盘性能。
     * @return lvType
     */
    public String getLvType() {
        return lvType;
    }

    public void setLvType(String lvType) {
        this.lvType = lvType;
    }

    public LvmConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**：磁盘挂载路径。仅在用户配置中生效。支持包含：数字、大小写字母、点、中划线、下划线的绝对路径。 **取值范围**：不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LvmConfig that = (LvmConfig) obj;
        return Objects.equals(this.lvType, that.lvType) && Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lvType, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LvmConfig {\n");
        sb.append("    lvType: ").append(toIndentedString(lvType)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
