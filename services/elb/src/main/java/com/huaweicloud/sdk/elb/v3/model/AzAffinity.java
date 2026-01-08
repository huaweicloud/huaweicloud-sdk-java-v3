package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AzAffinity
 */
public class AzAffinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_minimum_healthy_member_percentage")

    private Integer azMinimumHealthyMemberPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_minimum_healthy_member_count")

    private Integer azMinimumHealthyMemberCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_unhealthy_fallback_strategy")

    private String azUnhealthyFallbackStrategy;

    public AzAffinity withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**：后端服务器组是否开启可用区亲和。开启后，负载均衡器会按照配置的亲和策略进行转发。  **约束限制**： - 仅IP,TCP,UDP的pool支持。 - TLS监听器绑定的pool不支持。 - 开启后，原本的pool_health配置失效。  **取值范围**：false不开启，true开启。  **默认取值**：不涉及
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public AzAffinity withAzMinimumHealthyMemberPercentage(Integer azMinimumHealthyMemberPercentage) {
        this.azMinimumHealthyMemberPercentage = azMinimumHealthyMemberPercentage;
        return this;
    }

    /**
     * **参数解释**：后端服务器组单可用区百分比健康度最小阈值，当“后端服务器组单可用区百分比健康度”小于该阈值时，触发可用区异常退避策略。“后端服务器组单可用区百分比健康度”是指在一个后端服务器组中，同可用区中健康检查结果正常的服务器数量与该后端服务器组中属于该可用区的后端服务器总数量的比值，百分比结果向上取整。例如：后端服务器组中属于可用区A的后端服务器总数量为3，设置后端服务器组单可用区百分比健康度最小阈值为66时，3x0.66=1.98向上取整为数量阈值2台，即属于可用区A的健康后端数小于2台时触发退避策略；设置后端服务器组单可用区百分比健康度最小阈值为67时，3x0.67=2.01向上取整为数量阈值3台，即属于可用区A的健康后端数小于3台时触发退避策略。  **约束限制**： - enable为true时，az_minimum_healthy_member_percentage与az_minimum_healthy_member_count不能同时为-1 - enable为true时，az_minimum_healthy_member_percentage与az_minimum_healthy_member_count不能同时不为-1  **取值范围**：-1至100的整数，0-100为百分比范围，-1表示采用数量阈值。  **默认取值**：不涉及
     * @return azMinimumHealthyMemberPercentage
     */
    public Integer getAzMinimumHealthyMemberPercentage() {
        return azMinimumHealthyMemberPercentage;
    }

    public void setAzMinimumHealthyMemberPercentage(Integer azMinimumHealthyMemberPercentage) {
        this.azMinimumHealthyMemberPercentage = azMinimumHealthyMemberPercentage;
    }

    public AzAffinity withAzMinimumHealthyMemberCount(Integer azMinimumHealthyMemberCount) {
        this.azMinimumHealthyMemberCount = azMinimumHealthyMemberCount;
        return this;
    }

    /**
     * **参数解释**：后端服务器组单可用区中数量健康度最小阈值，当“后端服务器组单可用区中数量健康度”小于该阈值时，触发可用区异常退避策略。“后端服务器组单可用区中数量健康度”是指在一个后端服务器组中，属于同一个可用区的健康检查结果正常的服务器数量。  **约束限制**： - enable为true时，az_minimum_healthy_member_percentage与az_minimum_healthy_member_count不能同时为-1 - enable为true时，az_minimum_healthy_member_percentage与az_minimum_healthy_member_count不能同时不为-1  **取值范围**：-1至10000的整数，0-10000为数量范围，-1表示采用百分比阈值。  **默认取值**：不涉及
     * @return azMinimumHealthyMemberCount
     */
    public Integer getAzMinimumHealthyMemberCount() {
        return azMinimumHealthyMemberCount;
    }

    public void setAzMinimumHealthyMemberCount(Integer azMinimumHealthyMemberCount) {
        this.azMinimumHealthyMemberCount = azMinimumHealthyMemberCount;
    }

    public AzAffinity withAzUnhealthyFallbackStrategy(String azUnhealthyFallbackStrategy) {
        this.azUnhealthyFallbackStrategy = azUnhealthyFallbackStrategy;
        return this;
    }

    /**
     * **参数解释**：后端服务器组单可用区异常退避策略。后端服务器组的健康度小于所配置的最小阈值时，触发该退避策略。forward_to_all_member_of_local_az：转发至同可用区的所有后端服务器，无论健康检查结果是否正常；forward_to_healthy_member_of_remote_az：转发至非同可用区中所有健康检查结果正常的后端服务器；forward_to_all_healthy_member：转发至所有可用区中健康检查结果正常的后端服务器；forward_to_all_member：转发至所有可用区中的所有后端服务器，无论健康检查结果是否正常  **约束限制**：不涉及  **取值范围**：forward_to_all_member_of_local_az，forward_to_healthy_member_of_remote_az，forward_to_all_healthy_member，forward_to_all_member。  **默认取值**：forward_to_all_member_of_local_az
     * @return azUnhealthyFallbackStrategy
     */
    public String getAzUnhealthyFallbackStrategy() {
        return azUnhealthyFallbackStrategy;
    }

    public void setAzUnhealthyFallbackStrategy(String azUnhealthyFallbackStrategy) {
        this.azUnhealthyFallbackStrategy = azUnhealthyFallbackStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AzAffinity that = (AzAffinity) obj;
        return Objects.equals(this.enable, that.enable)
            && Objects.equals(this.azMinimumHealthyMemberPercentage, that.azMinimumHealthyMemberPercentage)
            && Objects.equals(this.azMinimumHealthyMemberCount, that.azMinimumHealthyMemberCount)
            && Objects.equals(this.azUnhealthyFallbackStrategy, that.azUnhealthyFallbackStrategy);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enable, azMinimumHealthyMemberPercentage, azMinimumHealthyMemberCount, azUnhealthyFallbackStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzAffinity {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    azMinimumHealthyMemberPercentage: ")
            .append(toIndentedString(azMinimumHealthyMemberPercentage))
            .append("\n");
        sb.append("    azMinimumHealthyMemberCount: ")
            .append(toIndentedString(azMinimumHealthyMemberCount))
            .append("\n");
        sb.append("    azUnhealthyFallbackStrategy: ")
            .append(toIndentedString(azUnhealthyFallbackStrategy))
            .append("\n");
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
