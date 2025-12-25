package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 知识型Agent执行请求体
 */
public class AgentRunReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private Map<String, Object> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_profile")

    private UserProfile userProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_switch_dict")

    private Map<String, Boolean> toolSwitchDict = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_deployment_id")

    private String modelDeploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_history")

    private Boolean enableHistory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histories")

    private List<Message> histories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<String> files = null;

    public AgentRunReq withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 请求问题
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public AgentRunReq withInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
        return this;
    }

    public AgentRunReq putInputsItem(String key, Object inputsItem) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        this.inputs.put(key, inputsItem);
        return this;
    }

    public AgentRunReq withInputs(Consumer<Map<String, Object>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * Get inputs
     * @return inputs
     */
    public Map<String, Object> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    public AgentRunReq withUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }

    public AgentRunReq withUserProfile(Consumer<UserProfile> userProfileSetter) {
        if (this.userProfile == null) {
            this.userProfile = new UserProfile();
            userProfileSetter.accept(this.userProfile);
        }

        return this;
    }

    /**
     * Get userProfile
     * @return userProfile
     */
    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public AgentRunReq withToolSwitchDict(Map<String, Boolean> toolSwitchDict) {
        this.toolSwitchDict = toolSwitchDict;
        return this;
    }

    public AgentRunReq putToolSwitchDictItem(String key, Boolean toolSwitchDictItem) {
        if (this.toolSwitchDict == null) {
            this.toolSwitchDict = new HashMap<>();
        }
        this.toolSwitchDict.put(key, toolSwitchDictItem);
        return this;
    }

    public AgentRunReq withToolSwitchDict(Consumer<Map<String, Boolean>> toolSwitchDictSetter) {
        if (this.toolSwitchDict == null) {
            this.toolSwitchDict = new HashMap<>();
        }
        toolSwitchDictSetter.accept(this.toolSwitchDict);
        return this;
    }

    /**
     * 插件是否开启
     * @return toolSwitchDict
     */
    public Map<String, Boolean> getToolSwitchDict() {
        return toolSwitchDict;
    }

    public void setToolSwitchDict(Map<String, Boolean> toolSwitchDict) {
        this.toolSwitchDict = toolSwitchDict;
    }

    public AgentRunReq withModelDeploymentId(String modelDeploymentId) {
        this.modelDeploymentId = modelDeploymentId;
        return this;
    }

    /**
     * 模型ID
     * @return modelDeploymentId
     */
    public String getModelDeploymentId() {
        return modelDeploymentId;
    }

    public void setModelDeploymentId(String modelDeploymentId) {
        this.modelDeploymentId = modelDeploymentId;
    }

    public AgentRunReq withEnableHistory(Boolean enableHistory) {
        this.enableHistory = enableHistory;
        return this;
    }

    /**
     * 是否记录会话历史
     * @return enableHistory
     */
    public Boolean getEnableHistory() {
        return enableHistory;
    }

    public void setEnableHistory(Boolean enableHistory) {
        this.enableHistory = enableHistory;
    }

    public AgentRunReq withHistories(List<Message> histories) {
        this.histories = histories;
        return this;
    }

    public AgentRunReq addHistoriesItem(Message historiesItem) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public AgentRunReq withHistories(Consumer<List<Message>> historiesSetter) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * 传入的会话历史
     * @return histories
     */
    public List<Message> getHistories() {
        return histories;
    }

    public void setHistories(List<Message> histories) {
        this.histories = histories;
    }

    public AgentRunReq withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    public AgentRunReq addFilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public AgentRunReq withFiles(Consumer<List<String>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 上传文件列表
     * @return files
     */
    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentRunReq that = (AgentRunReq) obj;
        return Objects.equals(this.query, that.query) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.userProfile, that.userProfile)
            && Objects.equals(this.toolSwitchDict, that.toolSwitchDict)
            && Objects.equals(this.modelDeploymentId, that.modelDeploymentId)
            && Objects.equals(this.enableHistory, that.enableHistory) && Objects.equals(this.histories, that.histories)
            && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(query, inputs, userProfile, toolSwitchDict, modelDeploymentId, enableHistory, histories, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentRunReq {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
        sb.append("    toolSwitchDict: ").append(toIndentedString(toolSwitchDict)).append("\n");
        sb.append("    modelDeploymentId: ").append(toIndentedString(modelDeploymentId)).append("\n");
        sb.append("    enableHistory: ").append(toIndentedString(enableHistory)).append("\n");
        sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
