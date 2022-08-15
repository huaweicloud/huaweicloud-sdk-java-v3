package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteValueListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valuelistid")

    private String valuelistid;

    public DeleteValueListRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DeleteValueListRequest withValuelistid(String valuelistid) {
        this.valuelistid = valuelistid;
        return this;
    }

    /**
     * 引用表id，通过查询引用表列表（ListValueList）接口获取
     * @return valuelistid
     */
    public String getValuelistid() {
        return valuelistid;
    }

    public void setValuelistid(String valuelistid) {
        this.valuelistid = valuelistid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteValueListRequest deleteValueListRequest = (DeleteValueListRequest) o;
        return Objects.equals(this.enterpriseProjectId, deleteValueListRequest.enterpriseProjectId)
            && Objects.equals(this.valuelistid, deleteValueListRequest.valuelistid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, valuelistid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteValueListRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    valuelistid: ").append(toIndentedString(valuelistid)).append("\n");
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
