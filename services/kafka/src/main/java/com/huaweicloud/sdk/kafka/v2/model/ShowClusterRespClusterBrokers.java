package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 节点。
 */
public class ShowClusterRespClusterBrokers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_id")

    private String brokerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_controller")

    private Boolean isController;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_time")

    private Long registerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_health")

    private Boolean isHealth;

    public ShowClusterRespClusterBrokers withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释**： 节点IP。 **取值范围**： 不涉及。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ShowClusterRespClusterBrokers withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 端口号。 **取值范围**： 不涉及。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ShowClusterRespClusterBrokers withBrokerId(String brokerId) {
        this.brokerId = brokerId;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **取值范围**： 不涉及。
     * @return brokerId
     */
    public String getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public ShowClusterRespClusterBrokers withIsController(Boolean isController) {
        this.isController = isController;
        return this;
    }

    /**
     * **参数解释**： 是否为controller节点。 **取值范围**： - true：是controller节点。 - false：不是controller节点。
     * @return isController
     */
    public Boolean getIsController() {
        return isController;
    }

    public void setIsController(Boolean isController) {
        this.isController = isController;
    }

    public ShowClusterRespClusterBrokers withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 服务端版本。 **取值范围**： [- 1.1.0](tag:hws,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,sbc,hk_sbc,cmcc,ax,srg) [- 2.3.0](tag:g42,tm,hk_g42,ctc,hk_tm,dt,cmcc,ocb,hws_ocb) - 2.7 [- 3.x](tag:hws,hws_hk,dt,sbc,hk_sbc,hcs,fcs,ctc,tm,hk_tm,hws_eu,ax,cmcc,srg)
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowClusterRespClusterBrokers withRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /**
     * **参数解释**： broker注册时间，为unix时间戳格式。 **取值范围**： 不涉及。
     * @return registerTime
     */
    public Long getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
    }

    public ShowClusterRespClusterBrokers withIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
        return this;
    }

    /**
     * **参数解释**： Kafka实例节点的连通性是否正常。 **取值范围**： - true：正常。 - false：不正常。
     * @return isHealth
     */
    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterRespClusterBrokers that = (ShowClusterRespClusterBrokers) obj;
        return Objects.equals(this.host, that.host) && Objects.equals(this.port, that.port)
            && Objects.equals(this.brokerId, that.brokerId) && Objects.equals(this.isController, that.isController)
            && Objects.equals(this.version, that.version) && Objects.equals(this.registerTime, that.registerTime)
            && Objects.equals(this.isHealth, that.isHealth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, port, brokerId, isController, version, registerTime, isHealth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterRespClusterBrokers {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
        sb.append("    isController: ").append(toIndentedString(isController)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    isHealth: ").append(toIndentedString(isHealth)).append("\n");
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
