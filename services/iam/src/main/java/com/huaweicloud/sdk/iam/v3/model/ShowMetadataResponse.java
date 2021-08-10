package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowMetadataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_id")

    private String idpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_id")

    private String protocolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xaccount_type")

    private String xaccountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    public ShowMetadataResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** Metadata的ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowMetadataResponse withIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }

    /** 身份提供商ID。
     * 
     * @return idpId */
    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public ShowMetadataResponse withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /** Metadata文件中的entityID字段。
     * 
     * @return entityId */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public ShowMetadataResponse withProtocolId(String protocolId) {
        this.protocolId = protocolId;
        return this;
    }

    /** 协议ID。
     * 
     * @return protocolId */
    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public ShowMetadataResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 用户所属账号ID。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowMetadataResponse withXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
        return this;
    }

    /** 账号来源，默认为空。
     * 
     * @return xaccountType */
    public String getXaccountType() {
        return xaccountType;
    }

    public void setXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
    }

    public ShowMetadataResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 导入或更新Metadata文件的时间。
     * 
     * @return updateTime */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowMetadataResponse withData(String data) {
        this.data = data;
        return this;
    }

    /** Metadata文件的内容。
     * 
     * @return data */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMetadataResponse showMetadataResponse = (ShowMetadataResponse) o;
        return Objects.equals(this.id, showMetadataResponse.id)
            && Objects.equals(this.idpId, showMetadataResponse.idpId)
            && Objects.equals(this.entityId, showMetadataResponse.entityId)
            && Objects.equals(this.protocolId, showMetadataResponse.protocolId)
            && Objects.equals(this.domainId, showMetadataResponse.domainId)
            && Objects.equals(this.xaccountType, showMetadataResponse.xaccountType)
            && Objects.equals(this.updateTime, showMetadataResponse.updateTime)
            && Objects.equals(this.data, showMetadataResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idpId, entityId, protocolId, domainId, xaccountType, updateTime, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetadataResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
