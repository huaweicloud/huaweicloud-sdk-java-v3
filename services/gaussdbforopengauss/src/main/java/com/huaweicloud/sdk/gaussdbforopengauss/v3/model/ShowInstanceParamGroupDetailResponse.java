package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowInstanceParamGroupDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

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
    @JsonProperty(value = "configuration_parameters")

    private List<ConfigurationParameterResult> configurationParameters = null;

    public ShowInstanceParamGroupDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 实例对应参数组ID。 **取值范围**: 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowInstanceParamGroupDetailResponse withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * **参数解释**: 引擎版本。 **取值范围**: 不涉及。
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public ShowInstanceParamGroupDetailResponse withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * **参数解释**: 引擎名称。 **取值范围**: 不涉及。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public ShowInstanceParamGroupDetailResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * **参数解释**: 创建时间，格式为\"yyyy-MM-dd HH:mm:ss\"。 **取值范围**: 不涉及。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowInstanceParamGroupDetailResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * **参数解释**: 更新时间，格式为\"yyyy-MM-dd HH:mm:ss\"。 **取值范围**: 不涉及。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowInstanceParamGroupDetailResponse withConfigurationParameters(
        List<ConfigurationParameterResult> configurationParameters) {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public ShowInstanceParamGroupDetailResponse addConfigurationParametersItem(
        ConfigurationParameterResult configurationParametersItem) {
        if (this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        this.configurationParameters.add(configurationParametersItem);
        return this;
    }

    public ShowInstanceParamGroupDetailResponse withConfigurationParameters(
        Consumer<List<ConfigurationParameterResult>> configurationParametersSetter) {
        if (this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        configurationParametersSetter.accept(this.configurationParameters);
        return this;
    }

    /**
     * **参数解释**: 参数对象，用户基于默认参数模板自定义的参数配置，具体请参考ConfigurationParameterResult。
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
        ShowInstanceParamGroupDetailResponse that = (ShowInstanceParamGroupDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.datastoreVersion, that.datastoreVersion)
            && Objects.equals(this.datastoreName, that.datastoreName) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.configurationParameters, that.configurationParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datastoreVersion, datastoreName, created, updated, configurationParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceParamGroupDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
