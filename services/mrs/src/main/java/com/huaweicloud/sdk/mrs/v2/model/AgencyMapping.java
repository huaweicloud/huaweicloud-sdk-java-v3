package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户（组）与IAM委托的映射关系结构体
 */
public class AgencyMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier_type")

    private String identifierType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifiers")

    private List<String> identifiers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    public AgencyMapping withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 该映射绑定的IAM委托名称。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public AgencyMapping withIdentifierType(String identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    /**
     * 委托类型，分为“User”和“Group”两种。 - User表示该映射关系为针对用户的映射，identifiers中填写用户名称列表。 - Group表示该映射关系为针对用户组的映射，identifiers中填写用户组名称列表。
     * @return identifierType
     */
    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    public AgencyMapping withIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public AgencyMapping addIdentifiersItem(String identifiersItem) {
        if (this.identifiers == null) {
            this.identifiers = new ArrayList<>();
        }
        this.identifiers.add(identifiersItem);
        return this;
    }

    public AgencyMapping withIdentifiers(Consumer<List<String>> identifiersSetter) {
        if (this.identifiers == null) {
            this.identifiers = new ArrayList<>();
        }
        identifiersSetter.accept(this.identifiers);
        return this;
    }

    /**
     * IAM委托映射的用户（组）名称列表。请前往IAM，单击“用户（组）”按钮，获取用户（组）名称列表。
     * @return identifiers
     */
    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public AgencyMapping withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 该映射关系绑定的委托的的唯一标识码。请前往IAM，单击“委托”按钮，进入委托页面，将鼠标放置委托名称上，在弹窗中获取委托唯一标识码。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyMapping that = (AgencyMapping) obj;
        return Objects.equals(this.agency, that.agency) && Objects.equals(this.identifierType, that.identifierType)
            && Objects.equals(this.identifiers, that.identifiers) && Objects.equals(this.agencyId, that.agencyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency, identifierType, identifiers, agencyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyMapping {\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
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
