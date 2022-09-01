package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SSD类型云硬盘预留的云硬盘个数，键值对，包含：reserved（预留）、limit（最大）和in_use（已使用）。
 */
public class QuotaDetailVolumesSSD {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_use")

    @JacksonXmlProperty(localName = "in_use")

    private Integer inUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved")

    @JacksonXmlProperty(localName = "reserved")

    private Integer reserved;

    public QuotaDetailVolumesSSD withInUse(Integer inUse) {
        this.inUse = inUse;
        return this;
    }

    /**
     * 已使用的数量。
     * @return inUse
     */
    public Integer getInUse() {
        return inUse;
    }

    public void setInUse(Integer inUse) {
        this.inUse = inUse;
    }

    public QuotaDetailVolumesSSD withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的数量。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QuotaDetailVolumesSSD withReserved(Integer reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * 预留属性。
     * @return reserved
     */
    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaDetailVolumesSSD quotaDetailVolumesSSD = (QuotaDetailVolumesSSD) o;
        return Objects.equals(this.inUse, quotaDetailVolumesSSD.inUse)
            && Objects.equals(this.limit, quotaDetailVolumesSSD.limit)
            && Objects.equals(this.reserved, quotaDetailVolumesSSD.reserved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inUse, limit, reserved);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaDetailVolumesSSD {\n");
        sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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
