package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量创建ips白名单请求体
 */
public class IpsWhiteListDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_address")

    private String sourceAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_address")

    private String destAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_id")

    private String ipsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_scopes")

    private List<String> effectiveScopes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public IpsWhiteListDto withSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    /**
     * **参数解释**：  源地址  **约束限制**：  不涉及  **取值范围**：  不涉及  **默认取值**：  不涉及
     * @return sourceAddress
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public IpsWhiteListDto withDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    /**
     * **参数解释**：  目的地址  **约束限制**：  不涉及  **取值范围**：  不涉及  **默认取值**：  不涉及
     * @return destAddress
     */
    public String getDestAddress() {
        return destAddress;
    }

    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress;
    }

    public IpsWhiteListDto withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * **参数解释**：  IP类型 **约束限制**：  不涉及  **取值范围**：  4：表示IP类型为IPv4 6：表示IP类型为IPv6 **默认取值**：  不涉及
     * minimum: 4
     * maximum: 6
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public IpsWhiteListDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  白名单名称  **约束限制**：  不涉及  **取值范围**： 不涉及  **默认取值**：  不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IpsWhiteListDto withIpsId(String ipsId) {
        this.ipsId = ipsId;
        return this;
    }

    /**
     * **参数解释**：  IPS规则ID，all代表所有IPS  **约束限制**：  不涉及  **取值范围**： 不涉及  **默认取值**：  不涉及
     * @return ipsId
     */
    public String getIpsId() {
        return ipsId;
    }

    public void setIpsId(String ipsId) {
        this.ipsId = ipsId;
    }

    public IpsWhiteListDto withEffectiveScopes(List<String> effectiveScopes) {
        this.effectiveScopes = effectiveScopes;
        return this;
    }

    public IpsWhiteListDto addEffectiveScopesItem(String effectiveScopesItem) {
        if (this.effectiveScopes == null) {
            this.effectiveScopes = new ArrayList<>();
        }
        this.effectiveScopes.add(effectiveScopesItem);
        return this;
    }

    public IpsWhiteListDto withEffectiveScopes(Consumer<List<String>> effectiveScopesSetter) {
        if (this.effectiveScopes == null) {
            this.effectiveScopes = new ArrayList<>();
        }
        effectiveScopesSetter.accept(this.effectiveScopes);
        return this;
    }

    /**
     * **参数解释**：  生效范围：NAT EIP VPC HCS场景中还有VGW信息 **约束限制**：  不涉及  **取值范围**： 不涉及  **默认取值**：  不涉及
     * @return effectiveScopes
     */
    public List<String> getEffectiveScopes() {
        return effectiveScopes;
    }

    public void setEffectiveScopes(List<String> effectiveScopes) {
        this.effectiveScopes = effectiveScopes;
    }

    public IpsWhiteListDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：  白名单描述 **约束限制**：  不涉及  **取值范围**： 不涉及  **默认取值**：  不涉及
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
        IpsWhiteListDto that = (IpsWhiteListDto) obj;
        return Objects.equals(this.sourceAddress, that.sourceAddress)
            && Objects.equals(this.destAddress, that.destAddress) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.name, that.name) && Objects.equals(this.ipsId, that.ipsId)
            && Objects.equals(this.effectiveScopes, that.effectiveScopes)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceAddress, destAddress, ipVersion, name, ipsId, effectiveScopes, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsWhiteListDto {\n");
        sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
        sb.append("    destAddress: ").append(toIndentedString(destAddress)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipsId: ").append(toIndentedString(ipsId)).append("\n");
        sb.append("    effectiveScopes: ").append(toIndentedString(effectiveScopes)).append("\n");
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
