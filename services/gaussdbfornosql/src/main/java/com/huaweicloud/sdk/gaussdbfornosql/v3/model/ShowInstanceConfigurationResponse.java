package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version_name")

    private String datastoreVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_name")

    private String datastoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_parameters")

    private List<ConfigurationParameterResult> configurationParameters = null;

    public ShowInstanceConfigurationResponse withDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
        return this;
    }

    /**
     * 数据库版本名称。
     * @return datastoreVersionName
     */
    public String getDatastoreVersionName() {
        return datastoreVersionName;
    }

    public void setDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
    }

    public ShowInstanceConfigurationResponse withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * 数据库名称。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public ShowInstanceConfigurationResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowInstanceConfigurationResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowInstanceConfigurationResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数模板ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowInstanceConfigurationResponse withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 数据库实例类型。 GeminiDB Cassandra集群类型为\"Cluster\"。 GeminiDB Mongo副本集类型为\"ReplicaSet\"。 GeminiDB Mongo集群类型为\"Sharding\"。 GeminiDB Influx集群类型为\"Cluster\"。 GeminiDB Influx单节点类型为\"InfluxdbSingle\"。 GeminiDB Redis集群类型为“Cluster”。 GeminiDB Redis主备类型为“Replication”。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ShowInstanceConfigurationResponse withConfigurationParameters(
        List<ConfigurationParameterResult> configurationParameters) {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public ShowInstanceConfigurationResponse addConfigurationParametersItem(
        ConfigurationParameterResult configurationParametersItem) {
        if (this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        this.configurationParameters.add(configurationParametersItem);
        return this;
    }

    public ShowInstanceConfigurationResponse withConfigurationParameters(
        Consumer<List<ConfigurationParameterResult>> configurationParametersSetter) {
        if (this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        configurationParametersSetter.accept(this.configurationParameters);
        return this;
    }

    /**
     * 参数对象，用户基于默认参数模板自定义的参数配置。
     * @return configurationParameters
     */
    public List<ConfigurationParameterResult> getConfigurationParameters() {
        return configurationParameters;
    }

    public void setConfigurationParameters(List<ConfigurationParameterResult> configurationParameters) {
        this.configurationParameters = configurationParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceConfigurationResponse that = (ShowInstanceConfigurationResponse) obj;
        return Objects.equals(this.datastoreVersionName, that.datastoreVersionName)
            && Objects.equals(this.datastoreName, that.datastoreName) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.id, that.id)
            && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.configurationParameters, that.configurationParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreVersionName, datastoreName, created, updated, id, mode, configurationParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceConfigurationResponse {\n");
        sb.append("    datastoreVersionName: ").append(toIndentedString(datastoreVersionName)).append("\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    configurationParameters: ").append(toIndentedString(configurationParameters)).append("\n");
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
