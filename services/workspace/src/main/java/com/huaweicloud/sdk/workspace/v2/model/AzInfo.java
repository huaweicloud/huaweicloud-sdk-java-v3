package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可用区信息。
 */
public class AzInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n")

    private I18n i18n;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_availability_zone")

    private Boolean defaultAvailabilityZone;

    public AzInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区名称。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public AzInfo withI18n(I18n i18n) {
        this.i18n = i18n;
        return this;
    }

    public AzInfo withI18n(Consumer<I18n> i18nSetter) {
        if (this.i18n == null) {
            this.i18n = new I18n();
            i18nSetter.accept(this.i18n);
        }

        return this;
    }

    /**
     * Get i18n
     * @return i18n
     */
    public I18n getI18n() {
        return i18n;
    }

    public void setI18n(I18n i18n) {
        this.i18n = i18n;
    }

    public AzInfo withDefaultAvailabilityZone(Boolean defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
        return this;
    }

    /**
     * 是否为默认可用分区。
     * @return defaultAvailabilityZone
     */
    public Boolean getDefaultAvailabilityZone() {
        return defaultAvailabilityZone;
    }

    public void setDefaultAvailabilityZone(Boolean defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AzInfo that = (AzInfo) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.i18n, that.i18n)
            && Objects.equals(this.defaultAvailabilityZone, that.defaultAvailabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, i18n, defaultAvailabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzInfo {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    i18n: ").append(toIndentedString(i18n)).append("\n");
        sb.append("    defaultAvailabilityZone: ").append(toIndentedString(defaultAvailabilityZone)).append("\n");
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
