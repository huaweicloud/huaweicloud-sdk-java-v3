package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAiGuardPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_ai_apps")

    private List<AiAppBasicInfo> bindAiApps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public CreateAiGuardPolicyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略 ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAiGuardPolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAiGuardPolicyResponse withBindAiApps(List<AiAppBasicInfo> bindAiApps) {
        this.bindAiApps = bindAiApps;
        return this;
    }

    public CreateAiGuardPolicyResponse addBindAiAppsItem(AiAppBasicInfo bindAiAppsItem) {
        if (this.bindAiApps == null) {
            this.bindAiApps = new ArrayList<>();
        }
        this.bindAiApps.add(bindAiAppsItem);
        return this;
    }

    public CreateAiGuardPolicyResponse withBindAiApps(Consumer<List<AiAppBasicInfo>> bindAiAppsSetter) {
        if (this.bindAiApps == null) {
            this.bindAiApps = new ArrayList<>();
        }
        bindAiAppsSetter.accept(this.bindAiApps);
        return this;
    }

    /**
     * 绑定的 AI 应用列表
     * @return bindAiApps
     */
    public List<AiAppBasicInfo> getBindAiApps() {
        return bindAiApps;
    }

    public void setBindAiApps(List<AiAppBasicInfo> bindAiApps) {
        this.bindAiApps = bindAiApps;
    }

    public CreateAiGuardPolicyResponse withCreateTime(Long createTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAiGuardPolicyResponse that = (CreateAiGuardPolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.bindAiApps, that.bindAiApps) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, bindAiApps, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAiGuardPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    bindAiApps: ").append(toIndentedString(bindAiApps)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
