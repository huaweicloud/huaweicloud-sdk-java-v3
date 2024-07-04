package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SrFlavorResizeReq
 */
public class SrFlavorResizeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fe_flavor_id")

    private String feFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_flavor_id")

    private String beFlavorId;

    public SrFlavorResizeReq withFeFlavorId(String feFlavorId) {
        this.feFlavorId = feFlavorId;
        return this;
    }

    /**
     * FE节点CPU、内存规格ID。填空或者不填视为规格ID与原规格ID保持一致。
     * @return feFlavorId
     */
    public String getFeFlavorId() {
        return feFlavorId;
    }

    public void setFeFlavorId(String feFlavorId) {
        this.feFlavorId = feFlavorId;
    }

    public SrFlavorResizeReq withBeFlavorId(String beFlavorId) {
        this.beFlavorId = beFlavorId;
        return this;
    }

    /**
     * BE节点CPU、内存规格ID。填空或者不填视为规格ID与原规格ID保持一致。
     * @return beFlavorId
     */
    public String getBeFlavorId() {
        return beFlavorId;
    }

    public void setBeFlavorId(String beFlavorId) {
        this.beFlavorId = beFlavorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SrFlavorResizeReq that = (SrFlavorResizeReq) obj;
        return Objects.equals(this.feFlavorId, that.feFlavorId) && Objects.equals(this.beFlavorId, that.beFlavorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feFlavorId, beFlavorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SrFlavorResizeReq {\n");
        sb.append("    feFlavorId: ").append(toIndentedString(feFlavorId)).append("\n");
        sb.append("    beFlavorId: ").append(toIndentedString(beFlavorId)).append("\n");
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
