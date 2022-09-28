package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEncryptdataNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryptdata_id")

    private String encryptdataId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListEncryptdataNodesRequest withEncryptdataId(String encryptdataId) {
        this.encryptdataId = encryptdataId;
        return this;
    }

    /**
     * 加密数据ID
     * @return encryptdataId
     */
    public String getEncryptdataId() {
        return encryptdataId;
    }

    public void setEncryptdataId(String encryptdataId) {
        this.encryptdataId = encryptdataId;
    }

    public ListEncryptdataNodesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回记录的数量限制
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEncryptdataNodesRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，专业版实例为空值
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public ListEncryptdataNodesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示查询该偏移量后面的记录
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEncryptdataNodesRequest listEncryptdataNodesRequest = (ListEncryptdataNodesRequest) o;
        return Objects.equals(this.encryptdataId, listEncryptdataNodesRequest.encryptdataId)
            && Objects.equals(this.limit, listEncryptdataNodesRequest.limit)
            && Objects.equals(this.iefInstanceId, listEncryptdataNodesRequest.iefInstanceId)
            && Objects.equals(this.offset, listEncryptdataNodesRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptdataId, limit, iefInstanceId, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEncryptdataNodesRequest {\n");
        sb.append("    encryptdataId: ").append(toIndentedString(encryptdataId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
