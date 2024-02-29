package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * vpc protects vo
 */
public class VPCProtectsVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_total")

    private Integer selfTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_total")

    private Integer otherTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_vpcs")

    private List<VpcAttachmentDetail> protectVpcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_protect_vpcs")

    private List<VpcAttachmentDetail> selfProtectVpcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_protect_vpcs")

    private List<VpcAttachmentDetail> otherProtectVpcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_assets")

    private Integer totalAssets;

    public VPCProtectsVo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总VPC数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public VPCProtectsVo withSelfTotal(Integer selfTotal) {
        this.selfTotal = selfTotal;
        return this;
    }

    /**
     * 本项目防护VPC数
     * @return selfTotal
     */
    public Integer getSelfTotal() {
        return selfTotal;
    }

    public void setSelfTotal(Integer selfTotal) {
        this.selfTotal = selfTotal;
    }

    public VPCProtectsVo withOtherTotal(Integer otherTotal) {
        this.otherTotal = otherTotal;
        return this;
    }

    /**
     * 其他项目防护VPC数
     * @return otherTotal
     */
    public Integer getOtherTotal() {
        return otherTotal;
    }

    public void setOtherTotal(Integer otherTotal) {
        this.otherTotal = otherTotal;
    }

    public VPCProtectsVo withProtectVpcs(List<VpcAttachmentDetail> protectVpcs) {
        this.protectVpcs = protectVpcs;
        return this;
    }

    public VPCProtectsVo addProtectVpcsItem(VpcAttachmentDetail protectVpcsItem) {
        if (this.protectVpcs == null) {
            this.protectVpcs = new ArrayList<>();
        }
        this.protectVpcs.add(protectVpcsItem);
        return this;
    }

    public VPCProtectsVo withProtectVpcs(Consumer<List<VpcAttachmentDetail>> protectVpcsSetter) {
        if (this.protectVpcs == null) {
            this.protectVpcs = new ArrayList<>();
        }
        protectVpcsSetter.accept(this.protectVpcs);
        return this;
    }

    /**
     * 防护VPC
     * @return protectVpcs
     */
    public List<VpcAttachmentDetail> getProtectVpcs() {
        return protectVpcs;
    }

    public void setProtectVpcs(List<VpcAttachmentDetail> protectVpcs) {
        this.protectVpcs = protectVpcs;
    }

    public VPCProtectsVo withSelfProtectVpcs(List<VpcAttachmentDetail> selfProtectVpcs) {
        this.selfProtectVpcs = selfProtectVpcs;
        return this;
    }

    public VPCProtectsVo addSelfProtectVpcsItem(VpcAttachmentDetail selfProtectVpcsItem) {
        if (this.selfProtectVpcs == null) {
            this.selfProtectVpcs = new ArrayList<>();
        }
        this.selfProtectVpcs.add(selfProtectVpcsItem);
        return this;
    }

    public VPCProtectsVo withSelfProtectVpcs(Consumer<List<VpcAttachmentDetail>> selfProtectVpcsSetter) {
        if (this.selfProtectVpcs == null) {
            this.selfProtectVpcs = new ArrayList<>();
        }
        selfProtectVpcsSetter.accept(this.selfProtectVpcs);
        return this;
    }

    /**
     * 本项目防护VPC
     * @return selfProtectVpcs
     */
    public List<VpcAttachmentDetail> getSelfProtectVpcs() {
        return selfProtectVpcs;
    }

    public void setSelfProtectVpcs(List<VpcAttachmentDetail> selfProtectVpcs) {
        this.selfProtectVpcs = selfProtectVpcs;
    }

    public VPCProtectsVo withOtherProtectVpcs(List<VpcAttachmentDetail> otherProtectVpcs) {
        this.otherProtectVpcs = otherProtectVpcs;
        return this;
    }

    public VPCProtectsVo addOtherProtectVpcsItem(VpcAttachmentDetail otherProtectVpcsItem) {
        if (this.otherProtectVpcs == null) {
            this.otherProtectVpcs = new ArrayList<>();
        }
        this.otherProtectVpcs.add(otherProtectVpcsItem);
        return this;
    }

    public VPCProtectsVo withOtherProtectVpcs(Consumer<List<VpcAttachmentDetail>> otherProtectVpcsSetter) {
        if (this.otherProtectVpcs == null) {
            this.otherProtectVpcs = new ArrayList<>();
        }
        otherProtectVpcsSetter.accept(this.otherProtectVpcs);
        return this;
    }

    /**
     * 其他项目防护VPC
     * @return otherProtectVpcs
     */
    public List<VpcAttachmentDetail> getOtherProtectVpcs() {
        return otherProtectVpcs;
    }

    public void setOtherProtectVpcs(List<VpcAttachmentDetail> otherProtectVpcs) {
        this.otherProtectVpcs = otherProtectVpcs;
    }

    public VPCProtectsVo withTotalAssets(Integer totalAssets) {
        this.totalAssets = totalAssets;
        return this;
    }

    /**
     * 所有资产数量
     * @return totalAssets
     */
    public Integer getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(Integer totalAssets) {
        this.totalAssets = totalAssets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VPCProtectsVo that = (VPCProtectsVo) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.selfTotal, that.selfTotal)
            && Objects.equals(this.otherTotal, that.otherTotal) && Objects.equals(this.protectVpcs, that.protectVpcs)
            && Objects.equals(this.selfProtectVpcs, that.selfProtectVpcs)
            && Objects.equals(this.otherProtectVpcs, that.otherProtectVpcs)
            && Objects.equals(this.totalAssets, that.totalAssets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, selfTotal, otherTotal, protectVpcs, selfProtectVpcs, otherProtectVpcs, totalAssets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VPCProtectsVo {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    selfTotal: ").append(toIndentedString(selfTotal)).append("\n");
        sb.append("    otherTotal: ").append(toIndentedString(otherTotal)).append("\n");
        sb.append("    protectVpcs: ").append(toIndentedString(protectVpcs)).append("\n");
        sb.append("    selfProtectVpcs: ").append(toIndentedString(selfProtectVpcs)).append("\n");
        sb.append("    otherProtectVpcs: ").append(toIndentedString(otherProtectVpcs)).append("\n");
        sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
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
