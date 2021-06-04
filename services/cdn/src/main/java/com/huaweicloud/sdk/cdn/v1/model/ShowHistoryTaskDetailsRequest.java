package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowHistoryTaskDetailsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="history_tasks_id")
    
    private String historyTasksId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    private Integer pageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_number")
    
    private Integer pageNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private Integer url;

    public ShowHistoryTaskDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 当用户开启企业项目功能时，该参数生效，表示资源所属企业项目，不传表示默认项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ShowHistoryTaskDetailsRequest withHistoryTasksId(String historyTasksId) {
        this.historyTasksId = historyTasksId;
        return this;
    }

    


    /**
     * 刷新任务ID。
     * @return historyTasksId
     */
    public String getHistoryTasksId() {
        return historyTasksId;
    }

    public void setHistoryTasksId(String historyTasksId) {
        this.historyTasksId = historyTasksId;
    }

    

    public ShowHistoryTaskDetailsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 刷新预热的urls所显示单页最大数量，取值范围为1-10000。
     * minimum: 1
     * maximum: 10000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    

    public ShowHistoryTaskDetailsRequest withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    


    /**
     * 刷新预热的urls当前查询为第几页，取值范围为1-65535。
     * minimum: 1
     * maximum: 65535
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    

    public ShowHistoryTaskDetailsRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * url的状态 processing， succeed， failed，分别表示处理中，完成，失败。
     * minimum: 1
     * maximum: 65535
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ShowHistoryTaskDetailsRequest withUrl(Integer url) {
        this.url = url;
        return this;
    }

    


    /**
     * url的地址，支持同一任务id的多个url,多个url用分号隔开。
     * @return url
     */
    public Integer getUrl() {
        return url;
    }

    public void setUrl(Integer url) {
        this.url = url;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHistoryTaskDetailsRequest showHistoryTaskDetailsRequest = (ShowHistoryTaskDetailsRequest) o;
        return Objects.equals(this.enterpriseProjectId, showHistoryTaskDetailsRequest.enterpriseProjectId) &&
            Objects.equals(this.historyTasksId, showHistoryTaskDetailsRequest.historyTasksId) &&
            Objects.equals(this.pageSize, showHistoryTaskDetailsRequest.pageSize) &&
            Objects.equals(this.pageNumber, showHistoryTaskDetailsRequest.pageNumber) &&
            Objects.equals(this.status, showHistoryTaskDetailsRequest.status) &&
            Objects.equals(this.url, showHistoryTaskDetailsRequest.url);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, historyTasksId, pageSize, pageNumber, status, url);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoryTaskDetailsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    historyTasksId: ").append(toIndentedString(historyTasksId)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

