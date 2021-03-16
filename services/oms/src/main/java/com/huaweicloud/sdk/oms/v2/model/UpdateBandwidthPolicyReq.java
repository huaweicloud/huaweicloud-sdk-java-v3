package com.huaweicloud.sdk.oms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.oms.v2.model.BandwidthPolicyDto;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateBandwidthPolicyReq
 */
public class UpdateBandwidthPolicyReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_policy")
    
    private List<BandwidthPolicyDto> bandwidthPolicy = null;
    
    public UpdateBandwidthPolicyReq withBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
        return this;
    }

    
    public UpdateBandwidthPolicyReq addBandwidthPolicyItem(BandwidthPolicyDto bandwidthPolicyItem) {
        this.bandwidthPolicy.add(bandwidthPolicyItem);
        return this;
    }

    public UpdateBandwidthPolicyReq withBandwidthPolicy(Consumer<List<BandwidthPolicyDto>> bandwidthPolicySetter) {
        if(this.bandwidthPolicy == null ){
            this.bandwidthPolicy = new ArrayList<>();
        }
        bandwidthPolicySetter.accept(this.bandwidthPolicy);
        return this;
    }

    /**
     * 配置流量控制策略。数组中一个元素对应一个时段的最大带宽，最多允许5个时段，且时段不能重叠。
     * @return bandwidthPolicy
     */
    public List<BandwidthPolicyDto> getBandwidthPolicy() {
        return bandwidthPolicy;
    }

    public void setBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBandwidthPolicyReq updateBandwidthPolicyReq = (UpdateBandwidthPolicyReq) o;
        return Objects.equals(this.bandwidthPolicy, updateBandwidthPolicyReq.bandwidthPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBandwidthPolicyReq {\n");
        sb.append("    bandwidthPolicy: ").append(toIndentedString(bandwidthPolicy)).append("\n");
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

