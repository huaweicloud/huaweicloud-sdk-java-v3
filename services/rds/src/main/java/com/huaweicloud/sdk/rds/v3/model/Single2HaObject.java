package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 单机转主备时必填。 */
public class Single2HaObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code_new_node")

    private String azCodeNewNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_id")

    private String dsspoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_domain_info")

    private ADDomainInfo adDomainInfo;

    public Single2HaObject withAzCodeNewNode(String azCodeNewNode) {
        this.azCodeNewNode = azCodeNewNode;
        return this;
    }

    /** 实例节点可用区码（AZ）。
     * 
     * @return azCodeNewNode */
    public String getAzCodeNewNode() {
        return azCodeNewNode;
    }

    public void setAzCodeNewNode(String azCodeNewNode) {
        this.azCodeNewNode = azCodeNewNode;
    }

    public Single2HaObject withDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
        return this;
    }

    /** Dec用户专属存储ID，每个az配置的专属存储不同，实例节点所在专属存储ID，仅支持DEC用户创建时使用。
     * 
     * @return dsspoolId */
    public String getDsspoolId() {
        return dsspoolId;
    }

    public void setDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
    }

    public Single2HaObject withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /** 仅包周期实例进行单机转主备时可指定，表示是否自动从客户的账户中支付。 - true，为自动支付。 - false，为手动支付，默认该方式。
     * 
     * @return isAutoPay */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public Single2HaObject withAdDomainInfo(ADDomainInfo adDomainInfo) {
        this.adDomainInfo = adDomainInfo;
        return this;
    }

    public Single2HaObject withAdDomainInfo(Consumer<ADDomainInfo> adDomainInfoSetter) {
        if (this.adDomainInfo == null) {
            this.adDomainInfo = new ADDomainInfo();
            adDomainInfoSetter.accept(this.adDomainInfo);
        }

        return this;
    }

    /** Get adDomainInfo
     * 
     * @return adDomainInfo */
    public ADDomainInfo getAdDomainInfo() {
        return adDomainInfo;
    }

    public void setAdDomainInfo(ADDomainInfo adDomainInfo) {
        this.adDomainInfo = adDomainInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Single2HaObject single2HaObject = (Single2HaObject) o;
        return Objects.equals(this.azCodeNewNode, single2HaObject.azCodeNewNode)
            && Objects.equals(this.dsspoolId, single2HaObject.dsspoolId)
            && Objects.equals(this.isAutoPay, single2HaObject.isAutoPay)
            && Objects.equals(this.adDomainInfo, single2HaObject.adDomainInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azCodeNewNode, dsspoolId, isAutoPay, adDomainInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Single2HaObject {\n");
        sb.append("    azCodeNewNode: ").append(toIndentedString(azCodeNewNode)).append("\n");
        sb.append("    dsspoolId: ").append(toIndentedString(dsspoolId)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    adDomainInfo: ").append(toIndentedString(adDomainInfo)).append("\n");
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
