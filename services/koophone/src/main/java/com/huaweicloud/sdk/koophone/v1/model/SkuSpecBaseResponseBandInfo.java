package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 带宽相关信息
 */
public class SkuSpecBaseResponseBandInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbcSkuId")

    private String cbcSkuId;

    public SkuSpecBaseResponseBandInfo withCbcSkuId(String cbcSkuId) {
        this.cbcSkuId = cbcSkuId;
        return this;
    }

    /**
     * 带宽的sku_id,对应订购接口的bandSkuId
     * @return cbcSkuId
     */
    public String getCbcSkuId() {
        return cbcSkuId;
    }

    public void setCbcSkuId(String cbcSkuId) {
        this.cbcSkuId = cbcSkuId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkuSpecBaseResponseBandInfo that = (SkuSpecBaseResponseBandInfo) obj;
        return Objects.equals(this.cbcSkuId, that.cbcSkuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cbcSkuId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuSpecBaseResponseBandInfo {\n");
        sb.append("    cbcSkuId: ").append(toIndentedString(cbcSkuId)).append("\n");
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
