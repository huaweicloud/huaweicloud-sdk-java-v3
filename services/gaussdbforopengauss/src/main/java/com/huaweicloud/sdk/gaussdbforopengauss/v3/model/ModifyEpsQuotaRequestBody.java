package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyEpsQuotaRequestBody
 */
public class ModifyEpsQuotaRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_quotas")

    private List<EpsQuotasOption> epsQuotas = null;

    public ModifyEpsQuotaRequestBody withEpsQuotas(List<EpsQuotasOption> epsQuotas) {
        this.epsQuotas = epsQuotas;
        return this;
    }

    public ModifyEpsQuotaRequestBody addEpsQuotasItem(EpsQuotasOption epsQuotasItem) {
        if (this.epsQuotas == null) {
            this.epsQuotas = new ArrayList<>();
        }
        this.epsQuotas.add(epsQuotasItem);
        return this;
    }

    public ModifyEpsQuotaRequestBody withEpsQuotas(Consumer<List<EpsQuotasOption>> epsQuotasSetter) {
        if (this.epsQuotas == null) {
            this.epsQuotas = new ArrayList<>();
        }
        epsQuotasSetter.accept(this.epsQuotas);
        return this;
    }

    /**
     * 需要修改的企业配额列表。
     * @return epsQuotas
     */
    public List<EpsQuotasOption> getEpsQuotas() {
        return epsQuotas;
    }

    public void setEpsQuotas(List<EpsQuotasOption> epsQuotas) {
        this.epsQuotas = epsQuotas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyEpsQuotaRequestBody that = (ModifyEpsQuotaRequestBody) obj;
        return Objects.equals(this.epsQuotas, that.epsQuotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsQuotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyEpsQuotaRequestBody {\n");
        sb.append("    epsQuotas: ").append(toIndentedString(epsQuotas)).append("\n");
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
