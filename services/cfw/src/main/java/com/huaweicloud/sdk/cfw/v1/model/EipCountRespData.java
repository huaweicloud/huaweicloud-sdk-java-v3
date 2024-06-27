package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EIP 数量查询反馈
 */
public class EipCountRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_total")

    private Integer eipTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_protected")

    private Integer eipProtected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_protected_self")

    private Integer eipProtectedSelf;

    public EipCountRespData withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public EipCountRespData withEipTotal(Integer eipTotal) {
        this.eipTotal = eipTotal;
        return this;
    }

    /**
     * EIP总数
     * minimum: 0
     * @return eipTotal
     */
    public Integer getEipTotal() {
        return eipTotal;
    }

    public void setEipTotal(Integer eipTotal) {
        this.eipTotal = eipTotal;
    }

    public EipCountRespData withEipProtected(Integer eipProtected) {
        this.eipProtected = eipProtected;
        return this;
    }

    /**
     * 该账号下所有墙防护EIP总数量
     * minimum: 0
     * @return eipProtected
     */
    public Integer getEipProtected() {
        return eipProtected;
    }

    public void setEipProtected(Integer eipProtected) {
        this.eipProtected = eipProtected;
    }

    public EipCountRespData withEipProtectedSelf(Integer eipProtectedSelf) {
        this.eipProtectedSelf = eipProtectedSelf;
        return this;
    }

    /**
     * 该当前防火墙防护EIP数量
     * @return eipProtectedSelf
     */
    public Integer getEipProtectedSelf() {
        return eipProtectedSelf;
    }

    public void setEipProtectedSelf(Integer eipProtectedSelf) {
        this.eipProtectedSelf = eipProtectedSelf;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipCountRespData that = (EipCountRespData) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.eipTotal, that.eipTotal)
            && Objects.equals(this.eipProtected, that.eipProtected)
            && Objects.equals(this.eipProtectedSelf, that.eipProtectedSelf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, eipTotal, eipProtected, eipProtectedSelf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipCountRespData {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    eipTotal: ").append(toIndentedString(eipTotal)).append("\n");
        sb.append("    eipProtected: ").append(toIndentedString(eipProtected)).append("\n");
        sb.append("    eipProtectedSelf: ").append(toIndentedString(eipProtectedSelf)).append("\n");
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
