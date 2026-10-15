package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowLinkFlavorsRequest {

    /**
     * 请求语言类型。
     */
    public static final class XLanguageEnum {

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("en-us", EN_US);
            map.put("zh-cn", ZH_CN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_direction")

    private String jobDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_type")

    private String netType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_write")

    private Boolean isMultiWrite;

    public ShowLinkFlavorsRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowLinkFlavorsRequest withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型。
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ShowLinkFlavorsRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务场景。取值：     - migration：实时迁移。     - sync：实时同步。     - cloudDataGuard：实时灾备。     - subscription：数据订阅。     - replay：录制回放。     - verify：校验任务。     - cdc：CDC任务。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ShowLinkFlavorsRequest withJobDirection(String jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 任务方向。取值：     - up：入云 ，灾备场景时对应本云为备。     - down：出云，灾备场景时对应本云为主。     - non-dbs：自建。
     * @return jobDirection
     */
    public String getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(String jobDirection) {
        this.jobDirection = jobDirection;
    }

    public ShowLinkFlavorsRequest withNetType(String netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型。取值：     - eip：公网网络。     - vpc：VPC网络，灾备场景不支持选择VPC网络。     - vpn：VPN、专线网络。
     * @return netType
     */
    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public ShowLinkFlavorsRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 任务实例规格类型。取值：     - micro：极小规格。     - small：小规格。     - medium：中规格。     - high：大规格。     - xlarge：超大规格。     - 2xlarge：极大规格。
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ShowLinkFlavorsRequest withIsMultiWrite(Boolean isMultiWrite) {
        this.isMultiWrite = isMultiWrite;
        return this;
    }

    /**
     * 灾备类型是否双主灾备。说明：     - job_type 是cloudDataGuard时，必填，灾备类型是双主灾备时，is_multi_write取值true, 否则为false。     - job_type 是其他类型时，is_multi_write是非必选参数。
     * @return isMultiWrite
     */
    public Boolean getIsMultiWrite() {
        return isMultiWrite;
    }

    public void setIsMultiWrite(Boolean isMultiWrite) {
        this.isMultiWrite = isMultiWrite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLinkFlavorsRequest that = (ShowLinkFlavorsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.jobDirection, that.jobDirection)
            && Objects.equals(this.netType, that.netType) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.isMultiWrite, that.isMultiWrite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, engineType, jobType, jobDirection, netType, nodeType, isMultiWrite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLinkFlavorsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    isMultiWrite: ").append(toIndentedString(isMultiWrite)).append("\n");
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
