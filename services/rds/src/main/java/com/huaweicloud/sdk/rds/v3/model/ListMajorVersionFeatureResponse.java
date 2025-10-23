package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMajorVersionFeatureResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_upgrade_version")

    private List<String> supportUpgradeVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_recover_version")

    private List<String> supportRecoverVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_file_stream")

    private Boolean supportFileStream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_tde")

    private Boolean supportTde;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_always_on")

    private Boolean supportAlwaysOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_read_only")

    private Boolean supportReadOnly;

    public ListMajorVersionFeatureResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本名称。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListMajorVersionFeatureResponse withSupportUpgradeVersion(List<String> supportUpgradeVersion) {
        this.supportUpgradeVersion = supportUpgradeVersion;
        return this;
    }

    public ListMajorVersionFeatureResponse addSupportUpgradeVersionItem(String supportUpgradeVersionItem) {
        if (this.supportUpgradeVersion == null) {
            this.supportUpgradeVersion = new ArrayList<>();
        }
        this.supportUpgradeVersion.add(supportUpgradeVersionItem);
        return this;
    }

    public ListMajorVersionFeatureResponse withSupportUpgradeVersion(
        Consumer<List<String>> supportUpgradeVersionSetter) {
        if (this.supportUpgradeVersion == null) {
            this.supportUpgradeVersion = new ArrayList<>();
        }
        supportUpgradeVersionSetter.accept(this.supportUpgradeVersion);
        return this;
    }

    /**
     * 支持升级的版本列表。
     * @return supportUpgradeVersion
     */
    public List<String> getSupportUpgradeVersion() {
        return supportUpgradeVersion;
    }

    public void setSupportUpgradeVersion(List<String> supportUpgradeVersion) {
        this.supportUpgradeVersion = supportUpgradeVersion;
    }

    public ListMajorVersionFeatureResponse withSupportRecoverVersion(List<String> supportRecoverVersion) {
        this.supportRecoverVersion = supportRecoverVersion;
        return this;
    }

    public ListMajorVersionFeatureResponse addSupportRecoverVersionItem(String supportRecoverVersionItem) {
        if (this.supportRecoverVersion == null) {
            this.supportRecoverVersion = new ArrayList<>();
        }
        this.supportRecoverVersion.add(supportRecoverVersionItem);
        return this;
    }

    public ListMajorVersionFeatureResponse withSupportRecoverVersion(
        Consumer<List<String>> supportRecoverVersionSetter) {
        if (this.supportRecoverVersion == null) {
            this.supportRecoverVersion = new ArrayList<>();
        }
        supportRecoverVersionSetter.accept(this.supportRecoverVersion);
        return this;
    }

    /**
     * 支持备份恢复的版本列表。
     * @return supportRecoverVersion
     */
    public List<String> getSupportRecoverVersion() {
        return supportRecoverVersion;
    }

    public void setSupportRecoverVersion(List<String> supportRecoverVersion) {
        this.supportRecoverVersion = supportRecoverVersion;
    }

    public ListMajorVersionFeatureResponse withSupportFileStream(Boolean supportFileStream) {
        this.supportFileStream = supportFileStream;
        return this;
    }

    /**
     * 是否支持FileStream特性。
     * @return supportFileStream
     */
    public Boolean getSupportFileStream() {
        return supportFileStream;
    }

    public void setSupportFileStream(Boolean supportFileStream) {
        this.supportFileStream = supportFileStream;
    }

    public ListMajorVersionFeatureResponse withSupportTde(Boolean supportTde) {
        this.supportTde = supportTde;
        return this;
    }

    /**
     * 是否支持透明数据加密。
     * @return supportTde
     */
    public Boolean getSupportTde() {
        return supportTde;
    }

    public void setSupportTde(Boolean supportTde) {
        this.supportTde = supportTde;
    }

    public ListMajorVersionFeatureResponse withSupportAlwaysOn(Boolean supportAlwaysOn) {
        this.supportAlwaysOn = supportAlwaysOn;
        return this;
    }

    /**
     * 是否支持Always On。
     * @return supportAlwaysOn
     */
    public Boolean getSupportAlwaysOn() {
        return supportAlwaysOn;
    }

    public void setSupportAlwaysOn(Boolean supportAlwaysOn) {
        this.supportAlwaysOn = supportAlwaysOn;
    }

    public ListMajorVersionFeatureResponse withSupportReadOnly(Boolean supportReadOnly) {
        this.supportReadOnly = supportReadOnly;
        return this;
    }

    /**
     * 是否支持只读。
     * @return supportReadOnly
     */
    public Boolean getSupportReadOnly() {
        return supportReadOnly;
    }

    public void setSupportReadOnly(Boolean supportReadOnly) {
        this.supportReadOnly = supportReadOnly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMajorVersionFeatureResponse that = (ListMajorVersionFeatureResponse) obj;
        return Objects.equals(this.version, that.version)
            && Objects.equals(this.supportUpgradeVersion, that.supportUpgradeVersion)
            && Objects.equals(this.supportRecoverVersion, that.supportRecoverVersion)
            && Objects.equals(this.supportFileStream, that.supportFileStream)
            && Objects.equals(this.supportTde, that.supportTde)
            && Objects.equals(this.supportAlwaysOn, that.supportAlwaysOn)
            && Objects.equals(this.supportReadOnly, that.supportReadOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            supportUpgradeVersion,
            supportRecoverVersion,
            supportFileStream,
            supportTde,
            supportAlwaysOn,
            supportReadOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMajorVersionFeatureResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    supportUpgradeVersion: ").append(toIndentedString(supportUpgradeVersion)).append("\n");
        sb.append("    supportRecoverVersion: ").append(toIndentedString(supportRecoverVersion)).append("\n");
        sb.append("    supportFileStream: ").append(toIndentedString(supportFileStream)).append("\n");
        sb.append("    supportTde: ").append(toIndentedString(supportTde)).append("\n");
        sb.append("    supportAlwaysOn: ").append(toIndentedString(supportAlwaysOn)).append("\n");
        sb.append("    supportReadOnly: ").append(toIndentedString(supportReadOnly)).append("\n");
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
