package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 带宽规则对象 */
public class BandWidthRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_size")

    private Integer egressSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_guarented_size")

    private Integer egressGuarentedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_info")

    private List<PublicipInfoResp> publicipInfo = null;

    public BandWidthRules withId(String id) {
        this.id = id;
        return this;
    }

    /** 带宽规则ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BandWidthRules withName(String name) {
        this.name = name;
        return this;
    }

    /** 带宽规则名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BandWidthRules withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 配置状态，为False时配置不生效。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public BandWidthRules withEgressSize(Integer egressSize) {
        this.egressSize = egressSize;
        return this;
    }

    /** 出网带宽最大值，单位M bps。取值范围[0,n]，其中n为所属带宽的带宽大小（size字段）。0表示设置为最大带宽。 minimum: 0
     * 
     * @return egressSize */
    public Integer getEgressSize() {
        return egressSize;
    }

    public void setEgressSize(Integer egressSize) {
        this.egressSize = egressSize;
    }

    public BandWidthRules withEgressGuarentedSize(Integer egressGuarentedSize) {
        this.egressGuarentedSize = egressGuarentedSize;
        return this;
    }

    /** 出网保障带宽大小，单位M bps。取值范围[0,x]，其中x为所属带宽剩余的保障额。 minimum: 0
     * 
     * @return egressGuarentedSize */
    public Integer getEgressGuarentedSize() {
        return egressGuarentedSize;
    }

    public void setEgressGuarentedSize(Integer egressGuarentedSize) {
        this.egressGuarentedSize = egressGuarentedSize;
    }

    public BandWidthRules withPublicipInfo(List<PublicipInfoResp> publicipInfo) {
        this.publicipInfo = publicipInfo;
        return this;
    }

    public BandWidthRules addPublicipInfoItem(PublicipInfoResp publicipInfoItem) {
        if (this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        this.publicipInfo.add(publicipInfoItem);
        return this;
    }

    public BandWidthRules withPublicipInfo(Consumer<List<PublicipInfoResp>> publicipInfoSetter) {
        if (this.publicipInfo == null) {
            this.publicipInfo = new ArrayList<>();
        }
        publicipInfoSetter.accept(this.publicipInfo);
        return this;
    }

    /** 功能说明：带宽对应的弹性公网IP信息 约束：WHOLE类型的带宽支持多个弹性公网IP，PER类型的带宽只能对应一个弹性公网IP
     * 
     * @return publicipInfo */
    public List<PublicipInfoResp> getPublicipInfo() {
        return publicipInfo;
    }

    public void setPublicipInfo(List<PublicipInfoResp> publicipInfo) {
        this.publicipInfo = publicipInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BandWidthRules bandWidthRules = (BandWidthRules) o;
        return Objects.equals(this.id, bandWidthRules.id) && Objects.equals(this.name, bandWidthRules.name)
            && Objects.equals(this.adminStateUp, bandWidthRules.adminStateUp)
            && Objects.equals(this.egressSize, bandWidthRules.egressSize)
            && Objects.equals(this.egressGuarentedSize, bandWidthRules.egressGuarentedSize)
            && Objects.equals(this.publicipInfo, bandWidthRules.publicipInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, adminStateUp, egressSize, egressGuarentedSize, publicipInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandWidthRules {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    egressSize: ").append(toIndentedString(egressSize)).append("\n");
        sb.append("    egressGuarentedSize: ").append(toIndentedString(egressGuarentedSize)).append("\n");
        sb.append("    publicipInfo: ").append(toIndentedString(publicipInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
