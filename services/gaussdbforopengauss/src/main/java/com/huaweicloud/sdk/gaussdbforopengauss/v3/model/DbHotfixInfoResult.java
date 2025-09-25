package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DbHotfixInfoResult
 */
public class DbHotfixInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_modes")

    private List<HotfixDeployMode> deployModes = null;

    public DbHotfixInfoResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 热补丁版本。 **取值范围**： 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DbHotfixInfoResult withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 热补丁的创建时间，UNIX时间戳格式，单位是毫秒。 **取值范围**： 不涉及。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public DbHotfixInfoResult withDeployModes(List<HotfixDeployMode> deployModes) {
        this.deployModes = deployModes;
        return this;
    }

    public DbHotfixInfoResult addDeployModesItem(HotfixDeployMode deployModesItem) {
        if (this.deployModes == null) {
            this.deployModes = new ArrayList<>();
        }
        this.deployModes.add(deployModesItem);
        return this;
    }

    public DbHotfixInfoResult withDeployModes(Consumer<List<HotfixDeployMode>> deployModesSetter) {
        if (this.deployModes == null) {
            this.deployModes = new ArrayList<>();
        }
        deployModesSetter.accept(this.deployModes);
        return this;
    }

    /**
     * **参数解释**： 可升级该补丁的实例部署形态信息。
     * @return deployModes
     */
    public List<HotfixDeployMode> getDeployModes() {
        return deployModes;
    }

    public void setDeployModes(List<HotfixDeployMode> deployModes) {
        this.deployModes = deployModes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbHotfixInfoResult that = (DbHotfixInfoResult) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.deployModes, that.deployModes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, createTime, deployModes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbHotfixInfoResult {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deployModes: ").append(toIndentedString(deployModes)).append("\n");
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
