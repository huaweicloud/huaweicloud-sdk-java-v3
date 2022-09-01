package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 实例专属存储信息。
 */
public class DssPoolInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_name")

    @JacksonXmlProperty(localName = "az_name")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_capacity_gb")

    @JacksonXmlProperty(localName = "free_capacity_gb")

    private String freeCapacityGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_volume_type")

    @JacksonXmlProperty(localName = "dsspool_volume_type")

    private String dsspoolVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_id")

    @JacksonXmlProperty(localName = "dsspool_id")

    private String dsspoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_status")

    @JacksonXmlProperty(localName = "dsspool_status")

    private String dsspoolStatus;

    public DssPoolInfo withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * 专属存储池所在az
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public DssPoolInfo withFreeCapacityGb(String freeCapacityGb) {
        this.freeCapacityGb = freeCapacityGb;
        return this;
    }

    /**
     * 专属存储池免费空间大小，单位GB
     * @return freeCapacityGb
     */
    public String getFreeCapacityGb() {
        return freeCapacityGb;
    }

    public void setFreeCapacityGb(String freeCapacityGb) {
        this.freeCapacityGb = freeCapacityGb;
    }

    public DssPoolInfo withDsspoolVolumeType(String dsspoolVolumeType) {
        this.dsspoolVolumeType = dsspoolVolumeType;
        return this;
    }

    /**
     * 专属存储池磁盘类型名称，可能取值如下：  - ULTRAHIGH，表示SSD。  - LOCALSSD：表示本地SSD。  - CLOUDSSD：表示SSD云盘，仅支持通用型和独享型规格实例。  - ESSD：表示极速型SSD，仅支持独享型规格实例。
     * @return dsspoolVolumeType
     */
    public String getDsspoolVolumeType() {
        return dsspoolVolumeType;
    }

    public void setDsspoolVolumeType(String dsspoolVolumeType) {
        this.dsspoolVolumeType = dsspoolVolumeType;
    }

    public DssPoolInfo withDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
        return this;
    }

    /**
     * 专属存储池ID
     * @return dsspoolId
     */
    public String getDsspoolId() {
        return dsspoolId;
    }

    public void setDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
    }

    public DssPoolInfo withDsspoolStatus(String dsspoolStatus) {
        this.dsspoolStatus = dsspoolStatus;
        return this;
    }

    /**
     * 专属存储池当前状态，可能取值如下： - available，表示可用。 - deploying，表示正在部署。 - enlarging，表示正在扩容。 - frozen，表示冻结。 - sellout，表示售罄。
     * @return dsspoolStatus
     */
    public String getDsspoolStatus() {
        return dsspoolStatus;
    }

    public void setDsspoolStatus(String dsspoolStatus) {
        this.dsspoolStatus = dsspoolStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DssPoolInfo dssPoolInfo = (DssPoolInfo) o;
        return Objects.equals(this.azName, dssPoolInfo.azName)
            && Objects.equals(this.freeCapacityGb, dssPoolInfo.freeCapacityGb)
            && Objects.equals(this.dsspoolVolumeType, dssPoolInfo.dsspoolVolumeType)
            && Objects.equals(this.dsspoolId, dssPoolInfo.dsspoolId)
            && Objects.equals(this.dsspoolStatus, dssPoolInfo.dsspoolStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azName, freeCapacityGb, dsspoolVolumeType, dsspoolId, dsspoolStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DssPoolInfo {\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    freeCapacityGb: ").append(toIndentedString(freeCapacityGb)).append("\n");
        sb.append("    dsspoolVolumeType: ").append(toIndentedString(dsspoolVolumeType)).append("\n");
        sb.append("    dsspoolId: ").append(toIndentedString(dsspoolId)).append("\n");
        sb.append("    dsspoolStatus: ").append(toIndentedString(dsspoolStatus)).append("\n");
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
