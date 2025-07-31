package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AttackStatisticRespBody
 */
public class AttackStatisticRespBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<TopInfo> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_name")

    private String associatedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_type")

    private String associatedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_count")

    private Long attackCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private String attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_count")

    private Long denyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ports")

    private List<TopInfo> dstPorts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_time")

    private Long latestTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_type")

    private String srcType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    public AttackStatisticRespBody withApps(List<TopInfo> apps) {
        this.apps = apps;
        return this;
    }

    public AttackStatisticRespBody addAppsItem(TopInfo appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public AttackStatisticRespBody withApps(Consumer<List<TopInfo>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * **参数解释**： 应用列表 **取值范围**： 不涉及
     * @return apps
     */
    public List<TopInfo> getApps() {
        return apps;
    }

    public void setApps(List<TopInfo> apps) {
        this.apps = apps;
    }

    public AttackStatisticRespBody withAssociatedName(String associatedName) {
        this.associatedName = associatedName;
        return this;
    }

    /**
     * **参数解释**： 绑定资源名称 **取值范围**： 不涉及
     * @return associatedName
     */
    public String getAssociatedName() {
        return associatedName;
    }

    public void setAssociatedName(String associatedName) {
        this.associatedName = associatedName;
    }

    public AttackStatisticRespBody withAssociatedType(String associatedType) {
        this.associatedType = associatedType;
        return this;
    }

    /**
     * **参数解释**： 绑定资源类型 **取值范围**： 不涉及
     * @return associatedType
     */
    public String getAssociatedType() {
        return associatedType;
    }

    public void setAssociatedType(String associatedType) {
        this.associatedType = associatedType;
    }

    public AttackStatisticRespBody withAttackCount(Long attackCount) {
        this.attackCount = attackCount;
        return this;
    }

    /**
     * **参数解释**： 攻击次数 **取值范围**： 不涉及
     * @return attackCount
     */
    public Long getAttackCount() {
        return attackCount;
    }

    public void setAttackCount(Long attackCount) {
        this.attackCount = attackCount;
    }

    public AttackStatisticRespBody withAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * **参数解释**： 攻击类型 **取值范围**： 不涉及
     * @return attackType
     */
    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public AttackStatisticRespBody withDenyCount(Long denyCount) {
        this.denyCount = denyCount;
        return this;
    }

    /**
     * **参数解释**： 拦截次数 **取值范围**： 不涉及
     * @return denyCount
     */
    public Long getDenyCount() {
        return denyCount;
    }

    public void setDenyCount(Long denyCount) {
        this.denyCount = denyCount;
    }

    public AttackStatisticRespBody withDstPorts(List<TopInfo> dstPorts) {
        this.dstPorts = dstPorts;
        return this;
    }

    public AttackStatisticRespBody addDstPortsItem(TopInfo dstPortsItem) {
        if (this.dstPorts == null) {
            this.dstPorts = new ArrayList<>();
        }
        this.dstPorts.add(dstPortsItem);
        return this;
    }

    public AttackStatisticRespBody withDstPorts(Consumer<List<TopInfo>> dstPortsSetter) {
        if (this.dstPorts == null) {
            this.dstPorts = new ArrayList<>();
        }
        dstPortsSetter.accept(this.dstPorts);
        return this;
    }

    /**
     * **参数解释**： 目的端口列表 **取值范围**： 不涉及
     * @return dstPorts
     */
    public List<TopInfo> getDstPorts() {
        return dstPorts;
    }

    public void setDstPorts(List<TopInfo> dstPorts) {
        this.dstPorts = dstPorts;
    }

    public AttackStatisticRespBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**： IP地址 **取值范围**： 不涉及
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public AttackStatisticRespBody withLatestTime(Long latestTime) {
        this.latestTime = latestTime;
        return this;
    }

    /**
     * **参数解释**： 最近攻击时间 **取值范围**： 不涉及
     * @return latestTime
     */
    public Long getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Long latestTime) {
        this.latestTime = latestTime;
    }

    public AttackStatisticRespBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * **参数解释**： 地区ID **取值范围**： 不涉及
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AttackStatisticRespBody withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * **参数解释**： 地区名称 **取值范围**： 不涉及
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public AttackStatisticRespBody withSrcType(String srcType) {
        this.srcType = srcType;
        return this;
    }

    /**
     * **参数解释**： 攻击来源类型 **取值范围**： 不涉及
     * @return srcType
     */
    public String getSrcType() {
        return srcType;
    }

    public void setSrcType(String srcType) {
        this.srcType = srcType;
    }

    public AttackStatisticRespBody withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * **参数解释**： vgw Id **取值范围**： 不涉及
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttackStatisticRespBody that = (AttackStatisticRespBody) obj;
        return Objects.equals(this.apps, that.apps) && Objects.equals(this.associatedName, that.associatedName)
            && Objects.equals(this.associatedType, that.associatedType)
            && Objects.equals(this.attackCount, that.attackCount) && Objects.equals(this.attackType, that.attackType)
            && Objects.equals(this.denyCount, that.denyCount) && Objects.equals(this.dstPorts, that.dstPorts)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.latestTime, that.latestTime)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.srcType, that.srcType) && Objects.equals(this.vgwId, that.vgwId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apps,
            associatedName,
            associatedType,
            attackCount,
            attackType,
            denyCount,
            dstPorts,
            ip,
            latestTime,
            regionId,
            regionName,
            srcType,
            vgwId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackStatisticRespBody {\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    associatedName: ").append(toIndentedString(associatedName)).append("\n");
        sb.append("    associatedType: ").append(toIndentedString(associatedType)).append("\n");
        sb.append("    attackCount: ").append(toIndentedString(attackCount)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    denyCount: ").append(toIndentedString(denyCount)).append("\n");
        sb.append("    dstPorts: ").append(toIndentedString(dstPorts)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    latestTime: ").append(toIndentedString(latestTime)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    srcType: ").append(toIndentedString(srcType)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
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
