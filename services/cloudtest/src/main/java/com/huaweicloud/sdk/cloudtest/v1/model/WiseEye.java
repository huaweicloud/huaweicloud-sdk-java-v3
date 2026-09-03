package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WiseEye
 */
public class WiseEye {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_key")

    private String regionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_id")

    private String scopeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_name")

    private String scopeName;

    public WiseEye withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启云眼告警配置
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public WiseEye withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 云眼告警级别
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public WiseEye withRegionKey(String regionKey) {
        this.regionKey = regionKey;
        return this;
    }

    /**
     * 云眼告警区域，目前取值有：china（中国区），asiaAfricaLatin（亚非拉），europe（欧洲）
     * @return regionKey
     */
    public String getRegionKey() {
        return regionKey;
    }

    public void setRegionKey(String regionKey) {
        this.regionKey = regionKey;
    }

    public WiseEye withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    /**
     * 云眼告警id，对应云眼信息中的name
     * @return scopeId
     */
    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public WiseEye withScopeName(String scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    /**
     * 云眼告警范围，对应云眼信息中的label
     * @return scopeName
     */
    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WiseEye that = (WiseEye) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.level, that.level)
            && Objects.equals(this.regionKey, that.regionKey) && Objects.equals(this.scopeId, that.scopeId)
            && Objects.equals(this.scopeName, that.scopeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, level, regionKey, scopeId, scopeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WiseEye {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    regionKey: ").append(toIndentedString(regionKey)).append("\n");
        sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
        sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
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
