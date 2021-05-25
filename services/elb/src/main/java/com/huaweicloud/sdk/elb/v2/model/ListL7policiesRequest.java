package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListL7policiesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener_id")
    
    private String listenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redirect_pool_id")
    
    private String redirectPoolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redirect_listener_id")
    
    private String redirectListenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redirect_url")
    
    private String redirectUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="position")
    
    private Integer position;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_all_rules")
    
    private Boolean displayAllRules;

    public ListL7policiesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 分页查询中每页的转发策略个数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListL7policiesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 分页查询的起始的资源id，表示上一页最后一条查询记录的转发策略的id。不指定时表示查询第一页。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListL7policiesRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    


    /**
     * 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    

    public ListL7policiesRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 转发策略ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListL7policiesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 转发策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListL7policiesRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 转发策略的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ListL7policiesRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 转发策略的管理状态；取值范围： true/false。该字段为预留字段，暂未启用。默认为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    public ListL7policiesRequest withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    


    /**
     * 转发策略所在的监听器ID。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    

    public ListL7policiesRequest withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 转发策略的匹配动作。 取值范围：REDIRECT_TO_POOL：将匹配的流量转发到redirect_pool_id指定的后端云服务器组上；REDIRECT_TO_LISTENER：将listener_id指定的HTTP监听器的流量重定向到redirect_listener_id指定的TERMINATED_HTTPS监听器上。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public ListL7policiesRequest withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    


    /**
     * 流量匹配后转发到后端云服务器组的ID。
     * @return redirectPoolId
     */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    

    public ListL7policiesRequest withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    


    /**
     * 流量匹配后转发到的监听器的ID。
     * @return redirectListenerId
     */
    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    

    public ListL7policiesRequest withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    


    /**
     * 转发策略重定向到的url。该字段为预留字段，暂未启用。
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    

    public ListL7policiesRequest withPosition(Integer position) {
        this.position = position;
        return this;
    }

    


    /**
     * 转发优先级，从1递增，最高100。默认值：100；该字段为预留字段，暂未启用。
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    

    public ListL7policiesRequest withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * 转发策略的配置状态，可以为ACTIVE、PENDING_CREATE 或者ERROR。默认值：ACTIVE；该字段为预留字段，暂未启用。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    

    public ListL7policiesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。  取值范围：带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。  若子账号查询转发策略列表时，需要指定enterprise_project_id为all_granted_eps或者具体企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListL7policiesRequest withDisplayAllRules(Boolean displayAllRules) {
        this.displayAllRules = displayAllRules;
        return this;
    }

    


    /**
     * 是否显示所有的rule信息。取值范围：false表示不显示（跟以前一样只显示ID）；true表示显示。
     * @return displayAllRules
     */
    public Boolean getDisplayAllRules() {
        return displayAllRules;
    }

    public void setDisplayAllRules(Boolean displayAllRules) {
        this.displayAllRules = displayAllRules;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListL7policiesRequest listL7policiesRequest = (ListL7policiesRequest) o;
        return Objects.equals(this.limit, listL7policiesRequest.limit) &&
            Objects.equals(this.marker, listL7policiesRequest.marker) &&
            Objects.equals(this.pageReverse, listL7policiesRequest.pageReverse) &&
            Objects.equals(this.id, listL7policiesRequest.id) &&
            Objects.equals(this.name, listL7policiesRequest.name) &&
            Objects.equals(this.description, listL7policiesRequest.description) &&
            Objects.equals(this.adminStateUp, listL7policiesRequest.adminStateUp) &&
            Objects.equals(this.listenerId, listL7policiesRequest.listenerId) &&
            Objects.equals(this.action, listL7policiesRequest.action) &&
            Objects.equals(this.redirectPoolId, listL7policiesRequest.redirectPoolId) &&
            Objects.equals(this.redirectListenerId, listL7policiesRequest.redirectListenerId) &&
            Objects.equals(this.redirectUrl, listL7policiesRequest.redirectUrl) &&
            Objects.equals(this.position, listL7policiesRequest.position) &&
            Objects.equals(this.provisioningStatus, listL7policiesRequest.provisioningStatus) &&
            Objects.equals(this.enterpriseProjectId, listL7policiesRequest.enterpriseProjectId) &&
            Objects.equals(this.displayAllRules, listL7policiesRequest.displayAllRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, name, description, adminStateUp, listenerId, action, redirectPoolId, redirectListenerId, redirectUrl, position, provisioningStatus, enterpriseProjectId, displayAllRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListL7policiesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    displayAllRules: ").append(toIndentedString(displayAllRules)).append("\n");
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

