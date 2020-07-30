package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.CreatePrePaidPublicipExtendParamOption;
import com.huaweicloud.sdk.eip.v2.model.CreatePrePaidPublicipOption;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipBandwidthOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建包周期的弹性公网IP
 */
public class CreatePrePaidPublicipRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private CreatePrePaidPublicipOption publicip = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private CreatePublicipBandwidthOption bandwidth = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendParam")
    
    private CreatePrePaidPublicipExtendParamOption extendParam = null;

    public CreatePrePaidPublicipRequestBody withPublicip(CreatePrePaidPublicipOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePrePaidPublicipRequestBody withPublicip(Consumer<CreatePrePaidPublicipOption> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new CreatePrePaidPublicipOption();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public CreatePrePaidPublicipOption getPublicip() {
        return publicip;
    }

    public void setPublicip(CreatePrePaidPublicipOption publicip) {
        this.publicip = publicip;
    }

    public CreatePrePaidPublicipRequestBody withBandwidth(CreatePublicipBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreatePrePaidPublicipRequestBody withBandwidth(Consumer<CreatePublicipBandwidthOption> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new CreatePublicipBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public CreatePublicipBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(CreatePublicipBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreatePrePaidPublicipRequestBody withExtendParam(CreatePrePaidPublicipExtendParamOption extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreatePrePaidPublicipRequestBody withExtendParam(Consumer<CreatePrePaidPublicipExtendParamOption> extendParamSetter) {
        if(this.extendParam == null ){
            this.extendParam = new CreatePrePaidPublicipExtendParamOption();
            extendParamSetter.accept(this.extendParam);
        }
        
        return this;
    }


    /**
     * Get extendParam
     * @return extendParam
     */
    public CreatePrePaidPublicipExtendParamOption getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(CreatePrePaidPublicipExtendParamOption extendParam) {
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
        CreatePrePaidPublicipRequestBody createPrePaidPublicipRequestBody = (CreatePrePaidPublicipRequestBody) o;
        return Objects.equals(this.publicip, createPrePaidPublicipRequestBody.publicip) &&
            Objects.equals(this.bandwidth, createPrePaidPublicipRequestBody.bandwidth) &&
            Objects.equals(this.extendParam, createPrePaidPublicipRequestBody.extendParam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicip, bandwidth, extendParam);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrePaidPublicipRequestBody {\n");
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

