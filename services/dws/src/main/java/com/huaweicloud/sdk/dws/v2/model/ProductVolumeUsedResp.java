package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群使用的规格信息。 **取值范围**： 不涉及。
 */
public class ProductVolumeUsedResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_num")

    private Integer volumeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Integer volumeSize;

    public ProductVolumeUsedResp withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * **参数解释**： 节点使用存储类型。 **取值范围**： HIGH：SAS盘； ULTRAHIGH：SSD云盘； COMMON：SATA盘； LOCAL_DISK：本地盘；
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public ProductVolumeUsedResp withVolumeNum(Integer volumeNum) {
        this.volumeNum = volumeNum;
        return this;
    }

    /**
     * **参数解释**： 节点使用的磁盘数量信息。 **取值范围**： 不涉及。
     * @return volumeNum
     */
    public Integer getVolumeNum() {
        return volumeNum;
    }

    public void setVolumeNum(Integer volumeNum) {
        this.volumeNum = volumeNum;
    }

    public ProductVolumeUsedResp withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * **参数解释**： 集群单节点的可用存储容量。 **取值范围**： 不涉及。
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ProductVolumeUsedResp withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * **参数解释**： 集群节点上单数据磁盘的物理存储容量。 **取值范围**： 不涉及。
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductVolumeUsedResp that = (ProductVolumeUsedResp) obj;
        return Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.volumeNum, that.volumeNum)
            && Objects.equals(this.capacity, that.capacity) && Objects.equals(this.volumeSize, that.volumeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeType, volumeNum, capacity, volumeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductVolumeUsedResp {\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeNum: ").append(toIndentedString(volumeNum)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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
