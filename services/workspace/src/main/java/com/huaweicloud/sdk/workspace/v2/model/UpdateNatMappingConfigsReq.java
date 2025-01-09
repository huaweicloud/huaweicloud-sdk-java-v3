package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改租户NAT映射配置请求体。
 */
public class UpdateNatMappingConfigsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_on")

    private Boolean natOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_vag_maps")

    private List<UpdateNatMappingConfig> natVagMaps = null;

    public UpdateNatMappingConfigsReq withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public UpdateNatMappingConfigsReq withNatOn(Boolean natOn) {
        this.natOn = natOn;
        return this;
    }

    /**
     * 是否开启nat映射。
     * @return natOn
     */
    public Boolean getNatOn() {
        return natOn;
    }

    public void setNatOn(Boolean natOn) {
        this.natOn = natOn;
    }

    public UpdateNatMappingConfigsReq withNatVagMaps(List<UpdateNatMappingConfig> natVagMaps) {
        this.natVagMaps = natVagMaps;
        return this;
    }

    public UpdateNatMappingConfigsReq addNatVagMapsItem(UpdateNatMappingConfig natVagMapsItem) {
        if (this.natVagMaps == null) {
            this.natVagMaps = new ArrayList<>();
        }
        this.natVagMaps.add(natVagMapsItem);
        return this;
    }

    public UpdateNatMappingConfigsReq withNatVagMaps(Consumer<List<UpdateNatMappingConfig>> natVagMapsSetter) {
        if (this.natVagMaps == null) {
            this.natVagMaps = new ArrayList<>();
        }
        natVagMapsSetter.accept(this.natVagMaps);
        return this;
    }

    /**
     * NAT映射配置表。
     * @return natVagMaps
     */
    public List<UpdateNatMappingConfig> getNatVagMaps() {
        return natVagMaps;
    }

    public void setNatVagMaps(List<UpdateNatMappingConfig> natVagMaps) {
        this.natVagMaps = natVagMaps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNatMappingConfigsReq that = (UpdateNatMappingConfigsReq) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.natOn, that.natOn)
            && Objects.equals(this.natVagMaps, that.natVagMaps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, natOn, natVagMaps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatMappingConfigsReq {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    natOn: ").append(toIndentedString(natOn)).append("\n");
        sb.append("    natVagMaps: ").append(toIndentedString(natVagMaps)).append("\n");
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
