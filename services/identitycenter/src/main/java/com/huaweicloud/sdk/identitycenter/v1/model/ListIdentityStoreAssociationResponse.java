package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListIdentityStoreAssociationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_associations")

    private List<IdentityStoreDto> identityStoreAssociations = null;

    public ListIdentityStoreAssociationResponse withIdentityStoreAssociations(
        List<IdentityStoreDto> identityStoreAssociations) {
        this.identityStoreAssociations = identityStoreAssociations;
        return this;
    }

    public ListIdentityStoreAssociationResponse addIdentityStoreAssociationsItem(
        IdentityStoreDto identityStoreAssociationsItem) {
        if (this.identityStoreAssociations == null) {
            this.identityStoreAssociations = new ArrayList<>();
        }
        this.identityStoreAssociations.add(identityStoreAssociationsItem);
        return this;
    }

    public ListIdentityStoreAssociationResponse withIdentityStoreAssociations(
        Consumer<List<IdentityStoreDto>> identityStoreAssociationsSetter) {
        if (this.identityStoreAssociations == null) {
            this.identityStoreAssociations = new ArrayList<>();
        }
        identityStoreAssociationsSetter.accept(this.identityStoreAssociations);
        return this;
    }

    /**
     * IAM身份中心服务实例关联的身份源配置信息
     * @return identityStoreAssociations
     */
    public List<IdentityStoreDto> getIdentityStoreAssociations() {
        return identityStoreAssociations;
    }

    public void setIdentityStoreAssociations(List<IdentityStoreDto> identityStoreAssociations) {
        this.identityStoreAssociations = identityStoreAssociations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIdentityStoreAssociationResponse that = (ListIdentityStoreAssociationResponse) obj;
        return Objects.equals(this.identityStoreAssociations, that.identityStoreAssociations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityStoreAssociations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIdentityStoreAssociationResponse {\n");
        sb.append("    identityStoreAssociations: ").append(toIndentedString(identityStoreAssociations)).append("\n");
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
