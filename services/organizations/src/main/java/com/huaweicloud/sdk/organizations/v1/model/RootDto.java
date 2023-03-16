package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包含根的详细信息。根是组织层次结构中的顶级父节点，可以包含组织单元和帐号。
 */
public class RootDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_types")

    private List<PolicyTypeSummaryDto> policyTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public RootDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 根的唯一标识符（ID）。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RootDto withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 根的统一资源名称。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public RootDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 根的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RootDto withPolicyTypes(List<PolicyTypeSummaryDto> policyTypes) {
        this.policyTypes = policyTypes;
        return this;
    }

    public RootDto addPolicyTypesItem(PolicyTypeSummaryDto policyTypesItem) {
        if (this.policyTypes == null) {
            this.policyTypes = new ArrayList<>();
        }
        this.policyTypes.add(policyTypesItem);
        return this;
    }

    public RootDto withPolicyTypes(Consumer<List<PolicyTypeSummaryDto>> policyTypesSetter) {
        if (this.policyTypes == null) {
            this.policyTypes = new ArrayList<>();
        }
        policyTypesSetter.accept(this.policyTypes);
        return this;
    }

    /**
     * 策略类型在当前根已启用，则该类型策略可以绑定到根或其组织单元或帐号。
     * @return policyTypes
     */
    public List<PolicyTypeSummaryDto> getPolicyTypes() {
        return policyTypes;
    }

    public void setPolicyTypes(List<PolicyTypeSummaryDto> policyTypes) {
        this.policyTypes = policyTypes;
    }

    public RootDto withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 根的创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RootDto rootDto = (RootDto) o;
        return Objects.equals(this.id, rootDto.id) && Objects.equals(this.urn, rootDto.urn)
            && Objects.equals(this.name, rootDto.name) && Objects.equals(this.policyTypes, rootDto.policyTypes)
            && Objects.equals(this.createdAt, rootDto.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, urn, name, policyTypes, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RootDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyTypes: ").append(toIndentedString(policyTypes)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
