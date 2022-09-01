package com.huaweicloud.sdk.dds.v3.model;

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
    @JsonProperty(value = "dss_pool_volume_type")

    @JacksonXmlProperty(localName = "dss_pool_volume_type")

    private String dssPoolVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dss_pool_id")

    @JacksonXmlProperty(localName = "dss_pool_id")

    private String dssPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dss_pool_status")

    @JacksonXmlProperty(localName = "dss_pool_status")

    private String dssPoolStatus;

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

    public DssPoolInfo withDssPoolVolumeType(String dssPoolVolumeType) {
        this.dssPoolVolumeType = dssPoolVolumeType;
        return this;
    }

    /**
     * 专属存储池磁盘类型名称，可能取值如下：  - ULTRAHIGH，表示SSD。
     * @return dssPoolVolumeType
     */
    public String getDssPoolVolumeType() {
        return dssPoolVolumeType;
    }

    public void setDssPoolVolumeType(String dssPoolVolumeType) {
        this.dssPoolVolumeType = dssPoolVolumeType;
    }

    public DssPoolInfo withDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
        return this;
    }

    /**
     * 专属存储池ID
     * @return dssPoolId
     */
    public String getDssPoolId() {
        return dssPoolId;
    }

    public void setDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
    }

    public DssPoolInfo withDssPoolStatus(String dssPoolStatus) {
        this.dssPoolStatus = dssPoolStatus;
        return this;
    }

    /**
     * 专属存储池当前状态，可能取值如下： - available，表示可用。 - deploying，表示正在部署。 - enlarging，表示正在扩容。 - frozen，表示冻结。 - sellout，表示售罄。
     * @return dssPoolStatus
     */
    public String getDssPoolStatus() {
        return dssPoolStatus;
    }

    public void setDssPoolStatus(String dssPoolStatus) {
        this.dssPoolStatus = dssPoolStatus;
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
            && Objects.equals(this.dssPoolVolumeType, dssPoolInfo.dssPoolVolumeType)
            && Objects.equals(this.dssPoolId, dssPoolInfo.dssPoolId)
            && Objects.equals(this.dssPoolStatus, dssPoolInfo.dssPoolStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azName, freeCapacityGb, dssPoolVolumeType, dssPoolId, dssPoolStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DssPoolInfo {\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    freeCapacityGb: ").append(toIndentedString(freeCapacityGb)).append("\n");
        sb.append("    dssPoolVolumeType: ").append(toIndentedString(dssPoolVolumeType)).append("\n");
        sb.append("    dssPoolId: ").append(toIndentedString(dssPoolId)).append("\n");
        sb.append("    dssPoolStatus: ").append(toIndentedString(dssPoolStatus)).append("\n");
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
