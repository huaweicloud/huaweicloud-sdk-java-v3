package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改配置信息请求体
 */
public class ModifyProjectConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_info_list")

    private List<ProjectConfigInfo> configInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade")

    private Boolean cascade;

    public ModifyProjectConfigRequestBody withConfigInfoList(List<ProjectConfigInfo> configInfoList) {
        this.configInfoList = configInfoList;
        return this;
    }

    public ModifyProjectConfigRequestBody addConfigInfoListItem(ProjectConfigInfo configInfoListItem) {
        if (this.configInfoList == null) {
            this.configInfoList = new ArrayList<>();
        }
        this.configInfoList.add(configInfoListItem);
        return this;
    }

    public ModifyProjectConfigRequestBody withConfigInfoList(Consumer<List<ProjectConfigInfo>> configInfoListSetter) {
        if (this.configInfoList == null) {
            this.configInfoList = new ArrayList<>();
        }
        configInfoListSetter.accept(this.configInfoList);
        return this;
    }

    /**
     * 配置信息列表
     * @return configInfoList
     */
    public List<ProjectConfigInfo> getConfigInfoList() {
        return configInfoList;
    }

    public void setConfigInfoList(List<ProjectConfigInfo> configInfoList) {
        this.configInfoList = configInfoList;
    }

    public ModifyProjectConfigRequestBody withCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }

    /**
     * 是否级联修改。若配置为true且enterprise_project_id=all_granted_eps时，对所有企业项目进行修改；配置为false且enterprise_project_id=all_granted_eps时，仅对all_granted_eps修改；其他场景该字段不生效。
     * @return cascade
     */
    public Boolean getCascade() {
        return cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyProjectConfigRequestBody that = (ModifyProjectConfigRequestBody) obj;
        return Objects.equals(this.configInfoList, that.configInfoList) && Objects.equals(this.cascade, that.cascade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configInfoList, cascade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyProjectConfigRequestBody {\n");
        sb.append("    configInfoList: ").append(toIndentedString(configInfoList)).append("\n");
        sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
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
