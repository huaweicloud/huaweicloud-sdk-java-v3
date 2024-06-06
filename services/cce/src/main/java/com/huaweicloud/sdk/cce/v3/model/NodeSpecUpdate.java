package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeSpecUpdate
 */
public class NodeSpecUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taints")

    private List<Taint> taints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "k8sTags")

    private Map<String, String> k8sTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userTags")

    private List<UserTag> userTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initializedConditions")

    private List<String> initializedConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Login login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverEnterpriseProjectID")

    private String serverEnterpriseProjectID;

    public NodeSpecUpdate withTaints(List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public NodeSpecUpdate addTaintsItem(Taint taintsItem) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        this.taints.add(taintsItem);
        return this;
    }

    public NodeSpecUpdate withTaints(Consumer<List<Taint>> taintsSetter) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        taintsSetter.accept(this.taints);
        return this;
    }

    /**
     * 支持给创建出来的节点加Taints来设置反亲和性，taints配置不超过20条。默认值为空。每条Taints包含以下3个参数：  - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀。 - Value：必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。 - Effect：只可选NoSchedule，PreferNoSchedule或NoExecute。  示例：  ``` \"taints\": [{   \"key\": \"status\",   \"value\": \"unavailable\",   \"effect\": \"NoSchedule\" }, {   \"key\": \"looks\",   \"value\": \"bad\",   \"effect\": \"NoSchedule\" }] ``` > 参数未指定或者为空数组时将删除节点池的自定义Taints 
     * @return taints
     */
    public List<Taint> getTaints() {
        return taints;
    }

    public void setTaints(List<Taint> taints) {
        this.taints = taints;
    }

    public NodeSpecUpdate withK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
        return this;
    }

    public NodeSpecUpdate putK8sTagsItem(String key, String k8sTagsItem) {
        if (this.k8sTags == null) {
            this.k8sTags = new HashMap<>();
        }
        this.k8sTags.put(key, k8sTagsItem);
        return this;
    }

    public NodeSpecUpdate withK8sTags(Consumer<Map<String, String>> k8sTagsSetter) {
        if (this.k8sTags == null) {
            this.k8sTags = new HashMap<>();
        }
        k8sTagsSetter.accept(this.k8sTags);
        return this;
    }

    /**
     * 格式为key/value键值对。键值对个数不超过20条。默认值为空。 - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀，例如example.com/my-key，DNS子域最长253个字符。 - Value：可以为空或者非空字符串，非空字符串必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。  示例： ``` \"k8sTags\": {   \"key\": \"value\" } ``` > 参数未指定或者为空对象时将删除节点池的自定义K8s标签 
     * @return k8sTags
     */
    public Map<String, String> getK8sTags() {
        return k8sTags;
    }

    public void setK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
    }

    public NodeSpecUpdate withUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
        return this;
    }

    public NodeSpecUpdate addUserTagsItem(UserTag userTagsItem) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTagsItem);
        return this;
    }

    public NodeSpecUpdate withUserTags(Consumer<List<UserTag>> userTagsSetter) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        userTagsSetter.accept(this.userTags);
        return this;
    }

    /**
     * 云服务器标签，键必须唯一，CCE支持的最大用户自定义标签数量依region而定，自定义标签数上限为8个。默认值为空。 > 参数未指定或者为空数组时将删除节点池的自定义云服务器标签 
     * @return userTags
     */
    public List<UserTag> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
    }

    public NodeSpecUpdate withInitializedConditions(List<String> initializedConditions) {
        this.initializedConditions = initializedConditions;
        return this;
    }

    public NodeSpecUpdate addInitializedConditionsItem(String initializedConditionsItem) {
        if (this.initializedConditions == null) {
            this.initializedConditions = new ArrayList<>();
        }
        this.initializedConditions.add(initializedConditionsItem);
        return this;
    }

    public NodeSpecUpdate withInitializedConditions(Consumer<List<String>> initializedConditionsSetter) {
        if (this.initializedConditions == null) {
            this.initializedConditions = new ArrayList<>();
        }
        initializedConditionsSetter.accept(this.initializedConditions);
        return this;
    }

    /**
     * 自定义初始化标记。  CCE节点在初始化完成之前，会打上初始化未完成污点（node.cloudprovider.kubernetes.io/uninitialized）防止pod调度到节点上。  cce支持自定义初始化标记，在接收到initializedConditions参数后，会将参数值转换成节点标签，随节点下发，例如：cloudprovider.openvessel.io/inject-initialized-conditions=CCEInitial_CustomedInitial。  当节点上设置了此标签，会轮询节点的status.Conditions，查看conditions的type是否存在标记名，如CCEInitial、CustomedInitial标记，如果存在所有传入的标记，且状态为True，认为节点初始化完成，则移除初始化污点。  默认值为空。  - 必须以字母、数字组成，长度范围1-20位。 - 标记数量不超过2个 
     * @return initializedConditions
     */
    public List<String> getInitializedConditions() {
        return initializedConditions;
    }

    public void setInitializedConditions(List<String> initializedConditions) {
        this.initializedConditions = initializedConditions;
    }

    public NodeSpecUpdate withLogin(Login login) {
        this.login = login;
        return this;
    }

    public NodeSpecUpdate withLogin(Consumer<Login> loginSetter) {
        if (this.login == null) {
            this.login = new Login();
            loginSetter.accept(this.login);
        }

        return this;
    }

    /**
     * Get login
     * @return login
     */
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public NodeSpecUpdate withServerEnterpriseProjectID(String serverEnterpriseProjectID) {
        this.serverEnterpriseProjectID = serverEnterpriseProjectID;
        return this;
    }

    /**
     * 服务器企业项目ID。CCE服务不实现EPS相关特性，该字段仅用于同步服务器企业项目ID。 创建节点/节点池场景：可指定已存在企业项目，当取值为空时，该字段继承集群企业项目属性。 更新节点池场景：配置修改后仅会对新增节点的服务器生效，存量节点需前往EPS界面迁移。 如果更新时不指定值，不会更新该字段。 当该字段为空时，返回集群企业项目。
     * @return serverEnterpriseProjectID
     */
    public String getServerEnterpriseProjectID() {
        return serverEnterpriseProjectID;
    }

    public void setServerEnterpriseProjectID(String serverEnterpriseProjectID) {
        this.serverEnterpriseProjectID = serverEnterpriseProjectID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSpecUpdate that = (NodeSpecUpdate) obj;
        return Objects.equals(this.taints, that.taints) && Objects.equals(this.k8sTags, that.k8sTags)
            && Objects.equals(this.userTags, that.userTags)
            && Objects.equals(this.initializedConditions, that.initializedConditions)
            && Objects.equals(this.login, that.login)
            && Objects.equals(this.serverEnterpriseProjectID, that.serverEnterpriseProjectID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taints, k8sTags, userTags, initializedConditions, login, serverEnterpriseProjectID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSpecUpdate {\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    k8sTags: ").append(toIndentedString(k8sTags)).append("\n");
        sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
        sb.append("    initializedConditions: ").append(toIndentedString(initializedConditions)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    serverEnterpriseProjectID: ").append(toIndentedString(serverEnterpriseProjectID)).append("\n");
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
