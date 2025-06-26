package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 规格版本信息。 **取值范围**： 不涉及。
 */
public class ProductVersionResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cn")

    private Integer minCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cn")

    private Integer maxCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_type")

    private String versionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    public ProductVersionResp withMinCn(Integer minCn) {
        this.minCn = minCn;
        return this;
    }

    /**
     * **参数解释**： 产品规格在该版本支持的最小CN数量。 **取值范围**： 不涉及。
     * @return minCn
     */
    public Integer getMinCn() {
        return minCn;
    }

    public void setMinCn(Integer minCn) {
        this.minCn = minCn;
    }

    public ProductVersionResp withMaxCn(Integer maxCn) {
        this.maxCn = maxCn;
        return this;
    }

    /**
     * **参数解释**： 产品规格在该版本支持的最大CN数量。 **取值范围**： 不涉及。
     * @return maxCn
     */
    public Integer getMaxCn() {
        return maxCn;
    }

    public void setMaxCn(Integer maxCn) {
        this.maxCn = maxCn;
    }

    public ProductVersionResp withVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * **参数解释**： 产品规格该版本支持的类型。 **取值范围**： 1：稳定版； 0：最新版本。
     * @return versionType
     */
    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public ProductVersionResp withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * **参数解释**： 产品规格版本号名称。 **取值范围**： 不涉及。
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductVersionResp that = (ProductVersionResp) obj;
        return Objects.equals(this.minCn, that.minCn) && Objects.equals(this.maxCn, that.maxCn)
            && Objects.equals(this.versionType, that.versionType)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minCn, maxCn, versionType, datastoreVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductVersionResp {\n");
        sb.append("    minCn: ").append(toIndentedString(minCn)).append("\n");
        sb.append("    maxCn: ").append(toIndentedString(maxCn)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
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
