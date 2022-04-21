package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DomainNameInfo
 */
public class DomainNameInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_public_resolve")

    private Boolean supportPublicResolve;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_latest_rules")

    private Boolean isLatestRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_domain_names")

    private List<DomainNameEntity> historyDomainNames = null;

    public DomainNameInfo withSupportPublicResolve(Boolean supportPublicResolve) {
        this.supportPublicResolve = supportPublicResolve;
        return this;
    }

    /**
     * 是否开启公网域名解析。 - true：开启 - false：未开启 
     * @return supportPublicResolve
     */
    public Boolean getSupportPublicResolve() {
        return supportPublicResolve;
    }

    public void setSupportPublicResolve(Boolean supportPublicResolve) {
        this.supportPublicResolve = supportPublicResolve;
    }

    public DomainNameInfo withIsLatestRules(Boolean isLatestRules) {
        this.isLatestRules = isLatestRules;
        return this;
    }

    /**
     * 当前域名是否已为最新。 - true：是 - false：否 
     * @return isLatestRules
     */
    public Boolean getIsLatestRules() {
        return isLatestRules;
    }

    public void setIsLatestRules(Boolean isLatestRules) {
        this.isLatestRules = isLatestRules;
    }

    public DomainNameInfo withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * 域名的区域后缀。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public DomainNameInfo withHistoryDomainNames(List<DomainNameEntity> historyDomainNames) {
        this.historyDomainNames = historyDomainNames;
        return this;
    }

    public DomainNameInfo addHistoryDomainNamesItem(DomainNameEntity historyDomainNamesItem) {
        if (this.historyDomainNames == null) {
            this.historyDomainNames = new ArrayList<>();
        }
        this.historyDomainNames.add(historyDomainNamesItem);
        return this;
    }

    public DomainNameInfo withHistoryDomainNames(Consumer<List<DomainNameEntity>> historyDomainNamesSetter) {
        if (this.historyDomainNames == null) {
            this.historyDomainNames = new ArrayList<>();
        }
        historyDomainNamesSetter.accept(this.historyDomainNames);
        return this;
    }

    /**
     * 历史域名信息。
     * @return historyDomainNames
     */
    public List<DomainNameEntity> getHistoryDomainNames() {
        return historyDomainNames;
    }

    public void setHistoryDomainNames(List<DomainNameEntity> historyDomainNames) {
        this.historyDomainNames = historyDomainNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainNameInfo domainNameInfo = (DomainNameInfo) o;
        return Objects.equals(this.supportPublicResolve, domainNameInfo.supportPublicResolve)
            && Objects.equals(this.isLatestRules, domainNameInfo.isLatestRules)
            && Objects.equals(this.zoneName, domainNameInfo.zoneName)
            && Objects.equals(this.historyDomainNames, domainNameInfo.historyDomainNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportPublicResolve, isLatestRules, zoneName, historyDomainNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainNameInfo {\n");
        sb.append("    supportPublicResolve: ").append(toIndentedString(supportPublicResolve)).append("\n");
        sb.append("    isLatestRules: ").append(toIndentedString(isLatestRules)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    historyDomainNames: ").append(toIndentedString(historyDomainNames)).append("\n");
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
