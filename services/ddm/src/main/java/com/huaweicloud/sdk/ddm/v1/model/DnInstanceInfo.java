package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DnInstanceInfo
 */
public class DnInstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_host")

    private String accessHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_port")

    private Integer accessPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    public DnInstanceInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DnInstanceInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public DnInstanceInfo withAccessHost(String accessHost) {
        this.accessHost = accessHost;
        return this;
    }

    /**
     * ip。
     * @return accessHost
     */
    public String getAccessHost() {
        return accessHost;
    }

    public void setAccessHost(String accessHost) {
        this.accessHost = accessHost;
    }

    public DnInstanceInfo withAccessPort(Integer accessPort) {
        this.accessPort = accessPort;
        return this;
    }

    /**
     * 端口。
     * minimum: 1
     * maximum: 2147483647
     * @return accessPort
     */
    public Integer getAccessPort() {
        return accessPort;
    }

    public void setAccessPort(Integer accessPort) {
        this.accessPort = accessPort;
    }

    public DnInstanceInfo withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public DnInstanceInfo withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DnInstanceInfo that = (DnInstanceInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.accessHost, that.accessHost) && Objects.equals(this.accessPort, that.accessPort)
            && Objects.equals(this.engine, that.engine) && Objects.equals(this.engineVersion, that.engineVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, accessHost, accessPort, engine, engineVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnInstanceInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    accessHost: ").append(toIndentedString(accessHost)).append("\n");
        sb.append("    accessPort: ").append(toIndentedString(accessPort)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
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
