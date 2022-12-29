package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务按需转包请求体
 */
public class BwChangeToPeriodReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_ids")

    private List<String> bandwidthIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private CreatePrePaidPublicipExtendParamOption extendParam;

    public BwChangeToPeriodReq withBandwidthIds(List<String> bandwidthIds) {
        this.bandwidthIds = bandwidthIds;
        return this;
    }

    public BwChangeToPeriodReq addBandwidthIdsItem(String bandwidthIdsItem) {
        if (this.bandwidthIds == null) {
            this.bandwidthIds = new ArrayList<>();
        }
        this.bandwidthIds.add(bandwidthIdsItem);
        return this;
    }

    public BwChangeToPeriodReq withBandwidthIds(Consumer<List<String>> bandwidthIdsSetter) {
        if (this.bandwidthIds == null) {
            this.bandwidthIds = new ArrayList<>();
        }
        bandwidthIdsSetter.accept(this.bandwidthIds);
        return this;
    }

    /**
     * 待按需转包带宽列表 
     * @return bandwidthIds
     */
    public List<String> getBandwidthIds() {
        return bandwidthIds;
    }

    public void setBandwidthIds(List<String> bandwidthIds) {
        this.bandwidthIds = bandwidthIds;
    }

    public BwChangeToPeriodReq withExtendParam(CreatePrePaidPublicipExtendParamOption extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public BwChangeToPeriodReq withExtendParam(Consumer<CreatePrePaidPublicipExtendParamOption> extendParamSetter) {
        if (this.extendParam == null) {
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
        BwChangeToPeriodReq bwChangeToPeriodReq = (BwChangeToPeriodReq) o;
        return Objects.equals(this.bandwidthIds, bwChangeToPeriodReq.bandwidthIds)
            && Objects.equals(this.extendParam, bwChangeToPeriodReq.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthIds, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BwChangeToPeriodReq {\n");
        sb.append("    bandwidthIds: ").append(toIndentedString(bandwidthIds)).append("\n");
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
