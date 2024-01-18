package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowManagedCoreAccountResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_resource_mappings")

    private Map<String, String> coreResourceMappings = null;

    public ShowManagedCoreAccountResponse withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 纳管账号ID。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public ShowManagedCoreAccountResponse withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 纳管账号名称。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public ShowManagedCoreAccountResponse withCoreResourceMappings(Map<String, String> coreResourceMappings) {
        this.coreResourceMappings = coreResourceMappings;
        return this;
    }

    public ShowManagedCoreAccountResponse putCoreResourceMappingsItem(String key, String coreResourceMappingsItem) {
        if (this.coreResourceMappings == null) {
            this.coreResourceMappings = new HashMap<>();
        }
        this.coreResourceMappings.put(key, coreResourceMappingsItem);
        return this;
    }

    public ShowManagedCoreAccountResponse withCoreResourceMappings(
        Consumer<Map<String, String>> coreResourceMappingsSetter) {
        if (this.coreResourceMappings == null) {
            this.coreResourceMappings = new HashMap<>();
        }
        coreResourceMappingsSetter.accept(this.coreResourceMappings);
        return this;
    }

    /**
     * 核心资源映射。
     * @return coreResourceMappings
     */
    public Map<String, String> getCoreResourceMappings() {
        return coreResourceMappings;
    }

    public void setCoreResourceMappings(Map<String, String> coreResourceMappings) {
        this.coreResourceMappings = coreResourceMappings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowManagedCoreAccountResponse that = (ShowManagedCoreAccountResponse) obj;
        return Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.coreResourceMappings, that.coreResourceMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountName, coreResourceMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowManagedCoreAccountResponse {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    coreResourceMappings: ").append(toIndentedString(coreResourceMappings)).append("\n");
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
