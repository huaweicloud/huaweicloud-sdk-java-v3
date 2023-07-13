package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云服务器可挂载网卡和卷数。
 */
public class ServerAttachableQuantity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_scsi")

    private Integer freeScsi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_blk")

    private Integer freeBlk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_disk")

    private Integer freeDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_nic")

    private Integer freeNic;

    public ServerAttachableQuantity withFreeScsi(Integer freeScsi) {
        this.freeScsi = freeScsi;
        return this;
    }

    /**
     * 可挂载scsi卷数。
     * @return freeScsi
     */
    public Integer getFreeScsi() {
        return freeScsi;
    }

    public void setFreeScsi(Integer freeScsi) {
        this.freeScsi = freeScsi;
    }

    public ServerAttachableQuantity withFreeBlk(Integer freeBlk) {
        this.freeBlk = freeBlk;
        return this;
    }

    /**
     * 可挂载vbd卷数。
     * @return freeBlk
     */
    public Integer getFreeBlk() {
        return freeBlk;
    }

    public void setFreeBlk(Integer freeBlk) {
        this.freeBlk = freeBlk;
    }

    public ServerAttachableQuantity withFreeDisk(Integer freeDisk) {
        this.freeDisk = freeDisk;
        return this;
    }

    /**
     * 可挂载卷数。
     * @return freeDisk
     */
    public Integer getFreeDisk() {
        return freeDisk;
    }

    public void setFreeDisk(Integer freeDisk) {
        this.freeDisk = freeDisk;
    }

    public ServerAttachableQuantity withFreeNic(Integer freeNic) {
        this.freeNic = freeNic;
        return this;
    }

    /**
     * 可挂载网卡数。
     * @return freeNic
     */
    public Integer getFreeNic() {
        return freeNic;
    }

    public void setFreeNic(Integer freeNic) {
        this.freeNic = freeNic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerAttachableQuantity that = (ServerAttachableQuantity) obj;
        return Objects.equals(this.freeScsi, that.freeScsi) && Objects.equals(this.freeBlk, that.freeBlk)
            && Objects.equals(this.freeDisk, that.freeDisk) && Objects.equals(this.freeNic, that.freeNic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeScsi, freeBlk, freeDisk, freeNic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerAttachableQuantity {\n");
        sb.append("    freeScsi: ").append(toIndentedString(freeScsi)).append("\n");
        sb.append("    freeBlk: ").append(toIndentedString(freeBlk)).append("\n");
        sb.append("    freeDisk: ").append(toIndentedString(freeDisk)).append("\n");
        sb.append("    freeNic: ").append(toIndentedString(freeNic)).append("\n");
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
