package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GaussDB实例版本升级接口传参参数。
 */
public class UpgradeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_type")

    private String upgradeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_action")

    private String upgradeAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_shard_num")

    private Integer upgradeShardNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_az")

    private String upgradeAz;

    public UpgradeRequestBody withUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * **参数解释**: 实例升级类型，区分大小写。包括就地升级，灰度升级，热补丁升级三种，三种升级方式的异同，详见接口描述。 **约束限制**: 不涉及。 **取值范围**: - inplace：就地升级。 - grey：灰度升级。 - hotfix：热补丁升级。  **默认取值**:   不涉及。
     * @return upgradeType
     */
    public String getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
    }

    public UpgradeRequestBody withUpgradeAction(String upgradeAction) {
        this.upgradeAction = upgradeAction;
        return this;
    }

    /**
     * **参数解释**: 实例升级操作，区分大小写。 实例升级类型是就地升级时非必选。 灰度升级包括升级自动提交、升级待观察、提交升级和升级回退四种。 热补丁升级包括升级自动提交，升级回退两种。 **约束限制**: 不涉及。 **取值范围**: - upgradeAutoCommit：升级自动提交。 - upgrade：升级待观察。 - commit：提交升级。 - rollback：升级回退。  **默认取值**:   不涉及。
     * @return upgradeAction
     */
    public String getUpgradeAction() {
        return upgradeAction;
    }

    public void setUpgradeAction(String upgradeAction) {
        this.upgradeAction = upgradeAction;
    }

    public UpgradeRequestBody withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * **参数解释**: 实例升级目标版本。 **约束限制**: - 热补丁升级场景下支持传入多个热补丁版本。  **取值范围**:   不涉及。 **默认取值**: 不涉及。
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public UpgradeRequestBody withUpgradeShardNum(Integer upgradeShardNum) {
        this.upgradeShardNum = upgradeShardNum;
        return this;
    }

    /**
     * **参数解释**: 分布式实例灰度升级，滚动升级分片数。分布式实例灰度升级，升级待观察必填。该值不能大于实例未升级分片总数。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return upgradeShardNum
     */
    public Integer getUpgradeShardNum() {
        return upgradeShardNum;
    }

    public void setUpgradeShardNum(Integer upgradeShardNum) {
        this.upgradeShardNum = upgradeShardNum;
    }

    public UpgradeRequestBody withUpgradeAz(String upgradeAz) {
        this.upgradeAz = upgradeAz;
        return this;
    }

    /**
     * **参数解释**: 灰度升级，升级待观察AZ值，升级待观察时必填。可以支持多AZ一起升级，AZ之间以英文逗号分隔。不能填入不属于该实例的AZ值。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return upgradeAz
     */
    public String getUpgradeAz() {
        return upgradeAz;
    }

    public void setUpgradeAz(String upgradeAz) {
        this.upgradeAz = upgradeAz;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeRequestBody that = (UpgradeRequestBody) obj;
        return Objects.equals(this.upgradeType, that.upgradeType)
            && Objects.equals(this.upgradeAction, that.upgradeAction)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.upgradeShardNum, that.upgradeShardNum)
            && Objects.equals(this.upgradeAz, that.upgradeAz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeType, upgradeAction, targetVersion, upgradeShardNum, upgradeAz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeRequestBody {\n");
        sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
        sb.append("    upgradeAction: ").append(toIndentedString(upgradeAction)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    upgradeShardNum: ").append(toIndentedString(upgradeShardNum)).append("\n");
        sb.append("    upgradeAz: ").append(toIndentedString(upgradeAz)).append("\n");
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
