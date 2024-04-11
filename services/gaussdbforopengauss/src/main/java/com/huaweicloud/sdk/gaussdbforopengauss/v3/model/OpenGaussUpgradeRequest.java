package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GaussDB(for openGauss)实例版本升级接口传参参数。
 */
public class OpenGaussUpgradeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_type")

    private String upgradeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrde_action")

    private String upgrdeAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_shard_num")

    private Integer upgradeShardNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_az")

    private String upgradeAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_parallel_upgrade")

    private Boolean isParallelUpgrade;

    public OpenGaussUpgradeRequest withUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * 实例升级类型，包括就地升级，灰度升级，热补丁升级三种，三种升级方式的异同，详见接口描述。  inplace 就地升级  grey 灰度升级  hotfix 热补丁升级。
     * @return upgradeType
     */
    public String getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
    }

    public OpenGaussUpgradeRequest withUpgrdeAction(String upgrdeAction) {
        this.upgrdeAction = upgrdeAction;
        return this;
    }

    /**
     * 实例升级操作，就地升级无需传值。灰度升级包括升级自动提交，升级待观察，提交升级，升级回退四种。热补丁升级包括升级自动提交，升级回退两种。详见接口描述。  upgradeAutoCommit 升级自动提交  upgrade 升级待观察  commit 提交升级  rollback 升级回退。
     * @return upgrdeAction
     */
    public String getUpgrdeAction() {
        return upgrdeAction;
    }

    public void setUpgrdeAction(String upgrdeAction) {
        this.upgrdeAction = upgrdeAction;
    }

    public OpenGaussUpgradeRequest withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 实例升级目标版本，非必填。如果未传值则默认升级到当前实例的优选版本。仅热补丁升级方式下支持传入多个值，升级操作为升级自动提交，则实例版本从小到大批量升级，升级操作为升级回退，则实例版本从大到小批量回退。
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public OpenGaussUpgradeRequest withUpgradeShardNum(Integer upgradeShardNum) {
        this.upgradeShardNum = upgradeShardNum;
        return this;
    }

    /**
     * 分布式实例灰度升级，滚动升级分片数。分布式实例灰度升级，升级待观察必填。该值不能大于实例未升级分片总数。
     * @return upgradeShardNum
     */
    public Integer getUpgradeShardNum() {
        return upgradeShardNum;
    }

    public void setUpgradeShardNum(Integer upgradeShardNum) {
        this.upgradeShardNum = upgradeShardNum;
    }

    public OpenGaussUpgradeRequest withUpgradeAz(String upgradeAz) {
        this.upgradeAz = upgradeAz;
        return this;
    }

    /**
     * 主备版实例灰度升级，滚动升级az值，可以支持多az一起升级，az之间以’,’分割。集中式实例灰度升级，升级待观察必填。该值不能填入不属于该实例的az值。
     * @return upgradeAz
     */
    public String getUpgradeAz() {
        return upgradeAz;
    }

    public void setUpgradeAz(String upgradeAz) {
        this.upgradeAz = upgradeAz;
    }

    public OpenGaussUpgradeRequest withIsParallelUpgrade(Boolean isParallelUpgrade) {
        this.isParallelUpgrade = isParallelUpgrade;
        return this;
    }

    /**
     * 支持AZ内并行升级，升级时先升级所有备DN，再并行升级各分片主DN，最后并行升级CN。仅在灰度升级下有效且需要数据库版本大于等于3.200。
     * @return isParallelUpgrade
     */
    public Boolean getIsParallelUpgrade() {
        return isParallelUpgrade;
    }

    public void setIsParallelUpgrade(Boolean isParallelUpgrade) {
        this.isParallelUpgrade = isParallelUpgrade;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenGaussUpgradeRequest that = (OpenGaussUpgradeRequest) obj;
        return Objects.equals(this.upgradeType, that.upgradeType)
            && Objects.equals(this.upgrdeAction, that.upgrdeAction)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.upgradeShardNum, that.upgradeShardNum)
            && Objects.equals(this.upgradeAz, that.upgradeAz)
            && Objects.equals(this.isParallelUpgrade, that.isParallelUpgrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeType, upgrdeAction, targetVersion, upgradeShardNum, upgradeAz, isParallelUpgrade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussUpgradeRequest {\n");
        sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
        sb.append("    upgrdeAction: ").append(toIndentedString(upgrdeAction)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    upgradeShardNum: ").append(toIndentedString(upgradeShardNum)).append("\n");
        sb.append("    upgradeAz: ").append(toIndentedString(upgradeAz)).append("\n");
        sb.append("    isParallelUpgrade: ").append(toIndentedString(isParallelUpgrade)).append("\n");
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
