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

    public EipCountRespData withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用查询防火墙实例接口获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。具体可参考APIExlorer和帮助中心FAQ。
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
     * EIP防护数
     * minimum: 0
     * @return eipProtected
     */
    public Integer getEipProtected() {
        return eipProtected;
    }

    public void setEipProtected(Integer eipProtected) {
        this.eipProtected = eipProtected;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EipCountRespData eipCountRespData = (EipCountRespData) o;
        return Objects.equals(this.objectId, eipCountRespData.objectId)
            && Objects.equals(this.eipTotal, eipCountRespData.eipTotal)
            && Objects.equals(this.eipProtected, eipCountRespData.eipProtected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, eipTotal, eipProtected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipCountRespData {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    eipTotal: ").append(toIndentedString(eipTotal)).append("\n");
        sb.append("    eipProtected: ").append(toIndentedString(eipProtected)).append("\n");
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
