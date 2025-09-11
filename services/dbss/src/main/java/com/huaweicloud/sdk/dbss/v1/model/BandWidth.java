package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 带宽参数
 */
public class BandWidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargemode")

    private String chargemode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productid")

    private String productid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharetype")

    private String sharetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public BandWidth withChargemode(String chargemode) {
        this.chargemode = chargemode;
        return this;
    }

    /**
     * 计费类型
     * @return chargemode
     */
    public String getChargemode() {
        return chargemode;
    }

    public void setChargemode(String chargemode) {
        this.chargemode = chargemode;
    }

    public BandWidth withProductid(String productid) {
        this.productid = productid;
        return this;
    }

    /**
     * 带宽对应产品ID
     * @return productid
     */
    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public BandWidth withSharetype(String sharetype) {
        this.sharetype = sharetype;
        return this;
    }

    /**
     * 共享类型，目前仅支持PER
     * @return sharetype
     */
    public String getSharetype() {
        return sharetype;
    }

    public void setSharetype(String sharetype) {
        this.sharetype = sharetype;
    }

    public BandWidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 带宽，按需1-100M，包年包月1-300M
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandWidth that = (BandWidth) obj;
        return Objects.equals(this.chargemode, that.chargemode) && Objects.equals(this.productid, that.productid)
            && Objects.equals(this.sharetype, that.sharetype) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargemode, productid, sharetype, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandWidth {\n");
        sb.append("    chargemode: ").append(toIndentedString(chargemode)).append("\n");
        sb.append("    productid: ").append(toIndentedString(productid)).append("\n");
        sb.append("    sharetype: ").append(toIndentedString(sharetype)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
