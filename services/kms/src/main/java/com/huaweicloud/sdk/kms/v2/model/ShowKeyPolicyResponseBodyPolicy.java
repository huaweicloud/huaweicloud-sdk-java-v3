package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 密钥策略 **取值范围：** 不涉及
 */
public class ShowKeyPolicyResponseBodyPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity_period")

    private ListKeyPolicyResponseBodyPolicyValidityPeriod validityPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_access_point")

    private List<String> allowedAccessPoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_data_security_zone")

    private List<String> allowedDataSecurityZone = null;

    public ShowKeyPolicyResponseBodyPolicy withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 密钥策略版本 **取值范围：** 不涉及
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowKeyPolicyResponseBodyPolicy withValidityPeriod(
        ListKeyPolicyResponseBodyPolicyValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public ShowKeyPolicyResponseBodyPolicy withValidityPeriod(
        Consumer<ListKeyPolicyResponseBodyPolicyValidityPeriod> validityPeriodSetter) {
        if (this.validityPeriod == null) {
            this.validityPeriod = new ListKeyPolicyResponseBodyPolicyValidityPeriod();
            validityPeriodSetter.accept(this.validityPeriod);
        }

        return this;
    }

    /**
     * Get validityPeriod
     * @return validityPeriod
     */
    public ListKeyPolicyResponseBodyPolicyValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(ListKeyPolicyResponseBodyPolicyValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public ShowKeyPolicyResponseBodyPolicy withAllowedAccessPoint(List<String> allowedAccessPoint) {
        this.allowedAccessPoint = allowedAccessPoint;
        return this;
    }

    public ShowKeyPolicyResponseBodyPolicy addAllowedAccessPointItem(String allowedAccessPointItem) {
        if (this.allowedAccessPoint == null) {
            this.allowedAccessPoint = new ArrayList<>();
        }
        this.allowedAccessPoint.add(allowedAccessPointItem);
        return this;
    }

    public ShowKeyPolicyResponseBodyPolicy withAllowedAccessPoint(Consumer<List<String>> allowedAccessPointSetter) {
        if (this.allowedAccessPoint == null) {
            this.allowedAccessPoint = new ArrayList<>();
        }
        allowedAccessPointSetter.accept(this.allowedAccessPoint);
        return this;
    }

    /**
     * **参数解释：** 允许访问的接入点ID列表 **取值范围：** 不涉及
     * @return allowedAccessPoint
     */
    public List<String> getAllowedAccessPoint() {
        return allowedAccessPoint;
    }

    public void setAllowedAccessPoint(List<String> allowedAccessPoint) {
        this.allowedAccessPoint = allowedAccessPoint;
    }

    public ShowKeyPolicyResponseBodyPolicy withAllowedDataSecurityZone(List<String> allowedDataSecurityZone) {
        this.allowedDataSecurityZone = allowedDataSecurityZone;
        return this;
    }

    public ShowKeyPolicyResponseBodyPolicy addAllowedDataSecurityZoneItem(String allowedDataSecurityZoneItem) {
        if (this.allowedDataSecurityZone == null) {
            this.allowedDataSecurityZone = new ArrayList<>();
        }
        this.allowedDataSecurityZone.add(allowedDataSecurityZoneItem);
        return this;
    }

    public ShowKeyPolicyResponseBodyPolicy withAllowedDataSecurityZone(
        Consumer<List<String>> allowedDataSecurityZoneSetter) {
        if (this.allowedDataSecurityZone == null) {
            this.allowedDataSecurityZone = new ArrayList<>();
        }
        allowedDataSecurityZoneSetter.accept(this.allowedDataSecurityZone);
        return this;
    }

    /**
     * **参数解释：** 允许访问的数据安全专区ID列表 **取值范围：** 不涉及
     * @return allowedDataSecurityZone
     */
    public List<String> getAllowedDataSecurityZone() {
        return allowedDataSecurityZone;
    }

    public void setAllowedDataSecurityZone(List<String> allowedDataSecurityZone) {
        this.allowedDataSecurityZone = allowedDataSecurityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKeyPolicyResponseBodyPolicy that = (ShowKeyPolicyResponseBodyPolicy) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.validityPeriod, that.validityPeriod)
            && Objects.equals(this.allowedAccessPoint, that.allowedAccessPoint)
            && Objects.equals(this.allowedDataSecurityZone, that.allowedDataSecurityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, validityPeriod, allowedAccessPoint, allowedDataSecurityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKeyPolicyResponseBodyPolicy {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
        sb.append("    allowedAccessPoint: ").append(toIndentedString(allowedAccessPoint)).append("\n");
        sb.append("    allowedDataSecurityZone: ").append(toIndentedString(allowedDataSecurityZone)).append("\n");
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
