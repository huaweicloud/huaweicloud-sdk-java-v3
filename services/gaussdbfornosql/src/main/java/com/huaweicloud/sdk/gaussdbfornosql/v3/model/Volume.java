package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * volume信息。
 */
public class Volume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private String used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gift_size")

    private String giftSize;

    public Volume withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 参数解释： 磁盘大小。单位：GB。 取值范围： 不涉及。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Volume withUsed(String used) {
        this.used = used;
        return this;
    }

    /**
     * 参数解释： 磁盘使用量。单位：GB。 取值范围： 不涉及。
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public Volume withGiftSize(String giftSize) {
        this.giftSize = giftSize;
        return this;
    }

    /**
     * 参数解释： 赠送的磁盘大小。单位：GB。 取值范围： 不涉及。
     * @return giftSize
     */
    public String getGiftSize() {
        return giftSize;
    }

    public void setGiftSize(String giftSize) {
        this.giftSize = giftSize;
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
        return Objects.equals(this.size, that.size) && Objects.equals(this.used, that.used)
            && Objects.equals(this.giftSize, that.giftSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, used, giftSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volume {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    giftSize: ").append(toIndentedString(giftSize)).append("\n");
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
