package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class DomainMigrate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_regions")

    private Boolean allRegions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reservation")

    private Float reservation;

    public DomainMigrate withAllRegions(Boolean allRegions) {
        this.allRegions = allRegions;
        return this;
    }

    /**
     * 是否触发其他区域迁移
     * @return allRegions
     */
    public Boolean getAllRegions() {
        return allRegions;
    }

    public void setAllRegions(Boolean allRegions) {
        this.allRegions = allRegions;
    }

    public DomainMigrate withReservation(Float reservation) {
        this.reservation = reservation;
        return this;
    }

    /**
     * 存储库默认扩容比，取值范围0到1
     * minimum: 0
     * maximum: 1
     * @return reservation
     */
    public Float getReservation() {
        return reservation;
    }

    public void setReservation(Float reservation) {
        this.reservation = reservation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainMigrate domainMigrate = (DomainMigrate) o;
        return Objects.equals(this.allRegions, domainMigrate.allRegions)
            && Objects.equals(this.reservation, domainMigrate.reservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allRegions, reservation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainMigrate {\n");
        sb.append("    allRegions: ").append(toIndentedString(allRegions)).append("\n");
        sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
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
