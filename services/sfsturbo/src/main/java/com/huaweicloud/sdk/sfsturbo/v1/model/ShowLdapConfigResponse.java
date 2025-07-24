package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowLdapConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_dn")

    private String baseDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_dn")

    private String userDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_condition")

    private String filterCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_url")

    private String backupUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_timeout")

    private Integer searchTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowLdapConfigResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * LDAP服务器的url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowLdapConfigResponse withBaseDn(String baseDn) {
        this.baseDn = baseDn;
        return this;
    }

    /**
     * 数据库中的域
     * @return baseDn
     */
    public String getBaseDn() {
        return baseDn;
    }

    public void setBaseDn(String baseDn) {
        this.baseDn = baseDn;
    }

    public ShowLdapConfigResponse withUserDn(String userDn) {
        this.userDn = userDn;
        return this;
    }

    /**
     * 用户区别名
     * @return userDn
     */
    public String getUserDn() {
        return userDn;
    }

    public void setUserDn(String userDn) {
        this.userDn = userDn;
    }

    public ShowLdapConfigResponse withFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }

    /**
     * 过滤条件。保留字段，暂不支持
     * @return filterCondition
     */
    public String getFilterCondition() {
        return filterCondition;
    }

    public void setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
    }

    public ShowLdapConfigResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 保留字段，暂不支持
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowLdapConfigResponse withBackupUrl(String backupUrl) {
        this.backupUrl = backupUrl;
        return this;
    }

    /**
     * LDAP备节点的url
     * @return backupUrl
     */
    public String getBackupUrl() {
        return backupUrl;
    }

    public void setBackupUrl(String backupUrl) {
        this.backupUrl = backupUrl;
    }

    public ShowLdapConfigResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * LDAP的schema，不填写则默认为RFC2307
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public ShowLdapConfigResponse withSearchTimeout(Integer searchTimeout) {
        this.searchTimeout = searchTimeout;
        return this;
    }

    /**
     * LDAP搜索的超时时间，单位为秒。不填写则默认为3秒
     * @return searchTimeout
     */
    public Integer getSearchTimeout() {
        return searchTimeout;
    }

    public void setSearchTimeout(Integer searchTimeout) {
        this.searchTimeout = searchTimeout;
    }

    public ShowLdapConfigResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLdapConfigResponse that = (ShowLdapConfigResponse) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.baseDn, that.baseDn)
            && Objects.equals(this.userDn, that.userDn) && Objects.equals(this.filterCondition, that.filterCondition)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.backupUrl, that.backupUrl)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.searchTimeout, that.searchTimeout)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, baseDn, userDn, filterCondition, vpcId, backupUrl, schema, searchTimeout, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLdapConfigResponse {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    baseDn: ").append(toIndentedString(baseDn)).append("\n");
        sb.append("    userDn: ").append(toIndentedString(userDn)).append("\n");
        sb.append("    filterCondition: ").append(toIndentedString(filterCondition)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    backupUrl: ").append(toIndentedString(backupUrl)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    searchTimeout: ").append(toIndentedString(searchTimeout)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
