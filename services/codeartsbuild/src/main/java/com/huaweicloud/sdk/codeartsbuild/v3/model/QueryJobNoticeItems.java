package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryJobNoticeItems
 */
public class QueryJobNoticeItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_type")

    private String noticeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_map")

    private Map<String, Boolean> enableMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_config")

    private String paramConfig;

    public QueryJobNoticeItems withNoticeType(String noticeType) {
        this.noticeType = noticeType;
        return this;
    }

    /**
     * 通知类型
     * @return noticeType
     */
    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public QueryJobNoticeItems withEnableMap(Map<String, Boolean> enableMap) {
        this.enableMap = enableMap;
        return this;
    }

    public QueryJobNoticeItems putEnableMapItem(String key, Boolean enableMapItem) {
        if (this.enableMap == null) {
            this.enableMap = new HashMap<>();
        }
        this.enableMap.put(key, enableMapItem);
        return this;
    }

    public QueryJobNoticeItems withEnableMap(Consumer<Map<String, Boolean>> enableMapSetter) {
        if (this.enableMap == null) {
            this.enableMap = new HashMap<>();
        }
        enableMapSetter.accept(this.enableMap);
        return this;
    }

    /**
     * 通知品种开启详情的表
     * @return enableMap
     */
    public Map<String, Boolean> getEnableMap() {
        return enableMap;
    }

    public void setEnableMap(Map<String, Boolean> enableMap) {
        this.enableMap = enableMap;
    }

    public QueryJobNoticeItems withParamConfig(String paramConfig) {
        this.paramConfig = paramConfig;
        return this;
    }

    /**
     * 参数配置
     * @return paramConfig
     */
    public String getParamConfig() {
        return paramConfig;
    }

    public void setParamConfig(String paramConfig) {
        this.paramConfig = paramConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryJobNoticeItems that = (QueryJobNoticeItems) obj;
        return Objects.equals(this.noticeType, that.noticeType) && Objects.equals(this.enableMap, that.enableMap)
            && Objects.equals(this.paramConfig, that.paramConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noticeType, enableMap, paramConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryJobNoticeItems {\n");
        sb.append("    noticeType: ").append(toIndentedString(noticeType)).append("\n");
        sb.append("    enableMap: ").append(toIndentedString(enableMap)).append("\n");
        sb.append("    paramConfig: ").append(toIndentedString(paramConfig)).append("\n");
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
