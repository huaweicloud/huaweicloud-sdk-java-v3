package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 同步节点池模板参数
 */
public class UpgradeNodePoolSpecNodeTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifeCycle")

    private NodeLifecycleConfig lifeCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Login login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeConfig")

    private VolumeConfig volumeConfig;

    public UpgradeNodePoolSpecNodeTemplate withLifeCycle(NodeLifecycleConfig lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    public UpgradeNodePoolSpecNodeTemplate withLifeCycle(Consumer<NodeLifecycleConfig> lifeCycleSetter) {
        if (this.lifeCycle == null) {
            this.lifeCycle = new NodeLifecycleConfig();
            lifeCycleSetter.accept(this.lifeCycle);
        }

        return this;
    }

    /**
     * Get lifeCycle
     * @return lifeCycle
     */
    public NodeLifecycleConfig getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(NodeLifecycleConfig lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public UpgradeNodePoolSpecNodeTemplate withLogin(Login login) {
        this.login = login;
        return this;
    }

    public UpgradeNodePoolSpecNodeTemplate withLogin(Consumer<Login> loginSetter) {
        if (this.login == null) {
            this.login = new Login();
            loginSetter.accept(this.login);
        }

        return this;
    }

    /**
     * Get login
     * @return login
     */
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public UpgradeNodePoolSpecNodeTemplate withVolumeConfig(VolumeConfig volumeConfig) {
        this.volumeConfig = volumeConfig;
        return this;
    }

    public UpgradeNodePoolSpecNodeTemplate withVolumeConfig(Consumer<VolumeConfig> volumeConfigSetter) {
        if (this.volumeConfig == null) {
            this.volumeConfig = new VolumeConfig();
            volumeConfigSetter.accept(this.volumeConfig);
        }

        return this;
    }

    /**
     * Get volumeConfig
     * @return volumeConfig
     */
    public VolumeConfig getVolumeConfig() {
        return volumeConfig;
    }

    public void setVolumeConfig(VolumeConfig volumeConfig) {
        this.volumeConfig = volumeConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeNodePoolSpecNodeTemplate that = (UpgradeNodePoolSpecNodeTemplate) obj;
        return Objects.equals(this.lifeCycle, that.lifeCycle) && Objects.equals(this.login, that.login)
            && Objects.equals(this.volumeConfig, that.volumeConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lifeCycle, login, volumeConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeNodePoolSpecNodeTemplate {\n");
        sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    volumeConfig: ").append(toIndentedString(volumeConfig)).append("\n");
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
