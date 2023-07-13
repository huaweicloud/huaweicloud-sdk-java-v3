package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDataconnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_name")

    private String dwName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_config")

    private Object dwConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_type")

    private Integer envType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_name")

    private String qualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private BigDecimal createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_catagory")

    private String dwCatagory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_type")

    private Integer updateType;

    public ShowDataconnectionResponse withDwName(String dwName) {
        this.dwName = dwName;
        return this;
    }

    /**
     * 数据连接名称
     * @return dwName
     */
    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public ShowDataconnectionResponse withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public ShowDataconnectionResponse withDwConfig(Object dwConfig) {
        this.dwConfig = dwConfig;
        return this;
    }

    /**
     * 连接动态变化配置项，每种连接略有区别，建议在界面进行调试
     * @return dwConfig
     */
    public Object getDwConfig() {
        return dwConfig;
    }

    public void setDwConfig(Object dwConfig) {
        this.dwConfig = dwConfig;
    }

    public ShowDataconnectionResponse withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 代理id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ShowDataconnectionResponse withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * 代理名称
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public ShowDataconnectionResponse withEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }

    /**
     * 0：开发模式 1：生产模式。默认为0
     * minimum: 0
     * maximum: 1
     * @return envType
     */
    public Integer getEnvType() {
        return envType;
    }

    public void setEnvType(Integer envType) {
        this.envType = envType;
    }

    public ShowDataconnectionResponse withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * 数据连接限定名称
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public ShowDataconnectionResponse withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接id
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public ShowDataconnectionResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 数据连接创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowDataconnectionResponse withCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 数据连接创建时间，时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    public ShowDataconnectionResponse withDwCatagory(String dwCatagory) {
        this.dwCatagory = dwCatagory;
        return this;
    }

    /**
     * 数据连接类别
     * @return dwCatagory
     */
    public String getDwCatagory() {
        return dwCatagory;
    }

    public void setDwCatagory(String dwCatagory) {
        this.dwCatagory = dwCatagory;
    }

    public ShowDataconnectionResponse withUpdateType(Integer updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * 0：创建 1：更新。默认为0
     * minimum: 0
     * maximum: 1
     * @return updateType
     */
    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataconnectionResponse that = (ShowDataconnectionResponse) obj;
        return Objects.equals(this.dwName, that.dwName) && Objects.equals(this.dwType, that.dwType)
            && Objects.equals(this.dwConfig, that.dwConfig) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.agentName, that.agentName) && Objects.equals(this.envType, that.envType)
            && Objects.equals(this.qualifiedName, that.qualifiedName) && Objects.equals(this.dwId, that.dwId)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.dwCatagory, that.dwCatagory) && Objects.equals(this.updateType, that.updateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwName,
            dwType,
            dwConfig,
            agentId,
            agentName,
            envType,
            qualifiedName,
            dwId,
            createUser,
            createTime,
            dwCatagory,
            updateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataconnectionResponse {\n");
        sb.append("    dwName: ").append(toIndentedString(dwName)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    dwConfig: ").append(toIndentedString(dwConfig)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dwCatagory: ").append(toIndentedString(dwCatagory)).append("\n");
        sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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
