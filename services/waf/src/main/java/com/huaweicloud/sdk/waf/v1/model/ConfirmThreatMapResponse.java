package com.huaweicloud.sdk.waf.v1.model;

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
public class ConfirmThreatMapResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threats")

    private List<String> threats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private ThreatMapResponseBodyLocale locale;

    public ConfirmThreatMapResponse withThreats(List<String> threats) {
        this.threats = threats;
        return this;
    }

    public ConfirmThreatMapResponse addThreatsItem(String threatsItem) {
        if (this.threats == null) {
            this.threats = new ArrayList<>();
        }
        this.threats.add(threatsItem);
        return this;
    }

    public ConfirmThreatMapResponse withThreats(Consumer<List<String>> threatsSetter) {
        if (this.threats == null) {
            this.threats = new ArrayList<>();
        }
        threatsSetter.accept(this.threats);
        return this;
    }

    /**
     * **参数解释：** 告警通知里可选的事件类型 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return threats
     */
    public List<String> getThreats() {
        return threats;
    }

    public void setThreats(List<String> threats) {
        this.threats = threats;
    }

    public ConfirmThreatMapResponse withLocale(ThreatMapResponseBodyLocale locale) {
        this.locale = locale;
        return this;
    }

    public ConfirmThreatMapResponse withLocale(Consumer<ThreatMapResponseBodyLocale> localeSetter) {
        if (this.locale == null) {
            this.locale = new ThreatMapResponseBodyLocale();
            localeSetter.accept(this.locale);
        }

        return this;
    }

    /**
     * Get locale
     * @return locale
     */
    public ThreatMapResponseBodyLocale getLocale() {
        return locale;
    }

    public void setLocale(ThreatMapResponseBodyLocale locale) {
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
        ConfirmThreatMapResponse that = (ConfirmThreatMapResponse) obj;
        return Objects.equals(this.threats, that.threats) && Objects.equals(this.locale, that.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threats, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmThreatMapResponse {\n");
        sb.append("    threats: ").append(toIndentedString(threats)).append("\n");
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
