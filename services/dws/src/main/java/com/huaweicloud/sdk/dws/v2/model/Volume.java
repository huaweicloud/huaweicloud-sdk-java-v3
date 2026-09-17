package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 磁盘信息对象。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class Volume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private String volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private Integer iops;

    public Volume withVolume(String volume) {
        this.volume = volume;
        return this;
    }

    /**
     * **参数解释**： 磁盘名称。 **约束限制**： 不涉及。 **取值范围**： - SSD：超高IO - SAS：高IO - SATA：普通IO  **默认取值**： 不涉及。
     * @return volume
     */
    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Volume withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * **参数解释**： 磁盘容量，单位：GB。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Volume withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * **参数解释**： ESSD2磁盘IOPS值。  **约束限制**： 仅磁盘类型为ESSD2时必填。 **取值范围**： 100~256000 **默认取值**： 不涉及。
     * @return iops
     */
    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Volume that = (Volume) obj;
        return Objects.equals(this.volume, that.volume) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.iops, that.iops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, capacity, iops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volume {\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
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
