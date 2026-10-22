package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ShowV2AgreementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreements")

    private List<TenantV2Agreement> agreements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowV2AgreementResponse withAgreements(List<TenantV2Agreement> agreements) {
        this.agreements = agreements;
        return this;
    }

    public ShowV2AgreementResponse addAgreementsItem(TenantV2Agreement agreementsItem) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.add(agreementsItem);
        return this;
    }

    public ShowV2AgreementResponse withAgreements(Consumer<List<TenantV2Agreement>> agreementsSetter) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        agreementsSetter.accept(this.agreements);
        return this;
    }

    /**
     * **参数解释**：租户协议列表。
     * @return agreements
     */
    public List<TenantV2Agreement> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<TenantV2Agreement> agreements) {
        this.agreements = agreements;
    }

    public ShowV2AgreementResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：租户签署的协议总数。 **取值范围**：0~1000。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowV2AgreementResponse that = (ShowV2AgreementResponse) obj;
        return Objects.equals(this.agreements, that.agreements) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreements, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowV2AgreementResponse {\n");
        sb.append("    agreements: ").append(toIndentedString(agreements)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
