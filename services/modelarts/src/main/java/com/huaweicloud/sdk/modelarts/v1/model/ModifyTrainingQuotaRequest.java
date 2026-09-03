package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：修改训练配额的请求体。
 */
public class ModifyTrainingQuotaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private List<ModifyTrainingQuotaItem> quotas = null;

    public ModifyTrainingQuotaRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**：用户ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ModifyTrainingQuotaRequest withQuotas(List<ModifyTrainingQuotaItem> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ModifyTrainingQuotaRequest addQuotasItem(ModifyTrainingQuotaItem quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ModifyTrainingQuotaRequest withQuotas(Consumer<List<ModifyTrainingQuotaItem>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * **参数解释**：训练作业配额组。
     * @return quotas
     */
    public List<ModifyTrainingQuotaItem> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<ModifyTrainingQuotaItem> quotas) {
        this.quotas = quotas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyTrainingQuotaRequest that = (ModifyTrainingQuotaRequest) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.quotas, that.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTrainingQuotaRequest {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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
