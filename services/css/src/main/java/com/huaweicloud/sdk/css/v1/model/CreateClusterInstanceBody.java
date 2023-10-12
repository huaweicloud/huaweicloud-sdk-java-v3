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
     * 实例规格名称。可以使用[获取实例规格列表](ListFlavors.xml)的name属性确认当前拥有的规格信息。
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
     * 可用区。需要指定可用区的名称（可用分区名称）。 默认指定单AZ。指定多AZ时，各个可用分区名称需要使用英文逗号（,）分隔，以“华北-北京四”为例，选择三AZ时，availability_zone取值为cn-north-4a,cn-north-4b,cn-north-4c。如果使用单AZ，availability_zone默认取值为空。 >说明   选择多AZ时，各个可用分区名称不能重复输入，并且要求节点个数大于等于AZ个数。      如果节点个数为AZ个数的倍数，节点将会均匀的分布到各个AZ。如果节点个数不为AZ个数的倍数时，各个AZ分布的节点数量之差的绝对值小于等于1。     可用分区名称，请在[[地区和终端节点](https://developer.huaweicloud.com/endpoint?CSS)](tag:hws)[[地区和终端节点](https://developer.huaweicloud.com/intl/zh-cn/endpoint?CSS)](tag:hk_hws)获取。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterInstanceBody that = (CreateClusterInstanceBody) obj;
        return Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.nics, that.nics) && Objects.equals(this.availabilityZone, that.availabilityZone);
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
