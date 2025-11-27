package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FederationConfig
 */
public class FederationConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionsInfo")

    private List<FederationVersionInfo> versionsInfo = null;

    public FederationConfig withVersionsInfo(List<FederationVersionInfo> versionsInfo) {
        this.versionsInfo = versionsInfo;
        return this;
    }

    public FederationConfig addVersionsInfoItem(FederationVersionInfo versionsInfoItem) {
        if (this.versionsInfo == null) {
            this.versionsInfo = new ArrayList<>();
        }
        this.versionsInfo.add(versionsInfoItem);
        return this;
    }

    public FederationConfig withVersionsInfo(Consumer<List<FederationVersionInfo>> versionsInfoSetter) {
        if (this.versionsInfo == null) {
            this.versionsInfo = new ArrayList<>();
        }
        versionsInfoSetter.accept(this.versionsInfo);
        return this;
    }

    /**
     * 联邦版本信息列表
     * @return versionsInfo
     */
    public List<FederationVersionInfo> getVersionsInfo() {
        return versionsInfo;
    }

    public void setVersionsInfo(List<FederationVersionInfo> versionsInfo) {
        this.versionsInfo = versionsInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FederationConfig that = (FederationConfig) obj;
        return Objects.equals(this.versionsInfo, that.versionsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FederationConfig {\n");
        sb.append("    versionsInfo: ").append(toIndentedString(versionsInfo)).append("\n");
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
