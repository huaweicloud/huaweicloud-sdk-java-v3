package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询工作流列表。
 */
@JacksonXmlRootElement(localName = "WorkflowQueryParam")
public class WorkflowQueryParam  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search")
    
    @JacksonXmlProperty(localName = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    @JacksonXmlProperty(localName = "tags")
    private Map<String, String> tags = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    @JacksonXmlProperty(localName = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_by")
    
    @JacksonXmlProperty(localName = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_field")
    
    @JacksonXmlProperty(localName = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_type")
    
    @JacksonXmlProperty(localName = "sort_type")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search_time_start")
    
    @JacksonXmlProperty(localName = "search_time_start")

    private Long searchTimeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search_time_end")
    
    @JacksonXmlProperty(localName = "search_time_end")

    private Long searchTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    @JacksonXmlProperty(localName = "status")

    private String status;

    public WorkflowQueryParam withSearch(String search) {
        this.search = search;
        return this;
    }

    


    /**
     * 搜索内容，可以针对工作流名称和描述内容进行搜索。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    

    public WorkflowQueryParam withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 工作流分类，可以取值[\"cron\",\"event\",\"manual\"]。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public WorkflowQueryParam withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    

    public WorkflowQueryParam putTagsItem(String key, String tagsItem) {
        if(this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public WorkflowQueryParam withTags(Consumer<Map<String, String>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }
    /**
     * 工作标签，最多支持10个。
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    

    public WorkflowQueryParam withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 查询当前的页数，默认值为0。
     * minimum: 1
     * maximum: 9999999
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public WorkflowQueryParam withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 查询当前页的大小，默认值为10。
     * minimum: 1
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public WorkflowQueryParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public WorkflowQueryParam withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 工作流创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public WorkflowQueryParam withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    


    /**
     * 排序字段，取值[\"create_time\"，\"last_execution_start_time\"]。
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    

    public WorkflowQueryParam withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    


    /**
     * 排序类型，取值[\"ASC\"，\"DESC\"]。
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    

    public WorkflowQueryParam withSearchTimeStart(Long searchTimeStart) {
        this.searchTimeStart = searchTimeStart;
        return this;
    }

    


    /**
     * 更新时间，时间范围查询的开始时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return searchTimeStart
     */
    public Long getSearchTimeStart() {
        return searchTimeStart;
    }

    public void setSearchTimeStart(Long searchTimeStart) {
        this.searchTimeStart = searchTimeStart;
    }

    

    public WorkflowQueryParam withSearchTimeEnd(Long searchTimeEnd) {
        this.searchTimeEnd = searchTimeEnd;
        return this;
    }

    


    /**
     * 更新时间，时间范围查询的结束时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return searchTimeEnd
     */
    public Long getSearchTimeEnd() {
        return searchTimeEnd;
    }

    public void setSearchTimeEnd(Long searchTimeEnd) {
        this.searchTimeEnd = searchTimeEnd;
    }

    

    public WorkflowQueryParam withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务的状态 [\"success\",\"fail\",\"executing\",\"cancel\",\"waitExecute\",\"waitApproval\",\"approvalFailed\",\"pausing\",\"canceling\"]
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowQueryParam workflowQueryParam = (WorkflowQueryParam) o;
        return Objects.equals(this.search, workflowQueryParam.search) &&
            Objects.equals(this.type, workflowQueryParam.type) &&
            Objects.equals(this.tags, workflowQueryParam.tags) &&
            Objects.equals(this.page, workflowQueryParam.page) &&
            Objects.equals(this.size, workflowQueryParam.size) &&
            Objects.equals(this.enterpriseProjectId, workflowQueryParam.enterpriseProjectId) &&
            Objects.equals(this.createBy, workflowQueryParam.createBy) &&
            Objects.equals(this.sortField, workflowQueryParam.sortField) &&
            Objects.equals(this.sortType, workflowQueryParam.sortType) &&
            Objects.equals(this.searchTimeStart, workflowQueryParam.searchTimeStart) &&
            Objects.equals(this.searchTimeEnd, workflowQueryParam.searchTimeEnd) &&
            Objects.equals(this.status, workflowQueryParam.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(search, type, tags, page, size, enterpriseProjectId, createBy, sortField, sortType, searchTimeStart, searchTimeEnd, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowQueryParam {\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    searchTimeStart: ").append(toIndentedString(searchTimeStart)).append("\n");
        sb.append("    searchTimeEnd: ").append(toIndentedString(searchTimeEnd)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

