package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分支连接。
 */
public class SiteConnection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_network_id")

    private String siteNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private SiteConnectionStateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_pair")

    private List<DirectedEdge> edgePair = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_region_type")

    private CrossRegionTypeEnum crossRegionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_connection_bandwidth_id")

    private String globalConnectionBandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Long bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private Boolean isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_effect")

    private FrozenEffectEnum frozenEffect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_bind_bandwidth")

    private Boolean isBindBandwidth;

    public SiteConnection withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SiteConnection withSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
        return this;
    }

    /**
     * 实例ID。
     * @return siteNetworkId
     */
    public String getSiteNetworkId() {
        return siteNetworkId;
    }

    public void setSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
    }

    public SiteConnection withState(SiteConnectionStateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public SiteConnectionStateEnum getState() {
        return state;
    }

    public void setState(SiteConnectionStateEnum state) {
        this.state = state;
    }

    public SiteConnection withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public SiteConnection withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 实例更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SiteConnection withEdgePair(List<DirectedEdge> edgePair) {
        this.edgePair = edgePair;
        return this;
    }

    public SiteConnection addEdgePairItem(DirectedEdge edgePairItem) {
        if (this.edgePair == null) {
            this.edgePair = new ArrayList<>();
        }
        this.edgePair.add(edgePairItem);
        return this;
    }

    public SiteConnection withEdgePair(Consumer<List<DirectedEdge>> edgePairSetter) {
        if (this.edgePair == null) {
            this.edgePair = new ArrayList<>();
        }
        edgePairSetter.accept(this.edgePair);
        return this;
    }

    /**
     * 分支网络连接的两个端点定义，可能为两个点，也可能为两个单向边，长度固定为2的数组。
     * @return edgePair
     */
    public List<DirectedEdge> getEdgePair() {
        return edgePair;
    }

    public void setEdgePair(List<DirectedEdge> edgePair) {
        this.edgePair = edgePair;
    }

    public SiteConnection withCrossRegionType(CrossRegionTypeEnum crossRegionType) {
        this.crossRegionType = crossRegionType;
        return this;
    }

    /**
     * Get crossRegionType
     * @return crossRegionType
     */
    public CrossRegionTypeEnum getCrossRegionType() {
        return crossRegionType;
    }

    public void setCrossRegionType(CrossRegionTypeEnum crossRegionType) {
        this.crossRegionType = crossRegionType;
    }

    public SiteConnection withGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
        return this;
    }

    /**
     * 全域互联带宽ID。
     * @return globalConnectionBandwidthId
     */
    public String getGlobalConnectionBandwidthId() {
        return globalConnectionBandwidthId;
    }

    public void setGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
    }

    public SiteConnection withBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽值，单位Mbps。
     * minimum: 1
     * maximum: 999999
     * @return bandwidthSize
     */
    public Long getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public SiteConnection withIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 是否冻结
     * @return isFrozen
     */
    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public SiteConnection withFrozenEffect(FrozenEffectEnum frozenEffect) {
        this.frozenEffect = frozenEffect;
        return this;
    }

    /**
     * Get frozenEffect
     * @return frozenEffect
     */
    public FrozenEffectEnum getFrozenEffect() {
        return frozenEffect;
    }

    public void setFrozenEffect(FrozenEffectEnum frozenEffect) {
        this.frozenEffect = frozenEffect;
    }

    public SiteConnection withIsBindBandwidth(Boolean isBindBandwidth) {
        this.isBindBandwidth = isBindBandwidth;
        return this;
    }

    /**
     * 是否绑定带宽包。
     * @return isBindBandwidth
     */
    public Boolean getIsBindBandwidth() {
        return isBindBandwidth;
    }

    public void setIsBindBandwidth(Boolean isBindBandwidth) {
        this.isBindBandwidth = isBindBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteConnection that = (SiteConnection) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.siteNetworkId, that.siteNetworkId)
            && Objects.equals(this.state, that.state) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.edgePair, that.edgePair)
            && Objects.equals(this.crossRegionType, that.crossRegionType)
            && Objects.equals(this.globalConnectionBandwidthId, that.globalConnectionBandwidthId)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize) && Objects.equals(this.isFrozen, that.isFrozen)
            && Objects.equals(this.frozenEffect, that.frozenEffect)
            && Objects.equals(this.isBindBandwidth, that.isBindBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            siteNetworkId,
            state,
            createdAt,
            updatedAt,
            edgePair,
            crossRegionType,
            globalConnectionBandwidthId,
            bandwidthSize,
            isFrozen,
            frozenEffect,
            isBindBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteConnection {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    siteNetworkId: ").append(toIndentedString(siteNetworkId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    edgePair: ").append(toIndentedString(edgePair)).append("\n");
        sb.append("    crossRegionType: ").append(toIndentedString(crossRegionType)).append("\n");
        sb.append("    globalConnectionBandwidthId: ")
            .append(toIndentedString(globalConnectionBandwidthId))
            .append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    frozenEffect: ").append(toIndentedString(frozenEffect)).append("\n");
        sb.append("    isBindBandwidth: ").append(toIndentedString(isBindBandwidth)).append("\n");
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
