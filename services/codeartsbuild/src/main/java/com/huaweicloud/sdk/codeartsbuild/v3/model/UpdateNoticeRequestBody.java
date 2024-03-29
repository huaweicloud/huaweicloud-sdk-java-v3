package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新消息接口返回体
 */
public class UpdateNoticeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_type")

    private String noticeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_event_type_names")

    private List<String> enabledEventTypeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_config")

    private String paramConfig;

    public UpdateNoticeRequestBody withNoticeType(String noticeType) {
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

    public UpdateNoticeRequestBody withEnabledEventTypeNames(List<String> enabledEventTypeNames) {
        this.enabledEventTypeNames = enabledEventTypeNames;
        return this;
    }

    public UpdateNoticeRequestBody addEnabledEventTypeNamesItem(String enabledEventTypeNamesItem) {
        if (this.enabledEventTypeNames == null) {
            this.enabledEventTypeNames = new ArrayList<>();
        }
        this.enabledEventTypeNames.add(enabledEventTypeNamesItem);
        return this;
    }

    public UpdateNoticeRequestBody withEnabledEventTypeNames(Consumer<List<String>> enabledEventTypeNamesSetter) {
        if (this.enabledEventTypeNames == null) {
            this.enabledEventTypeNames = new ArrayList<>();
        }
        enabledEventTypeNamesSetter.accept(this.enabledEventTypeNames);
        return this;
    }

    /**
     * 开启的通知的种类
     * @return enabledEventTypeNames
     */
    public List<String> getEnabledEventTypeNames() {
        return enabledEventTypeNames;
    }

    public void setEnabledEventTypeNames(List<String> enabledEventTypeNames) {
        this.enabledEventTypeNames = enabledEventTypeNames;
    }

    public UpdateNoticeRequestBody withParamConfig(String paramConfig) {
        this.paramConfig = paramConfig;
        return this;
    }

    /**
     * 通知参数配置
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
        UpdateNoticeRequestBody that = (UpdateNoticeRequestBody) obj;
        return Objects.equals(this.noticeType, that.noticeType)
            && Objects.equals(this.enabledEventTypeNames, that.enabledEventTypeNames)
            && Objects.equals(this.paramConfig, that.paramConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noticeType, enabledEventTypeNames, paramConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNoticeRequestBody {\n");
        sb.append("    noticeType: ").append(toIndentedString(noticeType)).append("\n");
        sb.append("    enabledEventTypeNames: ").append(toIndentedString(enabledEventTypeNames)).append("\n");
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
