package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 静默规则
 */
public class MuteRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match")

    private List<List<Match>> match = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mute_config")

    private MuteConfig muteConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public MuteRule withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public MuteRule withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 规则描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public MuteRule withMatch(List<List<Match>> match) {
        this.match = match;
        return this;
    }

    public MuteRule addMatchItem(List<Match> matchItem) {
        if (this.match == null) {
            this.match = new ArrayList<>();
        }
        this.match.add(matchItem);
        return this;
    }

    public MuteRule withMatch(Consumer<List<List<Match>>> matchSetter) {
        if (this.match == null) {
            this.match = new ArrayList<>();
        }
        matchSetter.accept(this.match);
        return this;
    }

    /**
     * 规则的匹配条件
     * @return match
     */
    public List<List<Match>> getMatch() {
        return match;
    }

    public void setMatch(List<List<Match>> match) {
        this.match = match;
    }

    public MuteRule withMuteConfig(MuteConfig muteConfig) {
        this.muteConfig = muteConfig;
        return this;
    }

    public MuteRule withMuteConfig(Consumer<MuteConfig> muteConfigSetter) {
        if (this.muteConfig == null) {
            this.muteConfig = new MuteConfig();
            muteConfigSetter.accept(this.muteConfig);
        }

        return this;
    }

    /**
     * Get muteConfig
     * @return muteConfig
     */
    public MuteConfig getMuteConfig() {
        return muteConfig;
    }

    public void setMuteConfig(MuteConfig muteConfig) {
        this.muteConfig = muteConfig;
    }

    public MuteRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MuteRule withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 时区
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public MuteRule withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public MuteRule withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MuteRule that = (MuteRule) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.match, that.match) && Objects.equals(this.muteConfig, that.muteConfig)
            && Objects.equals(this.name, that.name) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, desc, match, muteConfig, name, timezone, updateTime, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MuteRule {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    muteConfig: ").append(toIndentedString(muteConfig)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
