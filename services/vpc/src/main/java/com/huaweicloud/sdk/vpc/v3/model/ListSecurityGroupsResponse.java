package com.huaweicloud.sdk.vpc.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v3.model.SecurityGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSecurityGroupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group")
    
    private List<SecurityGroup> securityGroup = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    private String pageInfo;

    public ListSecurityGroupsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListSecurityGroupsResponse withSecurityGroup(List<SecurityGroup> securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    
    public ListSecurityGroupsResponse addSecurityGroupItem(SecurityGroup securityGroupItem) {
        if (this.securityGroup == null) {
            this.securityGroup = new ArrayList<>();
        }
        this.securityGroup.add(securityGroupItem);
        return this;
    }

    public ListSecurityGroupsResponse withSecurityGroup(Consumer<List<SecurityGroup>> securityGroupSetter) {
        if(this.securityGroup == null ){
            this.securityGroup = new ArrayList<>();
        }
        securityGroupSetter.accept(this.securityGroup);
        return this;
    }

    /**
     * 安全组列表响应体
     * @return securityGroup
     */
    public List<SecurityGroup> getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(List<SecurityGroup> securityGroup) {
        this.securityGroup = securityGroup;
    }

    public ListSecurityGroupsResponse withPageInfo(String pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    


    /**
     * 分页信息
     * @return pageInfo
     */
    public String getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(String pageInfo) {
        this.pageInfo = pageInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecurityGroupsResponse listSecurityGroupsResponse = (ListSecurityGroupsResponse) o;
        return Objects.equals(this.requestId, listSecurityGroupsResponse.requestId) &&
            Objects.equals(this.securityGroup, listSecurityGroupsResponse.securityGroup) &&
            Objects.equals(this.pageInfo, listSecurityGroupsResponse.pageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, securityGroup, pageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityGroupsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

