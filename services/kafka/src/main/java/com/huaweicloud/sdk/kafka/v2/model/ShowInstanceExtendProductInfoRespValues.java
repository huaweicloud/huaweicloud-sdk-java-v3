package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowInstanceExtendProductInfoRespValues
 */
public class ShowInstanceExtendProductInfoRespValues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private List<ShowInstanceExtendProductInfoRespDetail> detail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_zones")

    private List<String> unavailableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    public ShowInstanceExtendProductInfoRespValues withDetail(List<ShowInstanceExtendProductInfoRespDetail> detail) {
        this.detail = detail;
        return this;
    }

    public ShowInstanceExtendProductInfoRespValues addDetailItem(ShowInstanceExtendProductInfoRespDetail detailItem) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    public ShowInstanceExtendProductInfoRespValues withDetail(
        Consumer<List<ShowInstanceExtendProductInfoRespDetail>> detailSetter) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        detailSetter.accept(this.detail);
        return this;
    }

    /**
     * 规格详情。
     * @return detail
     */
    public List<ShowInstanceExtendProductInfoRespDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<ShowInstanceExtendProductInfoRespDetail> detail) {
        this.detail = detail;
    }

    public ShowInstanceExtendProductInfoRespValues withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例类型。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceExtendProductInfoRespValues withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    public ShowInstanceExtendProductInfoRespValues addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public ShowInstanceExtendProductInfoRespValues withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        unavailableZonesSetter.accept(this.unavailableZones);
        return this;
    }

    /**
     * 资源售罄的可用区列表。
     * @return unavailableZones
     */
    public List<String> getUnavailableZones() {
        return unavailableZones;
    }

    public void setUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
    }

    public ShowInstanceExtendProductInfoRespValues withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ShowInstanceExtendProductInfoRespValues addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ShowInstanceExtendProductInfoRespValues withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 有可用资源的可用区列表。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceExtendProductInfoRespValues that = (ShowInstanceExtendProductInfoRespValues) obj;
        return Objects.equals(this.detail, that.detail) && Objects.equals(this.name, that.name)
            && Objects.equals(this.unavailableZones, that.unavailableZones)
            && Objects.equals(this.availableZones, that.availableZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, name, unavailableZones, availableZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceExtendProductInfoRespValues {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    unavailableZones: ").append(toIndentedString(unavailableZones)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
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
