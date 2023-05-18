package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CacheRules
 */
public class CacheRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_value")

    private String matchValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_unit")

    private String ttlUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "follow_origin")

    private String followOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_parameter_type")

    private String urlParameterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_parameter_value")

    private String urlParameterValue;

    public CacheRules withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配所有文件 all， 按文件后缀匹配 file_extension， 按目录匹配 catalog， 全路径匹配 full_path， 按首页匹配 home_page。
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public CacheRules withMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }

    /**
     * 缓存匹配设置。 当match_type为all时，为空。当match_type为file_extension时，为文件后缀，输入首字符为“.”，以“,”进行分隔， 如.jpg,.zip,.exe，并且输入的文 件名后缀总数不超过20个。 当match_type为catalog时，为目录，输入要求以“/”作为首字符， 以“,”进行分隔，如/test/folder01,/test/folder02，并且输入的目录路径总数不超过20个。  当match_type为full_path时，为全路径，输入要求以“/”作为首字符，支持匹配指定目录下的具体文件，或者带通配符“*”的文件， 如/test/index.html或/test/_*.jpg。 当match_type为home_page时，为空。
     * @return matchValue
     */
    public String getMatchValue() {
        return matchValue;
    }

    public void setMatchValue(String matchValue) {
        this.matchValue = matchValue;
    }

    public CacheRules withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 缓存时间。最大支持365天。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public CacheRules withTtlUnit(String ttlUnit) {
        this.ttlUnit = ttlUnit;
        return this;
    }

    /**
     * 缓存过期时间单位。s：秒；m：分；h：小时；d：天
     * @return ttlUnit
     */
    public String getTtlUnit() {
        return ttlUnit;
    }

    public void setTtlUnit(String ttlUnit) {
        this.ttlUnit = ttlUnit;
    }

    public CacheRules withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 此条配置的优先级, 默认值1，数值越大，优先级越高。取值范围为1-100，优先级不能相同
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CacheRules withFollowOrigin(String followOrigin) {
        this.followOrigin = followOrigin;
        return this;
    }

    /**
     * 缓存遵循源站开关（on：打开，off：关闭）
     * @return followOrigin
     */
    public String getFollowOrigin() {
        return followOrigin;
    }

    public void setFollowOrigin(String followOrigin) {
        this.followOrigin = followOrigin;
    }

    public CacheRules withUrlParameterType(String urlParameterType) {
        this.urlParameterType = urlParameterType;
        return this;
    }

    /**
     * 忽略指定URL参数： del_params， 保留指定URL参数： reserve_params， 忽略全部URL参数： ignore_url_params， 使用完整URL参数： full_url。
     * @return urlParameterType
     */
    public String getUrlParameterType() {
        return urlParameterType;
    }

    public void setUrlParameterType(String urlParameterType) {
        this.urlParameterType = urlParameterType;
    }

    public CacheRules withUrlParameterValue(String urlParameterValue) {
        this.urlParameterValue = urlParameterValue;
        return this;
    }

    /**
     * 最多设置10条，以\",\"分隔
     * @return urlParameterValue
     */
    public String getUrlParameterValue() {
        return urlParameterValue;
    }

    public void setUrlParameterValue(String urlParameterValue) {
        this.urlParameterValue = urlParameterValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CacheRules cacheRules = (CacheRules) o;
        return Objects.equals(this.matchType, cacheRules.matchType)
            && Objects.equals(this.matchValue, cacheRules.matchValue) && Objects.equals(this.ttl, cacheRules.ttl)
            && Objects.equals(this.ttlUnit, cacheRules.ttlUnit) && Objects.equals(this.priority, cacheRules.priority)
            && Objects.equals(this.followOrigin, cacheRules.followOrigin)
            && Objects.equals(this.urlParameterType, cacheRules.urlParameterType)
            && Objects.equals(this.urlParameterValue, cacheRules.urlParameterValue);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(matchType, matchValue, ttl, ttlUnit, priority, followOrigin, urlParameterType, urlParameterValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CacheRules {\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    ttlUnit: ").append(toIndentedString(ttlUnit)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    followOrigin: ").append(toIndentedString(followOrigin)).append("\n");
        sb.append("    urlParameterType: ").append(toIndentedString(urlParameterType)).append("\n");
        sb.append("    urlParameterValue: ").append(toIndentedString(urlParameterValue)).append("\n");
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
