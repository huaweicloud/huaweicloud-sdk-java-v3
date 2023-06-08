package com.huaweicloud.sdk.eds.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowConnectorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_name")

    private String connectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_description")

    private String connectorDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_url")

    private String connectorUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_description")

    private String resultDescription;

    /**
     * 连接器当前状态
     */
    public static final class ConnectorStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final ConnectorStatusEnum ACTIVE = new ConnectorStatusEnum("ACTIVE");

        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final ConnectorStatusEnum INACTIVE = new ConnectorStatusEnum("INACTIVE");

        private static final Map<String, ConnectorStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConnectorStatusEnum> createStaticFields() {
            Map<String, ConnectorStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("INACTIVE", INACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConnectorStatusEnum(String value) {
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
        public static ConnectorStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConnectorStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConnectorStatusEnum(value);
            }
            return result;
        }

        public static ConnectorStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConnectorStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConnectorStatusEnum) {
                return this.value.equals(((ConnectorStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_status")

    private ConnectorStatusEnum connectorStatus;

    public ShowConnectorResponse withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 连接器id
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public ShowConnectorResponse withConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }

    /**
     * 连接器名称
     * @return connectorName
     */
    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public ShowConnectorResponse withConnectorDescription(String connectorDescription) {
        this.connectorDescription = connectorDescription;
        return this;
    }

    /**
     * 连接器描述
     * @return connectorDescription
     */
    public String getConnectorDescription() {
        return connectorDescription;
    }

    public void setConnectorDescription(String connectorDescription) {
        this.connectorDescription = connectorDescription;
    }

    public ShowConnectorResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 连接器创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowConnectorResponse withConnectorUrl(String connectorUrl) {
        this.connectorUrl = connectorUrl;
        return this;
    }

    /**
     * 连接器访问地址
     * @return connectorUrl
     */
    public String getConnectorUrl() {
        return connectorUrl;
    }

    public void setConnectorUrl(String connectorUrl) {
        this.connectorUrl = connectorUrl;
    }

    public ShowConnectorResponse withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 连接器操作结果返回码
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public ShowConnectorResponse withResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
        return this;
    }

    /**
     * 连接器操作结果描述
     * @return resultDescription
     */
    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public ShowConnectorResponse withConnectorStatus(ConnectorStatusEnum connectorStatus) {
        this.connectorStatus = connectorStatus;
        return this;
    }

    /**
     * 连接器当前状态
     * @return connectorStatus
     */
    public ConnectorStatusEnum getConnectorStatus() {
        return connectorStatus;
    }

    public void setConnectorStatus(ConnectorStatusEnum connectorStatus) {
        this.connectorStatus = connectorStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowConnectorResponse showConnectorResponse = (ShowConnectorResponse) o;
        return Objects.equals(this.connectorId, showConnectorResponse.connectorId)
            && Objects.equals(this.connectorName, showConnectorResponse.connectorName)
            && Objects.equals(this.connectorDescription, showConnectorResponse.connectorDescription)
            && Objects.equals(this.createTime, showConnectorResponse.createTime)
            && Objects.equals(this.connectorUrl, showConnectorResponse.connectorUrl)
            && Objects.equals(this.resultCode, showConnectorResponse.resultCode)
            && Objects.equals(this.resultDescription, showConnectorResponse.resultDescription)
            && Objects.equals(this.connectorStatus, showConnectorResponse.connectorStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorId,
            connectorName,
            connectorDescription,
            createTime,
            connectorUrl,
            resultCode,
            resultDescription,
            connectorStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectorResponse {\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
        sb.append("    connectorDescription: ").append(toIndentedString(connectorDescription)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    connectorUrl: ").append(toIndentedString(connectorUrl)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultDescription: ").append(toIndentedString(resultDescription)).append("\n");
        sb.append("    connectorStatus: ").append(toIndentedString(connectorStatus)).append("\n");
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
