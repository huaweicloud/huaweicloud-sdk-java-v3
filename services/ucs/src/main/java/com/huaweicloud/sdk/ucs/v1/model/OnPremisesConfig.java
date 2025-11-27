package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OnPremisesConfig
 */
public class OnPremisesConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionsInfo")

    private List<OnPremisesVersionInfo> versionsInfo = null;

    public OnPremisesConfig withVersionsInfo(List<OnPremisesVersionInfo> versionsInfo) {
        this.versionsInfo = versionsInfo;
        return this;
    }

    public OnPremisesConfig addVersionsInfoItem(OnPremisesVersionInfo versionsInfoItem) {
        if (this.versionsInfo == null) {
            this.versionsInfo = new ArrayList<>();
        }
        this.versionsInfo.add(versionsInfoItem);
        return this;
    }

    public OnPremisesConfig withVersionsInfo(Consumer<List<OnPremisesVersionInfo>> versionsInfoSetter) {
        if (this.versionsInfo == null) {
            this.versionsInfo = new ArrayList<>();
        }
        versionsInfoSetter.accept(this.versionsInfo);
        return this;
    }

    /**
     * 本地集群版本信息列表
     * @return versionsInfo
     */
    public List<OnPremisesVersionInfo> getVersionsInfo() {
        return versionsInfo;
    }

    public void setVersionsInfo(List<OnPremisesVersionInfo> versionsInfo) {
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
        OnPremisesConfig that = (OnPremisesConfig) obj;
        return Objects.equals(this.versionsInfo, that.versionsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OnPremisesConfig {\n");
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
