package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例对象。
 */
public class CreateClusterInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private CreateClusterInstanceVolumeBody volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private CreateClusterInstanceNicsBody nics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    public CreateClusterInstanceBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 实例规格名称。例如乌兰察布三中，  - ess.spec-2u16g规格对应的取值范围为40GB～1280GB。 - ess.spec-4u32g规格对应的取值范围为40GB～2560GB。 - ess.spec-8u64g规格对应的取值范围为80GB～5120GB。 - ess.spec-16u128g规格对应的取值范围为160GB～10240GB。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateClusterInstanceBody withVolume(CreateClusterInstanceVolumeBody volume) {
        this.volume = volume;
        return this;
    }

    public CreateClusterInstanceBody withVolume(Consumer<CreateClusterInstanceVolumeBody> volumeSetter) {
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

    public CreateClusterInstanceBody withNics(CreateClusterInstanceNicsBody nics) {
        this.nics = nics;
        return this;
    }

    public CreateClusterInstanceBody withNics(Consumer<CreateClusterInstanceNicsBody> nicsSetter) {
        if (this.nics == null) {
            this.nics = new CreateClusterInstanceNicsBody();
            nicsSetter.accept(this.nics);
        }

        return this;
    }

    /**
     * Get nics
     * @return nics
     */
    public CreateClusterInstanceNicsBody getNics() {
        return nics;
    }

    public void setNics(CreateClusterInstanceNicsBody nics) {
        this.nics = nics;
    }

    public CreateClusterInstanceBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区。不填时默认创建单AZ。  如果需要创建多AZ，各个AZ之间使用英文逗号分隔，比如az1,az2 ，az不能重复输入，并且要求节点个数大于等于AZ个数。  如果节点个数为AZ个数的倍数，节点将会均匀的分布到各个AZ。如果节点个数不为AZ个数的倍数时，各个AZ分布的节点个数之和的绝对值之差小于等于1。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterInstanceBody createClusterInstanceBody = (CreateClusterInstanceBody) o;
        return Objects.equals(this.flavorRef, createClusterInstanceBody.flavorRef)
            && Objects.equals(this.volume, createClusterInstanceBody.volume)
            && Objects.equals(this.nics, createClusterInstanceBody.nics)
            && Objects.equals(this.availabilityZone, createClusterInstanceBody.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, volume, nics, availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterInstanceBody {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
