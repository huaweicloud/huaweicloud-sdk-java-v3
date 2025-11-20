package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePostpaidInstanceOption
 */
public class CreatePostpaidInstanceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private AvailabilityZones availabilityZones;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_infos")

    private PostPaidChargeInfos chargeInfos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private String haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_info")

    private TunnelInfoOption tunnelInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreatePostpaidInstanceOption withAvailabilityZones(AvailabilityZones availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public CreatePostpaidInstanceOption withAvailabilityZones(Consumer<AvailabilityZones> availabilityZonesSetter) {
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

    public CreatePostpaidInstanceOption withChargeInfos(PostPaidChargeInfos chargeInfos) {
        this.chargeInfos = chargeInfos;
        return this;
    }

    public CreatePostpaidInstanceOption withChargeInfos(Consumer<PostPaidChargeInfos> chargeInfosSetter) {
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

    public CreatePostpaidInstanceOption withFlavorRef(String flavorRef) {
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

    public CreatePostpaidInstanceOption withHaMode(String haMode) {
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

    public CreatePostpaidInstanceOption withName(String name) {
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

    public CreatePostpaidInstanceOption withTunnelInfo(TunnelInfoOption tunnelInfo) {
        this.tunnelInfo = tunnelInfo;
        return this;
    }

    public CreatePostpaidInstanceOption withTunnelInfo(Consumer<TunnelInfoOption> tunnelInfoSetter) {
        if (this.tunnelInfo == null) {
            this.tunnelInfo = new TunnelInfoOption();
            tunnelInfoSetter.accept(this.tunnelInfo);
        }

        return this;
    }

    /**
     * Get tunnelInfo
     * @return tunnelInfo
     */
    public TunnelInfoOption getTunnelInfo() {
        return tunnelInfo;
    }

    public void setTunnelInfo(TunnelInfoOption tunnelInfo) {
        this.tunnelInfo = tunnelInfo;
    }

    public CreatePostpaidInstanceOption withDescription(String description) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePostpaidInstanceOption that = (CreatePostpaidInstanceOption) obj;
        return Objects.equals(this.availabilityZones, that.availabilityZones)
            && Objects.equals(this.chargeInfos, that.chargeInfos) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.haMode, that.haMode) && Objects.equals(this.name, that.name)
            && Objects.equals(this.tunnelInfo, that.tunnelInfo) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZones, chargeInfos, flavorRef, haMode, name, tunnelInfo, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostpaidInstanceOption {\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    chargeInfos: ").append(toIndentedString(chargeInfos)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tunnelInfo: ").append(toIndentedString(tunnelInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
