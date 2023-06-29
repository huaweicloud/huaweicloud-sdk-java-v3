package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取探针配置信息请求体
 */
public class ShowAgentConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private Integer appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    public ShowAgentConfigRequestBody withAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id
     * minimum: 1
     * maximum: 2147483647
     * @return appId
     */
    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public ShowAgentConfigRequestBody withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 探针的内网地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShowAgentConfigRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 探针的版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowAgentConfigRequestBody withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 探针id，非必填，不填是注册探针，填了是更新探针配置
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgentConfigRequestBody that = (ShowAgentConfigRequestBody) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.address, that.address)
            && Objects.equals(this.version, that.version) && Objects.equals(this.agentId, that.agentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, address, version, agentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgentConfigRequestBody {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
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
