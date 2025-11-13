package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ConfirmPolicyAntileakageMapResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leakagemap")

    private AntileakageMapResponseBodyLeakagemap leakagemap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private AntileakageMapResponseBodyLocale locale;

    public ConfirmPolicyAntileakageMapResponse withLeakagemap(AntileakageMapResponseBodyLeakagemap leakagemap) {
        this.leakagemap = leakagemap;
        return this;
    }

    public ConfirmPolicyAntileakageMapResponse withLeakagemap(
        Consumer<AntileakageMapResponseBodyLeakagemap> leakagemapSetter) {
        if (this.leakagemap == null) {
            this.leakagemap = new AntileakageMapResponseBodyLeakagemap();
            leakagemapSetter.accept(this.leakagemap);
        }

        return this;
    }

    /**
     * Get leakagemap
     * @return leakagemap
     */
    public AntileakageMapResponseBodyLeakagemap getLeakagemap() {
        return leakagemap;
    }

    public void setLeakagemap(AntileakageMapResponseBodyLeakagemap leakagemap) {
        this.leakagemap = leakagemap;
    }

    public ConfirmPolicyAntileakageMapResponse withLocale(AntileakageMapResponseBodyLocale locale) {
        this.locale = locale;
        return this;
    }

    public ConfirmPolicyAntileakageMapResponse withLocale(Consumer<AntileakageMapResponseBodyLocale> localeSetter) {
        if (this.locale == null) {
            this.locale = new AntileakageMapResponseBodyLocale();
            localeSetter.accept(this.locale);
        }

        return this;
    }

    /**
     * Get locale
     * @return locale
     */
    public AntileakageMapResponseBodyLocale getLocale() {
        return locale;
    }

    public void setLocale(AntileakageMapResponseBodyLocale locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmPolicyAntileakageMapResponse that = (ConfirmPolicyAntileakageMapResponse) obj;
        return Objects.equals(this.leakagemap, that.leakagemap) && Objects.equals(this.locale, that.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leakagemap, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmPolicyAntileakageMapResponse {\n");
        sb.append("    leakagemap: ").append(toIndentedString(leakagemap)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
