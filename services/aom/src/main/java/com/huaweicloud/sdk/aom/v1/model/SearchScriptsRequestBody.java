package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SearchScriptsRequestBody
 */
public class SearchScriptsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_default")
    
    
    private String isDefault;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_by")
    
    
    private String createBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_id")
    
    
    private String scriptId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_num")
    
    
    private Integer pageNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    
    private Integer pageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_by_column")
    
    
    private String orderByColumn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_order")
    
    
    private String sortOrder;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    
    private String enterpriseProjectId;

    public SearchScriptsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 查询接收的参数，版本管理时，name为脚本名称（版本管理查询时name不能为空），页面查询时，name为接收模糊查询的参数，name是null，表示查询所有默认脚本。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public SearchScriptsRequestBody withIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    


    /**
     * 查询规则，当取值为default时，表示脚本管理主页查询，包括模糊查询；当取值为no_default时，表示版本管理；当取值为空时，默认是页面查询, 传入不影响使用。
     * @return isDefault
     */
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    

    public SearchScriptsRequestBody withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 创建人，默认按照创建人搜索脚本。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public SearchScriptsRequestBody withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    


    /**
     * 版本管理时需要查询的脚本id。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    

    public SearchScriptsRequestBody withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    


    /**
     * page_num为正整数。
     * minimum: 1
     * maximum: 100
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    

    public SearchScriptsRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 每页显示的条数，默认值是10。
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    

    public SearchScriptsRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public SearchScriptsRequestBody withOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
        return this;
    }

    


    /**
     * 需要排序的字段(默认为更新时间),支持字段有name,create_time和update_time。
     * @return orderByColumn
     */
    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    

    public SearchScriptsRequestBody withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    


    /**
     * 排序规则(默认降序) 传入升序或降序，升序：ASC，降序：DESC。
     * @return sortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    

    public SearchScriptsRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目id，根据企业项目id搜索。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchScriptsRequestBody searchScriptsRequestBody = (SearchScriptsRequestBody) o;
        return Objects.equals(this.name, searchScriptsRequestBody.name) &&
            Objects.equals(this.isDefault, searchScriptsRequestBody.isDefault) &&
            Objects.equals(this.createBy, searchScriptsRequestBody.createBy) &&
            Objects.equals(this.scriptId, searchScriptsRequestBody.scriptId) &&
            Objects.equals(this.pageNum, searchScriptsRequestBody.pageNum) &&
            Objects.equals(this.pageSize, searchScriptsRequestBody.pageSize) &&
            Objects.equals(this.projectId, searchScriptsRequestBody.projectId) &&
            Objects.equals(this.orderByColumn, searchScriptsRequestBody.orderByColumn) &&
            Objects.equals(this.sortOrder, searchScriptsRequestBody.sortOrder) &&
            Objects.equals(this.enterpriseProjectId, searchScriptsRequestBody.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, isDefault, createBy, scriptId, pageNum, pageSize, projectId, orderByColumn, sortOrder, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchScriptsRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    orderByColumn: ").append(toIndentedString(orderByColumn)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

