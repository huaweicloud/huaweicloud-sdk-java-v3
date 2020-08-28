package com.huaweicloud.sdk.codehub.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class GetProductTemplatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_uuid")
    
    private String projectUuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_no")
    
    private String pageNo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    private String pageSize;

    public GetProductTemplatesRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    


    /**
     * Get projectUuid
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public GetProductTemplatesRequest withPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    


    /**
     * Get pageNo
     * @return pageNo
     */
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public GetProductTemplatesRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * Get pageSize
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetProductTemplatesRequest getProductTemplatesRequest = (GetProductTemplatesRequest) o;
        return Objects.equals(this.projectUuid, getProductTemplatesRequest.projectUuid) &&
            Objects.equals(this.pageNo, getProductTemplatesRequest.pageNo) &&
            Objects.equals(this.pageSize, getProductTemplatesRequest.pageSize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectUuid, pageNo, pageSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProductTemplatesRequest {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

