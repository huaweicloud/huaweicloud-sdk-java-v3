package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class RetypeVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bssParam")

    private BssParamForRetypeVolume bssParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-retype")

    private RetypeVolume osRetype;

    public RetypeVolumeRequestBody withBssParam(BssParamForRetypeVolume bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public RetypeVolumeRequestBody withBssParam(Consumer<BssParamForRetypeVolume> bssParamSetter) {
        if (this.bssParam == null) {
            this.bssParam = new BssParamForRetypeVolume();
            bssParamSetter.accept(this.bssParam);
        }

        return this;
    }

    /**
     * Get bssParam
     * @return bssParam
     */
    public BssParamForRetypeVolume getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssParamForRetypeVolume bssParam) {
        this.bssParam = bssParam;
    }

    public RetypeVolumeRequestBody withOsRetype(RetypeVolume osRetype) {
        this.osRetype = osRetype;
        return this;
    }

    public RetypeVolumeRequestBody withOsRetype(Consumer<RetypeVolume> osRetypeSetter) {
        if (this.osRetype == null) {
            this.osRetype = new RetypeVolume();
            osRetypeSetter.accept(this.osRetype);
        }

        return this;
    }

    /**
     * Get osRetype
     * @return osRetype
     */
    public RetypeVolume getOsRetype() {
        return osRetype;
    }

    public void setOsRetype(RetypeVolume osRetype) {
        this.osRetype = osRetype;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetypeVolumeRequestBody that = (RetypeVolumeRequestBody) obj;
        return Objects.equals(this.bssParam, that.bssParam) && Objects.equals(this.osRetype, that.osRetype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bssParam, osRetype);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetypeVolumeRequestBody {\n");
        sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
        sb.append("    osRetype: ").append(toIndentedString(osRetype)).append("\n");
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
