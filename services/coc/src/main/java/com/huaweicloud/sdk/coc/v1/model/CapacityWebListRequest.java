package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 应用容量数据请求体。 **约束限制：** 不涉及。 **取值范围：** 请求体内容按照properties下的参数说明传参。 **默认取值：** 不涉及。
 */
public class CapacityWebListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_obj")

    private List<CapacityWebListRequestProviderObj> providerObj = null;

    public CapacityWebListRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 用户选择当前分组对应的id值。 **约束限制：** 应用、组件和分组ID，有且仅有1个有值。 **取值范围：** 字符串，长度24个字符。 **默认取值：** 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CapacityWebListRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释：** 用户选择当前组件对应的id值。 **约束限制：** 应用、组件和分组ID，有且仅有1个有值。 **取值范围：** 字符串，长度24个字符。 **默认取值：** 不涉及。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public CapacityWebListRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释：** 用户选择当前应用对应的id值。 **约束限制：** 应用、组件和分组ID，有且仅有1个有值。 **取值范围：** 字符串，长度24个字符。 **默认取值：** 不涉及。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public CapacityWebListRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 用户登录租户对应的账号ID即租户id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CapacityWebListRequest withProviderObj(List<CapacityWebListRequestProviderObj> providerObj) {
        this.providerObj = providerObj;
        return this;
    }

    public CapacityWebListRequest addProviderObjItem(CapacityWebListRequestProviderObj providerObjItem) {
        if (this.providerObj == null) {
            this.providerObj = new ArrayList<>();
        }
        this.providerObj.add(providerObjItem);
        return this;
    }

    public CapacityWebListRequest withProviderObj(Consumer<List<CapacityWebListRequestProviderObj>> providerObjSetter) {
        if (this.providerObj == null) {
            this.providerObj = new ArrayList<>();
        }
        providerObjSetter.accept(this.providerObj);
        return this;
    }

    /**
     * **参数解释：** 资源对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return providerObj
     */
    public List<CapacityWebListRequestProviderObj> getProviderObj() {
        return providerObj;
    }

    public void setProviderObj(List<CapacityWebListRequestProviderObj> providerObj) {
        this.providerObj = providerObj;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapacityWebListRequest that = (CapacityWebListRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.providerObj, that.providerObj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, componentId, applicationId, domainId, providerObj);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapacityWebListRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    providerObj: ").append(toIndentedString(providerObj)).append("\n");
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
