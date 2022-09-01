package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version_name")

    @JacksonXmlProperty(localName = "datastore_version_name")

    private String datastoreVersionName;

    /**
     * 引擎名。
     */
    public static final class DatastoreNameEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final DatastoreNameEnum MYSQL = new DatastoreNameEnum("mysql");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final DatastoreNameEnum POSTGRESQL = new DatastoreNameEnum("postgresql");

        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final DatastoreNameEnum SQLSERVER = new DatastoreNameEnum("sqlserver");

        private static final Map<String, DatastoreNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreNameEnum> createStaticFields() {
            Map<String, DatastoreNameEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("postgresql", POSTGRESQL);
            map.put("sqlserver", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatastoreNameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DatastoreNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DatastoreNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DatastoreNameEnum(value);
            }
            return result;
        }

        public static DatastoreNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DatastoreNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatastoreNameEnum) {
                return this.value.equals(((DatastoreNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_name")

    @JacksonXmlProperty(localName = "datastore_name")

    private DatastoreNameEnum datastoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    @JacksonXmlProperty(localName = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    @JacksonXmlProperty(localName = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_parameters")

    @JacksonXmlProperty(localName = "configuration_parameters")

    private List<ConfigurationParameter> configurationParameters = null;

    public ShowInstanceConfigurationResponse withDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
        return this;
    }

    /**
     * 引擎版本。
     * @return datastoreVersionName
     */
    public String getDatastoreVersionName() {
        return datastoreVersionName;
    }

    public void setDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
    }

    public ShowInstanceConfigurationResponse withDatastoreName(DatastoreNameEnum datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * 引擎名。
     * @return datastoreName
     */
    public DatastoreNameEnum getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(DatastoreNameEnum datastoreName) {
        this.datastoreName = datastoreName;
    }

    public ShowInstanceConfigurationResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。  其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
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
     * 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。  其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowInstanceConfigurationResponse withConfigurationParameters(
        List<ConfigurationParameter> configurationParameters) {
        this.configurationParameters = configurationParameters;
        return this;
    }

    public ShowInstanceConfigurationResponse addConfigurationParametersItem(
        ConfigurationParameter configurationParametersItem) {
        if (this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        this.configurationParameters.add(configurationParametersItem);
        return this;
    }

    public ShowInstanceConfigurationResponse withConfigurationParameters(
        Consumer<List<ConfigurationParameter>> configurationParametersSetter) {
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
    public List<ConfigurationParameter> getConfigurationParameters() {
        return configurationParameters;
    }

    public void setConfigurationParameters(List<ConfigurationParameter> configurationParameters) {
        this.configurationParameters = configurationParameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceConfigurationResponse showInstanceConfigurationResponse = (ShowInstanceConfigurationResponse) o;
        return Objects.equals(this.datastoreVersionName, showInstanceConfigurationResponse.datastoreVersionName)
            && Objects.equals(this.datastoreName, showInstanceConfigurationResponse.datastoreName)
            && Objects.equals(this.created, showInstanceConfigurationResponse.created)
            && Objects.equals(this.updated, showInstanceConfigurationResponse.updated)
            && Objects.equals(this.configurationParameters, showInstanceConfigurationResponse.configurationParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreVersionName, datastoreName, created, updated, configurationParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceConfigurationResponse {\n");
        sb.append("    datastoreVersionName: ").append(toIndentedString(datastoreVersionName)).append("\n");
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
