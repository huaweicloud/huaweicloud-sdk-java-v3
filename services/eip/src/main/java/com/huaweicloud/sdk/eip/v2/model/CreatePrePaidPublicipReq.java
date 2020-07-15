package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.CreatePrePaidPublicipDict;
import com.huaweicloud.sdk.eip.v2.model.PubicipBandwidthDict;
import com.huaweicloud.sdk.eip.v2.model.PublicipExtendParamDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建包周期的弹性公网IP
 */
public class CreatePrePaidPublicipReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private CreatePrePaidPublicipDict publicip = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private PubicipBandwidthDict bandwidth = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendParam")
    
    private PublicipExtendParamDict extendParam = null;

    public CreatePrePaidPublicipReq withPublicip(CreatePrePaidPublicipDict publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePrePaidPublicipReq withPublicip(Consumer<CreatePrePaidPublicipDict> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new CreatePrePaidPublicipDict();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public CreatePrePaidPublicipDict getPublicip() {
        return publicip;
    }

    public void setPublicip(CreatePrePaidPublicipDict publicip) {
        this.publicip = publicip;
    }

    public CreatePrePaidPublicipReq withBandwidth(PubicipBandwidthDict bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreatePrePaidPublicipReq withBandwidth(Consumer<PubicipBandwidthDict> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new PubicipBandwidthDict();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public PubicipBandwidthDict getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(PubicipBandwidthDict bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreatePrePaidPublicipReq withExtendParam(PublicipExtendParamDict extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreatePrePaidPublicipReq withExtendParam(Consumer<PublicipExtendParamDict> extendParamSetter) {
        if(this.extendParam == null ){
            this.extendParam = new PublicipExtendParamDict();
            extendParamSetter.accept(this.extendParam);
        }
        
        return this;
    }


    /**
     * Get extendParam
     * @return extendParam
     */
    public PublicipExtendParamDict getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(PublicipExtendParamDict extendParam) {
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
        CreatePrePaidPublicipReq createPrePaidPublicipReq = (CreatePrePaidPublicipReq) o;
        return Objects.equals(this.publicip, createPrePaidPublicipReq.publicip) &&
            Objects.equals(this.bandwidth, createPrePaidPublicipReq.bandwidth) &&
            Objects.equals(this.extendParam, createPrePaidPublicipReq.extendParam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicip, bandwidth, extendParam);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrePaidPublicipReq {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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

