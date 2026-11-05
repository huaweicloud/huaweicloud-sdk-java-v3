package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新建托管PG实例请求（manage_type&#x3D;newly_instance时必填）。
 */
public class SupabaseInstanceCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private SupabaseDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private SupabaseVolumeConfig volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private SupabaseHaConfig ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagWithKeyValue> tags = null;

    public SupabaseInstanceCreateRequest withDatastore(SupabaseDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public SupabaseInstanceCreateRequest withDatastore(Consumer<SupabaseDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new SupabaseDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public SupabaseDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(SupabaseDatastore datastore) {
        this.datastore = datastore;
    }

    public SupabaseInstanceCreateRequest withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public SupabaseInstanceCreateRequest withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new ChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public ChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public SupabaseInstanceCreateRequest withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * PG实例规格码。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public SupabaseInstanceCreateRequest withVolume(SupabaseVolumeConfig volume) {
        this.volume = volume;
        return this;
    }

    public SupabaseInstanceCreateRequest withVolume(Consumer<SupabaseVolumeConfig> volumeSetter) {
        if (this.volume == null) {
            this.volume = new SupabaseVolumeConfig();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public SupabaseVolumeConfig getVolume() {
        return volume;
    }

    public void setVolume(SupabaseVolumeConfig volume) {
        this.volume = volume;
    }

    public SupabaseInstanceCreateRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区，≤2个逗号分隔，首个=顶层主AZ。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public SupabaseInstanceCreateRequest withHa(SupabaseHaConfig ha) {
        this.ha = ha;
        return this;
    }

    public SupabaseInstanceCreateRequest withHa(Consumer<SupabaseHaConfig> haSetter) {
        if (this.ha == null) {
            this.ha = new SupabaseHaConfig();
            haSetter.accept(this.ha);
        }

        return this;
    }

    /**
     * Get ha
     * @return ha
     */
    public SupabaseHaConfig getHa() {
        return ha;
    }

    public void setHa(SupabaseHaConfig ha) {
        this.ha = ha;
    }

    public SupabaseInstanceCreateRequest withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 参数模板ID（可选）。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public SupabaseInstanceCreateRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库端口，2100~9500，默认5432。
     * minimum: 2100
     * maximum: 9500
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public SupabaseInstanceCreateRequest withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public SupabaseInstanceCreateRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 数据库密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SupabaseInstanceCreateRequest withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    /**
     * 内网IP（可选）。
     * @return dataVip
     */
    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public SupabaseInstanceCreateRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SupabaseInstanceCreateRequest withTags(List<TagWithKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    public SupabaseInstanceCreateRequest addTagsItem(TagWithKeyValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SupabaseInstanceCreateRequest withTags(Consumer<List<TagWithKeyValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，最多20个。
     * @return tags
     */
    public List<TagWithKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TagWithKeyValue> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupabaseInstanceCreateRequest that = (SupabaseInstanceCreateRequest) obj;
        return Objects.equals(this.datastore, that.datastore) && Objects.equals(this.chargeInfo, that.chargeInfo)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.ha, that.ha)
            && Objects.equals(this.configurationId, that.configurationId) && Objects.equals(this.port, that.port)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.password, that.password) && Objects.equals(this.dataVip, that.dataVip)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastore,
            chargeInfo,
            flavorRef,
            volume,
            availabilityZone,
            ha,
            configurationId,
            port,
            securityGroupId,
            password,
            dataVip,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupabaseInstanceCreateRequest {\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
