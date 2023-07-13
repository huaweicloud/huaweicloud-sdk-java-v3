package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CbcFreezeInfo
 */
public class CbcFreezeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private Integer effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private CbcFreezeScene scene;

    public CbcFreezeInfo withEffect(Integer effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 在冻结/解冻等操作下，云服务需要达到的主要效果：  - 1：（实现/去除）冻结可释放。（资源冻结后，客户可以手动删除/释放云资源和云资源上数据）  - 2：（实现/去除）冻结不可释放。（资源冻结后，客户不能手动删除/释放云资源以及云资源上数据，相当于云服务被贴了封条，不能改变数据和资源。对应解冻后，就可以删除和修改客户数据了）  - 3：（实现/去除）冻结后不可续费。（资源冻结后，资源不能发起续费操作；解冻后，才可以发起续费操作）  - effect字段和上面status字段(1冻结、0解冻)配合使用，表示在发起冻结/解冻命令下，云服务达到的冻结效果。  - 为空时，默认为effect=1（云服务需要能兼容处理，默认当做effect=1）。  - 注：云服务是根据status和effect在真实限制云服务的操作/API等。不是使用下文的scene字段去做云服务操作/API的限制。下文的scene字段，主要用于Console页面的tips、API错误码等客户体验使用。
     * minimum: 1
     * maximum: 3
     * @return effect
     */
    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }

    public CbcFreezeInfo withScene(CbcFreezeScene scene) {
        this.scene = scene;
        return this;
    }

    /**
     * Get scene
     * @return scene
     */
    public CbcFreezeScene getScene() {
        return scene;
    }

    public void setScene(CbcFreezeScene scene) {
        this.scene = scene;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CbcFreezeInfo that = (CbcFreezeInfo) obj;
        return Objects.equals(this.effect, that.effect) && Objects.equals(this.scene, that.scene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effect, scene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbcFreezeInfo {\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
