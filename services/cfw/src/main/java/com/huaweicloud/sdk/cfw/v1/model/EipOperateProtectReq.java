package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EIP操作防护请求体
 */
public class EipOperateProtectReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_infos")

    private List<EipOperateProtectReqIpInfos> ipInfos = null;

    public EipOperateProtectReq withObjectId(String objectId) {
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

    public EipOperateProtectReq withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * EIP状态，0表示防护中，1表示未防护
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public EipOperateProtectReq withIpInfos(List<EipOperateProtectReqIpInfos> ipInfos) {
        this.ipInfos = ipInfos;
        return this;
    }

    public EipOperateProtectReq addIpInfosItem(EipOperateProtectReqIpInfos ipInfosItem) {
        if (this.ipInfos == null) {
            this.ipInfos = new ArrayList<>();
        }
        this.ipInfos.add(ipInfosItem);
        return this;
    }

    public EipOperateProtectReq withIpInfos(Consumer<List<EipOperateProtectReqIpInfos>> ipInfosSetter) {
        if (this.ipInfos == null) {
            this.ipInfos = new ArrayList<>();
        }
        ipInfosSetter.accept(this.ipInfos);
        return this;
    }

    /**
     * EIP信息列表
     * @return ipInfos
     */
    public List<EipOperateProtectReqIpInfos> getIpInfos() {
        return ipInfos;
    }

    public void setIpInfos(List<EipOperateProtectReqIpInfos> ipInfos) {
        this.ipInfos = ipInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipOperateProtectReq that = (EipOperateProtectReq) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.ipInfos, that.ipInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, status, ipInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipOperateProtectReq {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ipInfos: ").append(toIndentedString(ipInfos)).append("\n");
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
