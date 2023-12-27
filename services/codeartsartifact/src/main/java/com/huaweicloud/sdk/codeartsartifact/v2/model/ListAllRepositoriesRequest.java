package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAllRepositoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qname")

    private String qname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_list")

    private String formatList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_recycle_bin")

    private Boolean isRecycleBin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_paging")

    private Boolean isNeedPaging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_project")

    private Boolean inProject;

    public ListAllRepositoriesRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ListAllRepositoriesRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListAllRepositoriesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListAllRepositoriesRequest withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页码
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ListAllRepositoriesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListAllRepositoriesRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序类型
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListAllRepositoriesRequest withQname(String qname) {
        this.qname = qname;
        return this;
    }

    /**
     * 查询内容
     * @return qname
     */
    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public ListAllRepositoriesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 仓库类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListAllRepositoriesRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 仓库格式
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ListAllRepositoriesRequest withFormatList(String formatList) {
        this.formatList = formatList;
        return this;
    }

    /**
     * 仓库格式列表
     * @return formatList
     */
    public String getFormatList() {
        return formatList;
    }

    public void setFormatList(String formatList) {
        this.formatList = formatList;
    }

    public ListAllRepositoriesRequest withIsRecycleBin(Boolean isRecycleBin) {
        this.isRecycleBin = isRecycleBin;
        return this;
    }

    /**
     * 是否是回收站文件
     * @return isRecycleBin
     */
    public Boolean getIsRecycleBin() {
        return isRecycleBin;
    }

    public void setIsRecycleBin(Boolean isRecycleBin) {
        this.isRecycleBin = isRecycleBin;
    }

    public ListAllRepositoriesRequest withIsNeedPaging(Boolean isNeedPaging) {
        this.isNeedPaging = isNeedPaging;
        return this;
    }

    /**
     * 是否需要分页
     * @return isNeedPaging
     */
    public Boolean getIsNeedPaging() {
        return isNeedPaging;
    }

    public void setIsNeedPaging(Boolean isNeedPaging) {
        this.isNeedPaging = isNeedPaging;
    }

    public ListAllRepositoriesRequest withInProject(Boolean inProject) {
        this.inProject = inProject;
        return this;
    }

    /**
     * 是否在项目中
     * @return inProject
     */
    public Boolean getInProject() {
        return inProject;
    }

    public void setInProject(Boolean inProject) {
        this.inProject = inProject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllRepositoriesRequest that = (ListAllRepositoriesRequest) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.qname, that.qname) && Objects.equals(this.type, that.type)
            && Objects.equals(this.format, that.format) && Objects.equals(this.formatList, that.formatList)
            && Objects.equals(this.isRecycleBin, that.isRecycleBin)
            && Objects.equals(this.isNeedPaging, that.isNeedPaging) && Objects.equals(this.inProject, that.inProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId,
            projectId,
            groupId,
            pageNo,
            pageSize,
            sort,
            qname,
            type,
            format,
            formatList,
            isRecycleBin,
            isNeedPaging,
            inProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllRepositoriesRequest {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    qname: ").append(toIndentedString(qname)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    formatList: ").append(toIndentedString(formatList)).append("\n");
        sb.append("    isRecycleBin: ").append(toIndentedString(isRecycleBin)).append("\n");
        sb.append("    isNeedPaging: ").append(toIndentedString(isNeedPaging)).append("\n");
        sb.append("    inProject: ").append(toIndentedString(inProject)).append("\n");
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
