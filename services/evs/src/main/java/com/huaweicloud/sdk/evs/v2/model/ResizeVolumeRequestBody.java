package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.BssParamForResizeVolume;
import com.huaweicloud.sdk.evs.v2.model.OsExtend;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class ResizeVolumeRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bssParam")
    
    private BssParamForResizeVolume bssParam = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-extend")
    
    private OsExtend osExtend = null;

    public ResizeVolumeRequestBody withBssParam(BssParamForResizeVolume bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public ResizeVolumeRequestBody withBssParam(Consumer<BssParamForResizeVolume> bssParamSetter) {
        if(this.bssParam == null ){
            this.bssParam = new BssParamForResizeVolume();
        }
        bssParamSetter.accept(this.bssParam);
        return this;
    }


    /**
     * Get bssParam
     * @return bssParam
     */
    public BssParamForResizeVolume getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssParamForResizeVolume bssParam) {
        this.bssParam = bssParam;
    }

    public ResizeVolumeRequestBody withOsExtend(OsExtend osExtend) {
        this.osExtend = osExtend;
        return this;
    }

    public ResizeVolumeRequestBody withOsExtend(Consumer<OsExtend> osExtendSetter) {
        if(this.osExtend == null ){
            this.osExtend = new OsExtend();
        }
        osExtendSetter.accept(this.osExtend);
        return this;
    }


    /**
     * Get osExtend
     * @return osExtend
     */
    public OsExtend getOsExtend() {
        return osExtend;
    }

    public void setOsExtend(OsExtend osExtend) {
        this.osExtend = osExtend;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeVolumeRequestBody resizeVolumeRequestBody = (ResizeVolumeRequestBody) o;
        return Objects.equals(this.bssParam, resizeVolumeRequestBody.bssParam) &&
            Objects.equals(this.osExtend, resizeVolumeRequestBody.osExtend);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bssParam, osExtend);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeVolumeRequestBody {\n");
            sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
            sb.append("    osExtend: ").append(toIndentedString(osExtend)).append("\n");
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

