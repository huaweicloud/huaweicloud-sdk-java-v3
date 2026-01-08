package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量修改磁盘QOS请求。
 */
public class BatchModifyQosVolumesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_ids")

    private List<String> volumeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos")

    private Qos qos;

    public BatchModifyQosVolumesReq withVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public BatchModifyQosVolumesReq addVolumeIdsItem(String volumeIdsItem) {
        if (this.volumeIds == null) {
            this.volumeIds = new ArrayList<>();
        }
        this.volumeIds.add(volumeIdsItem);
        return this;
    }

    public BatchModifyQosVolumesReq withVolumeIds(Consumer<List<String>> volumeIdsSetter) {
        if (this.volumeIds == null) {
            this.volumeIds = new ArrayList<>();
        }
        volumeIdsSetter.accept(this.volumeIds);
        return this;
    }

    /**
     * 修改QOS磁盘ids。
     * @return volumeIds
     */
    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public void setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
    }

    public BatchModifyQosVolumesReq withQos(Qos qos) {
        this.qos = qos;
        return this;
    }

    public BatchModifyQosVolumesReq withQos(Consumer<Qos> qosSetter) {
        if (this.qos == null) {
            this.qos = new Qos();
            qosSetter.accept(this.qos);
        }

        return this;
    }

    /**
     * Get qos
     * @return qos
     */
    public Qos getQos() {
        return qos;
    }

    public void setQos(Qos qos) {
        this.qos = qos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchModifyQosVolumesReq that = (BatchModifyQosVolumesReq) obj;
        return Objects.equals(this.volumeIds, that.volumeIds) && Objects.equals(this.qos, that.qos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeIds, qos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchModifyQosVolumesReq {\n");
        sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
        sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
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
