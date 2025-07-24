package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
public class ShowActiveDirectoryDomainResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_name")

    private String systemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_server")

    private List<String> dnsServer = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_unit")

    private String organizationUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    /**
     * AD域当前状态信息
     */
    public static final class StatusEnum {

        /**
         * Enum JOINING for value: "JOINING"
         */
        public static final StatusEnum JOINING = new StatusEnum("JOINING");

        /**
         * Enum AVAILABLE for value: "AVAILABLE"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("AVAILABLE");

        /**
         * Enum EXITING for value: "EXITING"
         */
        public static final StatusEnum EXITING = new StatusEnum("EXITING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("JOINING", JOINING);
            map.put("AVAILABLE", AVAILABLE);
            map.put("EXITING", EXITING);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowActiveDirectoryDomainResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域控服务器的域名，在创建域服务器时指定
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowActiveDirectoryDomainResponse withSystemName(String systemName) {
        this.systemName = systemName;
        return this;
    }

    /**
     * 存储系统在AD域中的名称
     * @return systemName
     */
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public ShowActiveDirectoryDomainResponse withDnsServer(List<String> dnsServer) {
        this.dnsServer = dnsServer;
        return this;
    }

    public ShowActiveDirectoryDomainResponse addDnsServerItem(String dnsServerItem) {
        if (this.dnsServer == null) {
            this.dnsServer = new ArrayList<>();
        }
        this.dnsServer.add(dnsServerItem);
        return this;
    }

    public ShowActiveDirectoryDomainResponse withDnsServer(Consumer<List<String>> dnsServerSetter) {
        if (this.dnsServer == null) {
            this.dnsServer = new ArrayList<>();
        }
        dnsServerSetter.accept(this.dnsServer);
        return this;
    }

    /**
     * DNS服务器IP地址，用于解析AD域的域名
     * @return dnsServer
     */
    public List<String> getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(List<String> dnsServer) {
        this.dnsServer = dnsServer;
    }

    public ShowActiveDirectoryDomainResponse withOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }

    /**
     * 域中包含的一类目录对象如用户、计算机、打印机等资源的总称，加入后将作为其中的一员。若不填，则默认加入到computers组织单元。
     * @return organizationUnit
     */
    public String getOrganizationUnit() {
        return organizationUnit;
    }

    public void setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    public ShowActiveDirectoryDomainResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * vpc的id
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowActiveDirectoryDomainResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * AD域当前状态信息
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowActiveDirectoryDomainResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowActiveDirectoryDomainResponse that = (ShowActiveDirectoryDomainResponse) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.systemName, that.systemName)
            && Objects.equals(this.dnsServer, that.dnsServer)
            && Objects.equals(this.organizationUnit, that.organizationUnit) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, systemName, dnsServer, organizationUnit, vpcId, status, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowActiveDirectoryDomainResponse {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
        sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
        sb.append("    organizationUnit: ").append(toIndentedString(organizationUnit)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
