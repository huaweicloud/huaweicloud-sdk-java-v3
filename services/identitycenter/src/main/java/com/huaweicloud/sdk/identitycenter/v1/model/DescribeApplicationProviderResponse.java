package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DescribeApplicationProviderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_provider_urn")

    private String applicationProviderUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_data")

    private DisplayDataDto displayData;

    /**
     * 支持的协议
     */
    public static final class FederationProtocolEnum {

        /**
         * Enum SAML for value: "SAML"
         */
        public static final FederationProtocolEnum SAML = new FederationProtocolEnum("SAML");

        /**
         * Enum OAUTH for value: "OAUTH"
         */
        public static final FederationProtocolEnum OAUTH = new FederationProtocolEnum("OAUTH");

        private static final Map<String, FederationProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FederationProtocolEnum> createStaticFields() {
            Map<String, FederationProtocolEnum> map = new HashMap<>();
            map.put("SAML", SAML);
            map.put("OAUTH", OAUTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FederationProtocolEnum(String value) {
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
        public static FederationProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FederationProtocolEnum(value));
        }

        public static FederationProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FederationProtocolEnum) {
                return this.value.equals(((FederationProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "federation_protocol")

    private FederationProtocolEnum federationProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_provider_id")

    private String applicationProviderId;

    public DescribeApplicationProviderResponse withApplicationProviderUrn(String applicationProviderUrn) {
        this.applicationProviderUrn = applicationProviderUrn;
        return this;
    }

    /**
     * 应用程序提供者URN
     * @return applicationProviderUrn
     */
    public String getApplicationProviderUrn() {
        return applicationProviderUrn;
    }

    public void setApplicationProviderUrn(String applicationProviderUrn) {
        this.applicationProviderUrn = applicationProviderUrn;
    }

    public DescribeApplicationProviderResponse withDisplayData(DisplayDataDto displayData) {
        this.displayData = displayData;
        return this;
    }

    public DescribeApplicationProviderResponse withDisplayData(Consumer<DisplayDataDto> displayDataSetter) {
        if (this.displayData == null) {
            this.displayData = new DisplayDataDto();
            displayDataSetter.accept(this.displayData);
        }

        return this;
    }

    /**
     * Get displayData
     * @return displayData
     */
    public DisplayDataDto getDisplayData() {
        return displayData;
    }

    public void setDisplayData(DisplayDataDto displayData) {
        this.displayData = displayData;
    }

    public DescribeApplicationProviderResponse withFederationProtocol(FederationProtocolEnum federationProtocol) {
        this.federationProtocol = federationProtocol;
        return this;
    }

    /**
     * 支持的协议
     * @return federationProtocol
     */
    public FederationProtocolEnum getFederationProtocol() {
        return federationProtocol;
    }

    public void setFederationProtocol(FederationProtocolEnum federationProtocol) {
        this.federationProtocol = federationProtocol;
    }

    public DescribeApplicationProviderResponse withApplicationProviderId(String applicationProviderId) {
        this.applicationProviderId = applicationProviderId;
        return this;
    }

    /**
     * 应用程序提供者唯一标识符（ID）
     * @return applicationProviderId
     */
    public String getApplicationProviderId() {
        return applicationProviderId;
    }

    public void setApplicationProviderId(String applicationProviderId) {
        this.applicationProviderId = applicationProviderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeApplicationProviderResponse that = (DescribeApplicationProviderResponse) obj;
        return Objects.equals(this.applicationProviderUrn, that.applicationProviderUrn)
            && Objects.equals(this.displayData, that.displayData)
            && Objects.equals(this.federationProtocol, that.federationProtocol)
            && Objects.equals(this.applicationProviderId, that.applicationProviderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationProviderUrn, displayData, federationProtocol, applicationProviderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeApplicationProviderResponse {\n");
        sb.append("    applicationProviderUrn: ").append(toIndentedString(applicationProviderUrn)).append("\n");
        sb.append("    displayData: ").append(toIndentedString(displayData)).append("\n");
        sb.append("    federationProtocol: ").append(toIndentedString(federationProtocol)).append("\n");
        sb.append("    applicationProviderId: ").append(toIndentedString(applicationProviderId)).append("\n");
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
