package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAppendableVolumeQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_scsi")

    private Integer freeScsi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_blk")

    private Integer freeBlk;

    public ShowAppendableVolumeQuotaResponse withFreeScsi(Integer freeScsi) {
        this.freeScsi = freeScsi;
        return this;
    }

    /**
     * Get freeScsi
     * @return freeScsi
     */
    public Integer getFreeScsi() {
        return freeScsi;
    }

    public void setFreeScsi(Integer freeScsi) {
        this.freeScsi = freeScsi;
    }

    public ShowAppendableVolumeQuotaResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowAppendableVolumeQuotaResponse withFreeBlk(Integer freeBlk) {
        this.freeBlk = freeBlk;
        return this;
    }

    /**
     * Get freeBlk
     * @return freeBlk
     */
    public Integer getFreeBlk() {
        return freeBlk;
    }

    public void setFreeBlk(Integer freeBlk) {
        this.freeBlk = freeBlk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAppendableVolumeQuotaResponse that = (ShowAppendableVolumeQuotaResponse) obj;
        return Objects.equals(this.freeScsi, that.freeScsi) && Objects.equals(this.count, that.count)
            && Objects.equals(this.freeBlk, that.freeBlk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeScsi, count, freeBlk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppendableVolumeQuotaResponse {\n");
        sb.append("    freeScsi: ").append(toIndentedString(freeScsi)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    freeBlk: ").append(toIndentedString(freeBlk)).append("\n");
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
