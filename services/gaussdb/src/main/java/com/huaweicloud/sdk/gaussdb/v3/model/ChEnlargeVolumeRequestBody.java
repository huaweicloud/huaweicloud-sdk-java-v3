package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 磁盘扩容请求体。
 */
public class ChEnlargeVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_in_gb")

    private Integer sizeInGb;

    public ChEnlargeVolumeRequestBody withSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
        return this;
    }

    /**
     * 磁盘容量。取值范围：50GB~32000GB。
     * @return sizeInGb
     */
    public Integer getSizeInGb() {
        return sizeInGb;
    }

    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChEnlargeVolumeRequestBody that = (ChEnlargeVolumeRequestBody) obj;
        return Objects.equals(this.sizeInGb, that.sizeInGb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeInGb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChEnlargeVolumeRequestBody {\n");
        sb.append("    sizeInGb: ").append(toIndentedString(sizeInGb)).append("\n");
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
