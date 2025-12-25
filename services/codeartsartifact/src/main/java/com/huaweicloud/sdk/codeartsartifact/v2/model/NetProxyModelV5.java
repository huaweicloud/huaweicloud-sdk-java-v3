package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetProxyModelV5
 */
public class NetProxyModelV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user_id")

    private String createdUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user_name")

    private String createdUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_user_id")

    private String modifiedUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_user_name")

    private String modifiedUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Integer isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public NetProxyModelV5 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 仓库状态。 **取值范围**: active：正常。 delete：删除。 disabled：无效。 view：私有库浏览者。 trash：废弃。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NetProxyModelV5 withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**: 租户id。 **取值范围**: 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public NetProxyModelV5 withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**: 区域。 **取值范围**: 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public NetProxyModelV5 withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**: 不涉及。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public NetProxyModelV5 withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * **参数解释**: 修改时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**: 不涉及。
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public NetProxyModelV5 withCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    /**
     * **参数解释**: 创建人id。 **取值范围**: 不涉及。
     * @return createdUserId
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public NetProxyModelV5 withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    /**
     * **参数解释**: 创建人。 **取值范围**: 不涉及。
     * @return createdUserName
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public NetProxyModelV5 withModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
        return this;
    }

    /**
     * **参数解释**: 修改人id。 **取值范围**: 不涉及。
     * @return modifiedUserId
     */
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public NetProxyModelV5 withModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
        return this;
    }

    /**
     * **参数解释**: 修改人。 **取值范围**: 不涉及。
     * @return modifiedUserName
     */
    public String getModifiedUserName() {
        return modifiedUserName;
    }

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
    }

    public NetProxyModelV5 withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: id。 **取值范围**: 不涉及。 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NetProxyModelV5 withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 代理名称。 **取值范围**: 不涉及。 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public NetProxyModelV5 withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释**: 域名。 **取值范围**: 不涉及。 
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public NetProxyModelV5 withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: 端口。 **取值范围**: 不涉及。 
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public NetProxyModelV5 withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名。 **取值范围**: 不涉及。 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public NetProxyModelV5 withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释**: 密码。 **取值范围**: 不涉及。 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public NetProxyModelV5 withIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * **参数解释**: 是否默认。 **取值范围**: 不涉及。 
     * @return isDefault
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public NetProxyModelV5 withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * **参数解释**: 备注。 **取值范围**: 不涉及。 
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetProxyModelV5 that = (NetProxyModelV5) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.region, that.region) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime)
            && Objects.equals(this.createdUserId, that.createdUserId)
            && Objects.equals(this.createdUserName, that.createdUserName)
            && Objects.equals(this.modifiedUserId, that.modifiedUserId)
            && Objects.equals(this.modifiedUserName, that.modifiedUserName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.host, that.host)
            && Objects.equals(this.port, that.port) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.password, that.password) && Objects.equals(this.isDefault, that.isDefault)
            && Objects.equals(this.remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            domainId,
            region,
            createdTime,
            modifiedTime,
            createdUserId,
            createdUserName,
            modifiedUserId,
            modifiedUserName,
            id,
            hostName,
            host,
            port,
            userName,
            password,
            isDefault,
            remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetProxyModelV5 {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    createdUserId: ").append(toIndentedString(createdUserId)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    modifiedUserId: ").append(toIndentedString(modifiedUserId)).append("\n");
        sb.append("    modifiedUserName: ").append(toIndentedString(modifiedUserName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
