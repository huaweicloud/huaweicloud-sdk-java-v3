package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 报告详情
 */
public class HmVulnInfoDataDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_info")

    private List<HmVulnInfoDataDetailVulnInfo> vulnInfo = null;

    public HmVulnInfoDataDetail withVulnInfo(List<HmVulnInfoDataDetailVulnInfo> vulnInfo) {
        this.vulnInfo = vulnInfo;
        return this;
    }

    public HmVulnInfoDataDetail addVulnInfoItem(HmVulnInfoDataDetailVulnInfo vulnInfoItem) {
        if (this.vulnInfo == null) {
            this.vulnInfo = new ArrayList<>();
        }
        this.vulnInfo.add(vulnInfoItem);
        return this;
    }

    public HmVulnInfoDataDetail withVulnInfo(Consumer<List<HmVulnInfoDataDetailVulnInfo>> vulnInfoSetter) {
        if (this.vulnInfo == null) {
            this.vulnInfo = new ArrayList<>();
        }
        vulnInfoSetter.accept(this.vulnInfo);
        return this;
    }

    /**
     * 问题
     * @return vulnInfo
     */
    public List<HmVulnInfoDataDetailVulnInfo> getVulnInfo() {
        return vulnInfo;
    }

    public void setVulnInfo(List<HmVulnInfoDataDetailVulnInfo> vulnInfo) {
        this.vulnInfo = vulnInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HmVulnInfoDataDetail that = (HmVulnInfoDataDetail) obj;
        return Objects.equals(this.vulnInfo, that.vulnInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulnInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HmVulnInfoDataDetail {\n");
        sb.append("    vulnInfo: ").append(toIndentedString(vulnInfo)).append("\n");
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
