package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包含自定义应用业务扩展信息的对象
 */
public class AppExtendedInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extended_info")

    private Map<String, String> extendedInfo = null;

    public AppExtendedInfo withExtendedInfo(Map<String, String> extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    public AppExtendedInfo putExtendedInfoItem(String key, String extendedInfoItem) {
        if (this.extendedInfo == null) {
            this.extendedInfo = new HashMap<>();
        }
        this.extendedInfo.put(key, extendedInfoItem);
        return this;
    }

    public AppExtendedInfo withExtendedInfo(Consumer<Map<String, String>> extendedInfoSetter) {
        if (this.extendedInfo == null) {
            this.extendedInfo = new HashMap<>();
        }
        extendedInfoSetter.accept(this.extendedInfo);
        return this;
    }

    /**
     * 扩展信息的键值对映射
     * @return extendedInfo
     */
    public Map<String, String> getExtendedInfo() {
        return extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> extendedInfo) {
        this.extendedInfo = extendedInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppExtendedInfo that = (AppExtendedInfo) obj;
        return Objects.equals(this.extendedInfo, that.extendedInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extendedInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppExtendedInfo {\n");
        sb.append("    extendedInfo: ").append(toIndentedString(extendedInfo)).append("\n");
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
