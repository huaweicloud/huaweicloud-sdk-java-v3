package com.huaweicloud.sdk.ddm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.GetUsersListDetailResponses;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListUsersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private List<GetUsersListDetailResponses> users = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_no")
    
    private Integer pageNo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    private Integer pageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_record")
    
    private Integer totalRecord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_page")
    
    private Integer totalPage;

    public ListUsersResponse withUsers(List<GetUsersListDetailResponses> users) {
        this.users = users;
        return this;
    }

    
    public ListUsersResponse addUsersItem(GetUsersListDetailResponses usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ListUsersResponse withUsers(Consumer<List<GetUsersListDetailResponses>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * DDM实例帐号相关信息的集合。
     * @return users
     */
    public List<GetUsersListDetailResponses> getUsers() {
        return users;
    }

    public void setUsers(List<GetUsersListDetailResponses> users) {
        this.users = users;
    }

    

    public ListUsersResponse withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    


    /**
     * 当前页码
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    

    public ListUsersResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 当前页码的数据条数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    

    public ListUsersResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    


    /**
     * 总条数
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    

    public ListUsersResponse withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    


    /**
     * 总页数
     * @return totalPage
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUsersResponse listUsersResponse = (ListUsersResponse) o;
        return Objects.equals(this.users, listUsersResponse.users) &&
            Objects.equals(this.pageNo, listUsersResponse.pageNo) &&
            Objects.equals(this.pageSize, listUsersResponse.pageSize) &&
            Objects.equals(this.totalRecord, listUsersResponse.totalRecord) &&
            Objects.equals(this.totalPage, listUsersResponse.totalPage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users, pageNo, pageSize, totalRecord, totalPage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersResponse {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
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

