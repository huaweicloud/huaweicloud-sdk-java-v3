package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：磁盘自定义配置
 */
public class PoolSpecModelDataVolumesExtendParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private String billing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeGroup")

    private String volumeGroup;

    public PoolSpecModelDataVolumesExtendParams withBilling(String billing) {
        this.billing = billing;
        return this;
    }

    /**
     * **参数解释**：标识存储实例是否计费。为空则表示不计费。该字段用户不可指定或修改。 **取值范围**：不涉及。
     * @return billing
     */
    public String getBilling() {
        return billing;
    }

    public void setBilling(String billing) {
        this.billing = billing;
    }

    public PoolSpecModelDataVolumesExtendParams withVolumeGroup(String volumeGroup) {
        this.volumeGroup = volumeGroup;
        return this;
    }

    /**
     * **参数解释**：磁盘分组名称，用于各个存储空间的划分。 **取值范围**：可选项如下： - vgpaas：容器盘。 - default：普通数据盘，以默认方式挂载。 - vguser{num}：普通数据盘，指定挂载路径，不同路径的分组名称不同，如vguser1，vguser2。 - vg-everest-localvolume-persistent：普通数据盘，作为持久存储卷 - vg-everest-localvolume-ephemeral：普通数据盘，作为临时存储卷
     * @return volumeGroup
     */
    public String getVolumeGroup() {
        return volumeGroup;
    }

    public void setVolumeGroup(String volumeGroup) {
        this.volumeGroup = volumeGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolSpecModelDataVolumesExtendParams that = (PoolSpecModelDataVolumesExtendParams) obj;
        return Objects.equals(this.billing, that.billing) && Objects.equals(this.volumeGroup, that.volumeGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billing, volumeGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolSpecModelDataVolumesExtendParams {\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    volumeGroup: ").append(toIndentedString(volumeGroup)).append("\n");
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
