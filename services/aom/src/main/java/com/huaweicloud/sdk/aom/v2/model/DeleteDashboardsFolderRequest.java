package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDashboardsFolderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_id")

    private String folderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Enterprise-Project-Id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_all")

    private Boolean deleteAll;

    public DeleteDashboardsFolderRequest withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * 仪表盘分组id。
     * @return folderId
     */
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public DeleteDashboardsFolderRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。获取方式请参见：[获取企业项目ID](aom_04_0024.xml)。  - 删除单个企业项目下实例，填写企业项目id。  - 不填时，默认删除企业项目id为0的企业项目下实例。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DeleteDashboardsFolderRequest withDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }

    /**
     * 是否删除仪表盘分组下的仪表盘。
     * @return deleteAll
     */
    public Boolean getDeleteAll() {
        return deleteAll;
    }

    public void setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDashboardsFolderRequest that = (DeleteDashboardsFolderRequest) obj;
        return Objects.equals(this.folderId, that.folderId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.deleteAll, that.deleteAll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, enterpriseProjectId, deleteAll);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDashboardsFolderRequest {\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    deleteAll: ").append(toIndentedString(deleteAll)).append("\n");
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
