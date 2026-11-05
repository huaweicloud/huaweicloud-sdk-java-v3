package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSupabaseApplicationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_component")

    private SupabaseStorageComponentInfo storageComponent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_instance")

    private SupabaseManagedInstanceInfo managedInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private Long updatedTime;

    public ShowSupabaseApplicationResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSupabaseApplicationResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowSupabaseApplicationResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 运行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowSupabaseApplicationResponse withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get enableSsl
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public ShowSupabaseApplicationResponse withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * Get certId
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public ShowSupabaseApplicationResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * Get securityGroupId
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowSupabaseApplicationResponse withStorageComponent(SupabaseStorageComponentInfo storageComponent) {
        this.storageComponent = storageComponent;
        return this;
    }

    public ShowSupabaseApplicationResponse withStorageComponent(
        Consumer<SupabaseStorageComponentInfo> storageComponentSetter) {
        if (this.storageComponent == null) {
            this.storageComponent = new SupabaseStorageComponentInfo();
            storageComponentSetter.accept(this.storageComponent);
        }

        return this;
    }

    /**
     * Get storageComponent
     * @return storageComponent
     */
    public SupabaseStorageComponentInfo getStorageComponent() {
        return storageComponent;
    }

    public void setStorageComponent(SupabaseStorageComponentInfo storageComponent) {
        this.storageComponent = storageComponent;
    }

    public ShowSupabaseApplicationResponse withManagedInstance(SupabaseManagedInstanceInfo managedInstance) {
        this.managedInstance = managedInstance;
        return this;
    }

    public ShowSupabaseApplicationResponse withManagedInstance(
        Consumer<SupabaseManagedInstanceInfo> managedInstanceSetter) {
        if (this.managedInstance == null) {
            this.managedInstance = new SupabaseManagedInstanceInfo();
            managedInstanceSetter.accept(this.managedInstance);
        }

        return this;
    }

    /**
     * Get managedInstance
     * @return managedInstance
     */
    public SupabaseManagedInstanceInfo getManagedInstance() {
        return managedInstance;
    }

    public void setManagedInstance(SupabaseManagedInstanceInfo managedInstance) {
        this.managedInstance = managedInstance;
    }

    public ShowSupabaseApplicationResponse withUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Get updatedTime
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSupabaseApplicationResponse that = (ShowSupabaseApplicationResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.enableSsl, that.enableSsl)
            && Objects.equals(this.certId, that.certId) && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.storageComponent, that.storageComponent)
            && Objects.equals(this.managedInstance, that.managedInstance)
            && Objects.equals(this.updatedTime, that.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, status, enableSsl, certId, securityGroupId, storageComponent, managedInstance, updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSupabaseApplicationResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    storageComponent: ").append(toIndentedString(storageComponent)).append("\n");
        sb.append("    managedInstance: ").append(toIndentedString(managedInstance)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
