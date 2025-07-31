package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListUsersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_permission")

    private Boolean loginPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_permission")

    private Boolean rootPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private String userGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_match")

    private Boolean partMatch;

    public ListUsersRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器ID **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListUsersRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 账号名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-32位 **默认取值**: 不涉及 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListUsersRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-256位 **默认取值**: 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListUsersRequest withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**: 服务器私有IP **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ListUsersRequest withLoginPermission(Boolean loginPermission) {
        this.loginPermission = loginPermission;
        return this;
    }

    /**
     * **参数解释**: 是否允许登录 **约束限制**: 不涉及 **取值范围**: - true：是 - false：否  **默认取值**: 不涉及 
     * @return loginPermission
     */
    public Boolean getLoginPermission() {
        return loginPermission;
    }

    public void setLoginPermission(Boolean loginPermission) {
        this.loginPermission = loginPermission;
    }

    public ListUsersRequest withRootPermission(Boolean rootPermission) {
        this.rootPermission = rootPermission;
        return this;
    }

    /**
     * **参数解释**: 是否有root权限 **约束限制**: 不涉及 **取值范围**: - true：是 - false：否  **默认取值**: 不涉及 
     * @return rootPermission
     */
    public Boolean getRootPermission() {
        return rootPermission;
    }

    public void setRootPermission(Boolean rootPermission) {
        this.rootPermission = rootPermission;
    }

    public ListUsersRequest withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * **参数解释**: 是否是主机用户组 **约束限制**: 不涉及 **取值范围**: - true：是 - false：否  **默认取值**: 不涉及 
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public ListUsersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListUsersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListUsersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListUsersRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 类别 **约束限制**: 不涉及 **取值范围**: - host：主机 - container：容器  **默认取值**: 不涉及 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListUsersRequest withPartMatch(Boolean partMatch) {
        this.partMatch = partMatch;
        return this;
    }

    /**
     * **参数解释**: 是否模糊匹配 **约束限制**: 不涉及 **取值范围**: - true：是 - false：否  **默认取值**: 不涉及 
     * @return partMatch
     */
    public Boolean getPartMatch() {
        return partMatch;
    }

    public void setPartMatch(Boolean partMatch) {
        this.partMatch = partMatch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUsersRequest that = (ListUsersRequest) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.loginPermission, that.loginPermission)
            && Objects.equals(this.rootPermission, that.rootPermission)
            && Objects.equals(this.userGroup, that.userGroup)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.category, that.category) && Objects.equals(this.partMatch, that.partMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            userName,
            hostName,
            privateIp,
            loginPermission,
            rootPermission,
            userGroup,
            enterpriseProjectId,
            limit,
            offset,
            category,
            partMatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersRequest {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    loginPermission: ").append(toIndentedString(loginPermission)).append("\n");
        sb.append("    rootPermission: ").append(toIndentedString(rootPermission)).append("\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    partMatch: ").append(toIndentedString(partMatch)).append("\n");
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
