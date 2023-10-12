package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MeshCluster
 */
public class MeshCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectID")

    private String projectID;

    /**
     * 集群提供方
     */
    public static final class ProviderEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final ProviderEnum CCE = new ProviderEnum("CCE");

        private static final Map<String, ProviderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderEnum> createStaticFields() {
            Map<String, ProviderEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProviderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderEnum(value));
        }

        public static ProviderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderEnum) {
                return this.value.equals(((ProviderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private ProviderEnum provider;

    /**
     * 集群代理模式
     */
    public static final class ProxyModeEnum {

        /**
         * Enum SIDECAR for value: "sidecar"
         */
        public static final ProxyModeEnum SIDECAR = new ProxyModeEnum("sidecar");

        /**
         * Enum NODE for value: "node"
         */
        public static final ProxyModeEnum NODE = new ProxyModeEnum("node");

        private static final Map<String, ProxyModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProxyModeEnum> createStaticFields() {
            Map<String, ProxyModeEnum> map = new HashMap<>();
            map.put("sidecar", SIDECAR);
            map.put("node", NODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProxyModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProxyModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProxyModeEnum(value));
        }

        public static ProxyModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProxyModeEnum) {
                return this.value.equals(((ProxyModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyMode")

    private ProxyModeEnum proxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "injection")

    private InjectionConfig injection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installation")

    private InstallationConfig installation;

    public MeshCluster withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * 集群ID，资源唯一标识，通过该ID查询需要添加的集群。
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public MeshCluster withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 集群所在的Region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public MeshCluster withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * 集群所属的projectID
     * @return projectID
     */
    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public MeshCluster withProvider(ProviderEnum provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 集群提供方
     * @return provider
     */
    public ProviderEnum getProvider() {
        return provider;
    }

    public void setProvider(ProviderEnum provider) {
        this.provider = provider;
    }

    public MeshCluster withProxyMode(ProxyModeEnum proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }

    /**
     * 集群代理模式
     * @return proxyMode
     */
    public ProxyModeEnum getProxyMode() {
        return proxyMode;
    }

    public void setProxyMode(ProxyModeEnum proxyMode) {
        this.proxyMode = proxyMode;
    }

    public MeshCluster withInjection(InjectionConfig injection) {
        this.injection = injection;
        return this;
    }

    public MeshCluster withInjection(Consumer<InjectionConfig> injectionSetter) {
        if (this.injection == null) {
            this.injection = new InjectionConfig();
            injectionSetter.accept(this.injection);
        }

        return this;
    }

    /**
     * Get injection
     * @return injection
     */
    public InjectionConfig getInjection() {
        return injection;
    }

    public void setInjection(InjectionConfig injection) {
        this.injection = injection;
    }

    public MeshCluster withInstallation(InstallationConfig installation) {
        this.installation = installation;
        return this;
    }

    public MeshCluster withInstallation(Consumer<InstallationConfig> installationSetter) {
        if (this.installation == null) {
            this.installation = new InstallationConfig();
            installationSetter.accept(this.installation);
        }

        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    public InstallationConfig getInstallation() {
        return installation;
    }

    public void setInstallation(InstallationConfig installation) {
        this.installation = installation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MeshCluster that = (MeshCluster) obj;
        return Objects.equals(this.clusterID, that.clusterID) && Objects.equals(this.region, that.region)
            && Objects.equals(this.projectID, that.projectID) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.proxyMode, that.proxyMode) && Objects.equals(this.injection, that.injection)
            && Objects.equals(this.installation, that.installation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID, region, projectID, provider, proxyMode, injection, installation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeshCluster {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    proxyMode: ").append(toIndentedString(proxyMode)).append("\n");
        sb.append("    injection: ").append(toIndentedString(injection)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
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
