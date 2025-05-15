package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 本端 Region ID。
 */
public class LocalRegionId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_region_id")

    private String localRegionId;

    public LocalRegionId withLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
        return this;
    }

    /**
     * RegionID。
     * @return localRegionId
     */
    public String getLocalRegionId() {
        return localRegionId;
    }

    public void setLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalRegionId that = (LocalRegionId) obj;
        return Objects.equals(this.localRegionId, that.localRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalRegionId {\n");
        sb.append("    localRegionId: ").append(toIndentedString(localRegionId)).append("\n");
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
