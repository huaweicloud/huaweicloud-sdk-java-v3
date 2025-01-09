package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTenantProfileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_domain_id")

    private String tenantDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_status")

    private String serviceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_with_ad")

    private Boolean openWithAd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_domain_name")

    private String tenantDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public ListTenantProfileResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户ID 同tenant_id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListTenantProfileResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 租户名称。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ListTenantProfileResponse withTenantDomainId(String tenantDomainId) {
        this.tenantDomainId = tenantDomainId;
        return this;
    }

    /**
     * 租户的域ID。
     * @return tenantDomainId
     */
    public String getTenantDomainId() {
        return tenantDomainId;
    }

    public void setTenantDomainId(String tenantDomainId) {
        this.tenantDomainId = tenantDomainId;
    }

    public ListTenantProfileResponse withServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    /**
     * 服务状态 * `active` - 激活 * `inactive` - 未激活
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public ListTenantProfileResponse withOpenWithAd(Boolean openWithAd) {
        this.openWithAd = openWithAd;
        return this;
    }

    /**
     * 是否对接AD。 有AD的情况下，提示租户单会话模式和多会话模式都支持; 在没有AD的情况下，提示租户仅支持VDI单会话模式。
     * @return openWithAd
     */
    public Boolean getOpenWithAd() {
        return openWithAd;
    }

    public void setOpenWithAd(Boolean openWithAd) {
        this.openWithAd = openWithAd;
    }

    public ListTenantProfileResponse withTenantDomainName(String tenantDomainName) {
        this.tenantDomainName = tenantDomainName;
        return this;
    }

    /**
     * 租户的域名称。
     * @return tenantDomainName
     */
    public String getTenantDomainName() {
        return tenantDomainName;
    }

    public void setTenantDomainName(String tenantDomainName) {
        this.tenantDomainName = tenantDomainName;
    }

    public ListTenantProfileResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 租户信息创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantProfileResponse that = (ListTenantProfileResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.tenantDomainId, that.tenantDomainId)
            && Objects.equals(this.serviceStatus, that.serviceStatus)
            && Objects.equals(this.openWithAd, that.openWithAd)
            && Objects.equals(this.tenantDomainName, that.tenantDomainName)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(projectId, projectName, tenantDomainId, serviceStatus, openWithAd, tenantDomainName, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantProfileResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    tenantDomainId: ").append(toIndentedString(tenantDomainId)).append("\n");
        sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
        sb.append("    openWithAd: ").append(toIndentedString(openWithAd)).append("\n");
        sb.append("    tenantDomainName: ").append(toIndentedString(tenantDomainName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
