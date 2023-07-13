package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群信息。
 */
public class CreateClusterRolesBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private CreateClusterInstanceVolumeBody volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceNum")

    private Integer instanceNum;

    public CreateClusterRolesBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 实例规格名称。可以使用[获取实例规格列表](ListFlavors.xml)的name属性确认当前拥有的规格信息。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateClusterRolesBody withVolume(CreateClusterInstanceVolumeBody volume) {
        this.volume = volume;
        return this;
    }

    public CreateClusterRolesBody withVolume(Consumer<CreateClusterInstanceVolumeBody> volumeSetter) {
        if (this.volume == null) {
            this.volume = new CreateClusterInstanceVolumeBody();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public CreateClusterInstanceVolumeBody getVolume() {
        return volume;
    }

    public void setVolume(CreateClusterInstanceVolumeBody volume) {
        this.volume = volume;
    }

    public CreateClusterRolesBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型(选择实例类型时应至少选择一个ess类型)。例如，  - ess-master对应Master节点。 - ess-client对应clinet节点。 - ess-cold对应冷数据节点。 - ess对应数据节点。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateClusterRolesBody withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * 实例个数。 - ess节点，选择范围：1~32个节点数量。   - 若同时选择ess和ess-master时，可以选择1~200个节点数量。    - 若同时选择ess和ess-client时，可以选择1~32个节点数量。    - 若同时选择ess和ess-cold时，可以选择1~32个节点数量。 - ess-master节点，选择范围：3~10内的奇数个节点数量。 - ess-client节点，选择范围：1~32个节点数量。 - ess-cold节点，选择范围：1~32个节点数量。
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterRolesBody that = (CreateClusterRolesBody) obj;
        return Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.type, that.type) && Objects.equals(this.instanceNum, that.instanceNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, volume, type, instanceNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterRolesBody {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
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
