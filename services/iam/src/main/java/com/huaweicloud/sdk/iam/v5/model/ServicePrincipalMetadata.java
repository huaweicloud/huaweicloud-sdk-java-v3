package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务主体信息。
 */
public class ServicePrincipalMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_principal")

    private String servicePrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_catalog")

    private String serviceCatalog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ServicePrincipalMetadata withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * 服务主体，由\"service.\"开头，后跟一个长度为1到56个字符，只包含字母、数字和\"-\"的字符串。
     * @return servicePrincipal
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    public ServicePrincipalMetadata withServiceCatalog(String serviceCatalog) {
        this.serviceCatalog = serviceCatalog;
        return this;
    }

    /**
     * 云服务名称。
     * @return serviceCatalog
     */
    public String getServiceCatalog() {
        return serviceCatalog;
    }

    public void setServiceCatalog(String serviceCatalog) {
        this.serviceCatalog = serviceCatalog;
    }

    public ServicePrincipalMetadata withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 用于显示的服务主体名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ServicePrincipalMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 服务主体的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServicePrincipalMetadata that = (ServicePrincipalMetadata) obj;
        return Objects.equals(this.servicePrincipal, that.servicePrincipal)
            && Objects.equals(this.serviceCatalog, that.serviceCatalog)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePrincipal, serviceCatalog, displayName, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicePrincipalMetadata {\n");
        sb.append("    servicePrincipal: ").append(toIndentedString(servicePrincipal)).append("\n");
        sb.append("    serviceCatalog: ").append(toIndentedString(serviceCatalog)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
