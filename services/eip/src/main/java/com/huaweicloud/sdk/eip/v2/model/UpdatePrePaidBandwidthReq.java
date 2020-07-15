package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.BandwidthExtendParamDict;
import com.huaweicloud.sdk.eip.v2.model.UpdateBandwidth2Dict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新带宽的请求体
 */
public class UpdatePrePaidBandwidthReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private UpdateBandwidth2Dict bandwidth = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendParam")
    
    private BandwidthExtendParamDict extendParam = null;

    public UpdatePrePaidBandwidthReq withBandwidth(UpdateBandwidth2Dict bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public UpdatePrePaidBandwidthReq withBandwidth(Consumer<UpdateBandwidth2Dict> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new UpdateBandwidth2Dict();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public UpdateBandwidth2Dict getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(UpdateBandwidth2Dict bandwidth) {
        this.bandwidth = bandwidth;
    }

    public UpdatePrePaidBandwidthReq withExtendParam(BandwidthExtendParamDict extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public UpdatePrePaidBandwidthReq withExtendParam(Consumer<BandwidthExtendParamDict> extendParamSetter) {
        if(this.extendParam == null ){
            this.extendParam = new BandwidthExtendParamDict();
            extendParamSetter.accept(this.extendParam);
        }
        
        return this;
    }


    /**
     * Get extendParam
     * @return extendParam
     */
    public BandwidthExtendParamDict getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(BandwidthExtendParamDict extendParam) {
        this.extendParam = extendParam;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePrePaidBandwidthReq updatePrePaidBandwidthReq = (UpdatePrePaidBandwidthReq) o;
        return Objects.equals(this.bandwidth, updatePrePaidBandwidthReq.bandwidth) &&
            Objects.equals(this.extendParam, updatePrePaidBandwidthReq.extendParam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidth, extendParam);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrePaidBandwidthReq {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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

