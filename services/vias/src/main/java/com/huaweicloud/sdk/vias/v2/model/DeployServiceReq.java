package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeployServiceReq
 */
public class DeployServiceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_count")

    private Integer streamCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_config")

    private Object deployConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private Object envs;

    public DeployServiceReq withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 资源池ID，服务状态为未部署时必填
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public DeployServiceReq withStreamCount(Integer streamCount) {
        this.streamCount = streamCount;
        return this;
    }

    /**
     * 视频流路数
     * minimum: 1
     * maximum: 10000
     * @return streamCount
     */
    public Integer getStreamCount() {
        return streamCount;
    }

    public void setStreamCount(Integer streamCount) {
        this.streamCount = streamCount;
    }

    public DeployServiceReq withDeployConfig(Object deployConfig) {
        this.deployConfig = deployConfig;
        return this;
    }

    /**
     * 服务启动参数，须按照模型的部署约束填写。类型为“Map<String, Object>”，可选填，默认为空。为确保您的数据安全，在环境变量中，请勿输入敏感信息，如明文密码
     * @return deployConfig
     */
    public Object getDeployConfig() {
        return deployConfig;
    }

    public void setDeployConfig(Object deployConfig) {
        this.deployConfig = deployConfig;
    }

    public DeployServiceReq withEnvs(Object envs) {
        this.envs = envs;
        return this;
    }

    /**
     * 运行服务需要的环境变量键值对。类型为“Map<String, String>”，可选填，默认为空。为确保您的数据安全，在环境变量中，请勿输入敏感信息，如明文密码
     * @return envs
     */
    public Object getEnvs() {
        return envs;
    }

    public void setEnvs(Object envs) {
        this.envs = envs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployServiceReq that = (DeployServiceReq) obj;
        return Objects.equals(this.poolId, that.poolId) && Objects.equals(this.streamCount, that.streamCount)
            && Objects.equals(this.deployConfig, that.deployConfig) && Objects.equals(this.envs, that.envs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, streamCount, deployConfig, envs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployServiceReq {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    streamCount: ").append(toIndentedString(streamCount)).append("\n");
        sb.append("    deployConfig: ").append(toIndentedString(deployConfig)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
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
