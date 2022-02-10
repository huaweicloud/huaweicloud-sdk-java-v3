package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 集群信息 */
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

    /** 实例规格名称。例如， - ess.spec-2u16g规格对应的取值范围为40GB～1280GB。 - ess.spec-4u32g规格对应的取值范围为40GB～2560GB。 -
     * ess.spec-8u64g规格对应的取值范围为80GB～5120GB。 - ess.spec-16u128g规格对应的取值范围为160GB～10240GB。
     * 
     * @return flavorRef */
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

    /** Get volume
     * 
     * @return volume */
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

    /** 实例类型。例如， - ess-master对应Master节点。 - ess-client对应Clinet节点。 - ess-cold对应冷数据节点。 - ess对应数据节点。
     * 
     * @return type */
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

    /** 实例个数。
     * 
     * @return instanceNum */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterRolesBody createClusterRolesBody = (CreateClusterRolesBody) o;
        return Objects.equals(this.flavorRef, createClusterRolesBody.flavorRef)
            && Objects.equals(this.volume, createClusterRolesBody.volume)
            && Objects.equals(this.type, createClusterRolesBody.type)
            && Objects.equals(this.instanceNum, createClusterRolesBody.instanceNum);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
