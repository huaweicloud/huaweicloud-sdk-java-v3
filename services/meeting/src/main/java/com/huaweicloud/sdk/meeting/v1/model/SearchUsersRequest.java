package com.huaweicloud.sdk.meeting.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SearchUsersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    
    private String xRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="searchKey")
    
    private String searchKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sortField")
    
    private String sortField;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isAsc")
    
    private Boolean isAsc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptCode")
    
    private String deptCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableSubDept")
    
    private Boolean enableSubDept;
    /**
     * Gets or Sets adminType
     */
    public static final class AdminTypeEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AdminTypeEnum NUMBER_1 = new AdminTypeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final AdminTypeEnum NUMBER_2 = new AdminTypeEnum(2);
        

        private static final Map<Integer, AdminTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AdminTypeEnum> createStaticFields() {
            Map<Integer, AdminTypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AdminTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AdminTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            AdminTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AdminTypeEnum(value);
            }
            return result;
        }

        public static AdminTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            AdminTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AdminTypeEnum) {
                return this.value.equals(((AdminTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminType")
    
    private AdminTypeEnum adminType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableRoom")
    
    private Boolean enableRoom;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userType")
    
    private List<Integer> userType = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public SearchUsersRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    

    public SearchUsersRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    


    /**
     * Get acceptLanguage
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    

    public SearchUsersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public SearchUsersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public SearchUsersRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    


    /**
     * Get searchKey
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    

    public SearchUsersRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    


    /**
     * Get sortField
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    

    public SearchUsersRequest withIsAsc(Boolean isAsc) {
        this.isAsc = isAsc;
        return this;
    }

    


    /**
     * Get isAsc
     * @return isAsc
     */
    public Boolean getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(Boolean isAsc) {
        this.isAsc = isAsc;
    }

    

    public SearchUsersRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    


    /**
     * Get deptCode
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    

    public SearchUsersRequest withEnableSubDept(Boolean enableSubDept) {
        this.enableSubDept = enableSubDept;
        return this;
    }

    


    /**
     * Get enableSubDept
     * @return enableSubDept
     */
    public Boolean getEnableSubDept() {
        return enableSubDept;
    }

    public void setEnableSubDept(Boolean enableSubDept) {
        this.enableSubDept = enableSubDept;
    }

    

    public SearchUsersRequest withAdminType(AdminTypeEnum adminType) {
        this.adminType = adminType;
        return this;
    }

    


    /**
     * Get adminType
     * @return adminType
     */
    public AdminTypeEnum getAdminType() {
        return adminType;
    }

    public void setAdminType(AdminTypeEnum adminType) {
        this.adminType = adminType;
    }

    

    public SearchUsersRequest withEnableRoom(Boolean enableRoom) {
        this.enableRoom = enableRoom;
        return this;
    }

    


    /**
     * Get enableRoom
     * @return enableRoom
     */
    public Boolean getEnableRoom() {
        return enableRoom;
    }

    public void setEnableRoom(Boolean enableRoom) {
        this.enableRoom = enableRoom;
    }

    

    public SearchUsersRequest withUserType(List<Integer> userType) {
        this.userType = userType;
        return this;
    }

    
    public SearchUsersRequest addUserTypeItem(Integer userTypeItem) {
        this.userType.add(userTypeItem);
        return this;
    }

    public SearchUsersRequest withUserType(Consumer<List<Integer>> userTypeSetter) {
        if(this.userType == null ){
            this.userType = new ArrayList<>();
        }
        userTypeSetter.accept(this.userType);
        return this;
    }

    /**
     * Get userType
     * @return userType
     */
    public List<Integer> getUserType() {
        return userType;
    }

    public void setUserType(List<Integer> userType) {
        this.userType = userType;
    }

    

    public SearchUsersRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
        SearchUsersRequest searchUsersRequest = (SearchUsersRequest) o;
        return Objects.equals(this.xRequestId, searchUsersRequest.xRequestId) &&
            Objects.equals(this.acceptLanguage, searchUsersRequest.acceptLanguage) &&
            Objects.equals(this.offset, searchUsersRequest.offset) &&
            Objects.equals(this.limit, searchUsersRequest.limit) &&
            Objects.equals(this.searchKey, searchUsersRequest.searchKey) &&
            Objects.equals(this.sortField, searchUsersRequest.sortField) &&
            Objects.equals(this.isAsc, searchUsersRequest.isAsc) &&
            Objects.equals(this.deptCode, searchUsersRequest.deptCode) &&
            Objects.equals(this.enableSubDept, searchUsersRequest.enableSubDept) &&
            Objects.equals(this.adminType, searchUsersRequest.adminType) &&
            Objects.equals(this.enableRoom, searchUsersRequest.enableRoom) &&
            Objects.equals(this.userType, searchUsersRequest.userType) &&
            Objects.equals(this.status, searchUsersRequest.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, offset, limit, searchKey, sortField, isAsc, deptCode, enableSubDept, adminType, enableRoom, userType, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchUsersRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    isAsc: ").append(toIndentedString(isAsc)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    enableSubDept: ").append(toIndentedString(enableSubDept)).append("\n");
        sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
        sb.append("    enableRoom: ").append(toIndentedString(enableRoom)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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

