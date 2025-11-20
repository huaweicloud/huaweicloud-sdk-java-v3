package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDomainConfigRequestBody
 */
public class UpdateDomainConfigRequestBody {

    /**
     * 源站类型。 0 - 源站IP， 1 - 源站域名。
     */
    public static final class RealServerTypeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final RealServerTypeEnum NUMBER_1 = new RealServerTypeEnum(1);

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final RealServerTypeEnum NUMBER_0 = new RealServerTypeEnum(0);

        private static final Map<Integer, RealServerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RealServerTypeEnum> createStaticFields() {
            Map<Integer, RealServerTypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(0, NUMBER_0);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RealServerTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RealServerTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RealServerTypeEnum(value));
        }

        public static RealServerTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RealServerTypeEnum) {
                return this.value.equals(((RealServerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_server_type")

    private RealServerTypeEnum realServerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_server")

    private String realServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_http")

    private List<Integer> portHttp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_https")

    private List<Integer> portHttps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overseas_type")

    private String overseasType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    public UpdateDomainConfigRequestBody withRealServerType(RealServerTypeEnum realServerType) {
        this.realServerType = realServerType;
        return this;
    }

    /**
     * 源站类型。 0 - 源站IP， 1 - 源站域名。
     * minimum: 0
     * maximum: 2000
     * @return realServerType
     */
    public RealServerTypeEnum getRealServerType() {
        return realServerType;
    }

    public void setRealServerType(RealServerTypeEnum realServerType) {
        this.realServerType = realServerType;
    }

    public UpdateDomainConfigRequestBody withRealServer(String realServer) {
        this.realServer = realServer;
        return this;
    }

    /**
     * 源站ip/源站域名
     * @return realServer
     */
    public String getRealServer() {
        return realServer;
    }

    public void setRealServer(String realServer) {
        this.realServer = realServer;
    }

    public UpdateDomainConfigRequestBody withPortHttp(List<Integer> portHttp) {
        this.portHttp = portHttp;
        return this;
    }

    public UpdateDomainConfigRequestBody addPortHttpItem(Integer portHttpItem) {
        if (this.portHttp == null) {
            this.portHttp = new ArrayList<>();
        }
        this.portHttp.add(portHttpItem);
        return this;
    }

    public UpdateDomainConfigRequestBody withPortHttp(Consumer<List<Integer>> portHttpSetter) {
        if (this.portHttp == null) {
            this.portHttp = new ArrayList<>();
        }
        portHttpSetter.accept(this.portHttp);
        return this;
    }

    /**
     * HTTP端口，与port_https不能同时为空。DDoS高防支持的HTTP端口可用ListDomainPort接口查询。
     * @return portHttp
     */
    public List<Integer> getPortHttp() {
        return portHttp;
    }

    public void setPortHttp(List<Integer> portHttp) {
        this.portHttp = portHttp;
    }

    public UpdateDomainConfigRequestBody withPortHttps(List<Integer> portHttps) {
        this.portHttps = portHttps;
        return this;
    }

    public UpdateDomainConfigRequestBody addPortHttpsItem(Integer portHttpsItem) {
        if (this.portHttps == null) {
            this.portHttps = new ArrayList<>();
        }
        this.portHttps.add(portHttpsItem);
        return this;
    }

    public UpdateDomainConfigRequestBody withPortHttps(Consumer<List<Integer>> portHttpsSetter) {
        if (this.portHttps == null) {
            this.portHttps = new ArrayList<>();
        }
        portHttpsSetter.accept(this.portHttps);
        return this;
    }

    /**
     * HTTPS端口，与port_http不能同时为空。DDoS高防支持的HTTPS端口可用ListDomainPort接口查询。
     * @return portHttps
     */
    public List<Integer> getPortHttps() {
        return portHttps;
    }

    public void setPortHttps(List<Integer> portHttps) {
        this.portHttps = portHttps;
    }

    public UpdateDomainConfigRequestBody withOverseasType(String overseasType) {
        this.overseasType = overseasType;
        return this;
    }

    /**
     * 防护区域：0-中国大陆、1-中国大陆外
     * @return overseasType
     */
    public String getOverseasType() {
        return overseasType;
    }

    public void setOverseasType(String overseasType) {
        this.overseasType = overseasType;
    }

    public UpdateDomainConfigRequestBody withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDomainConfigRequestBody that = (UpdateDomainConfigRequestBody) obj;
        return Objects.equals(this.realServerType, that.realServerType)
            && Objects.equals(this.realServer, that.realServer) && Objects.equals(this.portHttp, that.portHttp)
            && Objects.equals(this.portHttps, that.portHttps) && Objects.equals(this.overseasType, that.overseasType)
            && Objects.equals(this.certName, that.certName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realServerType, realServer, portHttp, portHttps, overseasType, certName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainConfigRequestBody {\n");
        sb.append("    realServerType: ").append(toIndentedString(realServerType)).append("\n");
        sb.append("    realServer: ").append(toIndentedString(realServer)).append("\n");
        sb.append("    portHttp: ").append(toIndentedString(portHttp)).append("\n");
        sb.append("    portHttps: ").append(toIndentedString(portHttps)).append("\n");
        sb.append("    overseasType: ").append(toIndentedString(overseasType)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
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
