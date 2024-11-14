package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建据连接结构体信息
 */
public class ApigDataSourceVo {

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
    @JsonProperty(value = "supportService")

    private Integer supportService;

    public ApigDataSourceVo withDwName(String dwName) {
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

    public ApigDataSourceVo withDwType(String dwType) {
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

    public ApigDataSourceVo withDwConfig(Object dwConfig) {
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

    public ApigDataSourceVo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 代理id（若使用代理连接则必填）
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ApigDataSourceVo withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * 代理名称id（若使用代理连接则必填）
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public ApigDataSourceVo withEnvType(Integer envType) {
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

    public ApigDataSourceVo withSupportService(Integer supportService) {
        this.supportService = supportService;
        return this;
    }

    /**
     * 1：cdm 2：数据架构 4:数据开发 8：数据质量 16：数据目录 32：数据安全 64：数据服务
     * minimum: 1
     * maximum: 127
     * @return supportService
     */
    public Integer getSupportService() {
        return supportService;
    }

    public void setSupportService(Integer supportService) {
        this.supportService = supportService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApigDataSourceVo that = (ApigDataSourceVo) obj;
        return Objects.equals(this.dwName, that.dwName) && Objects.equals(this.dwType, that.dwType)
            && Objects.equals(this.dwConfig, that.dwConfig) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.agentName, that.agentName) && Objects.equals(this.envType, that.envType)
            && Objects.equals(this.supportService, that.supportService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwName, dwType, dwConfig, agentId, agentName, envType, supportService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigDataSourceVo {\n");
        sb.append("    dwName: ").append(toIndentedString(dwName)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    dwConfig: ").append(toIndentedString(dwConfig)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    supportService: ").append(toIndentedString(supportService)).append("\n");
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
