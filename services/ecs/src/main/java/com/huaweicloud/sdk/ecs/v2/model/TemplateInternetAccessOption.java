package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 公网访问
 */
public class TemplateInternetAccessOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private TemplatePublicIpOption publicip;

    public TemplateInternetAccessOption withPublicip(TemplatePublicIpOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public TemplateInternetAccessOption withPublicip(Consumer<TemplatePublicIpOption> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new TemplatePublicIpOption();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public TemplatePublicIpOption getPublicip() {
        return publicip;
    }

    public void setPublicip(TemplatePublicIpOption publicip) {
        this.publicip = publicip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateInternetAccessOption that = (TemplateInternetAccessOption) obj;
        return Objects.equals(this.publicip, that.publicip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateInternetAccessOption {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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
