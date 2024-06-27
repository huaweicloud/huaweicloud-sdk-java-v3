package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListServiceSetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_service_set_type")

    private Integer queryServiceSetType;

    public ListServiceSetsRequest withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 互联网边界防护对象id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，type为0的为互联网边界防护对象id。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ListServiceSetsRequest withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 关键字
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public ListServiceSetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页查询个数，范围为1-1024
     * minimum: 1
     * maximum: 1024
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListServiceSetsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListServiceSetsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，用户支持企业项目后，由企业项目生成的id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListServiceSetsRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，默认情况下，fw_instance_Id为空时，返回账号下第一个墙的信息；fw_instance_Id非空时，返回与fw_instance_Id对应墙的信息。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ListServiceSetsRequest withQueryServiceSetType(Integer queryServiceSetType) {
        this.queryServiceSetType = queryServiceSetType;
        return this;
    }

    /**
     * 查询服务组类型，0表示自定义服务组，1表示预定义服务组
     * @return queryServiceSetType
     */
    public Integer getQueryServiceSetType() {
        return queryServiceSetType;
    }

    public void setQueryServiceSetType(Integer queryServiceSetType) {
        this.queryServiceSetType = queryServiceSetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServiceSetsRequest that = (ListServiceSetsRequest) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.keyWord, that.keyWord)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.fwInstanceId, that.fwInstanceId)
            && Objects.equals(this.queryServiceSetType, that.queryServiceSetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, keyWord, limit, offset, enterpriseProjectId, fwInstanceId, queryServiceSetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceSetsRequest {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    queryServiceSetType: ").append(toIndentedString(queryServiceSetType)).append("\n");
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
