package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * - **参数解释**：Ray Service委托配置信息。 - **约束限制**：不涉及。 - **取值范围**：不涉及。 - **默认取值**：不涉及。
 */
public class AgencyConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_agency")

    private Boolean enableAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public AgencyConfig withEnableAgency(Boolean enableAgency) {
        this.enableAgency = enableAgency;
        return this;
    }

    /**
     * - **参数解释**：是否开启Ray Service委托授权功能。 - **约束限制**：不涉及。 - **取值范围**：开启true，关闭false。 - **默认取值**：false。 
     * @return enableAgency
     */
    public Boolean getEnableAgency() {
        return enableAgency;
    }

    public void setEnableAgency(Boolean enableAgency) {
        this.enableAgency = enableAgency;
    }

    public AgencyConfig withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * - **参数解释**：授予Ray Service的委托名称。 - **约束限制**：不超过64位。 - **取值范围**：不涉及。 - **默认取值**：null。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyConfig that = (AgencyConfig) obj;
        return Objects.equals(this.enableAgency, that.enableAgency) && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableAgency, agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyConfig {\n");
        sb.append("    enableAgency: ").append(toIndentedString(enableAgency)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
