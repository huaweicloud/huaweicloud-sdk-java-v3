package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListExternalIdPConfigurationsForDirectoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associations")

    private List<ExternalIdpConfigurationDto> associations = null;

    public ListExternalIdPConfigurationsForDirectoryResponse withAssociations(
        List<ExternalIdpConfigurationDto> associations) {
        this.associations = associations;
        return this;
    }

    public ListExternalIdPConfigurationsForDirectoryResponse addAssociationsItem(
        ExternalIdpConfigurationDto associationsItem) {
        if (this.associations == null) {
            this.associations = new ArrayList<>();
        }
        this.associations.add(associationsItem);
        return this;
    }

    public ListExternalIdPConfigurationsForDirectoryResponse withAssociations(
        Consumer<List<ExternalIdpConfigurationDto>> associationsSetter) {
        if (this.associations == null) {
            this.associations = new ArrayList<>();
        }
        associationsSetter.accept(this.associations);
        return this;
    }

    /**
     * 外部身份提供商配置信息
     * @return associations
     */
    public List<ExternalIdpConfigurationDto> getAssociations() {
        return associations;
    }

    public void setAssociations(List<ExternalIdpConfigurationDto> associations) {
        this.associations = associations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExternalIdPConfigurationsForDirectoryResponse that =
            (ListExternalIdPConfigurationsForDirectoryResponse) obj;
        return Objects.equals(this.associations, that.associations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExternalIdPConfigurationsForDirectoryResponse {\n");
        sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
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
