package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Instance
 */
public class Instance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private String haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_info")

    private TunnelInfoResult tunnelInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_infos")

    private PostPaidChargeInfos chargeInfos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private AvailabilityZones availabilityZones;

    public Instance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * - 参数解释：ESW实例的唯一标识。 - 约束限制：带“-”的UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 参数解释：ESW实例名称。 - 约束限制：   - 长度范围为1~64个字符。   - 名称由中文、英文字母、数字、下划线（_）、中划线（-）、点（.）组成。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instance withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * - 参数解释：ESW实例所属项目ID。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Instance withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * - 参数解释：ESW实例所属region的ID。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Instance withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * - 参数解释：ESW实例规格。 - 约束限制：不涉及。 - 取值范围：参考flavor list接口响应。 - 默认取值：不涉及。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public Instance withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * - 参数解释：ESW实例的高可用模式。 - 约束限制：当前只支持设置ha。 - 取值范围：ha。 - 默认取值：不涉及。
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public Instance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * - 参数解释：ESW实例的状态。 - 约束限制：不涉及。 - 取值范围：   - active：运行中   - failed：创建失败   - abnormal：异常   - build：创建中   - frozen：已冻结 - 默认取值：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instance withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * - 参数解释：ESW实例创建时间。 - 约束限制：UTC时间，格式为yyyy-MM-ddTHH:mm:ss。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Instance withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * - 参数解释：ESW实例更新时间。 - 约束限制：UTC时间，格式为yyyy-MM-ddTHH:mm:ss。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instance withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * - 参数解释：ESW实例描述信息。 - 约束限制：   - 长度范围为0~255个字符。   - 不能包含“<”和“>”。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instance withTunnelInfo(TunnelInfoResult tunnelInfo) {
        this.tunnelInfo = tunnelInfo;
        return this;
    }

    public Instance withTunnelInfo(Consumer<TunnelInfoResult> tunnelInfoSetter) {
        if (this.tunnelInfo == null) {
            this.tunnelInfo = new TunnelInfoResult();
            tunnelInfoSetter.accept(this.tunnelInfo);
        }

        return this;
    }

    /**
     * Get tunnelInfo
     * @return tunnelInfo
     */
    public TunnelInfoResult getTunnelInfo() {
        return tunnelInfo;
    }

    public void setTunnelInfo(TunnelInfoResult tunnelInfo) {
        this.tunnelInfo = tunnelInfo;
    }

    public Instance withChargeInfos(PostPaidChargeInfos chargeInfos) {
        this.chargeInfos = chargeInfos;
        return this;
    }

    public Instance withChargeInfos(Consumer<PostPaidChargeInfos> chargeInfosSetter) {
        if (this.chargeInfos == null) {
            this.chargeInfos = new PostPaidChargeInfos();
            chargeInfosSetter.accept(this.chargeInfos);
        }

        return this;
    }

    /**
     * Get chargeInfos
     * @return chargeInfos
     */
    public PostPaidChargeInfos getChargeInfos() {
        return chargeInfos;
    }

    public void setChargeInfos(PostPaidChargeInfos chargeInfos) {
        this.chargeInfos = chargeInfos;
    }

    public Instance withAvailabilityZones(AvailabilityZones availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public Instance withAvailabilityZones(Consumer<AvailabilityZones> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new AvailabilityZones();
            availabilityZonesSetter.accept(this.availabilityZones);
        }

        return this;
    }

    /**
     * Get availabilityZones
     * @return availabilityZones
     */
    public AvailabilityZones getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(AvailabilityZones availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Instance that = (Instance) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.haMode, that.haMode)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.description, that.description)
            && Objects.equals(this.tunnelInfo, that.tunnelInfo) && Objects.equals(this.chargeInfos, that.chargeInfos)
            && Objects.equals(this.availabilityZones, that.availabilityZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            projectId,
            region,
            flavorRef,
            haMode,
            status,
            createdAt,
            updatedAt,
            description,
            tunnelInfo,
            chargeInfos,
            availabilityZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Instance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tunnelInfo: ").append(toIndentedString(tunnelInfo)).append("\n");
        sb.append("    chargeInfos: ").append(toIndentedString(chargeInfos)).append("\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
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
