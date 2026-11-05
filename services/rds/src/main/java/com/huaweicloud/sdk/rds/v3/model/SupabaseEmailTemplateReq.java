package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SupabaseEmailTemplateReq
 */
public class SupabaseEmailTemplateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mailer_confirmation")

    private SupabaseMailerItemTemplateReq mailerConfirmation;

    public SupabaseEmailTemplateReq withMailerConfirmation(SupabaseMailerItemTemplateReq mailerConfirmation) {
        this.mailerConfirmation = mailerConfirmation;
        return this;
    }

    public SupabaseEmailTemplateReq withMailerConfirmation(
        Consumer<SupabaseMailerItemTemplateReq> mailerConfirmationSetter) {
        if (this.mailerConfirmation == null) {
            this.mailerConfirmation = new SupabaseMailerItemTemplateReq();
            mailerConfirmationSetter.accept(this.mailerConfirmation);
        }

        return this;
    }

    /**
     * Get mailerConfirmation
     * @return mailerConfirmation
     */
    public SupabaseMailerItemTemplateReq getMailerConfirmation() {
        return mailerConfirmation;
    }

    public void setMailerConfirmation(SupabaseMailerItemTemplateReq mailerConfirmation) {
        this.mailerConfirmation = mailerConfirmation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupabaseEmailTemplateReq that = (SupabaseEmailTemplateReq) obj;
        return Objects.equals(this.mailerConfirmation, that.mailerConfirmation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mailerConfirmation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupabaseEmailTemplateReq {\n");
        sb.append("    mailerConfirmation: ").append(toIndentedString(mailerConfirmation)).append("\n");
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
