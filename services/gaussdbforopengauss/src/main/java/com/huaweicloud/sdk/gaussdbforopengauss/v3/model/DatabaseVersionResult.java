package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DatabaseVersionResult
 */
public class DatabaseVersionResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "software_version")

    private String softwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfixes")

    private List<DbHotfixInfoResult> hotfixes = null;

    public DatabaseVersionResult withSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    /**
     * **参数解释**： 数据库三位引擎版本。 **取值范围**： 不涉及。
     * @return softwareVersion
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public DatabaseVersionResult withHotfixes(List<DbHotfixInfoResult> hotfixes) {
        this.hotfixes = hotfixes;
        return this;
    }

    public DatabaseVersionResult addHotfixesItem(DbHotfixInfoResult hotfixesItem) {
        if (this.hotfixes == null) {
            this.hotfixes = new ArrayList<>();
        }
        this.hotfixes.add(hotfixesItem);
        return this;
    }

    public DatabaseVersionResult withHotfixes(Consumer<List<DbHotfixInfoResult>> hotfixesSetter) {
        if (this.hotfixes == null) {
            this.hotfixes = new ArrayList<>();
        }
        hotfixesSetter.accept(this.hotfixes);
        return this;
    }

    /**
     * **参数解释**： 数据库三位引擎版本对应的热补丁信息。 **取值范围**： 不涉及。
     * @return hotfixes
     */
    public List<DbHotfixInfoResult> getHotfixes() {
        return hotfixes;
    }

    public void setHotfixes(List<DbHotfixInfoResult> hotfixes) {
        this.hotfixes = hotfixes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseVersionResult that = (DatabaseVersionResult) obj;
        return Objects.equals(this.softwareVersion, that.softwareVersion)
            && Objects.equals(this.hotfixes, that.hotfixes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(softwareVersion, hotfixes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseVersionResult {\n");
        sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
        sb.append("    hotfixes: ").append(toIndentedString(hotfixes)).append("\n");
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
